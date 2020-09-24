package com.h3c.mds.dept.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.dept.entity.*;

public interface DeptService {
	
	/**
	 * 获取列表数据
	 * @param param
	 * @return
	 */
	List<view_DeptWithLevel> getList(Map<String,Object> param);
	
	view_DeptWithLevel getByCode(String code);	
	
	List<DeptData> getAll();
	
	/**
	 * 校验部门权限
	 * @param deptCode
	 * @param userCode
	 * @return
	 */
	Boolean checkPower(String deptCode,String userCode);
	
	List<IBDS_Dept_SysPersonRole> getAllPower();
	
	/**
	 * 获取导出数据
	 * @param param
	 * @return
	 */
	List<view_DeptWithLevel> getExportList(Map<String,Object> param);
	
	void edit(IBDS_Dept_MgnRole dept);
	
	
	//add by chenlulu on 20200311
		//-------------------一级部门管理模块----------------------------
		/**
		 * 一级部门列表
		 * @param page
		 * @param rows
		 * @param searchArgs
		 * @return
		 */
		
		//public PageInfo<view_DeptWithLevel> pageOfyijiDept(@Param("param")Map<String,Object> param);
		public List<view_DeptWithLevel> getyijiDeptList(Map<String,Object> param);
		
		//一级部门详细信息编辑页面回显 回显的是MgnRole这个歌表信息，根据部门编码和部门名称查询部门信息
	    public Map<String, Object> getYiJiDeptMgnRoleByCode(@Param("param")Map<String, Object> param);
		
	    
	    //一级部门详细信息编辑页面回显  根据部门编码和部门名称查询部门信息
	    //@Transactional(readOnly = true)
	    
	    /**
		 * 更新一级部门信息列表(更新的是表IBDS_Dept_MgnRole)
		 * @param fProjectCode
		 * @return
		 */
	    //原来的这个方法editYiJiDeptById，现在拆分成2个，方便单元测试，不然之前的怎么都覆盖不了
	    public List<IBDS_Dept_MgnRole> getMgnRoleListByCode(String code);
	    
	    public void editYiJiDeptById(IBDS_Dept_MgnRole mgnRole,List<IBDS_Dept_MgnRole> lst);
	    
	    /**
		 * 通过部门编码和角色名称删除IBDS_Dept_SysPersonRole中原来设置的秘书的记录信息
		 * @param personcode
		 * @return
		 */
		int deleteRoleByCode(String code,String roleTypeCode);
		
		//-------------------一级部门管理模块----------------------------
		List<view_DeptWithLevel> get4DeptList(Map<String,Object> param);
		
		//-------------------部门维护信息管理模块----------------------------
		
		/**
		 * 根据部门编码获取IBDS_Dept_SysPersonRole表中信息
		 * 
		 * @param params
		 * @param pageNum
		 * @param pageSize
		 * @return
		 */
		//方法名不符合lowerCamelCase命名风格
		public PageInfo<Map> pageofUserByCode(Map<String, String> params, int pageNum, int pageSize);
		
		public PageInfo<Map> pageofUserByCodeForAdmin(Map<String, String> params, int pageNum, int pageSize);
		
		/**
		 * 通过personcode删除User
		 * @param personcode
		 * @return
		 */
		int deleteUserByPersonCode(String personcode,String deptCode);
		
		/**
		 * 创建一个role
		 * @param role
		 * @return
		 */
		int create(IBDS_Dept_SysPersonRole role);
		
		public List<IBDS_Dept_SysPersonRole> getRoleListByCode(String code);
		
		
		//List<IBDS_Dept> selectDeptCode(@Param("param") Map<String,Object> param);
		
		public List<view_DeptWithLevel> getFirstDeptCodeByCode(String code);
		
		public List<view_DeptWithLevel> getFirstDeptCodeByFourthDeptCode(String code);
		
		public List<view_DeptWithLevel> getFirstDeptCodeBy2DeptCode(String code);
		
		public List<view_DeptWithLevel> getFirstDeptCodeBy3DeptCode(String code);
		
		public List<IBDS_Dept_SysPersonRole> getRoleListByNameAndP01(String code,String roletypecode);
		
		//原来的这个方法uploadMgnRole，现在拆分成2个，方便单元测试，不然之前的怎么都覆盖不了
	    public List<IBDS_Dept_MgnRole> getMgnRoleListByDeleteflag(String deleteflag);
	    
	    public void uploadMgnRole(List<IBDS_Dept_MgnRole> mgnRole,List<IBDS_Dept_MgnRole> mgnRolelistByDeleteflag);
		
		public List<IBDS_Dept_SysPersonRole> getRoleListByNameAndP03(String code,String roletypecode);
		
		public int deleteRoleByCreatorCode(String code,String roleTypeCode);
		
		public List<IBDS_Dept_SysPersonRole> getRoleListByroletypecode(String roletypecode);
		
		public List<IBDS_Dept_SysPersonRole> getRoleListBysapcodeAndP04(String sapcode,String roletypecode);
		
		
		List<IBDS_Dept_SysPersonRole> selectRoleListByParam(Map map);
		
		List<Map> getMessageByDeptCode(@Param("params")Map<String,String> params);
		
		List<Map> getMessageByDeptCodeForAdmin(@Param("params")Map<String,String> params);
		
		/**
		 * 工作委托删除，通过personcode和角色名称删除IBDS_Dept_SysPersonRole中原来设置的P03的记录信息
		 * @param personcode
		 * @return
		 */
		int deleteWorkPerson(String personcode,String sapCode,String roleTypeCode);

		public int deleteRoleByPersonCode(String personcode,String roleTypeCode);
		
		List<view_DeptWithLevel> getListByfirstCode(String firstCode);
}
