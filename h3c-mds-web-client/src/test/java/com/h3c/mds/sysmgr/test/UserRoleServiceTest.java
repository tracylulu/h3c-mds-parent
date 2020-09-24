package com.h3c.mds.sysmgr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h3c.mds.WebApplication;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {WebApplication.class})
public class UserRoleServiceTest {

	//@Autowired
	private UserRoleRelationService service;
	
	//@Test
	public void createTest(){
		for(int i = 1;i<=10;i++){
			UserRoleRelation ur = new UserRoleRelation();
			ur.setHurrHulCode("sys2403");
			ur.setHurrHrlCode(i+"");
			service.create(ur);
		}
	}
}
