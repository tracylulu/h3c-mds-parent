package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.ProjectView;
import com.h3c.mds.product.entity.ProjectViewExample;

public interface ProjectViewMapper {
    long countByExample(ProjectViewExample example);

    int deleteByExample(ProjectViewExample example);

    int insert(ProjectView record);

    int insertSelective(ProjectView record);

    List<ProjectView> selectByExample(ProjectViewExample example);

    int updateByExampleSelective(@Param("record") ProjectView record, @Param("example") ProjectViewExample example);

    int updateByExample(@Param("record") ProjectView record, @Param("example") ProjectViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "projectFilterStrategy")
    List<ProjectView> getTreeData(@Param("param") Map<String, String> param);//selectByCode
    
    ProjectView selectByCode(@Param("code") String code);
    
    ProjectView selectByID(@Param("code") Integer code);
    
    String getMaxCode();
    
    List<ProjectView> getExportList(@Param("param") Map<String, String> param);//selectByCode
}