package com.h3c.mds.flowable.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.HistoryService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.history.HistoricActivityInstance;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.image.ProcessDiagramGenerator;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h3c.mds.flowable.service.WebFlowService;

@Controller
@RequestMapping(value = "webFlow")
public class WebFlowController {

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
	private WebFlowService webFlowService;
	
	@RequestMapping(value = "historyTask")
	@ResponseBody
	public String historyTask(String id){
		String assigns = "";
		List<HistoricActivityInstance> activities = historyService.createHistoricActivityInstanceQuery()
                .processInstanceId(id).finished().orderByHistoricActivityInstanceEndTime().asc()
                .list();

        for (HistoricActivityInstance activity : activities) {
            System.out.println(activity.getActivityId() + " took " + activity.getDurationInMillis() + " milliseconds");
            assigns += activity.getAssignee();
        }
        return assigns;
	}
	
	
	@RequestMapping(value = "listIdentities")
	@ResponseBody
	public String listHisIdentitylink(String userId){
		
		List<HistoricActivityInstance> users = webFlowService.getHistoryService().
				createHistoricActivityInstanceQuery().taskAssignee(userId).list();
		
		System.out.println(users.size());
		
		return users.toString();
	}
	
	
	
	
	//个人代办任务节点
	
	@RequestMapping(value = "listTasks")
	@ResponseBody
	public String taskList(String userId){
		List<HistoricActivityInstance> list = webFlowService.getProcessEngine().getHistoryService()
				.createHistoricActivityInstanceQuery().finished().list();
		
		return list.toString();
	}
	
	/**
	 * 添加报销
	 *
	 * @param userId
	 *            用户Id
	 * @param money
	 *            报销金额
	 * @param descption
	 *            描述
	 */
	@RequestMapping(value = "add")
	@ResponseBody
	public String addExpense(String businessKey, String userId, Integer money, String descption) {
		// 启动流程
		HashMap<String, Object> map = new HashMap<>();
		map.put("taskUser", userId);
		map.put("money", money);
		//这里可以指定下一步计划的人
		map.put("deptMng", "李晟");
		
		//提交流程
//		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(businessKey, map);
		ProcessInstance processInstance = webFlowService.addDeploy(businessKey, map);
		return "提交成功.流程Id为：" + processInstance.getId();
	}

	/**
	 * 获取审批管理列表
	 */
	@RequestMapping(value = "/list")
	@ResponseBody
	public List<Map<String,String>> list(String userId) {
		List<Map<String,String>> list = new ArrayList<>();
		//根据用户ID查询流程
//		List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId).orderByTaskCreateTime().desc().list();
		List<Task> tasks = webFlowService.listTaskByAssingee(userId);
//		List<Task> tasks = webFlowService.getTaskService().createTaskQuery()
//				.taskOwner(userId).list();
		for (Task task : tasks) {
			Map<String,String> map = new HashMap<>(); 
			map.put("process id",task.getProcessInstanceId());
			map.put("assignee",task.getAssignee());
			map.put("id",task.getId());
			map.put("name",task.getName());
			list.add(map);
		}
		System.out.println(list);
		return list;
	}

	/**
	 * 重新指定办理人
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/reAssign")
	@ResponseBody
	public String reAssign(String taskId, String userId){
		//这个只有在原来没有候选人的时候才生效
//		webFlowService.getTaskService().claim(taskId, userId);
		//指定别干某件事情，owner_是原来的申请人，assignee_是新指定的人
		webFlowService.getTaskService().delegateTask(taskId, userId);
		return "ok";
	}
	
	
	/**
	 * 批准
	 *
	 * @param taskId
	 *            任务ID
	 */
	@RequestMapping(value = "userApply")
	@ResponseBody
	public String userApply(String taskId) {
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		// 通过审核
		HashMap<String, Object> map = new HashMap<>();
		map.put("outcome", "通过");
		//添加项目经理执行人
		List<String> projectMngs = new ArrayList<String>();
		projectMngs.add("项目经理1");
		projectMngs.add("项目经理2");
		map.put("projectMngs", projectMngs);
		//添加产品经理执行人
		List<String> productMngs = new ArrayList<String>();
		productMngs.add("产品经理1");
		productMngs.add("产品经理经理2");
		map.put("productMngs", productMngs);
		//taskService.setAssignee(taskId, "aa");
		webFlowService.apply(taskId, map);
//		taskService.complete(taskId, map);
		return "processed ok!";
	}

