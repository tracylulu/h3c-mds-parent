package com.h3c.mds.flowable.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.IbdsTaskService;


@Component
public abstract class DefaultAbstractTaskHandler implements TaskHandler {

	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Override
	@Transactional
	public boolean handle(IbdsTask ibdsTask) {
		return doHandle(ibdsTask);
	}

	@Override
	@Transactional
	public void updateTask(IbdsTask ibdsTask){
		ibdsTaskService.updateTask(ibdsTask);
	}
}
