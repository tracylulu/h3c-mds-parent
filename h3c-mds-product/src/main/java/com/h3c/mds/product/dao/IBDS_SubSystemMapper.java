package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_SubSystemExample;

public interface IBDS_SubSystemMapper {
	long countByExample(IBDS_SubSystemExample example);

	int deleteByExample(IBDS_SubSystemExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_SubSystem record);

	int insertSelective(IBDS_SubSystem record);

	List<IBDS_SubSystem> selectByExample(IBDS_SubSystemExample example);

	IBDS_SubSystem selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_SubSystem record,
			@Param("example") IBDS_SubSystemExample example);

	int updateByExample(@Param("record") IBDS_SubSystem record, @Param("example") IBDS_SubSystemExample example);

	int updateByPrimaryKeySelective(IBDS_SubSystem record);

	int updateByPrimaryKey(IBDS_SubSystem record);

	String getMaxCode();

	int insertSelectiveBatch(@Param("list") List<IBDS_SubSystem> list);

	int updateByBatch(@Param("list") List<IBDS_SubSystem> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_SubSystem> selectSubsystembyCodes(@Param("param") Map<String, Object> param);
}