package com.h3c.mds.flowable.strategy;

import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.strategy.impl.HzStrategyImpl;
import com.h3c.mds.flowable.strategy.impl.PdmNotSyncStrategyImpl;
import com.h3c.mds.flowable.strategy.impl.PdmStrategyImpl;
import com.h3c.mds.flowable.util.SpringContextUtils;



public class StrategyFactory {
	
	@SuppressWarnings("rawtypes")
	public static Strategy createStrategyImpl(String type){
		if(FlowableConst.GETDATAFROM_FROM_PDM.equals(type)){
			return (Strategy)SpringContextUtils.getBean(PdmStrategyImpl.class);
		}else if(FlowableConst.GETDATAFROM_FROM_HZ.equals(type)){
			
			return (Strategy)SpringContextUtils.getBean(HzStrategyImpl.class);
		}else if(FlowableConst.GETDATAFROM_FROM_PDM_NOTSYNC.equals(type)){
			
			return (Strategy)SpringContextUtils.getBean(PdmNotSyncStrategyImpl.class);
		}else{
			return null;
		}
	}
	
}
