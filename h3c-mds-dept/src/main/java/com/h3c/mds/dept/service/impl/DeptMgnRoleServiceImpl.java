package com.h3c.mds.dept.service.impl;

import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IbdsDeptMgnRoleExample;
import com.h3c.mds.dept.service.DeptMgnRoleService;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.CommonsThreadCache;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.dept.common.DeptOperationLogUtil;
import com.h3c.mds.dept.dao.IBDS_Dept_MgnRoleMapper;

@Service
public class DeptMgnRoleServiceImpl implements DeptMgnRoleService {
	@Autowired
	private IBDS_Dept_MgnRoleMapper deptMgnRoleMapper;
	@Autowired
	private DeptOperationLogUtil<IBDS_Dept_MgnRole> logUtil;
	
	@Override
	@Transactional
	public void eidtMgnRole(IBDS_Dept_MgnRole dept) {
		IbdsDeptMgnRoleExample example=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir=example.createCriteria();
		cir.andCodeEqualTo(dept.getCode());
		List<IBDS_Dept_MgnRole> lst=deptMgnRoleMapper.selectByExample(example);
		//CommonsThreadCache.setCurrentOperateType("system");
		//修改
		if(lst!=null&&lst.size()>0) {
			dept.setId(lst.get(0).getId());			
			dept.setModifier(UserUtils.getCurrentUserId());
			dept.setModifytime(new Date());
			dept.setDeleteflag("0");
			deptMgnRoleMapper.updateByPrimaryKeySelective(dept);
			logUtil.recordOpearteLog(lst.get(0), dept, dept.getCode());
		}else {		
			dept.setModifier(UserUtils.getCurrentUserId());
			dept.setModifytime(new Date());
			dept.setCreatetime(new Date());
			dept.setCreator(UserUtils.getCurrentUserId());
			dept.setDeleteflag("0");
			deptMgnRoleMapper.insertSelective(dept);
			
			logUtil.recordOpearteLog(null, dept, dept.getCode());
		}
	}
	
	@Override
	public List<IBDS_Dept_MgnRole> getAll(){
		IbdsDeptMgnRoleExample example=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir=example.createCriteria();
		cir.andDeleteflagEqualTo("0");
		List<IBDS_Dept_MgnRole> lst=deptMgnRoleMapper.selectByExample(example);
		return lst;
	}
	
	@Override
	@Transactional
	public 	void eidtMulti(List<IBDS_Dept_MgnRole> lstDept) {
		IbdsDeptMgnRoleExample example=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir=example.createCriteria();
		cir.andDeleteflagEqualTo("0");
		List<IBDS_Dept_MgnRole> lst=deptMgnRoleMapper.selectByExample(example);
		//CommonsThreadCache.setCurrentOperateType("system");
		
		for(IBDS_Dept_MgnRole dept: lstDept) {
			Optional<IBDS_Dept_MgnRole> temp=lst.stream().filter(o->o.getCode().equals(dept.getCode())).findFirst();
			
			//修改
			if(temp.isPresent()) {				
				dept.setId(temp.get().getId());
				dept.setModifier(UserUtils.getCurrentUserId());
				dept.setModifytime(new Date());
				dept.setDeleteflag("0");
				deptMgnRoleMapper.updateByPrimaryKeySelective(dept);
				logUtil.recordOpearteLog(temp.get(), dept, dept.getCode());
			}else {
				dept.setModifier(UserUtils.getCurrentUserId());
				dept.setModifytime(new Date());
				dept.setCreatetime(new Date());
				dept.setCreator(UserUtils.getCurrentUserId());
				dept.setDeleteflag("0");
				deptMgnRoleMapper.insertSelective(dept);
				logUtil.recordOpearteLog(null, dept, dept.getCode());
			}
		}		
	}
}
