package com.h3c.mds.task.config;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
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
import com.h3c.mds.flowable.task.TaskContext;
import com.h3c.mds.flowable.util.SpringContextUtils;

/**
 * 同步数据  到财务参考信息，研发基础数据
 * @author l20095
 *
 */
@PersistJobDataAfterExecution//持久化
@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
public class FinancePartQuartzJobBean extends QuartzJobBean{

	
	
	private Logger LOG = LoggerFactory.getLogger(FinancePartQuartzJobBean.class);
	
	
//	@Autowired
//	private TaskService taskService;
	
	
//	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		IbdsTaskService taskService  = (IbdsTaskService) SpringContextUtils.getBean(IbdsTaskService.class);
		LOG.info("---新增part编码开始向研发基本信息和财务参考信息中同步数据---定时任务");
		List<IbdsTask> ibdsTasks = taskService.getUnHandleTask();
		if(CollectionUtils.isNotEmpty(ibdsTasks)){
			for(int i = 0; i < ibdsTasks.size(); i++){
				TaskContext taskContext = new TaskContext(ibdsTasks.get(i));				
				if(FlowableConst.TASK_TYPE_PARTCODE_FINANCE_AND_PRODUCT.equalsIgnoreCase(ibdsTasks.get(i).getType())){
					if(StringUtils.isBlank(ibdsTasks.get(i).getStatus())){
						LOG.info("---新增part编码开始向研发基本信息和财务参考信息中同步数据");
						taskContext.excute(ibdsTasks.get(i));
					}
				}
				
			}
		}
	}
}
