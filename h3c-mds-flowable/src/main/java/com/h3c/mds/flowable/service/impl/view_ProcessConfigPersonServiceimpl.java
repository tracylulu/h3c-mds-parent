package com.h3c.mds.flowable.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.*;

import com.h3c.mds.flowable.dao.view_ProcessConfigPersonMapper;
import com.h3c.mds.flowable.entity.view_ProcessConfigPerson;
import com.h3c.mds.flowable.service.view_ProcessConfigPersonService;
import java.util.List;
import java.util.Map;

@Service
public class view_ProcessConfigPersonServiceimpl implements view_ProcessConfigPersonService {
	@Autowired
	private view_ProcessConfigPersonMapper processPersonMapper;
	
	public List<view_ProcessConfigPerson> getTreeData(Map<String,String> params){
		return processPersonMapper.getTreeData(params);
	}

}
