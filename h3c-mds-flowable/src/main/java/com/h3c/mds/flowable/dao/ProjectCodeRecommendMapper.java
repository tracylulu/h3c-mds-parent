package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProjectCodeRecommend;
import com.h3c.mds.flowable.entity.ProjectCodeRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCodeRecommendMapper {
    long countByExample(ProjectCodeRecommendExample example);

    int deleteByExample(ProjectCodeRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectCodeRecommend record);

    int insertSelective(ProjectCodeRecommend record);

    List<ProjectCodeRecommend> selectByExample(ProjectCodeRecommendExample example);

    ProjectCodeRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectCodeRecommend record, @Param("example") ProjectCodeRecommendExample example);

    int updateByExample(@Param("record") ProjectCodeRecommend record, @Param("example") ProjectCodeRecommendExample example);

    int updateByPrimaryKeySelective(ProjectCodeRecommend record);

    int updateByPrimaryKey(ProjectCodeRecommend record);
}