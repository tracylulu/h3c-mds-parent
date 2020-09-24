package com.h3c.mds.flowable.task;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ErpProductCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.util.FlowableUtil;
import com.h3c.mds.utils.CommonsThreadCache;

/**
 * erp库存模块  处理新增part流程中  产品编码    bom   商业模式的  数据
 * @author l20095
 *
 */
@Component
public class PartCodeInvTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(PartCodeInvTaskHandlerImpl.class);
	@Autowired
	private ErpProductCodeService erpProductCodeService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private PartCodeProcessService partCodeProcessService;
	
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
		boolean flag = true;
		String applyNo = ibdsTask.getVal().split("~")[0];
//		String optType = ibdsTask.getVal().split("~")[1];
		PartCodeProcess partCodeProcess = partCodeProcessService.getByApplyNo(ibdsTask.getTaskId());
		//同步part流程中产品编码与bom的关系
		try {
			flag = erpProductCodeService.syncPartCodeApplyProductCodeAndBom2Inventory(applyNo);
			
			//同步part流程中bom和商业模式的关系
			flag = erpProductCodeService.syncBomAndBusiness2Inventory(applyNo);
			
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_INV_S);
			log.info("--新增part写入erp  inv 临时表 成功");
		} catch (Exception e) {
			log.info("--新增part写入erp  inv 临时表 失败");
			// TODO Auto-generated catch block
			e.printStackTrace();
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_EXCEPTION);
			ibdsTask.setCause(e.getMessage());
			flag = false;
			
			try {
				Map<String, Object> param = FlowableUtil.buildPartCodeCheckParamDisagree();
				partCodeProcessService.check(partCodeProcess.getId(), ibdsTask.getActTaskId(), param);
				partCodeProcessService.sendSyncDataEmail(null, partCodeProcess, "新增part编码写入ERP INV失败", "", ibdsTask.getActTaskId());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				ibdsTask.setCause(e.getMessage());
				log.info("--调用 新增part 接口 失败");
			}
		
			
		}
		ibdsTaskService.updateTask(ibdsTask);
		return flag;
	}

}
