package com.h3c.mds.flowable.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.flowable.engine.HistoryService;
import org.flowable.engine.IdentityService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.service.ProductCodeFlowableService;

@Service
public class ProductCodeApplyFlowableServiceImpl implements ProductCodeFlowableService {

	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private ProcessEngine processEngine;
	@Autowired
	private HistoryService historyService;

	@Autowired
	private IdentityService identityService;

	@Override
	@Transactional
	public String startFlowable(String businessKey, Map<String, Object> variables) {
		// 开启流程
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(businessKey, variables);
		System.out.println("实例id：" + processInstance.getId());
		return processInstance.getId();

	}

	/**
	 * 开启流程并根据用户id通过第一个节点
	 * 
	 * @param businessKey
	 * @param userId
	 * @param variables
	 * @return
	 */
	@Override
	public String startFlowableAndPassOne(String businessKey, String userId, Map<String, Object> variables) {
		ProcessInstance processInstance = getProcessInstance(businessKey, variables);
		Task task = getTaskByInstanceIdAndUserId(processInstance.getId(), userId);
		passProcess(task.getId());
		return processInstance.getId();
	}

	@Transactional
	public ProcessInstance getProcessInstance(String businessKey, Map<String, Object> variables) {
		return runtimeService.startProcessInstanceByKey(businessKey, variables);
	}

	// 获取用户待办列表
	@Override
	@Transactional
	public void dutyList(String userId) {
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId).orderByTaskCreateTime().desc().list();
		for (Task task : tasks) {
			System.out.println("代办任务" + task.toString());
		}
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTaskByInstanceIdAndUserId(String instanceId, String userId) {
		return taskService.createTaskQuery().processInstanceId(instanceId).singleResult();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTaskByInstanceIdAndUserId1(String instanceId, String userId) {
		return taskService.createTaskQuery().processInstanceId(instanceId).taskAssignee(userId).singleResult();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTaskByInstanceId(String instanceId) {
		return taskService.createTaskQuery().processInstanceId(instanceId).singleResult();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public List<Task> getTaskListByInstanceId(String instanceId) {
		return taskService.createTaskQuery().processInstanceId(instanceId).list();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTask(String taskId) {
		return taskService.createTaskQuery().taskId(taskId).singleResult();
	}

	@Transactional
	public void passProcess(String taskId) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("checkResult", "同意");
		taskService.complete(taskId, map);
	}

	@Override
	public void pass(String taskId) {
		Task task = getTask(taskId);
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		// 通过审核
		passProcess(taskId);
	}

	@Override
	@Transactional
	public void reject(String taskId) {
		Task task = getTask(taskId);
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		// 通过审核
		HashMap<String, Object> map = new HashMap<>();
		map.put("checkResult", "不同意");
		taskService.complete(taskId, map);
	}

	@Transactional
	@Override
	public void changeHandler(String taskId, String userId) {

		Task task = getTask(taskId);
		if (task == null) {
			throw new RuntimeException("没有正在该任务");
		}
		taskService.setAssignee(taskId, userId);
	}
}
