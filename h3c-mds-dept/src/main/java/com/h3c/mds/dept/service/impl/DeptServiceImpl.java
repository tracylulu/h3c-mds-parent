package com.h3c.mds.dept.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IbdsDeptMgnRoleExample;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.entity.IbdsDeptSysPersonRoleExample;
import com.h3c.mds.dept.entity.view_DeptWithLevel;
import com.h3c.mds.dept.entity.ViewDeptWithLevelExample;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.h3c.mds.dept.common.DeptOperationLogUtil;
import com.h3c.mds.dept.dao.DeptDataMapper;
import com.h3c.mds.dept.dao.IBDS_Dept_MgnRoleMapper;
import com.h3c.mds.dept.dao.IBDS_Dept_SysPersonRoleMapper;
import com.h3c.mds.dept.dao.view_DeptWithLevelMapper;
import com.h3c.mds.dept.service.DeptMgnRoleService;
import com.h3c.mds.dept.service.DeptService;
import com.h3c.mds.sysmgr.util.UserUtils;

@Service
public class DeptServiceImpl implements DeptService {
	
	

	@Autowired
	private view_DeptWithLevelMapper deptWithLevelMapper;
	@Autowired
	private DeptMgnRoleService deptMgnRoleService;
	@Autowired
	private DeptDataMapper deptDataMapper;
	@Autowired
	private IBDS_Dept_SysPersonRoleMapper sysPersonRoleMapper;
	
	@Autowired
	private IBDS_Dept_MgnRoleMapper mgnRoleMapper;
	
	@Autowired
	private DeptOperationLogUtil<IBDS_Dept_MgnRole> logUtil;
	
	@Override
	public List<view_DeptWithLevel> getList(Map<String,Object> param){
		return deptWithLevelMapper.getList(param);
	}
	
	@Override
	public view_DeptWithLevel getByCode(String code) {
		ViewDeptWithLevelExample example=new ViewDeptWithLevelExample();
		ViewDeptWithLevelExample.Criteria cia=example.createCriteria();
		cia.andCodeEqualTo(code);
		List<view_DeptWithLevel> lst=deptWithLevelMapper.selectByExample(example);
		if(lst.size()>0) {
			return lst.get(0);
		}
		return null;
	}
	
	@Override
	public List<DeptData> getAll() {	
		List<DeptData> lst=deptDataMapper.getAll();
		return lst;
	}
	
	@Override
	public Boolean checkPower(String deptCode,String userCode) {
		IbdsDeptSysPersonRoleExample example=new IbdsDeptSysPersonRoleExample();
		IbdsDeptSysPersonRoleExample.Criteria cir=example.createCriteria();
		cir.andSapcodeEqualTo(deptCode);
		cir.andPersoncodeEqualTo(userCode);
		List<IBDS_Dept_SysPersonRole> lst=sysPersonRoleMapper.selectByExample(example);
		
		if(lst!=null&&lst.size()>0) {
			return true;
		}
		return false;
	}
	
	@Override
	public List<IBDS_Dept_SysPersonRole> getAllPower(){
		IbdsDeptSysPersonRoleExample example=new IbdsDeptSysPersonRoleExample();
		List<IBDS_Dept_SysPersonRole> lst=sysPersonRoleMapper.selectByExample(example);
		return lst;
	}
	
	@Override
	public List<view_DeptWithLevel> getExportList(Map<String,Object> param){
		return deptWithLevelMapper.getExportList(param);
	}
	
	@Override
	public void edit(IBDS_Dept_MgnRole dept) {
		deptMgnRoleService.eidtMgnRole(dept);
	}
	
	
		//add by chenlulu 
		
		/*public PageInfo<view_DeptWithLevel> pageOfyijiDept(@Param("param")Map<String,Object> param) {
			//int pageNum=Integer.parseInt(String.valueOf(param.get("page")));  
			//int pageSize=Integer.parseInt(String.valueOf(param.get("rows")));  
			com.github.pagehelper.page.PageMethod.startPage(1, 200);
			//PageHelper.startPage(pageNum, pageSize);
			List<view_DeptWithLevel> userList = deptWithLevelMapper.pageOfyijiDept(param);
			//处理sonar检测的问题：Replace the type specification in this constructor call with the diamond operator ("<>").
			PageInfo<view_DeptWithLevel> pageInfo = new PageInfo<>(userList);
			return pageInfo;
		}*/


