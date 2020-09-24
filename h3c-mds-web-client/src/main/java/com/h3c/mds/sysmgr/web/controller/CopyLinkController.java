package com.h3c.mds.sysmgr.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.h3c.mds.flowable.entity.MailInfo;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.LoginLogService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.common.IPUtils;

@Controller
public class CopyLinkController {

	@Autowired
	private UserService userService;
	@Autowired
	private LoginLogService loginLogService;
	@Autowired
	private MailInfoService mailInfoService;

	@RequestMapping(value = "/copyLink")
	public String copyLink(HttpServletRequest request) {
		try {
			String UserIdentity = (String) request.getSession(true).getAttribute("UserIdentity");
			Subject subject = SecurityUtils.getSubject();
			if (UserIdentity != null) {
				UsernamePasswordToken token = new UsernamePasswordToken(UserIdentity, "");
				subject.login(token);
				User user = userService.getUserByAccount(UserIdentity);
				List<ADMP_MemberGroup> group = userService.getGroupByAccount(UserIdentity);
				subject.getSession().setAttribute("current_user", user);
				subject.getSession().setAttribute("current_group", group);
				subject.getSession().setAttribute("current_user_desc", userService.getNameDescByAccount(UserIdentity));
				userService.refreshMenue(UserIdentity);

				// 登录日志
				loginLogService.create(user.getName(), IPUtils.getIpAddr(request));
				String param = request.getParameter("param");
				/*
				 * String linkURL = request.getParameter("url"); String name =
				 * request.getParameter("name");
				 */
				if (StringUtils.isNotBlank(param) ) {
					String[] params=param.split("\\|");
					request.setAttribute("type", "copyLink");
					request.setAttribute("linkURL",params[0].replace("**", "?") );
					request.setAttribute("linkName", params[1]);
				}

				return "home";
			}
			return "redirect:/";
		} catch (Exception e) {
			e.printStackTrace();
			return "login";
		}
	}

}
