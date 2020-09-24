package com.h3c.mds.sysmgr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h3c.mds.sysmgr.entity.RoleResourceRelation;
import com.h3c.mds.sysmgr.service.RoleResourceRelationService;


@Controller
@RequestMapping("/roleResourcRelation")
public class RoleResourcRelationController {

	@Autowired
	private RoleResourceRelationService roleResourceRelationService;
	
	@RequestMapping("/addRoleResourcRelation")
	public String addRoleResourcRelation(){
		RoleResourceRelation roleResourcRelation = new RoleResourceRelation();
		roleResourcRelation.setHrrrHrlCode("aaa");
		roleResourcRelation.setHrrrHresCode("bbb");
		
		// TODO 这里要判断是否存在，
		int count = roleResourceRelationService.create(roleResourcRelation);
		return "ok";
	}
	
	
	
	@RequestMapping("/updateRoleResourcRelation")
	@ResponseBody
	public String updateRoleResourcRelation(){
//		RoleResourceRelation roleResourcRelation = roleResourceRelationService
		return "ok";
	}
	
	
	
	
	
}
