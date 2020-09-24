package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_TeamExample;

public interface IBDS_TeamMapper {
	long countByExample(IBDS_TeamExample example);

	int deleteByExample(IBDS_TeamExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_Team record);

	int insertSelective(IBDS_Team record);

	List<IBDS_Team> selectByExample(IBDS_TeamExample example);

	IBDS_Team selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_Team record, @Param("example") IBDS_TeamExample example);

	int updateByExample(@Param("record") IBDS_Team record, @Param("example") IBDS_TeamExample example);

	int updateByPrimaryKeySelective(IBDS_Team record);

	int updateByPrimaryKey(IBDS_Team record);

	int insertSelectiveBatch(@Param("list") List<IBDS_Team> list);

	int updateByBatch(@Param("list") List<IBDS_Team> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_Team> selectTeambyCodes(@Param("param") Map<String, Object> param);
}