package com.h3c.mds.basicinfo.service.impl;

import java.lang.reflect.Field;
import java.util.*;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.*;
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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_BaseLine_ApplyMapper;
import com.h3c.mds.basicinfo.dao.IBDS_VR_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_VR_PROCESSMapper;
import com.h3c.mds.basicinfo.dao.view_VRProcessMapper;
import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLYExample;
import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLYExample.Criteria;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;
import com.h3c.mds.basicinfo.entity.view_VRProcess;
import com.h3c.mds.basicinfo.service.ProductApplyService;
import com.h3c.mds.basicinfo.service.VRApplyService;
import com.h3c.mds.basicinfo.service.VRProcessService;
import com.h3c.mds.basicinfo.service.view_VRProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.common.productOperationLogUtils;
import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_BaseLineExample;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_BversionExample;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_FeatureExample;
import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleExample;
import com.h3c.mds.product.entity.IBDS_ModuleVersion;
import com.h3c.mds.product.entity.IBDS_ModuleVersionExample;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubFeatureExample;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_SubSystemExample;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_TeamExample;
import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.entity.IbdsMaxCode;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.IBDS_BaseLineService;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_FeatureService;
import com.h3c.mds.product.service.IBDS_ModuleService;
import com.h3c.mds.product.service.IBDS_ModuleVersionService;
import com.h3c.mds.product.service.IBDS_OperationLogService;
import com.h3c.mds.product.service.IBDS_ProductService;
import com.h3c.mds.product.service.IBDS_ProjectService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.IBDS_SubFeatureService;
import com.h3c.mds.product.service.IBDS_SubSystemService;
import com.h3c.mds.product.service.IBDS_TeamService;
import com.h3c.mds.product.service.IBDS_VersionService;
import com.h3c.mds.product.service.IbdsMaxCodeService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;
import org.springframework.util.CollectionUtils;

@Service
public class VRProcessServiceImpl implements VRProcessService {

	private static final Logger logger = LoggerFactory.getLogger(VRProcessServiceImpl.class);
	@Autowired
	private IBDS_VR_PROCESSMapper vrProcessMapper;
	@Autowired
	private IBDS_VR_APPLYMapper vrApplyMapper;
	@Autowired
	private VRApplyService vrApplyService;
	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private view_VRProcessMapper viewVRMapper;
	@Autowired
	private IBDS_VersionService versionService;
	@Autowired
	private IBDS_ReleaseService releaseService;
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;
	@Autowired
	private IBDS_ProductService productService;
	@Autowired
	private ProductApplyService productApplyService;
	@Autowired
	private UserService userService;
	@Autowired
	private IBDS_BversionService bversionService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private MailInfoService mailInfoService;
	@Autowired
	private IbdsMaxCodeService ibdsMaxCodeService;
	@Autowired
	private view_VRProcessService viewVRService;
	@Autowired
	private IBDS_ProjectService projectService;
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
	private IBDS_BaseLine_ApplyMapper baseLineApplyMapper;
	@Autowired
	private productOperationLogUtils optLog;
	@Autowired
	private IBDS_OperationLogService optLogService;
	@Autowired
	private DicService dicService;
	@Autowired
	private EipService eipService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private ProcessConfigItemService processConfigItemService;
	@Value("${sso.main.url}")
	private String siteMainUrl;

	// private static;

