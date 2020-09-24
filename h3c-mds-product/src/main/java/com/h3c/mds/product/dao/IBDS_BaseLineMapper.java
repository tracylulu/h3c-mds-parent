package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_BaseLineExample;

public interface IBDS_BaseLineMapper {
	long countByExample(IBDS_BaseLineExample example);

	int deleteByExample(IBDS_BaseLineExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_BaseLine record);

	int insertSelective(IBDS_BaseLine record);

	List<IBDS_BaseLine> selectByExample(IBDS_BaseLineExample example);

	IBDS_BaseLine selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_BaseLine record, @Param("example") IBDS_BaseLineExample example);

	int updateByExample(@Param("record") IBDS_BaseLine record, @Param("example") IBDS_BaseLineExample example);

	int updateByPrimaryKeySelective(IBDS_BaseLine record);

	int updateByPrimaryKey(IBDS_BaseLine record);

	int insertSelectiveBatch(@Param("list") List<IBDS_BaseLine> list);

	int updateByBatch(@Param("list") List<IBDS_BaseLine> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_BaseLine> selectBaselinebyCodes(@Param("param") Map<String, Object> param);
}