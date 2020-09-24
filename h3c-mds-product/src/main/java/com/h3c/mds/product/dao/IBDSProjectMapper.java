package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDSProjectExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface IBDSProjectMapper {
    long countByExample(IBDSProjectExample example);

    int deleteByExample(IBDSProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDSProject record);

    int insertSelective(IBDSProject record);

    List<IBDSProject> selectByExample(IBDSProjectExample example);

    IBDSProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDSProject record, @Param("example") IBDSProjectExample example);

    int updateByExample(@Param("record") IBDSProject record, @Param("example") IBDSProjectExample example);

    int updateByPrimaryKeySelective(IBDSProject record);

    int updateByPrimaryKey(IBDSProject record);
    
    List<IBDSProject> getCurrentRAndChildBProject(@Param("param") Map<String,String> param);
}