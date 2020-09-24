package com.h3c.mds.sysmgr.service;

import com.h3c.mds.sysmgr.entity.LoginLog;


public interface LoginLogService {
	
	int create(String name,String ip);

}
