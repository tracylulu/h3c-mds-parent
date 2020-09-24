package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.RoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer hrlId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer hrlId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role> getRolesByUserAccount(String account);
    
    
    /**
     * 获取所有不属于自己的角色
     * @param account
     * @return
     */
    List<Role> getRolesExceptSelf(String account);
    
    
    public String getMaxCode();
    
    /**
     * 获取所有角色
     * @return
     */
    List<Role>  getAllRoles();
}