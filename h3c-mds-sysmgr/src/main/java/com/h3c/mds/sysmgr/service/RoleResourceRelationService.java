package com.h3c.mds.sysmgr.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.entity.RoleResourceRelation;

public interface RoleResourceRelationService {

	int create(RoleResourceRelation relation);
	
	int updateRoleResourceRelation(RoleResourceRelation roleResourceRelation);
	
	PageInfo<RoleResourceRelation> pageOfRoleResourceRelation(int pageNum, int pageSize);
	
	int deleteRoleResourceRelationByRoleCode(String roleCode);

	void batchCreate(List<RoleResourceRelation> list);
	
	/**
	 * 根据角色编号获取资源编号
	 * @param roleCode
	 * @return
	 */
	List<String> getResourceCodesByRoleCode(String roleCode);
    
	/**
	 * 根据角色编号删除依赖关系
	 * @param roleCode
	 */
    void deleteByRoleCode(String roleCode);
    
    /**
     * 为角色分配资源
     */
    void distributionResourceForRole(String roleCode,List<RoleResourceRelation> list);
}

