package com.h3c.mds.dept.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.dept.entity.IBDS_Dept_OperationLog;
import com.h3c.mds.dept.entity.view_DeptOperationLog;

public interface IbdsDeptOperationLogService {
	
	void saveLog(IBDS_Dept_OperationLog log);
	
	PageInfo<view_DeptOperationLog> pageOfDeptOptLog(Integer pageNum,Integer pageSize,Map<String,Object> param);

	view_DeptOperationLog getDeptOptLogById(Map<String,Object> param);
}
