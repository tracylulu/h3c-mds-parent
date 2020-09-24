package com.h3c.mds.sysmgr.config;

import com.h3c.mds.sysmgr.intercetor1.MyIntercetor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.h3c.mds.sysmgr.web.filter.FirstFilter;
import com.h3c.mds.sysmgr.web.filter.SSOFilter;


@Configuration
public class MyWebConfig implements WebMvcConfigurer{
	
	@Autowired
	private SSOFilter ssoFilter;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
    public FilterRegistrationBean filterRegist1() {
		FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new FirstFilter());
        frBean.addUrlPatterns("/*");
        //frBean.setOrder(1);
        return frBean;
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
    public FilterRegistrationBean filterRegist() {
		FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(ssoFilter);
        frBean.addUrlPatterns("/*");
        //frBean.setOrder(1);
        return frBean;
    }
	
	@Bean
    public FilterRegistrationBean filterRegist2() {
		FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new DelegatingFilterProxy("shiroFilterFactoryBean"));
        frBean.addUrlPatterns("/*");
        //frBean.setOrder(1);
        return frBean;
    }

//    @Bean
//    public MyIntercetor myIntercetor(){
//	    return new MyIntercetor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//	    registry.addInterceptor(myIntercetor()).addPathPatterns("/flowable/productCodeApply/save",
//                "/flowable/productCodeApply/submit");
//    }
}
