package com.h3c.mds.flowable.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.h3c.mds.flowable.entity.*;
import com.h3c.mds.flowable.service.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FlowableFProjectCodeService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.FlowableProjectCodeCache;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.FlowableBversionService;
import com.h3c.mds.product.service.FlowableReleaseService;
import com.h3c.mds.product.service.IBDS_PDTService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.ReleaseViewService;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.NumberUtil;
import com.h3c.mds.utils.ResponseMessageConst;
import com.h3c.mds.utils.TimeUtil;

@Service
public class ProjectCodeServiceImpl implements ProjectCodeService {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectCodeServiceImpl.class);
	@Autowired
	private ProjectCodeApplyService projectCodeApplyService;
	
	@Autowired
	private ProjectProductRelService  projectProductRelService;
	
	@Autowired
	private ProjectCodeProcessService projectCodeProcessService;
	
	//财务信息接口，对接财务信息里面的项目编码，外部接口
	@Autowired
	private FlowableFProjectCodeService flowableFProjectCodeService;
	
	@Autowired
	private ReleaseViewService releaseViewService;
	@Autowired
	private IBDS_ReleaseService ibdsReleaseService;
	@Autowired
	private IBDS_PDTService ibdsPdtService;
	@Autowired
    private FinanceProjectCodeService financeProjectCodeService;
	@Autowired
	private IBDS_ReleaseService releaseService;
	
	//研发基本信息，对接研发基本信息里面的项目，B版本，R版本信息
	@Autowired
	private ProjectService  projectService;
	@Autowired
	private WebFlowService webFlowService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IbdsTaskService ibdsTaskService;
	@Autowired
	private ProcessConfigPersonService personService;
	@Autowired
	private ProjectCodeRecommendService projectCodeRecommendService;
	@Autowired
	private ErpProjectCodeService erpProjectCodeService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private MailInfoService mailInfoService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserRoleRelationService userRoleRelationService;
	@Autowired
	private FlowableReleaseService flowableReleaseService;
	@Autowired
	private FlowableBversionService flowableBversionService;
	@Autowired
	private DicService dicService;
	@Autowired
	private FProductCodeService fProductCodeService;
	@Autowired
	private EipService eipService;
	@Autowired
	private ProcessConfigItemService processConfigItemService;
	@Value("${sso.main.url}")
    private String siteMainUrl;
	
	@Override
	public int addProjectCode(ProjectCodeApply projectCodeApply,
			List<ProjectProductRel> projectProductRelList) {
		int successNum = 0;
		if(projectCodeApply != null){
			successNum = projectCodeApplyService.addProjectCode(projectCodeApply);
		}else{
			LOG.error("项目为空");
			return -1;
		}
		if(projectProductRelList != null && projectProductRelList.size() > 0){
			for(int i = 0; i < projectProductRelList.size(); i++){
				projectProductRelService.addProjectProductRel(projectProductRelList.get(i));
			}
		}else{
			LOG.error("项目编码没有对应的产品编码" + projectCodeApply.getProNumber());
			return -1;
		}
		return successNum;
	}
	
