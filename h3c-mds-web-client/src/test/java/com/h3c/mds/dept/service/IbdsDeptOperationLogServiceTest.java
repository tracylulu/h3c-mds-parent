package com.h3c.mds.dept.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.WebApplication;
import com.h3c.mds.dept.dao.IBDS_Dept_OperationLogMapper;
import com.h3c.mds.dept.entity.IBDS_Dept_OperationLog;
import com.h3c.mds.dept.entity.IbdsDeptOperationLogExample;
import com.h3c.mds.dept.entity.view_DeptOperationLog;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WebApplication.class})
@Transactional
public class IbdsDeptOperationLogServiceTest {
	@Autowired
	private IbdsDeptOperationLogService deptLogService;
	@Autowired
	private IBDS_Dept_OperationLogMapper deptLogMapper;
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.print("--------beforeClass--------");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.print("---------afterClass----------");
	}
	
	@Before
	public void testBefore() {
		System.out.print("--------beforeFun--------");
	}
	
	@After
	public void testAfter() {
		System.out.print("--------afterFun--------");
	}
	
//	@Test(timeout = 3000)
//	public void testClassTimeOut() throws InterruptedException{
//		Thread.sleep(2000);
//		 System.out.println("Complete");
//	}
	
	@Test
	public void testSaveLog() {
		IBDS_Dept_OperationLog log=new IBDS_Dept_OperationLog();
		log.setCode("123456");
		log.setOpttype("MODIFY");
		log.setOldvalue("{\"pr\":\"lasdf\"}");
		log.setNewvalue("{\"pr\":\"lasdf\"}");
		log.setOperator("lkf7579");
		log.setOpttime(new Date());
		
		deptLogService.saveLog(log);
		IbdsDeptOperationLogExample example=new IbdsDeptOperationLogExample();
		IbdsDeptOperationLogExample.Criteria cri=example.createCriteria();
		cri.andCodeEqualTo("123456");
		List<IBDS_Dept_OperationLog> lst=deptLogMapper.selectByExample(example);
		Assert.assertEquals(lst.get(0).getCode(),"123456");
	}
	
	@Test
	public void testGetDeptOptLogById() {
		Map<String, Object> param = new HashMap<>();
		param.put("id", 1);
		view_DeptOperationLog lst = deptLogService.getDeptOptLogById(param);
		Assert.assertNotNull(lst);

		Map<String, Object> paramEmpty = new HashMap<>();
		view_DeptOperationLog lstEmpty = deptLogService.getDeptOptLogById(paramEmpty);
		Assert.assertNotNull(lstEmpty.getCode());
	}
	
	@Test
	public void testPageOfDeptOptLog() {
		Map<String,Object> param=new HashMap<>();
		PageInfo<view_DeptOperationLog> pageInfo=deptLogService.pageOfDeptOptLog(1, 10, param);
		Assert.assertNotNull(pageInfo.getList());
	}
}
