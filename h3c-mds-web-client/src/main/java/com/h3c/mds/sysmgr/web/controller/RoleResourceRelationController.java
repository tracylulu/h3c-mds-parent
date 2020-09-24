package com.h3c.mds.sysmgr.web.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h3c.mds.sysmgr.entity.RoleResourceRelation;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.RoleResourceRelationService;
import com.h3c.mds.sysmgr.service.UserService;

@Controller
@RequestMapping("/roleResourceRelation")
public class RoleResourceRelationController {

	@Autowired
	private RoleResourceRelationService relationService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/batchCreate")
	@ResponseBody
	public ResponseResult batchCreate(@RequestBody List<RoleResourceRelation> list){
		try {
			relationService.batchCreate(list);
			return ResponseResult.success("");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.fail("批量新增失败");
		}
	}
	
	@RequestMapping("/distributionResourceForRole")
	@ResponseBody
	public ResponseResult distributionResourceForRole(String roleCode,@RequestBody List<RoleResourceRelation> relations){
		try {
			
			relationService.distributionResourceForRole(roleCode, relations);
			userService.refreshMenue((String)SecurityUtils.getSubject().getPrincipal());
			return ResponseResult.success("");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.fail("批量新增失败");
		}
	}
}
