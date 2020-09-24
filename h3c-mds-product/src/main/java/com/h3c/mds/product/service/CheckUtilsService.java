package com.h3c.mds.product.service;

import java.util.Map;

public interface CheckUtilsService {
	
	/**
	 * 字段重复验证
	 * @param map
	 * @return
	 */
	public int query(Map<String,String> param);	
}
