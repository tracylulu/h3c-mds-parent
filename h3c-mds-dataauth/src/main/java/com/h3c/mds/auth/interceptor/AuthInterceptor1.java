package com.h3c.mds.auth.interceptor;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * 基本mybatis拦截器实现的数据权限过滤器
 */
//@Intercepts({@Signature(method = "query", type = Executor.class,
//        args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class })})
//@Component
public class AuthInterceptor1 implements Interceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor1.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object result = invocation.proceed();
        return result;
    }

    @Override
    public Object plugin(Object o) {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
