package com.h3c.mds.dept.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.dept.entity.IbdsDeptCoaDataRecord;

public interface IbdsDeptCoaDataRecordService {
	int insertDataRecord(IbdsDeptCoaDataRecord record);
	//int deleteDataRecord();
	//List<IBDS_Dept_CoaDataRecord> selectDataRecord();
	int updateByPrimaryKey(IbdsDeptCoaDataRecord record);
	List<IbdsDeptCoaDataRecord> getListByParam(Map map);
}
