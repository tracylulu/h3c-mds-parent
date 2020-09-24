package com.h3c.mds.flowable.listener;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.flowable.service.ProcessConfigPersonService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.SpringContextUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 用户任务监听器创建时该usertask时触发
 */
public class UserTaskCreateListener implements TaskListener {

    private static final Logger logger = LoggerFactory.getLogger(UserTaskCreateListener.class);

    @Override
    public void notify(DelegateTask delegateTask) {
        try {
            Map<String, Object> variables = delegateTask.getVariables();
            ProcessConfigItemService itemService = (ProcessConfigItemService) SpringContextUtils.getBean(ProcessConfigItemService.class);
            ProcessConfigPersonService personService = (ProcessConfigPersonService) SpringContextUtils.getBean(ProcessConfigPersonService.class);

            //流程图的流程id
            String processKey = delegateTask.getProcessDefinitionId().split(":")[0];
            //流程图中userTask 定义id 不是实例中usertask的id
            String taskDefinitionKey = delegateTask.getTaskDefinitionKey();
            FlowableCache.setCurrentNode(taskDefinitionKey);
            ProcessConfigItem configItem = itemService.getByConfigCodeAndCode(processKey, taskDefinitionKey);
            FlowableCache.setCurrentTask(delegateTask);
            //TODO 目前先不考虑组任务
            if("current_user".equals(configItem.getType())){
                FlowableCache.setCurrentHandler((String) variables.get("applyPerson"));
                delegateTask.setAssignee((String) variables.get("applyPerson"));
            }else if("bean".equals(configItem.getType())){
                String checkerId = (String) variables.get(configItem.getContent());
                if(StringUtils.isBlank(checkerId)) throw new FlowableException("流程节点：《"+delegateTask.getName()+"》，没有配置审核人,请联系管理员！");
                delegateTask.setAssignee(checkerId);
                FlowableCache.setCurrentHandler(checkerId);
            }else{
                String applyDept = (String) variables.get("applyDept");
                ProcessConfigPerson configPerson = personService.getCheckPerson(processKey,taskDefinitionKey,applyDept);
                if(configPerson == null) throw new FlowableException("流程节点：《"+delegateTask.getName()+"》，没有配置审核人，请联系管理员！");
                //ProcessConfigPerson configPerson = personService.getByProcessCodeAndRoleCode(processKey, taskDefinitionKey);
                delegateTask.setAssignee(configPerson.getCheckerId());
                FlowableCache.setCurrentHandler(configPerson.getCheckerId());
            }
        }catch (Exception e){
            logger.error("用户任务监听器错误", e);
            throw new RuntimeException("用户任务监听器错误");
        }

    }
}
