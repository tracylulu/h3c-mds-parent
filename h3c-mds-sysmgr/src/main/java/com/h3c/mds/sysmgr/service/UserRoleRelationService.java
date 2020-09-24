package com.h3c.mds.sysmgr.service;

import java.util.List;
import java.util.Map;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;

public interface UserRoleRelationService {

	/**
	 * 创建一个userRoleRelation
	 * 
	 * @param userRoleRelation
	 * @return
	 */
	int create(UserRoleRelation userRoleRelation);

	/**
	 * 通过用户code获取用户所有的权限
	 * 
	 * @param userCode
	 * @return
	 */
	List<UserRoleRelation> getUserRoleRelListByUserCode(String userCode);

	/**
	 * 查看用户有没有此权限，如果没有就新增
	 * 
	 * @param userCode
	 * @param roles
	 * @return
	 */
	int saveOrUpdateUserRole(String userCode, List<String> roles);

	/**
	 * 根据userCode删除某人所有的权限
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
	int addUserRoleBatch(List<UserRoleRelation> list);
	
	/**
	 * 通过角色code获取说有用户
	 * @param roleCode
	 * @return
	 */
	List<UserRoleRelation> getAdminRelListByAdminRoleCode(String roleCode);
	
	/**
	 * 通过角色code获取所有用户
	 * @param roleCode
	 * @return
	 */
	List<UserRoleRelation> getUserRoleRelListByRoleCode(String roleCode);
	
	/**
	 * 删除用户某个角色
	 * @param param
	 * @return
	 */
	int delUserRole(Map<String,String> param);
}
