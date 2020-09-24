package com.h3c.mds.sysmgr.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * 基本mybatis拦截器实现的数据权限过滤器
 */
@Intercepts({@Signature(type = Executor.class,method = "query",
        args = {MappedStatement.class,Object.class, RowBounds.class,ResultHandler.class})})
//@Component
public class AuthInterceptor1 implements Interceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor1.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        logger.info("拦截器生效-----");
        Object[] args = invocation.getArgs();
        MappedStatement mappedStatements = (MappedStatement) args[0];

        Object result = invocation.proceed();
        return result;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
