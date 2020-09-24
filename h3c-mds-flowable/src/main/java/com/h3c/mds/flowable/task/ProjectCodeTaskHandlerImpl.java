package com.h3c.mds.flowable.task;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.flowable.engine.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.utils.CommonsThreadCache;

/**
 * 同步  项目编码数据 		到研发基本信息	      和财务参考信息
 * @author l20095
 *
 */
@Component
public class ProjectCodeTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(ProjectCodeTaskHandlerImpl.class);
	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private TaskService actTaskService;
	
	@Autowired
	private ProcessLogService processLogService;
	
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
		
		boolean  flag = false;
		
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByApplyNo(ibdsTask.getTaskId());
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("erp", FlowableConst.DISAGREE);
		CommonsThreadCache.setCurrentOperateType("system");
		try {
			//同步项目编码数据到财务参考信息
			//同步项目编码数据到研发基本信息
			projectCodeService.handleFinanceAndProject(projectCodeProcessExt.getProcessInsId());
			//TODO 完成工作流任务
			ibdsTask.setFinalStatus(FlowableConst.TASK_TYPE_PROJECTCODE_SUCCESS);
			// 测试，先不完成
			param.put("erp", FlowableConst.AGREE);
			projectCodeProcessExt.setCurStatus("流程结束");
			projectCodeProcessExt.setCurDeal("");
			processLogService.createLog(new Date(), null, "ERP",
					null ,
					"ERP同步成功" , 
					"流程结束", 
					projectCodeProcessExt.getApplyNo());
			projectCodeProcessExt.setIsEdit(FlowableConst.PROJECT_CODE_IS_EDIT_END);
			projectCodeService.sendSyncEipMsg(projectCodeProcessExt,"end");
			flag = true;
		} catch (Exception e) {
			param.put("erp", FlowableConst.DISAGREE);
			e.printStackTrace();
			// TODO 发送项目编码邮件
			log.error("----项目编码向研发基本信息和财务参考信息写入数据失败");
			log.error("----项目编码向研发基本信息和财务参考信息写入数据失败",e );
			//修改任务状态
			ibdsTask.setFinalStatus(FlowableConst.TASK_TYPE_PROJECTCODE_FAIL);
			ibdsTask.setCause(e.getMessage());
			CommonsThreadCache.setCurrentOperateType("system");
			projectCodeProcessExt.setCurDeal(projectCodeProcessExt.getProjectOffice());
			projectCodeProcessExt.setCurStatus("项目编码同步到财务参考信息和研发基本信息失败");
			projectCodeService.sendSyncEipMsg(projectCodeProcessExt, FlowableConst.DISAGREE);
			projectCodeService.sendSyncDataEmail(null, projectCodeProcessExt, "项目编码同步到财务参考信息和研发基本信息失败" , "项目编码同步到财务参考信息和研发基本信息失败", ibdsTask.getTaskId());
		}
		ibdsTaskService.updateTask(ibdsTask);
		actTaskService.complete(ibdsTask.getActTaskId(), param);
		projectCodeService.updateProjectCodeProcess(projectCodeProcessExt);
		
		return flag;
	}

}
