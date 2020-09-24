package com.h3c.mds.sysmgr.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.sysmgr.entity.viewUserGroup;
import com.h3c.mds.sysmgr.entity.viewUserGroupExample;

public interface viewUserGroupMapper {
	long countByExample(viewUserGroupExample example);

	int deleteByExample(viewUserGroupExample example);

	int insert(viewUserGroup record);

	int insertSelective(viewUserGroup record);

	List<viewUserGroup> selectByExample(viewUserGroupExample example);

	int updateByExampleSelective(@Param("record") viewUserGroup record, @Param("example") viewUserGroupExample example);

	int updateByExample(@Param("record") viewUserGroup record, @Param("example") viewUserGroupExample example);

	/**
	 * 人员群组联想
	 * 
	 * @param param
	 * @return
	 */
	List<viewUserGroup> selUserGroupViewbyparam(@Param("param") Map<String, String> param);
}