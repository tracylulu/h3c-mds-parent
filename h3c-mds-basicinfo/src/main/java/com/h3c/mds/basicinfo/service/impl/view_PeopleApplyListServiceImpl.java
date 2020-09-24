package com.h3c.mds.basicinfo.service.impl;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.h3c.mds.basicinfo.service.view_PeopleApplyListService;
import com.h3c.mds.basicinfo.dao.view_PeopleApplyListMapper;
import com.h3c.mds.basicinfo.entity.view_PeopleApplyList;
import java.util.Map;
import java.util.List;

@Service	 
public class view_PeopleApplyListServiceImpl implements view_PeopleApplyListService {
	
	@Autowired
	private view_PeopleApplyListMapper  viewPeopleListMapper;

	@Override
	@Transactional(readOnly=true)
	public List<view_PeopleApplyList> selectByMap(Map<String,String> param){
		return viewPeopleListMapper.selectByMap(param);
	}
}
