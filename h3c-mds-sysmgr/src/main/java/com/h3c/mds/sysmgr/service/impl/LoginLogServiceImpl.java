package com.h3c.mds.sysmgr.service.impl;

import com.h3c.mds.sysmgr.entity.LoginLog;
import com.h3c.mds.sysmgr.service.LoginLogService;
import com.h3c.mds.sysmgr.dao.LoginLogMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginLogServiceImpl implements LoginLogService {
	
	@Autowired
	private LoginLogMapper  loginLogMapper;
	
	/**
	 * 记录用户登录IP
	 */
	@Override
	@Transactional
	public int create(String name,String ip) {
		LoginLog log=new LoginLog();
		log.setOperator(name);
		log.setOpttime(new Date());
		log.setClientip(ip);
		log.setOptdesc("登录");
		return loginLogMapper.insertSelective(log);
	}	

}
