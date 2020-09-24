package com.h3c.mds.flowable.service;

/**
 * 把项目编码数据同步到研发项目基本信息中
 * @author l20095
 *
 */
public interface ProjectService {

	
	/**
	 * 新增研发项目
	 * @param proInsId  流程实例id
	 * @return
	 */
	public int addProject(String proInsId);
	
	
	/**
	 * 修改研发项目
	 * @param proInsId  流程实例id
	 * @return
	 */
	public int updateProject(String proInsId);
	
	
	/**
	 * 删除研发项目
	 * @param proInsId
	 * @return
	 */
	public int delProject(String proInsId);
	
}
