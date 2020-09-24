package com.h3c.mds.sysmgr.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;

public class ShiroUtils {

	public static void clearShiroCache(){
		RealmSecurityManager  securityManager = (RealmSecurityManager) SecurityUtils.getSecurityManager();
		MyShiroRealm realm = (MyShiroRealm) securityManager.getRealms().iterator().next();
	}
}
