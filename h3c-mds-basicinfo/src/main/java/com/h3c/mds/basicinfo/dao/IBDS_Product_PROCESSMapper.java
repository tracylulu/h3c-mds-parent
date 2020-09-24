package com.h3c.mds.basicinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESSExample;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESSExt;

public interface IBDS_Product_PROCESSMapper {
	long countByExample(IBDS_Product_PROCESSExample example);

	int deleteByExample(IBDS_Product_PROCESSExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_Product_PROCESS record);

	int insertSelective(IBDS_Product_PROCESS record);

	List<IBDS_Product_PROCESS> selectByExample(IBDS_Product_PROCESSExample example);

	IBDS_Product_PROCESS selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_Product_PROCESS record,
			@Param("example") IBDS_Product_PROCESSExample example);

	int updateByExample(@Param("record") IBDS_Product_PROCESS record,
			@Param("example") IBDS_Product_PROCESSExample example);

	int updateByPrimaryKeySelective(IBDS_Product_PROCESS record);

	int updateByPrimaryKey(IBDS_Product_PROCESS record);

	int insertAndGetId(IBDS_Product_PROCESS record);

	String getMaxCode(String name);

	IBDS_Product_PROCESSExt getExtById(Integer id);
}