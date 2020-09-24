package com.h3c.mds.flowable.listener;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * 产品编码财务审批监听器（创建）
 * @author sYS2403
 *
 */
public class ProductCodeCWCheckCreateListener implements TaskListener{

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		delegateTask.setAssignee("sys2403");
	}

}
