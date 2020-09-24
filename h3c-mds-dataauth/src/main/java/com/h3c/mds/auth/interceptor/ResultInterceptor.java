package com.h3c.mds.auth.interceptor;

import com.h3c.mds.auth.constant.FilterConstant;
import com.h3c.mds.auth.handler.FilterHandler;
import com.h3c.mds.auth.util.BusinessFilterThreadContext;
import com.h3c.mds.auth.util.DataAuthSpringContextUtils;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Intercepts({
        @Signature(type = ResultSetHandler.class, method = "handleResultSets", args={Statement.class})
})
@Component
public class ResultInterceptor implements Interceptor {

    private static final Logger log = LoggerFactory.getLogger(ResultInterceptor.class);

    @Autowired
    private Map<String, FilterHandler> map;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        log.error("拦截器ResultInterceptor");
        // ResultSetHandler resultSetHandler1 = (ResultSetHandler) invocation.getTarget();
        //通过java反射获得mappedStatement属性值
        //可以获得mybatis里的resultype
        Object result = invocation.proceed();
        String status = BusinessFilterThreadContext.getFilterStatus();
        //过滤状态为启用，则对结果集进行过滤
        if(FilterConstant.FILTER_STATUS_ENABLE.equals(status)){
            FilterHandler filterHandler = map.get(BusinessFilterThreadContext.getFilterAnnotation().handler());
            if(result instanceof ArrayList){
                List list = (List) result;
                return filterHandler.handler(list);
            }

        }
//        if (result instanceof ArrayList) {
//            ArrayList resultList = (ArrayList) result;
//            for (int i = 0; i < resultList.size(); i++) {
//                Object oi = resultList.get(i);
//                Class c = oi.getClass();
//                Class[] types = {String.class};
//                Method method = c.getMethod("setAddress", types);
//                // 调用obj对象的 method 方法
//                method.invoke(oi, "china");
//            }
//        }
//        if(result instanceof ProductCodeProcess){
//            Class<?> clazz = result.getClass();
//            clazz.
//        }
        return result;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
