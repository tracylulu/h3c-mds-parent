package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.RoleResourceRelation;
import com.h3c.mds.sysmgr.entity.RoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResourceRelationMapper {
    long countByExample(RoleResourceRelationExample example);

    int deleteByExample(RoleResourceRelationExample example);

    int deleteByPrimaryKey(Integer hrrrId);

    int insert(RoleResourceRelation record);

    int insertSelective(RoleResourceRelation record);

    List<RoleResourceRelation> selectByExample(RoleResourceRelationExample example);

    RoleResourceRelation selectByPrimaryKey(Integer hrrrId);

    int updateByExampleSelective(@Param("record") RoleResourceRelation record, @Param("example") RoleResourceRelationExample example);

    int updateByExample(@Param("record") RoleResourceRelation record, @Param("example") RoleResourceRelationExample example);

    int updateByPrimaryKeySelective(RoleResourceRelation record);

    int updateByPrimaryKey(RoleResourceRelation record);
    
    List<String> getResourceCodesByRoleCode(String roleCode);
    
    void deleteByRoleCode(String roleCode);
}