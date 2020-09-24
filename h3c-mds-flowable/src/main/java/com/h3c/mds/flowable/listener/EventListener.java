package com.h3c.mds.flowable.listener;

import com.h3c.mds.flowable.util.FlowableCache;
import org.flowable.bpmn.model.EndEvent;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.SequenceFlow;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 事件监听器
 */
public class EventListener implements ExecutionListener {
	private static final Logger logger = LoggerFactory.getLogger(EventListener.class);

    @Override
    public void notify(DelegateExecution execution) {
        //当前元素
        FlowElement currentFlowElementelement = execution.getCurrentFlowElement();
        logger.info("Documentation"+currentFlowElementelement.getDocumentation());
        
        //如果当前为
        if(currentFlowElementelement instanceof SequenceFlow){        	
            SequenceFlow flow = (SequenceFlow) currentFlowElementelement;
            logger.info("赋值开始");
            logger.info("flow.getDocumentation()"+flow.getDocumentation());
            logger.info("FlowableCache.getCurrentElement()"+FlowableCache.getCurrentElement());
            logger.info("FlowableCache.getCurrentStatusDesc()"+FlowableCache.getCurrentStatusDesc());
            String documentation = flow.getDocumentation();
           
            if("流程结束".equals(documentation)){
            	logger.info("IF:END");
                FlowableCache.setCurrentElement("end");
            }else {
            	logger.info("ELSE:为空");
            	FlowableCache.setCurrentElement("");
            }
            FlowableCache.setCurrentStatusDesc(documentation);
            logger.info("赋值结束");
            logger.info("flow.getDocumentation()"+flow.getDocumentation());
            logger.info("FlowableCache.getCurrentElement()"+FlowableCache.getCurrentElement());
            logger.info("FlowableCache.getCurrentStatusDesc()"+FlowableCache.getCurrentStatusDesc());
            logger.info("结束");
        }
    }
}
