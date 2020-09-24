package com.h3c.mds.flowable.controller;

import com.h3c.mds.flowable.entity.MailInfo;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.LoginLogService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.common.IPUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

@Controller
public class MailInfoController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginLogService loginLogService;
    @Autowired
    private MailInfoService mailInfoService;

    @RequestMapping(value="/mailLogin",method= RequestMethod.GET)
    public String login(HttpServletRequest request){
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
                loginLogService.create(user.getName(), IPUtils.getIpAddr(request));
                String mainid = request.getParameter("mailid");
                if(mainid != null){
                    MailInfo mailInfo = mailInfoService.getById(Integer.parseInt(mainid));
                    request.setAttribute("mailInfo", mailInfo);
                    request.setAttribute("loginType", "mianLogin");
                }

                return "home";
            }
            return "redirect:/";
        } catch (Exception e) {
            e.printStackTrace();
            return "login";
        }
    }
    
    @RequestMapping(value="/mailLoginForCOA",method= RequestMethod.GET)
    public String loginForCOA(HttpServletRequest request){
        try {
        	String siteMainUrl = ((Environment)SpringContextUtils.getBean(Environment.class)).getProperty("sso.main.url");
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
                loginLogService.create(user.getName(), IPUtils.getIpAddr(request));
                String code = request.getParameter("code");
                if(code != null){
                    MailInfo mailInfo = new MailInfo();
                    mailInfo.setModuleDesc("一级部门修改");
                    long time = new Date().getTime();
                    String tid=time+"";
                    mailInfo.setUrl("/dept/toAddYiJiDept?code="+code+"&tid="+tid);
                    //mailInfo.setUrl("siteMainUrl/dept/list1/1");
                    request.setAttribute("mailInfo", mailInfo);
                    request.setAttribute("loginType", "mianLogin");
                }
                //return "redirect:"+siteMainUrl+"/dept/toAddYiJiDept?code="+code;
                //return "redirect:/\"siteMainUrl\"+\"/dept/toAddYiJiDept?code=\"+code";
                return "home";
            }
            return "redirect:/";
        } catch (Exception e) {
            e.printStackTrace();
            return "login";
        }
    }
    
}
