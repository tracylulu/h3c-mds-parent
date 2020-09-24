package com.h3c.mds.auth.handler;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.auth.executor.BusinessFilterExecutor;
import com.h3c.mds.auth.strategy.FilterStrategy;
import com.h3c.mds.auth.util.BusinessFilterThreadContext;
import com.h3c.mds.auth.util.DataAuthSpringContextUtils;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.service.UserService;

import org.apache.poi.ss.formula.functions.T;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * 业务过滤处理器具体实现
 */
@Component("businessFilterHandler")
public class BusinessFilterHandler implements FilterHandler{

    private static final Logger logger = LoggerFactory.getLogger(BusinessFilterHandler.class);

    @Autowired
    private BusinessFilterExecutor executor;



    @Override
    public List<Object> handler(List<Object> list) {
        try {
            logger.debug("处理器线程开始-------");
            long i = System.currentTimeMillis();
            List<CompletableFuture> futures = new ArrayList();
            List<ADMP_MemberGroup> groups = (List<ADMP_MemberGroup>) SecurityUtils.getSubject().getSession().getAttribute("current_group");
            String userDesc = (String) SecurityUtils.getSubject().getSession().getAttribute("current_user_desc");
            BusinessFilter annotation = BusinessFilterThreadContext.getFilterAnnotation();
            //获取mapper查询参数
            Object filterParam = BusinessFilterThreadContext.getFilterParam();
            //获取过滤策略
            FilterStrategy filterStrategy = (FilterStrategy) DataAuthSpringContextUtils.getBean(annotation.strategy());
            filterStrategy.setAttributes(userDesc,groups,annotation,filterParam);

            List<Object> result = new ArrayList<>();
            //TODO 多线程方式过滤，先注掉，如果有性能问题则放开该代码，注掉下方单线程方式
//            for(Object t : list){
//                CompletableFuture<Object> future = executor.executor(t,filterStrategy);
//                futures.add(future);
//            }
//
//            for(CompletableFuture<Object> future : futures){
//                Object o = future.get();
//                if(o == null) continue;
//                result.add(o);
//            }
            //TODO 单线程方式过滤，如果有性能问题，注掉该代码，启用上面多线程方式过滤。
            for(Object l : list){
                if(l == null) continue;
                Object o = filterStrategy.checkPermission(l);
                if(o == null) continue;
                result.add(o);
            }
            long j = System.currentTimeMillis();
            logger.debug("过滤耗时-----"+(j-i)+"毫秒");
            logger.debug("处理器线程结束-----------");
            return result;
        }  catch (Exception e) {
            logger.error("处理失败返回空集", e);
            return null;
        }

    }
}
