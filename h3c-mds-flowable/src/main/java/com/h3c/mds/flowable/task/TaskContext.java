package com.h3c.mds.flowable.task;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.util.SpringContextUtils;

/**
 * 执行策略环境类
 * @author l20095
 *
 */

public class TaskContext {

	private TaskHandler taskHandler;
	
	public TaskContext(IbdsTask task){
		if(FlowableConst.TASK_TYPE_PROJECTCODE_COA.equals(task.getType())){
			//向erp  coa  同步  项目编码数据
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(ProjectCodeCoaTaskHandlerImpl.class);
		}else if(FlowableConst.TASK_TYPE_PRODUCTCODE_COA.equals(task.getType())){
			//向erp   coa   模块  同步  产品编码数据
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(ProductCodeCoaTaskHandlerImpl.class);
		}else if(FlowableConst.TASK_TYPE_PRODUCTCODE_INV.equals(task.getType())){
			//向 erp  库存模块    同步   产品编码数据
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(ProductCodeInvTaskHandlerImpl.class);
		}else if(FlowableConst.TASK_TYPE_PART_INV.equals(task.getType())){
			
			//向 erp  库存模块    同步   新增part流程数据
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(PartCodeInvTaskHandlerImpl.class);
		}else if(FlowableConst.TASK_TYPE_PRODUCTCODE_FINANCE_AND_PRODUCT.equals(task.getType())){
//			同步产品编码数据到  财务参考信息和研发基本信息
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(ProductCodeTaskHandlerImpl.class);
		}else if(FlowableConst.TASK_TYPE_PROJECTCODE_FINANCE_AND_PRODUCT.equals(task.getType())){
//			同步项目编码数据到  财务参考信息和研发基本信息
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(ProjectCodeTaskHandlerImpl.class);
		}else if(FlowableConst.TASK_TYPE_PARTCODE_FINANCE_AND_PRODUCT.equals(task.getType())){
			this.taskHandler = (TaskHandler)SpringContextUtils.getBean(PartCodeTaskHandlerImpl.class);
		}
	}
	
	public boolean excute(IbdsTask task){
		return taskHandler.handle(task);
	}
}
