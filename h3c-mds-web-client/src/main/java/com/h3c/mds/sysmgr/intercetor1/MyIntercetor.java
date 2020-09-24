package com.h3c.mds.sysmgr.intercetor1;

import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FprodService;
import org.apache.catalina.util.ParameterMap;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyIntercetor implements HandlerInterceptor {

    @Autowired
    private FProdLineService fProdLineService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Map<String, String[]> parameterMap = request.getParameterMap();

        if (parameterMap instanceof ParameterMap){
            ParameterMap p = (ParameterMap) parameterMap;
            p.setLocked(false);
            String[] a = {"258"};
            String[] b = parameterMap.get("applys[0].prodlineId");
            parameterMap.put("applys[0].prodlineId",a );
            p.setLocked(true);
        }
        return true;
    }
}
