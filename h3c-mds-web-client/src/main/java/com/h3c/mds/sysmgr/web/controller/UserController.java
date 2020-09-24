package com.h3c.mds.sysmgr.web.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h3c.mds.sysmgr.entity.*;
import com.h3c.mds.sysmgr.response.ResponseResult;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.apache.http.client.methods.HttpGet;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageInfo;
import com.h3c.domain.ADLogin;
import com.h3c.mds.sysmgr.service.ResourceService;
import com.h3c.mds.sysmgr.service.RoleService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.sysmgr.web.filter.SSOFilter;
import com.h3c.mds.sysmgr.service.LoginLogService;
import com.h3c.mds.utils.common.IPUtils;
import com.h3c.mds.utils.HttpClientUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Value("${sso.main.logout.url}")
	private String ssoMainLogout;
	@Value("${sso.main.siteid}")
	private String siteId;
	@Value("${sso.main.url}")
	private String siteMainUrl;
	@Value("${spring.imageAPI.loginUrl}")
	private String imageAPI_loginUrl;
	@Value("${spring.imageAPI.httpUrl}")
	private String imageAPI_httpUrl;
	@Value("${spring.imageAPI.account}")
	private String imageAPI_account;
	@Value("${spring.imageAPI.password}")
	private String imageAPI_password;
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private ResourceService resourceService;
	@Autowired
	private LoginLogService loginLogService;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request){
		ADLogin ad = new ADLogin();
		String status = ad.loginCheckDomain(username, password);
		
		if("sucess".equals(status)){
			Subject subject = SecurityUtils.getSubject();
			request.getSession(false).setAttribute("UserIdentity", username);
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			subject.login(token);
			User user = userService.getUserByAccount(username);
			List<ADMP_MemberGroup> group = userService.getGroupByAccount(username);
			subject.getSession().setAttribute("current_user", user);
			subject.getSession().setAttribute("current_group", group);
			subject.getSession().setAttribute("current_user_desc", userService.getNameDescByAccount(username));
			userService.refreshMenue(username);		
			
		}
		return "home";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(HttpServletRequest request){
		try {
			String a = request.getParameter("a");
			String UserIdentity = (String) request.getSession(true).getAttribute("UserIdentity");
			Subject subject = SecurityUtils.getSubject();
			if(UserIdentity != null){
				UsernamePasswordToken token = new UsernamePasswordToken(UserIdentity, "");
				subject.login(token);
				User user = userService.getUserByAccount(UserIdentity);
				subject.getSession().setAttribute("current_user", user);
				List<ADMP_MemberGroup> group = userService.getGroupByAccount(UserIdentity);
				subject.getSession().setAttribute("current_group", group);
				subject.getSession().setAttribute("current_user_desc", userService.getNameDescByAccount(UserIdentity));
				userService.refreshMenue(UserIdentity);
				
				//登录日志				
				loginLogService.create(user.getName(),IPUtils.getIpAddr(request));
				
			    return "redirect:/";
			}
			return "redirect:/";
		} catch (Exception e) {
			e.printStackTrace();
			return "login";
		}
	}

	@RequestMapping(value="/mail",method=RequestMethod.GET)
	public String mail(HttpServletRequest request){
		try {
			String UserIdentity = (String) request.getSession(true).getAttribute("UserIdentity");
			Subject subject = SecurityUtils.getSubject();
			if(UserIdentity != null){
				UsernamePasswordToken token = new UsernamePasswordToken(UserIdentity, "");
				subject.login(token);
				User user = userService.getUserByAccount(UserIdentity);
				List<ADMP_MemberGroup> group = userService.getGroupByAccount(UserIdentity);
				subject.getSession().setAttribute("current_user", user);
				subject.getSession().setAttribute("current_group", group);
				subject.getSession().setAttribute("current_user_desc", userService.getNameDescByAccount(UserIdentity));
				userService.refreshMenue(UserIdentity);

				//登录日志
				loginLogService.create(user.getName(),IPUtils.getIpAddr(request));

				return "redirect:/";
			}
			return "redirect:/";
		} catch (Exception e) {
			e.printStackTrace();
			return "login";
		}
	}
	
	@RequestMapping("/login1")
	@ResponseBody
	public String login1(String userName,String password){
		ADLogin ad = new ADLogin();
		String string = ad.loginCheckDomain(userName, password);
		System.out.println(string);
		return string;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,HttpServletResponse reponse){
		request.getSession(false).removeAttribute("UserIdentity");
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().removeAttribute("current_user");
		subject.getSession().removeAttribute("roles");
		subject.getSession().removeAttribute("roleCode");
		subject.getSession().removeAttribute("userCode");
		subject.getSession().removeAttribute("resource");
		subject.logout();
		return "redirect:"+ssoMainLogout+"?siteId="+siteId+"&RequestUrl="+siteMainUrl;
	}
	
	@RequestMapping("/userList")
	@ResponseBody
	public String userList(User user, Integer page, Integer rows){
		/*if(page == null || rows == null){
			page = 1;
			rows = 10;
			
		}*/
		PageInfo<User> pageInfo = this.userService.pageOfUser(user, page, rows);
		JSONObject json = new JSONObject();
		try {
			json.put("rows", pageInfo.getList());
			json.put("total", pageInfo.getTotal());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	
	
	//跳转用户页面
	@RequestMapping("/list")
	public Object toUser() {
		return "sysmgr/user/list";
	}
	
	/**
	 * 获取用户 图片
	 * @return
	 */
	@RequestMapping("/getUserImageBase64")
	@ResponseBody
	public String getUserImgeBase64(){
		try {
			User user=(User)SecurityUtils.getSubject().getSession().getAttribute("current_user");
			//图片路径需要拼接工号
			//imageAPI_httpUrl
			String base64=new HttpClientUtil().getUserImageBase64(imageAPI_loginUrl, imageAPI_httpUrl+user.getCode(),imageAPI_account,imageAPI_password);
			return base64;
		}catch(Exception e) {
			return "请联系管理员";
		}		
	}

	@RequestMapping("/getNameDescByAccount/{account}")
	@ResponseBody
	public ResponseResult getNameDescByAccount(@PathVariable String account){
		try {
			Object nameDescByAccount = userService.getNameDescByAccount(account);
			return ResponseResult.success(nameDescByAccount);
		}catch (Exception e){
			logger.error("根据域账号获取名称描述失败", e);
			return ResponseResult.fail("根据域账号获取名称描述失败");
		}
	}
	
	@RequestMapping("/pageOfUserByRole")
	@ResponseBody
	public String pageOfUserByRole(String roleCode,String searchStr,Integer page, Integer rows){
		Map<String,String> param=new HashMap<>();
		param.put("roleCode", roleCode);
		param.put("searchParams", searchStr);
		PageInfo<User> pageInfo = userService.PageofUserByRoleCode(param, page, rows);
		
		JSONObject json =  new JSONObject();
		
		json.put("total", pageInfo.getTotal());
		json.put("rows", pageInfo.getList());
		
		return json.toString();
	}
}