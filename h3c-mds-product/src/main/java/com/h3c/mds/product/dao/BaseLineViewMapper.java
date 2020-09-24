package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.BaseLineViewExample;

public interface BaseLineViewMapper {
	long countByExample(BaseLineViewExample example);

	int deleteByExample(BaseLineViewExample example);

	int insert(BaseLineView record);

	int insertSelective(BaseLineView record);

	List<BaseLineView> selectByExample(BaseLineViewExample example);

	int updateByExampleSelective(@Param("record") BaseLineView record, @Param("example") BaseLineViewExample example);

	int updateByExample(@Param("record") BaseLineView record, @Param("example") BaseLineViewExample example);

	@BusinessFilter(type = "treeFilter",strategy = "baselineFilterStrategy")
	List<BaseLineView> getTreeData(@Param("param") Map<String, String> param);// selectByCode

	@BusinessFilter(type = "treeFilter",strategy = "baselineFilterStrategy")
	List<BaseLineView> getBaseLineTreeData(@Param("param") Map<String, String> param);

	BaseLineView selectByCode(@Param("code") String code);

	BaseLineView selectByID(@Param("code") Integer code);

	String getMaxCode();

	List<BaseLineView> getDataByColunm(@Param("param") Map<String, Object> param);
	
	List<BaseLineView> getBaseLineSowtWare(@Param("param") Map<String, String> param);	
	
	List<BaseLineView> getExportList(@Param("param") Map<String, String> param);

}