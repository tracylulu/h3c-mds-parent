package com.h3c.mds.sysmgr.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.ResourceService;
import com.h3c.mds.sysmgr.service.RoleService;
import com.h3c.mds.sysmgr.service.UserService;

import org.springframework.context.annotation.Lazy;

//实现AuthorizingRealm接口用户用户认证
public class MyShiroRealm extends AuthorizingRealm{
	
	private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    //用于用户查询
    @Lazy
    @Autowired
    private UserService loginService;
    
    @Lazy
    @Autowired
    private RoleService roleService;
    
    @Lazy
    @Autowired
    private ResourceService resourceService;


    //角色权限和对应权限添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    	logger.info("shiro执行权限");
        //获取登录用户名
        String account= (String) principalCollection.getPrimaryPrincipal();
        
        List<Role> roles = roleService.getRolesByUserAccount(account);
        List<Resource> allResource = new ArrayList<Resource>();
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (Role role:roles) {
            //添加角色
            simpleAuthorizationInfo.addRole(role.getHrlName());
            List<Resource> resources = resourceService.getResourcesByRoleCode(role.getHrlCode());
            for (Resource resource:resources) {
                //添加权限
                simpleAuthorizationInfo.addStringPermission(resource.getHresName());
                
            }
        }
        return simpleAuthorizationInfo;
    }

    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    	logger.info("shiro执行认证");
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        UsernamePasswordToken tocken = (UsernamePasswordToken)authenticationToken;
        
        
       
        //这里验证authenticationToken和simpleAuthenticationInfo的信息
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(tocken.getUsername(), tocken.getPassword(), getName());
        return simpleAuthenticationInfo;
        
    }
}