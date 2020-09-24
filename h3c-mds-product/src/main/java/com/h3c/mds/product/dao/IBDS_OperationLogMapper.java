package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_OperationLog;
import com.h3c.mds.product.entity.IBDS_OperationLogExample;

public interface IBDS_OperationLogMapper {
	long countByExample(IBDS_OperationLogExample example);

	int deleteByExample(IBDS_OperationLogExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_OperationLog record);

	int insertSelective(IBDS_OperationLog record);

	List<IBDS_OperationLog> selectByExample(IBDS_OperationLogExample example);

	IBDS_OperationLog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_OperationLog record,
			@Param("example") IBDS_OperationLogExample example);

	int updateByExample(@Param("record") IBDS_OperationLog record, @Param("example") IBDS_OperationLogExample example);

	int updateByPrimaryKeySelective(IBDS_OperationLog record);

	int updateByPrimaryKey(IBDS_OperationLog record);

	int insertSelectiveBatch(@Param("list") List<IBDS_OperationLog> list);
	
	int insertModPBName(@Param("param") Map<String,Object> param);
}