package com.h3c.mds.sysmgr.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.entity.UserRoleRelationExample;

public interface UserRoleRelationMapper {
	long countByExample(UserRoleRelationExample example);

	int deleteByExample(UserRoleRelationExample example);

	int deleteByPrimaryKey(Integer hurrId);

	int insert(UserRoleRelation record);

	int insertSelective(UserRoleRelation record);

	List<UserRoleRelation> selectByExample(UserRoleRelationExample example);

	UserRoleRelation selectByPrimaryKey(Integer hurrId);

	int updateByExampleSelective(@Param("record") UserRoleRelation record,
			@Param("example") UserRoleRelationExample example);

	int updateByExample(@Param("record") UserRoleRelation record, @Param("example") UserRoleRelationExample example);

	int updateByPrimaryKeySelective(UserRoleRelation record);

	int updateByPrimaryKey(UserRoleRelation record);

	/**
	 * 根据某人的code删除其所有的角色
	 * 
	 * @param userCode
	 * @return
	 */
	int delUserRoleByUserCode(String userCode);

	/**
	 * 批量授权
	 * 
	 * @param list
	 * @return
	 */
	int addUserRoleBatch(@Param("list") List<UserRoleRelation> list);
	
	/**
	 * 删除用户角色
	 * @param params
	 * @return
	 */
	int delUserRole(@Param("params") Map<String,String> params);
	
	
}