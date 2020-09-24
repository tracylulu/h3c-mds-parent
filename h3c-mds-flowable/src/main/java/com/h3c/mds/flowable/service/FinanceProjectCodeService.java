package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;


/**
 * 向财务参考信息中写数据，外部接口
 * @author l20095
 *
 */
public interface FinanceProjectCodeService {

	/**
	 * 新增项目编码
	 * @param FProjectCode
	 * @return
	 */
	public int addProjectCode(String processInsId);
	
	
	/**
	 * 更新项目编码
	 * @param processInsId
	 * @return
	 */
	public int updateProjectCode(String processInsId);
	
	
	/**
	 * 停用项目编码
	 * @return
	 */
	public int delProjectCode(String processInsId);
	
	/**
	 * 向项目编码写入历史数据
	 * @param processInsId
	 * @return
	 */
	public int handleHisProjectCode(ProjectCodeProcessExt projectCodeProcessExt);
	
}
