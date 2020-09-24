package com.h3c.mds.dept.dao;

import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IbdsDeptMgnRoleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBDS_Dept_MgnRoleMapper {
    long countByExample(IbdsDeptMgnRoleExample example);

    int deleteByExample(IbdsDeptMgnRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_Dept_MgnRole record);

    int insertSelective(IBDS_Dept_MgnRole record);

    List<IBDS_Dept_MgnRole> selectByExample(IbdsDeptMgnRoleExample example);

    IBDS_Dept_MgnRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_Dept_MgnRole record, @Param("example") IbdsDeptMgnRoleExample example);

    int updateByExample(@Param("record") IBDS_Dept_MgnRole record, @Param("example") IbdsDeptMgnRoleExample example);

    int updateByPrimaryKeySelective(IBDS_Dept_MgnRole record);

    int updateByPrimaryKey(IBDS_Dept_MgnRole record);
    
    //add by chenlulu
    //一级部门详细信息编辑页面回显 回显的是MgnRole这个歌表信息，根据部门编码和部门名称查询部门信息
    public List<Map<String, Object>> getYiJiDeptMgnRoleByCode(@Param("param")Map<String, Object> param);
    
    
}