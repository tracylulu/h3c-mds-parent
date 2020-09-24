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

/**
 * 处理产品编码流程   产品编码、bom相关数据
 * @author l20095
 *
 */
@Component
public class ProductCodeInvTaskHandlerImpl extends DefaultAbstractTaskHandler{

	private static final Logger  log = LoggerFactory.getLogger(ProductCodeInvTaskHandlerImpl.class);
	@Autowired
	private ErpProductCodeService erpProductCodeService;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	
	@Override
	public boolean doHandle(IbdsTask ibdsTask) {
		boolean flag = true;
		String applyNo = ibdsTask.getVal().split("~")[0];
		String optType = ibdsTask.getVal().split("~")[1];
		
		//处理产品编码
		try {
			flag = erpProductCodeService.syncProductCode2Inventory(applyNo, optType);
			
			//处理产品编码，bom编码
			flag = erpProductCodeService.syncProductCodeAndBom2Inventory(applyNo, optType);
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_INV_S);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("---产品编码向  erp  inv  临时表写入数据失败");
			ibdsTask.setStatus(FlowableConst.TASK_STATUS_EXCEPTION);
			ibdsTask.setFinalStatus(FlowableConst.TASK_STATUS_SAVE_TO_ERP_INV_F);
			ibdsTask.setCause(e.getMessage());
			ProductCodeProcess productCodeProcess = productCodeProcessService.getProductCodeProcessByApplyCode(ibdsTask.getTaskId());
			productCodeProcessService.sendSyncDataEmail(null, productCodeProcess, "产品编码写入 ERP  INV 失败", "产品编码写入 ERP  INV 失败", ibdsTask.getActTaskId());
			flag = false;
			try {
				Map<String, Object> param = FlowableUtil.buildProductCodeCheckParamDisagree();
				productCodeProcessService.check(productCodeProcess.getId(), ibdsTask.getActTaskId(), param);
				
			} catch (Exception e1) {
				e1.printStackTrace();
				log.error("---调用产品编码接口失败");
				ibdsTask.setCause(e1.getMessage());
			}
		}
		ibdsTaskService.updateTask(ibdsTask);
		return flag;
	}

}
