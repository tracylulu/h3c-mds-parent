package com.h3c.mds.sysmgr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h3c.mds.WebApplication;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;


//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes={WebApplication.class})
public class UserServiceTest {

	//@Autowired
	private UserService userService;
	
	//@Test
	public void testSelectByAccount(){
		User user = userService.getUserByAccount("l00152");
		System.out.println(user.toString());
	}
}
