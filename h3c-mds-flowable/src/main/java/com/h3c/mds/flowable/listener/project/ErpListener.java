package com.h3c.mds.flowable.listener.project;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.entity.ProjectCodeProcess;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.FlowableProjectCodeCache;

/**
 * 项目经理审批者
 * @author l20095
 *
 */
public class ErpListener  implements TaskListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5585452853639052531L;

	@Override
	public void notify(DelegateTask delegateTask) {
		FlowableProjectCodeCache.setCurrentActTaskId(delegateTask.getId());
	}

}
