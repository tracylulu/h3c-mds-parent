package com.h3c.mds.basicinfo.service;

import com.h3c.mds.basicinfo.entity.view_PeopleApply;

public interface view_PeopleApplyService {
	/**
	 * 根据Apply获取单号
	 * @param id
	 * @return
	 */
	view_PeopleApply selectByID(Integer id);
	
	/**
	 * 根据流程单号获取
	 * @param id
	 * @return
	 */
	view_PeopleApply selectByProcessID(Integer id);
}
