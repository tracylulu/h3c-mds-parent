package com.h3c.mds.flowable.listener;

import com.h3c.mds.flowable.dao.ProcessConfigItemMapper;
import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.flowable.service.ProcessConfigPersonService;
import com.h3c.mds.flowable.service.ProductCodeApplyService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.SpringContextUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.auth.Subject;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 产品编码申请监听器（创建该usertask时触发）
 * @author sYS2403
 *
 */
public class ProductCodeApplyCreateListener implements TaskListener{


	@Override
	public void notify(DelegateTask delegateTask) {

		FlowableCache.setCurrentHandler(FlowableConst.ERP_HANDLER);
		Map<String, Object> variables = delegateTask.getVariables();
		String applyCode = (String) variables.get("applyCode");
		String applyType = (String) variables.get("applyType");
		//delegateTask.setAssignee("sys2403");
		String processKey = delegateTask.getProcessDefinitionId().split(":")[0];
		String id = delegateTask.getId();
		IbdsTaskService ibdsTaskService = (IbdsTaskService) SpringContextUtils.getBean(IbdsTaskService.class);
		List<IbdsTask> oldTaskList  = ibdsTaskService.getTaskByTaskId(applyCode);
		IbdsTask task = new IbdsTask();
		task.setErpApplyNo(ibdsTaskService.getNewErpImportNoByApplyNo(applyCode));
		if(CollectionUtils.isNotEmpty(oldTaskList)){
			//删除任务
			ibdsTaskService.deleteTaskByTaskId(applyCode);
		}
		//发送命令执行 同步erp操作

		task.setActTaskId(id);
		task.setCreateTime(new Date());
//					task.setCreateUser(createUser);
		task.setTaskId(applyCode);
		if("productCodeApply".equals(processKey)){
			task.setType(FlowableConst.TASK_TYPE_PRODUCTCODE_COA);
		}else if("partCodeApply".equals(processKey)){
			task.setType(FlowableConst.TASK_TYPE_PART_INV);
		}

		task.setVal(applyCode + "~" + applyType);
		ibdsTaskService.addTask(task);


	}

}
