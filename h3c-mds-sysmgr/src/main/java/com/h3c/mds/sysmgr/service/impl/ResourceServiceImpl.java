package com.h3c.mds.sysmgr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.constant.SysMgrConstant;
import com.h3c.mds.sysmgr.dao.ResourceMapper;
import com.h3c.mds.sysmgr.entity.IBDS_User_Resource;
import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.entity.ResourceExample;
import com.h3c.mds.sysmgr.entity.ResourceExample.Criteria;
import com.h3c.mds.sysmgr.service.ResourceService;
import com.h3c.mds.sysmgr.service.RoleResourceRelationService;
import com.h3c.mds.sysmgr.dao.IBDS_User_ResourceMapper;
import com.h3c.mds.sysmgr.entity.IBDS_User_Resource;

@Service
public class ResourceServiceImpl implements ResourceService{
	

	@Autowired
	private ResourceMapper resourceMapper;
	@Autowired
	private RoleResourceRelationService relationService;
	@Autowired
	private IBDS_User_ResourceMapper userResourceMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Resource> getResourcesByRoleCode(String roleCode) {
		return resourceMapper.getResourcesByRoleCode(roleCode);
	}

	@Override
	@Transactional
	public int create(Resource resource) {
		String maxCode = getMaxCode();
		resource.setHresCode(maxCode);
		return resourceMapper.insertSelective(resource);
	}
	
	
	@Override
	@Transactional
	public int updateResource(Resource resource){
		return resourceMapper.updateByPrimaryKeySelective(resource);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Resource getResourceByResourceCode(String resourceCode){
		ResourceExample example = new ResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andHresCodeEqualTo(resourceCode);
		List<Resource> list = resourceMapper.selectByExample(example);
		if(list == null || list.size() > 1){
			//错误数据
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	@Transactional(readOnly=true)
	public PageInfo<Resource> findByPage(Integer pageSize, Integer pageNo) {
		if(pageSize == null || pageSize < 0){
			pageSize = 30;
		}
		if(pageNo == null || pageNo < 0){
			pageNo = 1;
		}
		PageHelper.startPage(pageNo, pageSize);
		ResourceExample example = new ResourceExample();
		List<Resource> list = resourceMapper.selectByExample(example);
		PageInfo<Resource> pageInfo = new PageInfo<Resource>(list);
		return pageInfo;
	}

	@Override
	@Transactional(readOnly=true)
	public List<Map<String,Object>> getResourceTree() {
		ResourceExample example = new ResourceExample();
		example.setOrderByClause("HRES_SORT");
		List<Resource> list = resourceMapper.selectByExample(example);
		
		return buildMenueTree(list,null);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Map<String,Object>> getResourceTreeCheckBox(String roleCode) {
		ResourceExample example = new ResourceExample();
		example.setOrderByClause("HRES_SORT");
		List<Resource> list = resourceMapper.selectByExample(example);
		List<String> resourceCode = relationService.getResourceCodesByRoleCode(roleCode);
		return buildMenueTree(list,resourceCode);
	}
	
	
	public List<Map<String, Object>> buildMenueTree(List<Resource> allResource,List<String> resourceCodes) {
		for (Resource resource : allResource) {
			if(!CollectionUtils.isEmpty(resourceCodes) && resourceCodes.contains(resource.getHresCode())){
				resource.setChecked(true);
			}else{
				resource.setChecked(false);
			}
		}
		List<Map<String, Object>> treeMap = new ArrayList<Map<String,Object>>();
		Iterator<Resource> iterator = allResource.iterator();
		while(iterator.hasNext()){
			Resource resource = iterator.next();
			if("root".equals(resource.getHresPcode())){
				
				//iterator.remove();
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", resource.getHresId());
				map.put("code", resource.getHresCode());
				map.put("text",resource.getHresName());
				map.put("checked", resource.getChecked());
				treeMap.add(map);
				appendChild(map,allResource);
			}
		}
		
		return treeMap;
	}

	private void appendChild(Map<String, Object> parent, List<Resource> allResource) {
		Iterator<Resource> iterator = allResource.iterator();
		while(iterator.hasNext()){
			Resource child = iterator.next();
			if(parent.get("code").equals(child.getHresPcode())){
				//iterator.remove();
				if(parent.get("children")==null){
					parent.put("children",new ArrayList<Resource>());
				}
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", child.getHresId());
				map.put("code", child.getHresCode());
				map.put("text",child.getHresName());
				map.put("checked", child.getChecked());
				((List<Map>)parent.get("children")).add(map);
				parent.put("state","closed");
				appendChild(map, allResource);
				
			}
		}
		
	}

	@Override
	public List<Resource> getResourcesByParentCode(String parentCode) {
		return resourceMapper.getResourcesByParentCode(parentCode==null?"":parentCode);
	}

	@Override
	@Transactional
	public Resource getById(Integer id) {
		return resourceMapper.selectByPrimaryKey(id);
	}
	
	@Override
	@Transactional
	public List<Resource> getResourcesByRoleCodeAndType(String roleCode,Integer resourceType){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleCode", roleCode);
		map.put("resourceType", resourceType);
		map.put("flag", SysMgrConstant.RESOURCE_STATUS_ENABLE);
		return resourceMapper.getResourcesByRoleCodeAndMap(map);
	}

	@Override
	@Transactional(readOnly=true)
	public String getMaxCode() {
		String maxCode = resourceMapper.getMaxCode();
		if(maxCode == null){
			maxCode = "R_000000";
		}
		int val = Integer.parseInt(maxCode.substring(2,maxCode.length()))+1;
	    String valStr = String.valueOf(val);
	    String code = "R_";
	    for(int i = 0;i<6-valStr.length();i++){
	        code += "0";
	    }
	    code += valStr;
	    return code;
	}
	
	@Override
	public List<Resource> getResourceByUser(String roleUser,String resUser){
		Map<String,String> param=new HashMap<>();
		param.put("roleUser", roleUser);
		param.put("resUser", resUser);
		return resourceMapper.getResourceByUser(param);
	}
	
	/**
	 * 重新设置首页用户快速入口
	 */
	@Override
	@Transactional
	public void setUserResource(String code) {
		
		//清除当前的
		userResourceMapper.delUserResource((String)SecurityUtils.getSubject().getPrincipal());
		
		for(String item : code.split(",")) {
			IBDS_User_Resource model=new IBDS_User_Resource();
			model.setHrrrHulCode((String)SecurityUtils.getSubject().getPrincipal());
			model.setHrrrHresCode(item);
			
			userResourceMapper.insertSelective(model);
		}
	}
}
