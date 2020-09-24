package com.h3c.mds.dept.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.WebApplication;
import com.h3c.mds.dept.entity.IbdsDeptCoaDataRecord;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={WebApplication.class})
@Transactional
@Rollback(false)
public class IbdsDeptCoaDataRecordServiceTest {

	@Autowired
	IbdsDeptCoaDataRecordService CoaDataRecordService;
	
	
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
        System.out.println("----------------------before------------------------");
    }
    @After
    public void testAfter(){
        System.out.println("--------------------------after-----------------------");
    }
    
    @Test(timeout = 3000)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(2);
        System.out.println("Complete");
    }
	
	
	
	@Test
	public void testInsertDataRecord() {
		IbdsDeptCoaDataRecord record=builRecord();
		int i = CoaDataRecordService.insertDataRecord(record);
		System.out.println(i);
		assertEquals(1, i);
	}

	
	

	@Test
	public void testUpdateByPrimaryKey() {
		IbdsDeptCoaDataRecord record=builRecord();
		CoaDataRecordService.insertDataRecord(record);
		record.setPassflag("修改后的测试");
		int j = CoaDataRecordService.updateByPrimaryKey(record);
		System.out.println(j);
		assertEquals(1, j);
		
	}

	@Test
	public void testGetListByParam() {
		Map<String, Object> param = new HashMap<>();
		param.put("personcode", "test");
		List<IbdsDeptCoaDataRecord> listByParam = CoaDataRecordService.getListByParam(param);
		for (IbdsDeptCoaDataRecord r : listByParam) {
			System.out.println(r.getOther());
		}
		
	}
	
	
	
	
	private IbdsDeptCoaDataRecord builRecord() {
		IbdsDeptCoaDataRecord record = new IbdsDeptCoaDataRecord();
		record.setSapcode("12345678");
		record.setPersoncode("test");
		record.setPassflag("测试");
		record.setOther(UUID.randomUUID().toString().replace("-", ""));
		record.setPasstime(new Date());
		return record;
	}

}
