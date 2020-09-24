package com.h3c.mds.flowable.quartz.config;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.flowable.entity.PdmPartView;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.strategy.Strategy;
import com.h3c.mds.flowable.strategy.StrategyFactory;

/**
 * @Description: Quartz job类
 * @Author: yanhonghai
 * @Date: 2018/11/16 14:47
 */
//@PersistJobDataAfterExecution//持久化
//@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
@Deprecated
public class PdmQuartzJobBean{
    protected Logger logger = LoggerFactory.getLogger(PdmQuartzJobBean.class);
    
    
    
//    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        // TODO Auto-generated method stub
    	logger.info("开始读取pdm，华智数据");
		//同步pdm的数据到新增part编码
//		handleDataToPart(FlowableConst.GETDATAFROM_FROM_PDM);
//		同步和华智的数据到新增part编码
//		handleDataToPart(FlowableConst.GETDATAFROM_FROM_HZ);
		logger.info("读取pdm，华智数据完毕");
//        logger.info("....execute:{}....", context.getTrigger().getKey());
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void handleDataToPart(String type){
		Strategy pdmStrategy = StrategyFactory.createStrategyImpl(type);
//		List<PdmPartView> pdmList = pdmStrategy.getSourceData();
//		List<PartProcessAndPartCodeWrapper> wrapperList = pdmStrategy.transferPOJO(pdmList);
//		pdmStrategy.saveData(wrapperList);
	} 
}
