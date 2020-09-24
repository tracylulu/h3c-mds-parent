package com.h3c.mds.flowable.listener;

import com.h3c.mds.flowable.util.FlowableCache;
import org.apache.commons.lang.StringUtils;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngines;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.api.Task;
import org.flowable.task.service.delegate.DelegateTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 会签任务节点监听器，监听事件 ALL
 */
public class CounterSignTaskListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        String eventName = delegateTask.getEventName();
        //创建时触发
        if("create".equals(eventName)){
            //流程图的流程id
            String processKey = delegateTask.getProcessDefinitionId().split(":")[0];
            //流程图中userTask 定义id 不是实例中usertask的id
            String taskDefinitionKey = delegateTask.getTaskDefinitionKey();
            FlowableCache.setCurrentNode(taskDefinitionKey);
            FlowableCache.setCurrentTask(delegateTask);
        }else if("complete".equals(eventName)){
            //完成时触发
            Map<String, Object> variables = delegateTask.getVariables();
            String checkResult = (String) variables.get("checkResult");
            if("不同意".equals(checkResult)){
                delegateTask.setVariable("signResult", "不同意");
            }else{
                //已完成任务数，不包括当前任务
                Integer nrOfCompletedInstances = (Integer) variables.get("nrOfCompletedInstances");
                //会签任务总数
                Integer nrOfInstances = (Integer) variables.get("nrOfInstances");
                //所有都完成，且都同意
                if((nrOfCompletedInstances+1)/nrOfInstances == 1){
                    delegateTask.setVariable("signResult", "同意");
                }else {
                    ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
                    RuntimeService runtimeService = engine.getRuntimeService();
                    TaskService taskService = engine.getTaskService();
                    List<Task> list = taskService.createTaskQuery().processInstanceId(delegateTask.getProcessInstanceId()).list();
                    List<String> handlers = new ArrayList<>();
                    for(Task task : list){
                        if(StringUtils.equals(task.getId(), delegateTask.getId())) continue;
                        if(!handlers.contains(task.getAssignee())){
                            handlers.add(task.getAssignee());
                        }
                    }
                    FlowableCache.setCurrentHandler(StringUtils.join(handlers, ","));
                    FlowableCache.setCurrentNode("no-update");
                    FlowableCache.setCurrentStatusDesc("no-update");
                }
            }
        }
    }
}
