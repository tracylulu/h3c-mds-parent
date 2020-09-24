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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.service.WebFlowService;

@Service
public class WebFlowServiceImpl implements WebFlowService{

	private static final Logger LOG = LoggerFactory.getLogger(WebFlowServiceImpl.class);
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
	public ProcessInstance addDeploy(String businessKey, Map<String, Object> variables) {

		return runtimeService.startProcessInstanceByKey(businessKey, variables);
//		return runtimeService.startProcessInstanceById(businessKey, variables);
	}
	@Override
	public List<Task> listTaskByAssingee(String userId) {
		List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId).orderByTaskCreateTime().desc().list();
		return tasks;
	}
	
	@Override
	public void apply(String taskId, Map<String, Object>variables) {
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if(task == null){
			throw new RuntimeException(taskId + " 任务不存在");
		}
		taskService.complete(taskId, variables);
	}
	
	@Override
	public void genProcessDiagram(String processId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public RuntimeService getRuntimeService() {
		// TODO Auto-generated method stub
		return this.runtimeService;
	}
	@Override
	public TaskService getTaskService() {
		// TODO Auto-generated method stub
		return this.taskService;
	}
	@Override
	public RepositoryService getRepositoryService() {
		// TODO Auto-generated method stub
		return this.repositoryService;
	}
	@Override
	public ProcessEngine getProcessEngine() {
		// TODO Auto-generated method stub
		return this.processEngine;
	}
	@Override
	public HistoryService getHistoryService() {
		// TODO Auto-generated method stub
		return this.historyService;
	}
	@Override
	public IdentityService getIdentityService() {
		// TODO Auto-generated method stub
		return this.identityService;
	}
	@Override
	public boolean completeOwnerTask(String prodInsId, String userId, String dept) {
		boolean flag = false;
		List<Task> taskList = getTask(prodInsId, userId);
		try {
			for(Task task : taskList){
				Map<String, Object> varMap = new HashMap<String, Object>();
				varMap.put("dept", dept);
				taskService.complete(task.getId(), varMap);
			}
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
	@Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
	public List<Task> getTask(String prodInsId, String userId)
	{
		LOG.info("压测流程id" + prodInsId  + " 压测用户id：" + userId);
		return taskService.createTaskQuery().processInstanceId(prodInsId).taskAssignee(userId).orderByTaskCreateTime().desc().list();
	}
}
