package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.VersionView;
import com.h3c.mds.product.entity.VersionViewExample;

public interface VersionViewMapper {
    long countByExample(VersionViewExample example);

    int deleteByExample(VersionViewExample example);

    int insert(VersionView record);

    int insertSelective(VersionView record);

    List<VersionView> selectByExample(VersionViewExample example);

    int updateByExampleSelective(@Param("record") VersionView record, @Param("example") VersionViewExample example);

    int updateByExample(@Param("record") VersionView record, @Param("example") VersionViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "versionFilterStrategy")
    List<VersionView> getTreeData(@Param("param") Map<String, String> param);//selectByCode
    
    VersionView selectByCode(@Param("code") String code);
    
    VersionView selectByID(@Param("code") Integer code);
    
    String getMaxCode();
    
    List<VersionView> getExportList(@Param("param") Map<String, String> param);
}