	@Transactional(readOnly = true)
	public String initApplyCode() {
		String maxCode = vrProcessMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "V" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000";
		}
		return maxCode;
	}

	@Override
	public synchronized String getMaxCode() {
		IbdsMaxCode maxCode = ibdsMaxCodeService.getByName("VRApply");
		if (maxCode == null || (maxCode != null && !maxCode.getPrefix().substring(0, maxCode.getPrefix().length() - 3)
				.equals("V" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date())))) {
			maxCode = new IbdsMaxCode();
			maxCode.setProjectName("VRApply");
			maxCode.setPrefix(initApplyCode());
		}
		int val = Integer.parseInt(
				maxCode.getPrefix().substring(maxCode.getPrefix().length() - 3, maxCode.getPrefix().length())) + 1;
		String valStr = String.valueOf(val);
		String code = "V" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date());
		for (int i = 0; i < 3 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		maxCode.setPrefix(code);
		if (maxCode.getId() == null) {
			ibdsMaxCodeService.addIbdsMaxCode(maxCode);
		} else {
			ibdsMaxCodeService.updateIbdsMaxCode(maxCode);
		}
		// apply_Code = code;
		return code;
	}

	public void submit(IBDS_VR_APPLY vrApply, IBDS_VR_PROCESS vrProcess) {
		vrApplyService.validateApply(vrApply);

		String userCode = "";
		String code = vrApply.getProcessCode();
		// 设置执行秘书
		if (StringUtils.isNotBlank(vrApply.getPlipmtno())) {
			logger.info("IPMT的值" + vrApply.getPlipmtno());
			IBDS_PLIPMT plipmt = colunmConfigService.selectByCode(vrApply.getPlipmtno());

			// 根据选中的PLIPMT查询下一步审批人员 即IPMT执行秘书
			if (plipmt == null || plipmt.getPlimptSecretary() == null || plipmt.getPlimptSecretary().length() == 0) {
				throw new FlowableException("下一步审批人不能为空,请配置IPMT执行秘书！");
			} else {
				// 如果配置了多个人员,取逗号前第一个人
				if (plipmt.getPlimptSecretary().contains(",")) {
					userCode = plipmt.getPlimptSecretary().split(",")[0];
				} else {
					userCode = plipmt.getPlimptSecretary();
				}
				userCode = userService.selectByPCode(userCode).getUda10511();
				vrApply.setIpmtsecretary(userCode);
			}
		}

		String userId = (String) SecurityUtils.getSubject().getPrincipal();

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("applyPerson", userId);
		// TODO 后续有事件重构从配置表中获取
		variables.put("IPMTSecretary", vrApply.getIpmtsecretary());

		// 第一次提交
		if (StringUtils.isBlank(vrProcess.getInstanseId())) {
			// 启动流程并通过第一个
			String instanceId = productCodeFlowableService.startFlowableAndPassOne("VRApply", userId, variables);
			vrProcess.setInstanseId(instanceId);
		} else {
			// 打回后重复提交
			Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(vrProcess.getInstanseId(), userId);
			productCodeFlowableService.pass(task.getId());
		}

		// 设置编码
		if (StringUtils.isBlank(code)) {
			String maxcode = getMaxCode();
			vrApply.setProcessCode(maxcode);

			vrProcess.setApplyCode(maxcode);
		}

		// 设置删除状态
		if (StringUtils.isNotBlank(vrApply.getDelpv())) {
			vrApply.setPvifdelbelow("1");
		}
		if (StringUtils.isNotBlank(vrApply.getDelpr())) {
			vrApply.setPrifdelbelow("1");
		}

		vrProcess.setHandler(FlowableCache.getCurrentHandler());
		vrProcess.setCurrentnode(FlowableCache.getCurrentNode());
		vrProcess.setStatusDesc(FlowableCache.getCurrentStatusDesc());
		vrProcess.setStatus(FlowableConst.PROJECTCODE_STATUS_APPLY);
		vrProcess.setFirstSign(userId);
		vrProcess.setFirstDate(new Date());

		vrApplyService.insertOrUpdate(code, vrApply, vrProcess);

		processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(), "提交申请", null,
				FlowableCache.getCurrentStatusDesc(), vrProcess.getApplyCode());
		Task task = productCodeFlowableService.getTaskByInstanceId(vrProcess.getInstanseId());
		// taskServ
		// ice.createTaskQuery().processInstanceId(vrProcess.getInstanseId()).singleResult();
		mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(), userId,
				"请您审核产品VR版本申请：" + FlowableCache.getCurrentStatusDesc(), null, vrProcess.getId(),
				"/basicinfo/VRApply/edit/" + vrProcess.getId(), "产品VR版本申请", task.getId());

		sendProjectCodeEipMsg(vrApply.getId(), false);
	}

	/**
	 * 审核
	 */
	@Override
	@Transactional
	public void check(Integer id, String taskId, Map<String, Object> params) {
		try {
			// 是否为最后一个节点
			Boolean isEnd = false;
			// 1 为同意 0 为不同意
			Map<String, Object> variables = new HashMap<>();
			if ("1".equals(params.get("checkResult"))) {
				variables.put("checkResult", "同意");
			} else if ("0".equals(params.get("checkResult"))) {
				variables.put("checkResult", "不同意");
			}
			taskService.complete(taskId, variables);
			IBDS_VR_PROCESS process = vrProcessMapper.selectByPrimaryKey(id);
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
			// 退回单据设置草稿状态
			Task task = taskService.createTaskQuery().processInstanceId(process.getInstanseId()).singleResult();
			if ("0".equals(params.get("checkResult"))) {
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				mailInfoService.sendMailAndRecord(process.getFirstSign(),
						"请您审核产品VR版本申请：" + FlowableCache.getCurrentStatusDesc(), null, process.getId(),
						"/basicinfo/VRApply/edit/" + process.getId(), "产品VR版本申请", task.getId());
			}

			// 当前元素为结束事件
			if ("end".equals(FlowableCache.getCurrentElement())) {
				// TODO 代表流程结束状态 后续放到常量类中
				process.setStatus("10");
				writeVRApply(process.getApplyCode());
				// 结束前当前审核人设置为空
				process.setHandler("");
				isEnd = true;
			}

			vrProcessMapper.updateByPrimaryKeySelective(process);
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
					(String) variables.get("checkResult"),
					checkOpinionForRole == null ? null : checkOpinionForRole.get("opinionValue"),
					FlowableCache.getCurrentStatusDesc(), process.getApplyCode());

			// 同步Eip
			sendProjectCodeEipMsg(Integer.parseInt((String) params.get("id")), isEnd);
			if(isEnd){
				List<ProcessConfigItem> items = processConfigItemService.getListByConfigCodeAndCode("VRApply", "mailPerson");
				List<String> sendTo = new ArrayList<>();
				List<String> ccTo = new ArrayList<>();
				if(!CollectionUtils.isEmpty(items)){
					for(ProcessConfigItem item : items){
						if("sendTo".equals(item.getType())){
							sendTo.add(item.getContent());
						}else if("ccTo".equals(item.getType())){
							ccTo.add(item.getContent());
						}
					}
				}
				sendTo.add(process.getCreator()+"@h3c.com");
				mailInfoService.sendEffectNotice(sendTo,ccTo,"产品VR版本生效通知","/basicinfo/VRApply/edit/" + process.getId(),"产品VR版本申请");
			}
		} catch (Exception e) {
			logger.error("审核失败", e);
			throw new RuntimeException("审核失败");
		}
	}

	@Override
	@Transactional
	public void changeHandler(Integer id, String taskId, String userId) {
		IBDS_VR_PROCESS process = vrProcessMapper.selectByPrimaryKey(id);

		// process.setAssignSign((String) SecurityUtils.getSubject().getPrincipal());
		// process.setAssignDate(new Date());
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			throw new RuntimeException("没有运行该任务");
		}

		process.setHandler(userId);
		taskService.setAssignee(taskId, userId);
		updateEntity(process);
	}

	@Transactional
	public void updateEntity(IBDS_VR_PROCESS process) {
		process.setModifier((String) SecurityUtils.getSubject().getPrincipal());
		process.setModifytime(new Date());
		vrProcessMapper.updateByPrimaryKeySelective(process);
	}

	/**
	 * 写入VR基础信息表
	 * 
	 * @param code
	 */
	@Transactional
	public void writeVRApply(String code) {
		String vCode = "";
		IBDS_VR_APPLYExample example = new IBDS_VR_APPLYExample();
		Criteria criteria = example.createCriteria();
		criteria.andProcessCodeEqualTo(code);
		List<IBDS_VR_APPLY> lst = vrApplyMapper.selectByExample(example);
		if (lst != null && lst.size() == 1) {
			IBDS_VR_APPLY vrApply = lst.get(0);
			User user = userService.getUserByAccount(vrApply.getCreator());
			String pop = "";
			if (user != null) {
				pop = user.getUda10509() + " " + user.getCode();
			}
			// 有添加V信息
			if (StringUtils.isNotBlank(vrApply.getNewpv()) && "1".equals(vrApply.getNewpv())) {

				IBDS_Version version = new IBDS_Version();
				version.setVersion(vrApply.getVersionnew());
				version.setEngversion(vrApply.getEngversionnew());
				vCode = versionService.getMaxCode();
				version.setVersionno(vCode);
				version.setPlipmtno(vrApply.getPlipmtno());
				version.setProdlineno(vrApply.getProdlineno());
				version.setProductno(vrApply.getProductno());
				version.setPopId(pop);
				version.setCreateDate(new Date());
				version.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
				version.setModifyDate(new Date());
				version.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				version.setStatus("1");
				version.setReaders(BasicinfoConst.remarks);

				versionService.addVersion(version);
				vrApply.setVersionnewno(vCode);
				optLog.saveOperationLog(null, version, vCode);
			}
			Map<String, String> vMod = new HashMap<>();
			// 修改V
			if (StringUtils.isNotBlank(vrApply.getModpv()) && "1".equals(vrApply.getModpv())) {
				IBDS_Version version = versionService.getVersionByCode(vrApply.getVersionoldno());

				String json = JSON.toJSONString(version);
				IBDS_Version bef = JSONObject.parseObject(json, IBDS_Version.class);

				// 20191111新增vr层级修改
				if (!version.getPlipmtno().equals(vrApply.getPlipmtno())) {
					version.setPlipmtno(vrApply.getPlipmtno());
					vMod.put("plipmtno", vrApply.getPlipmtno());
				}

				if (!version.getProdlineno().equals(vrApply.getProdlineno())) {
					version.setProdlineno(vrApply.getProdlineno());
					vMod.put("prodlineno", vrApply.getProdlineno());
				}

				if (!version.getProductno().equals(vrApply.getProductno())) {
					version.setProductno(vrApply.getProductno());
					vMod.put("productno", vrApply.getProductno());
				}

				version.setVersion(vrApply.getVersionnow());
				version.setEngversion(vrApply.getEngversionnow());
				version.setModifyDate(new Date());
				version.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());

				versionService.editVersion(version);
				// 添加日志
				optLog.saveOperationLog(bef, version, version.getVersionno());

				if (!vrApply.getVersionnow().equals(vrApply.getVersionold())
						|| !vrApply.getEngversionnow().equals(vrApply.getEngversionold())) {
					modPRName(vrApply.getVersionoldno(), vrApply.getVersionold(), vrApply.getVersionnow(),
							vrApply.getEngversionnow(), bef);
				}

				// 判断是否有层级修改，有的话同步修改R级以下层级
				if (!vMod.isEmpty()) {
					writePRByCode(version.getVersionno(), vMod, "v");
					writePBByCode(version.getVersionno(), vMod, "v", null,null);
					writeBLByCode(version.getVersionno(), vMod, "v");
					writeFTByCode(version.getVersionno(), vMod, "v");
					writeSFByCode(version.getVersionno(), vMod, "v");
					writeTMByCode(version.getVersionno(), vMod, "v");
					writeSSByCode(version.getVersionno(), vMod, "v");
					writeMDByCode(version.getVersionno(), vMod, "v");
					writeMVByCode(version.getVersionno(), vMod, "v");
				}
			}

			// 删除V及其子项
			if (StringUtils.isNotBlank(vrApply.getDelpv()) && "1".equals(vrApply.getDelpv())) {

				delProduct(vrApply, "VERSIONNo", vrApply.getVersiondelno(), "V");
			}

			if (StringUtils.isNotBlank(vrApply.getNewpr()) && "1".equals(vrApply.getNewpr())) {
				IBDS_Release release = new IBDS_Release();
				release.setRelease(vrApply.getReleasenew());
				release.setEngrelease(vrApply.getEngreleasenew());
				release.setPlipmtno(vrApply.getPlipmtno());
				release.setProdlineno(vrApply.getProdlineno());
				release.setProductno(vrApply.getProductno());
				release.setPdtno(vrApply.getPdtno());
				release.setReleasenoSoftware(vrApply.getReleasenoSoftware());
				if (StringUtils.isEmpty(vrApply.getVersionno()) && StringUtils.isNotBlank(vrApply.getNewpv())
						&& "1".equals(vrApply.getNewpv())) {
					release.setVersionno(vCode);
				} else {
					release.setVersionno(vrApply.getVersionno());
				}
				release.setProjectstatus("");
				release.setStatus("1");
				release.setPopId(pop);
				release.setCreateDate(new Date());
				release.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
				release.setModifyDate(new Date());
				release.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				release.setReaders(BasicinfoConst.remarks);
				// 判断是否需要继承R信息
				if (StringUtils.isNotBlank(vrApply.getInheritrelease())) {
					IBDS_Release inheritR = releaseService.selectByCode(vrApply.getInheritrelease());
					if(inheritR!=null) {
						release.setQualityMnger(inheritR.getQualityMnger());
						release.setPurchaseMnger(inheritR.getPurchaseMnger());
						release.setSalesMnger(inheritR.getSalesMnger());
						release.setPppdtId(inheritR.getPppdtId());
						release.setManufactureMnger(inheritR.getManufactureMnger());
						release.setTechsupportMnger(inheritR.getTechsupportMnger());
						release.setProductMnger(inheritR.getProductMnger());
						release.setRndpdtId(inheritR.getRndpdtId());
						release.setOverseaMnger(inheritR.getOverseaMnger());
						release.setPilotproductionMnger(inheritR.getPilotproductionMnger());
						release.setOmcMnger(inheritR.getOmcMnger());
						release.setSystemMnger(inheritR.getSystemMnger());
						release.setMarkettm(inheritR.getMarkettm());
						release.setSoftmg(inheritR.getSoftmg());
						release.setHardmg(inheritR.getHardmg());
						release.setFldpde(inheritR.getFldpde());
						release.setCmoId(inheritR.getCmoId());
						release.setTestingMnger(inheritR.getTestingMnger());
						release.setFfId(inheritR.getFfId());
						release.setEquipmentMnger(inheritR.getEquipmentMnger());
						release.setDocumentsMnger(inheritR.getDocumentsMnger());
					}					
				}
				releaseService.create(release);
				// 添加日志
				optLog.saveOperationLog(null, release, release.getReleaseno());

				IBDS_Bversion bversion = new IBDS_Bversion();
				// 销售产品 +B01，其他类型不加
				IBDS_Product product = productService.getByProductNo(release.getProductno());
				// 取字典配置35
				Map<String, String> dicParam = new HashMap<>();
				dicParam.put("typeCode", "35");
				List<IBDS_Dic> dic = dicService.getDic(dicParam);
				if (product != null && dic != null) {
					for (IBDS_Dic ibds_Dic : dic) {
						if (StringUtil.isNotEmpty(product.getProducttype())
								&& ibds_Dic.getDicValue().contains(product.getProducttype())) {
							bversion.setBversioncname("B01");
							bversion.setBversionename("B01");
						}
					}
				}
				// 为空置为""
				if (StringUtils.isBlank(bversion.getBversioncname())) {
					bversion.setBversioncname("");
					bversion.setBversionename("");
				}
				bversion.setPdtno(release.getPdtno());
				bversion.setPlipmtno(release.getPlipmtno());
				bversion.setVersionno(release.getVersionno());
				bversion.setReleaseno(release.getReleaseno());
				bversion.setProdlineno(release.getProdlineno());
				bversion.setProductno(release.getProductno());
				bversion.setCreatedUser((String) SecurityUtils.getSubject().getPrincipal());
				bversion.setCreatedDate(new Date());
				bversion.setStatus(ProductConst.STATUS_ON);
				bversion.setBversionno(bversionService.getMaxCode());
				bversion.setSe(release.getSystemMnger());
				bversion.setPopId(release.getPopId());
				bversion.setRndpdtId(release.getRndpdtId());
				bversion.setQualityMnger(release.getQualityMnger());
				bversion.setCmoId(release.getCmoId());
				bversion.setReaders(BasicinfoConst.remarks);
				bversionService.addBversion(bversion);
				// 添加日志 新增时B版本日志 做一个假拼接
				bversion.setBversioncname(
						handleString(release.getRelease()) + handleString(bversion.getBversioncname()));
				bversion.setBversionename(
						handleString(release.getEngrelease()) + handleString(bversion.getBversionename()));
				optLog.saveOperationLog(null, bversion, bversion.getBversionno());
				vrApply.setReleasenewno(release.getReleaseno());
			}

			Map<String, String> rMod = new HashMap<>();
			Map<String, String> pdtMod = new HashMap<>();
			Map<String, Object> modBName = new HashMap<>();
			// 修改R
			if (StringUtils.isNotBlank(vrApply.getModpr()) && "1".equals(vrApply.getModpr())) {
				IBDS_Release release = releaseService.selectByCode(vrApply.getReleaseoldno());

				String json = JSON.toJSONString(release);
				IBDS_Release bef = JSONObject.parseObject(json, IBDS_Release.class);

				// 20191111新增vr层级修改
				if (!release.getPlipmtno().equals(vrApply.getPlipmtno())) {
					release.setPlipmtno(vrApply.getPlipmtno());
					rMod.put("plipmtno", vrApply.getPlipmtno());
				}

				if (!release.getProdlineno().equals(vrApply.getProdlineno())) {
					release.setProdlineno(vrApply.getProdlineno());
					rMod.put("prodlineno", vrApply.getProdlineno());
				}

				if (!release.getProductno().equals(vrApply.getProductno())) {
					release.setProductno(vrApply.getProductno());
					rMod.put("productno", vrApply.getProductno());
				}
				if (!release.getVersionno().equals(vrApply.getVersionno())) {
					release.setVersionno(vrApply.getVersionno());
					rMod.put("versionno", vrApply.getVersionno());
				}

				if (!release.getPdtno().equals(vrApply.getPdtnowno())) {
					release.setPdtno(vrApply.getPdtnowno());
					pdtMod.put("pdtno", vrApply.getPdtnowno());
				}

				release.setRelease(vrApply.getReleasenow());
				release.setEngrelease(vrApply.getEngreleasenow());
				if (StringUtils.isNotBlank(vrApply.getReleasenoSoftwarenow())) {
					release.setReleasenoSoftware(vrApply.getReleasenoSoftwarenow());
				}
				release.setModifyDate(new Date());
				release.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				releaseService.update(release);
				// 添加日志
				optLog.saveOperationLog(bef, release, release.getReleaseno());

				// 判断是否有层级修改，有的话同步修改R级以下层级
				if (!rMod.isEmpty()) {
					//有修改pdt层级及其他层级在修改pdt时统一修改
					if(pdtMod.isEmpty()) {
						writePBByCode(release.getReleaseno(), rMod, "r", bef, release);
					}					
					writeBLByCode(release.getReleaseno(), rMod, "r");
					writeFTByCode(release.getReleaseno(), rMod, "r");
					writeSFByCode(release.getReleaseno(), rMod, "r");
					writeTMByCode(release.getReleaseno(), rMod, "r");
					writeSSByCode(release.getReleaseno(), rMod, "r");
					writeMDByCode(release.getReleaseno(), rMod, "r");
					writeMVByCode(release.getReleaseno(), rMod, "r");
				}

				// R上PDT修改后 R下的B版本及R和B对应的研发产品都修改 20191205
				if (!pdtMod.isEmpty()) {
					rMod.putAll(pdtMod);
					writePBByCode(release.getReleaseno(),rMod , "r", bef, release);
					writePJByCode(release.getReleaseno(), pdtMod);
				}
				
				//没有修改B版本在此处记录一个B版本日志
				if(rMod.isEmpty()&&pdtMod.isEmpty()) {
					//中文名称一定要加
					modBName.put("isCN", "1");
					modBName.put("old", bef.getRelease());
					modBName.put("new", release.getRelease());
					
					if (!bef.getEngrelease().equals(release.getEngrelease())) {
						modBName.put("isENG", "1");
						modBName.put("engOld", bef.getEngrelease());
						modBName.put("engNew", release.getEngrelease());
					}
					modBName.put("releaseNo", release.getReleaseno());
					modBName.put("createUser", (String) SecurityUtils.getSubject().getPrincipal());
					optLogService.insertModPBName(modBName);
				}
			}

			// 删除V及其子项
			if (StringUtils.isNotBlank(vrApply.getDelpr()) && "1".equals(vrApply.getDelpr())) {
				delProduct(vrApply, "RELEASENo", vrApply.getReleasedelno(), "R");
			}

			vrApplyMapper.updateByPrimaryKeySelective(vrApply);
		}
	}

	/**
	 * 为null返回空字符串
	 * 
	 * @param str
	 * @return
	 */
	private String handleString(String str) {
		return StringUtils.isBlank(str) ? "" : str;
	}

	/**
	 * 状态删除VR子级产品 （版本、项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param vrApply
	 * @param column
	 *            列
	 * @param code
	 *            产品编码
	 * @param type
	 *            类型
	 */
	public void delProduct(IBDS_VR_APPLY vrApply, String column, String code, String type) {

		Map<String, Object> param = new HashMap<>();
		if ("V".equals(type)) {
			// 产品V级
			param.put("tabName", "IBDS_Version");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", vrApply.getCreator());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}
		// R级
		param.clear();
		param.put("tabName", "IBDS_Release");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);

		// B级
		param.clear();
		param.put("tabName", "IBDS_Bversion");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 基线版本
		param.clear();
		param.put("tabName", "IBDS_Base_Line");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 特性

		param.clear();
		param.put("tabName", "IBDS_FEATRUE");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 子特性
		param.clear();
		param.put("tabName", "IBDS_SUB_FEATRUE");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 项目组
		param.clear();
		param.put("tabName", "IBDS_Team");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 子系统
		param.clear();
		param.put("tabName", "IBDS_SUB_SYSTEM");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 模块
		param.clear();
		param.put("tabName", "IBDS_Module");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);
		// 模块版本
		param.clear();
		param.put("tabName", "IBDS_MODULE_VERSION");
		param.put("column", column);
		param.put("code", code);
		param.put("modifyUser", vrApply.getCreator());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);

		// 增加停用日志
		Map<String, Object> optLog_Param = new HashMap<>();
		optLog_Param.put("code", code);
		optLog_Param.put("users", vrApply.getCreator());
		baseLineApplyMapper.updateProjectStatusAddOptionLog(optLog_Param);
	}

	// 同步EIP
	@Override
	public void sendProjectCodeEipMsg(Integer id, boolean isEnd) {

		view_VRProcess vr = viewVRService.getByID(id);

		String docunId = vr.getApplyCode();
		String url = siteMainUrl + "/eipLogin?docuId=" + vr.getApplyCode();
		String VRUrl = "/basicinfo/VRApply/edit/" + id;
		String authorName = userService.getUserNameByAccount(vr.getCreator());
		String addUserName = userService.getUserNameByAccount(vr.getHandler());
		eipService.syncEip("产品VR版本申请", docunId, vr.getHandler(), addUserName, vr.getStatusDesc(), EipConst.PROCESSID_V,
				url, VRUrl, vr.getCreator(), authorName, isEnd);
	}

	/**
	 * 批量修改R版本名称
	 * 
	 * @param versionno
	 * @param version
	 */
	public void modPRName(String versionno, String versionOld, String version, String engVersion, IBDS_Version befPV) {
		try {
			Map<String, Object> modPB = new HashMap<>();
			IBDS_ReleaseExample example = new IBDS_ReleaseExample();
			IBDS_ReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andVersionnoEqualTo(versionno);
			List<IBDS_Release> lst = releaseService.getByExample(example);
			for (IBDS_Release item : lst) {

				String json = JSON.toJSONString(item);
				IBDS_Release bef = JSONObject.parseObject(json, IBDS_Release.class);
				// R级名称
				Integer index = item.getRelease().lastIndexOf("R");
				if (index != -1 && befPV.getVersion().equals(item.getRelease().substring(0, index))) {
					item.setRelease(version + item.getRelease().substring(index, item.getRelease().length()));
					modPB.put("isCN", "1");
					modPB.put("old", bef.getRelease());
					modPB.put("new", item.getRelease());
				}

				if (StringUtils.isBlank(item.getEngrelease())) {
					item.setEngrelease(engVersion);
				} else {
					Integer index_eng = item.getEngrelease().lastIndexOf("R");
					if (index_eng != -1 && befPV.getEngversion().equals(item.getEngrelease().substring(0, index_eng))) {
						item.setEngrelease(
								engVersion + item.getEngrelease().substring(index_eng, item.getEngrelease().length()));
					}
					modPB.put("isENG", "1");
					modPB.put("engOld", bef.getEngrelease());
					modPB.put("engNew", item.getEngrelease());
				}

				item.setModifyDate(new Date());
				item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());

				releaseService.update(item);
				optLog.saveOperationLog(bef, item, item.getReleaseno());

				if (!modPB.isEmpty()) {
					modPB.put("releaseNo", item.getReleaseno());
					modPB.put("createUser", (String) SecurityUtils.getSubject().getPrincipal());
					optLogService.insertModPBName(modPB);
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("批量修改R版本名称错误！");
		}
	}

	/**
	 * 批量写入B版本
	 * 
	 * @param code
	 *            产品编码
	 * @param map
	 *            修改列及值
	 * @param type
	 *            v/r
	 */
	public void writePJByCode(String code, Map<String, String> map) {
		try {
			List<IBDSProject> lst = projectService.getCurrentRAndChildBProject(code);
			for (IBDSProject item : lst) {
				String json = JSON.toJSONString(item);
				IBDSProject bef = JSONObject.parseObject(json, IBDSProject.class);
				for (String key : map.keySet()) {
					Field filed = IBDSProject.class.getDeclaredField(key);
					if (filed != null && StringUtils.isNotBlank(filed.getName())) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
				}

				item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				item.setModifyData(new Date());
				projectService.updateIBDSProject(item);
				optLog.saveOperationLog(bef, item, item.getProjectno());
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("研发项目写入错误！");
		}
	}

	/**
	 * R版本修改
	 * 
	 * @param code
	 *            产品code
	 * @param map
	 *            修改列及值
	 * @param type
	 *            v/r
	 */
	public void writePRByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性		
		if (map.isEmpty())
			return;
		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_Release.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}			
		}		

		try {
			if (!map.isEmpty()) {
				IBDS_ReleaseExample example = new IBDS_ReleaseExample();
				IBDS_ReleaseExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_Release> lst = releaseService.getByExample(example);
				for (IBDS_Release item : lst) {

					String json = JSON.toJSONString(item);
					IBDS_Release bef = JSONObject.parseObject(json, IBDS_Release.class);
					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}

					item.setModifyDate(new Date());
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());

					releaseService.update(item);
					optLog.saveOperationLog(bef, item, item.getReleaseno());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("R版本写入错误！");
		}
	}

	/**
	 * 批量写入B版本
	 * 
	 * @param code
	 *            产品编码
	 * @param map
	 *            修改列及值
	 * @param type
	 *            v/r
	 */
	public void writePBByCode(String code, Map<String, String> map, String type,IBDS_Release bef_release,IBDS_Release aft_release) {

		try {
			IBDS_BversionExample example = new IBDS_BversionExample();
			IBDS_BversionExample.Criteria criteria = example.createCriteria();
			if ("r".equals(type)) {
				criteria.andReleasenoEqualTo(code);
			} else if ("v".equals(type)) {
				criteria.andVersionnoEqualTo(code);
			}

			List<IBDS_Bversion> lst = bversionService.selectByExample(example);
			for (IBDS_Bversion item : lst) {
				String json = JSON.toJSONString(item);
				IBDS_Bversion bef = JSONObject.parseObject(json, IBDS_Bversion.class);
				for (String key : map.keySet()) {
					Field filed = IBDS_Bversion.class.getDeclaredField(key);
					if (filed != null && StringUtils.isNoneEmpty(filed.getName())) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
				}

				item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				item.setModifyData(new Date());
				bversionService.updateByCode(item);
				// 添加日志 如果修改B版本为当前修改R版本层级下，带过来修改前及修改后R版本  处理B版本名称变更日志信息
				IBDS_Release release = new IBDS_Release();
				if("r".equals(type)&&item.getReleaseno().equals(bef_release.getReleaseno())) {
					bef.setBversioncname((StringUtil.isEmpty(bef_release.getRelease()) ? "" : bef_release.getRelease())
							+ (StringUtil.isEmpty(bef.getBversioncname()) ? "" : bef.getBversioncname()));
					bef.setBversionename((StringUtil.isEmpty(bef_release.getEngrelease()) ? "" : bef_release.getEngrelease())
							+ (StringUtil.isEmpty(bef.getBversionename()) ? "" : bef.getBversionename()));

					item.setBversioncname((StringUtil.isEmpty(aft_release.getRelease()) ? "" : aft_release.getRelease())
							+ (StringUtil.isEmpty(item.getBversioncname()) ? "" : item.getBversioncname()));
					item.setBversionename((StringUtil.isEmpty(aft_release.getEngrelease()) ? "" : aft_release.getEngrelease())
							+ (StringUtil.isEmpty(item.getBversionename()) ? "" : item.getBversionename()));
				}else {
					release=releaseService.selectByCode(item.getReleaseno());
					bef.setBversioncname((StringUtil.isEmpty(release.getRelease()) ? "" : release.getRelease())
							+ (StringUtil.isEmpty(bef.getBversioncname()) ? "" : bef.getBversioncname()));
					bef.setBversionename((StringUtil.isEmpty(release.getEngrelease()) ? "" : release.getEngrelease())
							+ (StringUtil.isEmpty(bef.getBversionename()) ? "" : bef.getBversionename()));

					item.setBversioncname((StringUtil.isEmpty(release.getRelease()) ? "" : release.getRelease())
							+ (StringUtil.isEmpty(item.getBversioncname()) ? "" : item.getBversioncname()));
					item.setBversionename((StringUtil.isEmpty(release.getEngrelease()) ? "" : release.getEngrelease())
							+ (StringUtil.isEmpty(item.getBversionename()) ? "" : item.getBversionename()));
				}
				

				optLog.saveOperationLog(bef, item, item.getBversionno());
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("B版本写入错误！");
		}
	}

	/**
	 * 基线修改
	 * 
	 * @param code
	 * @param map
	 * @param type
	 */
	public void writeBLByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		
		if (map.isEmpty())
			return;			
		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_BaseLine.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}			
		}	

		try {
			if (!map.isEmpty()) {
				IBDS_BaseLineExample example = new IBDS_BaseLineExample();
				IBDS_BaseLineExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_BaseLine> lst = baselineService.selectByExample(example);
				for (IBDS_BaseLine item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_BaseLine bef = JSONObject.parseObject(json, IBDS_BaseLine.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					baselineService.editIBDSProject(item);
					optLog.saveOperationLog(bef, item, item.getBaselineno());
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("基线版本写入错误！");
		}
	}

	/**
	 * 特性
	 * 
	 * @param code
	 * @param map
	 * @param type
	 */
	public void writeFTByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		if (map.isEmpty())
			return;
		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_Feature.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}				
		}		

		try {
			if (!map.isEmpty()) {
				IBDS_FeatureExample example = new IBDS_FeatureExample();
				IBDS_FeatureExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_Feature> lst = featureService.selectByExample(example);
				for (IBDS_Feature item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_Feature bef = JSONObject.parseObject(json, IBDS_Feature.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					featureService.editIBDSFeature(item);
					optLog.saveOperationLog(bef, item, item.getFeatureno());
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("特性写入错误！");
		}
	}

	/**
	 * 子特性
	 * 
	 * @param code
	 * @param map
	 * @param type
	 */
	public void writeSFByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		if (map.isEmpty())
			return;

		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_SubFeature.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}			
		}

		try {
			if (!map.isEmpty()) {
				IBDS_SubFeatureExample example = new IBDS_SubFeatureExample();
				IBDS_SubFeatureExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_SubFeature> lst = subFeatureService.selectByExample(example);
				for (IBDS_SubFeature item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_SubFeature bef = JSONObject.parseObject(json, IBDS_SubFeature.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					subFeatureService.editIBDSSubFeature(item);
					optLog.saveOperationLog(bef, item, item.getSubfeatureno());
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("子特性写入错误！");
		}
	}

	/**
	 * 项目组
	 * 
	 * @param code
	 * @param map
	 * @param type
	 */
	public void writeTMByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		if (map.isEmpty())
			return;

		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_Team.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}				
		}

		try {
			if (!map.isEmpty()) {
				IBDS_TeamExample example = new IBDS_TeamExample();
				IBDS_TeamExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_Team> lst = teamService.selectByExample(example);
				for (IBDS_Team item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_Team bef = JSONObject.parseObject(json, IBDS_Team.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					teamService.editIBDSTeam(item);
					optLog.saveOperationLog(bef, item, item.getTeamno());
				}

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("项目组写入错误！");
		}
	}

	/**
	 * 子系统
	 * 
	 * @param code
	 * @param map
	 * @param type
	 */
	public void writeSSByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		if (map.isEmpty())
			return;
		
		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_SubSystem.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}
			
		}

		try {
			if (!map.isEmpty()) {
				IBDS_SubSystemExample example = new IBDS_SubSystemExample();
				IBDS_SubSystemExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_SubSystem> lst = subSystemService.selectByExample(example);
				for (IBDS_SubSystem item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_SubSystem bef = JSONObject.parseObject(json, IBDS_SubSystem.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					subSystemService.update(item);
					optLog.saveOperationLog(bef, item, item.getSubsystemno());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("子系统写入错误！");
		}
	}

	/**
	 * 模块
	 * 
	 * @param code
	 * @param map
	 * @param type
	 */
	public void writeMDByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		if (map.isEmpty())
			return;
		
		for (String key : map.keySet()) {
			try{
				Field filed = IBDS_Module.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}			
		}

		try {
			if (!map.isEmpty()) {
				IBDS_ModuleExample example = new IBDS_ModuleExample();
				IBDS_ModuleExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_Module> lst = moduleService.selectByExample(example);
				for (IBDS_Module item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_Module bef = JSONObject.parseObject(json, IBDS_Module.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					moduleService.update(item);
					optLog.saveOperationLog(bef, item, item.getModuleno());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("模块写入错误！");
		}
	}

	/**
	 * 模块版本对应字段修改
	 * 
	 * @param code
	 * @param codeColumn
	 * @param column
	 * @param newPeople
	 */
	public void writeMVByCode(String code, Map<String, String> map, String type) {
		// 判断是否含有此属性
		if (map.isEmpty())
			return;
		
		for (String key : map.keySet()) {
			try {
				Field filed = IBDS_ModuleVersion.class.getDeclaredField(key);
				if (filed == null || (filed != null && StringUtils.isBlank(filed.getName()))) {
					map.remove(key);
				}
			}catch (Exception e) {
				map.remove(key);
			}				
		}

		try {
			if (!map.isEmpty()) {
				IBDS_ModuleVersionExample example = new IBDS_ModuleVersionExample();
				IBDS_ModuleVersionExample.Criteria criteria = example.createCriteria();
				if ("r".equals(type)) {
					criteria.andReleasenoEqualTo(code);
				} else if ("v".equals(type)) {
					criteria.andVersionnoEqualTo(code);
				}

				List<IBDS_ModuleVersion> lst = mvService.selectByExample(example);
				for (IBDS_ModuleVersion item : lst) {
					String json = JSON.toJSONString(item);
					IBDS_ModuleVersion bef = JSONObject.parseObject(json, IBDS_ModuleVersion.class);

					for (String key : map.keySet()) {
						PropertyUtils.setProperty(item, key, map.get(key));
					}
					item.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
					item.setModifyData(new Date());
					mvService.update(item);
					optLog.saveOperationLog(bef, item, item.getMdlvsnno());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RuntimeException("模块版本写入错误！");
		}
	}

	/**
	 * 删除vr流程
	 */
	@Override
	@Transactional
	public void delProcess(Integer id) {
		// IBDS_VR_PROCESS process=vrProcessMapper.selectByPrimaryKey(id);
		if (id != null) {
			IBDS_VR_PROCESS process = new IBDS_VR_PROCESS();
			process.setId(id);
			process.setStatus(BasicinfoConst.PRODUCT_STATUS_Del);
			process.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DelName);
			process.setModifytime(new Date());
			process.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			vrProcessMapper.updateByPrimaryKeySelective(process);
			
			IBDS_VR_PROCESS processDel=vrProcessMapper.selectByPrimaryKey(id);
			if (processDel != null && StringUtil.isNotEmpty(processDel.getInstanseId())) {
				// 废弃后删除该流程
				runtimeService.deleteProcessInstance(processDel.getInstanseId(),
						(String) SecurityUtils.getSubject().getPrincipal() + "废弃" + processDel.getInstanseId() + "流程");
			}
		} else {
			throw new FlowableException("未找到对应的流程！");
		}
	}
}
