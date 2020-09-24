package com.h3c.mds.auth.handler;


import java.util.List;

/**
 * 过滤处理器接口
 */
public interface FilterHandler {

    /**
     * 处理结果集
     * @param list  原始结果集
     * @return  过滤后的结果集
     */
    List<Object> handler(List<Object> list);
}
