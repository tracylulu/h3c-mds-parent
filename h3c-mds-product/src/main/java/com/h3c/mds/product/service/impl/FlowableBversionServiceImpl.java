package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.service.FlowableBversionService;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_VersionService;

@Service
public class FlowableBversionServiceImpl implements FlowableBversionService {

	


	@Autowired
	private IBDS_VersionService versionService;
	
	@Autowired
	private IBDS_BversionService bversionService;
	
	@Override
	public List<IBDS_Bversion> getAllBversionByReleaseName(String releaseName) {
		
		IBDS_Version version = versionService.getVersionByName(releaseName);
		return bversionService.getAllBversionByReleaseCode(version.getVersionno());
	}

	@Override
	public List<IBDS_Bversion> getAllBversionByReleaseNo(String releaseNo) {
		return bversionService.getAllBversionByReleaseCode(releaseNo);
	}

	@Override
	public IBDS_Bversion getBversionByReleaseCodeAndBversionName(Map<String, String> param) {
		return bversionService.getBversionByReleaseCodeAndBversionName(param);
	}

}
