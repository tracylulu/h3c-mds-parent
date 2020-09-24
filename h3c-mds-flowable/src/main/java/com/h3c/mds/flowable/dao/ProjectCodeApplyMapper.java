package com.h3c.mds.flowable.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.flowable.entity.ProjectCodeApply;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExample;

public interface ProjectCodeApplyMapper {
    long countByExample(ProjectCodeApplyExample example);

    int deleteByExample(ProjectCodeApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectCodeApply record);

    int insertSelective(ProjectCodeApply record);

    List<ProjectCodeApply> selectByExample(ProjectCodeApplyExample example);

    ProjectCodeApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectCodeApply record, @Param("example") ProjectCodeApplyExample example);

    int updateByExample(@Param("record") ProjectCodeApply record, @Param("example") ProjectCodeApplyExample example);

    int updateByPrimaryKeySelective(ProjectCodeApply record);

    int updateByPrimaryKey(ProjectCodeApply record);
    
    int insertSelectiveReturnId(ProjectCodeApply record);
    
    //获取在途的B版本
    List<ProjectCodeApply> getProjectCodeApplyByBversionNo(@Param("param") Map<String, Object> param);
    //获取在途的R版本
    List<ProjectCodeApply> getProjectCodeApplyByReleaseNo(@Param("param") Map<String, Object> param);
}