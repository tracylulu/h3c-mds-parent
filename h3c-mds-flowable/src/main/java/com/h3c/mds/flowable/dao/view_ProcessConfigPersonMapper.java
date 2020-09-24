package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.view_ProcessConfigPerson;
import com.h3c.mds.flowable.entity.view_ProcessConfigPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import java.util.Map;

public interface view_ProcessConfigPersonMapper {
    long countByExample(view_ProcessConfigPersonExample example);

    int deleteByExample(view_ProcessConfigPersonExample example);

    int insert(view_ProcessConfigPerson record);

    int insertSelective(view_ProcessConfigPerson record);

    List<view_ProcessConfigPerson> selectByExample(view_ProcessConfigPersonExample example);

    int updateByExampleSelective(@Param("record") view_ProcessConfigPerson record, @Param("example") view_ProcessConfigPersonExample example);

    int updateByExample(@Param("record") view_ProcessConfigPerson record, @Param("example") view_ProcessConfigPersonExample example);

    List<view_ProcessConfigPerson>  getTreeData(@Param("param") Map<String,String> params);
}