package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProcessConfig;
import com.h3c.mds.flowable.entity.ProcessConfigExample;
import com.h3c.mds.flowable.entity.ProcessConfigItem;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProcessConfigMapper {
    long countByExample(ProcessConfigExample example);

    int deleteByExample(ProcessConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessConfig record);

    int insertSelective(ProcessConfig record);

    List<ProcessConfig> selectByExample(ProcessConfigExample example);

    ProcessConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessConfig record, @Param("example") ProcessConfigExample example);

    int updateByExample(@Param("record") ProcessConfig record, @Param("example") ProcessConfigExample example);

    int updateByPrimaryKeySelective(ProcessConfig record);

    int updateByPrimaryKey(ProcessConfig record);   
   
 
}