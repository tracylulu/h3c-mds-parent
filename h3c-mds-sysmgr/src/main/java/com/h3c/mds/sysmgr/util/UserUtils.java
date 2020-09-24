package com.h3c.mds.sysmgr.util;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.h3c.mds.utils.CommonsThreadCache;

public class UserUtils {

	private static final Logger LOG = LoggerFactory.getLogger(UserUtils.class);
    public static String getCurrentUserId(){
        String userId;
        LOG.info("current Thread--" + Thread.currentThread().getName() + "--" +  CommonsThreadCache.getCurrentOperateType());
        if("system".equals(CommonsThreadCache.getCurrentOperateType())){
            userId = "system";
        }else{
            userId = (String) SecurityUtils.getSubject().getPrincipal();
        }
        return userId;
    }
}
