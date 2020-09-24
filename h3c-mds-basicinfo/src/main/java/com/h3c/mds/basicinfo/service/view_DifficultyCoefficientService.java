package com.h3c.mds.basicinfo.service;

import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficient;

public interface view_DifficultyCoefficientService {
	
	/**
	 * 根据表单ＩＤ获取
	 * @param id
	 * @return
	 */
	view_DifficultyCoefficient selectByID(Integer id);
	
	/**
	 * 根据流程ID获取
	 * @param id
	 * @return
	 */
	view_DifficultyCoefficient selectByProcessID(Integer id);
}