		@Override
		public List<view_DeptWithLevel> getFirstDeptCodeByCode(String code){
			ViewDeptWithLevelExample example = new ViewDeptWithLevelExample();
			ViewDeptWithLevelExample.Criteria criteria = example.createCriteria();
	        criteria.andCodeEqualTo(code);
	        return deptWithLevelMapper.selectByExample(example);
		}
		
		
		
		@Override
		public List<view_DeptWithLevel> getFirstDeptCodeByFourthDeptCode(String code){
			ViewDeptWithLevelExample example = new ViewDeptWithLevelExample();
			ViewDeptWithLevelExample.Criteria criteria = example.createCriteria();
	        criteria.andFourthcodeEqualTo(code);
	        return deptWithLevelMapper.selectByExample(example);
		}
		
		
		@Override
		public Map<String, Object> getYiJiDeptMgnRoleByCode(Map<String, Object> param) {
			List<Map<String, Object>> list =  mgnRoleMapper.getYiJiDeptMgnRoleByCode(param);
			if(list != null && list.size() == 1){
				return list.get(0);
			}else{
				return null;
			}
		}

	    
	    @Override
	    @Transactional
		public void editYiJiDeptById(IBDS_Dept_MgnRole mgnRole,List<IBDS_Dept_MgnRole> lst){
			
	    	
	    	/*IBDS_Dept_MgnRoleExample example=new IBDS_Dept_MgnRoleExample();
			IBDS_Dept_MgnRoleExample.Criteria cir=example.createCriteria();
			cir.andCodeEqualTo(mgnRole.getCode());
			List<IBDS_Dept_MgnRole> lst=mgnRoleMapper.selectByExample(example);*/
	    	//IBDS_Dept_MgnRole mgnRole=new IBDS_Dept_MgnRole();
	    	String currentUserId = UserUtils.getCurrentUserId();
	    	/*if(lst!=null&&lst.size()>0) {
	    		mgnRole = lst.get(0);
	    	}*/
			//修改
			if(lst!=null&&lst.size()>0) {
				mgnRole.setId(lst.get(0).getId());
				mgnRole.setModifier(currentUserId);
				mgnRole.setModifytime(new Date());
				mgnRole.setDeleteflag("0");
				mgnRoleMapper.updateByPrimaryKeySelective(mgnRole);
				//单元测试不掉这个方法
				if("system".equals(currentUserId)) {
					System.out.println(currentUserId);
				}else {
					logUtil.recordOpearteLog(lst.get(0), mgnRole, mgnRole.getCode());
				}
				
			}else {
				mgnRole.setModifier(currentUserId);
				mgnRole.setModifytime(new Date());
				mgnRole.setCreatetime(new Date());
				mgnRole.setCreator(currentUserId);
				mgnRole.setDeleteflag("0");
				mgnRoleMapper.insertSelective(mgnRole);
				//单元测试不掉这个方法
				if("system".equals(currentUserId)) {
				}else {
					logUtil.recordOpearteLog(null, mgnRole, mgnRole.getCode());
				}
				
			}
		}

	    
	    @Override
		public int deleteRoleByCode(String code,String roleTypeCode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
			criteria.andSapcodeEqualTo(code);
			criteria.andRoletypecodeEqualTo(roleTypeCode);
			int count = sysPersonRoleMapper.deleteByExample(example);
			return count;
		}
	    
	    @Override
		public int deleteRoleByCreatorCode(String code,String roleTypeCode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
			criteria.andCreatorcodeEqualTo(code);
			criteria.andRoletypecodeEqualTo(roleTypeCode);
			int count = sysPersonRoleMapper.deleteByExample(example);
			return count;
		}

		/**
		 * 根据部门编码获取IBDS_Dept_SysPersonRole表中信息
		 */
		@Override
		public PageInfo<Map> pageofUserByCode(Map<String, String> params, int pageNum, int pageSize) {
			com.github.pagehelper.page.PageMethod.startPage(pageNum, pageSize);
			//com.github.pagehelper.page.PageMethod
			//List<IBDS_Dept_SysPersonRole> lst = sysPersonRoleMapper.getUserByDeptCode(params);
			List<Map> lst = sysPersonRoleMapper.getMessageByDeptCode(params);
			PageInfo<Map> pageInfo = new PageInfo<>(lst);
			return pageInfo;
		}

