package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.ReleaseView;


public interface FlowableReleaseService {
	
	
	
	/**
	 * 通过R级内码获取产品线相关信息
	 * @param releaseNo
	 * @return
	 */
	public ReleaseView getAllProductLineByReleaseNo(String releaseNo);
	
	public IBDS_Release getReleaseByName(String releaseName);
	
}