//	@Transactional
	public String addProjectCodeTrans(ProjectCodeProcessExt projectCodeProcessExt, String proInsId, String userId){
		ProjectCodeProcessExt draftProjectCodeProcessExt = getCurProjectCodeProcessExtByApplyNo(projectCodeProcessExt.getApplyNo());
		FlowableProjectCodeCache.setCurrentProjectCodeProcess(draftProjectCodeProcessExt);
		if(StringUtils.isNotBlank(proInsId)){
			//申请被驳回
			return rejectProcess(projectCodeProcessExt, proInsId, userId);
		}else{
			//初次提交申请
			if(draftProjectCodeProcessExt != null){//草稿状态提交
				return draftSubmit(projectCodeProcessExt, userId);
			}else{
				return firstSubmit(projectCodeProcessExt, userId);				
			}
		}
		
	}
	
	@Transactional
	public String rejectProcess(ProjectCodeProcessExt projectCodeProcessExt, String proInsId, String userId){
		
		
		projectCodeProcessExt.setCurStatus("审核者审核");
		projectCodeProcessExt.setIsEdit(FlowableConst.PROJECT_CODE_IS_EDIT_DEFAULT);
		delProjectCodeProcessExtByApplyNo(projectCodeProcessExt.getApplyNo());
		webFlowService.completeOwnerTask(proInsId, userId, projectCodeProcessExt.getDept());
		//设置当前处理人为申请人
		setCurDeal(projectCodeProcessExt, FlowableConst.AGREE);
		
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){

			addProjectCodeProcessExtForAddOrEdit(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_APPLY);
			//添加新数据
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			addProjectCodeProcessExtForAddOrEdit(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_APPLY);
			
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			addProjectCodeProcessExtForDel(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_APPLY);
			
		}	
		sendProjectCodeEmail(projectCodeProcessExt, null);
		sendProjectCodeEipMsg(projectCodeProcessExt, null);
		return FlowableConst.SUBMIT_SUCCESS;
	}
	
	@Transactional
	private String draftSubmit(ProjectCodeProcessExt projectCodeProcessExt, String userId){
		
		this.delProjectCodeProcessExtByApplyNo(projectCodeProcessExt.getApplyNo());
		
		return firstSubmit(projectCodeProcessExt, userId);
	}
	
	private String firstSubmit(ProjectCodeProcessExt projectCodeProcessExt, String userId){
		
		firstSubmitTrans(projectCodeProcessExt, userId);
		
		sendProjectCodeEmail(projectCodeProcessExt, null);
		sendProjectCodeEipMsg(projectCodeProcessExt, null);
		return FlowableConst.SUBMIT_SUCCESS;
	}
	@Transactional
	public void firstSubmitTrans(ProjectCodeProcessExt projectCodeProcessExt, String userId){
		String businessKey = FlowableConst.PROJECT_CODE_APPLY_BUSINESSKEY;
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("ProjectCodeApply", userId);				
		//提交流程
		map.put("dept", projectCodeProcessExt.getDept());
		
		//处理过程记录
		 String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_APPLY, FlowableConst.AGREE);
		 processLogService.createLog(new Date(), null, userId,
					"提交申请",
					null , 
					processLogStatus, 
					projectCodeProcessExt.getApplyNo());
		 
		ProcessInstance processInstance = webFlowService.addDeploy(businessKey, map);
		projectCodeProcessExt.setProcessInsId(processInstance.getProcessInstanceId());
		webFlowService.completeOwnerTask(processInstance.getProcessInstanceId(), userId,  projectCodeProcessExt.getDept());
		//设置当前处理人为申请人
		setCurDeal(projectCodeProcessExt, FlowableConst.AGREE);
		projectCodeProcessExt.setCurStatus("审核者审核");
		projectCodeProcessExt.setIsEdit(FlowableConst.PROJECT_CODE_IS_EDIT_DEFAULT);
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			//新增数据
			addProjectCodeProcessExtForAddOrEdit(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_APPLY);
						
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
//			projectCodeProcessExt.setProcessInsId(processInstance.getProcessInstanceId());
			addProjectCodeProcessExtForAddOrEdit(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_APPLY);
			
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			//删除数据
//			projectCodeProcessExt.setProcessInsId(processInstance.getProcessInstanceId());
			addProjectCodeProcessExtForDel(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_APPLY);
		}
		
	}
	
	@Override
	public  int saveDraftFormData(ProjectCodeProcessExt projectCodeProcessExt, String userId){
		int successNum = -1;
		projectCodeProcessExt.setCurDeal(userId);
		projectCodeProcessExt.setCurStatus("草稿");
		projectCodeProcessExt.setIsEdit(FlowableConst.PROJECT_CODE_IS_EDIT_TRUE);
		successNum = addDraftProjectCodeProcessExt(projectCodeProcessExt);
		return successNum;
	}
	
	
	private int addDraftProjectCodeProcessExt(ProjectCodeProcessExt projectCodeProcessExt){
		
		ProjectCodeProcess projectCodeProcess = 
				this.projectCodeProcessService.getProjectCodeProcessByApplyNo(projectCodeProcessExt.getApplyNo());
		if(projectCodeProcess != null){
			delProjectCodeProcessExtByApplyNo(projectCodeProcessExt.getApplyNo());
		}
		
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			
			addProjectCodeProcessExtForAddOrEdit(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_DRAFT);
			//添加新数据
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			addProjectCodeProcessExtForAddOrEdit(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_DRAFT);
			
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			addProjectCodeProcessExtForDel(projectCodeProcessExt, FlowableConst.PROJECTCODE_STATUS_DRAFT);
			
		}	
		
		return projectCodeProcess == null ? 0 : 1;
	}
	
	
	@Override
	public String approveApplyTrans(String proInsId, String status, String taskId, String suggest, String projectCodeData, String userId){
		String res = "";
		ProjectCodeProcessExt projectCodeProcessExt = getCurProjectCodeProcessExtByProcessId(proInsId);

		LOG.info(Thread.currentThread().getName() + "时间:" + System.currentTimeMillis() +  "项目编码流程审核者审批 " + status + "流程id" + proInsId + "任务id" + taskId);
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			res = approveApplysForAdd(projectCodeProcessExt,  status,  taskId,  suggest,  projectCodeData,  userId);
		}else{
			res = approveApplyForNotAdd(projectCodeProcessExt,  status,  taskId,  suggest,  projectCodeData,  userId);
		}
	
		return res;
	}

	
	public String approveApplyForNotAdd(ProjectCodeProcessExt projectCodeProcessExt, String status, 
			String taskId, String suggest, String projectCodeData, String userId){

		FlowableProjectCodeCache.setCurrentProjectCodeProcessExt(projectCodeProcessExt);		
		
		projectCodeProcessExt.setApproverSuggest(suggest);
		projectCodeProcessExt.setApplyTime(new Date());
		String curStatus = getCurStatusAndUpdateProjectCodeStatus(projectCodeProcessExt, FlowableConst.PROJECT_CODE_APPROVE, status, null, null);
		projectCodeProcessExt.setCurStatus(curStatus);
		projectCodeProcessExt.setApprover(userId);
		
		approveApplyTransForNotAdd(projectCodeProcessExt, status,  taskId,  suggest,  projectCodeData,  userId);
		
		sendProjectCodeEmail(projectCodeProcessExt, status);
		sendProjectCodeEipMsg(projectCodeProcessExt, status);
		return FlowableConst.EXE_SUCCESS;
	}
	
	@Transactional
	public void approveApplyTransForNotAdd(ProjectCodeProcessExt projectCodeProcessExt, String status, 
			String taskId, String suggest, String projectCodeData, String userId){
		String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_APPROVE, status);
		processLogService.createLog(new Date(), null, userId,
				status ,
				suggest , 
				processLogStatus, 
				projectCodeProcessExt.getApplyNo());
		
		Map<String, Object>variables = new HashMap<String, Object>();
		variables.put("approve", status);
		variables.put("dept", projectCodeProcessExt.getDept());
		webFlowService.apply(taskId, variables);
		
		setCurDeal(projectCodeProcessExt, status);
		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcessExt);
	}
	
	private String approveApplysForAdd(ProjectCodeProcessExt projectCodeProcessExt, String status, String taskId, String suggest, String projectCodeData, String userId){


		String resStr = "";
		FlowableProjectCodeCache.setCurrentProjectCodeProcessExt(projectCodeProcessExt);
		//如果是新增状态  设置项目编码 判断在途
		
		List<ProjectCodeRecommend> recommendList = new ArrayList<ProjectCodeRecommend>();
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType()) && FlowableConst.AGREE.equals(status)){
			List jsonList = JSONArray.parseObject(projectCodeData, List.class);
			
			try {
				for(Object obj : jsonList){
					ProjectCodeRecommend projectCodeRecommend = new ProjectCodeRecommend();
					BeanUtils.copyProperties(projectCodeRecommend, obj);
					if(StringUtils.isBlank(projectCodeRecommend.getProNumber())){
						return ResponseMessageConst.PROJECT_CODE_PROJECT_NUMBER_IS_EMPTY;
					}
					//是否是数字
					Map<String, String> tmpMap = checkProjecodeNumber(projectCodeRecommend.getProNumber());
					if(tmpMap != null && tmpMap.get("res") != null){
						return tmpMap.get("res");
					}
					//判断项目编码在财务参考信息中是否存在
					Map<String, String> resMap = isProjectCodeExistsInFinance(projectCodeRecommend.getProNumber());
					if(resMap != null && StringUtils.isNotBlank(resMap.get("res"))){
						return resMap.get("res");
					}
					recommendList.add(projectCodeRecommend);
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			if(hasSameProjectNum(recommendList)){
				return ResponseMessageConst.PROJECT_CODE_MUL_PROJECTCODE;
			}
			setProjectCodeProjNumber(projectCodeProcessExt,  recommendList);
			//如果是新增状态  设置项目编码 判断在途
			Map<String, String> resMap = isZTProjectCodeForAdd(projectCodeProcessExt);
			if(resMap.get("projectCodeProNumber") != null){
				String res = "";
				res =  ResponseMessageConst.PROJECT_CODE_PROJECT_NUMBER.replaceAll("projectNumver", resMap.get("projectCodeProNumber"));
				res = res.replaceAll("applyno", resMap.get("applyno"));
				return res;
			}
			projectCodeProcessExt.setApprover(userId);			
		}

		resStr = approveApplysForAddTran(projectCodeProcessExt, status, taskId, suggest, userId,  recommendList);
		if(StringUtils.isNoneBlank(resStr)){
			return resStr;
		}
		
		sendProjectCodeEmail(projectCodeProcessExt, status);
		sendProjectCodeEipMsg(projectCodeProcessExt, status);
		return FlowableConst.EXE_SUCCESS;
	}
	
	@Transactional
	private String approveApplysForAddTran(ProjectCodeProcessExt projectCodeProcessExt, String status, String taskId, 
			String suggest, String userId, List<ProjectCodeRecommend> recommendList){
		String res = "";
		Map<String, Object>variables = new HashMap<String, Object>();
		variables.put("approve", status);
		variables.put("dept", projectCodeProcessExt.getDept());
		projectCodeProcessExt.setApproverSuggest(suggest);
		projectCodeProcessExt.setApplyTime(new Date());
		String curStatus = getCurStatusAndUpdateProjectCodeStatus(projectCodeProcessExt, FlowableConst.PROJECT_CODE_APPROVE, status, null, null);
		projectCodeProcessExt.setCurStatus(curStatus);
		projectCodeProcessExt.setApprover(userId);
		String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_APPROVE, status);
		processLogService.createLog(new Date(), null, userId,
				status ,
				suggest , 
				processLogStatus, 
				projectCodeProcessExt.getApplyNo());
		
		if(CollectionUtils.isNotEmpty(recommendList)){
			// TODO  更新推荐的项目编码
			try {
					saveProjectCodeProjNumber(projectCodeProcessExt, recommendList);
					updateRecommentProjectCode(recommendList);
				} catch (Exception e) {
					e.printStackTrace();
					res =  ResponseMessageConst.PROJECT_CODE_RECOMMEND_UPDATE_ERROR;
			}
		}
		webFlowService.apply(taskId, variables);
		setCurDeal(projectCodeProcessExt, status);
		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcessExt);
		return res;
	}
	
	public void setCurDeal(ProjectCodeProcess projectCodeProcess, String status){
		if(FlowableConst.DISAGREE.equals(status)){
			projectCodeProcess.setCurDeal(projectCodeProcess.getApplyer());
		}else{
			projectCodeProcess.setCurDeal(FlowableCache.getCurrentHandler());
		}
	}
	public  Map<String, String> checkProjecodeNumber(String projectCode){


		Map<String, String> res = new HashMap<String, String>();
		if(StringUtils.isNotBlank(projectCode)){
			if(!NumberUtil.isNumeric(projectCode)){
				res.put("res", ResponseMessageConst.PROJECT_CODE_PROJECT_NUMBER_IS_NOT_NUMBER);
				return res;
				
			}else{
				try {
					Integer.parseInt(projectCode);
					if(!FlowableConst.PROJECT_CODE_LENGTH.equals(projectCode.length())){
						res.put("res", ResponseMessageConst.PROJECT_CODE_OVER_MAX_LENGTH);
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
					res.put("res", ResponseMessageConst.PROJECT_CODE_OVER_INTMAX);
				}
			}
		}else{
			res.put("res", ResponseMessageConst.PROJECT_CODE_PROJECT_NUMBER_IS_EMPTY);
			return res;
		}
	return res;
	
	}
	
	private void updateRecommentProjectCode(List<ProjectCodeRecommend> recommendList){
		if(CollectionUtils.isNotEmpty(recommendList)){
			for(int i = 0; i < recommendList.size(); i++){
				ProjectCodeRecommend tmpProjectCodeRecommend = recommendList.get(i);
				this.projectCodeRecommendService.updateProjectCodeNumberByPdtNo(tmpProjectCodeRecommend.getPdtNo(), tmpProjectCodeRecommend.getProNumber());
			}
		}
	}
	
	
	//项目编码是否相同
	private boolean hasSameProjectNum(List<ProjectCodeRecommend> recommendList){
		Map<String, Integer> projectMap = new HashMap<String, Integer>();
		if(CollectionUtils.isNotEmpty(recommendList)){
			for(int i = 0; i < recommendList.size(); i++){
				if(projectMap.containsKey(recommendList.get(i).getProNumber())){
					projectMap.put(recommendList.get(i).getProNumber(), projectMap.get(recommendList.get(i).getProNumber()) + 1);
				}else{
					projectMap.put(recommendList.get(i).getProNumber(), 1);
				}
			}
		}
		
		for(Entry<String, Integer> entry : projectMap.entrySet()){
			if(entry.getValue() > 1){
				return true;
			}
		}
		return false;
	}
	
	private Map<String, String> isProjectCodeExistsInFinance(String projectCode){
		Map<String, String> resMap = new HashMap<String, String>();
		FProjectCode fProjectCode = flowableFProjectCodeService.getFProjectCodeByCode(projectCode);
		
		if(fProjectCode != null){
			resMap.put("res", ResponseMessageConst.PROJECT_CODE_PROJECT_NUMBER_EXIST_IN_FINANCE.replace("projectNumver", projectCode));
		}
		
		return resMap;
	}
	
	
	
	//审核者设置项目编码
		private void saveProjectCodeProjNumber(ProjectCodeProcessExt projectCodeProcessExt, List<ProjectCodeRecommend> recommendList){
			if(projectCodeProcessExt != null){
				if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
					List<ProjectCodeApplyExt> projectCodeList = projectCodeProcessExt.getApplys();
					for(ProjectCodeApplyExt projectCodeApplyExt : projectCodeList){
						//更新项目编码对应的项目编码
						ProjectCodeApply projectCodeApply = (ProjectCodeApply)projectCodeApplyExt;
						for(ProjectCodeRecommend recommend : recommendList){
							String compareName = projectCodeApplyExt.getProName() + projectCodeApplyExt.getBversion();
							if(compareName.equalsIgnoreCase(recommend.getProName())){
								LOG.info("压测 applyno" + projectCodeApply.getApplyNo() + "  压测项目编码 :"+ projectCodeApply.getProNumber());
								projectCodeApplyService.updateProjectCodeByApplyNoAndProName(projectCodeApply);
							}
						}
						//更新项目编码，产品编码关联表对应的项目编码
						if(CollectionUtils.isNotEmpty(projectCodeApplyExt.getProjectProductRelList())){
							List<ProjectProductRel> relList = projectCodeApplyExt.getProjectProductRelList();
							for(ProjectProductRel rel : relList){
//								rel.setProductCode();
								rel.setProjNo(projectCodeApply.getProNumber());
								projectProductRelService.updateProjectProductRelByPrimary(rel);
							}
						}
					}
				}
			}
		}
		
		private void setProjectCodeProjNumber(ProjectCodeProcessExt projectCodeProcessExt, List<ProjectCodeRecommend> recommendList){
			if(projectCodeProcessExt != null){
				if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
					List<ProjectCodeApplyExt> projectCodeList = projectCodeProcessExt.getApplys();
					for(ProjectCodeApplyExt projectCodeApplyExt : projectCodeList){
						//更新项目编码对应的项目编码
						ProjectCodeApply projectCodeApply = (ProjectCodeApply)projectCodeApplyExt;
						for(ProjectCodeRecommend recommend : recommendList){
							String compareName = projectCodeApplyExt.getProName() + projectCodeApplyExt.getBversion();
							if(compareName.equalsIgnoreCase(recommend.getProName())){
								projectCodeApply.setProNumber(recommend.getProNumber());
							}
						}
					}
				}
			}
		}
		
	
	@Override
	public String projectMngApplyTrans(String proInsId, String status, String taskId, String suggest, String userId){
		try {
			LOG.info(Thread.currentThread().getName() + "时间:" + System.currentTimeMillis() +  "项目编码流程项目经理审批 " + status + "流程id" + proInsId + "任务id" + taskId);
			ProjectCodeProcessExt projectCodeProcessExt = getCurProjectCodeProcessExtByProcessId(proInsId);
			FlowableProjectCodeCache.setCurrentProjectCodeProcessExt(projectCodeProcessExt);
			
			ProjectCodeProcess projectCodeProcess = new ProjectCodeProcess();
			BeanUtils.copyProperties(projectCodeProcess, projectCodeProcessExt);
			
			projectCodeProcess.setProjmngSuggest(suggest);
			String curStatus = getCurStatusAndUpdateProjectCodeStatus(projectCodeProcess, FlowableConst.PROJECT_CODE_PROJ_MNG, status, null, null);
			projectCodeProcess.setCurStatus(curStatus);
			projectCodeProcess.setProjMngTime(new Date());
			projectCodeProcess.setProjMngShow(userId);
			
			String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_PROJ_MNG, status);
			projectMngApply(projectCodeProcess,  processLogStatus, status,  taskId,  suggest,  userId);
			sendProjectCodeEmail(projectCodeProcess, status);
			sendProjectCodeEipMsg(projectCodeProcess, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return FlowableConst.EXE_SUCCESS;
	}
	
	@Transactional
	public void projectMngApply(ProjectCodeProcess projectCodeProcess, String processLogStatus,String status, String taskId, String suggest, String userId){
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("projMng", status);
		variables.put("dept", projectCodeProcess.getDept());
		processLogService.createLog(new Date(), null, userId,
				status ,
				suggest , 
				processLogStatus, 
				projectCodeProcess.getApplyNo());
		webFlowService.apply(taskId, variables);
		setCurDeal(projectCodeProcess, status);
		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
	}
	
	@Override
	public String financeInterfaceApplyTrans(String proInsId, String status, String taskId, String suggest, String userId){
		try {
			LOG.info(Thread.currentThread().getName() + "时间:" + System.currentTimeMillis() +  "项目编码流程财务接口人审批 " + status + "流程id" + proInsId + "任务id" + taskId);
			ProjectCodeProcess projectCodeProcess = getCurProjectCodeProcessByProcessId(proInsId);
			FlowableProjectCodeCache.setCurrentProjectCodeProcess(projectCodeProcess);
			projectCodeProcess.setFinanceInterfaceSuggest(suggest);
			String curStatus = getCurStatusAndUpdateProjectCodeStatus(projectCodeProcess, FlowableConst.PROJECT_CODE_FINA_INTERFACE, status, null, null);
			projectCodeProcess.setCurStatus(curStatus);
			
			projectCodeProcess.setProjFinInterfaceTime(new Date());
			projectCodeProcess.setFinanceInterface(userId);
			
			financeInterfaceApply(projectCodeProcess, status, taskId, suggest, userId);
			
			sendProjectCodeEmail(projectCodeProcess, status);
			sendProjectCodeEipMsg(projectCodeProcess, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return FlowableConst.EXE_SUCCESS;
	}
	
	@Transactional
	public void financeInterfaceApply(ProjectCodeProcess projectCodeProcess, String status, String taskId, String suggest, String userId){
		String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_FINA_INTERFACE, status);	
		processLogService.createLog(new Date(), null, userId,
					status ,
					suggest , 
					processLogStatus, 
					projectCodeProcess.getApplyNo());
		
		Map<String, Object>variables = new HashMap<String, Object>();
		variables.put("finInterface", status);
		variables.put("dept", projectCodeProcess.getDept());
		webFlowService.apply(taskId, variables);
		setCurDeal(projectCodeProcess, status);
		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
	}
	
	@Override
	public String financerApplyTrans(String proInsId, String status, String taskId, String suggest, String userId){
		try {
			LOG.info(Thread.currentThread().getName() + "时间:" + System.currentTimeMillis() +  "项目编码流程财务审批 " + status + "流程id" + proInsId + "任务id" + taskId);
			ProjectCodeProcess projectCodeProcess = getCurProjectCodeProcessByProcessId(proInsId);
			FlowableProjectCodeCache.setCurrentProjectCodeProcess(projectCodeProcess);
			
			
			projectCodeProcess.setFinancerSuggest(suggest);
			String curStatus = getCurStatusAndUpdateProjectCodeStatus(projectCodeProcess, FlowableConst.PROJECT_CODE_FINANCER, status, null, null);
			projectCodeProcess.setCurStatus(curStatus);
			projectCodeProcess.setProjFinTime(new Date());
			projectCodeProcess.setFinancer(userId);
			
			financerApply(projectCodeProcess,  proInsId,  status,  taskId,  suggest,  userId);
			
			sendProjectCodeEmail(projectCodeProcess, status);
			sendProjectCodeEipMsg(projectCodeProcess, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return FlowableConst.EXE_SUCCESS;
	}
	
	@Transactional
	public void financerApply(ProjectCodeProcess projectCodeProcess, String proInsId, String status, String taskId, String suggest, String userId){
		String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_FINANCER, status);
		processLogService.createLog(new Date(), null, userId,
					status ,
					suggest , 
					processLogStatus, 
					projectCodeProcess.getApplyNo());
		Map<String, Object>variables = new HashMap<String, Object>();
		variables.put("fin", status);
		variables.put("dept", projectCodeProcess.getDept());
		webFlowService.apply(taskId, variables);
		setCurDeal(projectCodeProcess, status);
		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
	}
	public void financerApply(){
		
	}
	
	
	@Override
	public void projectOfficeApplyTrans(String proInsId, String status, String taskId, String suggest, String userId){
//		LOG.error(System.currentTimeMillis() + "-项目编码流程测试-项目管理处审核   流程id" + proInsId + "任务id + " + taskId);
		LOG.info(Thread.currentThread().getName() + "时间:" + System.currentTimeMillis() +  "项目编码流程项目管理处审批 " + status + "流程id" + proInsId + "任务id" + taskId);
		if(FlowableConst.AGREE.equals(status)){
			projectOfficeApplyForAgree(proInsId, status, taskId, suggest, userId);
		}else{
			projectOfficeApplyForDisAgree(proInsId, status, taskId, suggest, userId);
		}
		
		
	}
	
	@Transactional
	public void projectOfficeApplyForAgree(String proInsId, String status, String taskId, String suggest, String userId){

		try {
			ProjectCodeProcess projectCodeProcess = getCurProjectCodeProcessExtByProcessId(proInsId);
			FlowableProjectCodeCache.setCurrentProjectCodeProcess(projectCodeProcess);
			
			
			projectCodeProcess.setProjectOfficeSuggest(suggest);
			projectCodeProcess.setProjOfficeTime(new Date());
			projectCodeProcess.setProjectOffice(userId);
			
			Map<String, Object>variables = new HashMap<String, Object>();
			variables.put("projOffice", status);
			variables.put("dept", projectCodeProcess.getDept());
			webFlowService.apply(taskId, variables);
			setCurDeal(projectCodeProcess, status);
					if(FlowableConst.AGREE.equals(status)){
						processLogService.createLog(new Date(), null, userId,
								status,
								suggest , 
								FlowableConst.ERP_CUR_STATUS, 
								projectCodeProcess.getApplyNo());
						
					projectCodeProcess.setCurStatus(FlowableConst.ERP_CUR_STATUS);
					projectCodeProcess.setCurDeal(FlowableConst.ERP_HANDLER);
					projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
					
					List<IbdsTask> oldTaskList = ibdsTaskService.getTaskByTaskId(projectCodeProcess.getApplyNo());
					IbdsTask task = new IbdsTask();
					task.setErpApplyNo(ibdsTaskService.getNewErpImportNoByApplyNo(projectCodeProcess.getApplyNo()));
					if(CollectionUtils.isNotEmpty(oldTaskList)){
						//删除任务
						ibdsTaskService.deleteTaskByTaskId(projectCodeProcess.getApplyNo());
					}
					//发送命令执行 同步erp操作
//					Task actTask = getTaskByProInsId(proInsId);
					String actTaskId =  FlowableProjectCodeCache.getCurrentActTaskId();
//					System.out.println(actTask.getId().equals(actTaskId));
//					List<Task> taskList = taskService.createTaskQuery().processInstanceId(proInsId).list();
					if(StringUtils.isNotBlank(actTaskId)){					
						task.setActTaskId(actTaskId);
						task.setCreateTime(new Date());
	//					task.setCreateUser(createUser);
						task.setTaskId(projectCodeProcess.getApplyNo());
						task.setType(FlowableConst.TASK_TYPE_PROJECTCODE_COA);
						task.setVal(projectCodeProcess.getApplyNo() + "~" + projectCodeProcess.getOptType());
						ibdsTaskService.addTask(task);
						
					}
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}


	}
	
	public void projectOfficeApplyForDisAgree(String proInsId, String status, String taskId, String suggest, String userId){

		try {
			ProjectCodeProcess projectCodeProcess = getCurProjectCodeProcessExtByProcessId(proInsId);
			FlowableProjectCodeCache.setCurrentProjectCodeProcess(projectCodeProcess);
			projectCodeProcess.setProjectOfficeSuggest(suggest);
			String curStatus = getCurStatusAndUpdateProjectCodeStatus(projectCodeProcess, FlowableConst.PROJECT_CODE_PROJ_OFFICE, status, null, null);
			projectCodeProcess.setCurStatus(curStatus);
			projectCodeProcess.setProjOfficeTime(new Date());
			projectCodeProcess.setProjectOffice(userId);
			projectOfficeApplyTransForDisAgree(projectCodeProcess,  status,  taskId,  suggest,  userId);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
	
	@Transactional
	public void projectOfficeApplyTransForDisAgree(ProjectCodeProcess projectCodeProcess, String status, String taskId, String suggest, String userId){
		Map<String, Object>variables = new HashMap<String, Object>();
		variables.put("projOffice", status);
		variables.put("dept", projectCodeProcess.getDept());
		webFlowService.apply(taskId, variables);
		setCurDeal(projectCodeProcess, status);
		projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
		String processLogStatus = getProcessLogStatus(FlowableConst.PROJECT_CODE_PROJ_OFFICE, status);
		processLogService.createLog(new Date(), null, userId,
					status,
					suggest , 
					processLogStatus, 
					projectCodeProcess.getApplyNo());
	}
	@Override
	@Transactional
	public String handleFinanceAndProject(String proInsId){
	//  TODO 如果同意则修改财务参考信息-----------------------------------------
		ProjectCodeProcessExt projectCodeProcessExt = getCurProjectCodeProcessExtByProcessId(proInsId);
		
		this.handleHisFinance(projectCodeProcessExt);
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				//插入财务信息中的项目编码
				financeProjectCodeService.addProjectCode(proInsId);
			}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
				financeProjectCodeService.updateProjectCode(proInsId);
				
			}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
				financeProjectCodeService.delProjectCode(proInsId);
			}
			
			
//			如果同意则修改财务参考信息-----------------------  end
			
			// TODO 修改数据为数据生效状态
			
			//修改研发基本信息
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				projectService.addProject(proInsId);
			}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
				projectService.updateProject(proInsId);
			}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
				projectService.delProject(proInsId);
			}
			/*Task task = getCurTaskByProInsId(proInsId);
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("erp", FlowableConst.AGREE);
			webFlowService.getTaskService().complete(task.getId(), param);
			projectCodeProcessExt.setCurStatus("流程结束");
			projectCodeProcessExt.setCurDeal("");
			projectCodeProcessService.updateProjectCodeProcess(projectCodeProcessExt);
			updateProjectCodeStatusToComplete(projectCodeProcessExt);*/
		List<ProcessConfigItem> items = processConfigItemService.getListByConfigCodeAndCode("projectCodeApply", "mailPerson");
		List<String> sendTo = new ArrayList<>();
		List<String> ccTo = new ArrayList<>();
		if(CollectionUtils.isNotEmpty(items)){
			for(ProcessConfigItem item : items){
				if("sendTo".equals(item.getType())){
					sendTo.add(item.getContent());
				}else if("ccTo".equals(item.getType())){
					ccTo.add(item.getContent());
				}
			}
		}
		String applyTpe;
		if("1".equals(projectCodeProcessExt.getOptType())){
			applyTpe = "新增";
		}else if ("2".equals(projectCodeProcessExt.getOptType())){
			applyTpe = "修改";
		}else if("3".equals(projectCodeProcessExt.getOptType())){
			applyTpe = "停用";
		}else{
			applyTpe = projectCodeProcessExt.getOptType();
		}
		ccTo.add(projectCodeProcessExt.getApplyer()+"@h3c.com");
		mailInfoService.sendEffectNotice(sendTo,ccTo,"项目编码"+applyTpe+"申请完成（"+projectCodeProcessExt.getApplyNo()+"）","projectWebFlow/edit?applyNo=" + projectCodeProcessExt.getApplyNo(), "项目编码申请");
			return "修改成功";
	}
	
	@Override
	public String handleHisFinance(ProjectCodeProcessExt projectCodeProcessExt){
//		只有修改, 停用才入历史表
		if(!FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			financeProjectCodeService.handleHisProjectCode(projectCodeProcessExt);			
		}
		return "修改成功";
	}
