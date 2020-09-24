package com.h3c.mds.dept.dao;

import com.h3c.mds.dept.entity.view_DeptOperationLog;
import com.h3c.mds.dept.entity.ViewDeptOperationLogExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface view_DeptOperationLogMapper {
    long countByExample(ViewDeptOperationLogExample example);

    int deleteByExample(ViewDeptOperationLogExample example);

    int insert(view_DeptOperationLog record);

    int insertSelective(view_DeptOperationLog record);

    List<view_DeptOperationLog> selectByExample(ViewDeptOperationLogExample example);

    int updateByExampleSelective(@Param("record") view_DeptOperationLog record, @Param("example") ViewDeptOperationLogExample example);

    int updateByExample(@Param("record") view_DeptOperationLog record, @Param("example") ViewDeptOperationLogExample example);
    
    List<view_DeptOperationLog> getList(@Param("param") Map<String,Object> param);
}