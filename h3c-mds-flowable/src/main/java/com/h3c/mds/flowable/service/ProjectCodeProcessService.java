package com.h3c.mds.flowable.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.ProjectCodeProcess;

public interface ProjectCodeProcessService {

	/**
	 * 新增项目编码流程相关
	 * @param projectCodeProcess
	 * @return
	 */
	public int addProjectCodeProcess(ProjectCodeProcess projectCodeProcess);
	
	
	
	/**
	 * 修改项目编码流程相关
	 * @param projectCodeApply
	 * @return
	 */
	public int updateProjectCodeProcess(ProjectCodeProcess projectCodeProcess);
	
	/**
	 * 通过流程实例id获取流程相关数据
	 * @param proInsId
	 * @return
	 */
	public ProjectCodeProcess getProjectCodeProcessByProcessId(String proInsId);
	
	/**
	 * 通过流程实例id获取流程相关数据
	 * @param proInsId
	 * @return
	 */
	public ProjectCodeProcess getProjectCodeProcessByProcessId1(String proInsId);
	
	
	/***
	 * 通过申请单号获取流程相关数据
	 * @param applyNo
	 * @return
	 */
	public ProjectCodeProcess getProjectCodeProcessByApplyNo(String applyNo);
	
	public PageInfo<ProjectCodeProcess> findByPage(Integer page, Integer rows, String searchStr);
	
	/**
	 * 删除项目编码流程相关
	 * @param proInsId
	 * @return
	 */
	public int delProjectCodeProcessByApplyNo(String applyNo);
	
	
	/**
	 * 按照申请编号查询Tree
	 * @param id
	 * @return
	 */
	public PageInfo<Map<String, Object>> findProjectCodeByApplyNo(Integer page, Integer rows, String searchParams);
	
	/**
	 * 按照申请人查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByApplyer(Map<String, Object> param);
	
	/**
	 * 按照状态查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByStatus(Map<String, Object> param);
	
	/**
	 * 按照未关闭流程查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByProcess(Map<String, Object> param);
	
	/**
	 * 按照当前责任人查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByCurHandler(Map<String, Object> param);
	
	
	/**
	 * 获取申请编码
	 * @return
	 */
	public String getMaxCode();
	
	public List<ProjectCodeProcess> getZTProjectCodeProcessByProjNumber(String projNum, String status, String applyNo);
}
