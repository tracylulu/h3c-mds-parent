package com.h3c.mds.basicinfo.service.impl;

import com.h3c.mds.product.entity.*;
import com.h3c.mds.product.service.*;
import org.springframework.stereotype.*;

import java.util.Date;
import java.util.HashMap;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientProcessService;
import com.h3c.mds.basicinfo.service.ProductProcessService;
import com.h3c.mds.basicinfo.service.view_DifficultyCoefficientService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficient;

import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientApplyService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_Item_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_PROCESSMapper;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_HistoryMapper;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.product.common.productOperationLogUtils;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_History;


@Service
public class DifficultyCoefficientProcessServiceImpl implements DifficultyCoefficientProcessService{
	private static final Logger logger = LoggerFactory.getLogger(DifficultyCoefficientProcessServiceImpl.class);

	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private IBDS_DifficultyCoefficient_APPLYMapper diffApplyMapper;
	@Autowired
	private DifficultyCoefficientApplyService diffApplyService;
	@Autowired
	private IBDS_DifficultyCoefficient_PROCESSMapper diffProcessMapper;
	@Autowired
	private IBDS_DifficultyCoefficient_Item_APPLYMapper diffApplyItemMapper;
	@Autowired
	private view_DifficultyCoefficientService viewDiffService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;
	@Autowired
	private IBDS_BversionService bVersionService;
	@Autowired
	private IBDS_ReleaseService releaseService;
	@Autowired
	private IBDS_DifficultyCoefficient_HistoryMapper  diffHistoryMapper;
	@Autowired
	private ProdLineService prodService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
    private MailInfoService mailInfoService;
	@Autowired
	private IbdsMaxCodeService ibdsMaxCodeService;
	@Autowired
	private productOperationLogUtils optLog;
	@Autowired
	private EipService eipService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private IBDS_PDTService pdtService;
	@Value("${sso.main.url}")
    private String siteMainUrl;
	
	//private static String APPLY_CODE;

