package com.h3c.mds.dept.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.dept.dao.IBDS_Dept_OperationLogMapper;
import com.h3c.mds.dept.dao.view_DeptOperationLogMapper;
import com.h3c.mds.dept.entity.IBDS_Dept_OperationLog;
import com.h3c.mds.dept.entity.view_DeptOperationLog;
import com.h3c.mds.dept.service.IbdsDeptOperationLogService;

@Service
public class IbdsDeptOperationLogServiceImpl implements IbdsDeptOperationLogService {
	@Autowired
	private IBDS_Dept_OperationLogMapper deptLogMapper;
	@Autowired
	private view_DeptOperationLogMapper vOptLogMapper;
	
	/**
	 * 保存日志
	 */
	@Override
	public void saveLog(IBDS_Dept_OperationLog log) {
		deptLogMapper.insertSelective(log);
	}
	
	/**
	 * 日志列表分页
	 */
	@Override
	public PageInfo<view_DeptOperationLog> pageOfDeptOptLog(Integer pageNum,Integer pageSize,Map<String,Object> param){
		com.github.pagehelper.page.PageMethod.startPage(pageNum, pageSize);
		List<view_DeptOperationLog> lst = vOptLogMapper.getList(param);
		PageInfo<view_DeptOperationLog> pageInfo = new PageInfo<>(lst);
		
		return pageInfo;
	}
	
	/**
	 * 获取部门操作日志列表
	 */
	@Override
	public view_DeptOperationLog getDeptOptLogById(Map<String,Object> param){
		List<view_DeptOperationLog> lst = vOptLogMapper.getList(param);
		if(lst!=null&&lst.size()>0) {
			return lst.get(0);
		}
		return new view_DeptOperationLog();
	}

}
