package com.h3c.mds.dept.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.WebApplication;
import com.h3c.mds.dept.dao.IBDS_Dept_MgnRoleMapper;
import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IbdsDeptMgnRoleExample;
import com.h3c.mds.utils.CommonsThreadCache;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WebApplication.class})
@Transactional
public class DeptMgnRoleServiceTest {
	@Autowired
	private  DeptMgnRoleService deptMgnRoleService;
	@Autowired
	private IBDS_Dept_MgnRoleMapper deptMgnRoleMapper;
	
	@Test
	public void testEidtMgnRole() {
		CommonsThreadCache.setCurrentOperateType("system");
		IBDS_Dept_MgnRole mgn=new IBDS_Dept_MgnRole();
		mgn.setCode("123456");
		mgn.setManager("lvxiangnan kf7579");
		deptMgnRoleService.eidtMgnRole(mgn);
		IbdsDeptMgnRoleExample example=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir=example.createCriteria();
		cir.andCodeEqualTo("123456");
		List<IBDS_Dept_MgnRole> lst=deptMgnRoleMapper.selectByExample(example);
		
		Assert.assertNotNull(lst);
	
		IBDS_Dept_MgnRole editMgn=lst.get(0);
		editMgn.setAbbreviation("test-MGN");
		IbdsDeptMgnRoleExample example1=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir1=example1.createCriteria();
		cir1.andCodeEqualTo("123456");
		cir1.andAbbreviationEqualTo("test-MGN");
		List<IBDS_Dept_MgnRole> lstTemp=deptMgnRoleMapper.selectByExample(example1);	
		
		Assert.assertNotNull(lstTemp);
	}
	
	@Test
	public void testGetAll() {
		List<IBDS_Dept_MgnRole> lst=deptMgnRoleService.getAll();
		Assert.assertNotNull(lst);
	}
	
	@Test
	public void testEidtMulti() {
		CommonsThreadCache.setCurrentOperateType("system");
		List<IBDS_Dept_MgnRole> lst=new ArrayList<>();
		List<IBDS_Dept_MgnRole> lstEdit=new ArrayList<>();
		String code="123456";
		for(int i=1;i<3;i++) {
			code=code+String.valueOf(i);
			System.out.print(code);
			IBDS_Dept_MgnRole mgn=new IBDS_Dept_MgnRole();
			mgn.setCode(code);
			mgn.setManager("lvxiangnan kf7579");
			lst.add(mgn);
		}
		deptMgnRoleService.eidtMulti(lst);
		
		IbdsDeptMgnRoleExample example=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir=example.createCriteria();
		cir.andCodeEqualTo("1234561");		
		List<IBDS_Dept_MgnRole> lstTemp=deptMgnRoleMapper.selectByExample(example);	
		
		Assert.assertNotNull(lstTemp);
		
		IBDS_Dept_MgnRole mgn=lstTemp.get(0);
		mgn.setAbbreviation("test-MGN");
		
		lstEdit.add(mgn);
		deptMgnRoleService.eidtMulti(lstEdit);
		
		IbdsDeptMgnRoleExample example1=new IbdsDeptMgnRoleExample();
		IbdsDeptMgnRoleExample.Criteria cir1=example1.createCriteria();
		cir1.andCodeEqualTo("1234561");	
		cir1.andAbbreviationEqualTo("test-MGN");
		List<IBDS_Dept_MgnRole> lstEditTemp=deptMgnRoleMapper.selectByExample(example1);	
		
		Assert.assertNotNull(lstEditTemp);
		
	}

}
