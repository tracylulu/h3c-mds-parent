package com.h3c.mds.basicinfo.service.impl;

import java.util.List;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficient;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientExample;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientExample.Criteria;
import com.h3c.mds.basicinfo.service.view_DifficultyCoefficientService;
import com.h3c.mds.basicinfo.dao.view_DifficultyCoefficientMapper;

@Service
public class view_DifficultyCoefficientServiceImpl implements view_DifficultyCoefficientService{
	
	private static final Logger logger = LoggerFactory.getLogger(view_DifficultyCoefficientServiceImpl.class);
	
	@Autowired
	private view_DifficultyCoefficientMapper viewDiffMapper;
	
	@Override
	@Transactional(readOnly=true)
	public view_DifficultyCoefficient selectByID(Integer id) {
		try {
			view_DifficultyCoefficientExample example=new view_DifficultyCoefficientExample();
			Criteria criteria= example.createCriteria();
			criteria.andIdEqualTo(id);
			List<view_DifficultyCoefficient> lst=viewDiffMapper.selectByExample(example);
			return lst.get(0);
		}catch(Exception e) {
			 logger.error("查询错误", e);
		}
		return new view_DifficultyCoefficient();
	}
	
	@Override
	public view_DifficultyCoefficient selectByProcessID(Integer id) {
		try {
			view_DifficultyCoefficientExample example=new view_DifficultyCoefficientExample();
			Criteria criteria= example.createCriteria();
			criteria.andProcessidEqualTo(id);
			List<view_DifficultyCoefficient> lst=viewDiffMapper.selectByExample(example);
			return lst.get(0);
		}catch(Exception e) {
			 logger.error("查询错误", e);
		}
		return new view_DifficultyCoefficient();
	}
}
