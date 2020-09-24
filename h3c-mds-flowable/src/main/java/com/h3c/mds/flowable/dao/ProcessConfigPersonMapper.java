package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.flowable.entity.ProcessConfigPersonExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProcessConfigPersonMapper {
    long countByExample(ProcessConfigPersonExample example);

    int deleteByExample(ProcessConfigPersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessConfigPerson record);

    int insertSelective(ProcessConfigPerson record);

    List<ProcessConfigPerson> selectByExample(ProcessConfigPersonExample example);

    ProcessConfigPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessConfigPerson record, @Param("example") ProcessConfigPersonExample example);

    int updateByExample(@Param("record") ProcessConfigPerson record, @Param("example") ProcessConfigPersonExample example);

    int updateByPrimaryKeySelective(ProcessConfigPerson record);

    int updateByPrimaryKey(ProcessConfigPerson record);

    List<ProcessConfigPerson> getByProcessCodeAndRoleCode(@Param("params") Map<String,Object> params);
    
    int checkRepeat(@Param("param") Map<String,String> params);
}