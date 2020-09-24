package com.h3c.mds.basicinfo.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_BaseObject_PROCESSMapper;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExt;
import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESSExt;
import com.h3c.mds.basicinfo.entity.view_VRProcess;
import com.h3c.mds.basicinfo.service.BaseLineApplyService;
import com.h3c.mds.basicinfo.service.BaseObjectApplyService;
import com.h3c.mds.basicinfo.service.BaseObjectProcessService;
import com.h3c.mds.basicinfo.service.ProductApplyService;
import com.h3c.mds.basicinfo.service.ProductProcessService;
import com.h3c.mds.basicinfo.service.view_VRProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.FeatureView;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.ModuleVersionView;
import com.h3c.mds.product.entity.ModuleView;
import com.h3c.mds.product.entity.SubFeatureView;
import com.h3c.mds.product.entity.SubSystemView;
import com.h3c.mds.product.entity.TeamView;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.IBDS_BaseLineService;
import com.h3c.mds.product.service.IBDS_FeatureService;
import com.h3c.mds.product.service.IBDS_PDTService;
import com.h3c.mds.product.service.IBDS_PLIPMTService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.IBDS_SubFeatureService;
import com.h3c.mds.product.service.IBDS_TeamService;
import com.h3c.mds.product.service.ModuleVersionViewService;
import com.h3c.mds.product.service.ModuleViewService;
import com.h3c.mds.product.service.SubSystemViewService;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroupExample;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMember;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.NotesGroupService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.excel.ParseExcelUtil;
import com.h3c.mds.utils.map.MapUtils;

@Controller
@RequestMapping("/basicinfo")
public class PrBelowApplyController {

	private static final Logger logger = LoggerFactory.getLogger(PrBelowApplyController.class);

	@Autowired
	private BaseObjectProcessService baseObjectprocessService;

	@Autowired
	private BaseObjectApplyService baseObjectApplyService;

	@Autowired
	private BaseLineApplyService baseLineApplyService;

	@Autowired
	private ProductProcessService productProcessService;

	@Autowired
	private ProductApplyService productApplyService;

	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;

	@Autowired
	private IBDS_PLIPMTService ipmtService;

	@Autowired
	private UserService userService;

	@Autowired
	private NotesGroupService notesGroupService;

	@Autowired
	private IBDS_BaseLineService ibdsBaseLineService;

	@Autowired
	private IBDS_ReleaseService releaseService;

	@Autowired
	private IBDS_PDTService pdtService;
	@Autowired
	private IBDS_BaseLineService ibdsBaselineService;

	@Autowired
	private IBDS_FeatureService ibdsFeatureService;

	@Autowired
	private IBDS_SubFeatureService ibdsSubFeatureService;

	@Autowired
	private IBDS_TeamService ibdsTeamService;

	@Autowired
	private SubSystemViewService ibdsSubSystemService;

	@Autowired
	private ModuleViewService ibdsModuleService;

	@Autowired
	private ModuleVersionViewService ibdsModuleVersionService;

	@Autowired
	private ProcessLogService processLogService;

	@Autowired
	private MailInfoService mailInfoService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private view_VRProcessService viewVRService;

	private String PATH;

	@Autowired
	private DicService dicService;

	@Autowired
	private EipService eipService;

	@Autowired
	private IBDS_BaseObject_PROCESSMapper baseObjectprocessMapper;

	@Autowired
	private RuntimeService runtimeService;

	@Value("${sso.main.url}")
	private String siteMainUrl;

	@Value("${file.path}")
	private String filePath;

	@PostConstruct
	public void intiPath() {
		String seperator = File.separator;
		PATH = filePath + "uploadFile" + seperator + "prBelow" + seperator;
	}

	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("/prBelowApply/add")
	@ResponseBody
	public ModelAndView getByLineNo(Integer selId, String applyType) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("showStatus", "add");
		mv.addObject("currentNode", "editable");
		IBDS_BaseObject_PROCESSExt process = new IBDS_BaseObject_PROCESSExt();
		process.setStatusname("CMO提出修改申请");
		process.setResponsible((String) SecurityUtils.getSubject().getPrincipal());
		mv.addObject("entity", process);
		mv.addObject("editbaselineNo", "");
		mv.addObject("delbaselineNo", "");
		mv.addObject("editfeatureNo", "");
		mv.addObject("delfeatureNo", "");
		mv.addObject("editsubfeatureNo", "");
		mv.addObject("delsubfeatureNo", "");
		mv.addObject("editteamNo", "");
		mv.addObject("delteamNo", "");
		mv.addObject("editsubSystemNo", "");
		mv.addObject("delsubSystemNo", "");
		mv.addObject("editModuleNo", "");
		mv.addObject("delModuleNo", "");
		mv.addObject("editModuleVersionNo", "");
		mv.addObject("delModuleVersionNo", "");

		// 新增下拉框数据继承
		if (StringUtil.isNotEmpty(applyType) && applyType.contains(BasicinfoConst.PRODUCT_APPLYTYPE_PT)) {// 产品

			IBDS_Product_PROCESSExt processProduct = new IBDS_Product_PROCESSExt();
			if (selId != null) {
				processProduct = productProcessService.getByProductId(selId);
			}
			if (processProduct.getApplys().size() > 0) {
				IBDS_Product_Apply apply = new IBDS_Product_Apply();
				apply = processProduct.getApplys().get(0);
				mv.addObject("apply", apply);
			}
		} else if (StringUtil.isNotEmpty(applyType) && applyType.contains(BasicinfoConst.PRODUCT_APPLYTYPE_PR)) {// R级以下
			// 基线
			/*
			 * IBDS_BaseLine_Apply baseApply = new IBDS_BaseLine_Apply(); if (selId != null)
			 * { IBDS_BaseObject_PROCESS processId=baseObjectprocessService.getById(selId);
			 * if(processId!=null) {
			 * 
			 * } baseApply = baseLineApplyService.selectByPrimaryKey(selId); } if (baseApply
			 * != null) { mv.addObject("apply", baseApply); } else { // 基线以下
			 * IBDS_BaseObject_Apply apply = new IBDS_BaseObject_Apply(); if (selId != null)
			 * { apply = baseObjectApplyService.selectByPrimaryKey(selId); }
			 * mv.addObject("apply", apply); }
			 */

			IBDS_BaseObject_PROCESSExt processData = new IBDS_BaseObject_PROCESSExt();
			IBDS_BaseLine_Apply baseApply = new IBDS_BaseLine_Apply();
			IBDS_BaseObject_Apply apply = new IBDS_BaseObject_Apply();
			if (selId != null) {
				processData = baseObjectprocessService.getByProductId(selId);
			}
			if (processData.getBaseLines().size() > 0) {
				baseApply = processData.getBaseLines().get(0);
				mv.addObject("apply", baseApply);
			} else {
				if (processData.getBaseObjects().size() > 0) {
					for (List<IBDS_BaseObject_Apply> applys : processData.getBaseObjects()) {
						if (applys != null && applys.size() > 0) {
							apply.setPlipmtno(applys.get(0).getPlipmtno());
							apply.setProdlineno(applys.get(0).getProdlineno());
							apply.setProductno(applys.get(0).getProductno());
							apply.setVersionno(applys.get(0).getVersionno());
							apply.setReleaseno(applys.get(0).getReleaseno());
							break;
						}
					}
				}
				mv.addObject("apply", apply);
			}

		} else if (StringUtil.isNotEmpty(applyType) && applyType.contains(BasicinfoConst.PRODUCT_APPLYTYPE_VR)) {// VR
			view_VRProcess apply = new view_VRProcess();
			if (selId != null) {
				apply = viewVRService.getByID(selId);
			}
			mv.addObject("apply", apply);
		} else {
			mv.addObject("apply", null);
		}

