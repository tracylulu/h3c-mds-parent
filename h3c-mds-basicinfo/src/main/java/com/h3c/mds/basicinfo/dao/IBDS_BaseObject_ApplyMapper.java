package com.h3c.mds.basicinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_ApplyExample;

public interface IBDS_BaseObject_ApplyMapper {
	long countByExample(IBDS_BaseObject_ApplyExample example);

	int deleteByExample(IBDS_BaseObject_ApplyExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_BaseObject_Apply record);

	int insertSelective(IBDS_BaseObject_Apply record);

	List<IBDS_BaseObject_Apply> selectByExample(IBDS_BaseObject_ApplyExample example);

	IBDS_BaseObject_Apply selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_BaseObject_Apply record,
			@Param("example") IBDS_BaseObject_ApplyExample example);

	int updateByExample(@Param("record") IBDS_BaseObject_Apply record,
			@Param("example") IBDS_BaseObject_ApplyExample example);

	int updateByPrimaryKeySelective(IBDS_BaseObject_Apply record);

	int updateByPrimaryKey(IBDS_BaseObject_Apply record);

	List<Integer> getIdsByProcessCode(String processCode);

	List<IBDS_BaseObject_Apply> getByProcessCode(String applyCode);

	List<IBDS_BaseObject_Apply> getZTByProductCode(@Param("param") Map<String, String> param);

	Integer getZTCountByProductCode(@Param("param") Map<String, String> param);

	int updateBaseinfo(@Param("param") Map<String, Object> param);

	Integer validateVRIntransit(@Param("param") Map<String, String> param);
}