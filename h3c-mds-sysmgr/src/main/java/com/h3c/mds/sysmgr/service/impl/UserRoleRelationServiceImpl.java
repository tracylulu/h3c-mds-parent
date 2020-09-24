package com.h3c.mds.sysmgr.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.sysmgr.dao.UserRoleRelationMapper;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.entity.UserRoleRelationExample;
import com.h3c.mds.sysmgr.entity.UserRoleRelationExample.Criteria;
import com.h3c.mds.sysmgr.service.RoleService;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;

@Service
public class UserRoleRelationServiceImpl implements UserRoleRelationService {

	@Autowired
	UserRoleRelationMapper userRoleRelationMappermapper;
	
	@Autowired
	private RoleService roleService;

	@Override
	@Transactional
	public int create(UserRoleRelation userRoleRelation) {
		return userRoleRelationMappermapper.insertSelective(userRoleRelation);
	}

	@Override
	public List<UserRoleRelation> getUserRoleRelListByUserCode(String userCode) {
		UserRoleRelationExample example = new UserRoleRelationExample();
		Criteria criteria = example.createCriteria();
		criteria.andHurrHulCodeEqualTo(userCode);
		return userRoleRelationMappermapper.selectByExample(example);
	}

	@Override
	public int saveOrUpdateUserRole(String userCode, List<String> roles) {

		this.delUserRoleByUserCode(userCode);
		int count = 0;
		if (roles != null && roles.size() > 0) {
			for (int i = 0; i < roles.size(); i++) {
				UserRoleRelation userRoleRelation = new UserRoleRelation();
				userRoleRelation.setHurrHrlCode(roles.get(i));
				userRoleRelation.setHurrHulCode(userCode);
				this.create(userRoleRelation);
				count++;
			}
		}
		return count;
	}

	@Override
	public int delUserRoleByUserCode(String userCode) {
		return userRoleRelationMappermapper.delUserRoleByUserCode(userCode);
	}

	/**
	 * 批量授权
	 * 
	 * @param list
	 * @return
	 */
	@Override
	public int addUserRoleBatch(List<UserRoleRelation> list) {
		return userRoleRelationMappermapper.addUserRoleBatch(list);
	}
	
	@Override
	public List<UserRoleRelation> getAdminRelListByAdminRoleCode(String roleCode){
		List<Role> roleList = roleService.getAdmidRoles();
		
		List<UserRoleRelation> adminUsers = new ArrayList<UserRoleRelation>();
		if(CollectionUtils.isNotEmpty(roleList)){
			for(int i = 0; i < roleList.size(); i++){
				List<UserRoleRelation> userRoleList = getUserRoleRelListByRoleCode(roleList.get(i).getHrlCode());
				
				if(CollectionUtils.isNotEmpty(userRoleList)){
					adminUsers.addAll(userRoleList);
				}
				
			}
		}
		return adminUsers;
	}
	@Override
	public List<UserRoleRelation> getUserRoleRelListByRoleCode(String roleCode){
		UserRoleRelationExample example = new UserRoleRelationExample();
		Criteria criteria = example.createCriteria();
		criteria.andHurrHrlCodeEqualTo(roleCode);
		return userRoleRelationMappermapper.selectByExample(example);
	}
	
	@Override
	@Transactional
	public int delUserRole(Map<String,String> param) {
		return  userRoleRelationMappermapper.delUserRole(param);
	}
}
