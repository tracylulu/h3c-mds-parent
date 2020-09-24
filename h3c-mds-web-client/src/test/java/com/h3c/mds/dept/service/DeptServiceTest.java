package com.h3c.mds.dept.service;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.shiro.SecurityUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.WebApplication;
import com.h3c.mds.dept.dao.IBDS_Dept_MgnRoleMapper;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IbdsDeptMgnRoleExample;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.entity.view_DeptWithLevel;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.CommonsThreadCache;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={WebApplication.class})
//@ContextConfiguration
@Transactional
//@Rollback(false)
//springboot中使用junit编写单元测试，@Transactional默认是事物回滚的，这样测试的脏数据不影响数据库。具体看控制台输出也能看来
//为了验证测试方法是否正确应该关闭自动事物回滚，使用@Rollback(false)关闭回滚
public class DeptServiceTest {

	@Autowired
	private DeptService deptService;
		
	@Autowired
	private IBDS_Dept_MgnRoleMapper mgnRoleMapper;
	
	@Autowired
	private DeptMgnRoleService deptMgnRoleService;
	
	@Autowired
	private CoaMailService coaMailService;
	
	//必须静态方法
    @BeforeClass
    public static void testBeforeClass(){
        //可以进行一些初始化的操作，比如加载数据库，加载配置文件 等等
        System.out.println("-------------------beforeClass-----------------------");
    }
    //必须静态方法
    @AfterClass
    public static void testAfterClass(){
        System.out.println("----------------------afterClass-----------------------");
    }
    @Before
    public void testBefore(){
        System.out.println("-----------------------before---------------------------");
    }
    @After
    public void testAfter(){
        System.out.println("-----------------------after-------------------------------");
    }
    
