package com.h3c.mds.task.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.flowable.engine.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.consts.ErpConst;
import com.h3c.mds.entity.TaskMsgEntity;
import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ErpProductCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.service.ProductCodeProcessService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.flowable.util.FlowableUtil;
import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.service.inv.ErpInvService;
import com.h3c.mds.service.master.ErpService;
import com.h3c.mds.task.config.UpdateTaskStatusQuartzJobBean;
import com.h3c.mds.utils.CommonsThreadCache;

@Service
public class UpdateTaskStatusServiceImpl {

	private static final Logger  log = LoggerFactory.getLogger(UpdateTaskStatusServiceImpl.class);
	@Autowired
	private IbdsTaskService ibdsTaskService;
	@Autowired
	private TaskService actTaskService;
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	@Autowired
	private ErpProductCodeService erpProductCodeService;
	//erp  inv  模块
	@Autowired
	private ErpInvService erpInvService;
	//erp  coa  模块
	@Autowired
	private ErpService erpService;
	@Autowired
	private ProjectCodeService projectCodeService;
	@Autowired
	private PartCodeProcessService partCodeProcessService;
	
	@Transactional
	public void handlerProjectCoa(IbdsTask task){

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("erp", FlowableConst.DISAGREE);
		//同步项目编码到erp   coa模块
		List<TaskMsgEntity> erpProjectTaskList = erpService.getCoaTaskMsgEntityByApplyNo(task.getErpApplyNo());
		if(CollectionUtils.isNotEmpty(erpProjectTaskList)){
			for(int j = 0; j < erpProjectTaskList.size(); j++){
				if(ErpConst.ERP_COA_FAIL.equalsIgnoreCase(erpProjectTaskList.get(j).getStatus())){
					//erp处理异常
					task.setFinalStatus(FlowableConst.TASK_STATUS_PROJECTCODE_TO_ERP_COA_FAIL);
					ibdsTaskService.updateTask(task);
					// TODO 这里需要发送邮件给相关责任人
					ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByApplyNo(task.getTaskId());
					
					projectCodeProcessExt.setCurStatus("ERP处理项目编码COA模块失败，");
					projectCodeProcessExt.setCurDeal(projectCodeProcessExt.getProjectOffice());
					projectCodeService.updateProjectCodeProcess(projectCodeProcessExt);
					CommonsThreadCache.setCurrentOperateType("system");
					projectCodeService.sendSyncEipMsg(projectCodeProcessExt, FlowableConst.DISAGREE);
					projectCodeService.sendSyncDataEmail(null, projectCodeProcessExt, "项目编码写入ERP COA失败", "项目编码写入ERP COA失败", null);
					actTaskService.complete(task.getActTaskId(), param);
				}else if(ErpConst.ERP_COA_NEW.equalsIgnoreCase(erpProjectTaskList.get(j).getStatus())){
					//不做处理，说明erp还没处理完
				}else if(ErpConst.ERP_COA_SUCESS.equalsIgnoreCase(erpProjectTaskList.get(j).getStatus())){
					//修改task状态
					task.setFinalStatus(FlowableConst.TASK_STATUS_PROJECTCODE_TO_ERP_COA_SUCESS);
					ibdsTaskService.updateTask(task);
					//下发 命令向财务参考信息和研发基本信息同步数据的任务
					task.setFinalStatus(null);
					task.setCreateTime(new Date());
					task.setId(null);
					task.setStatus(null);
					task.setType(FlowableConst.TASK_TYPE_PROJECTCODE_FINANCE_AND_PRODUCT);
					task.setErpApplyNo("");
					ibdsTaskService.addTask(task);
				}
			}
		}
		
	
	}
	
	@Transactional
	public void handlerProductCoa(IbdsTask task){
		
		//修改流程走下面逻辑
		if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(task.getVal().split("~")[1])){
			boolean isChange = erpProductCodeService.isProductCodeChange(task.getTaskId());
			//产品编码没有同步自己的数据到erp  coa模块  
			//只有编辑流程有这种情况
			if(!isChange){
				task.setFinalStatus(FlowableConst.TASK_STATUS_PRODUCTCODE_TO_ERP_COA_SUCESS);
				ibdsTaskService.updateTask(task);
				sendToProductInvCommand(task, ibdsTaskService);
				return;
			}			
		}
		List<TaskMsgEntity> erpProductTaskList = erpService.getCoaTaskMsgEntityByApplyNo(task.getErpApplyNo());

