package com.h3c.mds.product.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.service.CheckUtilsService;
import com.h3c.mds.product.dao.CheckUtilsMapper;

@Service
public class CheckUtilsServiceImpl implements CheckUtilsService {
	
	@Autowired
	private CheckUtilsMapper checkUtilsMapper;
	
	@Override
	//@Transactional(readOnly=true)
	public int query(Map<String,String> param) {
		return checkUtilsMapper.query(param);
	}

}
