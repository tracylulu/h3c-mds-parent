package com.h3c.mds.flowable.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.dao.PartCronMapper;
import com.h3c.mds.flowable.dao.PdmPartViewMapper;
import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.TaskService;

//@Component
//@Configuration      
//@EnableScheduling 
public class ErpTask  /**implements SchedulingConfigurer*/{

    @Autowired
    private PartCronMapper partCronMapper;
	
    @Autowired
    private TaskService taskService;
   
	
//	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.addTriggerTask(
                //1.添加任务内容(Runnable)
                new Runnable() {
					
					@Override
					public void run() {
						List<IbdsTask> ibdsTasks = taskService.getUnHandleTask();
						if(CollectionUtils.isNotEmpty(ibdsTasks)){
							for(int i = 0; i < ibdsTasks.size(); i++){
								TaskContext context = new TaskContext(ibdsTasks.get(i));
								context.excute(ibdsTasks.get(i));
							}
						}
					}
				},
                //2.设置执行周期(Trigger)
                triggerContext -> {
                    //2.1 从数据库获取执行周期
                	Map<String, Object> param = new HashMap<String, Object>();
                	param.put("cronType", FlowableConst.TASK_TYPE_PROJECTCODE_COA);
                    String cron = (String)partCronMapper.getCronByType(param).get(0).get("cron");
                    //2.2 合法性校验.
                    if (StringUtils.isEmpty(cron)) {
                    }
                    //2.3 返回执行周期(Date)
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
		
	}

}
