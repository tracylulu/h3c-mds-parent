package com.h3c.mds.flowable.service;

import java.util.List;

import com.h3c.mds.flowable.entity.IbdsTask;

public interface IbdsTaskService {

	/**
	 * 新增任务, 如果已经存在，则删除原来任务，再新建一个任务，更新erp申请单号
	 * @param task
	 * @return
	 */
	int addTask(IbdsTask task);
	
	/**
	 * 修改任务
	 * @param task
	 * @return
	 */
	int updateTask(IbdsTask task);
	
	/**
	 * 根据任务id查询任务
	 * @param id
	 * @return
	 */
	IbdsTask getTaskById(Integer id);
	
	/**
	 * 获取所有未执行完毕的任务
	 * @return
	 */
	List<IbdsTask> getUnHandleTask();
	
	
	List<IbdsTask> getUnHandleCoaTask();
	
	/**
	 * 通过任务状态状态查询出相关任务
	 * @param status
	 * @return
	 */
	List<IbdsTask> getTaskByStatus(String status);
	
	/**
	 * 查询出执行成功的任务
	 * @return
	 */
	List<IbdsTask> getSuccessTask();
	
	
	List<IbdsTask> getFailTask();
	
	/**
	 * 由当前申请单号获取erp单号
	 * @param applyNo
	 * @return
	 */
	String getExistErpImportNoByApplyNo(String applyNo);
	
	/**
	 * 获取最新的erp单号
	 * @param applyNo
	 * @return
	 */
	String getNewErpImportNoByApplyNo(String applyNo);
	
	/**
	 * 根据任务id获取任务
	 * @param taskId
	 * @return
	 */
	List<IbdsTask> getTaskByTaskId(String taskId);
	
	/**
	 * 根据任务id删除相应的任务
	 * @param taskId
	 * @return
	 */
	int deleteTaskByTaskId(String taskId);
}
