package com.h3c.mds.flowable.task;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.ProductCodeProcessService;
import com.h3c.mds.flowable.util.FlowableUtil;


/**
 * 同步产品编码数据到  财务参考信息   和  研发基本信息
 * @author l20095
 *
 */
@Component
public class ProductCodeTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(ProductCodeTaskHandlerImpl.class);
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private TaskService taskService;
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
	
		ProductCodeProcess productCodeProcess = productCodeProcessService.getProductCodeProcessByApplyCode(ibdsTask.getTaskId());
		// TODO  
//		1同步产品编码到财务参考信息
		try {
			Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamAgree();
			productCodeProcessService.updateBaseInfo(productCodeProcess.getId(), ibdsTask.getActTaskId(), null);
			productCodeProcessService.check(productCodeProcess.getId(), ibdsTask.getActTaskId(), param);
			ibdsTask.setStatus(FlowableConst.TASK_TYPE_PRODUCTCODE_SUCCESS);
			ibdsTask.setFinalStatus(FlowableConst.TASK_TYPE_PRODUCTCODE_SUCCESS);
			//修改工作流作态成功
		} catch (Exception e) {
			e.printStackTrace();
			log.error("---产品编码向研发基本信息和财务参考信息写入数据失败");
			productCodeProcessService.sendSyncDataEmail(null, productCodeProcess, "产品编码写入 财务参考信息和研发基本信息 失败", "产品编码写入 财务参考信息和研发基本信息 失败", ibdsTask.getActTaskId());
			// TODO 发送邮件   修改流程状态  修改工作流状态失败
			Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamDisagree();
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_EXCEPTION);
			ibdsTask.setFinalStatus(FlowableConst.TASK_TYPE_PRODUCTCODE_FAIL);
			ibdsTask.setCause(e.getMessage());
			try {
				List<Task> list = taskService.createTaskQuery().processInstanceId(productCodeProcess.getInstanseId()).list();
				if(CollectionUtils.isNotEmpty(list)){
					productCodeProcessService.check(productCodeProcess.getId(), list.get(0).getId(), param);
										
				}
			} catch (Exception e1) {
				e1.printStackTrace();
				log.error("---调用产品编码接口失败");
				ibdsTask.setCause(e1.getMessage());
			}
		}
		ibdsTaskService.updateTask(ibdsTask);
		
		return false;
	}

}
