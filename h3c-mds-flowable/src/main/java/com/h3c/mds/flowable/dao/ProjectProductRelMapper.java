package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProjectProductRel;
import com.h3c.mds.flowable.entity.ProjectProductRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectProductRelMapper {
    long countByExample(ProjectProductRelExample example);

    int deleteByExample(ProjectProductRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectProductRel record);

    int insertSelective(ProjectProductRel record);

    List<ProjectProductRel> selectByExample(ProjectProductRelExample example);

    ProjectProductRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectProductRel record, @Param("example") ProjectProductRelExample example);

    int updateByExample(@Param("record") ProjectProductRel record, @Param("example") ProjectProductRelExample example);

    int updateByPrimaryKeySelective(ProjectProductRel record);

    int updateByPrimaryKey(ProjectProductRel record);
}