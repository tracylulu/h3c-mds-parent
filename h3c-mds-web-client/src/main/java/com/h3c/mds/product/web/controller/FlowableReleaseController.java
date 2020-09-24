package com.h3c.mds.product.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.service.FlowableReleaseService;
import com.h3c.mds.sysmgr.response.ResponseResult;

@RestController
@RequestMapping("/flowable/product")
public class FlowableReleaseController {

	@Autowired
	private FlowableReleaseService flowableReleaseService;
	
	@RequestMapping("/getAllProductLineByReleaseNo")
	@ResponseBody
	public ResponseResult getAllProductLineByReleaseNo(String releaseNo){
		
		ReleaseView releaseView = flowableReleaseService.getAllProductLineByReleaseNo(releaseNo);
		return ResponseResult.success(releaseView);
	}
}
