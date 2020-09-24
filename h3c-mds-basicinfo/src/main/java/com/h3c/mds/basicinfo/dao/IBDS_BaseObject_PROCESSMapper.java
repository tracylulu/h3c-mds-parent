package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExample;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExt;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_BaseObject_PROCESSMapper {
    long countByExample(IBDS_BaseObject_PROCESSExample example);

    int deleteByExample(IBDS_BaseObject_PROCESSExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_BaseObject_PROCESS record);

    int insertSelective(IBDS_BaseObject_PROCESS record);

    List<IBDS_BaseObject_PROCESS> selectByExample(IBDS_BaseObject_PROCESSExample example);

    IBDS_BaseObject_PROCESS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_BaseObject_PROCESS record, @Param("example") IBDS_BaseObject_PROCESSExample example);

    int updateByExample(@Param("record") IBDS_BaseObject_PROCESS record, @Param("example") IBDS_BaseObject_PROCESSExample example);

    int updateByPrimaryKeySelective(IBDS_BaseObject_PROCESS record);

    int updateByPrimaryKey(IBDS_BaseObject_PROCESS record);
    
     void insertAndGetId(IBDS_BaseObject_PROCESS record);
    
    String getMaxCode();
    
    IBDS_BaseObject_PROCESSExt getExtById(Integer id);
}