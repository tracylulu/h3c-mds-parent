package com.h3c.mds.sysmgr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.dao.RoleMapper;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.RoleExample;
import com.h3c.mds.sysmgr.entity.RoleExample.Criteria;
import com.h3c.mds.sysmgr.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

//	private static String MAX_ROLE_CODE ;

	@Autowired
	private RoleMapper roleMapper;

	@Override
	@Transactional
	public int create(Role role) {

		int i = roleMapper.insertSelective(role);
		return i;
	}

	@Override
	public int deleteRoleByRoleCode(String roleCode) {
		RoleExample example = new RoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andHrlCodeEqualTo(roleCode);
		int count = roleMapper.deleteByExample(example);
		return count;
	}
	@Override
	public PageInfo<Role> pageOfRole(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		RoleExample example = new RoleExample();
		List<Role> roleList = roleMapper.selectByExample(example);
		PageInfo<Role> pageInfo = new PageInfo<Role>(roleList);
		return pageInfo;
	}

	@Override
	@Transactional(readOnly=true)
	public List<Role> getRolesByUserAccount(String account) {
		return roleMapper.getRolesByUserAccount(account);
	}
	
	@Override
	public List<Role> getRolesExceptSelf(String account){
		return roleMapper.getRolesExceptSelf(account);
	}
	
	
	
	@Override
	public Role getRoleByRoleCode(String roleCode) {
		
		RoleExample example = new RoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andHrlCodeEqualTo(roleCode);
		List<Role> roleList = roleMapper.selectByExample(example);
		if(roleList != null && roleList.size() > 1){
			//数据有问题，不可能有大于一个的存在
			return null;
		}else{
			return roleList.get(0);
		}
	}

	@Override
	public int updateRole(Role role) {
		
		return roleMapper.updateByPrimaryKeySelective(role);
	}

	public String getMaxCode() {
		String maxCode = roleMapper.getMaxCode();
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
	
	public PageInfo<Role> getAllRoles(int pageNum, int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Role> roleList = roleMapper.getAllRoles();
		PageInfo<Role> pageInfo = new PageInfo<Role>(roleList);
		return pageInfo;
	}
	
	@Override
	public List<Role> getRoles(){
		return roleMapper.getAllRoles();
	}
	
	@Override
	public List<Role> getAdmidRoles(){
		RoleExample example = new RoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andHrlCodeEqualTo("R_000001");
		return roleMapper.selectByExample(example);
	}
}
