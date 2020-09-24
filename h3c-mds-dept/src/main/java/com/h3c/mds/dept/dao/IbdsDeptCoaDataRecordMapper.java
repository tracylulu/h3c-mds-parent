package com.h3c.mds.dept.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.dept.entity.IbdsDeptCoaDataRecord;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
//不符合UpperCamelCase命名风格
public interface IbdsDeptCoaDataRecordMapper {
	int insertDataRecord(IbdsDeptCoaDataRecord record);
	int deleteDataRecord();
	List<IbdsDeptCoaDataRecord> selectDataRecord();
	int updateByPrimaryKey(IbdsDeptCoaDataRecord record);
	
	/*
	 * 根据标记查询列表
	 */
	List<IbdsDeptCoaDataRecord> getListByParam(Map map);
	
}
