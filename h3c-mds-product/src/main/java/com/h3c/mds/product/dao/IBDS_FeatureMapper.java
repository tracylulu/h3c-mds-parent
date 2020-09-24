package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_FeatureExample;

public interface IBDS_FeatureMapper {
	long countByExample(IBDS_FeatureExample example);

	int deleteByExample(IBDS_FeatureExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_Feature record);

	int insertSelective(IBDS_Feature record);

	List<IBDS_Feature> selectByExample(IBDS_FeatureExample example);

	IBDS_Feature selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_Feature record, @Param("example") IBDS_FeatureExample example);

	int updateByExample(@Param("record") IBDS_Feature record, @Param("example") IBDS_FeatureExample example);

	int updateByPrimaryKeySelective(IBDS_Feature record);

	int updateByPrimaryKey(IBDS_Feature record);

	int insertSelectiveBatch(@Param("list") List<IBDS_Feature> list);

	int updateByBatch(@Param("list") List<IBDS_Feature> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_Feature> selectFeaturebyCodes(@Param("param") Map<String, Object> param);
}