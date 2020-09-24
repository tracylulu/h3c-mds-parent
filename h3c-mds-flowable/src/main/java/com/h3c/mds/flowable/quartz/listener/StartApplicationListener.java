package com.h3c.mds.flowable.quartz.listener;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.quartz.config.PdmQuartzJobBean;
import com.h3c.mds.flowable.quartz.config.SchedulerConfig;

/**
 * @Description:利用Quartz定时任务，可以在初始化上实现，
 */
//@Component
@Deprecated
public class StartApplicationListener{
	
	@Autowired
	private SchedulerConfig schedulerConfig;
	
	@Value("${pdm.cron}")
	private String pdmCron;
	
	
	public static AtomicInteger count = new AtomicInteger(0);
	private static String TRIGGER_GROUP_NAME="flowable_trriger";
	private static String JOB_GROUP_NAME ="flowable_job";
	protected Logger log = LoggerFactory.getLogger(StartApplicationListener.class);
//	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// 防止重复执行
		if (event.getApplicationContext().getParent() == null && count.incrementAndGet() <= 1) {
			initMyJob();
		}
	}
	public void initMyJob()  {
		//调度器
		Scheduler scheduler = null;
		try {
			//创建scheduler
			scheduler = schedulerConfig.scheduler();
			
			
			
			
			//pdm定时任务
			buildJob(scheduler, "job1", JOB_GROUP_NAME,  "trigger1", TRIGGER_GROUP_NAME, PdmQuartzJobBean.class, pdmCron);
			//定义一个TriggerKey
//			TriggerKey triggerKey = TriggerKey.triggerKey("trigger1", TRIGGER_GROUP_NAME);
//			CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
//			if (null == trigger) {
//				Class clazz = MyQuartzJobBean.class;
//				//定义一个JobDetail,其中的定义Job类，是真正的执行逻辑所在
//				JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity("job1", JOB_GROUP_NAME).build();
//				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("* 34 * * * ?");
//				//定义一个Trigger
//				trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", TRIGGER_GROUP_NAME)
//						.withSchedule(scheduleBuilder).build();
//					scheduler.scheduleJob(jobDetail, trigger);
//				log.info("Quartz 创建了job:...:{}",jobDetail.getKey());
//			} else {
//				log.info("job已存在:{}",trigger.getKey());
//				
//				Class clazz = MyQuartzJobBean.class;
//				//定义一个JobDetail,其中的定义Job类，是真正的执行逻辑所在
//				JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity("job1", JOB_GROUP_NAME).build();
//				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("* 16 * * * ?");
//				//定义一个Trigger
//				trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", TRIGGER_GROUP_NAME)
//						.withSchedule(scheduleBuilder).build();
//					scheduler.scheduleJob(jobDetail, trigger);
//				log.info("Quartz 重新创建了job:...:{}",jobDetail.getKey());
//				
//				
//			}
//			//定义一个TriggerKey
//			TriggerKey triggerKey2 = TriggerKey.triggerKey("trigger2", TRIGGER_GROUP_NAME);
//			CronTrigger trigger2 = (CronTrigger) scheduler.getTrigger(triggerKey2);
//			if (null == trigger2) {
//				Class clazz = MyQuartzJobBean2.class;
//				//定义一个JobDetail,其中的定义Job类，是真正的执行逻辑所在
//				JobDetail jobDetail2 = JobBuilder.newJob(clazz).withIdentity("job2", JOB_GROUP_NAME).build();
//				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("* 14 * * * ?");
//				//定义一个Trigger
//				trigger2 = TriggerBuilder.newTrigger().withIdentity("trigger2", TRIGGER_GROUP_NAME)
//						.withSchedule(scheduleBuilder).build();
//				scheduler.scheduleJob(jobDetail2, trigger2);
//				log.info("Quartz 创建了job:...:{}",jobDetail2.getKey());
//			} else {
//				log.info("job已存在:{}",trigger2.getKey());
//			}
			scheduler.start();
		} catch (Exception e) {
			log.info(ExceptionUtils.getFullStackTrace(e));
		}
	}
	
	
	public void buildJob(Scheduler scheduler,String jobKeyStr, String jobGroupName,  String triggerKeyStr, String triggerGroupName, Class job, String cronStr){
		try {
			TriggerKey triggerKey = TriggerKey.triggerKey(triggerKeyStr, triggerGroupName);
			CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
			JobDetail jobDetail = JobBuilder.newJob(job).withIdentity(jobKeyStr, jobGroupName).build();
			if (null == trigger) {
				//定义一个JobDetail,其中的定义Job类，是真正的执行逻辑所在
				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronStr);
				//定义一个Trigger
				trigger = TriggerBuilder.newTrigger().withIdentity(triggerKeyStr, triggerGroupName)
						.withSchedule(scheduleBuilder).build();
					scheduler.scheduleJob(jobDetail, trigger);
				log.info("Quartz 创建了job:...:{}",jobDetail.getKey());
			} else {
				if(!cronStr.equals(trigger.getCronExpression())){
					log.info("job已存在:{}",trigger.getKey());					
					//定义一个JobDetail,其中的定义Job类，是真正的执行逻辑所在
					scheduler.deleteJob(jobDetail.getKey());
					CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronStr);
					//定义一个Trigger
					trigger = TriggerBuilder.newTrigger().withIdentity(triggerKeyStr, triggerGroupName)
							.withSchedule(scheduleBuilder).build();
					scheduler.scheduleJob(jobDetail, trigger);
					log.info("Quartz 重新创建了job:...:{}",jobDetail.getKey());
				}
			}
		} catch (Exception e) {
			log.info(ExceptionUtils.getFullStackTrace(e));
		}
	}
}