		mv.setViewName("basicinfo/prBelowApply/add");
		return mv;
	}

	/**
	 * 判断是否为管理员
	 * 
	 * @return
	 */
	public Boolean getsysAdmin() {
		// 获取当前用户角色
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		if (roleCode.contains("R_000001")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取跳转页面标题
	 * 
	 * @param tag
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/getTitle", method = RequestMethod.POST)
	@ResponseBody
	public String getTitle(String tag) {
		String title = MapUtils.titleMap.get(tag.toUpperCase());
		return title;
	}

	@RequestMapping(value = "/prBelowApply/getBaseLineInfo/{code}", method = RequestMethod.POST)
	@ResponseBody
	public List<BaseLineView> getBaseLineInfo(@PathVariable String code) {
		Map<String, Object> param = new HashMap<>();
		String[] codes;
		StringBuilder sbCode = new StringBuilder();
		Integer subids;
		if (code.contains(",")) {
			codes = code.split(",");
			for (String ids : codes) {
				if (ids.contains("_")) {
					subids = Integer.valueOf(ids.split("_")[1] != null ? ids.split("_")[1] : "0");
					sbCode.append(subids.toString() + ",");
				}
			}

		} else {
			sbCode.append((code.contains("_") ? code.split("_")[1] : 0) + ",");
		}
		param.put("ids", sbCode.toString().split(","));
		param.put("status", "1");
		param.put("column", "id");
		return ibdsBaseLineService.getDataByColunm(param);
	}

	/**
	 * 从已有路标版本引入特性、子特性
	 * 
	 * @param tag
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/getFeature", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> getFeatureInfo(String code) {
		Map<String, String> searchMap = new HashMap<>();
		/*
		 * String[] codes=null; if(code.contains(",")) { codes=code.split(","); }
		 */
		searchMap.put("id", code);
		searchMap.put("codes", code);
		searchMap.put("type", "PR");
		searchMap.put("searchParas", "");
		searchMap.put("projectStatus", "");
		List<FeatureView> lst = ibdsFeatureService.getTreeData(searchMap);
		searchMap.clear();
		StringBuilder sb = new StringBuilder();
		for (FeatureView featureView : lst) {
			sb.append(featureView.getFeatureno() + ";");
		}
		searchMap.put("codes", sb.toString());
		searchMap.put("type", "SF");
		List<SubFeatureView> lstSub = ibdsSubFeatureService.getTreeData(searchMap);
		StringBuilder sbNo = new StringBuilder();
		StringBuilder sbName = new StringBuilder();
		StringBuilder sbEng = new StringBuilder();
		int tg = 1;
		for (FeatureView featureView : lst) {
			sbNo.append((featureView.getFeatureno() == null ? "" : featureView.getFeatureno())
					+ (lst.size() == tg ? "" : "\r"));
			sbName.append((featureView.getFeature() == null ? "" : featureView.getFeature())
					+ (lst.size() == tg ? "" : "\r"));
			sbEng.append((featureView.getEngfeature() == null ? "" : featureView.getEngfeature())
					+ (lst.size() == tg ? "" : "\r"));
			tg++;
		}
		Map<String, String> map = new HashMap<>();
		map.put("featureno", sbNo.toString());
		map.put("feature", sbName.toString());
		map.put("engfeature", sbEng.toString());
		// 清空
		sbNo.delete(0, sbNo.length());
		sbName.delete(0, sbName.length());
		sbEng.delete(0, sbEng.length());
		// 子特性
		int s = 1;
		for (String subTag : sb.toString().split(";")) {
			int k = 1;
			for (SubFeatureView featureView : lstSub) {
				if (subTag.equals(featureView.getFeatureno())) {
					sbNo.append((featureView.getSubfeatureno() == null ? "" : featureView.getSubfeatureno())
							+ (lstSub.size() == k ? "" : "\r"));
					sbName.append((featureView.getSubfeature() == null ? "" : featureView.getSubfeature())
							+ (lstSub.size() == k ? "" : "\r"));
					sbEng.append((featureView.getEngsubfeature() == null ? "" : featureView.getEngsubfeature())
							+ (lstSub.size() == k ? "" : "\r"));
				}
				k++;
			}
			if (lstSub.size() > 0 && s < sb.toString().split(";").length) {
				sbNo.append("*" + "\r");
				sbName.append("*" + "\r");
				sbEng.append("*" + "\r");
			}
			s++;
		}
		map.put("subfeatureno", sbNo.toString());
		map.put("subfeature", sbName.toString());
		map.put("subengfeature", sbEng.toString());

		return map;
	}

	/**
	 * 从已有路标版本引入子系统、模块
	 * 
	 * @param tag
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/getSystem", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> getSystemInfo(String code) {
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", code);
		searchMap.put("codes", code);
		searchMap.put("type", "PR");
		searchMap.put("searchParas", "");
		searchMap.put("projectStatus", "");

		StringBuilder sb = new StringBuilder();
		StringBuilder sbNo = new StringBuilder();
		StringBuilder sbName = new StringBuilder();
		StringBuilder sbEng = new StringBuilder();

		List<SubSystemView> lstSub = ibdsSubSystemService.getDataList(searchMap);
		int tg = 1;
		for (SubSystemView subSystemView : lstSub) {
			sb.append(subSystemView.getSubsystemno() + ";");
			sbNo.append((subSystemView.getSubsystemno() == null ? "" : subSystemView.getSubsystemno())
					+ (lstSub.size() == tg ? "" : "\r"));
			sbName.append((subSystemView.getSubsystem() == null ? "" : subSystemView.getSubsystem())
					+ (lstSub.size() == tg ? "" : "\r"));
			sbEng.append((subSystemView.getEngsubsystem() == null ? "" : subSystemView.getEngsubsystem())
					+ (lstSub.size() == tg ? "" : "\r"));
			tg++;
		}

		searchMap.clear();
		searchMap.put("codes", sb.toString());
		searchMap.put("type", "SS");

		List<ModuleView> lstModule = ibdsModuleService.getDataList(searchMap);

		Map<String, String> map = new HashMap<>();
		map.put("subsystemno", sbNo.toString());
		map.put("subsystem", sbName.toString());
		map.put("engsubsystem", sbEng.toString());
		// 清空
		sbNo.delete(0, sbNo.length());
		sbName.delete(0, sbName.length());
		sbEng.delete(0, sbEng.length());

		int s = 1;
		for (String subSystemno : sb.toString().split(";")) {
			int k = 1;
			for (ModuleView moduleView : lstModule) {
				if (subSystemno.equals(moduleView.getSubsystemno())) {
					sbNo.append((moduleView.getModuleno() == null ? "" : moduleView.getModuleno())
							+ (lstModule.size() <= k ? "" : "\r"));
					sbName.append((moduleView.getModule() == null ? "" : moduleView.getModule())
							+ (lstModule.size() <= k ? "" : "\r"));
					sbEng.append((moduleView.getEngmodule() == null ? "" : moduleView.getEngmodule())
							+ (lstModule.size() <= k ? "" : "\r"));
				}
				k++;
			}
			if (lstSub.size() > 0 && s < sb.toString().split(";").length) {
				sbNo.append("*" + "\r");
				sbName.append("*" + "\r");
				sbEng.append("*" + "\r");
			}
			s++;
		}

		map.put("moduleno", sbNo.toString());
		map.put("module", sbName.toString());
		map.put("engmodule", sbEng.toString());

		return map;
	}

	/**
	 * 继承现有版本
	 * 
	 * @param tag
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/getShowData", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> getShowData(String code, String tag) {
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", code);
		searchMap.put("type", "PR");
		searchMap.put("searchParas", "");
		searchMap.put("projectStatus", "");
		StringBuilder sbNo = new StringBuilder();
		StringBuilder sbName = new StringBuilder();
		StringBuilder sbEng = new StringBuilder();
		StringBuilder sbOutName = new StringBuilder();

		StringBuilder sbOutEng = new StringBuilder();
		StringBuilder sbParentName = new StringBuilder();
		StringBuilder sbBaseline1 = new StringBuilder();
		StringBuilder sbParentNo = new StringBuilder();
		StringBuilder sbBaseline1No = new StringBuilder();
		Map<String, String> map = new HashMap<>();
		if (tag.equals("bl")) {
			List<BaseLineView> lst = ibdsBaseLineService.getTreeData(searchMap);
			int s = 1;
			for (BaseLineView baseLineView : lst) {
				sbNo.append((baseLineView.getBaselineno() == null ? "" : baseLineView.getBaselineno())
						+ (lst.size() == s ? "" : "\r"));
				sbName.append((baseLineView.getBaseline() == null ? "" : baseLineView.getBaseline())
						+ (lst.size() == s ? "" : "\r"));
				sbEng.append((baseLineView.getEngbaseline() == null ? "" : baseLineView.getEngbaseline())
						+ (lst.size() == s ? "" : "\r"));
				sbOutName.append((baseLineView.getBaselineout() == null ? "" : baseLineView.getBaselineout())
						+ (lst.size() == s ? "" : "\r"));
				sbOutEng.append((baseLineView.getEngbaselineout() == null ? "" : baseLineView.getEngbaselineout())
						+ (lst.size() == s ? "" : "\r"));
				sbParentName.append((baseLineView.getParentitem() == null ? "" : baseLineView.getParentitem())
						+ (lst.size() == s ? "" : "\r"));
				sbBaseline1.append((baseLineView.getBaseline1name() == null ? "" : baseLineView.getBaseline1name())
						+ (lst.size() == s ? "" : "\r"));
				sbParentNo.append((baseLineView.getParentitemno() == null ? "" : baseLineView.getParentitemno())
						+ (lst.size() == s ? "" : "\r"));
				sbBaseline1No.append((baseLineView.getBaseline1() == null ? "" : baseLineView.getBaseline1())
						+ (lst.size() == s ? "" : "\r"));
				s++;
			}
			map.put("baselineno", sbNo.toString());
			map.put("baseline", sbName.toString());
			map.put("engbaseline", sbEng.toString());
			map.put("baselineout", sbOutName.toString());
			map.put("engbaselineout", sbOutEng.toString());
			map.put("baseline1No", sbBaseline1No.toString());
			map.put("parentitemNo", sbParentNo.toString());
			map.put("baseline1Name", sbBaseline1.toString());
			map.put("parentitemName", sbParentName.toString());
		} else if (tag.equals("ft")) {
			List<FeatureView> lst = ibdsFeatureService.getTreeData(searchMap);
			int s = 1;
			for (FeatureView featureView : lst) {
				sbNo.append((featureView.getFeatureno() == null ? "" : featureView.getFeatureno())
						+ (lst.size() == s ? "" : "\r"));
				sbName.append((featureView.getFeature() == null ? "" : featureView.getFeature())
						+ (lst.size() == s ? "" : "\r"));
				sbEng.append((featureView.getEngfeature() == null ? "" : featureView.getEngfeature())
						+ (lst.size() == s ? "" : "\r"));
				s++;
			}
			map.put("featureno", sbNo.toString());
			map.put("feature", sbName.toString());
			map.put("engfeature", sbEng.toString());
		} else if (tag.equals("sf")) {
			List<FeatureView> lst = ibdsFeatureService.getTreeData(searchMap);
			searchMap.clear();
			StringBuilder sb = new StringBuilder();
			for (FeatureView featureView : lst) {
				sb.append(featureView.getFeatureno() + ";");
			}
			searchMap.put("codes", sb.toString());
			searchMap.put("type", "SF");
			List<SubFeatureView> lstSub = ibdsSubFeatureService.getTreeData(searchMap);
			int s = 0;
			for (String subTag : sb.toString().split(";")) {

				int k = 1;
				for (SubFeatureView featureView : lstSub) {
					if (subTag.equals(featureView.getFeatureno())) {
						// 去掉最后一个空行
						if (s == sb.toString().split(";").length - 1
								&& featureView.getFeatureno().equals(sb.toString().split(";")[s])) {
							sbNo.append((featureView.getSubfeatureno() == null ? "" : featureView.getSubfeatureno()));
							sbName.append((featureView.getSubfeature() == null ? "" : featureView.getSubfeature()));
							sbEng.append(
									(featureView.getEngsubfeature() == null ? "" : featureView.getEngsubfeature()));
						} else {
							sbNo.append((featureView.getSubfeatureno() == null ? "" : featureView.getSubfeatureno())
									+ "\r");
							sbName.append(
									(featureView.getSubfeature() == null ? "" : featureView.getSubfeature()) + "\r");
							sbEng.append((featureView.getEngsubfeature() == null ? "" : featureView.getEngsubfeature())
									+ "\r");
						}
						k++;
					}
				}
				if (lstSub.size() > 0 && s < sb.toString().split(";").length - 1 && 1 != k) {
					sbNo.append("*" + "\r");
					sbName.append("*" + "\r");
					sbEng.append("*" + "\r");
				}
				s++;
			}
			map.put("subfeatureno", sbNo.toString());
			map.put("subfeature", sbName.toString());
			map.put("subengfeature", sbEng.toString());
		} else if (tag.equals("ss")) {
			List<SubSystemView> lstSub = ibdsSubSystemService.getDataList(searchMap);
			int s = 1;
			for (SubSystemView subSystemView : lstSub) {
				sbNo.append((subSystemView.getSubsystemno() == null ? "" : subSystemView.getSubsystemno())
						+ (lstSub.size() == s ? "" : "\r"));
				sbName.append((subSystemView.getSubsystem() == null ? "" : subSystemView.getSubsystem())
						+ (lstSub.size() == s ? "" : "\r"));
				sbEng.append((subSystemView.getEngsubsystem() == null ? "" : subSystemView.getEngsubsystem())
						+ (lstSub.size() == s ? "" : "\r"));
				s++;
			}
			map.put("subsystemno", sbNo.toString());
			map.put("subsystem", sbName.toString());
			map.put("subengsystem", sbEng.toString());
		} else if (tag.equals("tm")) {
			List<TeamView> lstSub = ibdsTeamService.getTreeData(searchMap);
			int s = 1;
			for (TeamView teamView : lstSub) {
				sbNo.append(
						(teamView.getTeamno() == null ? "" : teamView.getTeamno()) + (lstSub.size() == s ? "" : "\r"));
				sbName.append(
						(teamView.getTeam() == null ? "" : teamView.getTeam()) + (lstSub.size() == s ? "" : "\r"));
				sbEng.append((teamView.getEngteam() == null ? "" : teamView.getEngteam())
						+ (lstSub.size() == s ? "" : "\r"));
				s++;
			}
			map.put("teamno", sbNo.toString());
			map.put("team", sbName.toString());
			map.put("engteam", sbEng.toString());
		} else if (tag.equals("md")) {
			List<SubSystemView> lst = ibdsSubSystemService.getDataList(searchMap);
			searchMap.clear();
			StringBuilder sb = new StringBuilder();
			for (SubSystemView subSystemView : lst) {
				sb.append(subSystemView.getSubsystemno() + ";");
			}
			searchMap.put("codes", sb.toString());
			searchMap.put("type", "SS");

			List<ModuleView> lstSub = ibdsModuleService.getDataList(searchMap);
			int s = 0;
			for (String subSystemno : sb.toString().split(";")) {
				int k = 1;
				for (ModuleView moduleView : lstSub) {

					if (subSystemno.equals(moduleView.getSubsystemno())) {
						// 去掉最后一个空行
						if (s == sb.toString().split(";").length - 1
								&& moduleView.getSubsystemno().equals(sb.toString().split(";")[s])) {
							sbNo.append((moduleView.getModuleno() == null ? "" : moduleView.getModuleno()));
							sbName.append((moduleView.getModule() == null ? "" : moduleView.getModule()));
							sbEng.append((moduleView.getEngmodule() == null ? "" : moduleView.getEngmodule()));
						} else {
							sbNo.append((moduleView.getModuleno() == null ? "" : moduleView.getModuleno()) + "\r");
							sbName.append((moduleView.getModule() == null ? "" : moduleView.getModule()) + "\r");
							sbEng.append((moduleView.getEngmodule() == null ? "" : moduleView.getEngmodule()) + "\r");
						}
						k++;
					}

				}
				if (lstSub.size() > 0 && s < sb.toString().split(";").length - 1 && 1 != k) {
					sbNo.append("*" + "\r");
					sbName.append("*" + "\r");
					sbEng.append("*" + "\r");
				}
				s++;
			}

			map.put("moduleno", sbNo.toString());
			map.put("module", sbName.toString());
			map.put("engmodule", sbEng.toString());
		} else if (tag.equals("mv")) {
			List<SubSystemView> lstSystem = ibdsSubSystemService.getDataList(searchMap);
			searchMap.clear();
			StringBuilder sb = new StringBuilder();
			for (SubSystemView subSystemView : lstSystem) {
				sb.append(subSystemView.getSubsystemno() + ";");
			}
			searchMap.put("codes", sb.toString());
			searchMap.put("type", "SS");

			List<ModuleView> lst = ibdsModuleService.getDataList(searchMap);
			searchMap.clear();
			StringBuilder sbMd = new StringBuilder();
			for (ModuleView moduleView : lst) {
				sbMd.append(moduleView.getModuleno() + ";");
			}
			searchMap.put("codes", sbMd.toString());
			searchMap.put("type", "MD");

			List<ModuleVersionView> lstSub = ibdsModuleVersionService.getDataList(searchMap);
			int s = 0;
			for (String moduleno : sbMd.toString().split(";")) {
				int k = 1;
				for (ModuleVersionView moduleVersionView : lstSub) {
					if (moduleno.equals(moduleVersionView.getModuleno())) {
						// 去掉最后一个空行
						if (s == sbMd.toString().split(";").length - 1
								&& moduleVersionView.getModuleno().equals(sbMd.toString().split(";")[s])) {
							sbNo.append(
									(moduleVersionView.getMdlvsnno() == null ? "" : moduleVersionView.getMdlvsnno()));
							sbName.append((moduleVersionView.getMdlvsn() == null ? "" : moduleVersionView.getMdlvsn()));
							sbEng.append(
									(moduleVersionView.getEngmdlvsn() == null ? "" : moduleVersionView.getEngmdlvsn()));
						} else {
							sbNo.append((moduleVersionView.getMdlvsnno() == null ? "" : moduleVersionView.getMdlvsnno())
									+ "\r");
							sbName.append((moduleVersionView.getMdlvsn() == null ? "" : moduleVersionView.getMdlvsn())
									+ "\r");
							sbEng.append(
									(moduleVersionView.getEngmdlvsn() == null ? "" : moduleVersionView.getEngmdlvsn())
											+ "\r");
						}
						k++;
					}

				}
				if (lstSub.size() > 0 && s < sbMd.toString().split(";").length - 1 && 1 != k) {
					sbNo.append("*" + "\r");
					sbName.append("*" + "\r");
					sbEng.append("*" + "\r");
				}
				s++;
			}

			// 去掉最后一个*
			int indexNo = sbNo.lastIndexOf("*");
			if (indexNo != -1) {
				String strs = sbNo.toString().substring(indexNo + 1, sbNo.length());
				if ("\r".equals(strs)) {
					sbNo.delete(indexNo, sbNo.length());
				}
				int indexName = sbName.lastIndexOf("*");
				if (indexName != -1) {
					String strsName = sbName.toString().substring(indexName + 1, sbName.length());
					if ("\r".equals(strsName)) {
						sbName.delete(indexName, sbName.length());
					}

				}
				int indexEng = sbEng.lastIndexOf("*");
				if (indexEng != -1) {
					String strsEng = sbEng.toString().substring(indexEng + 1, sbEng.length());
					if ("\r".equals(strsEng)) {
						sbEng.delete(indexEng, sbEng.length());
					}

				}
			}

			// 去掉最后一个换行\r
			int indexNoR = sbNo.lastIndexOf("\r");
			if (indexNoR != -1 && sbNo.length() - 1 == indexNoR) {
				sbNo.delete(indexNoR, sbNo.length());
				int indexNameR = sbName.lastIndexOf("\r");
				if (indexNameR != -1 && sbName.length() - 1 == indexNameR) {
					sbName.delete(indexNameR, sbName.length());
				}
				int indexEngR = sbEng.lastIndexOf("\r");
				if (indexEngR != -1 && sbEng.length() - 1 == indexEngR) {
					sbEng.delete(indexEngR, sbEng.length());
				}
			}

			map.put("moduleVersionno", sbNo.toString());
			map.put("moduleVersion", sbName.toString());
			map.put("engmoduleVersion", sbEng.toString());
		}

		return map;
	}

	/**
	 * 保存草稿
	 * 
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/save", produces = "text/html;charset=utf-8")
	@ResponseBody
	public Integer save(IBDS_BaseObject_PROCESSExt product) {
		try {
			product.setStatusname(BasicinfoConst.PRODUCT_STATUS_DRAFTName);
			product.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
			product.setResponsible((String) SecurityUtils.getSubject().getPrincipal());
			Integer id = 0;
			if (product.getId() == null) {
				String maxcode = baseObjectprocessService.getMaxCode();
				product.setApplycode(maxcode);
				id = baseObjectprocessService.create(product);
			} else {
				baseObjectprocessService.update(product);
				id = product.getId();
			}
			return id;
		} catch (Exception e) {
			logger.error("保存失败", e);
			return 0;
		}
	}

	/**
	 * 获取产品配置经理
	 * 
	 * @param tag
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/getPdtCmo", method = RequestMethod.POST)
	@ResponseBody
	public String getPDT_COM(String code) {
		IBDS_Release release = releaseService.selectByCode(code);
		IBDS_PDT pdt = pdtService.selectByCode(release.getPdtno());
		return pdt != null ? pdt.getCmoId() : "";
	}

	/**
	 * 提交流程
	 * 
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/submit", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult submit(IBDS_BaseObject_PROCESSExt product) {
		try {
			baseObjectprocessService.validateForm(product);

			String userId = (String) SecurityUtils.getSubject().getPrincipal();
			String userCode = "";

			Map<String, Object> variables = new HashMap<String, Object>();
			/*
			 * Map<String, String> param = new HashMap<>(); param.put("groupname",
			 * "&RD-P-CMO"); param.put("user", (String)
			 * SecurityUtils.getSubject().getPrincipal()); // List<UserGroup> userGroup =
			 * notesGroupService.selUserGroupbyparam(param);
			 */
			ADMP_MemberGroupExample example = new ADMP_MemberGroupExample();
			ADMP_MemberGroupExample.Criteria criteria = example.createCriteria();
			// 一级cmo群组直接产品R级可以直接录入到基本信息库
			// 从配置表中获取数据CmoGroup
			Map<String, String> param1 = new HashMap<>();
			param1.put("dicTypeCode", "CmoGroup");
			List<IBDS_Dic> dicGroup = dicService.getList(param1);
			List<ADMP_MemberGroup> userGroup = new ArrayList<>();
			if (dicGroup.size() > 0) {
				criteria.andGroupnameEqualTo(dicGroup.get(0).getDicName());
				criteria.andUsercodeEqualTo((String) SecurityUtils.getSubject().getPrincipal());
				userGroup = userService.selMemberGroupByparam(example);
			}

			String applyType = "";
			if (userGroup.size() > 0) {
				applyType = "0";
			} else {
				applyType = "1";
			}
			variables.put("applyType", applyType);
			variables.put("applyDept", "");
			variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal());
			// 根据选中的R查询下一步审批人员 即PDT中的CMO 或者填写的配置经理
			if (product.getSendto1().contains(",")) {
				userCode = product.getSendto1().split(",")[0];
			} else {
				userCode = product.getSendto1();
			}
			User user = userService.selectByPCode(userCode);
			if (user == null) {
				return ResponseResult.fail("该人员在系统中不存在,请更换人员或联系管理员！");
			}
			variables.put("cmo", user.getUda10511());
			// 第一次提交
			if (StringUtils.isBlank(product.getInstanseId())) {
				// 启动流程并通过第一个
				String instanceId = productCodeFlowableService.startFlowableAndPassOne("PrBelowProcess",
						userId.toString(), variables);
				product.setInstanseId(instanceId);
			} else {
				// 打回后重复提交
				Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(product.getInstanseId(), userId);
				// productCodeFlowableService.pass(task.getId());
				variables.put("checkResult", "同意");
				taskService.complete(task.getId(), variables);
			}

			// 当前元素为结束事件
			if ("end".equals(FlowableCache.getCurrentElement())) {
				// TODO 代表流程结束状态 数据生
				product.setStatus(BasicinfoConst.PRODUCT_STATUS_EFFECTIVE);
				product.setCmoleaderFillname(userId);
				product.setCmoleaderFilltime(new Date());
				product.setResponsible("");
				product.setCurrentnode(FlowableCache.getCurrentNode());
				product.setStatusname(FlowableCache.getCurrentStatusDesc());

			} else {
				product.setStatus(BasicinfoConst.PRODUCT_STATUS_APPLY);
				product.setCurrentnode(FlowableCache.getCurrentNode());
				product.setStatusname(FlowableCache.getCurrentStatusDesc());
				product.setResponsible(FlowableCache.getCurrentHandler());
				product.setCmoFillname(userId);
				product.setCmoFilltime(new Date());
			}

			String maxcode = "";
			if (StringUtil.isNotEmpty(product.getApplycode())) {
				maxcode = product.getApplycode();
			} else {
				maxcode = baseObjectprocessService.getMaxCode();
			}
			if (product.getId() == null) {
				product.setApplycode(maxcode);
				baseObjectprocessService.create(product);
			} else {
				baseObjectprocessService.update(product);
			}

			// 当前元素为结束事件
			if ("end".equals(FlowableCache.getCurrentElement())) {
				// 录入正式库 对象 待补充
				Map<String, Object> params = new HashMap<>();
				List<IBDS_BaseObject_PROCESS> lstProcess = baseObjectprocessService.selectByExample(maxcode);
				baseObjectprocessService.updateBaseInfo(lstProcess.get(0).getId(), "", params);
				// 清空map
				BasicinfoConst.sbSubsystemMap.remove(lstProcess.get(0).getApplycode() + BasicinfoConst.feature_Prefix);
				BasicinfoConst.sbSubsystemMap
						.remove(lstProcess.get(0).getApplycode() + BasicinfoConst.subsystem_Prefix);
				BasicinfoConst.sbSubsystemMap.remove(lstProcess.get(0).getApplycode() + BasicinfoConst.module_Prefix);

			}
			Task task = taskService.createTaskQuery().processInstanceId(product.getInstanseId()).singleResult();
			if (task != null) {
				if (StringUtil.isNotEmpty(product.getCopyto())) {
					Map<String, String> param = new HashMap<>();
					param.put("code", product.getCopyto());
					List<viewDomainGroupMember> lstmember = userService.selDomainGroupMemberByparam(param);
					if (lstmember.size() > 0) {
						for (viewDomainGroupMember viewDomainGroupMember : lstmember) {
							if (!userId.contains(viewDomainGroupMember.getUsercode())) {
								userId = (userId != "" ? (userId + ",") : "") + viewDomainGroupMember.getUsercode();
							}
						}

					}

				}
				mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(), userId,
						"请您审核产品R级以下申请表：" + FlowableCache.getCurrentStatusDesc(), null, product.getId(),
						"/basicinfo/prBelowApply/edit/" + product.getId(), "修改产品R级以下基本信息", task.getId());

			}

			// 创建流程记录
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(), "提交申请",
					null, FlowableCache.getCurrentStatusDesc(), product.getApplycode());
			// 集成eip
			String eipUrl = siteMainUrl + "/eipLogin?docuId=" + product.getApplycode();
			String productUrl = "/basicinfo/prBelowApply/edit/" + product.getId();
			String authorName = userService
					.getUserNameByAccount(product.getCreateUser() == null ? userId : product.getCreateUser());
			String addUserName = userService.getUserNameByAccount(product.getResponsible());

			if (applyType.equals("1")) {
				eipService.syncEip("产品R级以下信息申请", product.getApplycode(), product.getResponsible(), addUserName,
						product.getStatusname(), EipConst.PROCESSID_B, eipUrl, productUrl,
						product.getCreateUser() == null ? userId : product.getCreateUser(), authorName, false);
			}
			return ResponseResult.success(product, "提交成功");

		} catch (FlowableException e) {
			return ResponseResult.fail(e.getMessage());
		} catch (Exception e) {
			logger.error("提交失败", e);
			return ResponseResult.fail("提交失败");
		} finally {
			FlowableCache.removeCurrentNode();
			FlowableCache.removeCurrentHandler();
			FlowableCache.removeAll();
		}
	}

	/**
	 * 根据id获取表单信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/prBelowApply/getByProductId/{id}")
	@ResponseBody
	public ResponseResult getByProductId(@PathVariable Integer id) {
		try {
			IBDS_BaseObject_PROCESS process = baseObjectprocessService.getByProductId(id);
			return ResponseResult.success(process);
		} catch (Exception e) {
			logger.error("根据id级联查询失败", e);
			return ResponseResult.fail("根据id级联查询失败");
		}
	}

	/**
	 * 显示流程数据
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/prBelowApply/edit/{id}")
	@ResponseBody
	public ModelAndView edit(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView();

		IBDS_BaseObject_PROCESSExt process = baseObjectprocessService.getByProductId(id);
		// 草稿状态
		if (BasicinfoConst.PRODUCT_STATUS_DRAFT.equals(process.getStatus())
				|| BasicinfoConst.PRODUCT_STATUS_Return.equals(process.getStatus())) {
			mv.addObject("currentNode", "editable");
			mv.addObject("isHandler",
					SecurityUtils.getSubject().getPrincipal().toString().equalsIgnoreCase(process.getResponsible()));
			// 结束状态
		} else if (BasicinfoConst.PRODUCT_STATUS_EFFECTIVE.equals(process.getStatus())) {
			mv.addObject("currentNode", "disable");
			mv.addObject("isHandler",
					SecurityUtils.getSubject().getPrincipal().toString().equalsIgnoreCase(process.getResponsible()));
		} else {
			Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(process.getInstanseId(),
					(String) SecurityUtils.getSubject().getPrincipal());
			if (task != null) {
				mv.addObject("taskId", task.getId());
				mv.addObject("isHandler", SecurityUtils.getSubject().getPrincipal().toString()
						.equalsIgnoreCase(process.getResponsible()));
				if (process.getStatus().equals(BasicinfoConst.PRODUCT_STATUS_APPLY)) {
					process.setCurrentnode("userTask3");
				}

				mv.addObject("currentNode", process.getCurrentnode());
				Boolean isChange = false;
				if (getsysAdmin() || SecurityUtils.getSubject().getPrincipal().toString()
						.equalsIgnoreCase(process.getResponsible())) {
					isChange = true;
				}
				mv.addObject("isChangeUser", isChange);
			}

		}

		mv.addObject("showStatus", "edit");
		mv.addObject("id", id);

		// 修改基线版本显示顺序
		IBDS_BaseLine_Apply selProductApply = null;
		IBDS_BaseLine_Apply addProductApply = null;
		IBDS_BaseLine_Apply updateProductApply = null;
		IBDS_BaseLine_Apply delProductApply = null;
		for (IBDS_BaseLine_Apply apply : process.getBaseLines()) {
			if (apply.getApplytype() != null && apply.getApplytype().equals("1")) {
				addProductApply = apply;
				// 新增父版本名称显示
				if (StringUtil.isNotEmpty(apply.getParentitemno())) {
					StringBuilder sbParentBL = new StringBuilder();
					StringBuilder sbParentPR = new StringBuilder();

					if (apply.getParentitemno().contains("\r")) {

						for (String parentno : apply.getParentitemno().split("\r\n")) {
							if (parentno.contains("BL")) {
								sbParentBL.append(parentno + ",");
							}
							if (parentno.contains("PR")) {
								sbParentPR.append(parentno + ",");
							}
						}
					} else {
						if (apply.getParentitemno().contains("BL")) {
							sbParentBL.append(apply.getParentitemno() + ",");
						}
						if (apply.getParentitemno().contains("PR")) {
							sbParentPR.append(apply.getParentitemno() + ",");
						}
					}
					Map<String, Object> paramBL = new HashMap<>();
					if (sbParentBL.length() > 0) {
						paramBL.put("selcolumnName", "baseline");
						paramBL.put("selcolumnCode", "baselineno");
						paramBL.put("tabName", "BaseLineView");
						paramBL.put("column", "baselineno");
						paramBL.put("codes", sbParentBL.toString());
					}
					Map<String, Object> paramPR = new HashMap<>();
					if (sbParentPR.length() > 0) {
						paramPR.put("selcolumnName", "release");
						paramPR.put("selcolumnCode", "releaseno");
						paramPR.put("tabName", "ReleaseView");
						paramPR.put("column", "releaseno");
						paramPR.put("codes", sbParentPR.toString());
					}
					String[] ss = null;
					StringBuilder ssb = new StringBuilder();
					if (paramBL.size() > 0) {
						ss = productApplyService.getDataByColunm(paramBL);
						for (String blNo : ss) {
							ssb.append(blNo + ",");
						}

					}
					if (paramPR.size() > 0) {
						ss = productApplyService.getDataByColunm(paramPR);
						for (String blNo : ss) {
							ssb.append(blNo + ",");
						}
					}

					for (String parenttitemNo : apply.getParentitemno().split("\r\n")) {
						if (StringUtil.isEmpty(parenttitemNo)) {
							process.setBaseLineParentName(
									(process.getBaseLineParentName() == null ? "" : process.getBaseLineParentName())
											+ "\r\n");
						} else {
							if (parenttitemNo.equals("*")) {
								process.setBaseLineParentName((process.getBaseLineParentName() == null ? ""
										: process.getBaseLineParentName() + "\r\n") + "*");
							}
							if (ssb != null && ssb.toString().contains(",")) {
								for (String columnValue : ssb.toString().split(",")) {
									if (StringUtil.isNotEmpty(columnValue)) {
										if (columnValue.contains("||")) {
											if (columnValue.split("\\|\\|")[1].equals(parenttitemNo)) {
												process.setBaseLineParentName(
														(process.getBaseLineParentName() == null ? ""
																: process.getBaseLineParentName() + "\r\n")
																+ columnValue.split("\\|\\|")[0]);
											}

										}

									}
								}
							}
						}

					}

				}
				if (apply.getParentitemno().equals("*")) {
					process.setBaseLineParentName("*");
					apply.setParentitemno("*");
				}
				// 新增基线版本显示
				if (StringUtil.isNotEmpty(apply.getBaseline1())) {
					StringBuilder sbBaseBL = new StringBuilder();
					if (apply.getBaseline1().contains("\r")) {

						for (String parentno : apply.getBaseline1().split("\r\n")) {
							if (parentno.contains("BL")) {
								sbBaseBL.append(parentno + ",");
							}
						}
					} else {
						if (apply.getBaseline1().contains("BL")) {
							sbBaseBL.append(apply.getBaseline1() + ",");
						}
					}
					Map<String, Object> paramBase = new HashMap<>();
					if (sbBaseBL.length() > 0) {
						paramBase.put("selcolumnName", "baseline");
						paramBase.put("selcolumnCode", "baselineno");
						paramBase.put("tabName", "BaseLineView");
						paramBase.put("column", "baselineno");
						paramBase.put("codes", sbBaseBL.toString());
					}
					String[] ss = null;
					if (paramBase.size() > 0) {
						ss = productApplyService.getDataByColunm(paramBase);
					}
					StringBuilder baseline1 = new StringBuilder();
					for (String parenttitemNo : apply.getBaseline1().split("\r\n")) {
						if (StringUtil.isEmpty(parenttitemNo)) {
							baseline1.append((baseline1.length() == 0 ? "" : parenttitemNo) + "\r\n");
							process.setBaseLine1Name(
									(process.getBaseLine1Name() == null ? "" : process.getBaseLine1Name()) + "\r\n");
						} else {
							if (parenttitemNo.equals("*")) {
								process.setBaseLine1Name(
										(process.getBaseLine1Name() == null ? "" : process.getBaseLine1Name() + "\r\n")
												+ "*");
							}
							if (ss != null) {
								for (String columnValue : ss) {
									if (StringUtil.isNotEmpty(columnValue)) {
										if (columnValue.contains("||")) {
											if (columnValue.split("\\|\\|")[1].equals(parenttitemNo)) {
												baseline1.append(
														(baseline1.length() == 0 ? "" : parenttitemNo) + "\r\n");
												process.setBaseLine1Name((process.getBaseLine1Name() == null ? ""
														: process.getBaseLine1Name() + "\r\n")
														+ columnValue.split("\\|\\|")[0]);
											}

										}

									}
								}
							}
						}
					}
					if (apply.getBaseline1().equals("*")) {
						process.setBaseLine1Name("*");
						apply.setBaseline1("*");
					}

				}

			} else if (apply.getApplytype() != null && apply.getApplytype().equals("2")) {
				updateProductApply = apply;

				// 修改父版本名称显示
				if (StringUtil.isNotEmpty(apply.getParentitemno())) {
					StringBuilder sbParentBL = new StringBuilder();
					StringBuilder sbParentPR = new StringBuilder();

					if (apply.getParentitemno().contains("\r")) {

						for (String parentno : apply.getParentitemno().split("\r\n")) {
							if (parentno.contains("BL")) {
								sbParentBL.append(parentno + ",");
							}
							if (parentno.contains("PR")) {
								sbParentPR.append(parentno + ",");
							}
						}
					} else {
						if (apply.getParentitemno().contains("BL")) {
							sbParentBL.append(apply.getParentitemno() + ",");
						}
						if (apply.getParentitemno().contains("PR")) {
							sbParentPR.append(apply.getParentitemno() + ",");
						}
					}
					Map<String, Object> param = new HashMap<>();
					if (sbParentBL.length() > 0) {
						param.put("selcolumnName", "baseline");
						param.put("selcolumnCode", "baselineno");
						param.put("tabName", "BaseLineView");
						param.put("column", "baselineno");
						param.put("codes", sbParentBL.toString());
					} else if (sbParentPR.length() > 0) {
						param.put("selcolumnName", "release");
						param.put("selcolumnCode", "releaseno");
						param.put("tabName", "ReleaseView");
						param.put("column", "releaseno");
						param.put("codes", sbParentPR.toString());
					}
					String[] ss = null;
					if (param.size() > 0) {
						ss = productApplyService.getDataByColunm(param);
					}
					for (String parenttitemNo : apply.getParentitemno().split("\r\n")) {
						if (StringUtil.isEmpty(parenttitemNo)) {
							process.setBaseLineEditParentName((process.getBaseLineEditParentName() == null ? ""
									: process.getBaseLineEditParentName()) + "\r\n");
						} else {
							if (parenttitemNo.equals("*")) {
								process.setBaseLineEditParentName((process.getBaseLineEditParentName() == null ? ""
										: process.getBaseLineEditParentName() + "\r\n") + "*");
							}
							if (ss != null) {
								for (String columnValue : ss) {
									if (StringUtil.isNotEmpty(columnValue)) {
										if (columnValue.contains("||")) {
											if (columnValue.split("\\|\\|")[1].equals(parenttitemNo)) {
												process.setBaseLineEditParentName(
														(process.getBaseLineEditParentName() == null ? ""
																: process.getBaseLineEditParentName() + "\r\n")
																+ columnValue.split("\\|\\|")[0]);
											}

										}

									}
								}
							}
						}

					}

				}
				if (apply.getParentitemno().equals("*")) {
					process.setBaseLineEditParentName("*");
					apply.setParentitemno("*");
				}

				// 修改基线版本显示
				if (StringUtil.isNotEmpty(apply.getBaseline1())) {
					StringBuilder sbBaseBL = new StringBuilder();
					if (apply.getBaseline1().contains("\r")) {

						for (String parentno : apply.getBaseline1().split("\r\n")) {
							if (parentno.contains("BL")) {
								sbBaseBL.append(parentno + ",");
							}
						}
					} else {
						if (apply.getBaseline1().contains("BL")) {
							sbBaseBL.append(apply.getBaseline1() + ",");
						}
					}
					Map<String, Object> paramBase = new HashMap<>();
					if (sbBaseBL.length() > 0) {
						paramBase.put("selcolumnName", "baseline");
						paramBase.put("selcolumnCode", "baselineno");
						paramBase.put("tabName", "BaseLineView");
						paramBase.put("column", "baselineno");
						paramBase.put("codes", sbBaseBL.toString());
					}
					String[] ss = null;
					if (paramBase.size() > 0) {
						ss = productApplyService.getDataByColunm(paramBase);
					}
					StringBuilder baseline1 = new StringBuilder();
					for (String parenttitemNo : apply.getBaseline1().split("\r\n")) {
						if (StringUtil.isEmpty(parenttitemNo)) {
							baseline1.append((baseline1.length() == 0 ? "" : parenttitemNo) + "\r\n");
							process.setBaseLine1EditName(
									(process.getBaseLine1EditName() == null ? "" : process.getBaseLine1EditName())
											+ "\r\n");
						} else {
							if (parenttitemNo.equals("*")) {
								process.setBaseLine1EditName((process.getBaseLine1EditName() == null ? ""
										: process.getBaseLine1EditName() + "\r\n") + "*");
							}
							if (ss != null) {
								for (String columnValue : ss) {
									if (StringUtil.isNotEmpty(columnValue)) {
										if (columnValue.contains("||")) {
											if (columnValue.split("\\|\\|")[1].equals(parenttitemNo)) {
												process.setBaseLine1EditName(
														(process.getBaseLine1EditName() == null ? ""
																: process.getBaseLine1EditName() + "\r\n")
																+ columnValue.split("\\|\\|")[0]);
											}

										}

									}
								}
							}
						}
						if (apply.getBaseline1().equals("*")) {
							process.setBaseLine1EditName("*");
							apply.setBaseline1("*");
						}
					}

				}

				// 修改之前的版本
				// 修改父版本名称显示
				if (StringUtil.isNotEmpty(apply.getParentitemnoold())) {
					StringBuilder sbParentBL = new StringBuilder();
					StringBuilder sbParentPR = new StringBuilder();

					if (apply.getParentitemnoold().contains("\r")) {

						for (String parentno : apply.getParentitemnoold().split("\r\n")) {
							if (parentno.contains("BL")) {
								sbParentBL.append(parentno + ",");
							}
							if (parentno.contains("PR")) {
								sbParentPR.append(parentno + ",");
							}
						}
					} else {
						if (apply.getParentitemnoold().contains("BL")) {
							sbParentBL.append(apply.getParentitemnoold() + ",");
						}
						if (apply.getParentitemno().contains("PR")) {
							sbParentPR.append(apply.getParentitemnoold() + ",");
						}
					}
					Map<String, Object> param = new HashMap<>();
					if (sbParentBL.length() > 0) {
						param.put("selcolumnName", "baseline");
						param.put("selcolumnCode", "baselineno");
						param.put("tabName", "BaseLineView");
						param.put("column", "baselineno");
						param.put("codes", sbParentBL.toString());
					} else if (sbParentPR.length() > 0) {
						param.put("selcolumnName", "release");
						param.put("selcolumnCode", "releaseno");
						param.put("tabName", "ReleaseView");
						param.put("column", "releaseno");
						param.put("codes", sbParentPR.toString());
					}
					String[] ss = null;
					if (param.size() > 0) {
						ss = productApplyService.getDataByColunm(param);
					}
					for (String parenttitemNo : apply.getParentitemnoold().split("\r\n")) {
						if (StringUtil.isEmpty(parenttitemNo)) {
							process.setBaseLineEditOldParentName((process.getBaseLineEditOldParentName() == null ? ""
									: process.getBaseLineEditOldParentName()) + "\r\n");
						} else {
							if (parenttitemNo.equals("*")) {
								process.setBaseLineEditOldParentName(
										(process.getBaseLineEditOldParentName() == null ? ""
												: process.getBaseLineEditOldParentName() + "\r\n") + "*");
							}
							if (ss != null) {
								for (String columnValue : ss) {
									if (StringUtil.isNotEmpty(columnValue)) {
										if (columnValue.contains("||")) {
											if (columnValue.split("\\|\\|")[1].equals(parenttitemNo)) {
												process.setBaseLineEditOldParentName(
														(process.getBaseLineEditOldParentName() == null ? ""
																: process.getBaseLineEditOldParentName() + "\r\n")
																+ columnValue.split("\\|\\|")[0]);
											}

										}

									}
								}
							}
						}

					}

				}

				if (apply.getParentitemnoold().equals("*") || StringUtil.isEmpty(apply.getParentitemnoold())) {
					process.setBaseLineEditOldParentName("*");
					apply.setParentitemnoold("*");
				}

				// 修改基线版本显示
				if (StringUtil.isNotEmpty(apply.getBaseline1Old())) {
					StringBuilder sbBaseBL = new StringBuilder();
					if (apply.getBaseline1Old().contains("\r")) {

						for (String parentno : apply.getBaseline1Old().split("\r\n")) {
							if (parentno.contains("BL")) {
								sbBaseBL.append(parentno + ",");
							}
						}
					} else {
						if (apply.getBaseline1Old().contains("BL")) {
							sbBaseBL.append(apply.getBaseline1Old() + ",");
						}
					}
					Map<String, Object> paramBase = new HashMap<>();
					if (sbBaseBL.length() > 0) {
						paramBase.put("selcolumnName", "baseline");
						paramBase.put("selcolumnCode", "baselineno");
						paramBase.put("tabName", "BaseLineView");
						paramBase.put("column", "baselineno");
						paramBase.put("codes", sbBaseBL.toString());
					}
					String[] ss = null;
					if (paramBase.size() > 0) {
						ss = productApplyService.getDataByColunm(paramBase);
					}
					for (String parenttitemNo : apply.getBaseline1Old().split("\r\n")) {
						if (StringUtil.isEmpty(parenttitemNo)) {
							process.setBaseLine1EditOldName(
									(process.getBaseLine1EditOldName() == null ? "" : process.getBaseLine1EditOldName())
											+ "\r\n");
						} else {
							if (parenttitemNo.equals("*")) {
								process.setBaseLine1EditOldName((process.getBaseLine1EditOldName() == null ? ""
										: process.getBaseLine1EditOldName() + "\r\n") + "*");
							}
							if (ss != null) {
								for (String columnValue : ss) {
									if (StringUtil.isNotEmpty(columnValue)) {
										if (columnValue.contains("||")) {
											if (columnValue.split("\\|\\|")[1].equals(parenttitemNo)) {
												process.setBaseLine1EditOldName(
														(process.getBaseLine1EditOldName() == null ? ""
																: process.getBaseLine1EditOldName() + "\r\n")
																+ columnValue.split("\\|\\|")[0]);
											}

										}

									}
								}
							}

						}
					}
					if (apply.getBaseline1Old().equals("*") || StringUtil.isEmpty(apply.getBaseline1Old())) {
						process.setBaseLine1EditOldName("*");
						apply.setBaseline1Old("*");
					}

				}
			} else if (apply.getApplytype() != null && apply.getApplytype().equals("3")) {
				delProductApply = apply;
			}
			// 为空时 下拉框选项赋值
			if (selProductApply == null) {
				selProductApply = new IBDS_BaseLine_Apply();
				selProductApply.setPlipmtno(apply.getPlipmtno());
				selProductApply.setProdlineno(apply.getProdlineno());
				selProductApply.setProductno(apply.getProductno());
				selProductApply.setVersionno(apply.getVersionno());
				selProductApply.setReleaseno(apply.getReleaseno());
			}
		}

		// 修改其他对象显示顺序
		IBDS_BaseObject_Apply addProductApply1 = null;
		IBDS_BaseObject_Apply updateProductApply1 = null;
		IBDS_BaseObject_Apply delProductApply1 = null;
		IBDS_BaseObject_Apply addProductApply2 = null;
		IBDS_BaseObject_Apply updateProductApply2 = null;
		IBDS_BaseObject_Apply delProductApply2 = null;
		IBDS_BaseObject_Apply addProductApply3 = null;
		IBDS_BaseObject_Apply updateProductApply3 = null;
		IBDS_BaseObject_Apply delProductApply3 = null;
		IBDS_BaseObject_Apply addProductApply4 = null;
		IBDS_BaseObject_Apply updateProductApply4 = null;
		IBDS_BaseObject_Apply delProductApply4 = null;
		IBDS_BaseObject_Apply addProductApply5 = null;
		IBDS_BaseObject_Apply updateProductApply5 = null;
		IBDS_BaseObject_Apply delProductApply5 = null;
		IBDS_BaseObject_Apply addProductApply6 = null;
		IBDS_BaseObject_Apply updateProductApply6 = null;
		IBDS_BaseObject_Apply delProductApply6 = null;
		String feature = "";
		String module = "";
		String subsystem = "";
		List<List<IBDS_BaseObject_Apply>> lstBaseObjects = new ArrayList<List<IBDS_BaseObject_Apply>>();
		for (List<IBDS_BaseObject_Apply> baseobjects : process.getBaseObjects()) {
			for (IBDS_BaseObject_Apply baseobject : baseobjects) {
				// 下拉框赋值
				if (feature.equals("") && baseobject.getFeatureno() != null && !baseobject.getFeatureno().equals("")) {
					feature = baseobject.getFeatureno();
				}
				if (subsystem.equals("") && baseobject.getSubsystemno() != null
						&& !baseobject.getSubsystemno().equals("")) {
					subsystem = baseobject.getSubsystemno();
				}
				if (module.equals("") && baseobject.getModuleno() != null && !baseobject.getModuleno().equals("")) {
					module = baseobject.getModuleno();
				}
				if (baseobject.getType().equals("1")) {

					if (baseobject.getApplytype().equals("1")) {
						addProductApply1 = baseobject;
					} else if (baseobject.getApplytype().equals("2")) {
						updateProductApply1 = baseobject;
					} else if (baseobject.getApplytype().equals("3")) {
						delProductApply1 = baseobject;
					}
				}
				if (baseobject.getType().equals("2")) {

					if (baseobject.getApplytype().equals("1")) {
						addProductApply2 = baseobject;
					} else if (baseobject.getApplytype().equals("2")) {
						updateProductApply2 = baseobject;
					} else if (baseobject.getApplytype().equals("3")) {
						delProductApply2 = baseobject;
					}
				}
				if (baseobject.getType().equals("3")) {
					if (baseobject.getApplytype().equals("1")) {
						addProductApply3 = baseobject;
					} else if (baseobject.getApplytype().equals("2")) {
						updateProductApply3 = baseobject;
					} else if (baseobject.getApplytype().equals("3")) {
						delProductApply3 = baseobject;
					}
				}
				if (baseobject.getType().equals("4")) {

					if (baseobject.getApplytype().equals("1")) {
						addProductApply4 = baseobject;
					} else if (baseobject.getApplytype().equals("2")) {
						updateProductApply4 = baseobject;
					} else if (baseobject.getApplytype().equals("3")) {
						delProductApply4 = baseobject;
					}
				}
				if (baseobject.getType().equals("5")) {

					if (baseobject.getApplytype().equals("1")) {
						addProductApply5 = baseobject;
					} else if (baseobject.getApplytype().equals("2")) {
						updateProductApply5 = baseobject;
					} else if (baseobject.getApplytype().equals("3")) {
						delProductApply5 = baseobject;
					}
				}
				if (baseobject.getType().equals("6")) {

					if (baseobject.getApplytype().equals("1")) {
						addProductApply6 = baseobject;
					} else if (baseobject.getApplytype().equals("2")) {
						updateProductApply6 = baseobject;
					} else if (baseobject.getApplytype().equals("3")) {
						delProductApply6 = baseobject;
					}
				}

				// 为空时 下拉框选项赋值
				if (selProductApply == null) {
					selProductApply = new IBDS_BaseLine_Apply();
					selProductApply.setPlipmtno(baseobject.getPlipmtno());
					selProductApply.setProdlineno(baseobject.getProdlineno());
					selProductApply.setProductno(baseobject.getProductno());
					selProductApply.setVersionno(baseobject.getVersionno());
					selProductApply.setReleaseno(baseobject.getReleaseno());
				}
			}
		}

		if (addProductApply == null) {
			addProductApply = new IBDS_BaseLine_Apply();
		}
		if (updateProductApply == null) {
			updateProductApply = new IBDS_BaseLine_Apply();
		}
		if (delProductApply == null) {
			delProductApply = new IBDS_BaseLine_Apply();
		}

		List<IBDS_BaseLine_Apply> finalProductApplyList = new ArrayList<IBDS_BaseLine_Apply>();
		finalProductApplyList.add(selProductApply);
		finalProductApplyList.add(addProductApply);
		finalProductApplyList.add(updateProductApply);
		finalProductApplyList.add(delProductApply);
		process.setBaseLines(finalProductApplyList);

		// 所属对象 赋值
		if (addProductApply1 == null) {
			addProductApply1 = new IBDS_BaseObject_Apply();
			addProductApply1.setFeatureno(feature);
		}
		if (addProductApply5 == null) {
			addProductApply5 = new IBDS_BaseObject_Apply();
			addProductApply5.setSubsystemno(subsystem);
		}
		if (addProductApply6 == null) {
			addProductApply6 = new IBDS_BaseObject_Apply();
			addProductApply6.setModuleno(module);
		}

		// 对象不存在时赋空值
		// 组装其他对象
		List<IBDS_BaseObject_Apply> finalObjectApplyList1 = new ArrayList<IBDS_BaseObject_Apply>();
		List<IBDS_BaseObject_Apply> finalObjectApplyList2 = new ArrayList<IBDS_BaseObject_Apply>();
		List<IBDS_BaseObject_Apply> finalObjectApplyList3 = new ArrayList<IBDS_BaseObject_Apply>();
		List<IBDS_BaseObject_Apply> finalObjectApplyList4 = new ArrayList<IBDS_BaseObject_Apply>();
		List<IBDS_BaseObject_Apply> finalObjectApplyList5 = new ArrayList<IBDS_BaseObject_Apply>();
		List<IBDS_BaseObject_Apply> finalObjectApplyList6 = new ArrayList<IBDS_BaseObject_Apply>();

		finalObjectApplyList1.add(addProductApply1 == null ? new IBDS_BaseObject_Apply() : addProductApply1);
		finalObjectApplyList1.add(updateProductApply1 == null ? new IBDS_BaseObject_Apply() : updateProductApply1);
		finalObjectApplyList1.add(delProductApply1 == null ? new IBDS_BaseObject_Apply() : delProductApply1);
		finalObjectApplyList2.add(addProductApply2 == null ? new IBDS_BaseObject_Apply() : addProductApply2);
		finalObjectApplyList2.add(updateProductApply2 == null ? new IBDS_BaseObject_Apply() : updateProductApply2);
		finalObjectApplyList2.add(delProductApply2 == null ? new IBDS_BaseObject_Apply() : delProductApply2);
		finalObjectApplyList3.add(addProductApply3 == null ? new IBDS_BaseObject_Apply() : addProductApply3);
		finalObjectApplyList3.add(updateProductApply3 == null ? new IBDS_BaseObject_Apply() : updateProductApply3);
		finalObjectApplyList3.add(delProductApply3 == null ? new IBDS_BaseObject_Apply() : delProductApply3);
		finalObjectApplyList4.add(addProductApply4 == null ? new IBDS_BaseObject_Apply() : addProductApply4);
		finalObjectApplyList4.add(updateProductApply4 == null ? new IBDS_BaseObject_Apply() : updateProductApply4);
		finalObjectApplyList4.add(delProductApply4 == null ? new IBDS_BaseObject_Apply() : delProductApply4);
		finalObjectApplyList5.add(addProductApply5 == null ? new IBDS_BaseObject_Apply() : addProductApply5);
		finalObjectApplyList5.add(updateProductApply5 == null ? new IBDS_BaseObject_Apply() : updateProductApply5);
		finalObjectApplyList5.add(delProductApply5 == null ? new IBDS_BaseObject_Apply() : delProductApply5);
		finalObjectApplyList6.add(addProductApply6 == null ? new IBDS_BaseObject_Apply() : addProductApply6);
		finalObjectApplyList6.add(updateProductApply6 == null ? new IBDS_BaseObject_Apply() : updateProductApply6);
		finalObjectApplyList6.add(delProductApply6 == null ? new IBDS_BaseObject_Apply() : delProductApply6);

		lstBaseObjects.add(finalObjectApplyList1);
		lstBaseObjects.add(finalObjectApplyList2);
		lstBaseObjects.add(finalObjectApplyList3);
		lstBaseObjects.add(finalObjectApplyList4);
		lstBaseObjects.add(finalObjectApplyList5);
		lstBaseObjects.add(finalObjectApplyList6);

		process.setBaseObjects(lstBaseObjects);

		// 多个选项 修改和停用读取内码时含换行符，特殊处理

		// 修改的基线版本
		StringBuilder editbaselineNosb = new StringBuilder();
		String editbaselineNo = StringUtil.isNotEmpty(process.getBaseLines().get(2).getBaselineno())
				? process.getBaseLines().get(2).getBaselineno()
				: process.getBaseLines().get(2).getBaselineoldno();
		if (StringUtils.isNotEmpty(editbaselineNo) && editbaselineNo.contains("\r\n")) {
			editbaselineNosb.append(editbaselineNo.replace("\r\n", ","));
		} else {
			editbaselineNosb.append(editbaselineNo);
		}
		// 停用的基线版本
		StringBuilder delbaselineNosb = new StringBuilder();
		String delbaselineNo = process.getBaseLines().get(3).getBaselineno();
		if (StringUtils.isNotEmpty(delbaselineNo) && delbaselineNo.contains("\r\n")) {
			delbaselineNosb.append(delbaselineNo.replace("\r\n", ","));
		} else {
			delbaselineNosb.append(delbaselineNo);
		}
		// 修改的特性
		StringBuilder editfeatureNosb = new StringBuilder();
		String editfeatureNo = process.getBaseObjects().get(0).get(1).getObjectnoold();
		if (StringUtils.isNotEmpty(editfeatureNo) && editfeatureNo.contains("\r\n")) {
			editfeatureNosb.append(editfeatureNo.replace("\r\n", ","));
		} else {
			editfeatureNosb.append(editfeatureNo);
		}
		// 停用的特性
		StringBuilder delfeatureNosb = new StringBuilder();
		String delfeatureNo = process.getBaseObjects().get(0).get(2).getObjectno();
		if (StringUtils.isNotEmpty(delfeatureNo) && delfeatureNo.contains("\r\n")) {
			delfeatureNosb.append(delfeatureNo.replace("\r\n", ","));
		} else {
			delfeatureNosb.append(delfeatureNo);
		}
		// 修改的子特性
		StringBuilder editsubfeatureNosb = new StringBuilder();
		String editsubfeatureNo = process.getBaseObjects().get(1).get(1).getObjectnoold();
		if (StringUtils.isNotEmpty(editsubfeatureNo) && editsubfeatureNo.contains("\r\n")) {
			editsubfeatureNosb.append(editsubfeatureNo.replace("\r\n", ","));
		} else {
			editsubfeatureNosb.append(editsubfeatureNo);
		}
		// 停用的子特性
		StringBuilder delsubfeatureNosb = new StringBuilder();
		String delsubfeatureNo = process.getBaseObjects().get(1).get(2).getObjectno();
		if (StringUtils.isNotEmpty(delsubfeatureNo) && delsubfeatureNo.contains("\r\n")) {
			delsubfeatureNosb.append(delsubfeatureNo.replace("\r\n", ","));
		} else {
			delsubfeatureNosb.append(delsubfeatureNo);
		}
		// 修改的项目组
		StringBuilder editteamNosb = new StringBuilder();
		String editteamNo = process.getBaseObjects().get(2).get(1).getObjectnoold();
		if (StringUtils.isNotEmpty(editteamNo) && editteamNo.contains("\r\n")) {
			editteamNosb.append(editteamNo.replace("\r\n", ","));
		} else {
			editteamNosb.append(editteamNo);
		}
		// 停用的项目组
		StringBuilder delteamNosb = new StringBuilder();
		String delteamNo = process.getBaseObjects().get(2).get(2).getObjectno();
		if (StringUtils.isNotEmpty(delteamNo) && delteamNo.contains("\r\n")) {
			delteamNosb.append(delteamNo.replace("\r\n", ","));
		} else {
			delteamNosb.append(delteamNo);
		}
		// 修改的子系统
		StringBuilder editsubSystemNosb = new StringBuilder();
		String editsubSystemNo = process.getBaseObjects().get(3).get(1).getObjectnoold();
		if (StringUtils.isNotEmpty(editsubSystemNo) && editsubSystemNo.contains("\r\n")) {
			editsubSystemNosb.append(editsubSystemNo.replace("\r\n", ","));
		} else {
			editsubSystemNosb.append(editsubSystemNo);
		}
		// 停用的子系统
		StringBuilder delsubSystemNosb = new StringBuilder();
		String delsubSystemNo = process.getBaseObjects().get(3).get(2).getObjectno();
		if (StringUtils.isNotEmpty(delsubSystemNo) && delsubSystemNo.contains("\r\n")) {
			delsubSystemNosb.append(delsubSystemNo.replace("\r\n", ","));
		} else {
			delsubSystemNosb.append(delsubSystemNo);
		}
		// 修改的模块
		StringBuilder editmoduleNosb = new StringBuilder();
		String editmoduleNo = process.getBaseObjects().get(4).get(1).getObjectnoold();
		if (StringUtils.isNotEmpty(editmoduleNo) && editmoduleNo.contains("\r\n")) {
			editmoduleNosb.append(editmoduleNo.replace("\r\n", ","));
		} else {
			editmoduleNosb.append(editmoduleNo);
		}
		// 停用的模块
		StringBuilder delmoduleNosb = new StringBuilder();
		String delmoduleNo = process.getBaseObjects().get(4).get(2).getObjectno();
		if (StringUtils.isNotEmpty(delmoduleNo) && delmoduleNo.contains("\r\n")) {
			delmoduleNosb.append(delmoduleNo.replace("\r\n", ","));
		} else {
			delmoduleNosb.append(delmoduleNo);
		}
		// 修改的模块版本
		StringBuilder editmoduleVersionNosb = new StringBuilder();
		String editmoduleVersionNo = process.getBaseObjects().get(5).get(1).getObjectnoold();
		if (StringUtils.isNotEmpty(editmoduleVersionNo) && editmoduleVersionNo.contains("\r\n")) {
			editmoduleVersionNosb.append(editmoduleVersionNo.replace("\r\n", ","));
		} else {
			editmoduleVersionNosb.append(editmoduleVersionNo);
		}
		// 停用的模块版本
		StringBuilder delmoduleVersionNosb = new StringBuilder();
		String delmoduleVersionNo = process.getBaseObjects().get(5).get(2).getObjectno();
		if (StringUtils.isNotEmpty(delmoduleVersionNo) && delmoduleVersionNo.contains("\r\n")) {
			delmoduleVersionNosb.append(delmoduleVersionNo.replace("\r\n", ","));
		} else {
			delmoduleVersionNosb.append(delmoduleVersionNo);
		}

		mv.addObject("entity", process);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("editbaselineNo", editbaselineNosb.toString());
		mv.addObject("delbaselineNo", delbaselineNosb.toString());
		mv.addObject("editfeatureNo", editfeatureNosb.toString());
		mv.addObject("delfeatureNo", delfeatureNosb.toString());
		mv.addObject("editsubfeatureNo", editsubfeatureNosb.toString());
		mv.addObject("delsubfeatureNo", delsubfeatureNosb.toString());
		mv.addObject("editteamNo", editteamNosb.toString());
		mv.addObject("delteamNo", delteamNosb.toString());
		mv.addObject("editsubSystemNo", editsubSystemNosb.toString());
		mv.addObject("delsubSystemNo", delsubSystemNosb.toString());
		mv.addObject("editModuleNo", editmoduleNosb.toString());
		mv.addObject("delModuleNo", delmoduleNosb.toString());
		mv.addObject("editModuleVersionNo", editmoduleVersionNosb.toString());
		mv.addObject("delModuleVersionNo", delmoduleVersionNosb.toString());
		mv.addObject("feature", feature);
		mv.addObject("subsystem", subsystem);
		mv.addObject("module", module);

		if (process.getBaseLines() != null && process.getBaseLines().size() > 0
				&& StringUtils.isNotBlank(process.getBaseLines().get(0).getReleaseno())) {
			IBDS_Release release = releaseService.selectByCode(process.getBaseLines().get(0).getReleaseno());
			mv.addObject("copyTitle", "R级以下申请表 : " + (release == null ? "" : release.getRelease()));
		} else {
			mv.addObject("copyTitle", "R级以下申请表 : ");
		}

		// 显示流程记录
		mv.addObject("logs", processLogService.getByProcessCode(process.getApplycode()));

		mv.setViewName("basicinfo/prBelowApply/add");

		return mv;
	}

	/**
	 * 设置下拉框值 用于前端获取值
	 */
	public IBDS_BaseLine_Apply setSelValue(IBDS_BaseLine_Apply baselines) {
		IBDS_BaseLine_Apply baselineNew = null;
		return baselineNew;
	}

	/**
	 * 审核
	 * 
	 * @param params
	 * @param id
	 * @param taskId
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/check/{id}/{taskId}", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult check(@RequestBody Map<String, Object> params, @PathVariable Integer id,
			@PathVariable String taskId) {

		try {
			baseObjectprocessService.check(id, taskId, params);

			return ResponseResult.success();
		} catch (Exception e) {
			logger.error("审核失败", e);
			return ResponseResult.fail("审核失败");
		} finally {
			FlowableCache.removeAll();
		}
	}

	/**
	 * 修改当前处理人
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/changeResponsible", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult changeHandler(Integer id, String taskId, String userId) {
		try {
			IBDS_BaseObject_PROCESS process = baseObjectprocessService.getById(id);
			User user = userService.selectByPCode(userId);
			if (user != null) {
				if (user.getUda10511().equals(process.getResponsible())) {
					return ResponseResult.fail("修改的处理人和当前责任人一致，请重新输入！");
				} else {
					baseObjectprocessService.changeResponsible(id, taskId, user.getUda10511());
					// 创建流程记录
					processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
							"修改处理人", null, "处理人由" + userService.getNameDescByAccount(process.getResponsible()) + "更改为:"
									+ userService.getNameDescByAccount(user.getUda10511()),
							process.getApplycode());
					mailInfoService.sendMailAndRecord(user.getUda10511(), process.getResponsible(),
							"请您审核产品R级以下申请表：" + process.getStatusname(), null, id, "/basicinfo/prBelowApply/edit/" + id,
							"修改产品R级以下基本信息处理人", taskId);
					// 集成eip
					String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplycode();
					String productUrl = "/basicinfo/prBelowApply/edit/" + process.getId();
					String authorName = userService.getUserNameByAccount(process.getCreateUser());
					String addUserName = userService.getUserNameByAccount(userId);

					eipService.syncEip("产品R级以下信息申请", process.getApplycode(), userId, addUserName,
							process.getStatusname(), EipConst.PROCESSID_B, eipUrl, productUrl, process.getCreateUser(),
							authorName, false);
					return ResponseResult.success("指派成功");
				}
			} else {
				return ResponseResult.fail("处理人不正确，请重新输入！");
			}
		} catch (Exception e) {
			logger.error("指派失败", e);
			return ResponseResult.fail("指派失败");
		}
	}

	/**
	 * 导入特性、子特性
	 * 
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/resExcelImport", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> resExcelImport(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws IOException { // String
		// value,

		/*
		 * MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)
		 * request; List<MultipartFile> files = multipartRequest.getFiles("value");
		 */

		Map<String, Object> map = new HashMap<>();
		String fileName = file.getOriginalFilename();
		if (fileName.indexOf("\\") > -1) {
			fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
		}
		String fileId = UUID.randomUUID().toString();
		String extName = fileName.substring(fileName.lastIndexOf("."));
		System.out.println(PATH + fileId + extName);
		File dest = new File(PATH + fileId + extName);
		if (!dest.exists()) {
			dest.getParentFile().mkdirs();
			dest.createNewFile();
		}
		file.transferTo(dest);

		// File file = new File(paths);
		if (file == null) {
			map.put("mag", "文件不存在");
			map.put("success", false);
		} else {
			map = ParseExcelUtil.readExcelData(dest);
			if (map.containsKey("msg")) {
				map.put("mag", map.get("msg"));
				map.put("success", false);
			} else {
				map.put("mag", "导入成功");
				map.put("success", true);
			}
		}

		// File file = new File(fileName);//
		// ("C:\\Users\\lys0670\\Desktop\\测试体系CMM问题单库特性_子特性汇总表20080326_V5R1.xls");

		/*
		 * if (file.isEmpty()) { map.put("mag", "文件不存在"); map.put("success", false); }
		 * else { String fileName = file.getOriginalFilename(); if
		 * (fileName.indexOf("\\") > -1) { fileName =
		 * fileName.substring(fileName.lastIndexOf("\\") + 1); } String fileId =
		 * UUID.randomUUID().toString(); String extName =
		 * fileName.substring(fileName.lastIndexOf(".")); System.out.println(PATH +
		 * fileId + extName); File dest = new File(PATH + fileId + extName);
		 * 
		 * if(!dest.exists()){ dest.getParentFile().mkdirs(); dest.createNewFile(); }
		 * 
		 * map = ParseExcelUtil.readExcelData(dest); map.put("mag", "导入成功");
		 * map.put("success", true); }
		 */
		return map;

	}

	/**
	 * 根据内码获取名称,支持多个
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/data/{type}getInfobyCode")
	@ResponseBody
	public String getDataByColunm(String code) {
		Map<String, Object> param = new HashMap<>();
		if (code.contains("BL")) {
			param.put("selcolumnName", "baseline");
			param.put("selcolumnCode", "baselineno");
			param.put("tabName", "BaseLineView");
			param.put("column", "baselineno");
			param.put("codes", code);
		} else if (code.contains("PR")) {
			param.put("selcolumnName", "release");
			param.put("selcolumnCode", "releaseno");
			param.put("tabName", "ReleaseView");
			param.put("column", "releaseno");
			param.put("codes", code);
		}
		String[] ss = productApplyService.getDataByColunm(param);
		StringBuilder db = new StringBuilder();
		for (String selData : ss) {
			db.append(selData + ",");
		}
		return db.toString();
	}

	/**
	 * 删除流程
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/prBelowApply/delProcess", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult delProcess(Integer id) {
		try {
			if (id != 0) {
				IBDS_BaseObject_PROCESS delProcess = new IBDS_BaseObject_PROCESS();
				delProcess.setId(id);
				delProcess.setStatus(BasicinfoConst.PRODUCT_STATUS_Del);
				delProcess.setStatusname(BasicinfoConst.PRODUCT_STATUS_DelName);
				delProcess.setModifyDate(new Date());
				delProcess.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				baseObjectprocessMapper.updateByPrimaryKeySelective(delProcess);

				// 查询流程实例
				IBDS_BaseObject_PROCESS process = baseObjectprocessMapper.selectByPrimaryKey(id);
				if (process != null && StringUtil.isNotEmpty(process.getInstanseId())) {
					// 废弃后删除该流程
					runtimeService.deleteProcessInstance(process.getInstanseId(),
							(String) SecurityUtils.getSubject().getPrincipal() + "废弃" + process.getInstanseId() + "流程");
				}
				return ResponseResult.success("删除成功");
			} else {
				return ResponseResult.fail("删除的流程不存在,请联系管理员");
			}
		} catch (Exception e) {
			logger.error("删除失败", e);
			return ResponseResult.fail("删除失败");
		}

	}
}
