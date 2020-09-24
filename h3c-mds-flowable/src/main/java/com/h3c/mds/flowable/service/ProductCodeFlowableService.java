package com.h3c.mds.flowable.service;

import org.flowable.task.api.Task;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface ProductCodeFlowableService {

	/**
	 * 开启流程
	 * @return
	 */
	String startFlowable(String businessKey, Map<String, Object> variables);

	void reject(String taskId);

	/**
	 * 开启流程并根据用户id通过第一个节点
	 * @param businessKey
	 * @param userId
	 * @param variables
	 * @return
	 */
	String startFlowableAndPassOne(String businessKey, String userId, Map<String, Object> variables);

	void dutyList(String userId);

	Task getTaskByInstanceIdAndUserId(String instanceId, String userId);

	@Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
	Task getTaskByInstanceIdAndUserId1(String instanceId, String userId);

	@Transactional(readOnly=true,propagation= Propagation.REQUIRES_NEW)
	Task getTaskByInstanceId(String instanceId);

	@Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
	List<Task> getTaskListByInstanceId(String instanceId);

	@Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
	Task getTask(String taskId);

	void pass(String taskId);

	@Transactional
	void changeHandler(String taskId, String userId);
}
