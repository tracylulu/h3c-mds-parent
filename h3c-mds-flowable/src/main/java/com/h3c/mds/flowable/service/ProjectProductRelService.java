package com.h3c.mds.flowable.service;

import java.util.List;

import com.h3c.mds.flowable.entity.ProjectProductRel;

public interface ProjectProductRelService {

	/**
	 *新增项目，产品对应关系
	 * @param projectProductRel
	 * @return
	 */
	public int addProjectProductRel(ProjectProductRel projectProductRel);
	
	
	/**
	 * 编辑项目，产品对应关系
	 * @param projectProductRel
	 * @return
	 */
	public int updateProjectProductRelByPrimary(ProjectProductRel projectProductRel);
	
	/**
	 * 删除项目，产品对应关系
	 * @param projectCodeNum
	 * @return
	 */
	public int delProjectProductRel(Integer projectCodeId);
	
	/**
	 * 通过项目编码获取相应的产品
	 * @param projectCode
	 * @return
	 */
	public List<ProjectProductRel> getProjectProductRelByProjectCode(String projectCode);
	
	
	/**
	 * 通过id获取相应的产品
	 * @param projectCode
	 * @return
	 */
	public List<ProjectProductRel> getProjectProductRelByPId(Integer id);
}
