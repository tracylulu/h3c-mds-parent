package com.h3c.mds.basicinfo.service.impl;

import java.util.*;
import java.lang.reflect.Field;


import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.basicinfo.service.PeopleProcessService;
import com.h3c.mds.basicinfo.service.view_PeopleApplyService;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_People_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_People_Item_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_People_PROCESSMapper;
import com.h3c.mds.basicinfo.service.PeopelApplyService;
import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_People_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_APPLYExample;
import com.h3c.mds.basicinfo.entity.IBDS_People_Item_APPLY;
import com.h3c.mds.basicinfo.entity.view_PeopleApply;
import com.h3c.mds.product.entity.*;
import com.h3c.mds.product.service.*;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.product.common.productOperationLogUtils;

@Service
public class PeopleProcessServiceImpl implements PeopleProcessService {
	
	private static final Logger logger = LoggerFactory.getLogger(PeopleProcessServiceImpl.class);
	
	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private PeopelApplyService applyService;
	@Autowired
	private IBDS_People_APPLYMapper pApplyMapper;
	@Autowired
	private IBDS_People_Item_APPLYMapper itemApplyMapper;
	@Autowired
	private IBDS_People_PROCESSMapper processMapper;
	@Autowired
	private view_PeopleApplyService viewApplyService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;
	@Autowired
	private IBDS_PLIPMTService ipmtService;
	@Autowired
	private ProdLineService prodLineService;
	@Autowired
	private IBDS_PDTService pdtService;
	@Autowired
	private IBDS_ProductService productService;
	@Autowired
	private IBDS_VersionService versionService;
	@Autowired
	private IBDS_ReleaseService releaseService;
	@Autowired
	private IBDS_ProjectService projectService;
	@Autowired
	private IBDS_BversionService bversionService;
	@Autowired
	private IBDS_BaseLineService baselineService;
	@Autowired
	private IBDS_FeatureService featureService;
	@Autowired
	private IBDS_SubFeatureService subFeatureService;
	@Autowired
	private IBDS_TeamService teamService;
	@Autowired
	private IBDS_SubSystemService subSystemService;
	@Autowired
	private IBDS_ModuleService moduleService;
	@Autowired
	private IBDS_ModuleVersionService mvService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	ApplicationContext context;
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
	private ProcessConfigItemService processConfigItemService;

	@Value("${sso.main.url}")
    private String siteMainUrl;
	
	

