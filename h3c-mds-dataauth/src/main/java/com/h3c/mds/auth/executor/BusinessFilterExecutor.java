package com.h3c.mds.auth.executor;

import com.h3c.mds.auth.strategy.FilterStrategy;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
public class BusinessFilterExecutor {

    private static final Logger logger = LoggerFactory.getLogger(BusinessFilterExecutor.class);



    @Async("businessFilterExecutorPool")
    public CompletableFuture<Object> executor(Object t, FilterStrategy filterStrategy){
        logger.debug(Thread.currentThread().getName()+"-----多线程开始执行------------"+filterStrategy.toString());
        Object o = filterStrategy.checkPermission(t);
        return CompletableFuture.completedFuture(o);

    }
}
