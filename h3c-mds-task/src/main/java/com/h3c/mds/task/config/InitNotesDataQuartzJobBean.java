	package com.h3c.mds.task.config;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.utils.redis.RedisUtil;

/**
 * 向erp   coa  同步数据
 * @author l20095
 *
 */
@PersistJobDataAfterExecution//持久化
@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
public class InitNotesDataQuartzJobBean extends QuartzJobBean{

	
	
	private Logger LOG = LoggerFactory.getLogger(InitNotesDataQuartzJobBean.class);
	
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		RedisUtil redisUtil = (RedisUtil) SpringContextUtils.getBean(RedisUtil.class);
		
		if(redisUtil.get("init_ProjectCodeData") == null){
			
		}
	}

}
