package com.h3c.mds.flowable.task;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ErpProductCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.ProductCodeProcessService;
import com.h3c.mds.flowable.util.FlowableUtil;
import com.h3c.mds.utils.CommonsThreadCache;

@Component
public class ProductCodeCoaTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(ProductCodeCoaTaskHandlerImpl.class);
	@Autowired
	private ErpProductCodeService erpProductCodeService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
		boolean flag = false;
		String applyNo = ibdsTask.getVal().split("~")[0];
		String optType = ibdsTask.getVal().split("~")[1];
		
		
		try {
			flag =  erpProductCodeService.SyncProductCode2ErpCoa(applyNo, optType);
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_COA_S);
			log.info("--产品编码写入erp   coa  临时表  成功");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("--产品编码写入erp   coa  临时表  失败");
//			TODO
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_EXCEPTION);
			ibdsTask.setFinalStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_COA_F);
			ibdsTask.setCause(e.getMessage());
			flag = false;
			ProductCodeProcess productCodeProcess = productCodeProcessService.getProductCodeProcessByApplyCode(ibdsTask.getTaskId());
			try {
				Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamDisagree();
				productCodeProcessService.check(productCodeProcess.getId(), ibdsTask.getActTaskId(), param);
				productCodeProcessService.sendSyncDataEmail(null, productCodeProcess, "产品编码写入 ERP  COA 失败", "产品编码写入 ERP  COA 失败", ibdsTask.getActTaskId());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				ibdsTask.setCause(e1.getMessage());
				log.info("---调用产品编码流程接口出错");
			}
			
		}
		ibdsTaskService.updateTask(ibdsTask);
		return flag;
	}

}
