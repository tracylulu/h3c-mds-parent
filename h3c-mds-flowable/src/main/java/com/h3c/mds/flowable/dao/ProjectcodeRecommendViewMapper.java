package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProjectcodeRecommendView;
import com.h3c.mds.flowable.entity.ProjectcodeRecommendViewExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProjectcodeRecommendViewMapper {
    long countByExample(ProjectcodeRecommendViewExample example);

    int deleteByExample(ProjectcodeRecommendViewExample example);

    int insert(ProjectcodeRecommendView record);

    int insertSelective(ProjectcodeRecommendView record);

    List<ProjectcodeRecommendView> selectByExample(ProjectcodeRecommendViewExample example);

    int updateByExampleSelective(@Param("record") ProjectcodeRecommendView record, @Param("example") ProjectcodeRecommendViewExample example);

    int updateByExample(@Param("record") ProjectcodeRecommendView record, @Param("example") ProjectcodeRecommendViewExample example);
    
    List<Map<String, Object>> treeRecommendProjectCode(@Param("param")Map<String, Object> param);
}