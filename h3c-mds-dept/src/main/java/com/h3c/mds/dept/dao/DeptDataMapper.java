package com.h3c.mds.dept.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.dept.entity.DeptData;

public interface DeptDataMapper {
	int insertDeptData();
	int deleteDeptData();
	List<DeptData> selectDeptData();
	List<DeptData> selectDeptDataTemp();
	int insertDeptMgn();
	List<DeptData> selectDeptDataByParam(Map map);
	int insertDeptDataTemp(List<Map> deptDataList);
	int deleteDeptDataTemp();
	
	List<DeptData> getAll();

}
