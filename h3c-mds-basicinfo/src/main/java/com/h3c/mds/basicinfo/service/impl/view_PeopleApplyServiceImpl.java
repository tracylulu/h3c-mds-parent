package com.h3c.mds.basicinfo.service.impl;

import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;
import com.h3c.mds.basicinfo.entity.view_PeopleApply;
import com.h3c.mds.basicinfo.entity.view_PeopleApplyExample;
import com.h3c.mds.basicinfo.service.view_PeopleApplyService;
import com.h3c.mds.basicinfo.dao.view_PeopleApplyMapper;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class view_PeopleApplyServiceImpl implements  view_PeopleApplyService{
	private static final Logger logger = LoggerFactory.getLogger(view_PeopleApplyServiceImpl.class);
	@Autowired
	private view_PeopleApplyMapper viewPeopleMapper;
	
	@Override
	public view_PeopleApply selectByID(Integer id) {
		try {
			view_PeopleApplyExample example=new view_PeopleApplyExample();
			view_PeopleApplyExample.Criteria criteria= example.createCriteria();
			criteria.andIdEqualTo(id);
			List<view_PeopleApply> lst=viewPeopleMapper.selectByExample(example);
			return lst.get(0);
		}catch(Exception e) {
			 logger.error("查询错误", e);
		}
		return new view_PeopleApply();
	}
	
	@Override
	public view_PeopleApply selectByProcessID(Integer id) {
		try {
			view_PeopleApplyExample example=new view_PeopleApplyExample();
			view_PeopleApplyExample.Criteria criteria= example.createCriteria();
			criteria.andProcessidEqualTo(id);
			List<view_PeopleApply> lst=viewPeopleMapper.selectByExample(example);
			return lst.get(0);
		}catch(Exception e) {
			 logger.error("查询错误", e);
		}
		return new view_PeopleApply();
	}
}
