package com.h3c.mds.task.listener;

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

import com.h3c.mds.task.config.ErpCoaQuartzJobBean;
import com.h3c.mds.task.config.ErpInvQuartzJobBean;
import com.h3c.mds.task.config.FinancePartQuartzJobBean;
import com.h3c.mds.task.config.FinanceProjectCodeQuartzJobBean;
import com.h3c.mds.task.config.FinanceQuartzJobBean;
import com.h3c.mds.task.config.MailQuartzJobBean;
import com.h3c.mds.task.config.PdmQuartzJobBean;
import com.h3c.mds.task.config.SchedulerConfig;
import com.h3c.mds.task.config.UpdateTaskStatusQuartzJobBean;


/**
 * @Description:利用Quartz定时任务，可以在初始化上实现，
 */
@Component
public class StartApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private SchedulerConfig schedulerConfig;
	
	@Value("${pdm.cron}")
	private String pdmCron;
	@Value("${mail.cron}")
	private String mailCron;
	@Value("${update.cron}")
	private String updateCron;
	
	@Value("${erp.coa.cron}")
	private String coaCron;
	@Value("${erp.inv.cron}")
	private String invCron;
	@Value("${erp.financeandproduct.cron}")
	private String finaniceAndProductCron;
	
//	@Value("${eos.dept.cron}")
//	private String deptCron;
	
	public static AtomicInteger count = new AtomicInteger(0);
	private static String TRIGGER_GROUP_NAME="flowable_trriger";
	private static String JOB_GROUP_NAME ="flowable_job";
	protected Logger log = LoggerFactory.getLogger(StartApplicationListener.class);
	@Override
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
			
			
			//从数据中台获取部门组织架构信息 定时任务
//			buildJob(scheduler, "jobdept", "dept_job",  "triggerdept", "dept_trigger", DeptQuartzJobBean.class, deptCron);
			
//			//pdm定时任务
//			buildJob(scheduler, "jobpdm", "pdm_job",  "triggerpdm", "pdm_trigger", PdmQuartzJobBean.class, pdmCron);
//			//邮催定时任务
//			buildJob(scheduler, "jobmail", "mail_job",  "triggermail", "mail_trigger", MailQuartzJobBean.class, mailCron);
//			
//			
//			//处理coa 模块  定时任务
//			buildJob(scheduler, "jobCoa", "coa_job",  "triggererpCoa", "coa_trigger", ErpCoaQuartzJobBean.class, coaCron);
//			
//			//定时扫描erp处理状态 定时任务
//			buildJob(scheduler, "jobUpdateStatus", "updatestatus_job",  "triggerUpdateStatus", "updateStatus_trigger", UpdateTaskStatusQuartzJobBean.class, updateCron);
//			//处理 inv  库存  模块定时任务
//			buildJob(scheduler, "jobInv", "inv_job",  "triggererpInv", "inv_trigger", ErpInvQuartzJobBean.class, invCron);
//			
//			//处理产品编码向研发基本信息和财务参考信息 回写数据  定时任务
//			
//			buildJob(scheduler, "jobSyncFinanceAndProductData", "productFina_job",  "triggerProductFinaAndProduct", "productFina_trigger", FinanceQuartzJobBean.class, finaniceAndProductCron);
//			//处理项目编码向研发基本信息和财务参考信息 回写数据  定时任务
//			buildJob(scheduler, "jobSyncFinanceAndProjectData", "projectFina_job",  "triggerProjectFinaAndProduct", "projectFina_trigger", FinanceProjectCodeQuartzJobBean.class, finaniceAndProductCron);
//			//处理新增part编码向研发基本信息和财务参考信息 回写数据  定时任务
//			buildJob(scheduler, "jobSyncFinanceAndPartData", "partFina_job",  "triggerPartFinaAndProduct", "partFina_trigger", FinancePartQuartzJobBean.class, finaniceAndProductCron);
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
//				if(!cronStr.equals(trigger.getCronExpression())){
					log.info("job已存在:{}",trigger.getKey());					
					//定义一个JobDetail,其中的定义Job类，是真正的执行逻辑所在
					scheduler.deleteJob(jobDetail.getKey());
					CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronStr);
					//定义一个Trigger
					trigger = TriggerBuilder.newTrigger().withIdentity(triggerKeyStr, triggerGroupName)
							.withSchedule(scheduleBuilder).build();
					scheduler.scheduleJob(jobDetail, trigger);
					log.info("Quartz 重新创建了job:...:{}",jobDetail.getKey());
//				}
			}
		} catch (Exception e) {
			log.info(ExceptionUtils.getFullStackTrace(e));
		}
	}
}
