package com.h3c.mds.basicinfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.basicinfo.dao.view_ApproveListMapper;
import com.h3c.mds.basicinfo.entity.view_ApproveList;
import com.h3c.mds.basicinfo.service.view_ApproveListService;
import com.h3c.mds.sysmgr.entity.User;

@Service
public class view_ApproveListServiceImpl implements view_ApproveListService {

	@Autowired
	private view_ApproveListMapper approveMapper;

	@Override
	@Transactional(readOnly = true)
	public List<view_ApproveList> getList(String type) {
		User user = (User) SecurityUtils.getSubject().getSession().getAttribute("current_user");
		Map<String, String> param = new HashMap<>();
		if (StringUtils.isNotBlank(type)) {
			param.put("type", type);
		}

		param.put("user", user.getUda10509() + " " + user.getUda10512());
		return approveMapper.getList(param);
	}

	@Override
	@Transactional(readOnly = true)
	public List<view_ApproveList> getMyApplicationList(String type) {
		User user = (User) SecurityUtils.getSubject().getSession().getAttribute("current_user");
		Map<String, String> param = new HashMap<>();
		if (StringUtils.isNotBlank(type)) {
			param.put("type", type);
		}

		param.put("user", user.getUda10509() + " " + user.getUda10512());
		return approveMapper.getMyApplicationList(param);
	}

	@Override
	@Transactional(readOnly = true)
	public List<view_ApproveList> getHistoryList(String type) {
		Map<String, String> param = new HashMap<>();
		if (StringUtils.isNotBlank(type)) {
			param.put("type", type);
		}
		param.put("user", (String) SecurityUtils.getSubject().getPrincipal());
		return approveMapper.getHistoryList(param);
	}
}