	@Transactional(readOnly = true)
	public String initApplyCode() {
		String maxCode = diffProcessMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "D" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000";
		}
		return maxCode;
	}

	@Override
	@Transactional
	public synchronized String getMaxCode() {
		IbdsMaxCode maxCode = ibdsMaxCodeService.getByName("diffApply");
        if(maxCode == null||(maxCode!=null&&!maxCode.getPrefix().substring(0,maxCode.getPrefix().length() - 3)
        		.equals("D" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date())))){
            maxCode = new IbdsMaxCode();     
            maxCode.setProjectName("diffApply");
            maxCode.setPrefix(initApplyCode());
        }
		int val = Integer.parseInt(maxCode.getPrefix().substring(maxCode.getPrefix().length() - 3, maxCode.getPrefix().length())) + 1;
		String valStr = String.valueOf(val);
		String code = "D" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date());
		for (int i = 0; i < 3 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		
		maxCode.setPrefix(code);
		if(maxCode.getId() == null){
            ibdsMaxCodeService.addIbdsMaxCode(maxCode);
        }else{
            ibdsMaxCodeService.updateIbdsMaxCode(maxCode);
        }
		return code;
	}
	
	@Override
	public void submit(IBDS_DifficultyCoefficient_APPLY diffApply,	IBDS_DifficultyCoefficient_PROCESS diffProcess,
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstItem) {
		diffApplyService.validateApply(diffApply, lstItem);

		String userCode = "";
		
		// 设置执行秘书
		if (StringUtils.isNotBlank(diffApply.getPlipmtno())) {
			IBDS_PLIPMT plipmt = colunmConfigService.selectByCode(diffApply.getPlipmtno());

			// 根据选中的PLIPMT查询下一步审批人员 即IPMT执行秘书
			userCode = backprocesserDomainAccount(plipmt.getPlimptSecretary());
			if(StringUtils.isNotBlank(userCode)) {
				diffApply.setIpmtsecretary(userCode);
			}else {
				throw new FlowableException("下一步审批人不能为空,请配置IPMT执行秘书！");
			}
		}

		String userId = (String) SecurityUtils.getSubject().getPrincipal();

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal());
		variables.put("applyDept", "");
		// TODO 后续有事件重构从配置表中获取
		if (StringUtils.isNotBlank(diffApply.getProdlineno())) {
			IBDS_PRODLINE prod = prodService.selectByCode(diffApply.getProdlineno());
			
			// 查询下一步审批人员 产品线质量部经理
			userCode = backprocesserDomainAccount(prod.getQualityMngerId());
			if (StringUtils.isNotBlank(userCode)) {
				variables.put("MGN", userCode);
			} else {
				throw new FlowableException("下一步审批人不能为空,请配置产品线质量部经理！");
			}
		}

		// 第一次提交
		if (StringUtils.isBlank(diffProcess.getInstanseId())) {
			// 启动流程并通过第一个
			String instanceId = productCodeFlowableService.startFlowableAndPassOne("DifficultyCoefficientApply", userId, variables);
			diffProcess.setInstanseId(instanceId);
		} else {
			// 打回后重复提交
			Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(diffProcess.getInstanseId(), userId);
			productCodeFlowableService.pass(task.getId());
		}

		// 设置编码
		if (StringUtil.isEmpty(diffProcess.getApplyCode())) {
			String maxcode = getMaxCode();
			diffApply.setProcessCode(maxcode);
			diffProcess.setApplyCode(maxcode);
		}
		diffProcess.setHandler(FlowableCache.getCurrentHandler());
		diffProcess.setCurrentnode(FlowableCache.getCurrentNode());
		diffProcess.setStatusDesc(FlowableCache.getCurrentStatusDesc());
		diffProcess.setStatus(FlowableConst.PROJECTCODE_STATUS_APPLY);
		diffProcess.setFirstSign((String) SecurityUtils.getSubject().getPrincipal());
		diffProcess.setFirstDate(new Date());

		diffApplyService.Save(diffApply, diffProcess, lstItem);
		processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(), "提交申请",
				null, FlowableCache.getCurrentStatusDesc(), diffProcess.getApplyCode());
		
		Task task =productCodeFlowableService.getTaskByInstanceId(diffProcess.getInstanseId());
				//taskService.createTaskQuery().processInstanceId(diffProcess.getInstanseId()).singleResult();
				
		mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(), userId,
				"请您审核难度系数申请：" + FlowableCache.getCurrentStatusDesc(), null, diffProcess.getId(),
				"/basicinfo/DifficultyCoefficient/edit/" + diffApply.getId(), "难度系数申请", task.getId());
		
		//同步eip
		//sendProjectCodeEipMsg(diffApply.getId(),diffApply.getProcessCode(),(String) SecurityUtils.getSubject().getPrincipal(),diffProcess.getHandler(),diffProcess.getStatusDesc(),false);
		sendProjectCodeEipMsg(diffApply.getId(),false);
	}
	
	/**
	 * 返回人员域账号
	 * 
	 * @param user 姓名+工号 多个逗号分隔返回首个
	 */
	public String backprocesserDomainAccount(String user) {
		String userCode = "";
		if (StringUtils.isBlank(user)) {
			return userCode;			
		} else {
			// 如果配置了多个人员,取逗号前第一个人
			if (user.contains(",")) {
				userCode = user.split(",")[0];
			} else {
				userCode = user;
			}
			userCode = userService.backDomainAccount(userCode);
		}
		return userCode;
	}
	
	/**
	 * 审核
	 */
	@Override	
	public void check(Integer processID , String taskId, Map<String, Object> params) {
		try {			
			IBDS_DifficultyCoefficient_PROCESS process =diffProcessMapper.selectByPrimaryKey(processID);
			IBDS_DifficultyCoefficient_APPLY diffApply=new IBDS_DifficultyCoefficient_APPLY();
			// 1 为同意 0 为不同意
			Map<String, Object> variables = new HashMap<>();
			if ("1".equals(params.get("checkResult"))) {
				variables.put("checkResult", "同意");
			} else if ("0".equals(params.get("checkResult"))) {
				variables.put("checkResult", "不同意");
			}
			int id=Integer.parseInt((String)params.get("applyID"));
			diffApply=diffApplyMapper.selectByPrimaryKey(Integer.parseInt((String)params.get("applyID")));
			variables.put("IPMTSecretary", diffApply.getIpmtsecretary());
			
			if("mgn".equals((String)params.get("type"))) {
				String userCode="";
				if (StringUtils.isNotBlank(diffApply.getProdlineno())) {
					IBDS_PRODLINE prod = prodService.selectByCode(diffApply.getProdlineno());
					// 查询质量部总监
					userCode=backprocesserDomainAccount(prod.getQualityDirectorId());
					if(StringUtils.isBlank(userCode)) {
						 throw new FlowableException("未找到当前产品线质量部总监！");
					}
					
					variables.put("Quality", userCode);			
				}
				if(StringUtils.isNotBlank((String)params.get("proFileID"))
						&&StringUtils.isNotBlank((String)params.get("proFileName"))) {
					diffApply.setProdBasismaterialid((String)params.get("proFileID"));
					diffApply.setProdBasismaterial((String)params.get("proFileName"));
				}
				
				if(StringUtils.isNotBlank((String)params.get("hardFileID"))
						&&StringUtils.isNotBlank((String)params.get("hardFileName"))) {
					diffApply.setHardBasismaterialid((String)params.get("hardFileID"));
					diffApply.setHardBasismaterial((String)params.get("hardFileName"));
				}
			}
			
			complete(taskId, variables);
			
			String checkRole = (String) params.get("checkRole");
			// 对应角色的审核日期
			PropertyUtils.setProperty(process, (String) params.get("checkDate"), new Date());
			// TODO 人员设置
			PropertyUtils.setProperty(process, (String) params.get("checkPerson"),
					SecurityUtils.getSubject().getPrincipal());
			// 对应角色审核结果
			Map<String, String> checkResultForRole = (Map<String, String>) params.get("checkResultForRole");
			PropertyUtils.setProperty(process, checkResultForRole.get("resultName"),
					checkResultForRole.get("resultValue"));
			// 对应角色审核意见
			Map<String, String> checkOpinionForRole = (Map<String, String>) params.get("checkOpinionForRole");
			if (checkOpinionForRole != null) {
				PropertyUtils.setProperty(process, checkOpinionForRole.get("opinionName"),
						checkOpinionForRole.get("opinionValue"));
			}
			process.setCurrentnode(FlowableCache.getCurrentNode());
			process.setHandler(FlowableCache.getCurrentHandler());
			process.setStatusDesc(FlowableCache.getCurrentStatusDesc());

			//退回单据设置状态
			Task task = productCodeFlowableService.getTaskByInstanceId(process.getInstanseId());
				//taskService.createTaskQuery().processInstanceId(process.getInstanseId()).singleResult();
			if ("0".equals(params.get("checkResult"))) {
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_Return);
				mailInfoService.sendMailAndRecord(process.getFirstSign(),"请您审核难度系数申请："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
						"/basicinfo/DifficultyCoefficient/edit/"+diffApply.getId(),"难度系数申请",task.getId());
			}else if("1".equals(params.get("checkResult"))&&task!=null) {
				mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),process.getFirstSign(),"请您审核难度系数申请："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
						"/basicinfo/DifficultyCoefficient/edit/"+diffApply.getId(),"难度系数申请",task.getId());
			}
			
			checkSaveData(process,diffApply,params,variables,checkOpinionForRole);
			
		} catch (Exception e) {
			logger.error("审核失败", e);
			throw new FlowableException(e);
		}			
	}
	
	/**
	 * 审批通过
	 * @param taskId
	 * @param variables
	 */
	@Transactional
	public void complete(String taskId, Map<String, Object> variables) {
		taskService.complete(taskId, variables);
	}
	
	/**
	 * 审批后数据处理
	 * @param process
	 * @param diffApply
	 * @param params 参数
	 * @param variables 申请流参数
	 * @param checkOpinionForRole  对应角色审核意见
	 */
	@Transactional
	public void checkSaveData(IBDS_DifficultyCoefficient_PROCESS process, IBDS_DifficultyCoefficient_APPLY diffApply,
			Map<String, Object> params, Map<String, Object> variables,Map<String, String> checkOpinionForRole) {
		Boolean isEnd = false;

		// 当前元素为结束事件
		if ("end".equals(FlowableCache.getCurrentElement())) {
			// TODO 代表流程结束状态 后续放到常量类中
			process.setStatus("10");
			// 写入难度系数
			writeDifficultyCoefficient(diffApply);
			process.setHandler("");
			isEnd = true;

			IBDS_Release ibds_release = releaseService.selectByCode(diffApply.getReleaseno());
			IBDS_PDT pdt = pdtService.selectByCode(ibds_release == null ? "00000" : ibds_release.getPdtno());
			List<String> sendTo = new ArrayList<>();
			List<String> ccTo = new ArrayList<>();
			if(pdt != null){
				if(StringUtils.isNotBlank(pdt.getRndpdtId())){
					String[] split = pdt.getRndpdtId().split(",");
					for(String c : split){
						String s = userService.backDomainAccount(c);
						ccTo.add(s+"@h3c.com");
					}
				}
				if(StringUtils.isNotBlank(pdt.getPqaId())){
					String[] split = pdt.getPqaId().split(",");
					for(String c : split){
						String s = userService.backDomainAccount(c);
						ccTo.add(s+"@h3c.com");
					}
				}
			}
			sendTo.add(process.getCreator()+"@h3c.com");
			mailInfoService.sendEffectNotice(sendTo,ccTo,"难度系数申请已经生效","/basicinfo/DifficultyCoefficient/edit/"+diffApply.getId(),"难度系数申请" );
		}

		if ("mgn".equals((String) params.get("type"))) {
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstItem = new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();

			if (StringUtil.isNotEmpty((String) params.get("itemList"))) {
				lstItem = JSONObject.parseArray((String) params.get("itemList"),
						IBDS_DifficultyCoefficient_Item_APPLY.class);
			}

			diffApplyService.Save(diffApply, new IBDS_DifficultyCoefficient_PROCESS(), lstItem);
		}

		diffProcessMapper.updateByPrimaryKeySelective(process);
		processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
				(String) variables.get("checkResult"),
				checkOpinionForRole == null ? null : checkOpinionForRole.get("opinionValue"),
				FlowableCache.getCurrentStatusDesc(), process.getApplyCode());
		// 同步EIP
		//sendProjectCodeEipMsg(diffApply.getId(), diffApply.getProcessCode(), process.getCreator(), process.getHandler(),
		//		process.getStatusDesc(), false);
		sendProjectCodeEipMsg(  diffApply.getId(),  isEnd);
	}
	
	@Override
	@Transactional
	public void changeHandler(Integer id, String taskId, String userId) {
		IBDS_DifficultyCoefficient_PROCESS process = diffProcessMapper.selectByPrimaryKey(id);
		
		// process.setAssignSign((String) SecurityUtils.getSubject().getPrincipal());
		// process.setAssignDate(new Date());
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			throw new RuntimeException("没有运行该任务");
		}
		/*
		 * User user= userService.selectByPCode(userId); if(user==null) { throw new
		 * RuntimeException("未找到指定的人员"); }
		 */
		taskService.setAssignee(taskId, userId);
		process.setHandler(userId);		
		process.setModifier((String) SecurityUtils.getSubject().getPrincipal());
		process.setModifytime(new Date());
		diffProcessMapper.updateByPrimaryKeySelective(process);
	}
	
	/**
	 * 根据ID获取数据
	 */
	@Override
	public IBDS_DifficultyCoefficient_PROCESS getByID(Integer id) {
		 return diffProcessMapper.selectByPrimaryKey(id);
	}

	/**
	 * 写入难度系数
	 * @param diffApply
	 */
	public void writeDifficultyCoefficient(IBDS_DifficultyCoefficient_APPLY diffApply) {
		
		List<IBDS_Bversion> lstclearPBAll=new ArrayList<IBDS_Bversion>();
		List<IBDS_Bversion> lstclearHBAll=new ArrayList<IBDS_Bversion>();
		List<IBDS_Bversion> lsteditBAll=new ArrayList<IBDS_Bversion>();
		List<IBDS_DifficultyCoefficient_Item_APPLY> lst=diffApplyItemMapper.getDataList(diffApply.getId());
		List<IBDS_DifficultyCoefficient_History> lstHistroy=new ArrayList<IBDS_DifficultyCoefficient_History>();
		
		List<IBDS_Bversion> lstAllB=bVersionService.getAllBversionByReleaseCode(diffApply.getReleaseno());
		//对集合深拷贝
		List<IBDS_Bversion> lstAllB_bef=new ArrayList<>();
		for(IBDS_Bversion item:lstAllB) {
			String json = JSON.toJSONString(item);
			IBDS_Bversion bef_bversion = JSONObject.parseObject(json, IBDS_Bversion.class);
			lstAllB_bef.add(bef_bversion);
		}
		
		//查找需要清空难度系数的B版本产品和硬件区分		
		List<String> lstPCode=new ArrayList<String>();
		List<String> lstHCode=new ArrayList<String>();
		lst.stream().forEach(o->{
			if(o.getBversionno().indexOf(",")!=-1){
				if(!checkNum(o.getProdifficult())) {
					lstPCode.addAll(Arrays.asList( o.getBversionno().split(",")));
				}
				if(!checkNum(o.getHarddifficult())) {
					lstHCode.addAll(Arrays.asList( o.getBversionno().split(",")));
				}
				//lstBCode.addAll(Arrays.asList( o.getBversionno().split(",")));
			}else {
				if(!checkNum(o.getProdifficult())) {
					lstPCode.addAll(Arrays.asList( o.getBversionno().split(",")));
				}
				if(!checkNum(o.getHarddifficult())) {
					lstHCode.addAll(Arrays.asList( o.getBversionno().split(",")));
				}
			}			
		});
		
		List<IBDS_Bversion> lstSelectPB=lstAllB.stream().filter(o->lstPCode.contains(o.getBversionno())).collect(Collectors.toList());
		List<IBDS_Bversion> lstSelectHB=lstAllB.stream().filter(o->lstHCode.contains(o.getBversionno())).collect(Collectors.toList());
		
		//清空B版本产品难度系数
		for(IBDS_Bversion item : lstSelectPB) {
			lstHistroy.add(getHistory(diffApply.getProcessCode(),item.getBversionno(),"Prodifficult",item.getProdifficult(),""));
			//lstHistroy.add(getHistory(diffApply.getProcessCode(),item.getBversionno(),"Harddifficult",item.getHarddiffcult(),""));
			item.setProdifficult("");
			//item.setHarddiffcult("");			
			item.setModifyData(new Date());
			item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			
			//打包一个失效所有失效
			if(StringUtils.isNotBlank(item.getPack())) {
				List<IBDS_Bversion> lstTemp=lstAllB.stream().filter(o-> item.getPack().equals(o.getPack())
						&&!lstPCode.contains(o.getBversionno())).collect(Collectors.toList());
				if(lstTemp!=null&&lstTemp.size()>0) {
					for(IBDS_Bversion bv:lstTemp) {
						lstHistroy.add(getHistory(diffApply.getProcessCode(),bv.getBversionno(),"Prodifficult",item.getProdifficult(),""));
						//lstHistroy.add(getHistory(diffApply.getProcessCode(),bv.getBversionno(),"Harddifficult",item.getHarddiffcult(),""));
						bv.setProdifficult("");
						//bv.setHarddiffcult("");
						bv.setPack("");
						bv.setModifyData(new Date());
						bv.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
						lstclearPBAll.add(bv);
					}
				}
			}
			//打包状态清空
			item.setPack("");
			lstclearPBAll.add(item);
		}
		
		//清空B版本硬件难度系数
		for(IBDS_Bversion item : lstSelectHB) {
			lstHistroy.add(getHistory(diffApply.getProcessCode(),item.getBversionno(),"Harddifficult",item.getHarddiffcult(),""));
			
			item.setHarddiffcult("");			
			item.setModifyData(new Date());
			item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					
			//打包一个失效所有失效
			if(StringUtils.isNotBlank(item.getHardpack())) {
				List<IBDS_Bversion> lstTemp=lstAllB.stream().filter(o-> item.getHardpack().equals(o.getHardpack())
						&&!lstHCode.contains(o.getBversionno())).collect(Collectors.toList());
				if(lstTemp!=null&&lstTemp.size()>0) {
					for(IBDS_Bversion bv:lstTemp) {
						//lstHistroy.add(getHistory(diffApply.getProcessCode(),bv.getBversionno(),"Prodifficult",item.getProdifficult(),""));
						lstHistroy.add(getHistory(diffApply.getProcessCode(),bv.getBversionno(),"Harddifficult",item.getHarddiffcult(),""));
						//bv.setProdifficult("");
						bv.setHarddiffcult("");
						bv.setHardpack("");
						bv.setModifyData(new Date());
						bv.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
						lstclearHBAll.add(bv);
					}
				}
			}
			//打包状态清空
			item.setHardpack("");
			lstclearHBAll.add(item);
		}

		//记录难度系数
		for(IBDS_DifficultyCoefficient_Item_APPLY item : lst) {			
			//打包申请
			if(item.getBversionno().indexOf(",")!=-1) {
				String[] arrCode=item.getBversionno().split(",");
				List<IBDS_Bversion> lstTemp=lstAllB.stream().filter(o-> Arrays.asList(arrCode).contains(o.getBversionno())).collect(Collectors.toList());
				//List<IBDS_Bversion> lstAllB=bVersionService.selectByCodeList(arrCode);
				lstTemp.forEach(bVersion->{
					if(!checkNum(item.getProdifficult())) {
						lstHistroy.add(getHistory(diffApply.getProcessCode(),bVersion.getBversionno(),"Prodifficult",bVersion.getProdifficult(),"null".equals(String.valueOf(item.getProdifficult()))?"":String.valueOf(item.getProdifficult())));
						bVersion.setProdifficult(checkNum(item.getProdifficult())?"0":item.getProdifficult().toString());
						bVersion.setPack(item.getBversion().replace(",", "&"));
					}
					if(!checkNum(item.getHarddifficult())) {
						lstHistroy.add(getHistory(diffApply.getProcessCode(),bVersion.getBversionno(),"Harddifficult",bVersion.getHarddiffcult(),"null".equals(String.valueOf(item.getHarddifficult()))?"":String.valueOf(item.getHarddifficult()) ));
						bVersion.setHarddiffcult(checkNum(item.getHarddifficult())?"0":item.getHarddifficult().toString());
						bVersion.setHardpack(item.getBversion().replace(",", "&"));
					}
					
					bVersion.setModifyData(new Date());
					bVersion.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					lsteditBAll.add(bVersion);
				});				
			}else {
				Optional<IBDS_Bversion> Temp=lstAllB.stream().filter(o-> item.getBversionno().equals(o.getBversionno())).findFirst();
				//List<IBDS_Bversion> lstAllB=bVersionService.selectByCodeList(arrCode);
				if(Temp.isPresent()) {
					IBDS_Bversion bVersion=Temp.get();

					if(!checkNum(item.getProdifficult())) {
						lstHistroy.add(getHistory(diffApply.getProcessCode(),bVersion.getBversionno(),"Prodifficult",bVersion.getProdifficult(),"null".equals(String.valueOf(item.getProdifficult()))?"":String.valueOf(item.getProdifficult())));
						bVersion.setProdifficult(item.getProdifficult()==null?"0":item.getProdifficult().toString());
						bVersion.setPack("");
					}
					if(!checkNum(item.getHarddifficult())) {
						lstHistroy.add(getHistory(diffApply.getProcessCode(),bVersion.getBversionno(),"Harddifficult",bVersion.getHarddiffcult(),"null".equals(String.valueOf(item.getHarddifficult()))?"":String.valueOf(item.getHarddifficult())));
						bVersion.setHarddiffcult(item.getHarddifficult()==null?"0":item.getHarddifficult().toString());
						bVersion.setHardpack("");
					}
					
					bVersion.setModifyData(new Date());
					bVersion.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					lsteditBAll.add(bVersion);
				}			
			}			
		}
		
		//设置R版本上难度系数显示
		List<String> prod=new ArrayList<String>();
		List<String>  hard=new ArrayList<String>();
		for(IBDS_Bversion item :lstAllB) {
			if(lstclearPBAll.stream().filter(o->o.getBversionno().equals(item.getBversionno())).count()>0) {
				Optional<IBDS_Bversion> Temp=lsteditBAll.stream().filter(o-> item.getBversionno().equals(o.getBversionno())).findFirst();
				if(Temp.isPresent()) {
					IBDS_Bversion bversion=Temp.get();
					if(StringUtils.isNotBlank(bversion.getProdifficult())&&!"0.00".equals(bversion.getProdifficult())) {
						prod.add(StringUtil.isNotEmpty(bversion.getPack())?bversion.getPack()+":"+bversion.getProdifficult():bversion.getBversioncname()+":"+bversion.getProdifficult());
					}
					
					//hard.add(StringUtil.isNotEmpty(bversion.getPack())?bversion.getPack()+":"+bversion.getHarddiffcult():bversion.getBversioncname()+":"+bversion.getHarddiffcult());
					continue;
				}
				continue;
			}
			
			if(StringUtil.isNotEmpty(item.getProdifficult())&&!"0.00".equals(item.getProdifficult())) {
				prod.add(StringUtil.isNotEmpty(item.getPack())?item.getPack()+":"+item.getProdifficult():item.getBversioncname()+":"+item.getProdifficult());
				//hard.add(StringUtil.isNotEmpty(item.getPack())?item.getPack()+":"+item.getHarddiffcult():item.getBversioncname()+":"+item.getHarddiffcult());
			}		
		}
		
		for(IBDS_Bversion item :lstAllB) {
			
			if(lstclearHBAll.stream().filter(o->o.getBversionno().equals(item.getBversionno())).count()>0) {
				Optional<IBDS_Bversion> Temp=lsteditBAll.stream().filter(o-> item.getBversionno().equals(o.getBversionno())).findFirst();
				if(Temp.isPresent()) {
					IBDS_Bversion bversion=Temp.get();
					if(StringUtils.isNotBlank(item.getHarddiffcult())&&!"0.00".equals(item.getHarddiffcult())) {
						//prod.add(StringUtil.isNotEmpty(bversion.getPack())?bversion.getPack()+":"+bversion.getProdifficult():bversion.getBversioncname()+":"+bversion.getProdifficult());
						hard.add(StringUtil.isNotEmpty(bversion.getHardpack())?bversion.getHardpack()+":"+bversion.getHarddiffcult():bversion.getBversioncname()+":"+bversion.getHarddiffcult());
					}
					continue;
				}else {
					continue;
				}
			}
			
			if(StringUtils.isNotBlank(item.getHarddiffcult())&&!"0.00".equals(item.getHarddiffcult())) {
				//prod.add(StringUtil.isNotEmpty(item.getPack())?item.getPack()+":"+item.getProdifficult():item.getBversioncname()+":"+item.getProdifficult());
				hard.add(StringUtil.isNotEmpty(item.getHardpack())?item.getHardpack()+":"+item.getHarddiffcult():item.getBversioncname()+":"+item.getHarddiffcult());
			}
		}
		
		prod=prod.stream().distinct().collect(Collectors.toList());
		hard=hard.stream().distinct().collect(Collectors.toList());
		
		IBDS_Release release=releaseService.selectByCode(diffApply.getReleaseno());
		String json = JSON.toJSONString(release);
		IBDS_Release bef_Release = JSONObject.parseObject(json, IBDS_Release.class);
		
		if(prod!=null&&prod.size()>0) {
			lstHistroy.add(getHistory(diffApply.getProcessCode(),release.getReleaseno(),"Prodifficult",release.getProdifficult(),String.join(",", prod)));		
			release.setProdifficult(String.join(",", prod));
		}
		if(hard!=null&&hard.size()>0) {
			lstHistroy.add(getHistory(diffApply.getProcessCode(),release.getReleaseno(),"Harddifficult",release.getHarddiffcult(),String.join(",", hard)));
			release.setHarddiffcult(String.join(",", hard));
		}
		
		//修改数据合并 入 lstclearPBAll中 ，先从清除的开始
		for(IBDS_Bversion item : lstclearHBAll) {
			Optional<IBDS_Bversion> temp=lstclearPBAll.stream().filter(o->o.getBversionno().equals(item.getBversionno())).findFirst();
			if(!temp.isPresent()) {
				lstclearPBAll.add(item);
			}
		}
		
		for(IBDS_Bversion item : lsteditBAll) {
			Optional<IBDS_Bversion> temp=lstclearPBAll.stream().filter(o->o.getBversionno().equals(item.getBversionno())).findFirst();
			if(!temp.isPresent()) {
				lstclearPBAll.add(item);
			}
		}		
		
		//数据更新
		for(IBDS_Bversion item : lstclearPBAll) {
			Optional<IBDS_Bversion> temp=lstAllB_bef.stream().filter(o->o.getBversionno().equals(item.getBversionno())).findFirst();
			IBDS_Bversion bv=temp.get();
			bVersionService.updateByCode(item);
			bv.setBversioncname((StringUtil.isEmpty(release.getRelease())?"":release.getRelease())+(StringUtil.isEmpty(bv.getBversioncname())?"":bv.getBversioncname()));
			bv.setBversionename((StringUtil.isEmpty(release.getEngrelease())?"":release.getEngrelease())+(StringUtil.isEmpty(bv.getBversionename())?"":bv.getBversionename()));
			item.setBversioncname((StringUtil.isEmpty(release.getRelease())?"":release.getRelease())+(StringUtil.isEmpty(item.getBversioncname())?"":item.getBversioncname()));
			item.setBversionename((StringUtil.isEmpty(release.getEngrelease())?"":release.getEngrelease())+(StringUtil.isEmpty(item.getBversionename())?"":item.getBversionename()));
			
			optLog.saveOperationLog(bv, item, item.getBversionno());
		}		
		
		releaseService.updateByPrimaryKey(release);
		optLog.saveOperationLog(bef_Release, release, release.getReleaseno());
		
		
		//难度系数变更记录
		for(IBDS_DifficultyCoefficient_History item : lstHistroy) {
			diffHistoryMapper.insertSelective(item);
		}
	}
	
	public Boolean checkNum(BigDecimal d) {
		if(d==null||(d!=null&&d.compareTo(BigDecimal.ZERO)==0)){
			return true;
		}
		
		return false;
	}
	
	/**
	 * 返回历史记录
	 * @param processCode
	 * @param code
	 * @param columnName
	 * @param oldValue
	 * @param newvalue
	 * @return
	 */
	public IBDS_DifficultyCoefficient_History getHistory(String processCode,String code,String columnName,String oldValue,String newvalue) {
		IBDS_DifficultyCoefficient_History history=new IBDS_DifficultyCoefficient_History();
		history.setProcessCode(processCode);
		history.setCode(code);
		history.setColumnname(columnName);
		history.setOldvalue(oldValue);
		history.setNewvalue(newvalue);
		history.setCreatetime(new Date());
		history.setCreator((String) SecurityUtils.getSubject().getPrincipal());

		return history;
	}
	
	/**
	 *  同步EIP 
	 */
	@Override
	public void sendProjectCodeEipMsg(Integer id, boolean isEnd) {
		
		view_DifficultyCoefficient viewDiff=viewDiffService.selectByID(id);
		
		String docunId = viewDiff.getApplyCode();
		String url = siteMainUrl + "/eipLogin?docuId=" + viewDiff.getApplyCode();
		String VRUrl = "/basicinfo/DifficultyCoefficient/edit/" + id;
		String authorName = userService.getUserNameByAccount(viewDiff.getCreator());
		String addUserName = userService.getUserNameByAccount(viewDiff.getHandler());
		eipService.syncEip("难度系数修改申请", viewDiff.getApplyCode(), viewDiff.getHandler(), addUserName, viewDiff.getStatusDesc(),
				EipConst.PROCESSID_D, url, VRUrl, viewDiff.getCreator(), authorName, isEnd);
	}
	
	/**
	 * 同步eip
	 * @param id  主表id  超链接用
	 * @param applyCode 申请单号
	 * @param creator 创建人
	 * @param handler 下一处理人
	 * @param statusDesc 描述
	 * @param isEnd 是否最后一节点
	 */
	public void sendProjectCodeEipMsg(Integer id,String applyCode,String creator,String handler,String statusDesc, boolean isEnd) {		
		String docunId = applyCode;
		String url = siteMainUrl + "/eipLogin?docuId=" + applyCode;
		String VRUrl = "/basicinfo/DifficultyCoefficient/edit/" + id;
		String authorName = userService.getUserNameByAccount(creator);
		String addUserName = userService.getUserNameByAccount(handler);
		eipService.syncEip("难度系数修改申请", applyCode, handler, addUserName, statusDesc,
				EipConst.PROCESSID_D, url, VRUrl, creator, authorName, isEnd);
	}
	
	/***
	 * 作废流程
	 */
	@Override
	@Transactional
	public 	void delProcess(Integer processID) {
		if(processID!=null) {
			IBDS_DifficultyCoefficient_PROCESS process = new IBDS_DifficultyCoefficient_PROCESS();
			process.setId(processID);
			process.setStatus(BasicinfoConst.PRODUCT_STATUS_Del);
			process.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DelName);
			process.setModifytime(new Date());
			process.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			diffProcessMapper.updateByPrimaryKeySelective(process);
			
			IBDS_DifficultyCoefficient_PROCESS processDel=diffProcessMapper.selectByPrimaryKey(processID);
			if (processDel != null && StringUtil.isNotEmpty(processDel.getInstanseId())) {
				// 废弃后删除该流程
				runtimeService.deleteProcessInstance(processDel.getInstanseId(),
						(String) SecurityUtils.getSubject().getPrincipal() + "废弃" + processDel.getInstanseId() + "流程");
			}
		}else {
			throw new FlowableException("未找到对应的流程！");
		}
	}
}
