package com.h3c.mds.flowable.service;

import java.util.List;

import com.h3c.mds.flowable.entity.ProjectCodeApply;

public interface ProjectCodeApplyService {

	/**
	 * 新增项目
	 * @param projectCodeApply
	 * @return
	 */
	public int addProjectCode(ProjectCodeApply projectCodeApply);
	
	
	
	/**
	 * 修改项目
	 * @param projectCodeApply
	 * @return
	 */
	public int updateProjectCode(ProjectCodeApply projectCodeApply);
	
	
	/**
	 * 回填项目编码
	 * @param proInsId
	 * @param proName
	 * @return
	 */
	public int updateProjectCodeByApplyNoAndProName(ProjectCodeApply projectCodeApply);
	
	
	/**
	 * 删除项目
	 * @param projectCodeNo 项目编码
	 * @return
	 */
	public int delProjectCodeByApplyNoAndProjectCode(String projectCodeNo, String applyNo);
	
	/**
	 * 通过项目编码内码获取项目编码
	 * @param projectNum
	 * @return
	 */
	public List<ProjectCodeApply> getProjectCodeApplyByProjectCode(String projectNum);
	
	/**
	 * 通过B版本内码内码获取项目编码
	 * @param bversionNo
	 * @return
	 */
	public List<ProjectCodeApply> getProjectCodeApplyByBversionNo(String bversionNo);
	
	/**
	 * 通过R版本内码获取项目编码
	 * @param projectNum
	 * @return
	 */
	public List<ProjectCodeApply> getProjectCodeApplyByReleaseNo(String releaseNo);
	
	
	/**
	 * 通过项目名称获取项目
	 * @param projectName
	 * @return
	 */
	public ProjectCodeApply getProjectCodeApplyByProjectName(String projectName);
	
	
	public List<ProjectCodeApply> getProjectCodeApplyByApplyNo(String applyNO);
}