    @Test(timeout = 3000)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(2);
        System.out.println("Complete");
    }
	
    
    @Test
	public void testGetList() {
    	Map<String,Object> param=new HashMap<>();
		param.put("id", "50040623");
		param.put("level", "2");
		param.put("searchParam", "");
		param.put("isEnd", "1");
		List<view_DeptWithLevel> lst=deptService.getList(param);
		System.out.println("信息技术部下面的二级部门数目为："+lst.size());
	}

	@Test
	public void testGetByCode() {
		view_DeptWithLevel view_DeptWithLevel=deptService.getByCode("50040623");
		System.out.println(view_DeptWithLevel.toString());
		view_DeptWithLevel view_DeptWithLevel1=deptService.getByCode("1232313");
	}

	@Test
	public void testGetAll() {
		List<DeptData> lstDept=deptService.getAll();
		Assert.assertNotNull(lstDept);
	}

	@Test
	public void testCheckPower() {
		IBDS_Dept_SysPersonRole role=buildRole();
		Boolean checkPowerTrue = deptService.checkPower(role.getSapcode(), role.getPersoncode());
		System.out.println(checkPowerTrue);
		
		String deptCode1="50040623";
		String userCode1="11111";
		Boolean checkPowerFalse = deptService.checkPower(deptCode1, userCode1);
		System.out.println(checkPowerFalse);
	}

	@Test
	public void testGetAllPower() {
		List<IBDS_Dept_SysPersonRole> allPower = deptService.getAllPower();
		for (int i = 0; i < allPower.size(); i++) {
			System.out.println(allPower.get(i));
		}
	}

	@Test
	public void testGetExportList() {
		Map<String, Object> param = new HashMap<>();
		param.put("level", 1);
		param.put("searchParam", "");
		List<view_DeptWithLevel> exportList = deptService.getExportList(param);
		for (int i = 0; i < exportList.size(); i++) {
			System.out.println(exportList.get(i));
		}
		
	}

	@Test
	public void testEdit() {
		
	}
	

	@Test
	public void testGetyijiDeptList() {
		//获得某个一级部门列表
		Map<String,Object> param=new HashMap<>();
		param.put("id", "50040623");
		param.put("level", "1");
		param.put("searchParam", "");
		List<view_DeptWithLevel> lst=deptService.getyijiDeptList(param);
		System.out.println("一级部门数目为："+lst.size());
		
	}


	@Test
	public void testGetYiJiDeptMgnRoleByCode() {
		Map<String, Object> param = new HashMap<>();
    	param.put("code", "50040623");
    	Map<String, Object> map = deptService.getYiJiDeptMgnRoleByCode(param);
    	System.out.println(map);
    	
		for(Entry<String, Object> a:map.entrySet()){
		  System.out.println("键是"+a.getKey());
		  System.out.println("值是"+a.getValue());
		}
		
		Map<String, Object> param1 = new HashMap<>();
    	param1.put("code", "12345678");
    	Map<String, Object> map1 = deptService.getYiJiDeptMgnRoleByCode(param1);
    	System.out.println(map1);
	}

	
	@Test
	public void testGetMgnRoleListByCode() {
		
		IBDS_Dept_MgnRole mgnRole=buildmgnRole();
		List<IBDS_Dept_MgnRole> list = deptService.getMgnRoleListByCode(mgnRole.getCode());
		System.out.println(list.size());
	}
	
	@Test
	public void testEditYiJiDeptById() {
		CommonsThreadCache.setCurrentOperateType("system");
		IBDS_Dept_MgnRole mgnRole=buildmgnRole();
		List<IBDS_Dept_MgnRole> list = deptService.getMgnRoleListByCode("50040623");
		deptService.editYiJiDeptById(mgnRole,list);
		
		IBDS_Dept_MgnRole mgnRole1=buildmgnRole();
		List<IBDS_Dept_MgnRole> list1 = deptService.getMgnRoleListByCode("123456789");
		deptService.editYiJiDeptById(mgnRole1,list1);
	}

	@Test
	public void testDeleteRoleByCode() {
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		int j = deptService.deleteRoleByCode(role.getSapcode(), role.getRoletypecode());
		System.out.println(j);
		assertEquals(1, j);
	}

	@Test
	public void testGet4DeptList() {
		//获得某个四级部门列表
		Map<String,Object> param=new HashMap<>();
		param.put("id", "50040173");
		param.put("level", "4");
		param.put("searchParam", "");
		param.put("isEnd", "1");
		param.put("currentlevel", "3");
		List<view_DeptWithLevel> lst=deptService.get4DeptList(param);
		System.out.println("四级部门数目为："+lst.size());
		
	}

	@Test
	public void testPageofUserByCode() {
		Map<String,String> param=new HashMap<>();
		param.put("code", "50040623");
		param.put("roleTypeCode", "P02");
		PageInfo<Map> pageInfo = deptService.pageofUserByCode(param, 1, 20);
		List<Map> list = pageInfo.getList();
		System.out.println(list.size());
		
		/*JSONObject json =  new JSONObject();
		Map<String,String> param=new HashMap<>();
		List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01("13925", "P01");
		Long totalCount=(long) 0;
  		List<Map> allList=new ArrayList<>();
  		//List result = null;
  		for (int i = 0; i < RoleList.size(); i++) {
  			param.put("code", RoleList.get(i).getSapcode());
  			param.put("roleTypeCode", "P02");
  			PageInfo<Map> pageInfo = deptService.PageofUserByCode(param, 1, 20);
  			long total = pageInfo.getTotal();
  			List<Map> list = pageInfo.getList();
  			totalCount+=total;
  			allList.addAll(list);
  			//totalCount+=pageInfo.getTotal();
  			//allList.add((Page) pageInfo.getList());
  			//result.add(allList.get(i).getResult());
  			
  			//PageInfo<Map> pageInfoAll =new PageInfo<>();
  			json.put("total", total);
  			json.put("rows", list);
		}
  		PageInfo<Map> pageInfo =new PageInfo<>();
  		pageInfo.setTotal(totalCount);
  		pageInfo.setList(allList);
  		
		System.out.println(json.toString());*/
		
	}

	@Test
	public void testDeleteUserByPersonCode() {
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		int count = deptService.deleteUserByPersonCode(role.getPersoncode(),role.getSapcode());
		System.out.println(count);
		assertEquals(1, count);
	}

	@Test
	public void testCreate() {
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		System.out.println(i);
		assertEquals(1, i);
	}

	@Test
	public void testGetRoleListByCode() {
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		if(role != null && StringUtils.isNotBlank(role.getPersoncode())){
            List<IBDS_Dept_SysPersonRole> roleListByCode = deptService.getRoleListByCode(role.getPersoncode());
            for (IBDS_Dept_SysPersonRole r : roleListByCode) {
    			System.out.println(r.getPersoncode());
    		}
        }
	}


	/*@Test
	public void testSelectDeptCode() {
		Map<String,Object> param1=new HashMap<>();
		param1.put("code", "05846");
  		List<deptda> DeptCode = deptService.selectDeptCode(param1);
  		for (int i = 0; i < DeptCode.size(); i++) {
			System.out.println(DeptCode.get(i).getName());
		}
	}*/

	@Test
	public void testGetFirstDeptCodeByCode() {
		String code="50040623";
		List<view_DeptWithLevel> list = deptService.getFirstDeptCodeByCode(code);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@Test
	public void testGetFirstDeptCodeByFourthDeptCode() {
		//技术服务部的一个四级部门
		String code="50042067";
		List<view_DeptWithLevel> list = deptService.getFirstDeptCodeByFourthDeptCode(code);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getFirstname());
		}
	}

	@Test
	public void testGetFirstDeptCodeBy2DeptCode() {
		//技术服务部的一个二级部门
		String code="50040778";
		List<view_DeptWithLevel> list = deptService.getFirstDeptCodeBy2DeptCode(code);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getFirstname());
		}
	}

	@Test
	public void testGetFirstDeptCodeBy3DeptCode() {
		//技术服务部的一个三级部门
		String code="50040852";
		List<view_DeptWithLevel> list = deptService.getFirstDeptCodeBy3DeptCode(code);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getFirstname());
		}
	}

	@Test
	public void testGetRoleListByNameAndP01() {
		String code="05846";
		List<IBDS_Dept_SysPersonRole> list=deptService.getRoleListByNameAndP01(code,"P01");
			System.out.println(list.size());
	}

	@Test
	public void testUploadMgnRole() {
		CommonsThreadCache.setCurrentOperateType("system");
		List<IBDS_Dept_MgnRole> list = deptService.getMgnRoleListByCode("50040623");
		List<IBDS_Dept_MgnRole> mgnRolelistByDeleteflag = deptService.getMgnRoleListByDeleteflag("0");
		deptService.uploadMgnRole(list,mgnRolelistByDeleteflag);
		
		IBDS_Dept_MgnRole mgnRole1=buildmgnRole();
		List<IBDS_Dept_MgnRole> list1 = new ArrayList<>();
		list1.add(mgnRole1);
		deptService.uploadMgnRole(list1,mgnRolelistByDeleteflag);
	}

	@Test
	public void testGetRoleListByNameAndP03() {
		String code="10563";
		String roletypecode="P01";
		List<IBDS_Dept_SysPersonRole> list = deptService.getRoleListByNameAndP03(code, roletypecode);
		System.out.println(list.size());
	}

	@Test
	public void testDeleteRoleByCreatorCode() {
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		int j = deptService.deleteRoleByCreatorCode(role.getCreatorcode(), role.getRoletypecode());
		System.out.println(j);
		assertEquals(1, j);
	}

	@Test
	public void testGetRoleListByroletypecode() {
		String roletypecode="P01";
		List<IBDS_Dept_SysPersonRole> list = deptService.getRoleListByroletypecode(roletypecode);
		System.out.println(list.size());
	}

	@Test
	public void testGetRoleListBysapcodeAndP04() {
		String roletypecode="P04";
		String SAPcode="50040623";
		List<IBDS_Dept_SysPersonRole> list = deptService.getRoleListBysapcodeAndP04(SAPcode, roletypecode);
		System.out.println(list.size());
	}
   
	@Test
	public void testGetMgnRoleListByDeleteflag() {
		List<IBDS_Dept_MgnRole> list = deptService.getMgnRoleListByDeleteflag("0");
		System.out.println(list.size());
	}
	
	@Test
	public void testSelectRoleListByParam(){
		IBDS_Dept_SysPersonRole role=buildRole();
		deptService.create(role);
		Map<String,Object> param1=new HashMap<>();
		param1.put("personcode", role.getPersoncode());
  		List<IBDS_Dept_SysPersonRole> SysPersonRole = deptService.selectRoleListByParam(param1);
  		for (int i = 0; i < SysPersonRole.size(); i++) {
			System.out.println(SysPersonRole.get(i).getPersoncode());
		}
	}
	
	
	@Test
	public void testGetMessageByDeptCode(){
		IBDS_Dept_SysPersonRole role=buildRole();
		deptService.create(role);
		Map<String,String> param=new HashMap<>();
		param.put("roleTypeCode", role.getRoletypecode());
		List<Map> messageByDeptCode = deptService.getMessageByDeptCode(param);
		for (int i = 0; i < messageByDeptCode.size(); i++) {
			System.out.println(messageByDeptCode.get(i));
		}
		
	}
	
	@Test
	public void testDeleteWorkPerson(){
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		int count = deptService.deleteWorkPerson(role.getPersoncode(), role.getSapcode(), role.getRoletypecode());
		System.out.println(count);
		assertEquals(1, count);
	}
	
	@Test
	public void testDeleteRoleByPersonCode(){
		IBDS_Dept_SysPersonRole role=buildRole();
		int i = deptService.create(role);
		int count = deptService.deleteRoleByPersonCode(role.getPersoncode(),role.getRoletypecode());
		System.out.println(count);
		assertEquals(1, count);
	}
	
	@Test
	public void testGetListByfirstCode(){
		List<view_DeptWithLevel> listByfirstCode = deptService.getListByfirstCode("50040623");
		System.out.println(listByfirstCode.size());
		//coaMailService.sendMailForQuartzCheck();
		
	}
	
	@Test
	public void testPageofUserByCodeForAdmin() {
		Map<String,String> param=new HashMap<>();
		param.put("roleTypeCode", "P02");
		PageInfo<Map> pageInfo = deptService.pageofUserByCodeForAdmin(param, 1, 20);
		List<Map> list = pageInfo.getList();
		System.out.println(list.size());
	}
	
	@Test
	public void testGetMessageByDeptCodeForAdmin(){
		IBDS_Dept_SysPersonRole role=buildRole();
		deptService.create(role);
		Map<String,String> param=new HashMap<>();
		param.put("roleTypeCode", role.getRoletypecode());
		List<Map> messageByDeptCode = deptService.getMessageByDeptCodeForAdmin(param);
		System.out.println(messageByDeptCode.size());
	}
	
	
	//实体的构造方法
	private IBDS_Dept_MgnRole buildmgnRole() {
		IBDS_Dept_MgnRole mgnRole = new IBDS_Dept_MgnRole();
		mgnRole.setCode("12345678");
		mgnRole.setNameeng("ceshi");
		mgnRole.setManager("test1");
		mgnRole.setSecretary("test2");
		mgnRole.setDeptplanner("test3");
		mgnRole.setApprover("test4");
		mgnRole.setAbbreviation("test5");
		mgnRole.setPlanapprover("test6");
		mgnRole.setPr("test7");
		mgnRole.setConsignor("test8");
		mgnRole.setCreator("test9");
		mgnRole.setCreatetime(new Date());
		mgnRole.setModifier("test10");
		mgnRole.setModifytime(new Date());
		mgnRole.setDeleteflag("0");
		return mgnRole;
	}
	
	/*private IBDS_Dept_MgnRole buildmgnRole2() {
		IBDS_Dept_MgnRole mgnRole = new IBDS_Dept_MgnRole();
		mgnRole.setCode("87654321");
		mgnRole.setNameeng("ceshi2");
		mgnRole.setManager("test1");
		mgnRole.setSecretary("test2");
		mgnRole.setDeptplanner("test3");
		mgnRole.setApprover("test4");
		mgnRole.setAbbreviation("test5");
		mgnRole.setPlanapprover("test6");
		mgnRole.setPr("test7");
		mgnRole.setConsignor("test8");
		mgnRole.setCreator("test9");
		mgnRole.setCreatetime(new Date());
		mgnRole.setModifier("test10");
		mgnRole.setModifytime(new Date());
		mgnRole.setDeleteflag("0");
		return mgnRole;
	}*/
	
	private IBDS_Dept_SysPersonRole buildRole() {
		IBDS_Dept_SysPersonRole role = new IBDS_Dept_SysPersonRole();
        role.setSapcode("12345678");
		role.setRoletypecode("P01");
		role.setPersoncode("test");
		role.setPersonname("测试");
		role.setCreatorcode("test1");
		role.setCreatorname("测试1");
		role.setCreatetime(new Date());
		return role;
	}
	
	/*
	
	//COA接口的本地测试
	@Test
	public void testCOA() throws Exception{
		JSONObject ages = new JSONObject();
	    
	    ages.put("PersonCode", "17740");
	    
	    JSONArray aa = new JSONArray();
	    aa.add("50040098");
	    aa.add("50040099");
	    aa.add("50040096");
	    
	    ages.put("SapCode", aa.toString()); 
	    String url="http://localhost:8080/api/COAData";
	    String rest = httpPostWithJSON(url, ages.toString()); 
		
		
	}
	
	public String httpPostWithJSON(String url, String json) throws Exception {
		String returnValue = "";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try{
		    httpClient = HttpClients.createDefault();
		    HttpPost httpPost = new HttpPost(url);
		    StringEntity requestEntity = new StringEntity(json,"utf-8");
		    requestEntity.setContentEncoding("UTF-8");
		    httpPost.setHeader("Content-type", "application/json");
		    httpPost.setEntity(requestEntity);
		    returnValue = httpClient.execute(httpPost,responseHandler); 
		    System.out.println(returnValue);
		}catch(Exception e){
		    e.printStackTrace();
		}finally {
		    try {
		        httpClient.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		return returnValue;
	} 
	*/
	
	
	
	
	
}
