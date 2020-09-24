package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubFeatureExample;

public interface IBDS_SubFeatureMapper {
	long countByExample(IBDS_SubFeatureExample example);

	int deleteByExample(IBDS_SubFeatureExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_SubFeature record);

	int insertSelective(IBDS_SubFeature record);

	List<IBDS_SubFeature> selectByExample(IBDS_SubFeatureExample example);

	IBDS_SubFeature selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_SubFeature record,
			@Param("example") IBDS_SubFeatureExample example);

	int updateByExample(@Param("record") IBDS_SubFeature record, @Param("example") IBDS_SubFeatureExample example);

	int updateByPrimaryKeySelective(IBDS_SubFeature record);

	int updateByPrimaryKey(IBDS_SubFeature record);

	int insertSelectiveBatch(@Param("list") List<IBDS_SubFeature> list);

	int updateByBatch(@Param("list") List<IBDS_SubFeature> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_SubFeature> selectSubfeaturebyCodes(@Param("param") Map<String, Object> param);
}