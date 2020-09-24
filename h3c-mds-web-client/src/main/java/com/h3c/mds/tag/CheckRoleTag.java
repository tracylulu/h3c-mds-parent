package com.h3c.mds.tag;

import org.apache.shiro.SecurityUtils;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.StringWriter;

/**
 * 检查角色标签
 */
public class CheckRoleTag extends SimpleTagSupport {

    private String checkRole;

    @Override
    public void doTag(){
        boolean flag = false;
        String[] split = checkRole.split(",");
        String roleCode = (String) SecurityUtils.getSubject().getSession().getAttribute("roleCode");
        for(int i = 0;i<split.length;i++){
            if(roleCode.contains(split[0])){
                flag = true;
                break;
            }
        }
        StringWriter sw = new StringWriter();
        if(flag){
            try {
                getJspBody().invoke(sw);
                this.getJspContext().getOut().write(sw.toString());
            }catch (Exception e){

            }

        }
    }

    public String getCheckRole() {
        return checkRole;
    }

    public void setCheckRole(String checkRole) {
        this.checkRole = checkRole;
    }
}
