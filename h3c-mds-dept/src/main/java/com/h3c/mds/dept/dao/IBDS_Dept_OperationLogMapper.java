package com.h3c.mds.dept.dao;

import com.h3c.mds.dept.entity.IBDS_Dept_OperationLog;
import com.h3c.mds.dept.entity.IbdsDeptOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_Dept_OperationLogMapper {
    long countByExample(IbdsDeptOperationLogExample example);

    int deleteByExample(IbdsDeptOperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_Dept_OperationLog record);

    int insertSelective(IBDS_Dept_OperationLog record);

    List<IBDS_Dept_OperationLog> selectByExample(IbdsDeptOperationLogExample example);

    IBDS_Dept_OperationLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_Dept_OperationLog record, @Param("example") IbdsDeptOperationLogExample example);

    int updateByExample(@Param("record") IBDS_Dept_OperationLog record, @Param("example") IbdsDeptOperationLogExample example);

    int updateByPrimaryKeySelective(IBDS_Dept_OperationLog record);

    int updateByPrimaryKey(IBDS_Dept_OperationLog record);
}