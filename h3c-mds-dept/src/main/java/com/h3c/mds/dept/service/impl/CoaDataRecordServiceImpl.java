package com.h3c.mds.dept.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.dept.dao.DeptDataMapper;
import com.h3c.mds.dept.dao.IbdsDeptCoaDataRecordMapper;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IbdsDeptCoaDataRecord;
import com.h3c.mds.dept.service.DeptDataService;
import com.h3c.mds.dept.service.IbdsDeptCoaDataRecordService;

@Service
public class CoaDataRecordServiceImpl implements IbdsDeptCoaDataRecordService {

	@Autowired
	IbdsDeptCoaDataRecordMapper  recordMapper;

	

	/*@Override
	public int deleteDataRecord() {
		return recordMapper.deleteDataRecord();
	}

	@Override
	public List<IBDS_Dept_CoaDataRecord> selectDataRecord() {
		return recordMapper.selectDataRecord();
	}*/

	@Override
	public int updateByPrimaryKey(IbdsDeptCoaDataRecord record) {
		return recordMapper.updateByPrimaryKey(record);
	}

	@Override
	public int insertDataRecord(IbdsDeptCoaDataRecord record) {
		return recordMapper.insertDataRecord(record);
	}

	@Override
	public List<IbdsDeptCoaDataRecord> getListByParam(Map map) {
		return recordMapper.getListByParam(map);
	}

	
	
	
	
	
	
	
	
	
	
	
}