		@Override
		public int deleteUserByPersonCode(String personcode,String deptCode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
			criteria.andPersoncodeEqualTo(personcode);
			criteria.andSapcodeEqualTo(deptCode);
			int count = sysPersonRoleMapper.deleteByExample(example);
			return count;
		}

		@Override
		@Transactional
		public int create(IBDS_Dept_SysPersonRole role) {
			int i = sysPersonRoleMapper.insertSelective(role);
			return i;
		}

		@Override
		public List<view_DeptWithLevel> get4DeptList(Map<String, Object> param) {
			return deptWithLevelMapper.get4DeptList(param);
		}

		@Override
		public List<IBDS_Dept_SysPersonRole> getRoleListByCode(String code) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
	        criteria.andPersoncodeEqualTo(code);
	        return sysPersonRoleMapper.selectByExample(example);
		}
		
		
		@Override
		public List<IBDS_Dept_SysPersonRole> getRoleListByNameAndP01(String code,String roletypecode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
	        criteria.andPersoncodeEqualTo(code);
	        criteria.andRoletypecodeEqualTo(roletypecode);
	        return sysPersonRoleMapper.selectByExample(example);
		}
		
		@Override
		public List<IBDS_Dept_SysPersonRole> getRoleListByroletypecode(String roletypecode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
	        criteria.andRoletypecodeEqualTo(roletypecode);
	        return sysPersonRoleMapper.selectByExample(example);
		}
		
		@Override
		public List<IBDS_Dept_SysPersonRole> getRoleListByNameAndP03(String code,String roletypecode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
	        criteria.andCreatorcodeEqualTo(code);
	        criteria.andRoletypecodeEqualTo(roletypecode);
	        return sysPersonRoleMapper.selectByExample(example);
		}


		/*@Override
		public List<viewDomainGroupMember> selectDeptCode(Map<String, Object> param) {
			return ibdsDeptMapper.selectDeptCode(param);
		}*/

		@Override
		public void uploadMgnRole(List<IBDS_Dept_MgnRole> mgnRole,List<IBDS_Dept_MgnRole> lst) {
			/*IBDS_Dept_MgnRoleExample example=new IBDS_Dept_MgnRoleExample();
			IBDS_Dept_MgnRoleExample.Criteria cir=example.createCriteria();
			cir.andDeleteflagEqualTo("0");
			List<IBDS_Dept_MgnRole> lst=mgnRoleMapper.selectByExample(example);*/
			String currentUserId = UserUtils.getCurrentUserId();
			for(IBDS_Dept_MgnRole dept: mgnRole) {
				Optional<IBDS_Dept_MgnRole> temp=lst.stream().filter(o->o.getCode().equals(dept.getCode())).findFirst();
				
				//修改
				if(temp.isPresent()) {				
					dept.setId(temp.get().getId());
					dept.setModifier(currentUserId);
					dept.setModifytime(new Date());
					dept.setDeleteflag("0");
					mgnRoleMapper.updateByPrimaryKeySelective(dept);
					//单元测试不掉这个方法
					if("system".equals(currentUserId)) {
					}else {
						logUtil.recordOpearteLog(temp.get(), dept, dept.getCode());
					}
				}else {
					dept.setModifier(currentUserId);
					dept.setModifytime(new Date());
					dept.setCreatetime(new Date());
					dept.setCreator(currentUserId);
					dept.setDeleteflag("0");
					mgnRoleMapper.insertSelective(dept);
					//单元测试不掉这个方法
					if("system".equals(currentUserId)) {
					}else {
						logUtil.recordOpearteLog(null, dept, dept.getCode());
					}
				}
			}		
		}

		@Override
		public List<IBDS_Dept_SysPersonRole> getRoleListBysapcodeAndP04(String sapcode,String roletypecode){
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
	        criteria.andSapcodeEqualTo(sapcode);
	        criteria.andRoletypecodeEqualTo(roletypecode);
	        return sysPersonRoleMapper.selectByExample(example);
		}

		@Override
		public List<view_DeptWithLevel> getFirstDeptCodeBy2DeptCode(String code) {
			ViewDeptWithLevelExample example = new ViewDeptWithLevelExample();
			ViewDeptWithLevelExample.Criteria criteria = example.createCriteria();
	        criteria.andSecondcodeEqualTo(code);
	        return deptWithLevelMapper.selectByExample(example);
		}

		@Override
		public List<view_DeptWithLevel> getFirstDeptCodeBy3DeptCode(String code) {
			ViewDeptWithLevelExample example = new ViewDeptWithLevelExample();
			ViewDeptWithLevelExample.Criteria criteria = example.createCriteria();
	        criteria.andThirdcodeEqualTo(code);
	        return deptWithLevelMapper.selectByExample(example);
		}

		@Override
		public List<IBDS_Dept_MgnRole> getMgnRoleListByCode(String code) {
			IbdsDeptMgnRoleExample example = new IbdsDeptMgnRoleExample();
			IbdsDeptMgnRoleExample.Criteria criteria = example.createCriteria();
	        criteria.andCodeEqualTo(code);
	        return mgnRoleMapper.selectByExample(example);
		}

		@Override
		public List<IBDS_Dept_MgnRole> getMgnRoleListByDeleteflag(String deleteflag) {
			IbdsDeptMgnRoleExample example = new IbdsDeptMgnRoleExample();
			IbdsDeptMgnRoleExample.Criteria criteria = example.createCriteria();
			criteria.andDeleteflagEqualTo(deleteflag);
	        return mgnRoleMapper.selectByExample(example);
		}

		@Override
		public List<IBDS_Dept_SysPersonRole> selectRoleListByParam(Map map) {
			return sysPersonRoleMapper.selectRoleListByParam(map);
		}

		@Override
		public List<view_DeptWithLevel> getyijiDeptList(Map<String, Object> param) {
			return deptWithLevelMapper.getyijiDeptList(param);
		}

		@Override
		public List<Map> getMessageByDeptCode(Map<String, String> params) {
			return sysPersonRoleMapper.getMessageByDeptCode(params);
		}

		@Override
		public int deleteWorkPerson(String personcode, String sapCode, String roleTypeCode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
			criteria.andPersoncodeEqualTo(personcode);
			criteria.andSapcodeEqualTo(sapCode);
			criteria.andRoletypecodeEqualTo(roleTypeCode);
			int count = sysPersonRoleMapper.deleteByExample(example);
			return count;
		}

		 @Override
		public int deleteRoleByPersonCode(String personcode,String roleTypeCode) {
			IbdsDeptSysPersonRoleExample example = new IbdsDeptSysPersonRoleExample();
			IbdsDeptSysPersonRoleExample.Criteria criteria = example.createCriteria();
			criteria.andPersoncodeEqualTo(personcode);
			criteria.andRoletypecodeEqualTo(roleTypeCode);
			int count = sysPersonRoleMapper.deleteByExample(example);
			return count;
		}

		@Override
		public List<view_DeptWithLevel> getListByfirstCode(String firstCode) {
			ViewDeptWithLevelExample example=new ViewDeptWithLevelExample();
			ViewDeptWithLevelExample.Criteria cia=example.createCriteria();
			cia.andFirstcodeEqualTo(firstCode);
			List<view_DeptWithLevel> lst=deptWithLevelMapper.selectByExample(example);
			return lst;
		}

		@Override
		public PageInfo<Map> pageofUserByCodeForAdmin(Map<String, String> params, int pageNum, int pageSize) {
			com.github.pagehelper.page.PageMethod.startPage(pageNum, pageSize);
			//com.github.pagehelper.page.PageMethod
			//List<IBDS_Dept_SysPersonRole> lst = sysPersonRoleMapper.getUserByDeptCode(params);
			List<Map> lst = sysPersonRoleMapper.getMessageByDeptCodeForAdmin(params);
			PageInfo<Map> pageInfo = new PageInfo<>(lst);
			return pageInfo;
		}

		@Override
		public List<Map> getMessageByDeptCodeForAdmin(Map<String, String> params) {
			return sysPersonRoleMapper.getMessageByDeptCodeForAdmin(params);
		}
	
}
