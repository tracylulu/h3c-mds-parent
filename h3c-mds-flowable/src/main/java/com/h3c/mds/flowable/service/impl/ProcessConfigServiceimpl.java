package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.flowable.dao.ProcessConfigMapper;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.dao.ProcessConfigItemMapper;
import com.h3c.mds.flowable.entity.ProcessConfigExample;
import com.h3c.mds.flowable.entity.ProcessConfig;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.ProcessConfigService;
import com.h3c.mds.flowable.entity.ProcessConfigExample.Criteria;
import com.h3c.mds.sysmgr.service.UserService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.ArrayList;

@Service
public class ProcessConfigServiceimpl implements ProcessConfigService {
	@Autowired
	private ProcessConfigMapper processConfigMapper;
	@Autowired
	private ProcessConfigItemMapper processConfigItemMapper;
	@Autowired
	private UserService userService;
	

	@Override
	@Transactional(readOnly = true)
	public List<ProcessConfigItem> getTreeData(Map<String, String> param) {

		return processConfigItemMapper.getTreeData(param);
	}

	@Transactional
	@Override
	public int create(ProcessConfig processConfig, List<ProcessConfigItem> lstAdd, List<ProcessConfigItem> lstUpdate,
			List<ProcessConfigItem> lstDelete, String user) {

		for (ProcessConfigItem item : lstAdd) {
			item.setPdtMgn(userService.backDomainAccount(item.getPdtMgn()));
			item.setFprodPerson(userService.backDomainAccount(item.getFprodPerson()));
			item.setContent(item.getNote());
			item.setCreateUser(user);
			item.setCreateDate(new Date());
			processConfigItemMapper.insertSelective(item);
		}

		return 0;
	}

	@Transactional
	@Override
	public int update(ProcessConfig processConfig, List<ProcessConfigItem> lstAdd, List<ProcessConfigItem> lstUpdate,
			List<ProcessConfigItem> lstDelete, String user) {

		String maxCode = processConfigItemMapper.getMaxCode();

		for (ProcessConfigItem item : lstAdd) {
			if(StringUtils.isBlank(item.getNote())) {
				continue;
			}
			maxCode = generateMaxCode(maxCode);
			item.setCode(maxCode);
			//item.setPdtCode(maxCode);
			item.setPdtMgn(userService.backDomainAccount(item.getPdtMgn()));
			item.setFprodPerson(userService.backDomainAccount(item.getFprodPerson()));
			item.setContent(item.getNote());
			item.setConfigCode(processConfig.getCode());
			item.setCreateUser(user);
			item.setCreateDate(new Date());
			item.setState(1);
			processConfigItemMapper.insertSelective(item);
		}

		for (ProcessConfigItem item : lstUpdate) {
			item.setPdtMgn(userService.backDomainAccount(item.getPdtMgn()));
			item.setFprodPerson(userService.backDomainAccount(item.getFprodPerson()));
			item.setContent(item.getNote());
			item.setCreateUser(user);
			item.setCreateDate(new Date());
			processConfigItemMapper.updateByPrimaryKeySelective(item);
		}

		for (ProcessConfigItem item : lstDelete) {
			item.setState(0);
			item.setCreateUser(user);
			item.setCreateDate(new Date());
			processConfigItemMapper.updateByPrimaryKeySelective(item);
		}

		return 0;
	}

	@Override
	public ProcessConfig getByCode(String code) {

		ProcessConfigExample example = new ProcessConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andCodeEqualTo(code);
		List<ProcessConfig> lst = processConfigMapper.selectByExample(example);

		return lst.get(0);
	}

	public String generateMaxCode(String maxCode) {
		if (StringUtil.isEmpty(maxCode)) {
			maxCode = "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "";
		for (int i = 0; i < 6 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	public List<ProcessConfig> getComboxList() {
		ProcessConfigExample example = new ProcessConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo("flow");
		List<ProcessConfig> lst = processConfigMapper.selectByExample(example);

		return lst;
	}

}
