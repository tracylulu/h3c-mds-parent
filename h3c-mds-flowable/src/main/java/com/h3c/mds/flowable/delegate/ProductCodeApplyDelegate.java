package com.h3c.mds.flowable.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * 产品编码服务任务节点实现类
 * @author sYS2403
 *
 */
public class ProductCodeApplyDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) {
		// TODO Auto-generated method stub
		String eventName = execution.getEventName();
	}

}
