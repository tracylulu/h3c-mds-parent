package com.h3c.mds.task.config;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.task.service.impl.UpdateTaskStatusServiceImpl;
/**
 * 更新所有的  向   erp  同步成功的 状态
 * 1 coa  模块
 * 		1.1项目编码
 * 			 如果项目编码同步erp成功则下发同步   研发基本信息和财务参考信息的命令
 * 			如果同步erp失败则修改最终状态为同步erp失败
 * 		1.2产品编码
 * 			如果产品编码同步erp成功则下发命令   同步库存inv模块
 * 			如果同步erp失败则同步修改最终状态为同步erp失败
 * 
 * @author l20095
 *
 */
@PersistJobDataAfterExecution//持久化
@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
public class UpdateTaskStatusQuartzJobBean extends QuartzJobBean{

	
	private static final Logger  log = LoggerFactory.getLogger(UpdateTaskStatusQuartzJobBean.class);
	
//	@Autowired
//	private TaskService taskService;
	
	
//	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		log.info("开始更新状态");
		
		IbdsTaskService ibdsTaskService = (IbdsTaskService) SpringContextUtils.getBean(IbdsTaskService.class);
		UpdateTaskStatusServiceImpl updateTaskStatusServiceImpl = (UpdateTaskStatusServiceImpl) SpringContextUtils.getBean(UpdateTaskStatusServiceImpl.class);
		
		List<IbdsTask> taskList = ibdsTaskService.getUnHandleTask();
		
		if(CollectionUtils.isNotEmpty(taskList)){
			for(int i = 0; i < taskList.size(); i++){
				IbdsTask task = taskList.get(i);
				if(FlowableConst.TASK_TYPE_PROJECTCODE_COA.equals(task.getType())){
					updateTaskStatusServiceImpl.handlerProjectCoa(task);
				}else if(FlowableConst.TASK_TYPE_PRODUCTCODE_COA.equals(task.getType())){
					//同步产品编码到erp   coa模块
					updateTaskStatusServiceImpl.handlerProductCoa(task);
				}else if(FlowableConst.TASK_TYPE_PRODUCTCODE_INV.equals(task.getType())){
					//同步产品编码到erp   inv模块
					updateTaskStatusServiceImpl.handlerProductInv(task);
				}else if(FlowableConst.TASK_TYPE_PART_INV.equals(task.getType())){
//					同步新增part编码到erp   inv模块
					updateTaskStatusServiceImpl.handlerPartInv(task);
				}
			}
		}
		
		
	}

	
	
	
}
