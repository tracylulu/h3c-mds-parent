package com.h3c.mds.finance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.finance.entity.ProjectCodeProductCodeView;
import com.h3c.mds.finance.entity.ProjectCodeProductCodeViewExample;

public interface ProjectCodeProductCodeViewMapper {
    long countByExample(ProjectCodeProductCodeViewExample example);

    int deleteByExample(ProjectCodeProductCodeViewExample example);

    int insert(ProjectCodeProductCodeView record);

    int insertSelective(ProjectCodeProductCodeView record);

    List<ProjectCodeProductCodeView> selectByExample(ProjectCodeProductCodeViewExample example);

    int updateByExampleSelective(@Param("record") ProjectCodeProductCodeView record, @Param("example") ProjectCodeProductCodeViewExample example);

    int updateByExample(@Param("record") ProjectCodeProductCodeView record, @Param("example") ProjectCodeProductCodeViewExample example);
    
    
    List<Map<String, Object>> findByPage(@Param("param") Map<String, Object> param);
}