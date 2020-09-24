package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.entity.ProcessConfigItemExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ProcessConfigItemMapper {
    long countByExample(ProcessConfigItemExample example);

    int deleteByExample(ProcessConfigItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessConfigItem record);

    int insertSelective(ProcessConfigItem record);

    List<ProcessConfigItem> selectByExample(ProcessConfigItemExample example);

    ProcessConfigItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessConfigItem record, @Param("example") ProcessConfigItemExample example);

    int updateByExample(@Param("record") ProcessConfigItem record, @Param("example") ProcessConfigItemExample example);

    int updateByPrimaryKeySelective(ProcessConfigItem record);

    int updateByPrimaryKey(ProcessConfigItem record);
    
    ProcessConfigItem getByConfigCodeAndCode(@Param("params") Map<String,Object> params);
    
    List<ProcessConfigItem> getTreeData(@Param("param") Map<String,String> param);
    
    String getMaxCode();
    
    List<ProcessConfigItem>  getByConfigCode(@Param("params") Map<String,Object> params);
    
    List<ProcessConfigItem>  getAddPageList(@Param("param") Map<String,String> params);

    List<ProcessConfigItem> getByProdlineId(Integer prodlineId);

    List<ProcessConfigItem> getByProdlineIdFromBase(Integer prodlineId);

    List<ProcessConfigItem> getByProdlineCodeFromBase(String prodlineCode);

    List<ProcessConfigItem> getByProdlineName(String prodlineName);
}