	@Transactional(readOnly = true)
	public String initApplyCode() {
		String maxCode = processMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "R" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000";
		}
		return maxCode;
	}

	@Override
	public synchronized String getMaxCode() {
		IbdsMaxCode maxCode = ibdsMaxCodeService.getByName("peopleApply");
        if(maxCode == null||(maxCode!=null&&!maxCode.getPrefix().substring(0,maxCode.getPrefix().length() - 3)
        		.equals("R" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date())))){
            maxCode = new IbdsMaxCode(); 
            maxCode.setProjectName("peopleApply");
            maxCode.setPrefix(initApplyCode());
        }
		int val = Integer.parseInt(maxCode.getPrefix().substring(maxCode.getPrefix().length() - 3, maxCode.getPrefix().length())) + 1;
		String valStr = String.valueOf(val);
		String code = "R" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date());
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
	
	private Boolean isIpmtCheck(String infoType,List<IBDS_People_Item_APPLY> lstEdit) {
		String type="";
		Boolean isImptCheck=false;
		switch(infoType){
			case "PLIPMT": type="PI";break;
			case "ProdLine": type="PL";break;
			case "PDT": type="PT";break;
			case "Version": type="PV";break;
			case "Release": type="PR";break;
			case "BVersion": type="PB";break;
		}
		Map<String,String> param=new HashMap<>();
		param.put("type", type);
		List<IBDS_ColunmConfig> lst=colunmConfigService.getColunmConfigByParam(param);
		
		for(IBDS_People_Item_APPLY item :lstEdit) {
			Optional<IBDS_ColunmConfig> temp=lst.stream().filter(o->item.getColumnname().equals(o.getColumncode())).findFirst();
			if(temp.isPresent()) {
				IBDS_ColunmConfig config=temp.get();
				if(Integer.valueOf(1).equals(config.getIpmtcheck())) {
					isImptCheck=true;
					break;
				}
			}
		}
		return isImptCheck;
	}
	
	public void submit(IBDS_People_APPLY apply,IBDS_People_PROCESS process, List<IBDS_People_Item_APPLY> lstEdit) {
		applyService.validateApply(apply,lstEdit);
		boolean isEnd=false;
		String userCode = "";
		
		boolean isImptCheck=isIpmtCheck(apply.getPinfotype(),lstEdit);
		apply.setIsipmtcheck(isImptCheck?"1":"0");
		// String code = diffApplyService.getByID();
		// 设置执行秘书
		if (StringUtils.isNotBlank(apply.getPlipmtno())) {
			IBDS_PLIPMT plipmt=new IBDS_PLIPMT();
			if(apply.getPlipmtno().indexOf(",")==-1) {
				plipmt = colunmConfigService.selectByCode(apply.getPlipmtno());
			}else {
				plipmt = colunmConfigService.selectByCode(apply.getPlipmtno().split(",")[0]);
			}				 

			// 根据选中的PLIPMT查询下一步审批人员 即IPMT执行秘书
			if (plipmt==null || plipmt.getPlimptSecretary() == null || plipmt.getPlimptSecretary().length() == 0) {
				throw new FlowableException("下一步审批人不能为空,请配置IPMT执行秘书！");
			} 
			else {
				// 如果配置了多个人员,取逗号前第一个人
				if (plipmt.getPlimptSecretary().contains(",")) {
					userCode = plipmt.getPlimptSecretary().split(",")[0];
				} else {
					userCode = plipmt.getPlimptSecretary();
				}
				User user=userService.selectByPCode(userCode);
				if(user==null) {
					throw new FlowableException("在系统中未找到人员【"+userCode+"】！");
				}
				userCode =user.getUda10511();
				apply.setIpmtsecretary(userCode);
			}
		}

		String userId = (String) SecurityUtils.getSubject().getPrincipal();

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal());
		
		// TODO 后续有事件重构从配置表中获取
		variables.put("IPMTSecretary", apply.getIpmtsecretary());
		variables.put("applyType", StringUtil.isEmpty(apply.getIsipmtcheck())?"0":apply.getIsipmtcheck());
		
		// 第一次提交
		if (StringUtils.isBlank(process.getInstanseId())) {
			// 启动流程并通过第一个
			String instanceId = productCodeFlowableService.startFlowableAndPassOne("peopleApply", userId, variables);
			process.setInstanseId(instanceId);
		} else {
			// 打回后重复提交
			Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(process.getInstanseId(),userId);
			productCodeFlowableService.pass(task.getId());
		}
		
		process.setHandler(FlowableCache.getCurrentHandler());
		process.setCurrentnode(FlowableCache.getCurrentNode());
		process.setStatusDesc(FlowableCache.getCurrentStatusDesc());
		process.setStatus(FlowableConst.PROJECTCODE_STATUS_APPLY);
		process.setFirstSign((String)SecurityUtils.getSubject().getPrincipal());
		process.setFirstDate(new Date());			
		
		if("0".equals(apply.getIsipmtcheck())){
			process.setStatus("10");
			//无需审核，下一步处理人为空
			process.setHandler("");
			isEnd=true;
		}
		
		// 设置编码
		if (StringUtil.isEmpty(process.getApplyCode())) {
			String maxcode = getMaxCode();
			apply.setProcessCode(maxcode);
			process.setApplyCode(maxcode);				
		}

		applyService.save(apply, lstEdit, process);
		
		if("0".equals(apply.getIsipmtcheck())){
			writeProData(apply);
            List<String> sendTo = new ArrayList<>();
            List<String> ccTo = new ArrayList<>();
            sendTo.add(process.getCreator()+"@h3c.com");
            mailInfoService.sendEffectNotice(sendTo,ccTo,"人员信息申请生效","/basicinfo/peopleApply/edit/"+apply.getId(),"人员信息申请");
		}
		processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),"提交申请" , null, FlowableCache.getCurrentStatusDesc(), process.getApplyCode());
		Task task =productCodeFlowableService.getTaskByInstanceId(process.getInstanseId());
		if(task!=null) {
			mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),userId,"请您审核人员信息申请："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
					"/basicinfo/peopleApply/edit/"+apply.getId(),"人员信息申请",task.getId());
		}	
		//同步eip
		sendProjectCodeEipMsg(apply.getId(),isEnd);
	}
	
	/**
	 * 审核
	 */
	@Override
	public void check(Integer id, String taskId, Map<String, Object> params) {
		try {
			
			// 1 为同意 0 为不同意
			Map<String, Object> variables = new HashMap<>();
			if ("1".equals(params.get("checkResult"))) {
				variables.put("checkResult", "同意");
			} else if ("0".equals(params.get("checkResult"))) {
				variables.put("checkResult", "不同意");
			}
			taskService.complete(taskId, variables);
			IBDS_People_PROCESS process = processMapper.selectByPrimaryKey(id);
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
			
			int applyID=Integer.parseInt((String)params.get("applyID"));

			//退回单据设置草稿状态
			Task task = productCodeFlowableService.getTaskByInstanceId(process.getInstanseId());
			if ("0".equals(params.get("checkResult"))) {
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_Return);	
				mailInfoService.sendMailAndRecord(process.getFirstSign(),"请您审核人员信息申请："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
                        "/basicinfo/peopleApply/edit/"+applyID,"人员信息申请",task.getId());
			}
	
			saveCheckData( process,  applyID,  variables,checkOpinionForRole);
		} catch (Exception e) {
			logger.error("审核失败", e);
			throw new RuntimeException("审核失败");
		}
	}
	
	@Transactional
	private void saveCheckData(IBDS_People_PROCESS process, Integer applyID, Map<String, Object> variables,
			Map<String, String> checkOpinionForRole) {
		// 是否为最后一个节点
		Boolean isEnd = false;
		// 当前元素为结束事件
		if ("end".equals(FlowableCache.getCurrentElement())) {
			// TODO 代表流程结束状态 后续放到常量类中
			process.setStatus("10");
			IBDS_People_APPLYExample exapmle = new IBDS_People_APPLYExample();
			IBDS_People_APPLYExample.Criteria cirteria = exapmle.createCriteria();
			cirteria.andProcessCodeEqualTo(process.getApplyCode());
			List<IBDS_People_APPLY> lstapply = pApplyMapper.selectByExample(exapmle);
			if (lstapply != null && lstapply.size() > 0) {
				writeProData(lstapply.get(0));
			}
			process.setHandler("");
			isEnd = true;
			List<String> sendTo = new ArrayList<>();
			List<String> ccTo = new ArrayList<>();
			sendTo.add(process.getCreator()+"@h3c.com");
			mailInfoService.sendEffectNotice(sendTo,ccTo,"人员信息申请生效","/basicinfo/peopleApply/edit/"+applyID,"人员信息申请");
		}
		processMapper.updateByPrimaryKeySelective(process);
		processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
				(String) variables.get("checkResult"),
				checkOpinionForRole == null ? null : checkOpinionForRole.get("opinionValue"),
				FlowableCache.getCurrentStatusDesc(), process.getApplyCode());

		// 同步Eip
		sendProjectCodeEipMsg(applyID, isEnd);
	}

	@Override
	@Transactional
	public void changeHandler(Integer id, String taskId, String userId) {
		IBDS_People_PROCESS process = processMapper.selectByPrimaryKey(id);
	
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
		processMapper.updateByPrimaryKeySelective(process);
	}
	
	@Override	
	public void writeProData(IBDS_People_APPLY apply) {
		//view_PeopleApply
		List<IBDS_People_Item_APPLY> lst=itemApplyMapper.selectByPid(apply.getId());
		List<IBDS_ColunmConfig> lstColumn=colunmConfigService.getColunmConfigByParam(new HashMap<>());
		try {
			Map<String,Map<String,String>> map=new HashMap<String, Map<String,String>>();
			
			for(IBDS_People_Item_APPLY item :lst) {
				if(!map.containsKey(item.getProcode())) {
					Map<String,String> mapCode=new HashMap<>();
					lst.stream().filter(o->item.getProcode().equals(o.getProcode())).forEach(o->{						
						mapCode.put(o.getColumnname(), o.getNewpeoples());							
					});
					map.put(item.getProcode(), mapCode);
					
				}
			}
			
			for(String code :map.keySet()) {
				logger.info("B版本修改 ："+code);
				String type=code.substring(0,2);
				if("PI".equals(type)) {
					IBDS_PLIPMT ipmt=colunmConfigService.selectByCode(code);
					String json = JSON.toJSONString(ipmt);				
					IBDS_PLIPMT bef =  JSONObject.parseObject(json,IBDS_PLIPMT.class);
					for(String column:map.get(code).keySet()) {
						PropertyUtils.setProperty(ipmt, column,map.get(code).get(column));
					}
					
					ipmt.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					ipmt.setModifyDate(new Date());					
					
					ipmtService.update(ipmt);
					//添加日志				
					optLog.saveOperationLog(bef, ipmt, ipmt.getPlipmtno());
				}else if("PL".equals(type)) {
					writePL(code,map.get(code)); 
				}else if("PT".equals(type)) {
					writePT(code,map.get(code)); 
				}else if("PV".equals(type)) {
					writePV(code,map.get(code));  
				}else if("PR".equals(type)) {
					writePR(code,map.get(code)); 
				}else if("PB".equals(type)) {
					writePB(code,map.get(code)); 	
				}
			}
			
			for(IBDS_People_Item_APPLY item :lst) {
				String type=item.getProcode().substring(0,2);
				if("PI".equals(type)) {
					if("1".equals(item.getIssync())) {
						Map<String,String> param=new HashMap<>();
						param.put("columnName", item.getRolename());
						List<IBDS_ColunmConfig> lstConfig=colunmConfigService.getColunmConfigByParam(param);
						for(IBDS_ColunmConfig config:lstConfig) {
							if(!"PI".equals(config.getType())) {
								if("PL".equals(config.getType())) {
									writePLByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples());
								}
								if("PT".equals(config.getType())) {
									writePTByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("PP".equals(config.getType())) {
									writePPByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("PV".equals(config.getType())) {
									writePVByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("PR".equals(config.getType())) {
									writePRByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}								
								if("PB".equals(config.getType())) {
									writePBByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("PJ".equals(config.getType())) {
									writePJByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("BL".equals(config.getType())) {
									writeBLByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("FT".equals(config.getType())) {
									writeFTByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("SF".equals(config.getType())) {
									writeSFByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("TM".equals(config.getType())) {
									writeTMByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("SS".equals(config.getType())) {
									writeSSByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("MD".equals(config.getType())) {
									writeMDByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
								if("MV".equals(config.getType())) {
									writeMVByCode(item.getProcode(), "PLIPMTNo", config.getColumncode(), item.getNewpeoples(),"PI");
								}
							}
						}
					}
				}else if("PL".equals(type)) {
					
					if("1".equals(item.getIssync())) {	
						Map<String,String> param=new HashMap<>();
						param.put("columnName", item.getRolename());
						List<IBDS_ColunmConfig> lstConfig=colunmConfigService.getColunmConfigByParam(param);
						for(IBDS_ColunmConfig config:lstConfig) {
							if("PT".equals(config.getType())) {
								writePTByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("PP".equals(config.getType())) {
								writePPByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("PV".equals(config.getType())) {
								writePVByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("PR".equals(config.getType())) {
								writePRByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("PB".equals(config.getType())) {
								writePBByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("PJ".equals(config.getType())) {
								writePJByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("BL".equals(config.getType())) {
								writeBLByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("FT".equals(config.getType())) {
								writeFTByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("SF".equals(config.getType())) {
								writeSFByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("TM".equals(config.getType())) {
								writeTMByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("SS".equals(config.getType())) {
								writeSSByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("MD".equals(config.getType())) {
								writeMDByCode(item.getProcode(), "PRODLINENo", config.getColumncode(), item.getNewpeoples(),"PL");
							}
							if("MV".equals(config.getType())) {
								writeMVByCode(item.getProcode(), "PRODLINENo", item.getColumnname(), item.getNewpeoples(),"PL");
							}
						}
						
					}
				}else if("PT".equals(type)) {
					
					if("1".equals(item.getIssync())) {	
						Map<String,String> param=new HashMap<>();
						param.put("columnName", item.getRolename());
						List<IBDS_ColunmConfig> lstConfig=colunmConfigService.getColunmConfigByParam(param);
						for(IBDS_ColunmConfig config:lstConfig) {
							if("PR".equals(config.getType())) {
								writePRByCode(item.getProcode(), "PDTNo", config.getColumncode(), item.getNewpeoples(),"PT");
							}
							if("PB".equals(config.getType())) {
								writePBByCode(item.getProcode(), "PDTNo", config.getColumncode(), item.getNewpeoples(),"PT");
							}
							if("PJ".equals(config.getType())) {
								writePJByCode(item.getProcode(), "PDTNo", config.getColumncode(), item.getNewpeoples(),"PT");		
							}
						}		
					}
				}else if("PV".equals(type)) {
					
					if("1".equals(item.getIssync())) {		
						Map<String,String> param=new HashMap<>();
						param.put("columnName", item.getRolename());
						List<IBDS_ColunmConfig> lstConfig=colunmConfigService.getColunmConfigByParam(param);
						for(IBDS_ColunmConfig config:lstConfig) {
							if("PR".equals(config.getType())) {
								writePRByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");
							}
							if("PB".equals(config.getType())) {
								writePBByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");		
							}
							if("BL".equals(config.getType())) {
								writeBLByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");	
							}
							if("FT".equals(config.getType())) {
								writeFTByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");	
							}
							if("SF".equals(config.getType())) {
								writeSFByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");
							}
							if("SF".equals(config.getType())) {
								writeTMByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");
							}
							if("SS".equals(config.getType())) {
								writeSSByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");
							}
							if("MD".equals(config.getType())) {
								writeMDByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");
							}
							if("MV".equals(config.getType())) {
								writeMVByCode(item.getProcode(), "VERSIONNo", config.getColumncode(), item.getNewpeoples(),"PV");	
							}
						}				
					}
					
				}else if("PR".equals(type)) {
					
					if("1".equals(item.getIssync())) {
						Map<String,String> param=new HashMap<>();
						param.put("columnName", item.getRolename());
						List<IBDS_ColunmConfig> lstConfig=colunmConfigService.getColunmConfigByParam(param);
						for(IBDS_ColunmConfig config:lstConfig) {
							if("PB".equals(config.getType())) {
								writePBByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");				
							}
							if("BL".equals(config.getType())) {
								writeBLByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");	
							}
							if("FT".equals(config.getType())) {
								writeFTByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");	
							}
							if("SF".equals(config.getType())) {
								writeSFByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");
							}
							if("TM".equals(config.getType())) {
								writeTMByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");
							}
							if("SS".equals(config.getType())) {
								writeSSByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");
							}
							if("MD".equals(config.getType())) {
								writeMDByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");
							}
							if("MV".equals(config.getType())) {
								writeMVByCode(item.getProcode(), "RELEASENo", config.getColumncode(), item.getNewpeoples(),"PR");		
							}
						}			
					}
				}
			}
		}catch(Exception e) {
			logger.error("写入数据失败", e);
			throw new RuntimeException("写入数据失败");
		}		
	}
	
	/**
	 * 产品线写入
	 * @param code
	 * @param column
	 * @param newPeople
	 */
	public void writePL(String code,Map<String,String> map) {
		try {
			IBDS_PRODLINE prodline= prodLineService.selectByCode(code);//  colunmConfigService.selectByCode(item.getProcode());
			String json = JSON.toJSONString(prodline);			
			IBDS_PRODLINE bef=JSONObject.parseObject(json,IBDS_PRODLINE.class);			
			for(String column: map.keySet()) {
				PropertyUtils.setProperty(prodline, column,map.get(column));
			}
			
			prodline.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			prodline.setModifyDate(new Date());
			prodLineService.update(prodline);
			
			//添加日志				
			optLog.saveOperationLog(bef, prodline, prodline.getProdlineno());
		}catch(Exception e) {
			logger.error("产品线写入错误", e);
			throw new RuntimeException("产品线写入数据失败");
		}		
	}
	
	/**
	 * PDT写入
	 * @param code
	 * @param column
	 * @param newPeople
	 */
	public void writePT(String code, Map<String, String> map) { 
		// 判断是否含有此属性
		Map<String, String> map_New=new HashMap<>();
		try {
			for (String column : map.keySet()) {
				//判断存在字段才更新
				Field filed = IBDS_PDT.class.getDeclaredField(column);
				if (filed != null && StringUtil.isNotEmpty(filed.getName())) {
					map_New.put(column,map.get(column));
				}
			}
		}catch(Exception e) {		
		}	
		
		try {
			if(!map_New.isEmpty()) {
				IBDS_PDT pdt = pdtService.selectByCode(code);// colunmConfigService.selectByCode(item.getProcode());
				String json = JSON.toJSONString(pdt);
				IBDS_PDT bef = JSONObject.parseObject(json, IBDS_PDT.class);
				for (String column : map_New.keySet()) {
					//判断存在字段才更新
					Field filed = IBDS_PDT.class.getDeclaredField(column);
					if (filed != null && StringUtil.isNotEmpty(filed.getName())) {
						PropertyUtils.setProperty(pdt, column, map_New.get(column));
					}
				}

				pdt.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				pdt.setModifyDate(new Date());				
				
				pdtService.update(pdt);
				//同步修改流程配置pdt接口人
				editConfigItem(pdt);
				// 添加日志
				optLog.saveOperationLog(bef, pdt, pdt.getPdtno());
			}
		} catch (Exception e) {
			logger.error("PDT写入错误", e);
			throw new RuntimeException("PDT写入数据失败");
		}	
	}
	
	/**
	 * V版本写入
	 * @param code
	 * @param column
	 * @param newPeople
	 */
	public void writePV(String code,Map<String,String> map) {
		try {
			IBDS_Version version=versionService.getVersionByCode(code); //colunmConfigService.selectByCode(item.getProcode());
			String json = JSON.toJSONString(version);			
			IBDS_Version bef=JSONObject.parseObject(json,IBDS_Version.class);	
			for (String column : map.keySet()) {
				PropertyUtils.setProperty(version, column,map.get(column));
			}
			
			version.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			version.setModifyDate(new Date());
			versionService.editVersion(version);
			//添加日志				
			optLog.saveOperationLog(bef, version, version.getVersionno());
		}catch(Exception e) {
			logger.error("V版本写入错误", e);
			throw new RuntimeException("V版本写入数据失败");
		}		
	}
	
	/**
	 * R版本写入
	 * @param code
	 * @param column
	 * @param newPeople
	 */
	public void writePR(String code,Map<String,String> map) {
		try {
			IBDS_Release release=releaseService.selectByCode(code);		
			String json = JSON.toJSONString(release);			
			IBDS_Release bef=JSONObject.parseObject(json,IBDS_Release.class);	
			for (String column : map.keySet()) {
				PropertyUtils.setProperty(release, column,map.get(column));
			}
			
			release.setModifyDate(new Date());
			release.setModifyUser((String)SecurityUtils.getSubject().getPrincipal());
			releaseService.updateByPrimaryKey(release);
			//添加日志				
			optLog.saveOperationLog(bef, release, release.getReleaseno());
			
			//修改对应的PDT字段
			writePT(release.getPdtno(),map); 
		}catch(Exception e) {
			logger.error("R版本写入错误", e);
			throw new RuntimeException("R版本写入数据失败");
		}		
	}
	
	/**
	 * B版本写入
	 * @param code
	 * @param column
	 * @param newPeople
	 */
	public void writePB(String code,Map<String,String> map) {
		try {
			
			IBDS_Bversion bversion= bversionService.getBversionByBversionCode(code); //colunmConfigService.selectByCode(item.getProcode());
			String json = JSON.toJSONString(bversion);			
			IBDS_Bversion bef=JSONObject.parseObject(json,IBDS_Bversion.class);	
			for (String column : map.keySet()) {
				PropertyUtils.setProperty(bversion, column,map.get(column));
			}
			bversion.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			bversion.setModifyData(new Date());
			bversionService.updateByCode(bversion);
			
			//添加日志	
			IBDS_Release release=releaseService.selectByCode(bef.getReleaseno());
			bef.setBversioncname((StringUtil.isEmpty(release.getRelease())?"":release.getRelease())+(StringUtil.isEmpty(bef.getBversioncname())?"":bef.getBversioncname()));
			bef.setBversionename((StringUtil.isEmpty(release.getEngrelease())?"":release.getEngrelease())+(StringUtil.isEmpty(bef.getBversionename())?"":bef.getBversionename()));
			bversion.setBversioncname((StringUtil.isEmpty(release.getRelease())?"":release.getRelease())+(StringUtil.isEmpty(bversion.getBversioncname())?"":bversion.getBversioncname()));
			bversion.setBversionename((StringUtil.isEmpty(release.getEngrelease())?"":release.getEngrelease())+(StringUtil.isEmpty(bversion.getBversionename())?"":bversion.getBversionename()));
			
			optLog.saveOperationLog(bef, bversion, bversion.getBversionno());
			
		}catch(Exception e) {
			logger.error("B版本写入错误", e);
			throw new RuntimeException("B版本写入数据失败");
		}		
	}
	
	public void writePLByCode(String code,String codeColumn,String column,String newPeople) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_PRODLINE.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_PRODLINEExample example=new IBDS_PRODLINEExample();
				IBDS_PRODLINEExample.Criteria criteria=example.createCriteria();
				criteria.andPlipmtnoEqualTo(code);
				List<IBDS_PRODLINE> lst=prodLineService.selectByExample(example);
				for(IBDS_PRODLINE item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_PRODLINE bef =  JSONObject.parseObject(json,IBDS_PRODLINE.class);
					PropertyUtils.setProperty(item, column,newPeople);
					
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyDate(new Date());
					prodLineService.update(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getProdlineno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("产品线写入错误！");
		}		
	}
	
	public void writePTByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_PDT.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}		

		try {
			if(ishas) {
				IBDS_PDTExample example=new IBDS_PDTExample();
				IBDS_PDTExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andPdtnoEqualTo(code);
				}
				
				List<IBDS_PDT> lst=pdtService.selectByExample(example);
				for(IBDS_PDT item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_PDT bef =  JSONObject.parseObject(json,IBDS_PDT.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyDate(new Date());
					pdtService.update(item);
					//同步修改流程配置pdt接口人
					editConfigItem(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getPdtno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("PDT写入错误！");
		}		
	}
	
	public void writePPByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Product.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_ProductExample example=new IBDS_ProductExample();
				IBDS_ProductExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}
				
				List<IBDS_Product> lst=productService.selectByExample(example);
				for(IBDS_Product item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Product bef =  JSONObject.parseObject(json,IBDS_Product.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyDate(new Date());
					productService.update(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getProductno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("产品写入错误！");
		}
		
	}
	
	public void writePVByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Version.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_VersionExample example=new IBDS_VersionExample();
				IBDS_VersionExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}
				
				List<IBDS_Version> lst=versionService.getByExample(example);
				for(IBDS_Version item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Version bef =  JSONObject.parseObject(json,IBDS_Version.class);
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyDate(new Date());
					versionService.editVersion(item);
					
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getVersionno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("V版本写入错误！");
		}
	}
	
	/**
	 * R版本修改
	 * @param code
	 * @param codeColumn
	 * @param column
	 * @param newPeople
	 * @param type
	 */
	public void writePRByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Release.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_ReleaseExample example=new IBDS_ReleaseExample();
				IBDS_ReleaseExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PT".equals(type)) {
					criteria.andPdtnoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}
				
				List<IBDS_Release> lst=releaseService.getByExample(example);
				for(IBDS_Release item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Release bef =  JSONObject.parseObject(json,IBDS_Release.class);
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyDate(new Date());
					item.setModifyUser((String)SecurityUtils.getSubject().getPrincipal());
					
					releaseService.update(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getReleaseno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("R版本写入错误！");
		}
	}
	
	public void writePBByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Bversion.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		try {
			if(ishas) {
				IBDS_BversionExample example=new IBDS_BversionExample();
				IBDS_BversionExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PT".equals(type)) {
					criteria.andPdtnoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_Bversion> lst= bversionService.selectByExample(example);
				for(IBDS_Bversion item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Bversion bef =  JSONObject.parseObject(json,IBDS_Bversion.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					bversionService.updateByCode(item);
					//添加日志		
					IBDS_Release release=releaseService.selectByCode(bef.getReleaseno());
					bef.setBversioncname((StringUtil.isEmpty(release.getRelease())?"":release.getRelease())+(StringUtil.isEmpty(bef.getBversioncname())?"":bef.getBversioncname()));
					bef.setBversionename((StringUtil.isEmpty(release.getEngrelease())?"":release.getEngrelease())+(StringUtil.isEmpty(bef.getBversionename())?"":bef.getBversionename()));
					item.setBversioncname((StringUtil.isEmpty(release.getRelease())?"":release.getRelease())+(StringUtil.isEmpty(item.getBversioncname())?"":item.getBversioncname()));
					item.setBversionename((StringUtil.isEmpty(release.getEngrelease())?"":release.getEngrelease())+(StringUtil.isEmpty(item.getBversionename())?"":item.getBversionename()));
					optLog.saveOperationLog(bef, item, item.getBversionno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("B版本写入错误！");
		}		
	}

	public void writePJByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDSProject.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDSProjectExample example=new IBDSProjectExample();
				IBDSProjectExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PT".equals(type)) {
					criteria.andPdtnoEqualTo(code);
				}
				
				List<IBDSProject> lst= projectService.selectByExample(example);
				for(IBDSProject item :lst) {
					String json = JSON.toJSONString(item);				
					IBDSProject bef =  JSONObject.parseObject(json,IBDSProject.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					projectService.editIBDSProject(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getProjectno());
				}			
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("研发项目写入错误！");
		}	
	}
	
	public void writeBLByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_BaseLine.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_BaseLineExample example=new IBDS_BaseLineExample();
				IBDS_BaseLineExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_BaseLine> lst= baselineService.selectByExample(example);
				for(IBDS_BaseLine item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_BaseLine bef =  JSONObject.parseObject(json,IBDS_BaseLine.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					baselineService.editIBDSProject(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getBaselineno());
				}	
				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("基线版本写入错误！");
		}	
	}
	
	public void writeFTByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Feature.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_FeatureExample example=new IBDS_FeatureExample();
				IBDS_FeatureExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_Feature> lst= featureService.selectByExample(example);
				for(IBDS_Feature item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Feature bef =  JSONObject.parseObject(json,IBDS_Feature.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());	
					featureService.editIBDSFeature(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getFeatureno());
				}
				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("特性写入错误！");
		}	
	}
	
	public void writeSFByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_SubFeature.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_SubFeatureExample example=new IBDS_SubFeatureExample();
				IBDS_SubFeatureExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_SubFeature> lst=  subFeatureService.selectByExample(example);
				for(IBDS_SubFeature item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_SubFeature bef =  JSONObject.parseObject(json,IBDS_SubFeature.class);
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());	
					subFeatureService.editIBDSSubFeature(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getSubfeatureno());
				}
				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("子特性写入错误！");
		}			
	}
	
	public void writeTMByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Team.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}		

		try {
			if(ishas) {
				IBDS_TeamExample example=new IBDS_TeamExample();
				IBDS_TeamExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_Team> lst=  teamService.selectByExample(example);
				for(IBDS_Team item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Team bef =  JSONObject.parseObject(json,IBDS_Team.class);
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());	
					teamService.editIBDSTeam(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getTeamno());
				}
				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("项目组写入错误！");
		}		
	}
	
	public void writeSSByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_SubSystem.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_SubSystemExample example=new IBDS_SubSystemExample();
				IBDS_SubSystemExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_SubSystem> lst=  subSystemService.selectByExample(example);
				for(IBDS_SubSystem item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_SubSystem bef =  JSONObject.parseObject(json,IBDS_SubSystem.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());	
					subSystemService.update(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getSubsystemno());
				}				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("子系统写入错误！");
		}	
	}
	
	public void writeMDByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_Module.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}
		
		try {
			if(ishas) {
				IBDS_ModuleExample example=new IBDS_ModuleExample();
				IBDS_ModuleExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_Module> lst=  moduleService.selectByExample(example);
				for(IBDS_Module item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_Module bef =  JSONObject.parseObject(json,IBDS_Module.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());	
					moduleService.update(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getModuleno());
				}				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("模块写入错误！");
		}	
	}
	
	/**
	 * 模块版本对应字段修改
	 * @param code
	 * @param codeColumn
	 * @param column
	 * @param newPeople
	 */
	public void writeMVByCode(String code,String codeColumn,String column,String newPeople,String type) {
		//判断是否含有此属性
		Boolean ishas=false;
		try {
			Field filed= IBDS_ModuleVersion.class.getDeclaredField(column);
			if(filed!=null&&StringUtil.isNotEmpty(filed.getName())) {
				ishas=true;
			}
		}catch(Exception e) {
			ishas=false;
		}		

		try {
			if(ishas) {
				IBDS_ModuleVersionExample example=new IBDS_ModuleVersionExample();
				IBDS_ModuleVersionExample.Criteria criteria=example.createCriteria();
				if("PI".equals(type)) {
					criteria.andPlipmtnoEqualTo(code);
				}else if("PL".equals(type)) {
					criteria.andProdlinenoEqualTo(code);
				}else if("PV".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}else if("PR".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				}
				
				List<IBDS_ModuleVersion> lst=  mvService.selectByExample(example);
				for(IBDS_ModuleVersion item :lst) {
					String json = JSON.toJSONString(item);				
					IBDS_ModuleVersion bef =  JSONObject.parseObject(json,IBDS_ModuleVersion.class);
					
					PropertyUtils.setProperty(item, column,newPeople);
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());	
					mvService.update(item);
					//添加日志				
					optLog.saveOperationLog(bef, item, item.getMdlvsnno());
				}				
			}
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("模块版本写入错误！");
		}	
	}

	/**
	 *  同步EIP 
	 */
	@Override
	public void sendProjectCodeEipMsg(Integer id, boolean isEnd) {

		view_PeopleApply viewPApply = viewApplyService.selectByID(id);
		
		String docunId = viewPApply.getApplyCode();
		String url = siteMainUrl + "/eipLogin?docuId=" + viewPApply.getApplyCode();
		String VRUrl = "/basicinfo/peopleApply/edit/" + id;
		String authorName = userService.getUserNameByAccount(viewPApply.getCreator());
		String addUserName = userService.getUserNameByAccount(viewPApply.getHandler());
		eipService.syncEip("人员信息修改申请", docunId, viewPApply.getHandler(), addUserName, viewPApply.getStatusDesc(),
				EipConst.PROCESSID_R, url, VRUrl, viewPApply.getCreator(), authorName, isEnd);
	}
	
	/***
	 * 作废流程
	 */
	@Override
	@Transactional
	public void delProcess(Integer processID) {
		if(processID!=null) {
			IBDS_People_PROCESS process = new IBDS_People_PROCESS();
			process.setId(processID);
			process.setStatus(BasicinfoConst.PRODUCT_STATUS_Del);
			process.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DelName);
			process.setModifytime(new Date());
			process.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			processMapper.updateByPrimaryKeySelective(process);
			
			IBDS_People_PROCESS processDel=processMapper.selectByPrimaryKey(processID);
			if (processDel != null && StringUtil.isNotEmpty(processDel.getInstanseId())) {
				// 废弃后删除该流程
				runtimeService.deleteProcessInstance(processDel.getInstanseId(),
						(String) SecurityUtils.getSubject().getPrincipal() + "废弃" + processDel.getInstanseId() + "流程");
			}
			
		}else {
			throw new FlowableException("未找到对应的流程！");
		}
	}
	
	/**
	 * 修改pdt需要同步修改configitem配置pdt接口人
	 * @param pdt
	 */
	private void editConfigItem(IBDS_PDT pdt) {
		ProcessConfigItem configItem = processConfigItemService.getByPdtCode(pdt.getPdtno());
		if (configItem != null) {
			configItem.setContent(pdt.getPdt());
			configItem.setNote(pdt.getPdt());
			configItem.setState(Integer.parseInt(pdt.getStatus()));
			if (StringUtils.isNotBlank(pdt.getFinpdtId())) {
				String[] findpdtIds = pdt.getFinpdtId().split(",");
				if (findpdtIds != null && findpdtIds.length > 0) {
					User user = userService.selectByPCode(findpdtIds[0]);
					if (user != null) {
						configItem.setFprodPerson(user.getUda10511());
					}
				}
			}
		
			User userPdt = userService.selectByPCode(pdt.getPdtManager().replace(",", ""));
			if (userPdt != null) {
				configItem.setPdtMgn(userPdt.getUda10511());
			} 
			configItem.setState(Integer.parseInt(pdt.getStatus()));
			processConfigItemService.update(configItem);
		}
	}
}
