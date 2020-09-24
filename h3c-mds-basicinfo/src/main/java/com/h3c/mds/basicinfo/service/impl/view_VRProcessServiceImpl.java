package com.h3c.mds.basicinfo.service.impl;

import com.h3c.mds.basicinfo.entity.view_VRProcess;
import com.h3c.mds.basicinfo.entity.view_VRProcessExample;
import com.h3c.mds.basicinfo.entity.view_VRProcessExample.Criteria;

import com.h3c.mds.basicinfo.dao.view_VRProcessMapper;
import com.h3c.mds.basicinfo.service.view_VRProcessService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

import java.util.List;

@Service
public class view_VRProcessServiceImpl implements view_VRProcessService{
	
	private static final Logger logger = LoggerFactory.getLogger(view_VRProcessServiceImpl.class);
	
	@Autowired
	private view_VRProcessMapper viewVRMapper;
	
	@Override
	@Transactional(readOnly=true)
	public view_VRProcess getByApplyCode(String code) {
		try {
			view_VRProcessExample Example=new  view_VRProcessExample();
			Criteria cl=Example.createCriteria();
			cl.andApplyCodeEqualTo(code);
			List<view_VRProcess> lst=viewVRMapper.selectByExample(Example);
			if(lst!=null&&lst.size()>0) {
				return lst.get(0);
			}			
		}catch(Exception e) {
			 logger.error("查询错误", e);
		} 
		return new view_VRProcess();
	}
	
	@Override
	@Transactional(readOnly=true)
	public view_VRProcess getByID(Integer id) {
		try {
			view_VRProcessExample Example=new  view_VRProcessExample();
			Criteria cl=Example.createCriteria();
			cl.andIdEqualTo(id);
			List<view_VRProcess> lst=viewVRMapper.selectByExample(Example);
			if(lst!=null&&lst.size()>0) {
				return lst.get(0);
			}			
		}catch(Exception e) {
			 logger.error("查询错误", e);
		} 
		return new view_VRProcess();
	}

}
