package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.IBDS_Bversion;


public interface FlowableBversionService {

	
	public List<IBDS_Bversion> getAllBversionByReleaseName(String releaseName);
	
	/**
	 * 通过R级内码关联B版本
	 * @param releaseName
	 * @return
	 */
	public List<IBDS_Bversion> getAllBversionByReleaseNo(String releaseNo);

	
	/**
	 * 通过R级内码，和B级名称获取B版本
	 * @param param
	 * @return
	 */
	public IBDS_Bversion getBversionByReleaseCodeAndBversionName(Map<String, String> param);
}
