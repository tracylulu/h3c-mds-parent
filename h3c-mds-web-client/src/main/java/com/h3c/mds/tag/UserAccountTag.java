package com.h3c.mds.tag;

import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.sysmgr.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserAccountTag extends SimpleTagSupport {

    private String account;




    @Override
    public void doTag() throws JspException, IOException {
        UserService userService = (UserService) SpringContextUtils.getBean(UserService.class);
        String out = account;
        String[] split = account.split(",");
        if(StringUtils.isNotBlank(account)){
            List<String> list = new ArrayList<>();
            for(String s : split){
                list.add(userService.getNameDescByAccount(s));
            }
            out = StringUtils.join(list,",");
        }

        //String nameDescByAccount = userService.getNameDescByAccount(account);
        this.getJspContext().getOut().write(out);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
