package com.h3c.mds.basicinfo.service.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_BaseLine_ApplyMapper;
import com.h3c.mds.basicinfo.dao.IBDS_BaseObject_PROCESSMapper;
import com.h3c.mds.basicinfo.dao.IBDS_Product_MAXCODEMapper;
import com.h3c.mds.basicinfo.dao.IBDS_Product_PROCESSMapper;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_ApplyExample;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_ApplyExample;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExample;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExample.Criteria;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExt;
import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODE;
import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODEExample;
import com.h3c.mds.basicinfo.service.BaseLineApplyService;
import com.h3c.mds.basicinfo.service.BaseObjectApplyService;
import com.h3c.mds.basicinfo.service.BaseObjectProcessService;
import com.h3c.mds.basicinfo.service.ProductApplyService;
import com.h3c.mds.basicinfo.service.VRApplyService;
import com.h3c.mds.basicinfo.util.OperationLogBatchUtils;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.impl.ProductCodeProcessServiceImpl;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.dao.IBDS_BaseLineMapper;
import com.h3c.mds.product.dao.IBDS_FeatureMapper;
import com.h3c.mds.product.dao.IBDS_ModuleMapper;
import com.h3c.mds.product.dao.IBDS_ModuleVersionMapper;
import com.h3c.mds.product.dao.IBDS_SubFeatureMapper;
import com.h3c.mds.product.dao.IBDS_SubSystemMapper;
import com.h3c.mds.product.dao.IBDS_TeamMapper;
import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_BaseLineExample;
import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_FeatureExample;
import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleExample;
import com.h3c.mds.product.entity.IBDS_ModuleVersion;
import com.h3c.mds.product.entity.IBDS_ModuleVersionExample;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubFeatureExample;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_SubSystemExample;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_TeamExample;
import com.h3c.mds.product.service.IBDS_BaseLineService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_FeatureService;
import com.h3c.mds.product.service.IBDS_ModuleService;
import com.h3c.mds.product.service.IBDS_ModuleVersionService;
import com.h3c.mds.product.service.IBDS_SubFeatureService;
import com.h3c.mds.product.service.IBDS_SubSystemService;
import com.h3c.mds.product.service.IBDS_TeamService;
import com.h3c.mds.sysmgr.service.UserService;
import org.springframework.util.StringUtils;

/**
 * 产品申请服务实现类
 */
@Service
public class BaseObjectProcessServiceImpl implements BaseObjectProcessService {
	private static final Logger logger = LoggerFactory.getLogger(ProductCodeProcessServiceImpl.class);

	@Autowired
	private IBDS_BaseObject_PROCESSMapper baseObjectProcessMapper;

	@Autowired
	private IBDS_BaseLine_ApplyMapper baseLineApplyMapper;
	@Autowired
	private IBDS_Product_PROCESSMapper productProcessMapper;

	@Autowired
	private IBDS_Product_MAXCODEMapper productMAXCODEMapper;

	@Autowired
	private BaseLineApplyService baseLineApplyService;

	@Autowired
	private IBDS_BaseLineService baseLineService;

	@Autowired
	private BaseObjectApplyService baseObjectApplyService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private ProductApplyService productApplyService;

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
	private IBDS_ModuleVersionService moduleVersionService;

	@Autowired
	private ProcessLogService processLogService;

	@Autowired
	private MailInfoService mailInfoService;
	// 基线
	@Autowired
	private OperationLogBatchUtils<IBDS_BaseLine> optLogBaseUtils;
	// 特性
	@Autowired
	private OperationLogBatchUtils<IBDS_Feature> optLogfeatureUtils;
	// 子特性
	@Autowired
	private OperationLogBatchUtils<IBDS_SubFeature> optLogSubfeatureUtils;
	// 项目组
	@Autowired
	private OperationLogBatchUtils<IBDS_Team> optLogTeamUtils;
	// 子系统
	@Autowired
	private OperationLogBatchUtils<IBDS_SubSystem> optLogSubSystemUtils;
	// 模块
	@Autowired
	private OperationLogBatchUtils<IBDS_Module> optLogModuleUtils;
	// 模块版本
	@Autowired
	private OperationLogBatchUtils<IBDS_ModuleVersion> optLogModuleVersionUtils;
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private EipService eipService;

	@Autowired
	private UserService userService;

	@Autowired
	private VRApplyService vrApplyService;

	@Autowired
	private IBDS_BaseLineMapper baselineMapper;

	@Autowired
	private IBDS_FeatureMapper featureMapper;

	@Autowired
	private IBDS_SubFeatureMapper subfeatureMapper;

	@Autowired
	private IBDS_TeamMapper teamMapper;

	@Autowired
	private IBDS_SubSystemMapper subsystemMapper;

	@Autowired
	private IBDS_ModuleMapper moduleMapper;

	@Autowired
	private IBDS_ModuleVersionMapper moduleversionMapper;

	@Value("${sso.main.url}")
	private String siteMainUrl;

	/**
	 *          
	 */

	/*
	 * public String initApplyCode() { String maxCode =
	 * baseObjectProcessMapper.getMaxCode(); if (maxCode == null) { maxCode = "B" +
	 * com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000"; } return
	 * maxCode; }
	 */

