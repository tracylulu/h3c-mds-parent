package com.h3c.mds.auth.config;

import com.h3c.mds.auth.interceptor.AuthInterceptor1;
import org.apache.ibatis.session.SqlSessionFactory;

//@Configuration
public class InterceptorConfig {
    //@Bean
    public String myInterceptor(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addInterceptor(new AuthInterceptor1());
        return "interceptor";
    }

}