	@RequestMapping(value = "projectMngApply")
	@ResponseBody
	public String projectMngApply(String taskId){
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		// 通过审核
		HashMap<String, Object> map = new HashMap<>();
		map.put("outcome", "通过");
		//添加boss
		map.put("boss", "大boss");
		//taskService.setAssignee(taskId, "aa");
		webFlowService.apply(taskId, map);
//		taskService.complete(taskId, map);
		return "processed ok!";
	}
	
	@RequestMapping(value = "productMngApply")
	@ResponseBody
	public String productMngApply(String taskId){
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("boss", "小boss");
		webFlowService.apply(taskId, map);
//		taskService.complete(taskId, map);
		return "processed ok!";
	}
	
	
	@RequestMapping(value = "bossMngApply")
	@ResponseBody
	public String bossMngApply(String taskId){
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		// 通过审核
		HashMap<String, Object> map = new HashMap<>();
		map.put("outcome", "通过");
		//添加项目经理执行人
		List<String> projectMngs = new ArrayList<String>();
		projectMngs.add("项目经理1");
		projectMngs.add("项目经理2");
		map.put("projectMngs", projectMngs);
		//添加产品经理执行人
		List<String> productMngs = new ArrayList<String>();
		productMngs.add("产品经理1");
		productMngs.add("产品经理经理2");
		map.put("productMngs", productMngs);
		//taskService.setAssignee(taskId, "aa");
		webFlowService.apply(taskId, map);
//		taskService.complete(taskId, map);
		return "processed ok!";
	}
	/**
	 * 拒绝
	 */
	@ResponseBody
	@RequestMapping(value = "reject")
	public String reject(String taskId) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("outcome", "驳回");
//		taskService.complete(taskId, map);
		webFlowService.apply(taskId, map);
		return "reject";
	}

	/**
	 * 生成流程图
	 *
	 * @param processId
	 *            任务ID
	 */
	@RequestMapping(value = "processDiagram")
	public void genProcessDiagram(HttpServletResponse httpServletResponse, String processId) throws Exception {
		ProcessInstance pi = runtimeService.createProcessInstanceQuery().processInstanceId(processId).singleResult();
		// 流程走完的不显示图
		if (pi == null) {
			return;
		}
		//这里有好几个任务，不是一个
		Task task = taskService.createTaskQuery().processInstanceId(pi.getId()).list().get(0);
		// 使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
		String InstanceId = task.getProcessInstanceId();
		List<Execution> executions = runtimeService.createExecutionQuery().processInstanceId(InstanceId).list();

		// 得到正在执行的Activity的Id
		List<String> activityIds = new ArrayList<>();
		List<String> flows = new ArrayList<>();
		for (Execution exe : executions) {
			List<String> ids = runtimeService.getActiveActivityIds(exe.getId());
			activityIds.addAll(ids);
		}

		// 获取流程图
		BpmnModel bpmnModel = repositoryService.getBpmnModel(pi.getProcessDefinitionId());
		ProcessEngineConfiguration engconf = processEngine.getProcessEngineConfiguration();
		ProcessDiagramGenerator diagramGenerator = engconf.getProcessDiagramGenerator();
		InputStream in = diagramGenerator.generateDiagram(bpmnModel, "png", activityIds, flows,
				engconf.getActivityFontName(), engconf.getLabelFontName(), engconf.getAnnotationFontName(),
				engconf.getClassLoader(), 1.0);
		OutputStream out = null;
		byte[] buf = new byte[1024];
		int legth = 0;
		try {
			out = httpServletResponse.getOutputStream();
			while ((legth = in.read(buf)) != -1) {
				out.write(buf, 0, legth);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
	
	

}
