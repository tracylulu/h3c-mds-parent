/*package com.h3c.mds.product.web.acpect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class OperLogAcpect {

	@Pointcut("execution(public * com.h3c.mds.product.web.controller..*.*(..))")
	public void operLog() {
	}
	
	@Before("operLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		System.out.println("OperLogAcpect :====================" +joinPoint);
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        System.out.println("URL : " + request.getRequestURL().toString());
	}
	
	
	@AfterReturning(returning = "ret",pointcut = "operLog()")
    public void doAfterReturning(Object ret) throws Throwable {
		 // 处理完请求，返回内容
        System.out.println("RESPONSE : " + ret);
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        System.out.println("URL : " + request.getRequestURL().toString());
	}
	

}
*/