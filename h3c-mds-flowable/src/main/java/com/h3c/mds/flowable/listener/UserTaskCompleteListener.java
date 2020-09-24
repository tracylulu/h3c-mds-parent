package com.h3c.mds.flowable.listener;

import com.h3c.mds.flowable.util.FlowableCache;
import org.apache.commons.lang3.StringUtils;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import java.util.List;
import java.util.Map;

/**
 * 用户任务完成时调用该监听器，现在主要用来会签设人
 */
public class UserTaskCompleteListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        Map<String, Object> variables = delegateTask.getVariables();
        List<String> counterSignPersons = (List<String>) variables.get("counterSignPersons");
        delegateTask.setVariable("huiqian", counterSignPersons);
        String handlers = StringUtils.join(counterSignPersons, ",");
        FlowableCache.setCurrentHandler(handlers);
    }
}
