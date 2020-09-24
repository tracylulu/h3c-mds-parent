package com.h3c.mds.sysmgr.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h3c.mds.WebApplication;
import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.service.ResourceService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {WebApplication.class})
public class ResourceServiceTest {

	//@Autowired
	private ResourceService resourceService;
	
	//@Test
	public void testCreate(){
		for(int i = 11;i <= 20;i++){
			Resource r = new Resource();
			r.setFlag("0");
			r.setHresCode(i+"");
			r.setHresContent("");
			r.setHresCreateDate(new Date());
			r.setHresCreateUser("sun");
			r.setHresModifyDate(new Date());
			r.setHresModifyUser("sun");
			r.setHresName("测试"+i);
			resourceService.create(r);
		}
	}
	
	//@Test
	public void testGetResourceByRoleCode(){
		List<Resource> resourcesByRoleCode = resourceService.getResourcesByRoleCode("1");
		for (Resource resource : resourcesByRoleCode) {
			String hresName = resource.getHresName();
			System.out.println(hresName);
		}
	}
}
