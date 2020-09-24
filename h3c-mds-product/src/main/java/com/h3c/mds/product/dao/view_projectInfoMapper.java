package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.view_projectInfo;
import com.h3c.mds.product.entity.view_projectInfoExample;

public interface view_projectInfoMapper {
	long countByExample(view_projectInfoExample example);

	int deleteByExample(view_projectInfoExample example);

	int insert(view_projectInfo record);

	int insertSelective(view_projectInfo record);

	List<view_projectInfo> selectByExample(view_projectInfoExample example);

	int updateByExampleSelective(@Param("record") view_projectInfo record,
			@Param("example") view_projectInfoExample example);

	int updateByExample(@Param("record") view_projectInfo record, @Param("example") view_projectInfoExample example);

	List<view_projectInfo> selectProjectInfo(@Param("param") Map<String, Object> param);
}