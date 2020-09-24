package com.h3c.mds.product.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.service.FlowableBversionService;
import com.h3c.mds.sysmgr.response.ResponseResult;

@RestController
@RequestMapping("/flowable/product")
public class FlowableBversionController {

	@Autowired
	private FlowableBversionService flowableBversionService;
	

	@RequestMapping("/getBversionByReleaseName")
	@ResponseBody
	public ResponseResult getAllBversionByReleaseName(String releaseName){
		
		List<IBDS_Bversion> bversionList = flowableBversionService.getAllBversionByReleaseName(releaseName);
		return ResponseResult.success(bversionList);
	}
	
	
	@RequestMapping("/getBversionByReleaseNo")
	@ResponseBody
	public ResponseResult getAllBversionByReleaseNo(String releaseNo){
		
		List<IBDS_Bversion> bversionList = flowableBversionService.getAllBversionByReleaseNo(releaseNo);
		return ResponseResult.success(bversionList);
	}
	
	
	@RequestMapping("/getBversionByReleaseCodeAndBversionName")
	@ResponseBody
	public ResponseResult getBversionByReleaseCodeAndBversionName(String releaseNo, String bVersionName){
		Map<String, String> param = new HashMap<String, String>();
		param.put("releaseNo", releaseNo);
		param.put("bVersionName", bVersionName);
		
		IBDS_Bversion bversion = flowableBversionService.getBversionByReleaseCodeAndBversionName(param);
		return ResponseResult.success(bversion);
	}
	
}
