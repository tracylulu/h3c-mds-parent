package com.h3c.mds.basicinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_Product_ApplyExample;

public interface IBDS_Product_ApplyMapper {
	long countByExample(IBDS_Product_ApplyExample example);

	int deleteByExample(IBDS_Product_ApplyExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_Product_Apply record);

	int insertSelective(IBDS_Product_Apply record);

	List<IBDS_Product_Apply> selectByExample(IBDS_Product_ApplyExample example);

	IBDS_Product_Apply selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_Product_Apply record,
			@Param("example") IBDS_Product_ApplyExample example);

	int updateByExample(@Param("record") IBDS_Product_Apply record,
			@Param("example") IBDS_Product_ApplyExample example);

	int updateByPrimaryKeySelective(IBDS_Product_Apply record);

	int updateByPrimaryKey(IBDS_Product_Apply record);

	List<Integer> getIdsByProcessCode(String processCode);

	List<IBDS_Product_Apply> getByProcessCode(String applyCode);

	List<IBDS_Product_Apply> getZTByProductCode(@Param("param") Map<String, String> param);

	Integer getZTCountByProductCode(@Param("param") Map<String, String> param);

	int updateBaseinfo(@Param("param") Map<String, Object> param);

	int updateVRChildren(@Param("param") Map<String, Object> param);

	int updateChildrenBatch(@Param("param") Map<String, Object> param);

	int getCountByColunm(@Param("param") Map<String, Object> param);

	String getNameByColunm(@Param("param") Map<String, Object> param);

	String[] getDataByColunm(@Param("param") Map<String, Object> param);

}