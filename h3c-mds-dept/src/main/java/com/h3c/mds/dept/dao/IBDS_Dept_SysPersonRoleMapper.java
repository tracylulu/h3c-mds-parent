package com.h3c.mds.dept.dao;

import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.entity.IbdsDeptSysPersonRoleExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBDS_Dept_SysPersonRoleMapper {
    long countByExample(IbdsDeptSysPersonRoleExample example);

    int deleteByExample(IbdsDeptSysPersonRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_Dept_SysPersonRole record);

    int insertSelective(IBDS_Dept_SysPersonRole record);

    List<IBDS_Dept_SysPersonRole> selectByExample(IbdsDeptSysPersonRoleExample example);

    IBDS_Dept_SysPersonRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_Dept_SysPersonRole record, @Param("example") IbdsDeptSysPersonRoleExample example);

    int updateByExample(@Param("record") IBDS_Dept_SysPersonRole record, @Param("example") IbdsDeptSysPersonRoleExample example);

    int updateByPrimaryKeySelective(IBDS_Dept_SysPersonRole record);

    int updateByPrimaryKey(IBDS_Dept_SysPersonRole record);
    
    //add by chenlulu on 20200313
    /*
	 * 根据部门ID查询系统人员角色表
	 */
	List<IBDS_Dept_SysPersonRole> getUserByDeptCode(@Param("params")Map<String,String> params);
	
	List<Map> getMessageByDeptCode(@Param("params")Map<String,String> params);
	
	List<Map> getMessageByDeptCodeForAdmin(@Param("params")Map<String,String> params);
    
	List<IBDS_Dept_SysPersonRole> selectRoleListByParam(Map map);
}