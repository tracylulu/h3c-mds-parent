package com.h3c.mds.dept.dao;

import com.h3c.mds.dept.entity.view_DeptWithLevel;
import com.h3c.mds.dept.entity.ViewDeptWithLevelExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface view_DeptWithLevelMapper {
    long countByExample(ViewDeptWithLevelExample example);

    int deleteByExample(ViewDeptWithLevelExample example);

    int insert(view_DeptWithLevel record);

    int insertSelective(view_DeptWithLevel record);

    List<view_DeptWithLevel> selectByExample(ViewDeptWithLevelExample example);

    int updateByExampleSelective(@Param("record") view_DeptWithLevel record, @Param("example") ViewDeptWithLevelExample example);

    int updateByExample(@Param("record") view_DeptWithLevel record, @Param("example") ViewDeptWithLevelExample example);
    
    List<view_DeptWithLevel> getExportList(@Param("param") Map<String,Object> param);
    
    List<view_DeptWithLevel> getList(@Param("param") Map<String,Object> param);
    
    //add by chenlulu
    //List<view_DeptWithLevel> pageOfyijiDept(@Param("param") Map<String,Object> param);
    public List<view_DeptWithLevel> getyijiDeptList(@Param("param") Map<String,Object> param);
    
    List<view_DeptWithLevel> get4DeptList(@Param("param") Map<String,Object> param);
}