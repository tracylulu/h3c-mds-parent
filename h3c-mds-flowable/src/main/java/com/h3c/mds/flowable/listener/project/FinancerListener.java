package com.h3c.mds.flowable.listener.project;

import org.apache.commons.lang.StringUtils;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.FlowableProjectCodeCache;
import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.IBDS_PDTService;
import com.h3c.mds.product.service.IBDS_ReleaseService;

/**
 * 财务接口人审批者
 * @author l20095
 *
 */
public class FinancerListener  implements TaskListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7193618476158554255L;

	@Override
	public void notify(DelegateTask delegateTask) {
		IBDS_ReleaseService releaseService = (IBDS_ReleaseService) SpringContextUtils.getBean(IBDS_ReleaseService.class);
		IBDS_PDTService   ibdsPdtService = (IBDS_PDTService)SpringContextUtils.getBean(IBDS_PDTService.class);
		String handler = "";
			//这里去R版本对应的pdt的财务代表,直接取第一个
		ProjectCodeProcessExt projectCodeProcessExt = FlowableProjectCodeCache.getCurrentProjectCodeProcessExt();
		IBDS_Release release = releaseService.selectByCode(projectCodeProcessExt.getApplys().get(0).getReleaseNo());
		if(release != null){
			IBDS_PDT pdt = ibdsPdtService.selectByCode(release.getPdtno());
			if(pdt != null && StringUtils.isNotBlank(pdt.getFinpdtId())){
				String[] fin = pdt.getFinpdtId().split(",");
				String[] firstFin = fin[0].split("\\s+");
				handler = firstFin[0].substring(0, 1).toLowerCase() + firstFin[1];				
			}else{
				throw new FlowableException("流程节点：《"+delegateTask.getName()+"》，没有对应的PDT财务代表，请联系管理员！");
			}
			
		}else{
			throw new FlowableException("流程节点：《"+delegateTask.getName()+"》，没有对应的PDT财务代表，请联系管理员！");
		}
//		projectCodeProcess.setFinanceInterface(handler);
		FlowableCache.setCurrentHandler(handler);
		FlowableProjectCodeCache.setCurrentActTaskId(delegateTask.getId());
//		projectCodeProcess.setCurDeal(handler);
//		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
		delegateTask.setAssignee(handler);
	}
		

}
