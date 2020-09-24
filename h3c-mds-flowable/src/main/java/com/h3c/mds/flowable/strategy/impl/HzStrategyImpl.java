package com.h3c.mds.flowable.strategy.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.flowable.dao.HzPartViewMapper;
import com.h3c.mds.flowable.entity.HzPartView;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.TimeUtil;

/**
 * 从华智获取数据
 * @author l20095
 *
 */
@SuppressWarnings("rawtypes")
@Service("hzStrategy")
public class HzStrategyImpl  extends DefaultAbstractStrategyImpl{
	@Autowired
    private HzPartViewMapper hzPartViewMapper;
	
	@Autowired
	private DicService dicService;
	
	@Autowired
	private UserService userService;
	
	@Override
	public List<HzPartView> doGetSourceData(Object f) {
		return hzPartViewMapper.selectByExample(null);
	}

	@Override
	public List transferPOJO(List fromPOJOs) {	
		List<PartProcessAndPartCodeWrapper> resList = new ArrayList<PartProcessAndPartCodeWrapper>();
		Map<String, List<PartProcessAndPartCodeWrapper>> applyNoPdmMap = new HashMap<String, List<PartProcessAndPartCodeWrapper>>();
		
		if(fromPOJOs != null && fromPOJOs.size() > 0){
			for(int i = 0; i < fromPOJOs.size(); i++){
				
				HzPartView pdmPartView = (HzPartView)fromPOJOs.get(i);
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
		
		
		return resList;
	}

	private PartProcessAndPartCodeWrapper buildPartProcessAndPartCodeWrapper(HzPartView hzPartView){
		PartCodeProcess partCodeProcess = new PartCodeProcess();
		PartCodeApply partCodeApply = new PartCodeApply();
		List<PartCodeApply> partCodeApplyList = new ArrayList<PartCodeApply>();
		
		
		partCodeProcess.setPdmApplyCode(getHzApplyCode());//申请单流水号   华智没有这个数据，自动生成一个
		partCodeProcess.setApplyPerson(getApplyPersion());//责任人    华智目前没有责任人  从配置里面取
//		partCodeProcess.setDeptType(pdmPartView.getH3secondleveldept());//二级部门  
		partCodeProcess.setApplyDept(getApplySecondDept());//二级部门
		partCodeProcess.setTel(getTel());//联系电话
		partCodeProcess.setStatus("0");
		partCodeProcess.setHandler(userService.backDomainAccount(getApplyPersion()));
		
		partCodeApply.setProjectNo(hzPartView.getS1partnumber());//PART编码    bom编码
		partCodeApply.setProjectName(hzPartView.getS1partdescelements());//项目描述  part编码描述
		partCodeApply.setProductNum(hzPartView.getS1internalmodel());//对外型号     产品代码
		partCodeApply.setInsideDescEn(hzPartView.getS1intenglishdesc());//对内英文描述
		partCodeApply.setAbroadDescCn(hzPartView.getS1extchinesedesc());//对外中文描述
		partCodeApply.setAbroadDescEn(hzPartView.getS1extenglishdesc());//对外英文描述
		partCodeApplyList.add(partCodeApply);
		
		
		PartProcessAndPartCodeWrapper wrapper = new PartProcessAndPartCodeWrapper();
		wrapper.setPartCodeProcess(partCodeProcess);
		wrapper.setPartCodeApplyList(partCodeApplyList);
		return wrapper;
	}
	
	
	private String getApplyPersion(){
		Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", "30");
		List<IBDS_Dic> deptList = dicService.getDic(param);
		if(CollectionUtils.isNotEmpty(deptList)){
			return deptList.get(0).getDicValue();
		}else{
			return null;
		}
	}
	
	private String getApplySecondDept(){
		Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", "31");
		List<IBDS_Dic> deptList = dicService.getDic(param);
		if(CollectionUtils.isNotEmpty(deptList)){
			return deptList.get(0).getDicValue();
		}else{
			return null;
		}
	}
	
	private String getTel(){
		Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", "32");
		List<IBDS_Dic> deptList = dicService.getDic(param);
		if(CollectionUtils.isNotEmpty(deptList)){
			return deptList.get(0).getDicValue();
		}else{
			return null;
		}
	}
	
	private String getHzApplyCode(){
		return "H" + TimeUtil.getStringDay(new Date());
	}
}
