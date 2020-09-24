package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.IBDS_User_Resource;
import com.h3c.mds.sysmgr.entity.IBDS_User_ResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_User_ResourceMapper {
    long countByExample(IBDS_User_ResourceExample example);

    int deleteByExample(IBDS_User_ResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_User_Resource record);

    int insertSelective(IBDS_User_Resource record);

    List<IBDS_User_Resource> selectByExample(IBDS_User_ResourceExample example);

    IBDS_User_Resource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_User_Resource record, @Param("example") IBDS_User_ResourceExample example);

    int updateByExample(@Param("record") IBDS_User_Resource record, @Param("example") IBDS_User_ResourceExample example);

    int updateByPrimaryKeySelective(IBDS_User_Resource record);

    int updateByPrimaryKey(IBDS_User_Resource record);
    
    int delUserResource(String user);
}