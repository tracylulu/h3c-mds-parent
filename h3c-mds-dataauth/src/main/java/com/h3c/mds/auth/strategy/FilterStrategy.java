package com.h3c.mds.auth.strategy;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * 过滤策略接口
 */
public interface FilterStrategy<T> {

    /**
     * 检查是否有权限，没权限则返回空
     * @param t
     * @return
     */
    T checkPermission(T t);


    String getUserDesc();

    void setUserDesc(String userDesc);

    List<ADMP_MemberGroup> getGroups();

    void setGroups(List<ADMP_MemberGroup> groups);

    void setFilterAnnotation(BusinessFilter businessFilter);

    void setAttributes(String userDesc, List<ADMP_MemberGroup> groups, BusinessFilter annotation,Object filterParam);
}
