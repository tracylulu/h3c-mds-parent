package com.h3c.mds.flowable.listener;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * 产品编码审核人审核监听器（创建usertask时触发）
 * @author sYS2403
 *
 */
public class ProductCodeCheckCreateListener implements TaskListener{

	@Override
	public void notify(DelegateTask delegateTask) {
		delegateTask.setAssignee("sys2403");
		
	}

}