	/**
	 * 
	 * @return
	 */
	@Override
	@Transactional
	public synchronized String getMaxCode() {
		// 查询最大流程内码
		IBDS_Product_MAXCODEExample example = new IBDS_Product_MAXCODEExample();
		com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODEExample.Criteria criteria = example.createCriteria();
		criteria.andProjectNameEqualTo(BasicinfoConst.PRODUCT_Prefix_PR);
		String maxCode = productProcessMapper.getMaxCode(BasicinfoConst.PRODUCT_Prefix_PR);
		if (maxCode == null) {
			maxCode = "B" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000";
		}
		int val = Integer.parseInt(maxCode.substring(maxCode.length() - 3, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "B" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date());
		for (int i = 0; i < 3 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		// 写入新增的内码
		IBDS_Product_MAXCODE record = new IBDS_Product_MAXCODE();
		record.setProjectName(BasicinfoConst.PRODUCT_Prefix_PR);
		record.setPrefix(code);
		productMAXCODEMapper.updateByExample(record, example);
		return code;
	}

	/**
	 * 创建产品表单数据
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public Integer create(IBDS_BaseObject_PROCESS baseObjectProcess) {
		baseObjectProcess.setCreateDate(new Date());
		baseObjectProcess.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());

		baseObjectProcessMapper.insertAndGetId(baseObjectProcess);
		// 如果表单不为空级联创建表单数据
		IBDS_BaseObject_PROCESSExt processExt = (IBDS_BaseObject_PROCESSExt) baseObjectProcess;
		int mark = 0;
		if (!CollectionUtils.isEmpty(processExt.getBaseLines())) {

			for (IBDS_BaseLine_Apply apply : processExt.getBaseLines()) {
				if (apply.getApplytype() != null) {
					apply.setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
					apply.setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
					apply.setProductno(processExt.getBaseLines().get(0).getProductno());
					apply.setVersionno(processExt.getBaseLines().get(0).getVersionno());
					apply.setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
					apply.setProcessCode(baseObjectProcess.getApplycode());
					apply.setCreateDate(new Date());
					apply.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
					if (apply.getApplytype().equals("2")) {
						if (apply.getBaselineoldno() != null) {
							apply.setBaselineno(apply.getBaselineoldno());
						}
					}
					baseLineApplyService.create(apply);
					mark = 1;
				}
			}

		}
		String feature = "";
		String subsystem = "";
		String module = "";

		if (!CollectionUtils.isEmpty(processExt.getBaseObjects())) {
			for (List<IBDS_BaseObject_Apply> applys : processExt.getBaseObjects()) {
				for (IBDS_BaseObject_Apply apply : applys) {
					if ((feature == null || feature.equals("")) && apply.getFeatureno() != null
							&& apply.getFeatureno() != "") {
						feature = apply.getFeatureno();
					}
					if ((subsystem == null || subsystem.equals("")) && apply.getSubsystemno() != null
							&& apply.getSubsystemno() != "") {
						subsystem = apply.getSubsystemno();
					}
					if ((module == null || module.equals("")) && apply.getModuleno() != null
							&& apply.getModuleno() != "") {
						module = apply.getModuleno();
					}
					if (apply.getApplytype() != null) {

						apply.setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
						apply.setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
						apply.setProductno(processExt.getBaseLines().get(0).getProductno());
						apply.setVersionno(processExt.getBaseLines().get(0).getVersionno());
						apply.setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
						apply.setFeatureno(feature);
						apply.setSubsystemno(subsystem);
						apply.setModuleno(module);
						apply.setProcessCode(baseObjectProcess.getApplycode());
						apply.setCreateDate(new Date());
						apply.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
						if (apply.getApplytype().equals("2")) {
							if (apply.getObjectnoold() != null) {
								apply.setObjectno(apply.getObjectnoold());
							}
						}
						baseObjectApplyService.create(apply);
						mark = 1;
					}
				}

			}
		}
		if (processExt.getStatus().equals(BasicinfoConst.PRODUCT_STATUS_DRAFT) && mark == 0) {
			processExt.getBaseLines().get(1).setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
			processExt.getBaseLines().get(1).setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
			processExt.getBaseLines().get(1).setProductno(processExt.getBaseLines().get(0).getProductno());
			processExt.getBaseLines().get(1).setVersionno(processExt.getBaseLines().get(0).getVersionno());
			processExt.getBaseLines().get(1).setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
			processExt.getBaseLines().get(1).setProcessCode(baseObjectProcess.getApplycode());
			processExt.getBaseLines().get(1).setCreateDate(new Date());
			processExt.getBaseLines().get(1).setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
			baseLineApplyService.create(processExt.getBaseLines().get(1));
		}

		return baseObjectProcess != null ? baseObjectProcess.getId() : 0;
	}

	/**
	 * 校验基线版本号是否存在
	 * 
	 * @param baseline1
	 */
	public void selBaseline1(Integer type, String baseline1) {
		Map<String, Object> param = new HashMap<>();
		String[] codes;
		StringBuilder sbCode = new StringBuilder();
		Integer subids;
		if (baseline1.contains("\r")) {
			codes = baseline1.split("\r\n");
			for (String ids : codes) {
				if (!ids.equals("*")) {
					sbCode.append(ids + ",");
				}
			}

		} else {
			if (!baseline1.equals("*") && !baseline1.equals("*,")) {
				sbCode.append(baseline1 + ",");
			}
		}
		if (sbCode.length() == 0) {
			return;
		}
		param.put("ids", sbCode.toString().split(","));
		param.put("status", "1");
		param.put("column", "BASELINENo");
		List<BaseLineView> lstBase = baseLineService.getDataByColunm(param);
		// 拿出库中不存在的内码
		StringBuilder sbBaseline1 = new StringBuilder();
		for (BaseLineView baseLineView : lstBase) {
			sbBaseline1.append(baseLineView.getBaselineno() + ",");
		}
		StringBuilder sbNoBaseline1 = new StringBuilder();
		for (String code : sbCode.toString().split(",")) {
			if (!sbBaseline1.toString().contains(code)) {
				sbNoBaseline1.append(code + ",");
			}
		}
		if (lstBase.size() < 1) {
			if (type == 1) {
				throw new FlowableException("新增基线版本中,新增软件版本对应的平台基线版本号:" + sbCode.toString() + "不存在，请检查！");
			} else {
				throw new FlowableException("修改基线版本中,修改软件版本对应的平台基线版本号:" + sbCode.toString() + "不存在，请检查！");
			}

		}
		if (sbNoBaseline1.length() > 0) {
			if (type == 1) {
				throw new FlowableException("新增基线版本中,新增软件版本对应的平台基线版本号:" + sbNoBaseline1.toString() + "不存在，请检查！");
			} else {
				throw new FlowableException("修改基线版本中,修改软件版本对应的平台基线版本号:" + sbNoBaseline1.toString() + "不存在，请检查！");
			}
		}
	}

	/**
	 * 校验父版本是否存在
	 * 
	 * @param baseline1
	 */
	public void selParentitemno(Integer type, String parentitemnos) {
		StringBuilder sbBL = new StringBuilder();
		StringBuilder sbPR = new StringBuilder();

		if (!parentitemnos.contains("BL") && !parentitemnos.contains("PR") && !parentitemnos.contains("*")) {
			if (type == 1) {
				throw new FlowableException("新增基线版本中,新增软件版本对应的父版本:" + parentitemnos + "不存在，请检查！");
			} else {
				throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + parentitemnos + "不存在，请检查！");
			}
		}

		if (parentitemnos.contains("\r")) {
			for (String parentitemno : parentitemnos.split("\r\n")) {
				if (parentitemno.contains("BL")) {
					sbBL.append(parentitemno + ",");
				}
				if (parentitemno.contains("PR")) {
					sbPR.append(parentitemno + ",");
				}
			}
		} else {
			if (parentitemnos.contains("BL")) {
				sbBL.append(parentitemnos + ",");
			}
			if (parentitemnos.contains("PR")) {
				sbPR.append(parentitemnos + ",");
			}
		}

		Map<String, Object> param = new HashMap<>();
		if (sbBL.length() > 0) {
			/*
			 * param.put("selcolumnName", "baseline"); param.put("selcolumnCode",
			 * "baselineno");
			 */
			param.put("selCode", "baselineno");
			param.put("tabName", "BaseLineView");
			param.put("column", "baselineno");
			param.put("codes", sbBL.toString());
			String[] ss = productApplyService.getDataByColunm(param);
			if (ss.length < 1) {
				if (type == 1) {
					throw new FlowableException("新增基线版本中,新增软件版本对应的父版本:" + sbBL.toString() + "不存在，请检查！");
				} else {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbBL.toString() + "不存在，请检查！");
				}
			}
			// 不存在的内码
			StringBuilder sbCode = new StringBuilder();
			for (String prCode : sbBL.toString().split(",")) {
				if (!Arrays.asList(ss).contains(prCode)) {
					sbCode.append(prCode + ",");
				}
			}
			if (sbCode.length() > 0) {
				if (type == 1) {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbCode.toString() + "不存在，请检查！");
				} else {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbCode.toString() + "不存在，请检查！");
				}
			}
		}
		if (sbPR.length() > 0) {
			/*
			 * param.put("selcolumnName", "release"); param.put("selcolumnCode",
			 * "releaseno");
			 */
			param.put("selCode", "releaseno");
			param.put("tabName", "ReleaseView");
			param.put("column", "releaseno");
			param.put("codes", sbPR.toString());
			String[] ss = productApplyService.getDataByColunm(param);
			if (ss.length < 1) {
				if (type == 1) {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbBL.toString() + "不存在，请检查！");
				} else {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbBL.toString() + "不存在，请检查！");
				}
			}
			// 不存在的内码
			StringBuilder sbCode = new StringBuilder();
			for (String prCode : sbPR.toString().split(",")) {
				if (!Arrays.asList(ss).contains(prCode)) {
					sbCode.append(prCode + ",");
				}
			}
			if (sbCode.length() > 0) {
				if (type == 1) {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbCode.toString() + "不存在，请检查！");
				} else {
					throw new FlowableException("修改基线版本中,修改软件版本对应的父版本:" + sbCode.toString() + "不存在，请检查！");
				}
			}
		}

	}

	/**
	 * 校验基线重复
	 * 
	 * @param applys
	 */
	public void validateBaseLine(List<IBDS_BaseLine_Apply> applys) {
		// 存基线名称 用于判断新增时数据是否重复
		StringBuilder sbBaseLine = new StringBuilder();
		String parentCode = "";

		// 申请类型 1新增 2修改 3停用
		for (IBDS_BaseLine_Apply apply : applys) {
			// 判断是否存在在途流程
			Map<String, String> param = new HashMap<String, String>();

			if (apply.getApplytype() != null && apply.getApplytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_ADD)) {
				// 校验基线版本
				if (StringUtil.isNotEmpty(apply.getBaseline1())) {
					selBaseline1(1, apply.getBaseline1());
				}
				// 校验父版本
				if (StringUtil.isNotEmpty(apply.getParentitemno())) {
					selParentitemno(1, apply.getParentitemno());
				}

				if (apply.getBaseline().contains("\r")) {
					for (String name : apply.getBaseline().split("\r\n")) {
						if (StringUtil.isNotEmpty(name)) {
							sbBaseLine.append(name + ",");
						}
					}
					// 校验批量新增基线是否重复
					if (sbBaseLine.length() > 0) {
						/*
						 * parentCode = (applys.get(0).getPlipmtno() + "_" +
						 * applys.get(0).getProdlineno() + "_" + applys.get(0).getProductno() + "_" +
						 * applys.get(0).getVersionno() + "_" +
						 * applys.get(0).getReleaseno()).replaceAll("null", "");
						 */
						Map<String, Object> para = new HashMap<String, Object>();
						para.put("tabName", "IBDS_BASE_LINE");
						para.put("column", "baseline");
						// para.put("parentCode", parentCode);
						para.put("names", sbBaseLine.toString());
						String name = productApplyService.getNameByColunm(para);
						if (StringUtil.isNotEmpty(name)) {
							throw new FlowableException(
									BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增产品：" + name + "，已经存在该产品，不能提交");
						}

						// 校验在途流程
						param.clear();
						param.put("names", sbBaseLine.toString());
						param.put("parentCode", parentCode);
						if (baseLineApplyService.getZTCountByProductCode(param) > 0) {
							throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增产品："
									+ apply.getBaseline() + "，已经有在途申请单，不能提交");
						}
					}
				} else {
					// 校验基线版本
					if (StringUtil.isNotEmpty(apply.getBaseline1())) {
						selBaseline1(1, apply.getBaseline1());
					}
					// 校验父版本
					if (StringUtil.isNotEmpty(apply.getParentitemno())) {
						selParentitemno(1, apply.getParentitemno());
					}

					IBDS_BaseLineExample example = new IBDS_BaseLineExample();
					IBDS_BaseLineExample.Criteria criteria = example.createCriteria();
					criteria.andBaselineEqualTo(apply.getBaseline());
					criteria.andStatusEqualTo("1");
					/*
					 * criteria.andPlipmtnoEqualTo(applys.get(0).getPlipmtno());
					 * criteria.andProdlinenoEqualTo(applys.get(0).getProdlineno());
					 * criteria.andProductnoEqualTo(applys.get(0).getProductno());
					 * criteria.andVersionnoEqualTo(applys.get(0).getVersionno());
					 * criteria.andReleasenoEqualTo(applys.get(0).getReleaseno());
					 */
					param.clear();
					param.put("product", apply.getBaseline());
					// param.put("parentCode", parentCode);
					if (baseLineService.selectByExample(example).size() > 0) {
						throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增产品："
								+ apply.getBaseline() + "，已经存在该产品，不能提交");
					}
					if (baseLineApplyService.getZTCountByProductCode(param) > 0) {
						throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增产品："
								+ apply.getBaseline() + "，已经有在途申请单，不能提交");
					}
				}

			} else if (apply.getApplytype() != null
					&& apply.getApplytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_EDIT)) {
				// 校验基线版本
				if (StringUtil.isNotEmpty(apply.getBaseline1())) {
					selBaseline1(2, apply.getBaseline1());
				}
				// 校验父版本
				if (StringUtil.isNotEmpty(apply.getParentitemno())) {
					selParentitemno(2, apply.getParentitemno());
				}

				param.put("productCode", apply.getBaselineoldno());
				if (baseLineApplyService.getZTCountByProductCode(param) > 0) {
					throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_EDITName + " 表单修改产品："
							+ apply.getBaseline() + "，已经有在途申请单，不能提交");
				}
			} else if (apply.getApplytype() != null
					&& apply.getApplytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_DEL)) {
				param.put("productCode", apply.getBaselineno());
				IBDS_BaseLineExample example = new IBDS_BaseLineExample();
				example.createCriteria().andBaselinenoEqualTo(apply.getBaselineno());
				List<IBDS_BaseLine> lstbaseline = baseLineService.selectByExample(example);
				if (lstbaseline.size() > 0) {
					for (IBDS_BaseLine ibds_BaseLine : lstbaseline) {
						if (ibds_BaseLine.getStatus().equals("0")) {
							throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_DELName + " 表单停用产品："
									+ ibds_BaseLine.getBaseline() + "，该产品已经停用，不能提交");
						}
					}

				}
				if (baseLineApplyService.getZTCountByProductCode(param) > 0) {
					throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_DELName + " 表单停用产品："
							+ apply.getBaseline() + "，已经有在途申请单，不能提交");
				}

			}
		}
	}

	/**
	 * 校验
	 */
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public void validateForm(IBDS_BaseObject_PROCESSExt processExt) {
		long l = System.currentTimeMillis();
		// 基线版本
		List<IBDS_BaseLine_Apply> applys = processExt.getBaseLines();
		// 其他对象
		List<List<IBDS_BaseObject_Apply>> lstapplys = processExt.getBaseObjects();
		if (CollectionUtils.isEmpty(applys) && lstapplys.size() == 0) {
			throw new FlowableException("申请信息不能为空");
		} else {
			// 校验VR是否有在途流程
			vrApplyService.validateVRIntransit("r", processExt.getBaseLines().get(0).getReleaseno(),
					"所属产品R级:" + processExt.getBaseLines().get(0).getReleaseno() + ",在VR流程申请中已有在途流程,不能提交！");

			// 校验基线重复
			validateBaseLine(applys);

			// 校验基线以下层级重复
			String feature = "";
			String subsystem = "";
			String module = "";
			for (List<IBDS_BaseObject_Apply> baseObjects : lstapplys) {
				for (IBDS_BaseObject_Apply baseObject : baseObjects) {
					// 赋值
					if ((feature == null || feature.equals("")) && baseObject.getFeatureno() != null
							&& baseObject.getFeatureno() != "") {
						feature = baseObject.getFeatureno();
					}
					if ((subsystem == null || subsystem.equals("")) && baseObject.getSubsystemno() != null
							&& baseObject.getSubsystemno() != "") {
						subsystem = baseObject.getSubsystemno();
					}
					if ((module == null || module.equals("")) && baseObject.getModuleno() != null
							&& baseObject.getModuleno() != "") {
						module = baseObject.getModuleno();
					}
					if (baseObject.getApplytype() != null) {

						baseObject.setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
						baseObject.setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
						baseObject.setProductno(processExt.getBaseLines().get(0).getProductno());
						baseObject.setVersionno(processExt.getBaseLines().get(0).getVersionno());
						baseObject.setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
						baseObject.setFeatureno(feature);
						baseObject.setSubsystemno(subsystem);
						baseObject.setModuleno(module);
					}
					// 判断是否存在在途流程
					Map<String, String> param = new HashMap<String, String>();
					// 父级内码组合
					String parentCode = (applys.get(0).getPlipmtno() + "_" + applys.get(0).getProdlineno() + "_"
							+ applys.get(0).getProductno() + "_" + applys.get(0).getVersionno() + "_"
							+ applys.get(0).getReleaseno()).replaceAll("null", "");

					if (baseObject.getApplytype() != null
							&& baseObject.getApplytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_ADD)) {
						// 特性
						if (baseObject.getType().equals("1")) {
							StringBuilder sbFeatureObject = new StringBuilder();
							if (baseObject.getObjectname().contains("\r")) {
								for (String name : baseObject.getObjectname().split("\r\n")) {
									if (StringUtil.isNotEmpty(name)) {
										sbFeatureObject.append(name + ",");
									}
								}
								// 校验批量新增基线是否重复
								if (sbFeatureObject.length() > 0) {
									// 校验已存在数据
									Map<String, Object> para = new HashMap<String, Object>();
									para.put("tabName", "IBDS_Featrue");
									para.put("column", "feature");
									para.put("parentCode", parentCode);
									para.put("names", sbFeatureObject.toString());
									String name = productApplyService.getNameByColunm(para);
									if (StringUtil.isNotEmpty(name)) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增特性："
												+ name + "，已经存在该特性，不能提交");
									}
									// 校验在途流程
									param.put("parentCode", parentCode);
									param.put("names", sbFeatureObject.toString());
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增特性："
												+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}
							} else {
								IBDS_FeatureExample example = new IBDS_FeatureExample();
								IBDS_FeatureExample.Criteria criteria = example.createCriteria();
								criteria.andFeatureEqualTo(baseObject.getObjectname());
								criteria.andPlipmtnoEqualTo(baseObject.getPlipmtno());
								criteria.andProdlinenoEqualTo(baseObject.getProdlineno());
								criteria.andProductnoEqualTo(baseObject.getProductno());
								criteria.andVersionnoEqualTo(baseObject.getVersionno());
								criteria.andReleasenoEqualTo(baseObject.getReleaseno());
								criteria.andStatusEqualTo("1");
								if (featureService.selectByExample(example).size() > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增特性："
											+ baseObject.getObjectname() + "，已经存在该特性，不能提交");
								}
								// 校验在途
								param.clear();
								param.put("product", baseObject.getObjectname());
								param.put("parentCode", parentCode);
								if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增特性："
											+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
								}
							}
							// 子特性
						} else if (baseObject.getType().equals("2")) {
							int featureFag = 0;// 如果是父级为新增的特性，子特性不做校验
							StringBuilder sbSubFeatureObject = new StringBuilder();// 特性内码和子特性名称组合

							if (baseObject.getObjectname().contains("\r")) {

								int k = 0;
								if (baseObject.getFeatureno().contains(",")) {
									for (String featureno : baseObject.getFeatureno().split(",")) {
										for (String list : baseObject.getObjectname().split("\\*")[k].split("\r\n")) {
											if (StringUtil.isNotEmpty(list)) {
												sbSubFeatureObject.append(featureno + "_" + list + ",");
											}
										}
										k++;
									}

								} else {

									if (StringUtil.isNotEmpty(baseObject.getFeatureno())) {
										for (String list : baseObject.getObjectname().split("\r\n")) {
											if (StringUtil.isNotEmpty(list)) {
												sbSubFeatureObject.append(baseObject.getFeatureno() + "_" + list + ",");
											}
										}
									} else {
										featureFag = 1;
									}
								}

								// 校验批量新增基线是否重复
								if (sbSubFeatureObject.length() > 0 && featureFag == 0) {
									// 校验已存在数据
									Map<String, Object> para = new HashMap<String, Object>();
									para.put("tabName", "IBDS_SUB_FEATRUE");
									para.put("column", "subfeature");
									para.put("parentCode", parentCode);
									para.put("names", sbSubFeatureObject.toString());
									String name = productApplyService.getNameByColunm(para);
									if (StringUtil.isNotEmpty(name)) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子特性："
												+ name + "，已经存在该子特性，不能提交");
									}
									// 校验在途
									param.clear();
									param.put("parentCode", parentCode);
									param.put("names", sbSubFeatureObject.toString());
									param.put("type", "SF");
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子特性："
												+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}

							} else {
								// 特性为新增时不做校验
								if (StringUtil.isNotEmpty(baseObject.getFeatureno())) {
									IBDS_SubFeatureExample example = new IBDS_SubFeatureExample();
									IBDS_SubFeatureExample.Criteria criteria = example.createCriteria();
									criteria.andSubfeatureEqualTo(baseObject.getObjectname());
									criteria.andPlipmtnoEqualTo(baseObject.getPlipmtno());
									criteria.andProdlinenoEqualTo(baseObject.getProdlineno());
									criteria.andProductnoEqualTo(baseObject.getProductno());
									criteria.andVersionnoEqualTo(baseObject.getVersionno());
									criteria.andReleasenoEqualTo(baseObject.getReleaseno());

									criteria.andFeaturenoEqualTo(baseObject.getFeatureno());
									criteria.andStatusEqualTo("1");
									if (subFeatureService.selectByExample(example).size() > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子特性："
												+ baseObject.getObjectname() + "，已经存在该子特性，不能提交");
									}
									// 校验在途
									param.clear();
									param.put("product", baseObject.getObjectname());
									param.put("parentCode", parentCode);
									param.put("type", "SF");
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子特性："
												+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}
							}
							// 项目组
						} else if (baseObject.getType().equals("3")) {
							if (baseObject.getObjectname().contains("\r")) {
								// 组装名称
								StringBuilder sbTeamObject = new StringBuilder();
								for (String name : baseObject.getObjectname().split("\r\n")) {
									if (StringUtil.isNotEmpty(name)) {
										sbTeamObject.append(name + ",");
									}
								}
								// 校验批量新增基线是否重复
								if (sbTeamObject.length() > 0) {
									// 校验已存在数据

									Map<String, Object> para = new HashMap<String, Object>();
									para.put("tabName", "IBDS_Team");
									para.put("column", "team");
									para.put("names", sbTeamObject.toString());
									para.put("parentCode", parentCode);
									String name = productApplyService.getNameByColunm(para);
									if (StringUtil.isNotEmpty(name)) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增项目组："
												+ name + "，已经存在该项目组，不能提交");
									}

									// 校验在途
									param.clear();
									param.put("parentCode", parentCode);
									param.put("names", sbTeamObject.toString());
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增项目组："
												+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}
							} else {
								IBDS_TeamExample example = new IBDS_TeamExample();
								IBDS_TeamExample.Criteria criteria = example.createCriteria();
								criteria.andPlipmtnoEqualTo(baseObject.getPlipmtno());
								criteria.andProdlinenoEqualTo(baseObject.getProdlineno());
								criteria.andProductnoEqualTo(baseObject.getProductno());
								criteria.andVersionnoEqualTo(baseObject.getVersionno());
								criteria.andReleasenoEqualTo(baseObject.getReleaseno());
								criteria.andTeamEqualTo(baseObject.getObjectname());
								criteria.andStatusEqualTo("1");
								if (teamService.selectByExample(example).size() > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增项目组："
											+ baseObject.getObjectname() + "，已经存在该项目组，不能提交");
								}
								// 校验在途
								param.clear();
								param.put("product", baseObject.getObjectname());
								param.put("parentCode", parentCode);
								if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增项目组："
											+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
								}
							}
							// 子系统
						} else if (baseObject.getType().equals("4")) {
							if (baseObject.getObjectname().contains("\r")) {
								// 组装名称
								StringBuilder sbsubsystemObject = new StringBuilder();
								for (String name : baseObject.getObjectname().split("\r\n")) {
									if (StringUtil.isNotEmpty(name)) {
										sbsubsystemObject.append(name + ",");
									}
								}
								// 校验批量新增基线是否重复
								if (sbsubsystemObject.length() > 0) {
									// 校验已存在数据

									Map<String, Object> para = new HashMap<String, Object>();
									para.put("tabName", "IBDS_SUB_SYSTEM");
									para.put("column", "SUBSYSTEM");
									para.put("names", sbsubsystemObject.toString());
									para.put("parentCode", parentCode);
									String name = productApplyService.getNameByColunm(para);
									if (StringUtil.isNotEmpty(name)) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子系统："
												+ name + "，已经存在该子系统，不能提交");
									}

									// 校验在途
									param.clear();
									param.put("parentCode", parentCode);
									param.put("names", sbsubsystemObject.toString());
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子系统："
												+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}
							} else {
								IBDS_SubSystemExample example = new IBDS_SubSystemExample();
								IBDS_SubSystemExample.Criteria criteria = example.createCriteria();
								criteria.andPlipmtnoEqualTo(baseObject.getPlipmtno());
								criteria.andProdlinenoEqualTo(baseObject.getProdlineno());
								criteria.andProductnoEqualTo(baseObject.getProductno());
								criteria.andVersionnoEqualTo(baseObject.getVersionno());
								criteria.andReleasenoEqualTo(baseObject.getReleaseno());
								criteria.andSubsystemEqualTo(baseObject.getObjectname());
								criteria.andStatusEqualTo("1");
								if (subSystemService.selectByExample(example).size() > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子系统："
											+ baseObject.getObjectname() + "，已经存在该子系统，不能提交");
								}
								// 校验在途
								param.clear();
								param.put("product", baseObject.getObjectname());
								param.put("parentCode", parentCode);
								if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增子系统："
											+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
								}
							}
							// 模块
						} else if (baseObject.getType().equals("5")) {
							int subsystemFag = 0;// 如果是父级为新增的子系统，模块不做校验
							StringBuilder sbSubsystemObject = new StringBuilder();// 子系统内码和模块名称组合
							if (baseObject.getObjectname().contains("\r")) {
								int k = 0;
								if (baseObject.getSubsystemno().contains(",")) {
									for (String subsystemno : baseObject.getSubsystemno().split(",")) {
										for (String list : baseObject.getObjectname().split("\\*")[k].split("\r\n")) {

											sbSubsystemObject.append(subsystemno + "_" + list + ",");
										}
										k++;
									}

								} else {
									if (StringUtil.isNotEmpty(baseObject.getSubsystemno())) {
										if (baseObject.getObjectname().contains("*")) {
											for (String list : baseObject.getObjectname().split("\\*")) {
												if (list.contains("\r\n")) {
													for (String listName : baseObject.getObjectname().split("\\*")[k]
															.split("\r\n")) {
														sbSubsystemObject.append(
																baseObject.getSubsystemno() + "_" + listName + ",");
													}
												} else {
													sbSubsystemObject
															.append(baseObject.getSubsystemno() + "_" + list + ",");
												}
											}
										} else {
											for (String listName : baseObject.getObjectname().split("\r\n")) {
												sbSubsystemObject
														.append(baseObject.getSubsystemno() + "_" + listName + ",");
											}
										}
									} else {
										subsystemFag = 1;
									}
								}
								if (sbSubsystemObject.length() > 0 && subsystemFag == 0) {
									Map<String, Object> para = new HashMap<String, Object>();
									para.put("tabName", "IBDS_Module");
									para.put("column", "module");
									para.put("parentCode", parentCode);
									para.put("names", sbSubsystemObject.toString());

									String name = productApplyService.getNameByColunm(para);
									if (StringUtil.isNotEmpty(name)) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增模块："
												+ name + "，已经存在该模块，不能提交");
									}
									// 校验在途
									param.clear();
									param.put("parentCode", parentCode);
									param.put("names", sbSubsystemObject.toString());
									param.put("type", "MD");
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增模块："
												+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}
							} else {
								IBDS_ModuleExample example = new IBDS_ModuleExample();
								IBDS_ModuleExample.Criteria criteria = example.createCriteria();
								criteria.andPlipmtnoEqualTo(baseObject.getPlipmtno());
								criteria.andProdlinenoEqualTo(baseObject.getProdlineno());
								criteria.andProductnoEqualTo(baseObject.getProductno());
								criteria.andVersionnoEqualTo(baseObject.getVersionno());
								criteria.andReleasenoEqualTo(baseObject.getReleaseno());
								criteria.andSubsystemnoEqualTo(baseObject.getSubsystemno());
								criteria.andModuleEqualTo(baseObject.getObjectname());
								criteria.andStatusEqualTo("1");
								if (moduleService.selectByExample(example).size() > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增模块："
											+ baseObject.getObjectname() + "，已经存在该模块，不能提交");
								}
								// 校验在途
								param.clear();
								param.put("product", baseObject.getObjectname());
								param.put("parentCode", parentCode);
								param.put("type", "MD");
								if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增模块："
											+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
								}

							}

							// 模块版本
						} else if (baseObject.getType().equals("6")) {
							if (baseObject.getObjectname().contains("\r")) {
								int subsystemFag = 0;// 如果是父级为新增的子系统，模块不做校验
								int moduleFag = 0;// 如果是父级为新增的模块，模块版本不做校验
								StringBuilder sbSubsystemObject = new StringBuilder();// 子系统内码和模块内码和模块名称组合

								int k = 0;
								if (baseObject.getSubsystemno().contains(",")) {
									for (String moduleno : baseObject.getModuleno().split(",")) {
										for (String list : baseObject.getObjectname().split("\\*")) {
											if (list.contains("\r\n")) {
												for (String listName : list.split("\r\n")) {
													sbSubsystemObject.append(baseObject.getSubsystemno().split(",")[k]
															+ "_" + (moduleno.contains("_") ? moduleno.split("_")[0]
																	: moduleno)
															+ "_" + listName + ",");
												}
											} else {
												sbSubsystemObject.append(baseObject.getSubsystemno().split(",")[k] + "_"
														+ (moduleno.contains("_") ? moduleno.split("_")[0] : moduleno)
														+ "_" + list + ",");
											}
										}
										k++;
									}

								} else {
									if (StringUtil.isNotEmpty(baseObject.getSubsystemno())) {
										if (baseObject.getModuleno().contains(",")) {
											for (String moduleno : baseObject.getModuleno().split(",")) {
												for (String list : baseObject.getObjectname().split("\\*")) {
													if (list.contains("\r\n")) {
														for (String listName : list.split("\r\n")) {
															sbSubsystemObject.append(baseObject.getSubsystemno() + "_"
																	+ (moduleno.contains("_") ? moduleno.split("_")[0]
																			: moduleno)
																	+ "_" + listName + ",");
														}
													} else {
														sbSubsystemObject.append(baseObject.getSubsystemno() + "_"
																+ (moduleno.contains("_") ? moduleno.split("_")[0]
																		: moduleno)
																+ "_" + list + ",");
													}
												}
												k++;
											}
										} else {
											for (String listName : baseObject.getObjectname().split("\r\n")) {
												sbSubsystemObject.append(baseObject.getSubsystemno() + "_"
														+ (baseObject.getModuleno().contains("_")
																? baseObject.getModuleno().split("_")[0]
																: baseObject.getModuleno())
														+ "_" + listName + ",");
											}
										}
									} else {
										subsystemFag = 1;
									}
								}
								// 校验是否存在
								if (sbSubsystemObject.length() > 0 && subsystemFag == 0) {
									Map<String, Object> para = new HashMap<String, Object>();
									para.put("tabName", "IBDS_MODULE_VERSION");
									para.put("column", "MDLVSN");
									para.put("parentCode", parentCode);
									para.put("names", sbSubsystemObject.toString());

									String name = productApplyService.getNameByColunm(para);
									if (StringUtil.isNotEmpty(name)) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName
												+ " 表单新增模块版本：" + name + "，已经存在该模块版本，不能提交");
									}
									// 校验在途
									param.clear();
									param.put("parentCode", parentCode);
									param.put("names", sbSubsystemObject.toString());
									param.put("type", "MV");
									if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
										throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName
												+ " 表单新增模块版本：" + baseObject.getObjectname() + "，已经有在途申请单，不能提交");
									}
								}
							} else {

								IBDS_ModuleVersionExample example = new IBDS_ModuleVersionExample();
								IBDS_ModuleVersionExample.Criteria criteria = example.createCriteria();
								criteria.andPlipmtnoEqualTo(baseObject.getPlipmtno());
								criteria.andProdlinenoEqualTo(baseObject.getProdlineno());
								criteria.andProductnoEqualTo(baseObject.getProductno());
								criteria.andVersionnoEqualTo(baseObject.getVersionno());
								criteria.andReleasenoEqualTo(baseObject.getReleaseno());
								criteria.andSubsystemnoEqualTo(baseObject.getSubsystemno());
								criteria.andModulenoEqualTo(
										(baseObject.getModuleno().contains("_") ? baseObject.getModuleno().split("_")[0]
												: baseObject.getModuleno()));
								criteria.andMdlvsnEqualTo(baseObject.getObjectname());
								criteria.andStatusEqualTo("1");
								if (moduleVersionService.selectByExample(example).size() > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增模块版本："
											+ baseObject.getObjectname() + "，已经存在该模块版本，不能提交");
								}
								// 校验在途
								param.clear();
								param.put("product", baseObject.getObjectname());
								param.put("parentCode", parentCode);
								param.put("type", "MV");
								if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
									throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增模块版本："
											+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
								}

							}

						}
					} else if (baseObject.getApplytype() != null
							&& baseObject.getApplytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_EDIT)) {
						if (StringUtil.isNotEmpty(baseObject.getObjectnoold())) {
							param.put("productCode", baseObject.getObjectnoold());
							if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
								throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_EDITName + " 表单修改产品："
										+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
							}
						}
					} else if (baseObject.getApplytype() != null
							&& baseObject.getApplytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_DEL)) {
						if (StringUtil.isNotEmpty(baseObject.getObjectno())) {
							param.put("productCode", baseObject.getObjectno());
							if (baseObjectApplyService.getZTCountByProductCode(param) > 0) {
								throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_DELName + " 表单停用产品："
										+ baseObject.getObjectname() + "，已经有在途申请单，不能提交");
							}
						}

					}
				}
			}
		}
		long j = System.currentTimeMillis();
		System.out.println("校验表单耗时：" + (j - l) + " 毫秒");
	}

	/**
	 * 根据id获取申请流程并级联子表单
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public IBDS_BaseObject_PROCESSExt getByProductId(Integer id) {
		IBDS_BaseObject_PROCESSExt processExt = getExtById(id);
		if (processExt != null) {
			List<IBDS_BaseLine_Apply> applys = baseLineApplyService.getByProcessCode(processExt.getApplycode());
			processExt.setBaseLines(applys);
			List<List<IBDS_BaseObject_Apply>> lstsBaseObjects = new ArrayList<>();
			// 组装对象数据
			List<IBDS_BaseObject_Apply> lstbaseObject1 = new ArrayList<>();
			List<IBDS_BaseObject_Apply> lstbaseObject2 = new ArrayList<>();
			List<IBDS_BaseObject_Apply> lstbaseObject3 = new ArrayList<>();
			List<IBDS_BaseObject_Apply> lstbaseObject4 = new ArrayList<>();
			List<IBDS_BaseObject_Apply> lstbaseObject5 = new ArrayList<>();
			List<IBDS_BaseObject_Apply> lstbaseObject6 = new ArrayList<>();

			List<IBDS_BaseObject_Apply> baseObject = baseObjectApplyService.getByProcessCode(processExt.getApplycode());
			for (IBDS_BaseObject_Apply apply : baseObject) {
				if (apply.getType().equals("1")) {
					lstbaseObject1.add(apply);
				} else if (apply.getType().equals("2")) {
					lstbaseObject2.add(apply);
				} else if (apply.getType().equals("3")) {
					lstbaseObject3.add(apply);
				} else if (apply.getType().equals("4")) {
					lstbaseObject4.add(apply);
				} else if (apply.getType().equals("5")) {
					lstbaseObject5.add(apply);
				} else if (apply.getType().equals("6")) {
					lstbaseObject6.add(apply);
				}
			}
			lstsBaseObjects.add(lstbaseObject1);
			lstsBaseObjects.add(lstbaseObject2);
			lstsBaseObjects.add(lstbaseObject3);
			lstsBaseObjects.add(lstbaseObject4);
			lstsBaseObjects.add(lstbaseObject5);
			lstsBaseObjects.add(lstbaseObject6);
			processExt.setBaseObjects(lstsBaseObjects);
		}
		return processExt;
	}

	@Override
	public IBDS_BaseObject_PROCESSExt getExtById(Integer id) {
		return baseObjectProcessMapper.getExtById(id);
	}

	/**
	 * 更新产品申请信息
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public void update(IBDS_BaseObject_PROCESS baseObjectProcess) {
		baseObjectProcess.setModifyDate(new Date());
		baseObjectProcess.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		baseObjectProcessMapper.updateByPrimaryKeySelective(baseObjectProcess);
		baseObjectProcess.setApplycode(baseObjectProcessMapper.getExtById(baseObjectProcess.getId()).getApplycode());
		// 获取库中该流程的表单数据id集合
		List<Integer> oldIds = baseLineApplyService.getIdsByProcessCode(baseObjectProcess.getApplycode());

		List<Integer> oldObjectIds = baseObjectApplyService.getIdsByProcessCode(baseObjectProcess.getApplycode());

		// 如果子表单不为空级联更新子表单数据
		IBDS_BaseObject_PROCESSExt processExt = (IBDS_BaseObject_PROCESSExt) baseObjectProcess;
		List<Integer> ids = new ArrayList<>();
		List<Integer> idObject = new ArrayList<>();
		int mark = 0;
		if (!CollectionUtils.isEmpty(processExt.getBaseLines())) {
			int dexLine = 0;
			for (IBDS_BaseLine_Apply apply : processExt.getBaseLines()) {
				if (apply.getApplytype() != null) {
					// 重新赋值
					apply.setProcessCode(baseObjectProcess.getApplycode());
					apply.setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
					apply.setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
					apply.setProductno(processExt.getBaseLines().get(0).getProductno());
					apply.setVersionno(processExt.getBaseLines().get(0).getVersionno());
					apply.setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
					// 如果子表单id为空则创建
					if (apply.getId() == null) {
						if (dexLine == 0) {
							// 先删除再添加
							IBDS_BaseLine_ApplyExample example = new IBDS_BaseLine_ApplyExample();
							IBDS_BaseLine_ApplyExample.Criteria creteria = example.createCriteria();
							creteria.andProcessCodeEqualTo(apply.getProcessCode());
							baseLineApplyService.deleteByExample(example);
							dexLine = 1;
						}
						baseLineApplyService.create(apply);

					} else {
						// 不为空更新
						baseLineApplyService.update(apply);
						ids.add(apply.getId());
					}
					mark = 1;
				}

			}

		}
		if (!CollectionUtils.isEmpty(processExt.getBaseObjects())) {
			int idex = 0;
			for (List<IBDS_BaseObject_Apply> applys : processExt.getBaseObjects()) {
				for (IBDS_BaseObject_Apply apply : applys) {
					if (apply.getApplytype() != null) {
						apply.setProcessCode(baseObjectProcess.getApplycode());
						apply.setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
						apply.setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
						apply.setProductno(processExt.getBaseLines().get(0).getProductno());
						apply.setVersionno(processExt.getBaseLines().get(0).getVersionno());
						apply.setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
						apply.setFeatureno(processExt.getBaseObjects().get(1).get(0).getFeatureno());
						apply.setSubsystemno(processExt.getBaseObjects().get(4).get(0).getSubsystemno());
						apply.setModuleno(processExt.getBaseObjects().get(5).get(0).getModuleno());
						// 如果子表单id为空则创建

						if (apply.getId() == null) {
							if (idex == 0) {
								// 先删除再添加
								IBDS_BaseObject_ApplyExample example = new IBDS_BaseObject_ApplyExample();
								IBDS_BaseObject_ApplyExample.Criteria creteria = example.createCriteria();
								creteria.andProcessCodeEqualTo(apply.getProcessCode());
								baseObjectApplyService.deleteByExample(example);
								idex = 1;
							}
							baseObjectApplyService.create(apply);
						} else {
							// 不为空更新
							baseObjectApplyService.update(apply);
							idObject.add(apply.getId());
						}
						mark = 1;
					}
				}
			}
		}
		if (processExt.getStatus().equals(BasicinfoConst.PRODUCT_STATUS_DRAFT) && mark == 0) {
			// 重新赋值
			processExt.getBaseLines().get(1).setProcessCode(baseObjectProcess.getApplycode());
			processExt.getBaseLines().get(1).setPlipmtno(processExt.getBaseLines().get(0).getPlipmtno());
			processExt.getBaseLines().get(1).setProdlineno(processExt.getBaseLines().get(0).getProdlineno());
			processExt.getBaseLines().get(1).setProductno(processExt.getBaseLines().get(0).getProductno());
			processExt.getBaseLines().get(1).setVersionno(processExt.getBaseLines().get(0).getVersionno());
			processExt.getBaseLines().get(1).setReleaseno(processExt.getBaseLines().get(0).getReleaseno());
			// 如果子表单id为空则创建
			if (processExt.getBaseLines().get(1).getId() == null) {
				// 先删除再添加
				IBDS_BaseLine_ApplyExample example = new IBDS_BaseLine_ApplyExample();
				IBDS_BaseLine_ApplyExample.Criteria creteria = example.createCriteria();
				creteria.andProcessCodeEqualTo(processExt.getBaseLines().get(1).getProcessCode());
				baseLineApplyService.deleteByExample(example);
				baseLineApplyService.create(processExt.getBaseLines().get(1));

			} else {
				// 不为空更新
				baseLineApplyService.update(processExt.getBaseLines().get(1));
				ids.add(processExt.getBaseLines().get(1).getId());
			}
		}

		if (!CollectionUtils.isEmpty(oldIds)) {
			for (Integer id : oldIds) {
				// 如果库中的id没有在新提交的id集合中则把库中的数据删除
				if (!ids.contains(id)) {
					baseLineApplyService.deleteById(id);
				}
			}

		}
		if (!CollectionUtils.isEmpty(oldObjectIds)) {
			for (Integer id : oldObjectIds) {
				// 如果库中的id没有在新提交的id集合中则把库中的数据删除
				if (!idObject.contains(id)) {
					baseObjectApplyService.deleteById(id);
				}
			}

		}

	}

	@Override
	public IBDS_BaseObject_PROCESS getById(Integer id) {
		return baseObjectProcessMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public IBDS_BaseObject_PROCESS check1(Integer id, String taskId, Map<String, Object> params) throws Exception {
		try {

			// 1 为同意 0 为不同意
			Map<String, Object> variables = new HashMap<>();
			if ("1".equals(params.get("checkResult"))) {
				variables.put("checkResult", "同意");
			} else if ("0".equals(params.get("checkResult"))) {
				variables.put("checkResult", "不同意");
			}
			taskService.complete(taskId, variables);
			IBDS_BaseObject_PROCESS process = getById(id);
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
			// 设置当前环节
			process.setCurrentnode(FlowableCache.getCurrentNode());
			process.setResponsible(FlowableCache.getCurrentHandler());
			process.setStatusname(FlowableCache.getCurrentStatusDesc());

			if ("0".equals(params.get("checkResult"))) {
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_Return);
			}
			boolean end = false;
			// 当前元素为结束事件
			if ("end".equals(FlowableCache.getCurrentElement())) {
				// TODO 代表流程结束状态 数据生效
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_EFFECTIVE);
				// 录入正式库 对象 待补充
				updateBaseInfo(id, taskId, params);
				process.setResponsible("");
				end = true;
			}

			baseObjectProcessMapper.updateByPrimaryKeySelective(process);
			// 发送邮件
			Task task = getTaskByInstanceIdAndUserId(process.getInstanseId(), null);
			if ("0".equals(params.get("checkResult")) && task != null) {
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_Return);
				mailInfoService.sendMailAndRecord(process.getResponsible(),
						"请您审核产品R级以下申请表：" + FlowableCache.getCurrentStatusDesc(), null, process.getId(),
						"/basicinfo/prBelowApply/edit/" + process.getId(), "修改产品R级以下基本信息", task.getId());

			} else if ("1".equals(params.get("checkResult")) && task != null) {
				mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(), process.getResponsible(),
						"请您审核产品R级以下申请表：" + FlowableCache.getCurrentStatusDesc(), null, process.getId(),
						"/basicinfo/prBelowApply/edit/" + process.getId(), "修改产品R级以下基本信息", task.getId());
			}

			// 创建流程记录
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
					(String) variables.get("checkResult"),
					checkOpinionForRole == null ? null : checkOpinionForRole.get("opinionValue"),
					FlowableCache.getCurrentStatusDesc(), process.getApplycode());
			return process;

		} catch (Exception e) {
			throw new RuntimeException("审核失败");
		}
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTaskByInstanceIdAndUserId(String instanceId, String userId) {
		return taskService.createTaskQuery().processInstanceId(instanceId).singleResult();
	}

	public void check2(Integer id, String taskId, Map<String, Object> params, IBDS_BaseObject_PROCESS process)
			throws Exception {
		// 集成eip
		boolean end = false;
		// 当前元素为结束事件
		if ("end".equals(FlowableCache.getCurrentElement())) {
			// TODO 代表流程结束状态 数据生效
			end = true;
			List<String> sendTo = new ArrayList<>();
			List<String> ccTo = new ArrayList<>();
			sendTo.add(process.getCreateUser()+"@h3c.com");
			if(!StringUtils.isEmpty(process.getCopyto())){
				String[] split = process.getCopyto().split(",");
				for(String c : split){
					if(org.apache.commons.lang3.StringUtils.isNotBlank(c)){
						ccTo.add(userService.backDomainAccount(c)+"@h3c.com");
					}
				}
			}
			mailInfoService.sendEffectNotice(sendTo, ccTo,"产品R级以下申请生效","/basicinfo/prBelowApply/edit/" + process.getId(), "修改产品R级以下基本信息");
		}

		String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplycode();
		String productUrl = "/basicinfo/prBelowApply/edit/" + process.getId();
		String authorName = userService.getUserNameByAccount(process.getCreateUser());
		String addUserName = "";
		if (StringUtil.isNotEmpty(process.getResponsible())) {
			addUserName = userService.getUserNameByAccount(process.getResponsible());
		}
		eipService.syncEip("产品R级以下信息申请", process.getApplycode(), process.getResponsible(), addUserName,
				process.getStatusname(), EipConst.PROCESSID_B, eipUrl, productUrl, process.getCreateUser(), authorName,
				end);
	}

	/**
	 * 审核
	 * 
	 * @param id
	 * @param params
	 */
	@Override
	public void check(Integer id, String taskId, Map<String, Object> params) throws Exception {
		IBDS_BaseObject_PROCESS process = null;
		try {
			process = check1(id, taskId, params);
			check2(id, taskId, params, process);
		} catch (Exception e) {
			logger.error("审核失败", e);
			throw new RuntimeException("审核失败");
		} finally {
			// 清空map
			BasicinfoConst.sbSubsystemMap.remove(process.getApplycode() + BasicinfoConst.feature_Prefix);
			BasicinfoConst.sbSubsystemMap.remove(process.getApplycode() + BasicinfoConst.subsystem_Prefix);
			BasicinfoConst.sbSubsystemMap.remove(process.getApplycode() + BasicinfoConst.module_Prefix);
		}

	}

	/**
	 * 修改当前处理人
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 */
	@Override
	@Transactional
	public void changeResponsible(Integer id, String taskId, String userId) {
		IBDS_BaseObject_PROCESS process = getById(id);
		process.setResponsible(userId);
		process.setAssignsign((String) SecurityUtils.getSubject().getPrincipal());
		process.setAssigndate(new Date());
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if (task == null) {
			throw new RuntimeException("没有运行该任务");
		}
		taskService.setAssignee(taskId, userId);
		updateEntity(process);
	}

	/**
	 * 更新相关信息
	 * 
	 * @param process
	 */
	@Transactional
	public void updateEntity(IBDS_BaseObject_PROCESS process) {
		process.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		process.setModifyDate(new Date());
		baseObjectProcessMapper.updateByPrimaryKeySelective(process);
	}

	/**
	 * 更新研发产品信息库
	 */
	@Override
	@Transactional
	public void updateBaseInfo(Integer id, String taskId, Map<String, Object> params) throws Exception {
		// TODO 同步基本信息
		IBDS_BaseObject_PROCESSExt process = (IBDS_BaseObject_PROCESSExt) getByProductId(id);
		// 新增同步
		if (!CollectionUtils.isEmpty(process.getBaseLines()) || !CollectionUtils.isEmpty(process.getBaseObjects())) {
			synchronizeChange(process);
		} else {
			throw new RuntimeException("数据错误申请数据为空");
		}
	}

	// --------------------------基线入库处理开始----------------------------------

	/**
	 * 新增基线 入库处理
	 * 
	 * @param apply
	 */
	public void addBaseLine(IBDS_BaseLine_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		// 新增
		if (apply.getBaseline().contains("\r\n")) {
			// 批量
			String code = baseLineService.getMaxCode();
			int newCode = Integer.parseInt(code.split("BL")[1]);
			List<IBDS_BaseLine> bef = new ArrayList<>();
			List<IBDS_BaseLine> lstbase = new ArrayList<>();
			StringBuilder lstStr = new StringBuilder();
			for (int i = 0; i < apply.getBaseline().split("\r\n").length; i++) {
				IBDS_BaseLine base = new IBDS_BaseLine();
				base.setBaselineno("BL" + df.format(newCode + i));
				base.setBaseline(apply.getBaseline().split("\r\n")[i]);
				if (apply.getBaseline1().contains("\r\n") && apply.getBaseline1().split("\r\n").length > i) {
					base.setBaseline1(apply.getBaseline1().split("\r\n")[i].equals("*") ? ""
							: apply.getBaseline1().split("\r\n")[i]);
				}
				base.setEngbaseline(apply.getEngbaseline().split("\r\n")[i]);
				if (apply.getParentitemno().contains("\r\n") && apply.getParentitemno().split("\r\n").length > i) {
					base.setParentitemno(apply.getParentitemno().split("\r\n")[i].equals("*") ? ""
							: apply.getParentitemno().split("\r\n")[i]);
				}
				base.setStatus("1");
				if (apply.getBaselineout().contains("\r\n") && apply.getBaselineout().split("\r\n").length > i) {
					base.setBaselineout(apply.getBaselineout().split("\r\n")[i]);
				}
				if (apply.getEngbaselineout().contains("\r\n") && apply.getEngbaselineout().split("\r\n").length > i) {
					base.setEngbaselineout(apply.getEngbaselineout().split("\r\n")[i]);
				}
				base.setPlipmtno(apply.getPlipmtno());
				base.setProdlineno(apply.getProdlineno());
				base.setProductno(apply.getProductno());
				base.setVersionno(apply.getVersionno());
				base.setReleaseno(apply.getReleaseno());
				base.setCreatedDate(new Date());
				base.setCreatedUser(apply.getCreateUser());
				base.setReaders(BasicinfoConst.remarks);
				lstStr.append(base.getBaselineno() + ",");
				lstbase.add(base);
			}

			baseLineService.insertSelectiveBatch(lstbase);
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "ADD");
			optLogBaseUtils.LstOperateLog(bef, lstbase, param);
		} else {
			IBDS_BaseLine base = new IBDS_BaseLine();
			String baselineno = baseLineService.getMaxCode();
			base.setBaselineno(baselineno);
			base.setBaseline(apply.getBaseline());
			base.setEngbaseline(apply.getEngbaseline());
			base.setBaseline1((apply.getBaseline1().equals("*") || apply.getBaseline1().equals("*,")) ? ""
					: apply.getBaseline1());
			base.setParentitemno((apply.getParentitemno().equals("*") || apply.getParentitemno().equals("*,")) ? ""
					: apply.getParentitemno());
			base.setStatus("1");
			base.setBaselineout(apply.getBaselineout());
			base.setEngbaselineout(apply.getEngbaselineout());
			base.setPlipmtno(apply.getPlipmtno());
			base.setProdlineno(apply.getProdlineno());
			base.setProductno(apply.getProductno());
			base.setVersionno(apply.getVersionno());
			base.setReleaseno(apply.getReleaseno());
			base.setCreatedDate(new Date());
			base.setCreatedUser(apply.getCreateUser());
			base.setReaders(BasicinfoConst.remarks);
			baseLineService.addIBDSBaseLine(base);
			// 添加操作日志
			optLogBaseUtils.RecordOpearteLog(null, base, base.getBaselineno());
		}
	}

	/**
	 * 修改基线 入库处理
	 * 
	 * @param apply
	 */
	public void editBaseLine(IBDS_BaseLine_Apply apply) {
		// 修改
		if (apply.getBaselineno().contains("\r")) {
			// 批量
			StringBuilder lstStr = new StringBuilder();
			List<IBDS_BaseLine> lst1 = new ArrayList<>();
			String[] ff1 = apply.getBaselineno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_BaseLine base = new IBDS_BaseLine();
				if (ff1[i].contains("_")) {
					base.setId(Integer.valueOf(ff1[i].split("_")[1]));
					// base.setBaselineno(ff1[i].split("_")[0]);
				} else {
					throw new FlowableException("修改基线内码不能为空,请联系管理员!!!");
				}
				if (apply.getBaseline().contains("\r")) {
					base.setBaseline(apply.getBaseline().split("\r")[i]);
				}
				if (apply.getEngbaseline().contains("\r")) {
					base.setEngbaseline(apply.getEngbaseline().split("\r")[i]);
				}
				if (apply.getBaseline1().contains("\r")) {
					base.setBaseline1(apply.getBaseline1().split("\r\n")[i].equals("*") ? ""
							: apply.getBaseline1().split("\r\n")[i]);
				}
				if (apply.getParentitemno().contains("\r")) {
					base.setParentitemno(apply.getParentitemno().split("\r\n")[i].equals("*") ? ""
							: apply.getParentitemno().split("\r\n")[i]);
				}
				if (apply.getBaselineout().contains("\r")) {
					base.setBaselineout(apply.getBaselineout().split("\r")[i]);
				}
				if (apply.getEngbaselineout().contains("\r")) {
					base.setEngbaselineout(apply.getEngbaselineout().split("\r")[i]);
				}
				base.setModifyData(new Date());
				base.setModifyUser(apply.getCreateUser());
				lst1.add(base);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}
			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_BaseLine> bef = baselineMapper.selectBaselinebyCodes(parMap);
			baseLineService.updateByBatch(lst1);

			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogBaseUtils.LstOperateLog(bef, lst1, param);

		} else {
			IBDS_BaseLine base = new IBDS_BaseLine();
			if (apply.getBaselineno().contains("_")) {
				base.setId(Integer.valueOf(apply.getBaselineno().split("_")[1]));
				base.setBaselineno(apply.getBaselineno().split("_")[0]);
			} else {
				throw new FlowableException("修改基线内码不能为空,请联系管理员!!!");
			}
			base.setBaseline(apply.getBaseline());
			base.setEngbaseline(apply.getEngbaseline());
			base.setBaseline1((apply.getBaseline1().equals("*") || apply.getBaseline1().equals("*,")) ? ""
					: apply.getBaseline1());
			base.setParentitemno((apply.getParentitemno().equals("*") || apply.getParentitemno().equals("*,")) ? ""
					: apply.getParentitemno());
			base.setEngbaselineout(apply.getEngbaselineout());
			base.setBaselineout(apply.getBaselineout());
			base.setModifyData(new Date());
			base.setModifyUser(apply.getCreateUser());
			IBDS_BaseLine bfe = colunmConfigService.selectByPrimaryKey(base.getId(), base.getBaselineno());
			baseLineService.editIBDSProject(base);
			// 添加操作日志
			optLogBaseUtils.RecordOpearteLog(bfe, base, base.getBaselineno());
		}
	}

	/**
	 * 停用基线 入库处理
	 * 
	 * @param apply
	 */
	public void delBaseLine(IBDS_BaseLine_Apply apply) {
		if (apply.getBaselineno().contains("\r")) {
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getBaselineno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");
				}
			}

			delProductBatch(apply, "id", sb.toString());
			// 停用基线 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
		} else {

			delProduct(apply, "id", apply.getBaselineno().split("_")[1]);
			// 停用基线 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getBaselineno().split("_")[0]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
		}
	}

	// --------------------------基线入库处理结束----------------------------------

	// --------------------------特性入库处理开始----------------------------------
	/**
	 * 新增特性 入库处理
	 * 
	 * @param apply
	 */
	public void addFeature(IBDS_BaseObject_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		// StringBuilder全局变量替换为Map 解决Spring中全局变量缓存问题
		StringBuilder sbFeature = new StringBuilder();
		BasicinfoConst.sbSubsystemMap.put(apply.getProcessCode() + BasicinfoConst.feature_Prefix, sbFeature);
		// 新增
		if (apply.getObjectname().contains("\r")) {
			// 批量
			List<IBDS_Feature> bef = new ArrayList<>();
			List<IBDS_Feature> lst = new ArrayList<>();
			String code = featureService.getMaxCode();
			int newCode = Integer.parseInt(code.split("FT")[1]);
			for (int i = 0; i < apply.getObjectname().split("\r").length; i++) {
				IBDS_Feature newFeature = new IBDS_Feature();
				newFeature.setFeatureno("FT" + df.format(newCode + i));
				newFeature.setFeature(apply.getObjectname().split("\r")[i]);
				newFeature.setEngfeature(apply.getEngobject().split("\r")[i]);
				newFeature.setStatus("1");
				newFeature.setCreatedDate(new Date());
				newFeature.setCreatedUser(apply.getCreateUser());
				newFeature.setPlipmtno(apply.getPlipmtno());
				newFeature.setProdlineno(apply.getProdlineno());
				newFeature.setProductno(apply.getProductno());
				newFeature.setVersionno(apply.getVersionno());
				newFeature.setReleaseno(apply.getReleaseno());
				newFeature.setReaders(BasicinfoConst.remarks);
				lst.add(newFeature);
				sbFeature.append(newFeature.getFeatureno() + ",");
			}
			featureService.insertSelectiveBatch(lst);
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbFeature);
			param.put("type", "ADD");
			optLogfeatureUtils.LstOperateLog(bef, lst, param);
		} else {
			// 单个
			IBDS_Feature feature = new IBDS_Feature();
			feature.setFeatureno(featureService.getMaxCode());
			feature.setFeature(apply.getObjectname());
			feature.setEngfeature(apply.getEngobject());
			feature.setStatus("1");
			feature.setCreatedDate(new Date());
			feature.setCreatedUser(apply.getCreateUser());
			feature.setPlipmtno(apply.getPlipmtno());
			feature.setProdlineno(apply.getProdlineno());
			feature.setProductno(apply.getProductno());
			feature.setVersionno(apply.getVersionno());
			feature.setReleaseno(apply.getReleaseno());
			feature.setReaders(BasicinfoConst.remarks);
			featureService.addIBDSFeature(feature);
			sbFeature.append(feature.getFeatureno());
			// 添加操作日志
			optLogfeatureUtils.RecordOpearteLog(null, feature, feature.getFeatureno());
		}
	}

	/**
	 * 修改特性 入库处理
	 * 
	 * @param apply
	 */
	public void editFeature(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 批量
			List<IBDS_Feature> lst1 = new ArrayList<>();
			StringBuilder lstStr = new StringBuilder();
			String[] ff1 = apply.getObjectno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_Feature sbd = new IBDS_Feature();
				if (ff1[i].contains("_")) {
					sbd.setId(Integer.valueOf(ff1[i].split("_")[1]));
				} else {
					throw new FlowableException("修改特性内码不能为空,请联系管理员!!!");
				}
				sbd.setFeature(apply.getObjectname().split("\r")[i]);
				sbd.setEngfeature(apply.getEngobject().split("\r")[i]);
				lst1.add(sbd);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}

			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_Feature> bef = featureMapper.selectFeaturebyCodes(parMap);
			featureService.updateByBatch(lst1);

			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogfeatureUtils.LstOperateLog(bef, lst1, param);
		} else {
			// 单个
			IBDS_Feature feature = new IBDS_Feature();
			if (apply.getObjectno().contains("_")) {
				feature.setId(Integer.valueOf(apply.getObjectno().split("_")[1]));
				feature.setFeatureno(apply.getObjectno().split("_")[0]);
			} else {
				throw new FlowableException("修改特性内码不能为空,请联系管理员!!!");
			}
			feature.setFeature(apply.getObjectname());
			feature.setEngfeature(apply.getEngobject());
			feature.setModifyData(new Date());
			feature.setModifyUser(apply.getCreateUser());
			IBDS_Feature bfe = colunmConfigService.selectByPrimaryKey(feature.getId(), feature.getFeatureno());
			featureService.editIBDSFeature(feature);
			// 添加操作日志
			optLogfeatureUtils.RecordOpearteLog(bfe, feature, feature.getFeatureno());

		}
	}

	/**
	 * 停用特性 入库处理
	 * 
	 * @param apply
	 */
	public void delFeature(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getObjectno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");
				}
			}
			delProductBatch(apply, "id", sb.toString(), "FT");
			delProductBatch(apply, "Featureno", sbCode.toString(), "SF");
			// 停用特性 停用下层所有
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);

			// 批量停用特性下层级 **
		} else {
			delProduct(apply, "id", apply.getObjectno().split("_")[1], "FT");
			delProduct(apply, "Featureno", apply.getObjectno().split("_")[0], "SF");
			// 停用特性 停用下层所有
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getObjectno().split("_")[0]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);

		}
	}

	// --------------------------特性入库处理结束----------------------------------

	// --------------------------子特性入库处理开始----------------------------------
	/**
	 * 新增子特性 入库处理
	 * 
	 * @param apply
	 */
	public void addsubFeature(IBDS_BaseObject_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		// 新增 子特性
		if (apply.getObjectname().contains("\r")) {
			// 批量
			List<IBDS_SubFeature> bef = new ArrayList<>();
			List<IBDS_SubFeature> lst = new ArrayList<>();
			String code = subFeatureService.getMaxCode();
			int newCode = Integer.parseInt(code.split("SF")[1]);
			StringBuilder sbCode = new StringBuilder();
			// 存在多个特性
			if (apply.getFeatureno().contains(",")) {
				int j = 0;
				int k = 0;
				for (String featureno : apply.getFeatureno().split(",")) {
					if (apply.getObjectname().split("\\*")[j].contains("\r\n")) {
						for (int i = 0; i < apply.getObjectname().split("\\*")[j].split("\r\n").length; i++) {
							if (StringUtil.isNotEmpty(apply.getObjectname().split("\\*")[j].split("\r\n")[i])) {

								IBDS_SubFeature newFeature = new IBDS_SubFeature();
								newFeature.setSubfeatureno("SF" + df.format(newCode + k));
								newFeature.setSubfeature(apply.getObjectname().split("\\*")[j].split("\r\n")[i]);
								newFeature.setEngsubfeature(apply.getEngobject().split("\\*")[j].split("\r\n")[i]);
								newFeature.setStatus("1");
								newFeature.setCreatedDate(new Date());
								newFeature.setCreatedUser(apply.getCreateUser());
								newFeature.setPlipmtno(apply.getPlipmtno());
								newFeature.setProdlineno(apply.getProdlineno());
								newFeature.setProductno(apply.getProductno());
								newFeature.setVersionno(apply.getVersionno());
								newFeature.setReleaseno(apply.getReleaseno());
								newFeature.setFeatureno(featureno);
								newFeature.setReaders(BasicinfoConst.remarks);
								lst.add(newFeature);
								sbCode.append(newFeature.getSubfeatureno() + ",");
								k++;
							}
						}
					}
					j++;
				}

			} else {
				if (StringUtil.isNotEmpty(apply.getFeatureno()) || (StringUtil.isEmpty(apply.getFeatureno())
						&& BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix) != null
						&& !BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix)
								.toString().contains(","))) {
					if (apply.getObjectname().contains("\r\n")) {
						for (int i = 0; i < apply.getObjectname().split("\r\n").length; i++) {
							IBDS_SubFeature newFeature = new IBDS_SubFeature();
							newFeature.setSubfeatureno("SF" + df.format(newCode + i));
							newFeature.setSubfeature(apply.getObjectname().split("\r\n")[i]);
							newFeature.setEngsubfeature(apply.getEngobject().split("\r\n")[i]);
							newFeature.setStatus("1");
							newFeature.setCreatedDate(new Date());
							newFeature.setCreatedUser(apply.getCreateUser());
							newFeature.setPlipmtno(apply.getPlipmtno());
							newFeature.setProdlineno(apply.getProdlineno());
							newFeature.setProductno(apply.getProductno());
							newFeature.setVersionno(apply.getVersionno());
							newFeature.setReleaseno(apply.getReleaseno());
							if (StringUtil.isNotEmpty(apply.getFeatureno())) {
								newFeature.setFeatureno(apply.getFeatureno());
							} else {
								newFeature.setFeatureno(BasicinfoConst.sbSubsystemMap
										.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix).toString());
							}
							newFeature.setReaders(BasicinfoConst.remarks);
							lst.add(newFeature);
							sbCode.append(newFeature.getSubfeatureno() + ",");
						}
					}
				} else {
					if (BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix) != null
							&& BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix)
									.toString().contains(",")) {
						int j = 0;
						int k = 0;
						for (String featureno : BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix).toString().split(",")) {
							if (apply.getObjectname().split("\\*")[j].contains("\r\n")) {
								for (int i = 0; i < apply.getObjectname().split("\\*")[j].split("\r\n").length; i++) {
									if (StringUtil.isNotEmpty(apply.getObjectname().split("\\*")[j].split("\r\n")[i])) {

										IBDS_SubFeature newFeature = new IBDS_SubFeature();
										newFeature.setSubfeatureno("SF" + df.format(newCode + k));
										newFeature
												.setSubfeature(apply.getObjectname().split("\\*")[j].split("\r\n")[i]);
										newFeature.setEngsubfeature(
												apply.getEngobject().split("\\*")[j].split("\r\n")[i]);
										newFeature.setStatus("1");
										newFeature.setCreatedDate(new Date());
										newFeature.setCreatedUser(apply.getCreateUser());
										newFeature.setPlipmtno(apply.getPlipmtno());
										newFeature.setProdlineno(apply.getProdlineno());
										newFeature.setProductno(apply.getProductno());
										newFeature.setVersionno(apply.getVersionno());
										newFeature.setReleaseno(apply.getReleaseno());
										newFeature.setFeatureno(featureno);
										newFeature.setReaders(BasicinfoConst.remarks);
										lst.add(newFeature);
										sbCode.append(newFeature.getSubfeatureno() + ",");
										k++;
									}
								}
							}
							j++;

						}
					}
				}
			}

			subFeatureService.insertSelectiveBatch(lst);
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode);
			param.put("type", "ADD");
			optLogSubfeatureUtils.LstOperateLog(bef, lst, param);
		} else {
			IBDS_SubFeature subfeature = new IBDS_SubFeature();
			subfeature.setSubfeatureno(subFeatureService.getMaxCode());
			subfeature.setSubfeature(apply.getObjectname());
			subfeature.setEngsubfeature(apply.getEngobject());
			subfeature.setStatus("1");
			subfeature.setCreatedDate(new Date());
			subfeature.setCreatedUser(apply.getCreateUser());
			subfeature.setPlipmtno(apply.getPlipmtno());
			subfeature.setProdlineno(apply.getProdlineno());
			subfeature.setProductno(apply.getProductno());
			subfeature.setVersionno(apply.getVersionno());
			subfeature.setReleaseno(apply.getReleaseno());
			// 存在多个特性
			if (StringUtil.isNotEmpty(apply.getFeatureno())) {
				if (apply.getFeatureno().contains(",")) {
					subfeature.setFeatureno(apply.getFeatureno().split(",")[0]);
				} else {
					subfeature.setFeatureno(apply.getFeatureno());
				}
			} else {
				if (BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix) != null) {
					if (BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix)
							.toString().contains(",")) {
						subfeature.setFeatureno(BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix).toString().split(",")[0]);
					} else {
						subfeature.setFeatureno(BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.feature_Prefix).toString());
					}
				}
			}
			subfeature.setReaders(BasicinfoConst.remarks);
			subFeatureService.addIBDSSubFeature(subfeature);
			// 添加操作日志
			optLogSubfeatureUtils.RecordOpearteLog(null, subfeature, subfeature.getSubfeatureno());

		}

	}

	/**
	 * 修改子特性 入库处理
	 * 
	 * @param apply
	 */
	public void editsubFeature(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 批量
			StringBuilder lstStr = new StringBuilder();
			List<IBDS_SubFeature> lst1 = new ArrayList<>();
			String[] ff1 = apply.getObjectno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_SubFeature sbd = new IBDS_SubFeature();
				if (ff1[i].contains("_")) {
					sbd.setId(Integer.valueOf(ff1[i].split("_")[1]));
				} else {
					throw new FlowableException("修改子特性内码不能为空,请联系管理员!!!");
				}
				sbd.setSubfeature(apply.getObjectname().split("\r")[i]);
				sbd.setEngsubfeature(apply.getEngobject().split("\r")[i]);
				lst1.add(sbd);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}

			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_SubFeature> bef = subfeatureMapper.selectSubfeaturebyCodes(parMap);
			subFeatureService.updateByBatch(lst1);

			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogSubfeatureUtils.LstOperateLog(bef, lst1, param);
		} else {
			// 单个
			IBDS_SubFeature subfeature = new IBDS_SubFeature();
			if (apply.getObjectno().contains("_")) {
				subfeature.setId(Integer.valueOf(apply.getObjectno().split("_")[1]));
				subfeature.setSubfeatureno(apply.getObjectno().split("_")[0]);
			} else {
				throw new FlowableException("修改子特性内码不能为空,请联系管理员!!!");
			}
			subfeature.setSubfeature(apply.getObjectname());
			subfeature.setEngsubfeature(apply.getEngobject());
			subfeature.setModifyData(new Date());
			subfeature.setModifyUser(apply.getCreateUser());
			IBDS_SubFeature bfe = colunmConfigService.selectByPrimaryKey(subfeature.getId(),
					subfeature.getSubfeatureno());
			subFeatureService.editIBDSSubFeature(subfeature);
			// 添加操作日志
			optLogSubfeatureUtils.RecordOpearteLog(bfe, subfeature, subfeature.getSubfeatureno());

		}
	}

	/**
	 * 停用子特性 入库处理
	 * 
	 * @param apply
	 */
	public void delsubFeature(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getObjectno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");
				}
			}
			delProductBatch(apply, "id", sb.toString(), "SF");
			// 停用子特性 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);

			// 批量停用特性下层级 **
		} else {
			delProduct(apply, "id", apply.getObjectno().split("_")[1], "SF");
			// 停用子特性 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getObjectno().split("_")[1]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
		}
	}

	// --------------------------子特性入库处理结束----------------------------------

	// --------------------------项目组入库处理开始----------------------------------
	/**
	 * 新增项目组 入库处理
	 * 
	 * @param apply
	 */
	public void addTeam(IBDS_BaseObject_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		if (apply.getObjectname().contains("\r")) {
			// 批量
			List<IBDS_Team> lst = new ArrayList<>();
			String code = teamService.getMaxCode();
			int newCode = Integer.parseInt(code.split("TM")[1]);
			List<IBDS_Team> bef = new ArrayList<>();
			List<IBDS_Team> aft = new ArrayList<>();
			Map<String, Object> param = new HashMap<>();
			StringBuilder lstStr = new StringBuilder();
			for (int i = 0; i < apply.getObjectname().split("\r").length; i++) {
				IBDS_Team newFeature = new IBDS_Team();
				newFeature.setTeamno("TM" + df.format(newCode + i));
				newFeature.setTeam(apply.getObjectname().split("\r")[i]);
				newFeature.setEngteam(apply.getEngobject().split("\r")[i]);
				newFeature.setStatus("1");
				newFeature.setCreatedDate(new Date());
				newFeature.setCreatedUser(apply.getCreateUser());
				newFeature.setPlipmtno(apply.getPlipmtno());
				newFeature.setProdlineno(apply.getProdlineno());
				newFeature.setProductno(apply.getProductno());
				newFeature.setVersionno(apply.getVersionno());
				newFeature.setReleaseno(apply.getReleaseno());
				newFeature.setReaders(BasicinfoConst.remarks);
				lst.add(newFeature);
				// 操作日志
				aft.add(newFeature);
				lstStr.append(newFeature.getTeamno() + ",");

			}
			teamService.insertSelectiveBatch(lst);
			// 批量添加操作日志
			param.put("code", lstStr);
			param.put("type", "ADD");
			optLogTeamUtils.LstOperateLog(bef, aft, param);

		} else {
			IBDS_Team team = new IBDS_Team();
			team.setTeamno(teamService.getMaxCode());
			team.setTeam(apply.getObjectname());
			team.setEngteam(apply.getEngobject());
			team.setStatus("1");
			team.setCreatedDate(new Date());
			team.setCreatedUser(apply.getCreateUser());
			team.setPlipmtno(apply.getPlipmtno());
			team.setProdlineno(apply.getProdlineno());
			team.setProductno(apply.getProductno());
			team.setVersionno(apply.getVersionno());
			team.setReleaseno(apply.getReleaseno());
			team.setReaders(BasicinfoConst.remarks);
			teamService.addIBDSTeam(team);
			// 添加操作日志
			optLogTeamUtils.RecordOpearteLog(null, team, team.getTeamno());
		}
	}

	/**
	 * 修改项目组 入库处理
	 * 
	 * @param apply
	 */
	public void editTeam(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 批量
			StringBuilder lstStr = new StringBuilder();
			List<IBDS_Team> lst1 = new ArrayList<>();
			String[] ff1 = apply.getObjectno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_Team sbd = new IBDS_Team();
				if (ff1[i].contains("_")) {
					sbd.setId(Integer.valueOf(ff1[i].split("_")[1]));
				} else {
					throw new FlowableException("修改项目组内码不能为空,请联系管理员!!!");
				}
				sbd.setTeam(apply.getObjectname().split("\r")[i]);
				sbd.setEngteam(apply.getEngobject().split("\r")[i]);
				lst1.add(sbd);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}

			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_Team> bef = teamMapper.selectTeambyCodes(parMap);

			teamService.updateByBatch(lst1);
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogTeamUtils.LstOperateLog(bef, lst1, param);
		} else {
			// 单个
			IBDS_Team team = new IBDS_Team();
			if (apply.getObjectno().contains("_")) {
				team.setId(Integer.valueOf(apply.getObjectno().split("_")[1]));
				team.setTeamno(apply.getObjectno().split("_")[0]);
			} else {
				throw new FlowableException("修改项目组内码不能为空,请联系管理员!!!");
			}
			team.setTeam(apply.getObjectname());
			team.setEngteam(apply.getEngobject());
			team.setModifyData(new Date());
			team.setModifyUser(apply.getCreateUser());
			IBDS_Team bfe = colunmConfigService.selectByPrimaryKey(team.getId(), team.getTeamno());
			teamService.editIBDSTeam(team);
			// 添加操作日志
			optLogTeamUtils.RecordOpearteLog(bfe, team, team.getTeamno());
		}
	}

	/**
	 * 停用项目组 入库处理
	 * 
	 * @param apply
	 */
	public void delTeam(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 项目组
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getObjectno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");
				}
			}
			delProductBatch(apply, "id", sb.toString(), "TM");
			// 停用项目组 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
			// 批量停用特性下层级 **
		} else {
			delProduct(apply, "id", apply.getObjectno().split("_")[1], "TM");
			// 停用项目组 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getObjectno().split("_")[1]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);

		}
	}

	// --------------------------项目组入库处理结束----------------------------------

	// --------------------------子系统入库处理开始----------------------------------
	/**
	 * 新增子系统 入库处理
	 * 
	 * @param apply
	 */
	// StringBuilder sbSubsystem = new StringBuilder();// 获取新增时的子系统内码，未选择所属子系统时使用

	public void addsubSystem(IBDS_BaseObject_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		StringBuilder sbSubsystem = new StringBuilder();
		BasicinfoConst.sbSubsystemMap.put(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix, sbSubsystem);
		if (apply.getObjectname().contains("\r")) {
			// 批量
			List<IBDS_SubSystem> bef = new ArrayList<>();
			List<IBDS_SubSystem> lst = new ArrayList<>();
			String code = subSystemService.getMaxCode();
			int newCode = Integer.parseInt(code.split("SS")[1]);
			for (int i = 0; i < apply.getObjectname().split("\r").length; i++) {
				IBDS_SubSystem newFeature = new IBDS_SubSystem();
				newFeature.setSubsystemno("SS" + (df.format(newCode + i)));
				newFeature.setSubsystem(apply.getObjectname().split("\r")[i]);
				newFeature.setEngsubsystem(apply.getEngobject().split("\r")[i]);
				newFeature.setStatus("1");
				newFeature.setCreatedDate(new Date());
				newFeature.setCreatedUser(apply.getCreateUser());
				newFeature.setPlipmtno(apply.getPlipmtno());
				newFeature.setProdlineno(apply.getProdlineno());
				newFeature.setProductno(apply.getProductno());
				newFeature.setVersionno(apply.getVersionno());
				newFeature.setReleaseno(apply.getReleaseno());
				newFeature.setReaders(BasicinfoConst.remarks);
				lst.add(newFeature);
				sbSubsystem.append(newFeature.getSubsystemno() + ",");
			}
			subSystemService.insertSelectiveBatch(lst);
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbSubsystem);
			param.put("type", "ADD");
			optLogSubSystemUtils.LstOperateLog(bef, lst, param);
		} else {
			IBDS_SubSystem subsystem = new IBDS_SubSystem();
			subsystem.setSubsystemno(subSystemService.getMaxCode());
			subsystem.setSubsystem(apply.getObjectname());
			subsystem.setEngsubsystem(apply.getEngobject());
			subsystem.setStatus("1");
			subsystem.setCreatedDate(new Date());
			subsystem.setCreatedUser(apply.getCreateUser());
			subsystem.setPlipmtno(apply.getPlipmtno());
			subsystem.setProdlineno(apply.getProdlineno());
			subsystem.setProductno(apply.getProductno());
			subsystem.setVersionno(apply.getVersionno());
			subsystem.setReleaseno(apply.getReleaseno());
			subsystem.setReaders(BasicinfoConst.remarks);
			subSystemService.create(subsystem);
			sbSubsystem.append(subsystem.getSubsystemno());
			// 添加操作日志
			optLogSubSystemUtils.RecordOpearteLog(null, subsystem, subsystem.getSubsystemno());
		}
	}

	/**
	 * 修改子系统 入库处理
	 * 
	 * @param apply
	 */
	public void editsubSystem(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 批量
			StringBuilder lstStr = new StringBuilder();
			List<IBDS_SubSystem> lst1 = new ArrayList<>();
			String[] ff1 = apply.getObjectno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_SubSystem sbd = new IBDS_SubSystem();

				if (ff1[i].contains("_")) {
					sbd.setId(Integer.valueOf(ff1[i].split("_")[1]));
					// sbd.setSubsystemno(ff1[i].split("_")[0]);
				} else {
					throw new FlowableException("修改子系统内码不能为空,请联系管理员!!!");
				}
				sbd.setSubsystem(apply.getObjectname().split("\r")[i]);
				sbd.setEngsubsystem(apply.getEngobject().split("\r")[i]);
				lst1.add(sbd);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}

			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_SubSystem> bef = subsystemMapper.selectSubsystembyCodes(parMap);
			subSystemService.updateByBatch(lst1);

			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogSubSystemUtils.LstOperateLog(bef, lst1, param);
		} else {
			// 单个
			IBDS_SubSystem subsystem = new IBDS_SubSystem();
			if (apply.getObjectno().contains("_")) {
				subsystem.setId(Integer.valueOf(apply.getObjectno().split("_")[1]));
				subsystem.setSubsystemno(apply.getObjectno().split("_")[0]);
			} else {
				throw new FlowableException("修改子系统内码不能为空,请联系管理员!!!");
			}
			subsystem.setSubsystem(apply.getObjectname());
			subsystem.setEngsubsystem(apply.getEngobject());
			subsystem.setModifyData(new Date());
			subsystem.setModifyUser(apply.getCreateUser());
			IBDS_SubSystem bfe = colunmConfigService.selectByPrimaryKey(subsystem.getId(), subsystem.getSubsystemno());
			subSystemService.update(subsystem);
			// 添加操作日志
			optLogSubSystemUtils.RecordOpearteLog(bfe, subsystem, subsystem.getSubsystemno());

		}
	}

	/**
	 * 停用子系统 入库处理
	 * 
	 * @param apply
	 */
	public void delsubSystem(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getObjectno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");
				}
			}
			delProductBatch(apply, "id", sb.toString(), "SS");
			delProductBatch(apply, "SubSystemno", sbCode.toString(), "MD");
			delProductBatch(apply, "SubSystemno", sbCode.toString(), "MV");
			// 停用子系统 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
			// 批量停用特性下层级 **
		} else {
			delProduct(apply, "id", apply.getObjectno().split("_")[1], "SS");
			delProduct(apply, "SubSystemno", apply.getObjectno().split("_")[0], "MD");
			delProduct(apply, "SubSystemno", apply.getObjectno().split("_")[0], "MV");
			// 停用子系统 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getObjectno().split("_")[0]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
		}
	}

	// --------------------------子系统入库处理结束----------------------------------

	// --------------------------模块入库处理开始----------------------------------

	/**
	 * 新增模块 入库处理
	 * 
	 * @param apply
	 */
	public void addModule(IBDS_BaseObject_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		StringBuilder sbModule = new StringBuilder();// 获取新增时的模块内码，未选择所属模块时使用
		BasicinfoConst.sbSubsystemMap.put(apply.getProcessCode() + BasicinfoConst.module_Prefix, sbModule);
		if (apply.getObjectname().contains("\r")) {
			// 批量
			List<IBDS_Module> bef = new ArrayList<>();
			List<IBDS_Module> lst = new ArrayList<>();
			String code = moduleService.getMaxCode();
			int newCode = Integer.parseInt(code.split("MD")[1]);
			if (apply.getSubsystemno().contains(",")) {
				// 存在多个子系统
				int j = 0;
				int k = 0;
				for (String subsystemno : apply.getSubsystemno().split(",")) {
					if (apply.getObjectname().contains("*")) {
						if (apply.getObjectname().split("\\*")[j].contains("\r\n")) {
							for (int i = 0; i < apply.getObjectname().split("\\*")[j].split("\r\n").length; i++) {
								if (StringUtil.isNotEmpty(apply.getObjectname().split("\\*")[j].split("\r\n")[i])) {
									IBDS_Module newFeature = new IBDS_Module();
									newFeature.setModuleno("MD" + df.format(newCode + k));
									newFeature.setModule(apply.getObjectname().split("\\*")[j].split("\r\n")[i]);
									newFeature.setEngmodule(apply.getEngobject().split("\\*")[j].split("\r\n")[i]);
									newFeature.setStatus("1");
									newFeature.setCreatedDate(new Date());
									newFeature.setCreatedUser(apply.getCreateUser());
									newFeature.setPlipmtno(apply.getPlipmtno());
									newFeature.setProdlineno(apply.getProdlineno());
									newFeature.setProductno(apply.getProductno());
									newFeature.setVersionno(apply.getVersionno());
									newFeature.setReleaseno(apply.getReleaseno());
									newFeature.setSubsystemno(subsystemno);
									newFeature.setReaders(BasicinfoConst.remarks);
									lst.add(newFeature);
									sbModule.append(newFeature.getModuleno() + ",");
									k++;
								}
							}
						} else {
							IBDS_Module newFeature = new IBDS_Module();
							newFeature.setModuleno("MD" + df.format(newCode + k));
							newFeature.setModule(apply.getObjectname().split("\\*")[j]);
							newFeature.setEngmodule(apply.getEngobject().split("\\*")[j]);
							newFeature.setStatus("1");
							newFeature.setCreatedDate(new Date());
							newFeature.setCreatedUser(apply.getCreateUser());
							newFeature.setPlipmtno(apply.getPlipmtno());
							newFeature.setProdlineno(apply.getProdlineno());
							newFeature.setProductno(apply.getProductno());
							newFeature.setVersionno(apply.getVersionno());
							newFeature.setReleaseno(apply.getReleaseno());
							newFeature.setSubsystemno(subsystemno);
							newFeature.setReaders(BasicinfoConst.remarks);
							lst.add(newFeature);
							sbModule.append(newFeature.getModuleno() + ",");
							k++;

						}
					}
					j++;
				}
			} else {
				// 选择所属子系统 录入数据以所属子系统为主
				// 未选择所属子系统 存在新增子系统 则录入数据以新增返回的子系统内码为主 sbSubsystem

				if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
					for (int i = 0; i < apply.getObjectname().split("\r\n").length; i++) {
						IBDS_Module newFeature = new IBDS_Module();
						newFeature.setModuleno("MD" + df.format(newCode + i));
						newFeature.setModule(apply.getObjectname().split("\r\n")[i]);
						newFeature.setEngmodule(apply.getEngobject().split("\r\n")[i]);
						newFeature.setStatus("1");
						newFeature.setCreatedDate(new Date());
						newFeature.setCreatedUser(apply.getCreateUser());
						newFeature.setPlipmtno(apply.getPlipmtno());
						newFeature.setProdlineno(apply.getProdlineno());
						newFeature.setProductno(apply.getProductno());
						newFeature.setVersionno(apply.getVersionno());
						newFeature.setReleaseno(apply.getReleaseno());
						newFeature.setSubsystemno(apply.getSubsystemno());
						newFeature.setReaders(BasicinfoConst.remarks);
						lst.add(newFeature);
						sbModule.append(newFeature.getModuleno() + ",");
					}
				} else {
					if (BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null
							&& BasicinfoConst.sbSubsystemMap
									.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString()
									.contains(",")) {
						int j = 0;
						int k = 0;
						for (String subsystemno : BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString().split(",")) {
							// 存在多个子系统

							if (apply.getObjectname().contains("*")) {
								if (apply.getObjectname().split("\\*")[j].contains("\r\n")) {
									for (int i = 0; i < apply.getObjectname().split("\\*")[j]
											.split("\r\n").length; i++) {
										if (StringUtil
												.isNotEmpty(apply.getObjectname().split("\\*")[j].split("\r\n")[i])) {
											IBDS_Module newFeature = new IBDS_Module();
											newFeature.setModuleno("MD" + df.format(newCode + k));
											newFeature
													.setModule(apply.getObjectname().split("\\*")[j].split("\r\n")[i]);
											newFeature.setEngmodule(
													apply.getEngobject().split("\\*")[j].split("\r\n")[i]);
											newFeature.setStatus("1");
											newFeature.setCreatedDate(new Date());
											newFeature.setCreatedUser(apply.getCreateUser());
											newFeature.setPlipmtno(apply.getPlipmtno());
											newFeature.setProdlineno(apply.getProdlineno());
											newFeature.setProductno(apply.getProductno());
											newFeature.setVersionno(apply.getVersionno());
											newFeature.setReleaseno(apply.getReleaseno());
											newFeature.setSubsystemno(subsystemno);
											newFeature.setReaders(BasicinfoConst.remarks);
											lst.add(newFeature);
											sbModule.append(newFeature.getModuleno() + ",");
											k++;
										}
									}
								}
							} else {
								IBDS_Module newFeature = new IBDS_Module();
								newFeature.setModuleno("MD" + df.format(newCode + k));
								newFeature.setModule(apply.getObjectname().split("\\*")[j]);
								newFeature.setEngmodule(apply.getEngobject().split("\\*")[j]);
								newFeature.setStatus("1");
								newFeature.setCreatedDate(new Date());
								newFeature.setCreatedUser(apply.getCreateUser());
								newFeature.setPlipmtno(apply.getPlipmtno());
								newFeature.setProdlineno(apply.getProdlineno());
								newFeature.setProductno(apply.getProductno());
								newFeature.setVersionno(apply.getVersionno());
								newFeature.setReleaseno(apply.getReleaseno());
								newFeature.setSubsystemno(subsystemno);
								newFeature.setReaders(BasicinfoConst.remarks);
								lst.add(newFeature);
								sbModule.append(newFeature.getModuleno() + ",");
								k++;
							}
							j++;
						}
					} else {
						for (int i = 0; i < apply.getObjectname().split("\r\n").length; i++) {
							IBDS_Module newFeature = new IBDS_Module();
							newFeature.setModuleno("MD" + df.format(newCode + i));
							newFeature.setModule(apply.getObjectname().split("\r\n")[i]);
							newFeature.setEngmodule(apply.getEngobject().split("\r\n")[i]);
							newFeature.setStatus("1");
							newFeature.setCreatedDate(new Date());
							newFeature.setCreatedUser(apply.getCreateUser());
							newFeature.setPlipmtno(apply.getPlipmtno());
							newFeature.setProdlineno(apply.getProdlineno());
							newFeature.setProductno(apply.getProductno());
							newFeature.setVersionno(apply.getVersionno());
							newFeature.setReleaseno(apply.getReleaseno());
							if (BasicinfoConst.sbSubsystemMap
									.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
								newFeature.setSubsystemno(BasicinfoConst.sbSubsystemMap
										.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString());
							}
							newFeature.setReaders(BasicinfoConst.remarks);
							lst.add(newFeature);
							sbModule.append(newFeature.getModuleno() + ",");
						}
					}
				}
			}
			moduleService.insertSelectiveBatch(lst);
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbModule);
			param.put("type", "ADD");
			optLogModuleUtils.LstOperateLog(bef, lst, param);
		} else {
			// 存在多个子系统
			if (apply.getSubsystemno().contains(",")) {

				List<IBDS_Module> bef = new ArrayList<>();
				List<IBDS_Module> lst = new ArrayList<>();
				int i = 0;
				String code = moduleService.getMaxCode();
				int newCode = Integer.parseInt(code.split("MD")[1]);
				for (String subsystemno : apply.getSubsystemno().split(",")) {
					IBDS_Module newFeature = new IBDS_Module();
					newFeature.setModuleno("MD" + df.format(newCode + i));
					newFeature.setModule(apply.getObjectname());
					newFeature.setEngmodule(apply.getEngobject());
					newFeature.setStatus("1");
					newFeature.setCreatedDate(new Date());
					newFeature.setCreatedUser(apply.getCreateUser());
					newFeature.setPlipmtno(apply.getPlipmtno());
					newFeature.setProdlineno(apply.getProdlineno());
					newFeature.setProductno(apply.getProductno());
					newFeature.setVersionno(apply.getVersionno());
					newFeature.setReleaseno(apply.getReleaseno());
					newFeature.setSubsystemno(subsystemno);
					newFeature.setReaders(BasicinfoConst.remarks);
					lst.add(newFeature);
					sbModule.append(newFeature.getModuleno() + ",");
					i++;
				}
				moduleService.insertSelectiveBatch(lst);
				// 批量添加操作日志
				Map<String, Object> param = new HashMap<>();
				param.put("code", sbModule);
				param.put("type", "ADD");
				optLogModuleUtils.LstOperateLog(bef, lst, param);
			} else {
				IBDS_Module module = new IBDS_Module();
				module.setModuleno(moduleService.getMaxCode());
				module.setModule(apply.getObjectname());
				module.setEngmodule(apply.getEngobject());
				module.setStatus("1");
				module.setCreatedDate(new Date());
				module.setCreatedUser(apply.getCreateUser());
				module.setPlipmtno(apply.getPlipmtno());
				module.setProdlineno(apply.getProdlineno());
				module.setProductno(apply.getProductno());
				module.setVersionno(apply.getVersionno());
				module.setReleaseno(apply.getReleaseno());
				if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
					module.setSubsystemno(apply.getSubsystemno());
				} else {
					if (BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
						module.setSubsystemno(BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString());
					}
				}
				module.setReaders(BasicinfoConst.remarks);
				moduleService.create(module);
				sbModule.append(module.getModuleno());
				// 添加操作日志
				optLogModuleUtils.RecordOpearteLog(null, module, module.getModuleno());
			}

		}
	}

	/**
	 * 修改模块 入库处理
	 * 
	 * @param apply
	 */
	public void editModule(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 批量
			StringBuilder lstStr = new StringBuilder();
			List<IBDS_Module> lst1 = new ArrayList<>();
			String[] ff1 = apply.getObjectno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_Module sbd = new IBDS_Module();
				if (ff1[i].contains("_")) {
					sbd.setId(Integer.valueOf(ff1[i].split("_")[1]));
					sbd.setModuleno(ff1[i].split("_")[0]);
					// sbd.setSubsystemno(ff1[i].split("_")[0]);
				} else {
					throw new FlowableException("修改模块内码不能为空,请联系管理员!!!");
				}
				sbd.setModule(apply.getObjectname().split("\r")[i]);
				sbd.setEngmodule(apply.getEngobject().split("\r")[i]);
				lst1.add(sbd);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}

			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_Module> bef = moduleMapper.selectModulebyCodes(parMap);
			moduleService.updateByBatch(lst1);

			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogModuleUtils.LstOperateLog(bef, lst1, param);
		} else {
			// 单个
			IBDS_Module module = new IBDS_Module();
			if (apply.getObjectno().contains("_")) {
				module.setId(Integer.valueOf(apply.getObjectno().split("_")[1]));
				module.setModuleno(apply.getObjectno().split("_")[0]);
			} else {
				throw new FlowableException("修改模块内码不能为空,请联系管理员!!!");
			}
			module.setModule(apply.getObjectname());
			module.setEngmodule(apply.getEngobject());
			module.setModifyData(new Date());
			module.setModifyUser(apply.getCreateUser());
			IBDS_Module bfe = colunmConfigService.selectByPrimaryKey(module.getId(), module.getModuleno());
			moduleService.update(module);
			// 添加操作日志
			optLogModuleUtils.RecordOpearteLog(bfe, module, module.getModuleno());

		}
	}

	/**
	 * 停用模块 入库处理
	 * 
	 * @param apply
	 */
	public void delModule(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getObjectno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");

				}
			}
			delProductBatch(apply, "id", sb.toString(), "MD");
			delProductBatch(apply, "Moduleno", sbCode.toString(), "MV");
			// 停用模块 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
			// 批量停用特性下层级 **
		} else {
			delProduct(apply, "id", apply.getObjectno().split("_")[1], "MD");
			delProduct(apply, "Moduleno", apply.getObjectno().split("_")[0], "MV");
			// 停用模块 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getObjectno().split("_")[0]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
		}
	}
	// --------------------------模块入库处理结束----------------------------------

	// --------------------------模块版本入库处理开始----------------------------------

	/**
	 * 新增模块版本 入库处理
	 * 
	 * @param apply
	 */
	public void addModuleVersion(IBDS_BaseObject_Apply apply) {
		// 申请编码 后数字不足6位补0
		DecimalFormat df = new DecimalFormat("000000");
		// 存在多个子系统
		Map<String, Object> param = new HashMap<>();
		param.put("selcolumnName", "subsystemno");
		param.put("selcolumnCode", "moduleno");
		param.put("tabName", "IBDS_MODULE");
		param.put("column", "moduleno");
		StringBuilder sbcode = new StringBuilder();
		// 添加操作日志内码
		StringBuilder sbcodes = new StringBuilder();

		if (apply.getModuleno().contains(",")) {
			for (String code : apply.getModuleno().split(",")) {
				if (apply.getModuleno().contains("_") && StringUtil.isNotEmpty(code)) {
					sbcode.append(code.split("_")[0] + ",");
				} else {
					sbcode.append(code);
				}
			}
		} else {
			if (StringUtil.isNotEmpty(apply.getModuleno())) {
				sbcode.append(apply.getModuleno() + ",");
			} else {
				if (BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode() + BasicinfoConst.module_Prefix) != null) {
					sbcode.append(BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.module_Prefix).toString());
				}
			}
		}
		param.put("codes", sbcode.toString());
		// 新增
		if (apply.getObjectname().contains("\r")) {
			// 批量
			List<IBDS_ModuleVersion> bef = new ArrayList<>();
			List<IBDS_ModuleVersion> lst = new ArrayList<>();
			String code = moduleVersionService.getMaxCode();
			int newCode = Integer.parseInt(code.split("MV")[1]);

			// 存在多个模块
			if (apply.getModuleno().contains(",")) {
				int j = 0;
				int k = 0;
				// 匹配子系统和模块

				String[] subsystem = productApplyService.getDataByColunm(param);
				for (String moduleno : apply.getModuleno().split(",")) {
					if (apply.getObjectname().contains("*")) {
						if (apply.getObjectname().split("\\*")[j].contains("\r\n")) {
							for (int i = 0; i < apply.getObjectname().split("\\*")[j].split("\r\n").length; i++) {
								if (StringUtil.isNotEmpty(apply.getObjectname().split("\\*")[j].split("\r\n")[i])) {
									IBDS_ModuleVersion newFeature = new IBDS_ModuleVersion();
									newFeature.setMdlvsnno("MV" + df.format(newCode + k));
									newFeature.setMdlvsn(apply.getObjectname().split("\\*")[j].split("\r\n")[i]);
									newFeature.setEngmdlvsn(apply.getEngobject().split("\\*")[j].split("\r\n")[i]);
									newFeature.setStatus("1");
									newFeature.setCreatedDate(new Date());
									newFeature.setCreatedUser(apply.getCreateUser());
									newFeature.setPlipmtno(apply.getPlipmtno());
									newFeature.setProdlineno(apply.getProdlineno());
									newFeature.setProductno(apply.getProductno());
									newFeature.setVersionno(apply.getVersionno());
									newFeature.setReleaseno(apply.getReleaseno());
									newFeature.setReaders(BasicinfoConst.remarks);
									if (apply.getSubsystemno().contains(",") && subsystem == null) {
										for (String subsystemno : apply.getSubsystemno().split(",")) {
											if (StringUtil.isNotEmpty(subsystemno)) {
												if (subsystemno.contains("_")) {
													newFeature.setSubsystemno(subsystemno.split("_")[0]);
												} else {
													newFeature.setSubsystemno(subsystemno);
												}
											}
										}

									} else {
										if (subsystem.length > 0) {
											for (String subsystem1 : subsystem) {
												if (subsystem1.contains("||")) {
													if (subsystem1.split("\\|\\|")[1].contains(
															moduleno.contains("_") ? moduleno.split("_")[0] : moduleno)
															|| apply.getSubsystemno()
																	.contains(subsystem1.split("\\|\\|")[0])) {
														newFeature.setSubsystemno(subsystem1.split("\\|\\|")[0]);
													}
												} else {
													if (subsystem1.contains(
															moduleno.contains("_") ? moduleno.split("_")[0] : moduleno)
															|| apply.getSubsystemno().contains(subsystem1)) {
														newFeature.setSubsystemno(subsystem1);
													}
												}
											}

										} else {
											if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
												newFeature.setSubsystemno(apply.getSubsystemno());
											}
											if (BasicinfoConst.sbSubsystemMap.get(
													apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
												newFeature.setSubsystemno(BasicinfoConst.sbSubsystemMap
														.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix)
														.toString());
											}
										}
									}

									if (moduleno.contains("_")) {
										newFeature.setModuleno(moduleno.split("_")[0]);
									} else {
										newFeature.setModuleno(moduleno);
									}

									lst.add(newFeature);
									sbcodes.append(newFeature.getMdlvsnno() + ",");
									k++;
								}
							}
						}
					}
					j++;
				}
			} else {
				if (StringUtil.isNotEmpty(apply.getModuleno())) {
					String[] subsystem1 = null;
					if (apply.getSubsystemno().contains(",") || (BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null
							&& BasicinfoConst.sbSubsystemMap
									.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString()
									.contains(","))) {
						subsystem1 = productApplyService.getDataByColunm(param);
					}
					for (int i = 0; i < apply.getObjectname().split("\r\n").length; i++) {
						IBDS_ModuleVersion newFeature = new IBDS_ModuleVersion();
						newFeature.setMdlvsnno("MV" + df.format(newCode + i));
						newFeature.setMdlvsn(apply.getObjectname().split("\r\n")[i]);
						newFeature.setEngmdlvsn(apply.getEngobject().split("\r\n")[i]);
						newFeature.setStatus("1");
						newFeature.setCreatedDate(new Date());
						newFeature.setCreatedUser(apply.getCreateUser());
						newFeature.setPlipmtno(apply.getPlipmtno());
						newFeature.setProdlineno(apply.getProdlineno());
						newFeature.setProductno(apply.getProductno());
						newFeature.setVersionno(apply.getVersionno());
						newFeature.setReleaseno(apply.getReleaseno());
						newFeature.setReaders(BasicinfoConst.remarks);
						if (apply.getModuleno().contains("_")) {
							newFeature.setModuleno(apply.getModuleno().split("_")[0]);
						} else {
							newFeature.setModuleno(apply.getModuleno());
						}
						if (apply.getSubsystemno().contains(",") && subsystem1 == null) {
							for (String subsystemno : apply.getSubsystemno().split(",")) {
								if (StringUtil.isNotEmpty(subsystemno)) {
									if (subsystemno.contains("_")) {
										newFeature.setSubsystemno(subsystemno.split("_")[0]);
									} else {
										newFeature.setSubsystemno(subsystemno);
									}
								}
							}

						} else {
							if (subsystem1 != null && subsystem1.length > 0) {
								if (subsystem1[i].contains("||")) {
									if (subsystem1[i].split("\\|\\|")[1].contains(
											apply.getModuleno().contains("_") ? apply.getModuleno().split("_")[0]
													: apply.getModuleno())) {
										newFeature.setSubsystemno(subsystem1[i].split("\\|\\|")[0]);
									}
								} else {
									newFeature.setSubsystemno(subsystem1[i]);
								}
							} else {
								if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
									newFeature.setSubsystemno(apply.getSubsystemno());
								}
								if (BasicinfoConst.sbSubsystemMap
										.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
									newFeature.setSubsystemno(BasicinfoConst.sbSubsystemMap
											.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString());
								}
							}
						}

						lst.add(newFeature);
						sbcodes.append(newFeature.getMdlvsnno() + ",");
					}
				} else {
					if (BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode() + BasicinfoConst.module_Prefix)
							.toString().contains(",")) {
						String[] subsystem1 = null;
						if (apply.getSubsystemno().contains(",") || (BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null
								&& BasicinfoConst.sbSubsystemMap
										.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString()
										.contains(","))) {
							subsystem1 = productApplyService.getDataByColunm(param);
						}
						int k = 0;
						for (String module : BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.module_Prefix).toString().split(",")) {
							int j = 0;
							if (apply.getObjectname().contains("*")) {
								if (apply.getObjectname().split("\\*")[j].contains("\r\n")) {
									for (int i = 0; i < apply.getObjectname().split("\\*")[j]
											.split("\r\n").length; i++) {
										if (StringUtil
												.isNotEmpty(apply.getObjectname().split("\\*")[j].split("\r\n")[i])) {
											IBDS_ModuleVersion newFeature = new IBDS_ModuleVersion();
											newFeature.setMdlvsnno("MV" + df.format(newCode + k));
											newFeature
													.setMdlvsn(apply.getObjectname().split("\\*")[j].split("\r\n")[i]);
											newFeature.setEngmdlvsn(
													apply.getEngobject().split("\\*")[j].split("\r\n")[i]);
											newFeature.setStatus("1");
											newFeature.setCreatedDate(new Date());
											newFeature.setCreatedUser(apply.getCreateUser());
											newFeature.setPlipmtno(apply.getPlipmtno());
											newFeature.setProdlineno(apply.getProdlineno());
											newFeature.setProductno(apply.getProductno());
											newFeature.setVersionno(apply.getVersionno());
											newFeature.setReleaseno(apply.getReleaseno());
											newFeature.setReaders(BasicinfoConst.remarks);
											if (apply.getSubsystemno().contains(",") && subsystem1 == null) {
												for (String subsystemno : apply.getSubsystemno().split(",")) {
													if (StringUtil.isNotEmpty(subsystemno)) {
														if (subsystemno.contains("_")) {
															newFeature.setSubsystemno(subsystemno.split("_")[0]);
														} else {
															newFeature.setSubsystemno(subsystemno);
														}
													}
												}

											} else {
												if (subsystem1 != null && subsystem1.length > 0) {
													for (String subsystem : subsystem1) {
														if (subsystem.contains("||")) {
															if (subsystem.split("\\|\\|")[1].contains(module)) {
																newFeature.setSubsystemno(subsystem.split("\\|\\|")[0]);
															}
														} else {
															if (subsystem.contains(module)) {
																newFeature.setSubsystemno(subsystem);
															}
														}
													}

												} else {
													if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
														newFeature.setSubsystemno(apply.getSubsystemno());
													}
													if (BasicinfoConst.sbSubsystemMap.get(apply.getProcessCode()
															+ BasicinfoConst.subsystem_Prefix) != null) {
														newFeature
																.setSubsystemno(BasicinfoConst.sbSubsystemMap
																		.get(apply.getProcessCode()
																				+ BasicinfoConst.subsystem_Prefix)
																		.toString());
													}
												}
											}
											newFeature.setModuleno(module);

											lst.add(newFeature);
											sbcodes.append(newFeature.getMdlvsnno() + ",");
											k++;
										}
									}
								}
							} else {
								for (int i = 0; i < apply.getObjectname().split("\r\n").length; i++) {
									IBDS_ModuleVersion newFeature = new IBDS_ModuleVersion();
									newFeature.setMdlvsnno("MV" + df.format(newCode + k));
									newFeature.setMdlvsn(apply.getObjectname().split("\r\n")[i]);
									newFeature.setEngmdlvsn(apply.getEngobject().split("\r\n")[i]);
									newFeature.setStatus("1");
									newFeature.setCreatedDate(new Date());
									newFeature.setCreatedUser(apply.getCreateUser());
									newFeature.setPlipmtno(apply.getPlipmtno());
									newFeature.setProdlineno(apply.getProdlineno());
									newFeature.setProductno(apply.getProductno());
									newFeature.setVersionno(apply.getVersionno());
									newFeature.setReleaseno(apply.getReleaseno());
									newFeature.setReaders(BasicinfoConst.remarks);
									if (apply.getSubsystemno().contains(",") && subsystem1 == null) {
										for (String subsystemno : apply.getSubsystemno().split(",")) {
											if (StringUtil.isNotEmpty(subsystemno)) {
												if (subsystemno.contains("_")) {
													newFeature.setSubsystemno(subsystemno.split("_")[0]);
												} else {
													newFeature.setSubsystemno(subsystemno);
												}
											}
										}

									} else {
										if (subsystem1 != null && subsystem1.length > 0) {
											for (String subsystem : subsystem1) {
												if (subsystem.contains("||")) {
													if (subsystem.split("\\|\\|")[1].contains(module) || apply
															.getSubsystemno().contains(subsystem.split("\\|\\|")[0])) {
														newFeature.setSubsystemno(subsystem.split("\\|\\|")[0]);
													}
												} else {
													if (subsystem.contains(module)
															|| apply.getSubsystemno().contains(subsystem)) {
														newFeature.setSubsystemno(subsystem);
													}
												}
											}
										} else {
											if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
												newFeature.setSubsystemno(apply.getSubsystemno());
											}
											if (BasicinfoConst.sbSubsystemMap.get(
													apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
												newFeature.setSubsystemno(BasicinfoConst.sbSubsystemMap
														.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix)
														.toString());
											}
										}
									}
									newFeature.setModuleno(module);

									lst.add(newFeature);
									sbcodes.append(newFeature.getMdlvsnno() + ",");
									k++;
								}
							}
						}
					} else {
						int k = 0;
						String[] subsystem1 = null;
						if (apply.getSubsystemno().contains(",")) {
							subsystem1 = productApplyService.getDataByColunm(param);
						}
						for (int i = 0; i < apply.getObjectname().split("\r\n").length; i++) {
							IBDS_ModuleVersion newFeature = new IBDS_ModuleVersion();
							newFeature.setMdlvsnno("MV" + df.format(newCode + k));
							newFeature.setMdlvsn(apply.getObjectname().split("\r\n")[i]);
							newFeature.setEngmdlvsn(apply.getEngobject().split("\r\n")[i]);
							newFeature.setStatus("1");
							newFeature.setCreatedDate(new Date());
							newFeature.setCreatedUser(apply.getCreateUser());
							newFeature.setPlipmtno(apply.getPlipmtno());
							newFeature.setProdlineno(apply.getProdlineno());
							newFeature.setProductno(apply.getProductno());
							newFeature.setVersionno(apply.getVersionno());
							newFeature.setReleaseno(apply.getReleaseno());
							newFeature.setReaders(BasicinfoConst.remarks);
							if (BasicinfoConst.sbSubsystemMap
									.get(apply.getProcessCode() + BasicinfoConst.module_Prefix) != null) {
								newFeature.setModuleno(BasicinfoConst.sbSubsystemMap
										.get(apply.getProcessCode() + BasicinfoConst.module_Prefix).toString());
							}
							if (StringUtil.isNotEmpty(apply.getModuleno())) {
								if (apply.getModuleno().contains("_")) {
									newFeature.setModuleno(apply.getModuleno().split("_")[0]);
								} else {
									newFeature.setModuleno(apply.getModuleno());
								}
							}
							if (apply.getSubsystemno().contains(",")) {
								if (subsystem1[i].contains("_")
										&& subsystem1[i].split("_")[1].contains(
												apply.getModuleno().contains("_") ? apply.getModuleno().split("_")[0]
														: apply.getModuleno())
										&& apply.getSubsystemno().contains(subsystem1[i].split("_")[0])) {
									newFeature.setSubsystemno(subsystem1[i].split("_")[0]);
								} else {
									newFeature.setSubsystemno(apply.getSubsystemno().contains("_")
											? apply.getSubsystemno().split(",")[0].split("_")[0]
											: apply.getSubsystemno().split(",")[0]);
								}
							} else {
								if (subsystem1 != null && subsystem1.length > 0) {
									for (String subsystem : subsystem1) {
										if (subsystem.contains("||")) {
											if (subsystem.split("\\|\\|")[1].contains(newFeature.getModuleno())
													|| apply.getSubsystemno().contains(subsystem.split("\\|\\|")[0])) {
												newFeature.setSubsystemno(subsystem.split("\\|\\|")[0]);
											}
										} else {
											if (subsystem.contains(newFeature.getModuleno())
													|| apply.getSubsystemno().contains(subsystem)) {
												newFeature.setSubsystemno(subsystem);
											}
										}
									}
								} else {
									if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
										newFeature.setSubsystemno(apply.getSubsystemno());
									}
									if (BasicinfoConst.sbSubsystemMap
											.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
										newFeature.setSubsystemno(BasicinfoConst.sbSubsystemMap
												.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix)
												.toString());
									}
								}
							}
							if (BasicinfoConst.sbSubsystemMap
									.get(apply.getProcessCode() + BasicinfoConst.module_Prefix) != null) {
								newFeature.setModuleno(BasicinfoConst.sbSubsystemMap
										.get(apply.getProcessCode() + BasicinfoConst.module_Prefix).toString());
							}
							lst.add(newFeature);
							sbcodes.append(newFeature.getMdlvsnno() + ",");
							k++;
						}
					}
				}
			}
			moduleVersionService.insertSelectiveBatch(lst);
			// 批量添加操作日志
			Map<String, Object> para = new HashMap<>();
			para.put("code", sbcodes);
			para.put("type", "ADD");
			optLogModuleVersionUtils.LstOperateLog(bef, lst, para);
		} else {
			if (apply.getModuleno().contains(",")) {
				String[] subsystem1 = null;
				if (apply.getSubsystemno().contains(",")) {
					subsystem1 = productApplyService.getDataByColunm(param);
				}
				int i = 0;
				List<IBDS_ModuleVersion> bef = new ArrayList<>();
				List<IBDS_ModuleVersion> lst = new ArrayList<>();
				String code = moduleVersionService.getMaxCode();
				int newCode = Integer.parseInt(code.split("MV")[1]);
				for (String moduleno : apply.getModuleno().split(",")) {
					IBDS_ModuleVersion newFeature = new IBDS_ModuleVersion();
					newFeature.setMdlvsnno("MV" + df.format(newCode + i));
					newFeature.setMdlvsn(apply.getObjectname());
					newFeature.setEngmdlvsn(apply.getEngobject());
					newFeature.setStatus("1");
					newFeature.setCreatedDate(new Date());
					newFeature.setCreatedUser(apply.getCreateUser());
					newFeature.setPlipmtno(apply.getPlipmtno());
					newFeature.setProdlineno(apply.getProdlineno());
					newFeature.setProductno(apply.getProductno());
					newFeature.setVersionno(apply.getVersionno());
					newFeature.setReleaseno(apply.getReleaseno());
					newFeature.setReaders(BasicinfoConst.remarks);
					if (apply.getSubsystemno().contains("_")) {
						newFeature.setSubsystemno(apply.getSubsystemno().split("_")[0]);
					} else {
						newFeature.setSubsystemno(apply.getSubsystemno());
					}
					if (moduleno.contains("_")) {
						newFeature.setModuleno(moduleno.split("_")[0]);
					} else {
						newFeature.setModuleno(moduleno);
					}
					lst.add(newFeature);
					sbcodes.append(newFeature.getMdlvsnno() + ",");
					i++;
				}
				moduleVersionService.insertSelectiveBatch(lst);
				// 批量添加操作日志
				Map<String, Object> para = new HashMap<>();
				param.put("code", sbcodes);
				param.put("type", "ADD");
				optLogModuleVersionUtils.LstOperateLog(bef, lst, para);
			} else {

				IBDS_ModuleVersion mdlvsn = new IBDS_ModuleVersion();
				mdlvsn.setMdlvsnno(moduleVersionService.getMaxCode());
				mdlvsn.setMdlvsn(apply.getObjectname());
				mdlvsn.setEngmdlvsn(apply.getEngobject());
				mdlvsn.setStatus("1");
				mdlvsn.setCreatedDate(new Date());
				mdlvsn.setCreatedUser(apply.getCreateUser());
				mdlvsn.setPlipmtno(apply.getPlipmtno());
				mdlvsn.setProdlineno(apply.getProdlineno());
				mdlvsn.setProductno(apply.getProductno());
				mdlvsn.setVersionno(apply.getVersionno());
				mdlvsn.setReleaseno(apply.getReleaseno());
				mdlvsn.setReaders(BasicinfoConst.remarks);
				if (StringUtil.isNotEmpty(apply.getSubsystemno())) {
					if (apply.getSubsystemno().contains("_")) {
						mdlvsn.setSubsystemno(apply.getSubsystemno().split("_")[0]);
					} else {
						mdlvsn.setSubsystemno(apply.getSubsystemno());
					}
				} else {
					if (BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix) != null) {
						mdlvsn.setSubsystemno(BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.subsystem_Prefix).toString());
					}
				}
				if (StringUtil.isNotEmpty(apply.getModuleno())) {
					if (apply.getModuleno().contains("_")) {
						mdlvsn.setModuleno(apply.getModuleno().split("_")[0]);
					} else {
						mdlvsn.setModuleno(apply.getModuleno());
					}
				} else {
					if (BasicinfoConst.sbSubsystemMap
							.get(apply.getProcessCode() + BasicinfoConst.module_Prefix) != null) {
						mdlvsn.setModuleno(BasicinfoConst.sbSubsystemMap
								.get(apply.getProcessCode() + BasicinfoConst.module_Prefix).toString());
					}
				}
				moduleVersionService.create(mdlvsn);
				// 添加操作日志
				optLogModuleVersionUtils.RecordOpearteLog(null, mdlvsn, mdlvsn.getMdlvsnno());

			}

		}
	}

	/**
	 * 修改模块版本 入库处理
	 * 
	 * @param apply
	 */
	public void editModuleVersion(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			// 批量
			StringBuilder lstStr = new StringBuilder();
			List<IBDS_ModuleVersion> lst1 = new ArrayList<>();
			String[] ff1 = apply.getObjectno().split("\r\n");
			for (int i = 0; i < ff1.length; i++) {
				IBDS_ModuleVersion sbd = new IBDS_ModuleVersion();
				if (ff1[i].contains("_")) {
					sbd.setId(Integer.valueOf(ff1[i].split("_")[1]));
					// sbd.setMdlvsnno(ff1[i].split("_")[0]);
				} else {
					throw new FlowableException("修改模块版本内码不能为空,请联系管理员!!!");
				}
				sbd.setMdlvsn(apply.getObjectname().split("\r")[i]);
				sbd.setEngmdlvsn(apply.getEngobject().split("\r")[i]);
				lst1.add(sbd);
				lstStr.append(ff1[i].split("_")[0] + ",");
			}

			// 查询更新之前的数据
			Map<String, Object> parMap = new HashMap<>();
			parMap.put("codes", lstStr.toString());
			List<IBDS_ModuleVersion> bef = moduleversionMapper.selectModuleVerisonbyCodes(parMap);
			moduleVersionService.updateByBatch(lst1);

			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogModuleVersionUtils.LstOperateLog(bef, lst1, param);

		} else {
			// 单个
			IBDS_ModuleVersion mdlvsn = new IBDS_ModuleVersion();
			if (apply.getObjectno().contains("_")) {
				mdlvsn.setId(Integer.valueOf(apply.getObjectno().split("_")[1]));
				mdlvsn.setMdlvsnno(apply.getObjectno().split("_")[0]);
			} else {
				throw new FlowableException("修改模块版本内码不能为空,请联系管理员!!!");
			}
			mdlvsn.setMdlvsn(apply.getObjectname());
			mdlvsn.setEngmdlvsn(apply.getEngobject());
			mdlvsn.setModifyData(new Date());
			mdlvsn.setModifyUser(apply.getCreateUser());
			IBDS_ModuleVersion bfe = colunmConfigService.selectByPrimaryKey(mdlvsn.getId(), mdlvsn.getMdlvsnno());
			moduleVersionService.update(mdlvsn);
			// 添加操作日志
			optLogModuleVersionUtils.RecordOpearteLog(bfe, mdlvsn, mdlvsn.getMdlvsnno());

		}
	}

	/**
	 * 停用模块版本 入库处理
	 * 
	 * @param apply
	 */
	public void delModuleVersion(IBDS_BaseObject_Apply apply) {
		if (apply.getObjectno().contains("\r")) {
			StringBuilder sb = new StringBuilder();
			StringBuilder sbCode = new StringBuilder();
			for (String itemno : apply.getObjectno().split("\r\n")) {
				if (itemno.contains("_")) {
					sb.append(itemno.split("_")[1] + "\r");
					sbCode.append(itemno.split("_")[0] + "\r");
				}
			}
			delProductBatch(apply, "id", sb.toString(), "MV");
			// 停用模块版本 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", sbCode.toString().replace("\r", ","));
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
			// 批量停用特性下层级 **
		} else {
			delProduct(apply, "id", apply.getObjectno().split("_")[1], "MV");
			// 停用模块版本 添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", apply.getObjectno().split("_")[0]);
			param.put("users", apply.getCreateUser());
			baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
		}
	}
	// --------------------------模块版本入库处理结束----------------------------------

	/**
	 * 更新产品相关表
	 */
	@Transactional
	@Override
	public void synchronizeChange(IBDS_BaseObject_PROCESSExt process) {

		// 基线版本 入库处理
		List<IBDS_BaseLine_Apply> applys = process.getBaseLines();
		if (!CollectionUtils.isEmpty(applys)) {
			for (IBDS_BaseLine_Apply apply : applys) {
				if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
					addBaseLine(apply);
				} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
					editBaseLine(apply);
				} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
					// 停用该产品会停用该产品以下级别的信息：包括软件版本
					delBaseLine(apply);
				}

			}
		}

		// 特性及特性以下产品处理
		List<List<IBDS_BaseObject_Apply>> lstapplysObject = process.getBaseObjects();
		if (lstapplysObject.size() > 0) {
			for (List<IBDS_BaseObject_Apply> applysObject : lstapplysObject) {
				if (!CollectionUtils.isEmpty(applysObject)) {
					for (IBDS_BaseObject_Apply apply : applysObject) {
						// 特性
						if (apply.getType().equals("1")) {
							if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
								// 新增特性
								addFeature(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
								// 修改
								editFeature(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
								// 停用 产品 停用该产品会停用该产品以下级别的信息：包括特性、子特性
								delFeature(apply);
							}
							// 子特性
						} else if (apply.getType().equals("2")) {
							if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
								// 新增 子特性
								addsubFeature(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
								// 修改 子特性
								editsubFeature(apply);

							} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
								// 停用 产品
								// 停用该产品会停用该产品以下级别的信息：包括子特性
								delsubFeature(apply);
							}
						} else if (apply.getType().equals("3")) {
							if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
								// 新增项目组
								addTeam(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
								// 修改项目组
								editTeam(apply);

							} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
								// 停用 产品
								// 停用该产品会停用该产品以下级别的信息：包括软件版本、项目组
								delTeam(apply);
							}
						} else if (apply.getType().equals("4")) {
							if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
								// 新增子系统
								addsubSystem(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
								// 修改子系统
								editsubSystem(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
								// 停用 产品
								// 停用该产品会停用该产品以下级别的信息：包括子系统、模块、模块版本
								delsubSystem(apply);
							}
							// 模块
						} else if (apply.getType().equals("5")) {
							if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
								// 新增
								addModule(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
								// 修改
								editModule(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
								// 停用 产品
								// 停用该产品会停用该产品以下级别的信息：包括模块、模块版本
								delModule(apply);
							}
						} else if (apply.getType().equals("6")) {
							if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
								// 新增模块版本
								addModuleVersion(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
								// 修改模块版本
								editModuleVersion(apply);
							} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
								// 停用 产品
								// 停用该产品会停用该产品以下级别的信息：包括模块版本
								delModuleVersion(apply);
							}
						}

					}
				}
			}
		}

	}

	/**
	 * 状态删除R级以下子级产品 （项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param baseApply
	 * @param column
	 *            列
	 * @param code
	 *            产品编码
	 * @param type
	 *            类型
	 */
	public void delProduct(IBDS_BaseObject_Apply baseApply, String column, String code, String type) {

		Map<String, Object> param = new HashMap<>();

		// 特性
		if (type.equals("FT")) {
			param.put("tabName", "IBDS_FEATRUE");
			param.put("column", column);
			if (code.contains("\r")) {
				code = code.replace("\r", "");
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			} else {
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			}
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}

		// 子特性
		if (type.equals("SF")) {
			param.clear();
			param.put("tabName", "IBDS_SUB_FEATRUE");
			param.put("column", column);
			if (code.contains("\r")) {
				code = code.replace("\r", "");
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			} else {
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			}
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}
		// 项目组
		if (type.equals("TM")) {
			param.clear();
			param.put("tabName", "IBDS_Team");
			param.put("column", column);
			if (code.contains("\r")) {
				code = code.replace("\r", "");
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			} else {
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			}
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}
		// 子系统
		if (type.equals("SS")) {
			param.clear();
			param.put("tabName", "IBDS_SUB_SYSTEM");
			param.put("column", column);
			if (code.contains("\r")) {
				code = code.replace("\r", "");
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			} else {
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			}
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}
		// 模块
		if (type.equals("MD")) {
			param.clear();
			param.put("tabName", "IBDS_Module");
			param.put("column", column);
			if (code.contains("\r")) {
				code = code.replace("\r", "");
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			} else {
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			}
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}
		// 模块版本
		if (type.equals("MV")) {
			param.clear();
			param.put("tabName", "IBDS_MODULE_VERSION");
			param.put("column", column);
			if (code.contains("\r")) {
				code = code.replace("\r", "");
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			} else {
				if (column.equals("id")) {
					param.put("code", Integer.valueOf(code));
				} else {
					param.put("code", code);
				}
			}
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateVRChildren(param);
		}
	}

	/**
	 * 状态批量删除R级以下子级产品 （项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param baseApply
	 * @param column
	 *            列
	 * @param code
	 *            产品编码
	 * @param type
	 *            类型
	 */
	public void delProductBatch(IBDS_BaseObject_Apply baseApply, String column, String code, String type) {

		Map<String, Object> param = new HashMap<>();

		// 特性
		if (type.equals("FT")) {
			param.put("tabName", "IBDS_FEATRUE");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateChildrenBatch(param);
		}

		// 子特性
		if (type.equals("SF")) {
			param.clear();
			param.put("tabName", "IBDS_SUB_FEATRUE");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateChildrenBatch(param);
		}
		// 项目组
		if (type.equals("TM")) {
			param.clear();
			param.put("tabName", "IBDS_Team");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateChildrenBatch(param);
		}
		// 子系统
		if (type.equals("SS")) {
			param.clear();
			param.put("tabName", "IBDS_SUB_SYSTEM");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateChildrenBatch(param);
		}
		// 模块
		if (type.equals("MD")) {
			param.clear();
			param.put("tabName", "IBDS_Module");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateChildrenBatch(param);
		}
		// 模块版本
		if (type.equals("MV")) {
			param.clear();
			param.put("tabName", "IBDS_MODULE_VERSION");
			param.put("column", column);
			param.put("code", code);
			param.put("modifyUser", baseApply.getCreateUser());
			param.put("modifyTime", new Date());
			productApplyService.updateChildrenBatch(param);
		}
	}

	/**
	 * 状态删除R级以下子级产品 （版本以下、项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param baseApply
	 * @param column
	 *            列
	 * @param code
	 *            产品编码
	 */
	public void delProduct(IBDS_BaseLine_Apply baseApply, String column, String code) {

		Map<String, Object> param = new HashMap<>();

		// 基线版本
		param.put("tabName", "IBDS_Base_Line");
		param.put("column", column);
		if (code.contains("\r")) {
			code = code.replace("\r", "");
			param.put("code", Integer.valueOf(code));
		} else {
			param.put("code", Integer.valueOf(code));
		}
		param.put("modifyUser", baseApply.getCreateUser());
		param.put("modifyTime", new Date());
		productApplyService.updateVRChildren(param);

		// 特性
		/*
		 * param.clear(); param.put("tabName", "IBDS_FEATRUE");
		 * param.put("column",column); featureService.selectByCode(code);
		 * param.put("code",code); param.put("modifyUser", baseApply.getCreateUser());
		 * param.put("modifyTime", new Date());
		 * productApplyService.updateVRChildren(param);
		 */

		// 子特性
		/*
		 * param.clear(); param.put("tabName", "IBDS_SUB_FEATRUE");
		 * param.put("column",column); if(code.contains("_")) { param.put("id",
		 * code.split("_")[1]); }else { throw new
		 * FlowableException("停用下层子特性主键不能为空,请联系管理员！"); } param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateVRChildren(param);
		 */
		// 项目组

		/*
		 * param.clear(); param.put("tabName", "IBDS_Team"); param.put("column",column);
		 * if(code.contains("_")) { param.put("id", code.split("_")[1]); }else { throw
		 * new FlowableException("停用下层项目组主键不能为空,请联系管理员！"); } param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateVRChildren(param);
		 */

		// 子系统

		/*
		 * param.clear(); param.put("tabName", "IBDS_SUB_SYSTEM");
		 * param.put("column",column); if(code.contains("_")) { param.put("id",
		 * code.split("_")[1]); }else { throw new
		 * FlowableException("停用下层子系统主键不能为空,请联系管理员！"); } param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateVRChildren(param);
		 */

		// 模块

		/*
		 * param.clear(); param.put("tabName", "IBDS_Module");
		 * param.put("column",column); if(code.contains("_")) { param.put("id",
		 * code.split("_")[1]); }else { throw new
		 * FlowableException("停用下层模块主键不能为空,请联系管理员！"); } param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateVRChildren(param);
		 */

		// 模块版本

		/*
		 * param.clear(); param.put("tabName", "IBDS_MODULE_VERSION");
		 * param.put("column",column); if(code.contains("_")) { param.put("id",
		 * code.split("_")[1]); }else { throw new
		 * FlowableException("停用下层模块版本主键不能为空,请联系管理员！"); } param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateVRChildren(param);
		 */

	}

	/**
	 * 状态删除R级以下子级产品 （版本以下、项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param baseApply
	 * @param column
	 *            列
	 * @param code
	 *            产品编码
	 */
	public void delProductBatch(IBDS_BaseLine_Apply baseApply, String column, String code) {

		Map<String, Object> param = new HashMap<>();

		// 基线版本
		param.put("tabName", "IBDS_Base_Line");
		param.put("column", column);
		if (code.contains("_")) {
			param.put("code", code.split("_")[1]);
		} else {
			param.put("code", code);
			// throw new FlowableException("停用下层软件版本主键不能为空,请联系管理员！");
		}
		param.put("modifyUser", baseApply.getCreateUser());
		param.put("modifyTime", new Date());
		productApplyService.updateChildrenBatch(param);

		/*
		 * //特性 param.clear(); param.put("tabName", "IBDS_FEATRUE");
		 * param.put("column",column); param.put("code", code); param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateChildrenBatch(param);
		 * 
		 * 
		 * //子特性 param.clear(); param.put("tabName", "IBDS_SUB_FEATRUE");
		 * param.put("column",column); param.put("code", code); param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateChildrenBatch(param);
		 * 
		 * //项目组
		 * 
		 * param.clear(); param.put("tabName", "IBDS_Team"); param.put("column",column);
		 * param.put("code", code); param.put("modifyUser", baseApply.getCreateUser());
		 * param.put("modifyTime", new Date());
		 * productApplyService.updateChildrenBatch(param);
		 * 
		 * //子系统
		 * 
		 * param.clear(); param.put("tabName", "IBDS_SUB_SYSTEM");
		 * param.put("column",column); param.put("code", code); param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateChildrenBatch(param);
		 * 
		 * //模块
		 * 
		 * param.clear(); param.put("tabName", "IBDS_Module");
		 * param.put("column",column); param.put("code", code); param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateChildrenBatch(param);
		 * 
		 * //模块版本
		 * 
		 * param.clear(); param.put("tabName", "IBDS_MODULE_VERSION");
		 * param.put("column",column); param.put("code", code); param.put("modifyUser",
		 * baseApply.getCreateUser()); param.put("modifyTime", new Date());
		 * productApplyService.updateChildrenBatch(param);
		 */

	}

	/**
	 * 查询流程数据
	 * 
	 * @param example
	 * @return
	 */
	public List<IBDS_BaseObject_PROCESS> selectByExample(String code) {
		IBDS_BaseObject_PROCESSExample example = new IBDS_BaseObject_PROCESSExample();
		Criteria criteria = example.createCriteria();
		criteria.andApplycodeEqualTo(code);
		return baseObjectProcessMapper.selectByExample(example);
	}
}
