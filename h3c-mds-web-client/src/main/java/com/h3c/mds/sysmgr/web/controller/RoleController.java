package com.h3c.mds.sysmgr.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.subject.Subject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.entity.EasyUiDatagridRole;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.RoleService;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;
import com.h3c.mds.sysmgr.service.UserService;


@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserRoleRelationService userRoleRelationService;
	
	@Autowired
	private UserService userService;
	/**
	 * 跳转到role列表
	 * @return
	 */
	@RequestMapping("/list")
	public String toRoleList(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "sysmgr/role/list";
	}
	
	
	@RequestMapping(value="/delRole", produces="text/html;charset=utf-8")
	@ResponseBody
	public String delRole(String roleCode){
		int count = roleService.deleteRoleByRoleCode(roleCode);
		return "ok";
	}
	
	
	
	@RequestMapping(value="/addRole", produces="text/html;charset=utf-8")
	@ResponseBody
	public String addRole(Role role){	
		String roleCode = roleService.getMaxCode();
		Subject subject = SecurityUtils.getSubject();
		String user = (String)subject.getSession().getAttribute("UserIdentity");
		role.setHrlCreateUser(user);
		role.setHrlCode(roleCode);
		role.setHrlCreateDate(new Date());
		roleService.create(role);
		return "ok";
	}
	
	@RequestMapping("/getRoleByRoleCode")
	@ResponseBody
	public String getRoleByRoleCode(String roleCode){
		Role role = roleService.getRoleByRoleCode(roleCode);
		JSONObject json = new JSONObject();
		json.put("hrlName", role.getHrlName());
		json.put("remark", role.getRemark());
		json.put("roleCode", roleCode);
		json.put("status", "ok");
		return json.toString();
	}
	
	
	@RequestMapping("/pageOfRole")
	@ResponseBody
	public String pageOfRole(Integer page, Integer rows){
		
		
		PageInfo<Role> pageInfo = roleService.pageOfRole(page, rows);
		
		JSONObject json =  new JSONObject();
		
		json.put("total", pageInfo.getTotal());
		json.put("rows", pageInfo.getList());
		
		return json.toString();
	}
	
	
	
	@RequestMapping(value="/updateRole", produces="text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult updateRole(String roleCode, String hrlName, String remark){
		
		try {
			Role role = roleService.getRoleByRoleCode(roleCode);
			role.setHrlName(hrlName);
			role.setRemark(remark);
			Subject subject = SecurityUtils.getSubject();
			String user = (String)subject.getSession().getAttribute("UserIdentity");
			role.setHrlModifyUser(user);
			role.setHrlModifyDate(new Date());
			roleService.updateRole(role);
		} catch (InvalidSessionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseResult.success("error");
		}
		return ResponseResult.success("ok");
	}
	
	
	
	/**
	 * 获取个人所有已经分配的角色和未分配的角色
	 * @param code
	 * @return
	 *//*
	@RequestMapping("/getAllRoleByUserCode")
	@ResponseBody
	public String getAllRoleByUserCode(String code){
		//获取所有不属于自己的角色，
		List<Role> notSelfRoleList = roleService.getRolesExceptSelf(code);//l12328
		//获取自己的角色
		List<Role> selfRoleList = roleService.getRolesByUserAccount(code);//l12328
		List<RoleEasyUi> resEasyUiRoleList = new ArrayList<RoleEasyUi>();
		
		
		List<RoleEasyUi> selfUIRoleList =  buildRoleEasyUi(selfRoleList, true);
			
		List<RoleEasyUi> notSelfUIRoleList =  buildRoleEasyUi(notSelfRoleList, false);		
		
		if(selfUIRoleList != null && selfUIRoleList.size() > 0){
			resEasyUiRoleList.addAll(selfUIRoleList);
		}
		
		if(notSelfUIRoleList != null && notSelfUIRoleList.size() > 0){
			resEasyUiRoleList.addAll(notSelfUIRoleList);
		}
		
		JSONObject res = new JSONObject();
		res.put("rows", resEasyUiRoleList);
		res.put("total", resEasyUiRoleList.size());
		return res.toString();
	}*/
	/**
	 * 获取个人所有已经分配的角色和未分配的角色
	 * @param code
	 * @return
	 */
	@RequestMapping("/getAllRoleByUserCode")
	@ResponseBody
	public String getAllRoleByUserCode(HttpServletRequest request, String code, Integer pageNum, Integer pageSize){
		
		
		if(pageNum == null || pageSize == null){
			pageNum = 1;
			pageSize = 40;
		}
		//获取所有角色
		PageInfo<Role> pageInfo = roleService.getAllRoles(pageNum, pageSize);
		List<Role> roleList = roleService.getRolesByUserAccount(code);
		List<EasyUiDatagridRole> resRoleList = new ArrayList<EasyUiDatagridRole>();
		if(CollectionUtils.isNotEmpty(pageInfo.getList())){
			for(int i = 0; i < pageInfo.getList().size(); i++){
				EasyUiDatagridRole tmpEasyUiDatagridRole = new EasyUiDatagridRole();
				try {
					BeanUtils.copyProperties(tmpEasyUiDatagridRole, pageInfo.getList().get(i));
					if(CollectionUtils.isNotEmpty(roleList)){
						for(int j = 0; j < roleList.size(); j++){
							if(tmpEasyUiDatagridRole.getHrlCode().equals(roleList.get(j).getHrlCode())){
								tmpEasyUiDatagridRole.setChecked(true);
							}
						}						
					}
				} catch (IllegalAccessException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				resRoleList.add(tmpEasyUiDatagridRole);
			}
		}
		JSONObject res = new JSONObject();
		res.put("selfRoles", roleList);
		res.put("rows", resRoleList);
		res.put("total", pageInfo.getTotal());
		return res.toString();
	}
	/*private List<RoleEasyUi> buildRoleEasyUi(List<Role> roleList, boolean check){
		List<RoleEasyUi> resEasyUiRoleList = new ArrayList<RoleEasyUi>();
		try {
			if(roleList != null &&  roleList.size() > 0){
				for(int i = 0; i < roleList.size(); i++){
					RoleEasyUi roleEasyUi = new RoleEasyUi();
					BeanUtils.copyProperties(roleEasyUi, roleList.get(i));
					roleEasyUi.setCheckbox(check);
					resEasyUiRoleList.add(roleEasyUi);
				}
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resEasyUiRoleList;
	}*/
	
	/**
	 * 保存和更新用户与自己对应的角色
	 * @param userCode 用户code
	 * @param roles  用户拥有的角色   多个用','隔开
	 * @return
	 */
	@RequestMapping(value="/saveOrUpdateUserRole", produces="text/html;charset=utf-8")
	@ResponseBody
//	public String saveOrUpdateUserRole(@PathVariable(name = "userCode") String userCode, String roles){
	public String saveOrUpdateUserRole(String userCode, String roles){
//		roles = "mm,nn,qq,a";
//		userCode = "l20095";
		String res ;
		String[] roleArr = null;
		
		try {
			if(StringUtils.isNotBlank(roles)){
				roleArr = roles.split(",");
				userRoleRelationService.saveOrUpdateUserRole(userCode, Arrays.asList(roleArr));
			}else{
				userRoleRelationService.delUserRoleByUserCode(userCode);
			}
			res = "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			res = "保存失败";
		}
		// TODO  测试使用
		Subject subject = SecurityUtils.getSubject();
		String user = (String)subject.getSession().getAttribute("UserIdentity");
//		userService.refreshMenue(user);
		return res;
	}
	
	@RequestMapping(value="/getAllRole")
	@ResponseBody
	public List<Role> getAllRole(){
		return roleService.getRoles();
	}
	
	@RequestMapping(value="/addUserRole")
	@ResponseBody
	public ResponseResult addUserRole(String roleCode,String users) {
		try {
			List<UserRoleRelation> lst=new ArrayList();
			List<UserRoleRelation> lstRelation=userRoleRelationService.getUserRoleRelListByRoleCode(roleCode);
			List<User> lstUser=userService.findAll();
			String[] arr_User=users.split(",");
			for(String item:arr_User) {
				Optional<User> temp=lstUser.stream().filter(o->item.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
				if(temp.isPresent()) {
					User user=temp.get();
					//已拥有此角色的人员不添加 
					Optional<UserRoleRelation> tempRelation=lstRelation.stream().filter(o->user.getUda10511().equals(o.getHurrHulCode())).findFirst();
					if(!tempRelation.isPresent()) {
						UserRoleRelation relation=new UserRoleRelation();
						relation.setHurrHrlCode(roleCode);
						relation.setHurrHulCode(user.getUda10511());
						lst.add(relation);
					}					
				}
			}
			if(lst!=null&&lst.size()>0)
				userRoleRelationService.addUserRoleBatch(lst);
			return ResponseResult.success();
		}catch(Exception e) {
			return ResponseResult.fail(e.getMessage());
		}
		
	}

	/**
	 * 删除人员单个权限
	 * @param roleCode
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/delUserRole")
	@ResponseBody
	public ResponseResult delUserRole(String roleCode,String domainCode) {
		try {
			Map<String,String> param=new HashMap<>();
			param.put("userCode", domainCode);
			param.put("roleCode", roleCode);
			userRoleRelationService.delUserRole(param);
			return ResponseResult.success();
		}catch(Exception e) {
			return ResponseResult.fail(e.getMessage());
		}		
	}
}
