package com.h3c.mds.dept.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.WebApplication;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.service.DeptDataService;

/**
 * @author c17740
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={WebApplication.class})
@Transactional
public class DeptDataServiceTest {

//	/**
//	 * @throws java.lang.Exception
//	 */
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//	}
	
	@Autowired
	private DeptDataService deptDataService;

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#insertDeptDataTemp(java.util.List)}.
	 */
	@Test
	public void testInsertDeptDataTemp() {
		List<Map> dataDeptList=new ArrayList<>();
		Map<String, String> deptDataMap = new HashMap<>();
		deptDataMap.put("deptCode", "12345678");
		deptDataMap.put("deptName", "虚拟测试部");
		deptDataMap.put("coa", "320000");
		deptDataMap.put("deptLevel", "1");
		deptDataMap.put("supDeptCode", "50040000");
		deptDataMap.put("deptType", "管理");
		dataDeptList.add(deptDataMap);
		int result=deptDataService.insertDeptDataTemp(dataDeptList);
//		List<DeptData>resultList=deptDataService.selectDeptDataByParam(deptDataMap);
		assertEquals(1,result);
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#insertDeptData()}.
	 */
	@Test
	public void testInsertDeptData() {
		deptDataService.deleteDeptData();
		int result=deptDataService.insertDeptData();
		List<DeptData> exceptList=deptDataService.selectDeptData();
		int except=exceptList.size();
		assertEquals(except,result);
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#deleteDeptDataTemp()}.
	 */
	@Test
	public void testDeleteDeptDataTemp() {
		List<DeptData> l=deptDataService.selectDeptDataTemp();
		int except=l.size();
		int result=deptDataService.deleteDeptDataTemp();
		assertEquals(except,result,0);
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#deleteDeptData()}.
	 */
	@Test
	public void testDeleteDeptData() {
		List<DeptData> l=deptDataService.selectDeptData();
		int except=l.size();
		int result=deptDataService.deleteDeptData();
		assertEquals(except,result,0);
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#renewDeptDataTemp(java.util.List)}.
	 */
	@Test
	public void testRenewDeptDataTemp() {
		List<Map> deptDataList = new ArrayList<>();
		Map<String,String> param =new HashMap<>();
		param.put("deptName", "新华三");
		param.put("deptLevel", "0");
		param.put("coa", null);
		param.put("supDeptCode", "50000001");
		param.put("deptType", null);
		param.put("deptCode", "50040000");
		deptDataList.add(param);
		deptDataService.renewDeptDataTemp(deptDataList);
		List<DeptData> resultList=deptDataService.selectDeptDataTemp();
		String result=resultList.get(0).getDeptCode();
		String except=param.get("deptCode");
		assertTrue(result.equals(except));
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#renewDeptData()}.
	 */
	@Test
	public void testRenewDeptData() {
		int result=deptDataService.renewDeptData();
		assertEquals(1,result);
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#insertDeptMgn()}.
	 */
	@Test
	public void testInsertDeptMgn() {
		int result=deptDataService.insertDeptMgn();
		assertTrue(result>=0);
	}

	/**
	 * Test method for {@link com.h3c.mds.dept.service.DeptDataService#selectDeptDataByParam(java.util.Map)}.
	 */
	@Test
	public void testSelectDeptDataByParam() {
		Map<String,String> param =new HashMap<>();
		param.put("deptName", "新华三");
		param.put("deptLevel", "0");
		param.put("coa", null);
		param.put("supDeptCode", "50000001");
		param.put("deptType", null);
		param.put("deptCode", "50040000");
		List<DeptData> resultList=deptDataService.selectDeptDataByParam(param);
		assertTrue(resultList.size()>=0);
	}

}
