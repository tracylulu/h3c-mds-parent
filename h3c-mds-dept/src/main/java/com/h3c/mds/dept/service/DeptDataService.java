package com.h3c.mds.dept.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.dept.entity.DeptData;

public interface DeptDataService {
	public int insertDeptDataTemp(List<Map> deptDataList);
	public int insertDeptData();
	public int deleteDeptDataTemp();
	public int deleteDeptData();
	public List<DeptData> selectDeptData();
	public List<DeptData> selectDeptDataTemp();
	public int renewDeptDataTemp(List<Map> deptDataList);
	public int renewDeptData();
	public int insertDeptMgn();
	public List<DeptData> selectDeptDataByParam(Map map);
	
	

}
