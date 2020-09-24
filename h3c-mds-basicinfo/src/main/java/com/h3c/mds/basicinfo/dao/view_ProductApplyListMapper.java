package com.h3c.mds.basicinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.basicinfo.entity.view_ProductApplyList;
import com.h3c.mds.basicinfo.entity.view_ProductApplyListExample;

public interface view_ProductApplyListMapper {
	long countByExample(view_ProductApplyListExample example);

	int deleteByExample(view_ProductApplyListExample example);

	int insert(view_ProductApplyList record);

	int insertSelective(view_ProductApplyList record);

	List<view_ProductApplyList> selectByExample(view_ProductApplyListExample example);

	int updateByExampleSelective(@Param("record") view_ProductApplyList record,
			@Param("example") view_ProductApplyListExample example);

	int updateByExample(@Param("record") view_ProductApplyList record,
			@Param("example") view_ProductApplyListExample example);

	List<view_ProductApplyList> getProductApplyList(@Param("param") Map<String, String> param);

	List<view_ProductApplyList> getProductApplyDataGridList(@Param("param") Map<String, Object> param);

}