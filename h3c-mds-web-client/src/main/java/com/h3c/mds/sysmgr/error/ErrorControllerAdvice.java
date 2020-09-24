package com.h3c.mds.sysmgr.error;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

@ControllerAdvice
public class ErrorControllerAdvice {



    public Map<String,Object> errorHandler(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("100", e.getMessage());
        return map;
    }

    @ExceptionHandler(value = Exception.class)
    public String excesionHandler(HttpServletRequest request,Exception e){
        Map<String,Object> map = new HashMap<>();
        e.printStackTrace();
        if(e instanceof NoHandlerFoundException){
           return "error/404";
        }
        return "error/500";
    }
}