//	@Override
//	public int updateProjectCode(ProjectCodeApply projectCodeApply,
//			List<ProjectProductRel> projectProductRelList) {
//		int successNum = -1;
//		if(projectCodeApply != null){
//			successNum = projectCodeApplyService.updateProjectCode(projectCodeApply);
//		}else{
//			LOG.error("项目为空");
//			return -1;
//		}
//		if(projectProductRelList != null && projectProductRelList.size() > 0){
//			projectProductRelService.delProjectProductRel(projectCodeApply.getProNumber());
//			for(int i = 0; i < projectProductRelList.size(); i++){
//				projectProductRelService.addProjectProductRel(projectProductRelList.get(i));
//			}
//		}else{
//			LOG.error("项目编码没有对应的产品编码" + projectCodeApply.getProNumber());
//			return -1;
//		}
//		return successNum;
//	}

//	@Override
//	@Transactional
//	public int delProjectCode(List<String> productCodeList) {
//		int successNum = 0;
//		if(productCodeList != null && productCodeList.size() > 0){
//			for(int i = 0; i < productCodeList.size(); i++){
//				projectProductRelService.delProjectProductRel(productCodeList.get(i));
//				successNum = projectCodeApplyService.delProjectCode(productCodeList.get(i));
//			}
//		}
//		
//		return successNum;
//	}

	@Override
	public int addProjectCodeExt(ProjectCodeApplyExt projectCodeApplyExt) {
		if(projectCodeApplyExt != null){
			ProjectCodeApply projectCodeApply = (ProjectCodeApply)projectCodeApplyExt;
			projectCodeApplyService.addProjectCode(projectCodeApply);
			List<ProjectProductRel>  relList = projectCodeApplyExt.getProjectProductRelList();
			for(int i = 0; i < relList.size(); i++){
				this.projectProductRelService.addProjectProductRel(relList.get(i));
			}
		}
		return 0;
	}

	@Override
	public int addProjectCodeProcessExtForAddOrEdit(ProjectCodeProcessExt projectCodeProcessExt, String status) {
		int successNum = -1;
		if(projectCodeProcessExt != null){
			ProjectCodeProcess projectCodeProcess = (ProjectCodeProcess) projectCodeProcessExt;
			projectCodeProcess.setApplyCount(projectCodeProcessExt.getApplys().size());
			successNum = this.projectCodeProcessService.addProjectCodeProcess(projectCodeProcess);
			List<ProjectCodeApplyExt> projectCodeApplyExtList = projectCodeProcessExt.getApplys();
			if(CollectionUtils.isNotEmpty(projectCodeApplyExtList)){
				for(int i = 0; i < projectCodeApplyExtList.size(); i++){
					ProjectCodeApply  projectCodeApply = (ProjectCodeApply)projectCodeApplyExtList.get(i);
					projectCodeApply.setApplyNo(projectCodeProcessExt.getApplyNo());
					if(CollectionUtils.isNotEmpty(projectCodeApplyExtList.get(i).getProjectProductRelList())){
						projectCodeApply.setProductnum(projectCodeApplyExtList.get(i).getProjectProductRelList().size());						
					}
					projectCodeApply.setStatus(status);
					this.projectCodeApplyService.addProjectCode(projectCodeApply);
					
					
					List<ProjectProductRel> projectProductRelList = projectCodeApplyExtList.get(i).getProjectProductRelList();
					if(CollectionUtils.isNotEmpty(projectProductRelList)){
						for(int j = 0; j < projectProductRelList.size(); j++){
							ProjectProductRel tmpProjectProductRel = projectProductRelList.get(j);
							tmpProjectProductRel.setProjNo(projectCodeApply.getProNumber());
							tmpProjectProductRel.setProjectCodeId(projectCodeApply.getId());
							this.projectProductRelService.addProjectProductRel(tmpProjectProductRel);
						}
						
					}
				}			
			}
			
		}
		return successNum;
	}

	
	
	
	@Override
	public int updateProjectCodeProcess(ProjectCodeProcessExt projectCodeProcessExt) {
		int successNum = -1;
		if(projectCodeProcessExt != null){
			ProjectCodeProcess projectCodeProcess = (ProjectCodeProcess) projectCodeProcessExt;
			this.projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
		}
		return successNum;
	}
	
	
	/**
	 * 项目名称是否存在，如果存在在返回true，反之返回false
	 * @param projname
	 * @return
	 */
	@Override
	public boolean hasProjectCode(String projName){
		FProjectCode fProjectCode = flowableFProjectCodeService.getFProjectCodeByName(projName);
		if(fProjectCode != null){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 项目是否处于草稿状态
	 * @param projName
	 * @return
	 */
	@Override
	public boolean isProjectCodeApply(String projName){
		ProjectCodeApply ProjectCodeApply = this.projectCodeApplyService.getProjectCodeApplyByProjectName(projName);
		if(ProjectCodeApply != null && FlowableConst.PROJECTCODE_STATUS_APPLY.equals(ProjectCodeApply.getStatus())){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String getCurrentHandler(String proInsId, String userId) {
		String handler = "";
		Task curTask = this.getCurTaskByProInsId(proInsId, userId);
		if(curTask != null){
			if("usertask1".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				//申请人
				handler =  FlowableConst.PROJECT_CODE_APPLY;
			}else if("usertask2".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				//审核者
				handler =  FlowableConst.PROJECT_CODE_APPROVE;
			}else if("usertask3".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				//项目经理
				handler =  FlowableConst.PROJECT_CODE_PROJ_MNG;
			}else if("usertask4".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				//财务接口人
				handler =  FlowableConst.PROJECT_CODE_FINA_INTERFACE;
			}else if("usertask5".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				//财务
				handler =  FlowableConst.PROJECT_CODE_FINANCER;
			}else if("usertask6".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				//项目管理处
				handler =  FlowableConst.PROJECT_CODE_PROJ_OFFICE;
			}else if("usertask7".equalsIgnoreCase(curTask.getTaskDefinitionKey())){
				handler =  FlowableConst.PROJECT_CODE_FLOW_ADMIN;
			}
			
		}
		//财务		
		//项目管理处
		return handler;
	}
	
	@Override
	public ProjectCodeProcess getCurProjectCodeProcessByProcessId(String proInsId){
		ProjectCodeProcess projectCodeProcess = this.projectCodeProcessService.getProjectCodeProcessByProcessId1(proInsId);
		
		return projectCodeProcess;
	}
	
	@Override
	public ProjectCodeProcessExt getCurProjectCodeProcessExtByProcessId(String proInsId){
		ProjectCodeProcess projectCodeProcess = this.projectCodeProcessService.getProjectCodeProcessByProcessId1(proInsId);
		ProjectCodeProcessExt projectCodeProcessExt = buildProjectCodeProcessExt(projectCodeProcess);
		return projectCodeProcessExt;
	}

	@Override
	public ProjectCodeProcessExt getCurProjectCodeProcessExtByApplyNo(String applyNo){
		 
		ProjectCodeProcess projectCodeProcess = this.projectCodeProcessService.getProjectCodeProcessByApplyNo(applyNo);
		
		ProjectCodeProcessExt projectCodeProcessExt = null;
		
		if(projectCodeProcess != null){
			projectCodeProcessExt = buildProjectCodeProcessExt(projectCodeProcess);
		}
		return projectCodeProcessExt;
	}
	
	private ProjectCodeProcessExt buildProjectCodeProcessExt(ProjectCodeProcess projectCodeProcess){
		
		ProjectCodeProcessExt projectCodeProcessExt = new ProjectCodeProcessExt();
		try {
			BeanUtils.copyProperties(projectCodeProcessExt, projectCodeProcess);
			if(projectCodeProcess != null){
				List<ProjectCodeApply> projectCodeList = projectCodeApplyService.getProjectCodeApplyByApplyNo(projectCodeProcess.getApplyNo());
				List<ProjectCodeApplyExt> proejctCodeApplyExtList = new ArrayList<ProjectCodeApplyExt>();
				if(projectCodeList != null && projectCodeList.size() > 0){					
					for(int i = 0; i < projectCodeList.size(); i++){
						ProjectCodeApplyExt tmpProjectCodeApplyExt = new ProjectCodeApplyExt();
						BeanUtils.copyProperties(tmpProjectCodeApplyExt, projectCodeList.get(i));
						tmpProjectCodeApplyExt.setProTimeStr(TimeUtil.getStringTime1(projectCodeList.get(i).getProTime()));
						ProjectCodeApply tmpProjectCodeApply = projectCodeList.get(i);
						List<ProjectProductRel> projectProductRelList = 
								projectProductRelService.getProjectProductRelByPId(tmpProjectCodeApply.getId());
						tmpProjectCodeApplyExt.setProjectProductRelList(projectProductRelList);
						proejctCodeApplyExtList.add(tmpProjectCodeApplyExt);
					}
					projectCodeProcessExt.setApplys(proejctCodeApplyExtList);
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return projectCodeProcessExt;
	}
	
	
	@Override
	public Task getCurTaskByProInsId(String proInsId, String userId) {
		List<Task> taskList = taskService.createTaskQuery().processInstanceId(proInsId).
				taskAssignee(userId).orderByTaskCreateTime().desc().list();
		//项目编码申请一个流程里面同一时刻只能由一个人处理
		if(taskList != null && taskList.size() == 1){
			return taskList.get(0);
		}else{
//			LOG.error("proInsId:" + proInsId + "   userId:" + userId + "数据有问题");
			return null;
		}
	}
	
	@Override
	public Task getCurTaskByProInsId(String proInsId) {
		List<Task> taskList = taskService.createTaskQuery().processInstanceId(proInsId).orderByTaskCreateTime().desc().list();
		//项目编码申请一个流程里面同一时刻只能由一个人处理
		if(taskList != null && taskList.size() == 1){
			return taskList.get(0);
		}else{
			return null;
		}
	}
	
	@Override
	public int delProjectCodeProcessExtByApplyNo(String ApplyNo){
		
		int successNum = this.projectCodeProcessService.delProjectCodeProcessByApplyNo(ApplyNo);
		//通过流程id获取所有的项目编码
		List<ProjectCodeApply> projectCodeList = projectCodeApplyService.getProjectCodeApplyByApplyNo(ApplyNo);
		if(projectCodeList != null){
			
			for(int i = 0; i < projectCodeList.size(); i++){
				if(projectCodeList.get(i).getId() != null){
					this.projectProductRelService.delProjectProductRel(projectCodeList.get(i).getId());					
				}
				this.projectCodeApplyService.delProjectCodeByApplyNoAndProjectCode(projectCodeList.get(i).getProNumber(), projectCodeList.get(i).getApplyNo());			
			}
		}
		return successNum;
	}


	@Override
	public int addProjectCodeProcessExtForDel(ProjectCodeProcessExt projectCodeProcessExt, String status) {
		int successNum = -1;
		if(projectCodeProcessExt != null){
			ProjectCodeProcess projectCodeProcess = (ProjectCodeProcess) projectCodeProcessExt;
			projectCodeProcess.setApplyCount(projectCodeProcessExt.getApplys().size());
			successNum = this.projectCodeProcessService.addProjectCodeProcess(projectCodeProcess);
			List<ProjectCodeApplyExt> projectCodeApplyExtList = projectCodeProcessExt.getApplys();
			if(CollectionUtils.isNotEmpty(projectCodeApplyExtList)){
				for(int i = 0; i < projectCodeApplyExtList.size(); i++){
					ProjectCodeApply  projectCodeApply = (ProjectCodeApply)projectCodeApplyExtList.get(i);
					projectCodeApply.setApplyNo(projectCodeProcessExt.getApplyNo());
					projectCodeApply.setStatus(status);
					this.projectCodeApplyService.addProjectCode(projectCodeApply);
				}
			}
		}
		return successNum;
	}

	//新增项目编码审核者提交的时候判断在途
	@Override
	public Map<String, String> isZTProjectCodeForAdd(ProjectCodeProcessExt projectCodeProcessExt) {
		Map<String, String> resMap = new HashMap<String, String>();
		List<ProjectCodeApplyExt> projectCodeApplyList = projectCodeProcessExt.getApplys();
		if(projectCodeApplyList != null && projectCodeApplyList.size() > 0){
			for(int i = 0; i < projectCodeApplyList.size(); i++){
				
				ProjectCodeApply projectCodeApply = projectCodeApplyList.get(i);
				if(CollectionUtils.isNotEmpty(projectCodeApplyList)){
						//判断项目编码是否在途
						//判断R级，B级版本是否在途，一个项目编码只能对应一个R级或者B级
//						通过关联流程判断在途
						List<ProjectCodeProcess> ztProjectProcessList = getZTProjectCodeProcessByProjNumber(projectCodeApply.getProNumber(), projectCodeProcessExt.getApplyNo());
						if(CollectionUtils.isNotEmpty(ztProjectProcessList)){
							resMap.put("projectCodeProNumber", projectCodeApply.getProNumber());
							resMap.put("applyno", ztProjectProcessList.get(0).getApplyNo());
							return resMap;
						}
									
					}
			}
		}
		return resMap;
	}
	
	@Override
	public Map<String, String> isProjectCodeEditForUpdateAndDel(ProjectCodeProcessExt projectCodeProcessExt){
		Map<String, String> resMap = new HashMap<String, String>();
		if(projectCodeProcessExt != null){
			if(CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
				List<ProjectCodeApplyExt> projectCodeApplyExtList = projectCodeProcessExt.getApplys();
				for(int i = 0; i < projectCodeApplyExtList.size(); i++){
							ProjectCodeApply  projectCodeApply = projectCodeApplyExtList.get(i);
//							修改在途判断方式，通过项目编码反查流程表判断在途
							List<ProjectCodeProcess> ztProjectProcessList = getZTProjectCodeProcessByProjNumber(projectCodeApply.getProNumber(), projectCodeProcessExt.getApplyNo());
							if(CollectionUtils.isNotEmpty(ztProjectProcessList)){
								resMap.put("projectCodeProNumber", projectCodeApply.getProNumber());
								resMap.put("applyno", ztProjectProcessList.get(0).getApplyNo());
								return resMap;
							}
					
				}
			}
		}
		return resMap;
	}
	
	
	@Override
	public Map<String, String> isReleaseOrBversionEditForAdd(ProjectCodeProcessExt projectCodeProcessExt){
		
		//这里在途需要判断两个地方，1 是历史流程数据， 2  财务参考信息是否有关联的R和B版本
		

		Map<String, String> resMap = new HashMap<String, String>();
		
		if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
			
			List<ProjectCodeApplyExt> projectCodeApplyExtList = projectCodeProcessExt.getApplys();
			
			List<ProjectCodeApply> projectCodeApplyList = new ArrayList<ProjectCodeApply>();
			for(int i = 0; i < projectCodeApplyExtList.size(); i++){
				
				List<ProjectCodeApply> projectCodeApplyByBversionNoList = 
						projectCodeApplyService.getProjectCodeApplyByBversionNo(projectCodeApplyExtList.get(i).getBversionNo());
				
				List<ProjectCodeApply> projectCodeApplyByReleaseNoList =
						projectCodeApplyService.getProjectCodeApplyByReleaseNo(projectCodeApplyExtList.get(i).getReleaseNo());
				
				//如果有B版本则通过B版本判断，否则通过R版本判断
				if(StringUtils.isNotBlank(projectCodeApplyExtList.get(i).getBversionNo())){
					if(CollectionUtils.isNotEmpty(projectCodeApplyByBversionNoList)){
						projectCodeApplyList.addAll(projectCodeApplyByBversionNoList);
					}
				}else{
					if(CollectionUtils.isNotEmpty(projectCodeApplyByReleaseNoList)){
						projectCodeApplyList.addAll(projectCodeApplyByReleaseNoList);
					}
				}
				
				//1判断历史流程数据
				if(CollectionUtils.isNotEmpty(projectCodeApplyList)){
						//判断项目编码是否在途
						//判断R级，B级版本是否在途，一个项目编码只能对应一个R级或者B级
//						修改在途判断
					resMap.put("res","R版本名称 : " + projectCodeApplyExtList.get(i).getProName() + "  B版本名称 : " 
							+ projectCodeApplyExtList.get(i).getBversion() + "在途");
					return resMap;			
				}
				
				
				//2 判断财务才考信息中是否有R和B版本的数据
				Map<String, String> releaseOrBversionMap = checkFinanceReleaseOrBversion(projectCodeApplyExtList.get(i));
				
				if(releaseOrBversionMap != null && StringUtils.isNotBlank(releaseOrBversionMap.get("res"))){
					return releaseOrBversionMap;
				}
				
				
			}
		}
		
		return resMap;
	}
	
	private Map<String, String> checkFinanceReleaseOrBversion(ProjectCodeApplyExt projectCodeApplyExt){
		
		Map<String, String> resMap = new HashMap<String, String>();
		FProjectCode fProjectCode;
		if(StringUtils.isNotBlank(projectCodeApplyExt.getBversionNo())){
			//判断B版本
			fProjectCode = flowableFProjectCodeService.getFProjectCodeByBversonNo(projectCodeApplyExt.getBversionNo());
		}else{
			//判断R版本
			fProjectCode = flowableFProjectCodeService.getFProjectCodeByReleaseNo(projectCodeApplyExt.getReleaseNo());
		}
		
		if(fProjectCode != null){
			resMap.put("res","R版本名称 : " + projectCodeApplyExt.getProName() + "  B版本名称 : " + projectCodeApplyExt.getBversion() + "在财务参考信息中存在");
		}
		
		return resMap;
	}
	
	
	@Override
	public boolean isSameProjMng(ProjectCodeProcessExt projectCodeProcessExt){
		boolean flag = true;
		if(projectCodeProcessExt != null){
			List<ProjectCodeApplyExt> applys = projectCodeProcessExt.getApplys();
			if(applys != null && applys.size() > 0){
				ProjectCodeApplyExt firstProjectCodeApplyExt = applys.get(0);
				for(int i = 0; i <applys.size(); i++){
					if(!applys.get(i).getProManager().equals(firstProjectCodeApplyExt.getProManager())){
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}
	
	@Override
	public Map<String, String> isSamePdt(ProjectCodeProcessExt projectCodeProcessExt){
		Map<String, String> resMap = new HashMap<String, String>();
		if(projectCodeProcessExt != null){
			List<ProjectCodeApplyExt> applys = projectCodeProcessExt.getApplys();
			if(applys != null && applys.size() > 0){
				ProjectCodeApplyExt firstProjectCodeApplyExt = applys.get(0);
				IBDS_Release firstRelease = ibdsReleaseService.selectByCode(firstProjectCodeApplyExt.getReleaseNo());
				for(int i = 0; i <applys.size(); i++){
					IBDS_Release release = ibdsReleaseService.selectByCode(applys.get(i).getReleaseNo());
					if(release == null){
						resMap.put("res", "根据R级内码没有匹配到R级");
						break;
					}
//					if(release != null){
						IBDS_PDT pdt = ibdsPdtService.selectByCode(release.getPdtno());
						if(pdt != null && StringUtils.isBlank(pdt.getFinpdtId())){
							resMap.put("res", pdt.getPdt() + "没有财务代表");
							break;
						}else if(pdt == null){
							resMap.put("res", release.getRelease() + "没有PDT");
						}
						if(!release.getPdtno().equals(firstRelease.getPdtno())){
							resMap.put("res", ResponseMessageConst.PROJECT_CODE_SAME_PDT);
							break;
						}						
//					}
				}
			}
		}
		return resMap;
	}
	
	
	@Override
	public boolean isSameApplyNo(ProjectCodeProcessExt projectCodeProcessExt){
		
		boolean flag = false;
		if(projectCodeProcessExt != null){
			ProjectCodeProcess projectCodeProcess = this.projectCodeProcessService.getProjectCodeProcessByApplyNo(projectCodeProcessExt.getApplyNo());
			if(projectCodeProcess != null && !projectCodeProcess.getCurStatus().contains("不通过")
					&& !projectCodeProcess.getCurStatus().contains("草稿")){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean isSameProjName(ProjectCodeProcessExt projectCodeProcessExt){
		boolean flag = false;
		Map<String, Integer> resMap = new HashMap<String, Integer>();
		if(projectCodeProcessExt != null){
			List<ProjectCodeApplyExt> applys = projectCodeProcessExt.getApplys();
			if(CollectionUtils.isNotEmpty(applys)){
				
				for(int i = 0; i < applys.size(); i++){
					String projname = applys.get(i).getProName();
					if(StringUtils.isNotBlank(applys.get(i).getBversion())){
						projname += applys.get(i).getBversion();
					}
					
					if(resMap.containsKey(projname)){
						flag = true;
						break;
					}else{
						resMap.put(projname, 1);
					}
				}
			}
		}
		return flag;
	}
	@Override
	public boolean isSameBversionOrReleaseNo(ProjectCodeProcessExt projectCodeProcessExt){
		boolean flag = false;
		Map<String, Integer> resMap = new HashMap<String, Integer>();
		if(projectCodeProcessExt != null){
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				List<ProjectCodeApplyExt> applys = projectCodeProcessExt.getApplys();
				if(CollectionUtils.isNotEmpty(applys)){
					
					for(int i = 0; i < applys.size(); i++){
						String code = applys.get(i).getReleaseNo();
						if(StringUtils.isNotBlank(applys.get(i).getBversionNo())){
							code = applys.get(i).getBversionNo();
						}
						
						if(resMap.containsKey(code)){
							flag = true;
							break;
						}else{
							resMap.put(code, 1);
						}
					}
				}
			}			
		}
		
		return flag;
	}
	@Override
	public Map<String, String> handleProjectRate(ProjectCodeProcessExt projectCodeProcessExt){
		BigDecimal oneHundred = new BigDecimal("100");
		Map<String, String> map = new HashMap<String, String>();
		if(projectCodeProcessExt != null){
			if(CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
				for(ProjectCodeApplyExt projectCodeApplyExt : projectCodeProcessExt.getApplys()){
					List<ProjectProductRel> relList = projectCodeApplyExt.getProjectProductRelList();
					BigDecimal sum = new BigDecimal("0");
					if(relList != null){
						for(ProjectProductRel rel : relList){
							if(rel.getRate() != null){
								try {
//									sum += Double.parseDouble(rel.getRate());
									sum = sum.add(new BigDecimal(rel.getRate()));
								} catch (NumberFormatException e) {
									e.printStackTrace();
									map.put("rate", ResponseMessageConst.PROJECT_CODE_OVER_INTMAX);
									return map;
								}							
							}else{
								map.put("rate", ResponseMessageConst.PROJECT_CODE_PRODUCT_RATE);
								return map;
							}
						}
						if(0 != oneHundred.compareTo(sum)){
							map.put("rate", ResponseMessageConst.PROJECT_CODE_PRODUCT_RATE_NOT_100);
							return map;
						}						
					}else{
						map.put("rate" , ResponseMessageConst.PROJECT_CODE_PRODUCT_IS_EMPTY);
						return map;
					}
				}
			}
		}
		return null;
	}
	@Override
	public String getCurStatusAndUpdateProjectCodeStatus(ProjectCodeProcess projectCodeProcess, String handler, String status, Date date, String userId){
		
		if(FlowableConst.DISAGREE.equals(status)){
			updateProjectCodeStatusToDraft(projectCodeProcess);
			return /*FlowableConst.curStatusDisagreeMap.get(handler) + TimeUtil.getStringTime2(date) + */ FlowableConst.DISAGREE_POSTFIX;
		}else{
			return FlowableConst.curStatusAgreeMap.get(handler) + "审核";
		}
	}
	
	@Override
	public ProcessConfigPerson getCurDeal(String proInsId, String userId){
		Task task = getCurTaskByProInsId(proInsId, userId);
		if(task != null){
			return personService.getByProcessCodeAndRoleCode(task.getProcessInstanceId(), task.getTaskDefinitionKey());			
		}else{
			return null;
		}
	}
	
	@Override
	public void updateProjectCodeStatusToComplete(ProjectCodeProcessExt projectCodeProcessExt){
		updateProjectCodeStatus(projectCodeProcessExt,FlowableConst.PROJECT_CODE_PROJ_OFFICE_COMPLETE);
	}
	
	@Override
	public void updateProjectCodeStatusToDraft(ProjectCodeProcess projectCodeProcess){
//		updateProjectCodeStatus(projectCodeProcessExt,FlowableConst.PROJECT_CODE_PROJ_NOTSUBMIT);
		projectCodeProcess.setCurDeal(projectCodeProcess.getApplyer());
		projectCodeProcess.setIsEdit(FlowableConst.PROJECT_CODE_IS_EDIT_TRUE);
//		this.updateProjectCodeProcess(projectCodeProcessExt);
	}
	
	@Override
	public void updateProjectCodeStatusToDel(ProjectCodeProcessExt projectCodeProcessExt){
//		updateProjectCodeStatus(projectCodeProcessExt,FlowableConst.PROJECT_CODE_PROJ_NOTSUBMIT);
//		projectCodeProcessExt.setCurDeal(projectCodeProcessExt.getApplyer());
		projectCodeProcessExt.setIsEdit(FlowableConst.PROJECT_CODE_IS_EDIT_FALSE);
		this.updateProjectCodeProcess(projectCodeProcessExt);
	}
	
	@Override
	@Transactional
	public void deleteByApplyNo(String applyNo){
		if(StringUtils.isNotBlank(applyNo)){
			ProjectCodeProcessExt projectCodeProcessExt = getCurProjectCodeProcessExtByApplyNo(applyNo);
			updateProjectCodeStatusToDel(projectCodeProcessExt);
			if(StringUtils.isNotBlank(projectCodeProcessExt.getProcessInsId())){
				this.webFlowService.getRuntimeService().deleteProcessInstance(projectCodeProcessExt.getProcessInsId(), "终止当前流程");			
			}			
		}
	}
	
	public void updateProjectCodeStatus(ProjectCodeProcessExt projectCodeProcessExt, String status){
		if(projectCodeProcessExt != null){
			List<ProjectCodeApplyExt> projectCodeExtList = projectCodeProcessExt.getApplys();
			if(projectCodeExtList != null){
				for(int i = 0; i < projectCodeExtList.size(); i++){
					ProjectCodeApplyExt projectCodeApplyExt = projectCodeExtList.get(i);
					projectCodeApplyExt.setStatus(status);
					this.projectCodeApplyService.updateProjectCode(projectCodeApplyExt);
				}
			}
		}
	}
	
	@Override
	public Map<String, String> checkHandler(ProjectCodeProcessExt projectCodeProcessExt, String deptNo){
		List<ProcessConfigPerson> personList = 
				personService.getAllCheckPersonByProcessCodeAndDeptNo(FlowableConst.PROJECT_CODE_APPLY_BUSINESSKEY, deptNo);
		Map<String, String> resMap = new HashMap<String, String>();
		List<String> userTaskList = new ArrayList<String>(FlowableConst.projectCodeUserTasks);
		if(CollectionUtils.isNotEmpty(personList)){
			for(int i = 0; i < personList.size(); i++){
				if(StringUtils.isBlank(personList.get(i).getCheckerId())){
					resMap.put("res", "请配置自己部门的人员信息");
				}else{
					userTaskList.remove(personList.get(i).getProcessRoleCode());
				}
			}
		}else{
			resMap.put("res", "请配置自己部门的人员信息");
		}
		
		if(CollectionUtils.isNotEmpty(userTaskList)){
			resMap.put("res", "请配置自己部门的人员信息");
		}
		//项目编码财务接口人判断
		IBDS_Release release = releaseService.selectByCode(projectCodeProcessExt.getApplys().get(0).getReleaseNo());
		if(release != null){
			IBDS_PDT pdt = ibdsPdtService.selectByCode(release.getPdtno());
			if(pdt != null && StringUtils.isNotBlank(pdt.getFinpdtId())){
							
			}else{
				resMap.put("res", pdt.getPdt() + "没有对应的PDT财务代表，请联系管理员");
			}
			
		}
		return resMap;
	}
	
	@Override
	@Transactional
	public void  changeHandler(String id,String taskId,String userId){
		ProjectCodeProcess projectCodeProcess = projectCodeProcessService.getProjectCodeProcessByProcessId(id);
		projectCodeProcess.setCurDeal(userId);
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
        if(task == null){
            throw new RuntimeException("没有运行该任务");
        }
        projectCodeProcessService.updateProjectCodeProcess(projectCodeProcess);
        taskService.setAssignee(taskId, userId);
        FlowableProjectCodeCache.setCurrentActTaskId(taskId);
        ProjectCodeProcessExt projectCodeProcessExt = this.getCurProjectCodeProcessExtByApplyNo(projectCodeProcess.getApplyNo());
        sendProjectCodeEmail(projectCodeProcessExt, "同意");
        sendProjectCodeEipMsg(projectCodeProcessExt, "同意");
	}
	
	public String getProcessLogStatus(String handler, String status){
		if(FlowableConst.AGREE.equals(status)){
			return FlowableConst.curStatusAgreeMap.get(handler) +   "审核";
		}else{
			return /*FlowableConst.curStatusDisagreeMap.get(handler) +*/  FlowableConst.DISAGREE_POSTFIX;
		}
	}
	
	@Override
	public String isProjectCodeNameExist(ProjectCodeProcessExt projectCodeProcessExt){
		if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
			List<ProjectCodeApplyExt> list = projectCodeProcessExt.getApplys();
			for(int i = 0; i < list.size(); i++){
				String proName ="";
				if(StringUtils.isNotBlank(list.get(i).getProName())){
					if(StringUtils.isNotBlank(list.get(i).getBversion())){
						proName = list.get(i).getProName() + list.get(i).getBversion();
					}else{
						proName = list.get(i).getProName();
					}
				}
				if(flowableFProjectCodeService.getFProjectCodeByName(proName) != null){
					return list.get(i).getProName();
				}
			}
		}
		
		return null;
	}
	
	@Override
	public void sendSyncDataEmail(String type, ProjectCodeProcessExt projectCodeProcessExt,String content, String subject, String taskId){
		String url = "projectWebFlow/edit?applyNo=" + projectCodeProcessExt.getApplyNo();
		Task task = taskService.createTaskQuery().processInstanceId(projectCodeProcessExt.getProcessInsId()).singleResult();
		if(task != null){
			taskId = task.getId();
		}
		
		String sendTo = "";
		/*sendTo += projectCodeProcessExt.getApprover() + ",";
		sendTo += projectCodeProcessExt.getProjMng() + ",";
		sendTo += projectCodeProcessExt.getFinanceInterface() + ",";
		sendTo += projectCodeProcessExt.getFinancer() + ",";*/
		//只给最后一个节点的处理人
		sendTo += projectCodeProcessExt.getProjectOffice() + ",";
		//获取管理员
		List<UserRoleRelation> adminUserList = userRoleRelationService.getAdminRelListByAdminRoleCode(null);
		
		if(CollectionUtils.isNotEmpty(adminUserList)){
			for(int i = 0; i < adminUserList.size(); i++){
				sendTo += adminUserList.get(i).getHurrHulCode() + ",";
			}
		}
		
		
		mailInfoService.sendMailAndRecord(sendTo, projectCodeProcessExt.getApplyer(), content,
				subject, Integer.valueOf(projectCodeProcessExt.getProcessInsId()), url ,"项目编码申请", taskId);
	}
	
	@Override
	public void sendSyncEipMsg(ProjectCodeProcessExt projectCodeProcessExt, String status){
		this.sendProjectCodeEipMsg(projectCodeProcessExt, status);
	}
	public void sendProjectCodeEipMsg(ProjectCodeProcess projectCodeProcess, String status){
		//TODO  
//		projectCodeProcessExt = getCurProjectCodeProcessExtByApplyNo(projectCodeProcessExt.getApplyNo());
		
		String docunId = projectCodeProcess.getApplyNo();
		String url = siteMainUrl + "/eipLogin?docuId=" + docunId;
		String projectCodeUrl = "projectWebFlow/edit?applyNo=" + projectCodeProcess.getApplyNo();
		String authorName = userService.getUserNameByAccount(projectCodeProcess.getApplyer());
		String addUserName = userService.getUserNameByAccount(projectCodeProcess.getCurDeal());
		if("end".equals(status)){
			eipService.syncEip("项目编码申请",docunId,
					"", "", projectCodeProcess.getCurStatus(),
					EipConst.PROCESSID_PROJECTCODE, url, projectCodeUrl, projectCodeProcess.getApplyer(), authorName, true);
		}else{
			eipService.syncEip("项目编码申请",docunId,
					projectCodeProcess.getCurDeal(), addUserName, projectCodeProcess.getCurStatus(),
					EipConst.PROCESSID_PROJECTCODE, url, projectCodeUrl, projectCodeProcess.getApplyer(), authorName, false);
		}

		
	}
	public void sendProjectCodeEmail(ProjectCodeProcess projectCodeProcess, String status){
//		Task task = getTaskByProInsId(projectCodeProcessExt.getProcessInsId());
		String taskId = FlowableProjectCodeCache.getCurrentActTaskId();
		String url = "projectWebFlow/edit?applyNo=" + projectCodeProcess.getApplyNo();
		
		//流程监听器里面配置，导致这边数据不同步，所有从这里从新获取一遍
		// TODO
//		projectCodeProcessExt = getCurProjectCodeProcessExtByApplyNo(projectCodeProcessExt.getApplyNo());
//		projectCodeProcessExt = FlowableProjectCodeCache.getCurrentProjectCodeProcessExt();
		if(StringUtils.isBlank(status)){
			mailInfoService.sendMailAndRecord(projectCodeProcess.getCurDeal(), projectCodeProcess.getApplyer(), "请您审核项目编码申请表：" + projectCodeProcess.getCurStatus(),
					null, Integer.valueOf(projectCodeProcess.getProcessInsId()), url ,"项目编码申请", taskId);
		}else{
			if(FlowableConst.AGREE.equals(status)){
				mailInfoService.sendMailAndRecord(projectCodeProcess.getCurDeal(), projectCodeProcess.getApplyer(), "请您审核项目编码申请表：" + projectCodeProcess.getCurStatus(),
						null, Integer.valueOf(projectCodeProcess.getProcessInsId()), url ,"项目编码申请", taskId);
			}else{
				mailInfoService.sendMailAndRecord(projectCodeProcess.getApplyer(), "请您审核项目编码申请表：" + projectCodeProcess.getCurStatus(),
						null, Integer.valueOf(projectCodeProcess.getProcessInsId()), url,"项目编码申请", taskId);
			}
		}
		
	}
	
	@Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
	public Task getTaskByProInsId(String proInsId){
		LOG.info("发邮件压测流程id" + proInsId);
		return taskService.createTaskQuery().processInstanceId(proInsId).singleResult();
	}
	@Override
	public ProjectCodeProcessExt changeProjectCodeToProjectCodeProcessExt(List<ExcelProjectCodeModel> excelProjectCodeModelList,
			Map<String, IBDS_Release> releaseMap, Map<String, IBDS_Bversion> bversionMap) throws Exception{
		ProjectCodeProcessExt tmpProjectCodeProcessExt = new ProjectCodeProcessExt();
		Map<String, String> objCaNameMap = getDicMap("6");
		Map<String, String> assignPointMap = getDicMap("21");
//		Map<String, String> deptMap = getDicMap("");
		if(CollectionUtils.isNotEmpty(excelProjectCodeModelList)){
			LinkedList<ProjectCodeApplyExt> applys = new LinkedList<ProjectCodeApplyExt>();
			tmpProjectCodeProcessExt.setApplys(applys);
			for(int i = 0; i < excelProjectCodeModelList.size(); i++){
				buildProjectCode(excelProjectCodeModelList.get(i), applys, objCaNameMap, assignPointMap,releaseMap, bversionMap);
			}
			tmpProjectCodeProcessExt.setApplyCount(applys.size());
		}else{
			tmpProjectCodeProcessExt = null;
		}
		
		
		return tmpProjectCodeProcessExt;
	}
	
	//关联R级查询出R级的内码，B级的内码
	private void buildProjectCode(ExcelProjectCodeModel excelProjectCodeModel, LinkedList<ProjectCodeApplyExt> applys,
			Map<String, String> objCaNameMap, Map<String, String> assignPointMap, Map<String, IBDS_Release> releaseMap, 
			Map<String, IBDS_Bversion> bversionMap) throws Exception{
		if(excelProjectCodeModel.getProductnum() != null){
			//项目编码数据 和产品编码数据都有
			ProjectCodeApplyExt tmpProjectCodeApplyExt = new ProjectCodeApplyExt();
			applys.add(tmpProjectCodeApplyExt);
			BeanUtils.copyProperties(tmpProjectCodeApplyExt,excelProjectCodeModel);
			//设置R级内码，B级内码，pdt内码
//			this.releaseViewService.
//			IBDS_Release release = flowableReleaseService.getReleaseByName(tmpProjectCodeApplyExt.getProName());
			IBDS_Release release = releaseMap.get(tmpProjectCodeApplyExt.getProName());
			if(release != null){
				tmpProjectCodeApplyExt.setReleaseNo(release.getReleaseno());
				tmpProjectCodeApplyExt.setPdtNo(release.getPdtno());
				if(StringUtils.isNoneBlank(release.getProductMnger())){
					tmpProjectCodeApplyExt.setProManager(release.getProductMnger().split(",")[0]);					
				}
			}
			
			if(release != null){
				Map<String, String> param = new HashMap<String, String>();
				param.put("releaseNo", release.getReleaseno());
				param.put("bVersionName", tmpProjectCodeApplyExt.getBversion());
//				IBDS_Bversion ibds_Bversion = flowableBversionService.getBversionByReleaseCodeAndBversionName(param);
				IBDS_Bversion ibds_Bversion = bversionMap.get(release.getReleaseno() + "_" + tmpProjectCodeApplyExt.getBversion());
				if(ibds_Bversion != null){
					tmpProjectCodeApplyExt.setBversionNo(ibds_Bversion.getVersionno());					
				}
			}
			//字典码转换
		
//			项目类别
//			对应评审点
			tmpProjectCodeApplyExt.setProCaName(tmpProjectCodeApplyExt.getProCa());
			tmpProjectCodeApplyExt.setProPointName(tmpProjectCodeApplyExt.getProPoint());
			tmpProjectCodeApplyExt.setProCa(objCaNameMap.get(excelProjectCodeModel.getProCa()));
			tmpProjectCodeApplyExt.setProPoint(assignPointMap.get(excelProjectCodeModel.getProPoint())); 
			
		
			
			ProjectProductRel tmpProjectProductRel = new ProjectProductRel();
			BeanUtils.copyProperties(tmpProjectProductRel, excelProjectCodeModel);
			//pdt重名了，重新set一下
			tmpProjectProductRel.setPdtName(excelProjectCodeModel.getProductPdt());
			List<ProjectProductRel> projectProductRelList = new ArrayList<ProjectProductRel>();
			projectProductRelList.add(tmpProjectProductRel);
			tmpProjectCodeApplyExt.setProjectProductRelList(projectProductRelList);
		}else{
			//只有产品编码数据
			ProjectProductRel tmpProjectProductRel = new ProjectProductRel();
			BeanUtils.copyProperties(tmpProjectProductRel, excelProjectCodeModel);
			//pdt重名了，重新set一下
			tmpProjectProductRel.setPdtName(excelProjectCodeModel.getProductPdt());
			applys.getLast().getProjectProductRelList().add(tmpProjectProductRel);
		}
	}
	
	private Map<String, String> getDicMap(String typeCode){
		Map<String, String> resMap = new HashMap<String, String>();
		Map<String, String> param = new HashMap<String, String>();
		//项目类型
		param.put("typeCode", typeCode);
		List<IBDS_Dic> objCaNameList = dicService.getDic(param);
		if(CollectionUtils.isNotEmpty(objCaNameList)){
			for(int i = 0; i < objCaNameList.size(); i++){
				IBDS_Dic dic = objCaNameList.get(i);
				resMap.put(dic.getDicName(), dic.getDicValue());
			}
		}else{
			throw new RuntimeException("字典码数据没有，请联系管理员");
		}
		return resMap;
	}

	@Override
	public void valicateProjectCodeExcel(List<ExcelProjectCodeModel> excelProjectCodeModelList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> checkProjectCodeExcel(List<ExcelProjectCodeModel> excelProjectCodeModelList) {
		
		StringBuffer errorStrBuf = new StringBuffer();
		Map<String, IBDS_Release> releaseMap = new HashMap<String, IBDS_Release>();
		Map<String, IBDS_Bversion> bversionMap = new HashMap<String, IBDS_Bversion>();
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("release", releaseMap);
		resMap.put("bversion", bversionMap);
		if(CollectionUtils.isNotEmpty(excelProjectCodeModelList)){
			
			for(int i = 0; i < excelProjectCodeModelList.size(); i++){
				ExcelProjectCodeModel tmpExcelProjectCodeModel = excelProjectCodeModelList.get(i);
				if(tmpExcelProjectCodeModel.getProductnum() != null){
					checkProjectCodeAndProductCode(i, errorStrBuf, tmpExcelProjectCodeModel, releaseMap,  bversionMap);					
				}else{
					checkProductCode(i, errorStrBuf, tmpExcelProjectCodeModel);
				}
			}
			
			
			
		}
		if(StringUtil.isNotEmpty(errorStrBuf.toString())){
			resMap.put("error", errorStrBuf.toString());
		}
		
		return resMap;
	}
	
	
	
	private void checkProjectCodeAndProductCode(int i, StringBuffer errorStrBuf, ExcelProjectCodeModel tmpExcelProjectCodeModel,
			Map<String, IBDS_Release> releaseMap, Map<String, IBDS_Bversion> bversionMap){

		
		//R是否能关联到
		IBDS_Release release = flowableReleaseService.getReleaseByName(tmpExcelProjectCodeModel.getProName());
		if(release != null){
			releaseMap.put(tmpExcelProjectCodeModel.getProName(), release);
			//这里导入先不做严格校验，提交的时候还会校验
			/*if(StringUtils.isBlank(release.getProductMnger())){
				errorStrBuf.append("第" + (i + 2) +  "行项目关联不到项目经理\n");
			}*/
			if(StringUtils.isBlank(release.getPdtno())){
				errorStrBuf.append("第" + (i + 2) +  "行项目关联不到pdt内码\n");
			}
		}else{
			errorStrBuf.append("第" + (i + 2) +  "行项目名称关联不到R级\n");
		}
		//B是否能关联到
		if(release != null && StringUtils.isNotBlank(tmpExcelProjectCodeModel.getBversion())){
			Map<String, String> param = new HashMap<String, String>();
			param.put("releaseNo", release.getReleaseno());
			param.put("bVersionName", tmpExcelProjectCodeModel.getBversion());
			IBDS_Bversion ibds_Bversion = flowableBversionService.getBversionByReleaseCodeAndBversionName(param);
			if(ibds_Bversion != null){
				 bversionMap.put(release.getReleaseno() + "_" + tmpExcelProjectCodeModel.getBversion(), ibds_Bversion);					
			}else{
				errorStrBuf.append("第" + (i + 2) +  "行B版本关联不到\n");
			}
		}
		
		if(tmpExcelProjectCodeModel.getRate() == null){
			errorStrBuf.append("第" + (i + 2) +  "行产品编码分摊比例为空\n");
		}
		//产品编码数据是不是有问题
		checkProductCode(i, errorStrBuf, tmpExcelProjectCodeModel);
	
	}
	
	private void checkProductCode(int i, StringBuffer errorStrBuf, ExcelProjectCodeModel tmpExcelProjectCodeModel){
		List<FProductCode> fProductCodeList = this.fProductCodeService.getByProductCode(tmpExcelProjectCodeModel.getProductCode());
		if(CollectionUtils.isNotEmpty(fProductCodeList)){
			if(fProductCodeList.size() > 1){
				errorStrBuf.append("第" + (i + 2) +  "行产品编码关联到多个，默认取第一个了,请联系管理员规范产品编码数据\n");
			}
			if(!fProductCodeList.get(0).getProductNameCn().equals(tmpExcelProjectCodeModel.getProductName())){
				errorStrBuf.append("第" + (i + 2) +  "行产品编码关联到的产品名称和导入的产品名称不一致，请核对\n");
			}
			if(!fProductCodeList.get(0).getPdtName().equals(tmpExcelProjectCodeModel.getProductPdt())){
				errorStrBuf.append("第" + (i + 2) +  "行产品编码关联到的pdt名称和导入的pdt名称不一致，请核对\n");
			}
		}else{
			errorStrBuf.append("第" + (i + 2) +  "行产品编码关联不到\n");
		}
	}
	
	//获取在途的项目编码流程
	public List<ProjectCodeProcess> getZTProjectCodeProcessByProjNumber(String proNumber, String applyNo){
		return projectCodeProcessService.getZTProjectCodeProcessByProjNumber(proNumber, FlowableConst.PROJECT_CODE_IS_EDIT_DEFAULT, applyNo);
	}
}
