package com.h3c.mds.task.config;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import com.h3c.mds.flowable.service.IbdsTaskService;

/**
 * 向erp同步数据
 * @author l20095
 *
 */
@PersistJobDataAfterExecution//持久化
@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
public class ErpQuartzJobBean extends QuartzJobBean{

	
	
	private Logger LOG = LoggerFactory.getLogger(ErpQuartzJobBean.class);
	
	
	@Autowired
	private IbdsTaskService taskService;
	
	
//	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		
//		List<IbdsTask> ibdsTasks = taskService.getUnHandleTask();
//		if(CollectionUtils.isNotEmpty(ibdsTasks)){
//			for(int i = 0; i < ibdsTasks.size(); i++){
//				TaskContext taskContext = new TaskContext(ibdsTasks.get(i));
//				taskContext.excute(ibdsTasks.get(i));
//			}
//		}
	}

}
