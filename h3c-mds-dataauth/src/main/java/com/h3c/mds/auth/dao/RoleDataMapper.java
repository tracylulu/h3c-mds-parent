package com.h3c.mds.auth.dao;

import com.h3c.mds.auth.entity.RoleData;
import com.h3c.mds.auth.entity.RoleDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleDataMapper {
    long countByExample(RoleDataExample example);

    int deleteByExample(RoleDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleData record);

    int insertSelective(RoleData record);

    List<RoleData> selectByExample(RoleDataExample example);

    RoleData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleData record, @Param("example") RoleDataExample example);

    int updateByExample(@Param("record") RoleData record, @Param("example") RoleDataExample example);

    int updateByPrimaryKeySelective(RoleData record);

    int updateByPrimaryKey(RoleData record);
}