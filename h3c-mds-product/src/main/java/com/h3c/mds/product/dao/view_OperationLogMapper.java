package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.view_OperationLog;
import com.h3c.mds.product.entity.view_OperationLogExample;

public interface view_OperationLogMapper {
	long countByExample(view_OperationLogExample example);

	int deleteByExample(view_OperationLogExample example);

	int insert(view_OperationLog record);

	int insertSelective(view_OperationLog record);

	List<view_OperationLog> selectByExample(view_OperationLogExample example);

	int updateByExampleSelective(@Param("record") view_OperationLog record,
			@Param("example") view_OperationLogExample example);

	int updateByExample(@Param("record") view_OperationLog record, @Param("example") view_OperationLogExample example);

	List<view_OperationLog> findByPage(@Param("param") Map<String, Object> param);
}