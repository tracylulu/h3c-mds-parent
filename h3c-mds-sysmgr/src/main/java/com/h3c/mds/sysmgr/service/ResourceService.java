package com.h3c.mds.sysmgr.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.entity.Resource;

public interface ResourceService {

	/**
	 * 根据角色编号获取对应资源
	 */
	List<Resource> getResourcesByRoleCode(String roleCode);
	
	int create(Resource resource);
	
	
	int updateResource(Resource resource);
	
	Resource getResourceByResourceCode(String resourceCode);

	PageInfo<Resource> findByPage(Integer pageSize, Integer pageNo);

	List<Map<String, Object>> getResourceTree();

	List<Resource> getResourcesByParentCode(String parentCode);

	Resource getById(Integer id);
	
	String getMaxCode();

	/**
	 * 根据角色编号和资源类型获取资源集合
	 * @param roleCode	角色编码
	 * @param resourceType	资源类型
	 * @return	资源集合
	 */
	List<Resource> getResourcesByRoleCodeAndType(String roleCode,
			Integer resourceType);

	List<Map<String, Object>> getResourceTreeCheckBox(String roleCode);
	
	List<Resource> getResourceByUser(String roleUser,String resUser);
	
	void setUserResource(String code);
}
