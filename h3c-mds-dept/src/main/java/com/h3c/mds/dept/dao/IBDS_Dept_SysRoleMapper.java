package com.h3c.mds.dept.dao;

import com.h3c.mds.dept.entity.IBDS_Dept_SysRole;
import com.h3c.mds.dept.entity.IbdsDeptSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_Dept_SysRoleMapper {
    long countByExample(IbdsDeptSysRoleExample example);

    int deleteByExample(IbdsDeptSysRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_Dept_SysRole record);

    int insertSelective(IBDS_Dept_SysRole record);

    List<IBDS_Dept_SysRole> selectByExample(IbdsDeptSysRoleExample example);

    IBDS_Dept_SysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_Dept_SysRole record, @Param("example") IbdsDeptSysRoleExample example);

    int updateByExample(@Param("record") IBDS_Dept_SysRole record, @Param("example") IbdsDeptSysRoleExample example);

    int updateByPrimaryKeySelective(IBDS_Dept_SysRole record);

    int updateByPrimaryKey(IBDS_Dept_SysRole record);
}