		ProductCodeProcess productCodeProcess = productCodeProcessService.getProductCodeProcessByApplyCode(task.getTaskId());
		
		if(CollectionUtils.isNotEmpty(erpProductTaskList)){
			for(int j = 0; j < erpProductTaskList.size(); j++){
				if(ErpConst.ERP_COA_FAIL.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())){
					task.setFinalStatus(FlowableConst.TASK_STATUS_PRODUCTCODE_TO_ERP_COA_FAIL);
					ibdsTaskService.updateTask(task);
					// TODO 这里需要发送邮件给相关责任人   需要修改当前产品编码流程状态
					try {
						Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamDisagree();
						productCodeProcessService.check(productCodeProcess.getId(), task.getActTaskId(), param);
						productCodeProcessService.sendSyncDataEmail(null, productCodeProcess, "产品编码写入ERP COA失败", "产品编码写入ERP COA失败", task.getActTaskId());
					} catch (Exception e) {
						e.printStackTrace();
						log.error("--调用产品编码接口失败");
						task.setCause(e.getMessage());
					}
					
				}else if(ErpConst.ERP_COA_NEW.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())){
//					continue;
				}else if(ErpConst.ERP_COA_SUCESS.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())){
					
					//修改task状态
					task.setFinalStatus(FlowableConst.TASK_STATUS_PRODUCTCODE_TO_ERP_COA_SUCESS);
					ibdsTaskService.updateTask(task);
					
					//下发 命令向 erp inv  库存模块的任务
					sendToProductInvCommand(task, ibdsTaskService);
				}
			}
		}
	}
	
	
	public void sendToProductInvCommand(IbdsTask task, IbdsTaskService ibdsTaskService){
		task.setFinalStatus(FlowableConst.TASK_STATUS_PRODUCTCODE_TO_ERP_COA_SUCESS);
		ibdsTaskService.updateTask(task);
		
		//下发 命令向 erp inv  库存模块的任务
		task.setId(null);
		task.setCreateTime(new Date());
		task.setFinalStatus(null);
		task.setStatus(null);
		task.setType(FlowableConst.TASK_TYPE_PRODUCTCODE_INV);
		ibdsTaskService.addTask(task);
	}
	
	@Transactional
	public void handlerProductInv(IbdsTask task){

		//新增和修改都有可能不走库存模块
		boolean isChange = erpProductCodeService.isSyncProductCodeToErpInv(task.getTaskId());
		if(!isChange){
			//没有数据需要同步的inv库存模块
			sendCommandToProductCodeFina(ibdsTaskService, task);
			return;
		}
		
		List<TaskMsgEntity> erpProductTaskList = erpInvService.getProductCodeTaskMsgByApplyNo(task.getErpApplyNo());
		List<TaskMsgEntity> erpProductAndBomTaskList =  erpInvService.getProductCodeBomTaskMsgByApplyNo(task.getErpApplyNo());
		if(CollectionUtils.isNotEmpty(erpProductAndBomTaskList)){
			erpProductTaskList.addAll(erpProductAndBomTaskList);
		}
		boolean syncSuccess = true;
		if(CollectionUtils.isNotEmpty(erpProductTaskList)){
			ProductCodeProcess productCodeProcess = productCodeProcessService.getProductCodeProcessByApplyCode(task.getTaskId());
			
			for(int j = 0; j < erpProductTaskList.size(); j++){

				//判断1产品编码   2产品编码和bom  
				
				if(ErpConst.ERP_INV_PRODUCTCODE_FAIL.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())
						|| ErpConst.ERP_INV_PRODUCTCODEANDBOM_FAIL.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())){
					task.setFinalStatus(FlowableConst.TASK_STATUS_PRODUCTCODE_TO_ERP_INV_FAIL);
					ibdsTaskService.updateTask(task);
					syncSuccess = false;
					
					try {
						Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamDisagree();
						productCodeProcessService.check(productCodeProcess.getId(), task.getActTaskId(), param);
						productCodeProcessService.sendSyncDataEmail(null, productCodeProcess, "产品编码写入ERP INV失败", "产品编码写入ERP INV失败", task.getActTaskId());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						log.error("-----调用产品编码接口失败");
						e.printStackTrace();
					}
					break;
					
				}else if(ErpConst.ERP_INV_PRODUCTCODE_NEW.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())){
//					continue;
					syncSuccess = false;
					break;
				}else if(ErpConst.ERP_INV_PRODUCTCODE_SUCESS.equalsIgnoreCase(erpProductTaskList.get(j).getStatus())){
					
					
				}
			}
			
			if(syncSuccess){
				sendCommandToProductCodeFina(ibdsTaskService, task);
			}
			
		}
		
	
	}
	
	private void sendCommandToProductCodeFina(IbdsTaskService ibdsTaskService, IbdsTask task){
		task.setFinalStatus(FlowableConst.TASK_STATUS_PRODUCTCODE_TO_ERP_INV_SUCESS);
		ibdsTaskService.updateTask(task);
		
		//下发命令到修改财务参考信息和研发基本信息
		setIbdsTaskForCreateProductCodeFina(task);
		ibdsTaskService.addTask(task);
	}
	private IbdsTask setIbdsTaskForCreateProductCodeFina(IbdsTask task){
		task.setId(null);
		task.setCreateTime(new Date());
		task.setFinalStatus(null);
		task.setStatus(null);
		task.setType(FlowableConst.TASK_TYPE_PRODUCTCODE_FINANCE_AND_PRODUCT);
		return task;
	}
	
	@Transactional
	public void handlerPartInv(IbdsTask task){
		
		List<TaskMsgEntity> bomAndBusinessTaskList = erpInvService.getBomAndBusinessTaskMsgByApplyNo(task.getErpApplyNo());
		List<TaskMsgEntity> erpProductAndBomTaskList =  erpInvService.getProductCodeBomTaskMsgByApplyNo(task.getErpApplyNo());
		
		if(CollectionUtils.isNotEmpty(erpProductAndBomTaskList)){
			bomAndBusinessTaskList.addAll(erpProductAndBomTaskList);
		}
		
		if(CollectionUtils.isNotEmpty(bomAndBusinessTaskList)){
			boolean syncSuccess = true;
			
			PartCodeProcess partCodeProcess = partCodeProcessService.getByApplyNo(task.getTaskId());
			for(int j = 0; j < bomAndBusinessTaskList.size(); j++){
				
				if(ErpConst.ERP_INV_PRODUCTCODE_FAIL.equalsIgnoreCase(bomAndBusinessTaskList.get(j).getStatus())
						|| ErpConst.ERP_INV_PRODUCTCODEANDBOM_FAIL.equalsIgnoreCase(bomAndBusinessTaskList.get(j).getStatus())){
					task.setFinalStatus(FlowableConst.TASK_STATUS_PARTCODE_TO_ERP_INV_FAIL);
					ibdsTaskService.updateTask(task);
					syncSuccess = false;
					try {
						Map<String, Object> param = FlowableUtil.buildPartCodeCheckParamDisagree();
						partCodeProcessService.check(partCodeProcess.getId(), task.getActTaskId(), param);
						partCodeProcessService.sendSyncDataEmail(null, partCodeProcess, "新增part编码写入ERP INV失败", "新增part编码写入ERP INV失败", task.getActTaskId());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						log.error("---调用新增part接口失败");
					}
					break;
					// TODO 这里需要发送邮件给相关责任人  修改工作流状态
				}else if(ErpConst.ERP_INV_PRODUCTCODE_NEW.equalsIgnoreCase(bomAndBusinessTaskList.get(j).getStatus())){
					syncSuccess = false;
					break;
				}else if(ErpConst.ERP_INV_PRODUCTCODE_SUCESS.equalsIgnoreCase(bomAndBusinessTaskList.get(j).getStatus())){
					//修改task状态
					//新增part流程结束
				}
			}
			
			
			
			// TODO 修改工作流状态  失败回退，正常完成流程
			if(syncSuccess){
				// TODO   完成任务，通知当事人
				
				task.setFinalStatus(FlowableConst.TASK_STATUS_PARTCODE_TO_ERP_INV_SUCESS);
				ibdsTaskService.updateTask(task);
				
				//下发命令到修改财务参考信息和研发基本信息
				task.setId(null);
				task.setCreateTime(new Date());
				task.setFinalStatus(null);
				task.setStatus(null);
				task.setType(FlowableConst.TASK_TYPE_PARTCODE_FINANCE_AND_PRODUCT);
				ibdsTaskService.addTask(task);
			}
			
		}
	}
	
}
