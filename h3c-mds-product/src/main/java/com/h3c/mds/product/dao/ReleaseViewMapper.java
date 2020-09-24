package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.entity.ReleaseViewExample;

public interface ReleaseViewMapper {
	long countByExample(ReleaseViewExample example);

	int deleteByExample(ReleaseViewExample example);

	int insert(ReleaseView record);

	int insertSelective(ReleaseView record);

	List<ReleaseView> selectByExample(ReleaseViewExample example);

	int updateByExampleSelective(@Param("record") ReleaseView record, @Param("example") ReleaseViewExample example);

	int updateByExample(@Param("record") ReleaseView record, @Param("example") ReleaseViewExample example);

	@BusinessFilter(type = "treeFilter", strategy = "releaseFilterStrategy")
	List<ReleaseView> getPDT(@Param("param") Map<String, Object> param);// selectByCode

	@BusinessFilter(type = "treeFilter", strategy = "releaseFilterStrategy")
	List<ReleaseView> getRelease(@Param("param") Map<String, Object> param);

	List<ReleaseView> getTreeDataForFlowable(@Param("param") Map<String, Object> param);

	ReleaseView selectByCode(@Param("code") String code);

	List<ReleaseView> getSoftware(@Param("param") Map<String, Object> param);

	ReleaseView selectByID(@Param("code") Integer code);

	List<ReleaseView> getExportList(@Param("param") Map<String, Object> param);
}