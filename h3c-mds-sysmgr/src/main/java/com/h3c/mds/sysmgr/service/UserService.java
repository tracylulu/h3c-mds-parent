package com.h3c.mds.sysmgr.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroupExample;
import com.h3c.mds.sysmgr.entity.EmpDeptView;
import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.VDomainGroup;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMember;
import com.h3c.mds.sysmgr.entity.viewUserGroup;

public interface UserService {

	/**
	 * 获取所有用户
	 * 
	 * @return
	 */
	public List<User> findAll();
	
	public List<User> getAll(); 

	/***
	 * 根据域账号获取用户
	 * 
	 * @param userName
	 * @return
	 */
	public User getUserByAccount(String account);

	/***
	 * 根据域账号获取用户姓名
	 * 
	 * @param userName
	 * @return
	 */
	public String getUserNameByAccount(String account);

	/**
	 * 分页获取用户
	 * 
	 * @param pageNum
	 *            当前页
	 * @param pagsize
	 *            每页条数
	 * @return
	 */
	public PageInfo<User> pageOfUser(User user, int pageNum, int pagsize);

	/**
	 * 创建菜单树
	 * 
	 * @param allResource
	 * @return
	 */
	public List<Resource> buildMenueTree(List<Resource> allResource);

	public void refreshMenue(String account);

	/**
	 * 人员联想
	 * 
	 * @param param
	 * @return
	 */
	public List<EmpDeptView> selUserbyparam(Map<String, String> param);

	/**
	 * 根据编码获取用户信息
	 * 
	 * @param code
	 * @return
	 */
	public User selectByCode(String code);

	/**
	 * 根据拼音+code组合获取用户信息
	 * 
	 * @param pcode
	 * @return
	 */
	public User selectByPCode(String pcode);

	/**
	 * 域群组人员联想
	 * 
	 * @param param
	 * @return
	 */
	public List<viewDomainGroupMember> selDomainGroupMemberByparam(Map<String, String> param);

	/**
	 * 域群组联想
	 * 
	 * @param param
	 * @return
	 */
	public List<VDomainGroup> selDomainGroupByparam(Map<String, String> param);

	/**
	 * 根据姓名+空格+工号 返回当前员工域账号
	 * 
	 * @return
	 */
	public String backDomainAccount(String account);

	String getNameDescByAccount(String account);

	@Transactional(readOnly = true)
	String getNameDescsByAccounts(String accounts);

	/**
	 * 域群组人员
	 * 
	 * @param param
	 * @return
	 */
	public List<ADMP_MemberGroup> selMemberGroupByparam(ADMP_MemberGroupExample example);

	@Transactional
	List<ADMP_MemberGroup> getGroupByAccount(String account);

	/**
	 * 根据角色获取用户
	 * 
	 * @param params
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<User> PageofUserByRoleCode(Map<String, String> params, int pageNum, int pageSize);

	/**
	 * 群组人员联想
	 * 
	 * @param param
	 * @return
	 */
	public List<viewUserGroup> selUserGroupViewbyparam(Map<String, String> param);

	
	//add by chenlulu on 20200326
	long getRoleByCodeAndP04(@Param("params")Map<String,String> params);
		
	
	public List<viewDomainGroupMember> selectDeptCode(String code);
}
