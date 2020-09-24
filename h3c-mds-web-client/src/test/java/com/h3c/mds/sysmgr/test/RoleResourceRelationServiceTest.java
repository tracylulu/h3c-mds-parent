package com.h3c.mds.sysmgr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h3c.mds.WebApplication;
import com.h3c.mds.sysmgr.entity.RoleResourceRelation;
import com.h3c.mds.sysmgr.service.RoleResourceRelationService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {WebApplication.class})
public class RoleResourceRelationServiceTest {

	//@Autowired
	private RoleResourceRelationService service;
	
	//@Test
	public void testCreate(){
		for(int i=12;i<=20;i++){
			RoleResourceRelation rrr = new RoleResourceRelation();
			rrr.setHrrrHresCode(i+"");
			rrr.setHrrrHrlCode(1+"");
			service.create(rrr);
		}
	}
}
