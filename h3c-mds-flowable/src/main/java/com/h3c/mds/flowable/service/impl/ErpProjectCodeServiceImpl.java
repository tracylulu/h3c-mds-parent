package com.h3c.mds.flowable.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.entity.ErpCoaEntity;
import com.h3c.mds.flowable.entity.ProjectCodeApply;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ErpProjectCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.flowable.util.ErpEntityUtils;
import com.h3c.mds.service.master.ErpService;

@Service
public class ErpProjectCodeServiceImpl implements ErpProjectCodeService {

	private static final Logger LOG = LoggerFactory.getLogger(ErpProjectCodeServiceImpl.class);
	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Autowired
	private ErpService erpService;
	

	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Override
	public boolean isSyncProjectCode2Erp(String applyNo, String optType){
		boolean res = false;
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(optType)){
			res = true;
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(optType)){
			//项目编码是否需要同步
			List<ErpCoaEntity> coaEnityList = getChangedEditProjectCode2Erp(applyNo);
			if(!CollectionUtils.isEmpty(coaEnityList)){
				res = true;
			}
		}else{
			res = true;
		}
		return res;
	}
	
	@Override
	public boolean syncProjectCode2Erp(String applyNo, String optType){
		boolean res = false;
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(optType)){
			res = syncAddProjectCode2Erp(applyNo);
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(optType)){
			res = syncEditProjectCode2Erp(applyNo);
		}else{
			res = syncDelProjectCode2Erp(applyNo);
		}
		return res;
	}
	@Override
	public boolean syncAddProjectCode2Erp(String applyNo) {
		LOG.info("开始同步新增流程的项目编码数据到erp");
		boolean flag = true;
		String erpImportNo =  ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		List<ProjectCodeApply> projectCodeApplyList = getProjectCodeByApplyNo(applyNo);
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>(5);
		if(CollectionUtils.isNotEmpty(projectCodeApplyList)){
			for(int i = 0; i < projectCodeApplyList.size(); i++){
				ProjectCodeApply tmpProjectCodeApply = projectCodeApplyList.get(i);
				ErpCoaEntity erpCoaEntity = ErpEntityUtils.changeProjectCodeToErpCoaEntity(tmpProjectCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_ADD, erpImportNo);
				coaList.add(erpCoaEntity);
			}
		}
		if(CollectionUtils.isNotEmpty(coaList)){
			//  批量入erp数据库
			this.batchInsertErpCoaByPage(coaList);
		}
		LOG.info("同步新增流程的项目编码数据到erp 结束");
		return flag;
	}

	@Override
	public boolean syncEditProjectCode2Erp(String applyNo) {
		LOG.info("开始同步修改流程的项目编码数据到erp");
		boolean flag = true;
		List<ErpCoaEntity> coaList  = getChangedEditProjectCode2Erp(applyNo);
		if(CollectionUtils.isNotEmpty(coaList)){
			// 批量入erp数据库
			this.batchInsertErpCoaByPage(coaList);
		}
		LOG.info("同步修改流程的项目编码数据到erp 结束");
		return flag;
	}

	//项目编码修改流程中是否需要向erp同步数据
	@Override
	public List<ErpCoaEntity> getChangedEditProjectCode2Erp(String applyNo){
		String erpImportNo =  ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		List<ProjectCodeApply> projectCodeApplyList = getProjectCodeByApplyNo(applyNo);
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>(5);
		if(CollectionUtils.isNotEmpty(projectCodeApplyList)){
			for(int i = 0; i < projectCodeApplyList.size(); i++){
				ProjectCodeApply tmpProjectCodeApply = projectCodeApplyList.get(i);
				ErpCoaEntity erpCoaEntity = ErpEntityUtils.changeProjectCodeToErpCoaEntity(tmpProjectCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT, erpImportNo);
				coaList.add(erpCoaEntity);
			}
		}
		return coaList;
	}
	@Override
	public boolean syncDelProjectCode2Erp(String applyNo) {
		boolean flag = true;
		String erpImportNo =  ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		LOG.info("开始同步删除流程的项目编码数据到erp");
		List<ProjectCodeApply> projectCodeApplyList = getProjectCodeByApplyNo(applyNo);
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>(5);
		if(CollectionUtils.isNotEmpty(projectCodeApplyList)){
			for(int i = 0; i < projectCodeApplyList.size(); i++){
				ProjectCodeApply tmpProjectCodeApply = projectCodeApplyList.get(i);
				ErpCoaEntity erpCoaEntity = ErpEntityUtils.changeProjectCodeToErpCoaEntity(tmpProjectCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_DEL,erpImportNo);
				coaList.add(erpCoaEntity);
			}
		}
		if(CollectionUtils.isNotEmpty(coaList)){
			// 批量入erp数据库
			this.batchInsertErpCoaByPage(coaList);
		}
		LOG.info("同步删除流程的项目编码数据到erp 结束");
		return flag;
	}

	
	private List<ProjectCodeApply> getProjectCodeByApplyNo(String applyNo){
		List<ProjectCodeApply> projectCodeApplyList = new ArrayList<ProjectCodeApply>(20);
		ProjectCodeProcessExt projectCodeProcess = projectCodeService.getCurProjectCodeProcessExtByApplyNo(applyNo);
		if(projectCodeProcess != null){
			if(CollectionUtils.isNotEmpty(projectCodeProcess.getApplys())){
				List<ProjectCodeApplyExt> peojectCodeExtList = projectCodeProcess.getApplys();
				for(int i = 0; i < peojectCodeExtList.size(); i++){
					ProjectCodeApply projectCodeApply = new ProjectCodeApply();
					try {
						BeanUtils.copyProperties(projectCodeApply, peojectCodeExtList.get(i));
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
					projectCodeApplyList.add(projectCodeApply);
				}
			}
		}
		return projectCodeApplyList;
	}
	@Override
	public void batchInsertErpCoaByPage(List<ErpCoaEntity> coaList) {
		for(int count = 0; count < coaList.size() / FlowableConst.ERP_BATCH_COUNT; count++){
			List<ErpCoaEntity> tmpCoaList = 
					coaList.subList(count * FlowableConst.ERP_BATCH_COUNT, (count + 1) * FlowableConst.ERP_BATCH_COUNT);
			
			erpService.batchInsertHw3cFndFlexValuesInf(tmpCoaList);
		}
		
		if(0 != coaList.size() % FlowableConst.ERP_BATCH_COUNT){
			List<ErpCoaEntity> tmpCoaList = 
					coaList.subList(coaList.size() - (coaList.size() % FlowableConst.ERP_BATCH_COUNT), coaList.size());
			
			
			erpService.batchInsertHw3cFndFlexValuesInf(tmpCoaList);
		}
	}
}
