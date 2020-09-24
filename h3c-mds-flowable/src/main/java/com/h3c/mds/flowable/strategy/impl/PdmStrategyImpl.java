package com.h3c.mds.flowable.strategy.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.flowable.dao.PdmPartViewMapper;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.flowable.entity.PdmPartView;
import com.h3c.mds.sysmgr.service.UserService;

/**
 * 从pdm中取数据
 * @author l20095
 *
 */
@SuppressWarnings("rawtypes")
@Service("pdmStrategy")
public class PdmStrategyImpl extends DefaultAbstractStrategyImpl{

	
	@Autowired
    private PdmPartViewMapper pdmPartViewMapper;
	
	@Autowired
	private UserService userService;
	@Override
	public List<PdmPartView> doGetSourceData(Object f) {
		return pdmPartViewMapper.selectByExample(null);
	}

	@Override
	public List transferPOJO(List fromPOJOs) {	
		List<PartProcessAndPartCodeWrapper> resList = new ArrayList<PartProcessAndPartCodeWrapper>();
		Map<String, List<PartProcessAndPartCodeWrapper>> applyNoPdmMap = new HashMap<String, List<PartProcessAndPartCodeWrapper>>();
		
		if(fromPOJOs != null && fromPOJOs.size() > 0){
			for(int i = 0; i < fromPOJOs.size(); i++){
				
				PdmPartView pdmPartView = (PdmPartView)fromPOJOs.get(i);
				PartProcessAndPartCodeWrapper tmpWrapper = buildPartProcessAndPartCodeWrapper(pdmPartView);
				if(applyNoPdmMap.containsKey(tmpWrapper.getPartCodeProcess().getPdmApplyCode())){
					applyNoPdmMap.get(tmpWrapper.getPartCodeProcess().getPdmApplyCode()).add(tmpWrapper);
				}else{
					List<PartProcessAndPartCodeWrapper> tmpList = new ArrayList<PartProcessAndPartCodeWrapper>();
					tmpList.add(tmpWrapper);
					applyNoPdmMap.put(tmpWrapper.getPartCodeProcess().getPdmApplyCode(), tmpList);
					 
				}
			}
		}
		
		if(MapUtils.isNotEmpty(applyNoPdmMap)){
			for(Map.Entry<String, List<PartProcessAndPartCodeWrapper>> entry : applyNoPdmMap.entrySet()){
				if(CollectionUtils.isNotEmpty(entry.getValue())){
					List<PartProcessAndPartCodeWrapper> tmpWapperList = entry.getValue();
					if(CollectionUtils.isNotEmpty(tmpWapperList)){
						PartProcessAndPartCodeWrapper finalPartProcessAndPartCodeWrapper = new PartProcessAndPartCodeWrapper();
						
						List<PartCodeApply> partCodeApplyList = new ArrayList<PartCodeApply>();
						finalPartProcessAndPartCodeWrapper.setPartCodeApplyList(partCodeApplyList);
						finalPartProcessAndPartCodeWrapper.setPartCodeProcess(tmpWapperList.get(0).getPartCodeProcess());
						for(PartProcessAndPartCodeWrapper wrapper : tmpWapperList){
							finalPartProcessAndPartCodeWrapper.getPartCodeApplyList().addAll(wrapper.getPartCodeApplyList());
						}
						resList.add(finalPartProcessAndPartCodeWrapper);
					}
				}
			}
		}
		
		/*
		PdmPartView pdmPartView= new PdmPartView();
		pdmPartView.getRespparty();//责任人
		pdmPartView.getH3secondleveldept();//二级部门
		pdmPartView.getS1contactphonenum();//联系电话
		pdmPartView.getDocumentname();//申请单流水号
		
		
		
		pdmPartView.getS1partnumber();//PART编码    bom编码
		pdmPartView.getS1partdescelements();//项目描述  part编码描述
		pdmPartView.getS1internalmodel();//对外型号     产品代码
		pdmPartView.getS1intenglishdesc();//对内英文描述
		pdmPartView.getS1extchinesedesc();//对外中文描述
		pdmPartView.getS1extenglishdesc();//对外英文描述
		*/		
		return resList;
	}

	
	
	
	private PartProcessAndPartCodeWrapper buildPartProcessAndPartCodeWrapper(PdmPartView pdmPartView){
		
		PartCodeProcess partCodeProcess = new PartCodeProcess();
		PartCodeApply partCodeApply = new PartCodeApply();
		List<PartCodeApply> partCodeApplyList = new ArrayList<PartCodeApply>();
		
		
		partCodeProcess.setPdmApplyCode(pdmPartView.getDocumentname());//申请单流水号
		partCodeProcess.setApplyPerson(pdmPartView.getRespparty());//责任人
//		partCodeProcess.setDeptType(pdmPartView.getH3secondleveldept());//二级部门
		partCodeProcess.setApplyDept(pdmPartView.getH3secondleveldept());//二级部门
		partCodeProcess.setTel(pdmPartView.getS1contactphonenum());//联系电话
		partCodeProcess.setStatus("0");
		partCodeProcess.setHandler(userService.backDomainAccount(pdmPartView.getRespparty()));
		
		partCodeApply.setProjectNo(pdmPartView.getS1partnumber());//PART编码    bom编码
		partCodeApply.setProjectName(pdmPartView.getS1partdescelements());//项目描述  part编码描述
		partCodeApply.setProductNum(pdmPartView.getS1internalmodel());//对外型号     产品代码
		partCodeApply.setInsideDescEn(pdmPartView.getS1intenglishdesc());//对内英文描述
		partCodeApply.setAbroadDescCn(pdmPartView.getS1extchinesedesc());//对外中文描述
		partCodeApply.setAbroadDescEn(pdmPartView.getS1extenglishdesc());//对外英文描述
		partCodeApplyList.add(partCodeApply);
		
		
		PartProcessAndPartCodeWrapper wrapper = new PartProcessAndPartCodeWrapper();
		wrapper.setPartCodeProcess(partCodeProcess);
		wrapper.setPartCodeApplyList(partCodeApplyList);
		return wrapper;
	}
	
}
