package com.h3c.mds.flowable.service;

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

public interface WebFlowService {

	//提交申请
	public ProcessInstance addDeploy(String businessKey, Map<String, Object> variables);
	
	
	//查看历史流程
	
	
	//public List  listProcess();
	
	//查看待办任务
	
	public List<Task> listTaskByAssingee(String userId);
	
	//执行流程批准  同意
	
	public void apply(String taskId, Map<String, Object>variables);
	
	//拒绝
	
	//public void reject(String taskId);
	
	
	//生成流程图
	
	public void genProcessDiagram(String processId);
	
	
	public RuntimeService getRuntimeService();
	
	
	public TaskService getTaskService();
	
	
	public RepositoryService getRepositoryService();
	
	public ProcessEngine getProcessEngine();
	
	
	public HistoryService getHistoryService();
	
	
	public IdentityService getIdentityService();
	
	
	
	public boolean completeOwnerTask(String prodInsId, String userId, String dept);
}
