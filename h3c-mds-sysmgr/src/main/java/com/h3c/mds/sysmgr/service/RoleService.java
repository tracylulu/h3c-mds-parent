package com.h3c.mds.sysmgr.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.entity.Role;

public interface RoleService {

	/**
	 * 创建一个role
	 * @param role
	 * @return
	 */
	int create(Role role);
	
	
	/**
	 * 根据用户账户获取拥有的角色
	 */
	List<Role> getRolesByUserAccount(String account);
	
	
	/**
	 * 根据用户账号获取不属于自己的所有权限
	 * @param account
	 * @return
	 */
	List<Role> getRolesExceptSelf(String account);
	/**
	 * 分页查询角色
	 * @return
	 */
	PageInfo<Role> pageOfRole(int pageNum, int pageSize);
	
	/**
	 * 通过roleCode查询对应的role
	 * @param roleCode
	 * @return
	 */
	Role getRoleByRoleCode(String roleCode);
	
	/**
	 * 通过roleCode删除role
	 * @param roleCode
	 * @return
	 */
	int deleteRoleByRoleCode(String roleCode);
	
	
	/**
	 * 更新role
	 * @param role
	 * @return
	 */
	public int updateRole(Role role);
	
	/**
	 * 获取角色编码
	 * @return
	 */
	public String getMaxCode();
	
	/**
	 * 获取所有角色
	 * @return
	 */
	public PageInfo<Role> getAllRoles(int pageNum, int pageSize);
	
	public List<Role> getRoles();
	
	/**
	 * 获取管理员角色
	 * @return
	 */
	public List<Role> getAdmidRoles();
}
