package com.h3c.mds.flowable.task;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.PartCodeApplyService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.service.ProductCodeProcessService;
import com.h3c.mds.flowable.util.FlowableUtil;

/**
 * 同步  项目编码数据 		到研发基本信息	      和财务参看信息
 * @author l20095
 *
 */
@Component
public class PartCodeTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(PartCodeTaskHandlerImpl.class);
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private TaskService actTaskService;
	
	@Autowired
	private FProductCodeService FProductCodeService;
	
	@Autowired
	private PartCodeProcessService partCodeProcessService;
	
	@Autowired
	private PartCodeApplyService partCodeApplyService;
	
	@Autowired
	private TaskService taskService;
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
		
		boolean  flag = false;
		

		PartCodeProcess partCodeProcess = partCodeProcessService.getByApplyNo(ibdsTask.getTaskId());
		try{
			Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamAgree();
			partCodeProcessService.updateFinance(ibdsTask.getTaskId());
			partCodeProcessService.check(partCodeProcess.getId(), ibdsTask.getActTaskId(), param);
			ibdsTask.setFinalStatus(FlowableConst.TASK_STATUS_PARTCODE_TO_FINA_INV_SUCCESS);
			
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("---新增part编码向财务参考信息写入数据失败");
			Map<String, Object> paramDisagree = FlowableUtil.buildPartCodeCheckParamDisagree();
			partCodeProcessService.sendSyncDataEmail(null, partCodeProcess, "新增part编码写入财务参考信息失败", "", ibdsTask.getActTaskId());
			try {
				List<Task> list = taskService.createTaskQuery().processInstanceId(partCodeProcess.getInstanseId()).list();
				if(CollectionUtils.isNotEmpty(list)){
					partCodeProcessService.check(partCodeProcess.getId(), ibdsTask.getActTaskId(), paramDisagree);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			ibdsTask.setFinalStatus(FlowableConst.TASK_STATUS_PARTCODE_TO_FINA_INV_FAIL);
		}
		
		ibdsTaskService.updateTask(ibdsTask);
		return flag;
	}
}
