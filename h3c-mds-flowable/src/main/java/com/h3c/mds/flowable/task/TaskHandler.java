package com.h3c.mds.flowable.task;

import com.h3c.mds.flowable.entity.IbdsTask;




public interface TaskHandler {
	
	boolean handle(IbdsTask ibdsTask);
	
	boolean doHandle(IbdsTask ibdsTask);
	
	void updateTask(IbdsTask ibdsTask);
}
