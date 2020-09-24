package com.h3c.mds.flowable.listener.project;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.FlowableProjectCodeCache;

/**
 * 项目经理审批者
 * @author l20095
 *
 */
public class ProjectManagerListener  implements TaskListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5585452853639052531L;

	@Override
	public void notify(DelegateTask delegateTask) {
		ProjectCodeProcessExt projectCodeProcessExt = FlowableProjectCodeCache.getCurrentProjectCodeProcessExt();

		String handler = "";
		if(projectCodeProcessExt != null && StringUtil.isNotEmpty(projectCodeProcessExt.getProjMng())){
			handler = projectCodeProcessExt.getProjMng();
		}else {
			throw new FlowableException("流程节点：《"+delegateTask.getName()+"》，没有项目经理，请联系管理员！");
		}
		FlowableCache.setCurrentHandler(handler);
		FlowableProjectCodeCache.setCurrentActTaskId(delegateTask.getId());
//		projectCodeProcess.setProjMng(handler);
//		projectCodeProcess.setCurDeal(handler);
//		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
		delegateTask.setAssignee(handler);
	}

}
