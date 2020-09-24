package com.h3c.mds.flowable.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.h3c.mds.flowable.entity.IbdsEip;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.LoginLogService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.common.IPUtils;

@Controller
public class EipInfoController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginLogService loginLogService;
    @Autowired
    private EipService eipService;

    @RequestMapping(value="/eipLogin",method= RequestMethod.GET)
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
                String eipId = request.getParameter("docuId");
                if(eipId != null){
                    IbdsEip eip = eipService.getEipByDocunId(eipId);
                    request.setAttribute("eipInfo", eip);
                    request.setAttribute("loginType", "eipLogin");
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
