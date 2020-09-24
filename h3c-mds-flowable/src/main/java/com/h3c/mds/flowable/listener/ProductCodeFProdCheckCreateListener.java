package com.h3c.mds.flowable.listener;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;


/**
 * 财务产品接口人审核监听器（创建该usertask时触发）
 * @author sYS2403
 *
 */
public class ProductCodeFProdCheckCreateListener implements TaskListener{

	@Override
	public void notify(DelegateTask delegateTask) {
		// TODO Auto-generated method stub
		delegateTask.setAssignee("sys2403");
	}

}
