package com.h3c.mds.auth.service;

import com.h3c.mds.auth.entity.DataPerm;

import java.util.List;

public interface DataPermService {
    /**
     * 根据用户账号和和资源名称获取权限列表
     * @param account   用户账号
     * @param resource  权限名称
     * @return
     */
    List<DataPerm> getByUserAccountAndResource(String account, String resource,String type);
}
