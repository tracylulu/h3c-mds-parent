package com.h3c.mds.dept.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.dept.dao.DeptDataMapper;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.service.DeptDataService;

@Service
public class DeptDataServiceImpl implements DeptDataService {

	@Autowired
	DeptDataMapper  deptDataMapper;
	@Override
	@Transactional
	public int insertDeptDataTemp(List<Map> deptDataList) {
		//处理sonar检测的问题：Replace the type specification in this constructor call with the diamond operator ("<>").
		List<Map> addList=new ArrayList<>();
		for (int i=0;i<deptDataList.size();i++) {
			Map deptData =deptDataList.get(i);
			addList.add(deptData);
			if (addList.size() == 320) {
				deptDataMapper.insertDeptDataTemp(addList);
				addList.clear();
			}
		}
		deptDataMapper.insertDeptDataTemp(addList);
		return 1;
		
	}
	
	@Override
	@Transactional
	public int insertDeptData() {
		return deptDataMapper.insertDeptData();
	}

	@Override
	@Transactional
	public int deleteDeptDataTemp() {
		return deptDataMapper.deleteDeptDataTemp();
	}
	
	@Override
	@Transactional
	public int deleteDeptData() {
		return deptDataMapper.deleteDeptData();
	}

	@Override
	public List<DeptData> selectDeptDataTemp() {
		return deptDataMapper.selectDeptDataTemp();
	}
	
	@Override
	public List<DeptData> selectDeptData() {
		return deptDataMapper.selectDeptData();
	}
	
	@Override
	public List<DeptData> selectDeptDataByParam(Map map) {
		return deptDataMapper.selectDeptDataByParam(map);
	}
	
	
	@Override
	@Transactional
	public int renewDeptDataTemp(List<Map> deptDataList) {
		deleteDeptDataTemp();
		insertDeptDataTemp(deptDataList);
		return 1;
	}
	
	@Override
	@Transactional
	public int renewDeptData() {
		deleteDeptData();
		insertDeptData();
		return 1;
	}
	
	@Override
	@Transactional
	public int insertDeptMgn() {
		return deptDataMapper.insertDeptMgn();
	}

}
