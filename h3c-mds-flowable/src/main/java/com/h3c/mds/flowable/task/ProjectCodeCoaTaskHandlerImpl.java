package com.h3c.mds.flowable.task;

import java.util.HashMap;
import java.util.Map;

import org.flowable.engine.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ErpProjectCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.utils.CommonsThreadCache;

@Component
public class ProjectCodeCoaTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(ProjectCodeCoaTaskHandlerImpl.class);
	@Autowired
	private ErpProjectCodeService erpProjectCodeService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
		boolean flag = false;
		String applyNo = ibdsTask.getVal().split("~")[0];
		String optType = ibdsTask.getVal().split("~")[1];
		
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByApplyNo(applyNo);
		try {
			flag =  erpProjectCodeService.syncProjectCode2Erp(applyNo, optType);
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_COA_S);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("---项目编码向erp coa临时表写入数据失败");
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("erp", FlowableConst.DISAGREE);
			CommonsThreadCache.setCurrentOperateType("system");
			projectCodeProcessExt.setCurStatus("项目编码向ERP临时表同步数据出现问题");
			projectCodeProcessExt.setCurDeal(projectCodeProcessExt.getProjectOffice());
			projectCodeService.sendSyncEipMsg(projectCodeProcessExt, FlowableConst.DISAGREE);
			projectCodeService.sendSyncDataEmail(null, projectCodeProcessExt, "项目编码写入ERP COA失败" , "项目编码写入ERP COA失败", ibdsTask.getTaskId());
			projectCodeService.updateProjectCodeProcess(projectCodeProcessExt);
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_EXCEPTION);
			ibdsTask.setFinalStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_COA_F);
			ibdsTask.setCause(e.getMessage());
			flag = false;
			taskService.complete(ibdsTask.getActTaskId(), param);

		}
		
		ibdsTaskService.updateTask(ibdsTask);
		
		return flag;
	}

}
