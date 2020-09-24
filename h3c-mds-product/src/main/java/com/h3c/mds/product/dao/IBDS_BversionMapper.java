package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_BversionExample;

public interface IBDS_BversionMapper {
	long countByExample(IBDS_BversionExample example);

	int deleteByExample(IBDS_BversionExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_Bversion record);

	int insertSelective(IBDS_Bversion record);

	List<IBDS_Bversion> selectByExample(IBDS_BversionExample example);

	IBDS_Bversion selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_Bversion record, @Param("example") IBDS_BversionExample example);

	int updateByExample(@Param("record") IBDS_Bversion record, @Param("example") IBDS_BversionExample example);

	int updateByPrimaryKeySelective(IBDS_Bversion record);

	int updateByPrimaryKey(IBDS_Bversion record);

	List<IBDS_Bversion> selectByCodeList(@Param("codeList") List<String> codeList);

	List<IBDS_Bversion> selectByMap(@Param("param") Map<String, String> param);

	int updateByProjectStatusBatch(@Param("param") Map<String, String> param);

	List<IBDS_Bversion> getBversionByReleaseCodeAndBversion(@Param("releaseCode") String releaseCode,
			@Param("bversion") String bversion);
}