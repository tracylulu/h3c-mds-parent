package com.h3c.mds.sysmgr.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.constant.SysMgrConstant;
import com.h3c.mds.sysmgr.dao.ADMP_MemberGroupMapper;
import com.h3c.mds.sysmgr.dao.EmpDeptViewMapper;
import com.h3c.mds.sysmgr.dao.UserMapper;
import com.h3c.mds.sysmgr.dao.VDomainGroupMapper;
import com.h3c.mds.sysmgr.dao.viewDomainGroupMemberMapper;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroupExample;
import com.h3c.mds.sysmgr.entity.EmpDeptView;
import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.UserExample;
import com.h3c.mds.sysmgr.entity.UserExample.Criteria;
import com.h3c.mds.sysmgr.entity.VDomainGroup;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMember;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMemberExample;
import com.h3c.mds.sysmgr.entity.viewUserGroup;
import com.h3c.mds.sysmgr.service.ResourceService;
import com.h3c.mds.sysmgr.service.RoleService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.redis.RedisUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleService roleService;
	@Autowired
	private ResourceService resourceService;

	@Autowired
	private EmpDeptViewMapper empMapper;

	@Autowired
	private VDomainGroupMapper domainGroupMapper;

	@Autowired
	private viewDomainGroupMemberMapper domainMemberMapper;

	@Autowired
	private ADMP_MemberGroupMapper memberGroupMapper;

	@Autowired
	private com.h3c.mds.sysmgr.dao.viewUserGroupMapper viewUserGroupMapper;

	@Autowired
	private RedisUtil redisUtil;
	
	//@Autowired
	//private DeptService deptService;

	@Override
	@Transactional(readOnly = true,propagation=Propagation.REQUIRES_NEW)
	public List<User> findAll() {
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
	
	public List<User> getAll() {
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example);
		return list;
	}

	@Override
	@Transactional(readOnly = true,propagation=Propagation.REQUIRES_NEW)
	public User getUserByAccount(String account) {
		return userMapper.selectByAccount(account);
	}

	@Override
	public String getUserNameByAccount(String account) {
		User user = userMapper.selectByAccount(account);
		String name = "noName";
		if (user != null) {
			name = user.getName();
		}
		return name;
	}

	public PageInfo<User> pageOfUser(User user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		/*
		 * if(StringUtils.isNotBlank(user.getCode())){
		 * criteria.andCodeLike(user.getCode()); }
		 */
		if (StringUtils.isNotBlank(user.getName())) {
			criteria.andNameLike(user.getName());

		}
		// List<User> userList = userMapper.selectByExample(example);
		// TODO 这里name属性传不进去，后面解决
		List<User> userList = userMapper.pageOfUser(user);
		PageInfo<User> pageInfo = new PageInfo<User>(userList);
		return pageInfo;
	}

	@Override
	public List<Resource> buildMenueTree(List<Resource> allResource) {
		Collections.sort(allResource, new Comparator<Resource>() {

			@Override
			public int compare(Resource o1, Resource o2) {
				if ((o1.getHresSort() == null ? 0 : o1.getHresSort()) > (o2.getHresSort() == null ? 0
						: o2.getHresSort())) {
					return 1;
				} else if ((o1.getHresSort() == null ? 0 : o1.getHresSort()) < (o2.getHresSort() == null ? 0
						: o2.getHresSort())) {
					return -1;
				}
				return 0;
			}
		});
		List<Resource> tree = new ArrayList<Resource>();
		Iterator<Resource> iterator = allResource.iterator();
		while (iterator.hasNext()) {
			Resource resource = iterator.next();
			if ("root".equals(resource.getHresPcode())) {
				// iterator.remove();
				tree.add(resource);
				appendChild(resource, allResource);
			}
		}

		return tree;
	}

	private void appendChild(Resource parent, List<Resource> allResource) {
		Iterator<Resource> iterator = allResource.iterator();
		while (iterator.hasNext()) {
			Resource child = iterator.next();
			if (parent.getHresCode().equals(child.getHresPcode())) {
				// iterator.remove();
				if (parent.getChilds() == null) {
					parent.setChilds(new ArrayList<Resource>());
				}
				parent.getChilds().add(child);
				appendChild(child, allResource);

			}
		}

	}

	@Override
	@Transactional(readOnly = true)
	public void refreshMenue(String account) {
		List<Role> roles = roleService.getRolesByUserAccount(account);
		List<Resource> allResource = new ArrayList<Resource>();
		StringBuilder roleCode = new StringBuilder();
		
		//add start by chenlulu on 20200320
		//先在分配资源的时候，让普通用户等都可以看部门信息维护员管理这个菜单，后续查询是不是一级部门秘书，是的话不排除，不是的话排除掉这个菜单的加载
		//if (!allResource.contains(resource && !(resource.getHresName().equals("部门信息维护员管理"))))
		Map<String,String> params=new HashMap<>();
		Subject subject1 = SecurityUtils.getSubject();
		User user = (User) subject1.getSession().getAttribute("current_user");
		//根据当前登录人的code和P01这个角色，查询在用户角色表中是有存在该用户，也就是判断是不是一级部门秘书的角色
		params.put("code", user.getCode());
		params.put("roleTypeCode", "P01");
		long roleByCodeAndP04 = userMapper.getRoleByCodeAndP04(params);
    	//List<IBDS_Dept_SysPersonRole> list=deptService.getRoleListByNameAndP01(user.getCode(),"P01");
    	//是的话，默认维护员管理页面菜单加载，否则不加载
    	//if(list!=null&&list.size()>0) {
		//modify by chenlulu on 20200513
		//确认是不是管理员，是的话可以展示维护员管理页面
		Boolean checkIsAdmin = false;
		for (int i = 0; i < roles.size(); i++) {
			if(roles.get(i).getHrlCode().contains("R_000001")) {
				checkIsAdmin=true;
				break;
			}
		}
    	if(roleByCodeAndP04>0 || checkIsAdmin) {
    		for (Role role : roles) {
    			roleCode.append(role.getHrlCode());
    			// 添加角色
    			List<Resource> resources = resourceService.getResourcesByRoleCodeAndType(role.getHrlCode(),
    					SysMgrConstant.RESOURCE_TYPE_MENUE);
    			for (Resource resource : resources) {
    				// 添加权限
    				if (!allResource.contains(resource)) {
    					allResource.add(resource);
    				}
    			}
    		}
    	}else {
    		for (Role role : roles) {
    			roleCode.append(role.getHrlCode());
    			// 添加角色
    			List<Resource> resources = resourceService.getResourcesByRoleCodeAndType(role.getHrlCode(),
    					SysMgrConstant.RESOURCE_TYPE_MENUE);
    			for (Resource resource : resources) {
    				// 添加权限
    				if (!allResource.contains(resource) && !(resource.getHresName().equals("部门信息维护员管理"))) {
    					allResource.add(resource);
    				}
    			}
    		}
    	}
    	//add end by chenlulu on 20200320
    	
    	
    	//原来的注释掉
		// 添加角色和权限
		/*for (Role role : roles) {
			roleCode.append(role.getHrlCode());
			// 添加角色
			List<Resource> resources = resourceService.getResourcesByRoleCodeAndType(role.getHrlCode(),
					SysMgrConstant.RESOURCE_TYPE_MENUE);
			for (Resource resource : resources) {
				// 添加权限
				if (!allResource.contains(resource)) {
					allResource.add(resource);
				}
			}
		}*/
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().setAttribute("resources", allResource);
		subject.getSession().setAttribute("roles", roles);
		subject.getSession().setAttribute("roleCode", roleCode.toString());
		List<Resource> buildMenueTree = buildMenueTree(allResource);
		subject.getSession().setAttribute("menue", buildMenueTree);

	}

	/**
	 * 人员联想
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public List<EmpDeptView> selUserbyparam(Map<String, String> param) {
		List<EmpDeptView> list = empMapper.selUserViewbyparam(param);
		return list;
	}

	/**
	 * 根据编码获取用户
	 */
	@Override
	@Transactional(readOnly = true)
	public User selectByCode(String code) {
		return userMapper.selectByCode(code);
	}

	/**
	 * 根据拼音+code组合获取用户信息
	 * 
	 * @param pcode
	 * @return
	 */
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public User selectByPCode(String pcode) {
		return userMapper.selectByPCode(pcode);
	}

	/**
	 * 域群组人员联想
	 * 
	 * @param param
	 * @return
	 */
	public List<viewDomainGroupMember> selDomainGroupMemberByparam(Map<String, String> param) {
		List<viewDomainGroupMember> list = domainMemberMapper.selUserViewbyparam(param);
		return list;
	}

	/**
	 * 域群组联想
	 * 
	 * @param param
	 * @return
	 */
	public List<VDomainGroup> selDomainGroupByparam(Map<String, String> param) {
		List<VDomainGroup> list = domainGroupMapper.selUserViewbyparam(param);
		return list;
	}

	/**
	 * 根据姓名+空格+工号 返回当前员工域账号
	 * 
	 * @return
	 */
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public String backDomainAccount(String account) {
		if(StringUtils.isNotBlank(account)){
			String a = (String) redisUtil.hget("USER_ACCOUNT_DESC",account);
			if(StringUtils.isBlank(a)){
				User user = userMapper.selectByPCode(account);
				if (user == null) {
					return "";
				}else{
					redisUtil.hset("USER_ACCOUNT_DESC", account, user.getUda10511());
					return user.getUda10511();
				}
			}
			return a;
		}else{
			return "";
		}
		
	}

	@Override
	@Transactional(readOnly = true)
	public String getNameDescByAccount(String account) {
		if (StringUtils.isNotBlank(account)) {
			Object userAccount = redisUtil.hget("USER_ACCOUNT", account);
			if (StringUtils.isBlank((String) userAccount)) {
				User user = getUserByAccount(account);
				if (user == null) {
					return account;
				}
				redisUtil.hset("USER_ACCOUNT", account, user.getUda10509() + " " + user.getUda10512());
				return user.getUda10509() + " " + user.getUda10512();
			} else {
				return (String) userAccount;
			}
		}
		return account;

	}

	@Override
	@Transactional(readOnly = true)
	public String getNameDescsByAccounts(String accounts) {
		if (StringUtils.isNotBlank(accounts)) {
			String[] split = accounts.split(",");
			for (int i = 0; i < split.length; i++) {
				String nameDescByAccount = getNameDescByAccount(split[i]);
				split[i] = nameDescByAccount;
			}
			return StringUtils.join(split, ",");
		}
		return accounts;
	}

	/**
	 * 域群组人员
	 * 
	 * @param
	 * @return
	 */
	public List<ADMP_MemberGroup> selMemberGroupByparam(ADMP_MemberGroupExample example) {
		List<ADMP_MemberGroup> list = memberGroupMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<ADMP_MemberGroup> getGroupByAccount(String account) {
		ADMP_MemberGroupExample example = new ADMP_MemberGroupExample();
		ADMP_MemberGroupExample.Criteria criteria = example.createCriteria();
		criteria.andUsercodeEqualTo(account);
		return memberGroupMapper.selectByExample(example);
	}

	/**
	 * 根据角色获取用户
	 */
	@Override
	public PageInfo<User> PageofUserByRoleCode(Map<String, String> params, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);

		List<User> lst = userMapper.getUserByRoleCode(params);
		PageInfo<User> pageInfo = new PageInfo<User>(lst);
		return pageInfo;
	}

	/**
	 * 群组人员联想
	 * 
	 * @param param
	 * @return
	 */
	public List<viewUserGroup> selUserGroupViewbyparam(Map<String, String> param) {
		return viewUserGroupMapper.selUserGroupViewbyparam(param);
	}

	@Override
	public long getRoleByCodeAndP04(Map<String, String> params) {
		return userMapper.getRoleByCodeAndP04(params);
	}

	@Override
	public List<viewDomainGroupMember> selectDeptCode(String code) {
		viewDomainGroupMemberExample example = new viewDomainGroupMemberExample();
		viewDomainGroupMemberExample.Criteria criteria = example.createCriteria();
		criteria.andCodeEqualTo(code);
		return domainMemberMapper.selectByExample(example);
	}

}
