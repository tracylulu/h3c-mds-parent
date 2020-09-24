package com.h3c.mds.flowable.listener.project;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import com.h3c.mds.flowable.util.FlowableProjectCodeCache;


/**
 * 项目编码申请者
 * @author l20095
 *
 */
public class ProjectCodeApplyListener implements TaskListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4120844689058331220L;

	@Override
	public void notify(DelegateTask delegateTask) {
		
		//申请者是当前登录人
		String userId = (String)delegateTask.getVariable("ProjectCodeApply");
		/*ProjectCodeProcessServiceImpl projectCodeProcessService = (ProjectCodeProcessServiceImpl)SpringContextUtils.getBean(ProjectCodeProcessServiceImpl.class);
		ProjectCodeProcess projectCodeProcess = FlowableProjectCodeCache.getCurrentProjectCodeProcessExt();
		//说明是被驳回了
		if(projectCodeProcess != null){
			projectCodeProcess.setCurDeal(userId);
			projectCodeProcess.setApplyer(userId);
			projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);			
		}*/
		delegateTask.setAssignee(userId);
		FlowableProjectCodeCache.setCurrentActTaskId(delegateTask.getId());
		
	}

}
