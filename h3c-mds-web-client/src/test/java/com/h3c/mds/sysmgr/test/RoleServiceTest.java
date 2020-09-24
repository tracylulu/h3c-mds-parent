package com.h3c.mds.sysmgr.test;

import com.h3c.mds.WebApplication;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.service.RoleService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {WebApplication.class})
public class RoleServiceTest {

    //@Autowired
    private RoleService roleService;

    //@Test
    public void testCreate(){
    	for(int i = 1;i<=10;i++){
    		Role role = new Role();
            role.setFlag(0);
            role.setHrlCode(i+"");
            role.setHrlCreateDate(new Date());
            role.setHrlCreateUser("sun");
            role.setHrlModifyDate(new Date());
            role.setHrlModifyUser("sun");
            role.setHrlName("测试"+i);
            role.setRemark("safdasdf");
            roleService.create(role);
    	}
        
    }
    
    //@Test
    public void testGetRolesByUserAccount(){
    	List<Role> roles = roleService.getRolesByUserAccount("sys2403");
    	for (Role role : roles) {
			System.out.println(role.getHrlName());
		}
    }
}
