package com.h3c.mds.product.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.sysmgr.entity.VDomainGroup;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMember;
import com.h3c.mds.sysmgr.entity.viewUserGroup;
import com.h3c.mds.sysmgr.service.NotesGroupService;
import com.h3c.mds.sysmgr.service.UserService;

@RestController
@RequestMapping("/product")
public class SelUserController {

	@Autowired
	private UserService userService;

	@Autowired
	private NotesGroupService groupService;

	/**
	 * 人员联想
	 */
	@RequestMapping("/userlink/list")
	public List<viewDomainGroupMember> getSingUser(String q) {
		Map<String, String> param = new HashMap<>();
		param.put("name", q);
		// return userService.selUserbyparam(param);--selDomainGroupMemberByparam
		// notes群组人员改为域群组人员
		return userService.selDomainGroupMemberByparam(param);
	}

	/**
	 * 群组联想
	 */
	@RequestMapping("/grouplink/list")
	public List<VDomainGroup> getGroup(String q) {
		Map<String, String> param = new HashMap<>();
		param.put("name", q);
		// return groupService.selGroupbyparam(param);--selDomainGroupByparam
		// notes群组改为域群组
		return userService.selDomainGroupByparam(param);
	}

	/**
	 * 群组人员联想
	 */
	@RequestMapping("/usergrouplink/list")
	public List<viewUserGroup> getUserGroup(String q) {
		Map<String, String> param = new HashMap<>();
		param.put("name", q);
		return userService.selUserGroupViewbyparam(param);
	}

}
