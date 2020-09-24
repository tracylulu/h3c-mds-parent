package com.h3c.mds.basicinfo.service;

import com.h3c.mds.basicinfo.entity.view_VRProcess;

public interface view_VRProcessService {
	/**
	 * 通过编码获取数据
	 * @param code
	 * @return
	 */
	view_VRProcess getByApplyCode(String code);
	
	view_VRProcess getByID(Integer id);
}
