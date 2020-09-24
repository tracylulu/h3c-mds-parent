package com.h3c.mds.flowable.listener.project;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.service.ProcessConfigPersonService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.FlowableProjectCodeCache;
import com.h3c.mds.flowable.util.SpringContextUtils;

/**
 * 审核者
 * @author l20095
 *
 */
public class VerifierListener implements TaskListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5912782831254721900L;

	@Override
	public void notify(DelegateTask delegateTask) {
		ProcessConfigPersonService personService = (ProcessConfigPersonService) SpringContextUtils.getBean(ProcessConfigPersonService.class);

		//流程图的流程id
		String processKey = delegateTask.getProcessDefinitionId().split(":")[0];
		//流程图中userTask 定义id 不是实例中usertask的id
		String taskDefinitionKey = delegateTask.getTaskDefinitionKey();
		ProcessConfigPerson configPerson = personService.getCheckPerson(processKey, taskDefinitionKey, (String)delegateTask.getVariable("dept"));
		String handler = "";
		if(configPerson != null){
			handler = configPerson.getCheckerId();			
		}else{
			throw new FlowableException("流程节点：《"+delegateTask.getName()+"》，没有配置审核人，请联系管理员！");
		}
		FlowableCache.setCurrentHandler(handler);
		FlowableProjectCodeCache.setCurrentActTaskId(delegateTask.getId());
		delegateTask.setAssignee(handler);
	}

}
