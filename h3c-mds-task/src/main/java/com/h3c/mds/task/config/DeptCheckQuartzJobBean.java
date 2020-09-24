package com.h3c.mds.task.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.h3c.mds.dept.service.CoaMailService;

/**
 * 定时任务检查部门信息（空值和有效性）
 * @author cYS1425
 *
 */
//@PersistJobDataAfterExecution//持久化
//@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
@Component
//@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class DeptCheckQuartzJobBean {
	
	@Autowired
	CoaMailService mailService;
	
	private Logger logger = LoggerFactory.getLogger(DeptCheckQuartzJobBean.class);
	
	//@Override
	@Scheduled(cron ="${deptCheck.cron}")
	protected void executeTask() {
				
		logger.info("DeptCheckQuartzJobBean job start");

		mailService.sendMailForQuartzCheck();
		
		logger.info("DeptCheckQuartzJobBean job end");
		
	}

}
