package com.h3c.mds.flowable.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.flowable.entity.ProcessLog;
import com.h3c.mds.flowable.entity.ProcessLogExample;

public interface ProcessLogMapper {
    long countByExample(ProcessLogExample example);

    int deleteByExample(ProcessLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessLog record);

    int insertSelective(ProcessLog record);

    List<ProcessLog> selectByExample(ProcessLogExample example);

    ProcessLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessLog record, @Param("example") ProcessLogExample example);

    int updateByExample(@Param("record") ProcessLog record, @Param("example") ProcessLogExample example);

    int updateByPrimaryKeySelective(ProcessLog record);

    int updateByPrimaryKey(ProcessLog record);
    List<ProcessLog> getByProcessCode(@Param("param") Map<String, Object> param);
}