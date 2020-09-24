package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDSProjectExample;
import com.h3c.mds.product.entity.ProjectView;

public interface IBDS_ProjectService {

	/**
	 * 查询展现tree形表格
	 * @param param
	 * @return
	 */
	public List<ProjectView> getTreeData(Map<String, String> param);
	
	public ProjectView selectByCode(String code);
	
	/**
	 * 新增研发项目
	 * @param project
	 * @return
	 */
	public int addIBDSProject(IBDSProject project);
	
	/**
	 * 更新研发项目
	 * @param project
	 * @return
	 */
	public int editIBDSProject(IBDSProject project);
	
	/**
	 * 项目编码流程修改研发项目
	 * @param project
	 * @return
	 */
	public int updateIBDSProject(IBDSProject project);
	
	/**
	 * 获取最新内码
	 * @return
	 */
	String getMaxCode();
	
	/*
	 *通过内码获取研发项目 
	 */
	public IBDSProject getProjectByCode(String code);
	
	/**
	 * 根据研发项目对应的财务编码获取研发项目
	 * @param coaCode
	 * @return
	 */
	public IBDSProject getProjectByCoaCode(String coaCode);
	
	public List<IBDSProject> selectByExample(IBDSProjectExample example);
	
	/**
	 * 获取当前R及R下属B层级的研发项目
	 * @param releaseno
	 * @return
	 */
	public List<IBDSProject> getCurrentRAndChildBProject(String releaseno);
}
