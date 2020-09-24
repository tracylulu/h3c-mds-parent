package com.h3c.mds.product.dao;

import java.util.*;

import org.apache.ibatis.annotations.Param;

public interface CheckUtilsMapper {
	
	/**
	 * 重复校验Sql语句
	 * @param map
	 * @return
	 */
	int query(@Param("param") Map<String,String> param);
}
