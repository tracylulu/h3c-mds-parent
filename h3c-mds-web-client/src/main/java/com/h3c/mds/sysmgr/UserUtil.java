package com.h3c.mds.sysmgr;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import com.h3c.mds.sysmgr.entity.User;

public class UserUtil {

	/**
	 * 获取当前登录用户的id
	 * @return
	 */
	public static String getUserId(){
		Subject subject = SecurityUtils.getSubject();
		String user = (String)subject.getSession().getAttribute("UserIdentity");
		return user;
	}
	
	//验证是否为管理员
	public static Boolean checkIsAdmin() {
		// 获取当前用户角色
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		if (roleCode.contains("R_000001")) {
			return true;
		} else {
			return false;
		}
	}
	//验证是否是财务
	public static Boolean checkIsFinaRole(){
		// 获取当前用户角色
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		if(roleCode.contains("R_000010") || roleCode.contains("R_000011")){
			return true;
		}else{
			return false;
		}
	}
	//验证是否是财务或者管理员
	public static Boolean checkIsFinaOrAdmin(){
		return checkIsFinaRole() || checkIsAdmin();
	}
	//获取当前登录人姓名+工号
	public static String getUser() {
		User user=(User)SecurityUtils.getSubject().getSession().getAttribute("current_user");
		return user.getUda10509()+" "+user.getCode();
	}
}
