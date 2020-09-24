package com.h3c.mds.sysmgr.config;

import com.github.pagehelper.PageInterceptor;
import com.h3c.mds.auth.interceptor.AuthInterceptor;
import com.h3c.mds.sysmgr.interceptor.ResultInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class InterceptorConfig {

    @Value("${pagehelper.helperDialect}")
    private String helperDialect;
    @Value("${pagehelper.reasonable}")
    private String reasonable;
    @Value("${pagehelper.supportMethodsArguments}")
    private String supportMethodsArguments;
    @Value("${pagehelper.pageSizeZero}")
    private String pageSizeZero;
    @Value("${pagehelper.params}")
    private String params;

    @Bean
    public String myInterceptor1(SqlSessionFactory sqlSessionFactory) {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        Map<String,String> map = new LinkedHashMap<>();
        map.put("helperDialect",helperDialect);
        map.put("reasonable",reasonable);
        map.put("supportMethodsArguments",supportMethodsArguments);
        map.put("pageSizeZero",pageSizeZero);
        map.put("params",params);
        properties.putAll(map);
        pageInterceptor.setProperties(properties);
        sqlSessionFactory.getConfiguration().addInterceptor(pageInterceptor);

        return "interceptor1";
    }
    @Bean
    public String myInterceptor(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addInterceptor(new AuthInterceptor());

        return "interceptor";
    }


}
