package com.h3c.mds.flowable.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import com.h3c.mds.flowable.dao.PartCronMapper;
import com.h3c.mds.flowable.dao.PdmPartViewMapper;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.flowable.entity.PdmPartView;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.strategy.Strategy;
import com.h3c.mds.flowable.strategy.StrategyFactory;

/**
 * 定时任务统一用quartz   
 * @see com.h3c.mds.flowable.quartz.listener.StartApplicationListener
 * @author l20095
 *
 */
//@Component
//@Configuration   
//@EnableScheduling 
@Deprecated
public class DynamicScheduleTask implements SchedulingConfigurer{

	private static final Logger LOG = LoggerFactory.getLogger(DynamicScheduleTask.class);
	
    @Autowired
    private PartCronMapper partCronMapper;
	
	
    @Autowired
    private PdmPartViewMapper pdmPartViewMapper;
	
	
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.addTriggerTask(
                //1.添加任务内容(Runnable)
                new Runnable() {
					
					@Override
					public void run() {
						LOG.info("开始读取pdm，华智数据");
						//同步pdm的数据到新增part编码
						handleDataToPart(FlowableConst.GETDATAFROM_FROM_PDM);
//						同步和华智的数据到新增part编码
						handleDataToPart(FlowableConst.GETDATAFROM_FROM_HZ);
						LOG.info("读取pdm，华智数据完毕");
					}
				},
                //2.设置执行周期(Trigger)
                triggerContext -> {
                    //2.1 从数据库获取执行周期
                	Map<String, Object> param = new HashMap<String, Object>();
                	param.put("cronType", "pdm");
                    String cron = (String)partCronMapper.getCronByType(param).get(0).get("cron");
                    //2.2 合法性校验.
                    if (StringUtils.isEmpty(cron)) {
                    }
                    //2.3 返回执行周期(Date)
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
		
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void handleDataToPart(String type){
		/*Strategy pdmStrategy = StrategyFactory.createStrategyImpl(type);
		List<PdmPartView> pdmList = pdmStrategy.getSourceData();
		List<PartProcessAndPartCodeWrapper> wrapperList = pdmStrategy.transferPOJO(pdmList);
		pdmStrategy.saveData(wrapperList);*/
	} 
	
	//把pdm实体转换为part流程的内容
	private void changePdmToPart(PdmPartView pdmPartView, PartCodeProcess partCodeProcess, PartCodeApply partCodeApply){
		// TODO   完善数据
		pdmPartView.getRespparty();//责任人
		pdmPartView.getH3secondleveldept();//二级部门
		pdmPartView.getS1contactphonenum();//联系电话
		pdmPartView.getDocumentname();//申请单流水号
		
		
		pdmPartView.getS1partnumber();//PART编码    bom编码
		pdmPartView.getS1partdescelements();//项目描述  part编码描述
		pdmPartView.getS1internalmodel();//对外型号     产品代码
		pdmPartView.getS1intenglishdesc();//对内英文描述
		pdmPartView.getS1extchinesedesc();//对外中文描述
		pdmPartView.getS1extenglishdesc();//对外英文描述
		
	}
	
	
}
