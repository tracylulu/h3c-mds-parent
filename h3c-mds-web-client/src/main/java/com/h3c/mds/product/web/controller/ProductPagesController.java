package com.h3c.mds.product.web.controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.product.dao.IBDS_ColunmConfigMapper;
import com.h3c.mds.product.dao.view_OperationLogMapper;
import com.h3c.mds.product.dao.view_projectInfoMapper;
import com.h3c.mds.product.entity.FeatureView;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.ModuleView;
import com.h3c.mds.product.entity.PdtView;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.entity.ProductView;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.entity.SubSystemView;
import com.h3c.mds.product.entity.VersionView;
import com.h3c.mds.product.entity.view_OperationLog;
import com.h3c.mds.product.entity.view_projectInfo;
import com.h3c.mds.product.service.ComboboxService;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_OperationLogService;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.service.RoleService;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.combobox.ComboBoxData;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.map.MapUtils;

import net.sf.json.JSONException;

@Controller
@RequestMapping("/product")
public class ProductPagesController {

	@Autowired
	private IBDS_ColunmConfigService service;

	@Autowired
	private ComboboxService comboboxService;

	@Autowired
	private UserRoleRelationService userRoleRelationService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private UserService userService;

	@Autowired
	private IBDS_OperationLogService operationLogService;

	@Autowired
	private IBDS_ColunmConfigMapper colunmConfigMapper;

	@Autowired
	private view_OperationLogMapper operationLogMapper;

	@Autowired
	private view_projectInfoMapper projectInfoMapper;

	@Autowired
	private IBDS_BversionService bversionService;

	@Autowired
	private MailInfoService mailService;

	@Value("${file.path}")
	private String filePath;

	/**
	 * 查询列表
	 * 
	 * @param type
	 * @return
	 */
	@RequestMapping("/pages/{type}")
	public ModelAndView pages(HttpServletRequest request, @PathVariable("type") String type) {
		ModelAndView mv = new ModelAndView();
		/**
		 * 按钮权限
		 */
		// 获取当前用户角色
		Subject subject = SecurityUtils.getSubject();
		List<Role> roles = (List<Role>) subject.getSession().getAttribute("roles");
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 获取字典表配置

		Boolean isShowAdd = false;// 控制是否显示新增按钮
		// 获取新增按钮权限类型
		// 查询参数放入Map中
		Map<String, Object> paramAdd = new HashMap<>();
		// IPMT执行秘书只能编辑配置为自己的数据
		paramAdd.put("type", type.toUpperCase());
		paramAdd.put("typeCode", "8");
		paramAdd.put("roleCode", roleCode);

		List<ComboBoxData> dicAddtype = comboboxService.getCombobox(paramAdd);
		if (dicAddtype != null && dicAddtype.size() > 0) {
			isShowAdd = true;
		}

		// 获取编辑权限类型
		Boolean isShowEdit = false;// 控制是否可双击进入编辑页面
		// 获取编辑按钮权限类型
		Map<String, Object> paramEdit = new HashMap<>();

		paramEdit.put("type", type.toUpperCase());
		paramEdit.put("typeCode", "12");
		paramEdit.put("roleCode", roleCode);

		List<ComboBoxData> dicEdittype = comboboxService.getCombobox(paramEdit);

		/**
		 * 获取字典表配置的权限 存在则授权
		 */
		StringBuilder sbDic = new StringBuilder();
		for (ComboBoxData comboBoxData : dicEdittype) {
			sbDic.append(comboBoxData.getValue() + ",");
		}

		Map<String, String> param = new HashMap<>();
		param.put("type", type.toUpperCase());/**** 需要更改 根据类型获取对象的树形表显示列 ****/
		param.put("queryStatus", "query");// 查询 标记
		List<IBDS_ColunmConfig> colunmConfigList = service.getColunmConfigByParam(param);
		mv.addObject("colunmConfigList", colunmConfigList);/**** 如有更改 需跟前端页面对应 ****/
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("title", MapUtils.titleMap.get(type.toUpperCase()));
		mv.addObject("isShowAdd", isShowAdd);

		String usercode = "";
		StringBuilder ipmtno = new StringBuilder();
		StringBuilder pdtno = new StringBuilder();

		if (dicEdittype != null && dicEdittype.size() > 0) {
			// 角色为管理员且字典表配置有管理员权限
			if (roleCode.contains("R_000001") && sbDic.toString().contains("R_000001")) {// 管理员查询所有
				ipmtno.append("all");
				pdtno.append("all");
				isShowEdit = true;
			} else {
				if (roleCode.contains("R_000002") && sbDic.toString().contains("R_000002")) {// 如果是IPMT执行秘书 查询配置为自己的IPMT
					isShowEdit = true;
					usercode = attributeUser.getCode();

					Map<String, Object> paramIpmt = new HashMap<>();

					String typeshow = "PI,PL,PP,PV,PJ,PR,PB";// 从IPMT层展示数据的查询type PI 返回IPMT IPMT执行秘书配置为自己的获取数据
					if (typeshow.contains(type.toUpperCase())) {
						paramIpmt.put("type", "PI");
					} else {// 其他层返回产品线 判断是否有权限查看数据
						paramIpmt.put("type", "PL");
					}
					paramIpmt.put("sub_user", usercode);
					List<ComboBoxData> ipmt = comboboxService.getCombobox(paramIpmt);
					for (ComboBoxData cipmt : ipmt) {
						ipmtno.append(cipmt.getValue());
					}
					pdtno.append("nall");
				}
				if ((roleCode.contains("R_000003") && sbDic.toString().contains("R_000003"))
						|| (roleCode.contains("R_000004") && sbDic.toString().contains("R_000004"))) {// pop\cmo只能编辑groupOrder!=1的区段
					isShowEdit = true;
					ipmtno.append("nall");
					String pdtType = "PT,PV,PR,PP";

					if (pdtType.contains(type.toUpperCase())) {
						Map<String, Object> parampdt = new HashMap<>();
						parampdt.put("type", type.toUpperCase());
						parampdt.put("sub_user", attributeUser.getCode());
						// 根据不同参数查询
						List<ComboBoxData> pdt = comboboxService.getCombobox(parampdt);
						for (ComboBoxData cpdt : pdt) {
							pdtno.append(cpdt.getValue());
						}
					} else {
						pdtno.append("all");
					}

				}
			}
		}
		mv.addObject("isShowEdit", isShowEdit);
		mv.addObject("ipmtno", ipmtno);
		mv.addObject("pdtno", pdtno);

		mv.setViewName("product/pages/list");
		return mv;// "product/release/list";/**** 需要更改 跳转页面的路径 ****/
	}

	/**
	 * 显示新增页面
	 */
	@RequestMapping("/pages/{type}add")
	@ResponseBody
	public ModelAndView add(@PathVariable("type") String type, String code, String tg) {
		ModelAndView mv = new ModelAndView();
		List<String> strList = new ArrayList<>();
		Map<String, String> param = new HashMap<>();
		param.put("type", type.toUpperCase());/**** 根据类型获取对象的树形表显示列 ****/
		param.put("queryStatus", "add");// 新增 标记
		List<IBDS_ColunmConfig> colunmConfigList = service.getColunmConfigByParam(param);

		mv.addObject("colunmConfigList", colunmConfigList);/**** 如有更改 需跟前端页面对应 ****/
		mv.addObject("groups", strList);
		mv.addObject("title", MapUtils.titleMap.get(type.toUpperCase()));
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("IsEdit", false);
		mv.addObject("tg", tg);
		mv.addObject("isCheck", false);
		if (code.contains(type.toUpperCase())) {
			mv.addObject("showComboboxData", selectByCode(code));
		}
		mv.setViewName("product/pages/add");
		for (IBDS_ColunmConfig colunmConfig : colunmConfigList) {
			String group = colunmConfig.getColumngroup();
			if (strList.contains(group)) {
				continue;
			}
			strList.add(group);
		}

		return mv;

	}

	/**
	 * 显示编辑页面
	 */
	@RequestMapping("/pages/{type}edit/{code}/{id}/{tg}/{showStatus}/{mk}") // mk 跳转页面标志
	@ResponseBody
	public ModelAndView edit(@PathVariable("type") String type, @PathVariable("code") String code,
			@PathVariable("id") String id, @PathVariable("tg") String tg, @PathVariable("showStatus") String showStatus,
			@PathVariable("mk") String mk) {
		ModelAndView mv = new ModelAndView();
		List<String> strList = new ArrayList<>();
		Map<String, String> param = new HashMap<>();
		param.put("type", type.toUpperCase());/**** 根据类型获取对象的树形表显示列 ****/
		param.put("queryStatus", "edit");// 编辑 标记

		List<IBDS_ColunmConfig> colunmConfigList = service.getColunmConfigByParam(param);
		Boolean isGroupOrder = false;// 判断基础信息是否可编辑
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		if (!roleCode.contains("R_000001") && !roleCode.contains("R_000002")
				&& (roleCode.contains("R_000003") || roleCode.contains("R_000004"))) {// pop\cmo只能编辑groupOrder!=1的区段
			isGroupOrder = true;
		}
		Boolean isCheck = false;
		// 管理员和自身ipmt执行秘书可编辑字段是否需要IPMT执行秘书审核
		if (roleCode.contains("R_000001") || roleCode.contains("R_000002")) {
			isCheck = true;
		}
		mv.addObject("isGroupOrder", isGroupOrder);
		mv.addObject("colunmConfigList", colunmConfigList);/**** 如有更改 需跟前端页面对应 ****/
		mv.addObject("groups", strList);
		mv.addObject("code", code);
		mv.addObject("id", id);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("title", MapUtils.titleMap.get(type.toUpperCase()));
		mv.addObject("IsEdit", true);
		mv.addObject("tg", tg);// 保存退出 刷新表格使用
		mv.addObject("isCheck", isCheck);
		mv.addObject("showStatus", showStatus);
		// 新增研发项目
		List<view_projectInfo> projectInfo = new ArrayList<>();
		if (type.toUpperCase().equals("PR") || type.toUpperCase().equals("PB")) {
			Map<String, Object> mapPar = new HashMap<>();
			mapPar.put("code", code);
			mapPar.put("type", type.toUpperCase());
			projectInfo = projectInfoMapper.selectProjectInfo(mapPar);
		}

		mv.addObject("projectInfo", projectInfo);
		if (mk.equals("0")) {
			mv.setViewName("product/pages/editReader");
		} else {
			mv.setViewName("product/pages/add");
		}

		for (IBDS_ColunmConfig colunmConfig : colunmConfigList) {
			String group = colunmConfig.getColumngroup();
			if (strList.contains(group)) {
				continue;
			}
			strList.add(group);
		}

		return mv;
	}

	/**
	 * 显示编辑页面
	 */
	@RequestMapping("/data/{type}codeedit")
	@ResponseBody
	public <T> T selectByID(String code, Integer id) {
		return service.selectByID(code, id);
	}

	/**
	 * 根据内码获取信息
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/data/{type}getInfobyCode")
	@ResponseBody
	public <T> T selectByCode(String code) {
		return service.selectByCode(code);
	}

	/**
	 * 产品R版本 右侧详细页显示
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/prop/data/{code}")
	@ResponseBody
	public String gridList(@PathVariable("code") String code, Integer id) {
		return service.buildPropertygrid(code,
				id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
	}

	/**
	 * 授权POP/CMO/IPMT执行秘书权限
	 */
	@RequestMapping("/data/setUserPower")
	@ResponseBody
	public void setUserPower(String userIpmt, String userCmo, String userPop) {
		List<UserRoleRelation> list = new ArrayList<>();
		List<Role> lstRoleAll = roleService.getRoles();
		String userCode = "";
		if (StringUtil.isNotEmpty(userIpmt)) {
			list.addAll(getRelation(lstRoleAll, "IPMT执行秘书", userIpmt));
		}
		if (StringUtil.isNotEmpty(userCmo)) {
			list.addAll(getRelation(lstRoleAll, "CMO", userCmo));
		}
		if (StringUtil.isNotEmpty(userPop)) {
			list.addAll(getRelation(lstRoleAll, "POP", userPop));
		}

		if (list != null && list.size() > 0) {
			userRoleRelationService.addUserRoleBatch(list);
		}
	}

	private List<UserRoleRelation> getRelation(List<Role> lstRoleAll, String roleName, String userCode) {
		List<UserRoleRelation> list = new ArrayList<>();
		Optional<Role> temp = lstRoleAll.stream().filter(o -> roleName.equals(o.getHrlName())).findFirst();
		if (temp.isPresent()) {
			for (String item : userCode.split(",")) {
				if (StringUtils.isNotBlank(item) && item.indexOf(" ") != -1) {
					User user = userService.selectByPCode(item);
					if (user != null) {
						UserRoleRelation relation = new UserRoleRelation();
						relation.setHurrHulCode(user.getUda10511());
						relation.setHurrHrlCode(temp.get().getHrlCode());
						list.add(relation);
					}
				}
			}
		}
		return list;
	}

	/**
	 * 跳转查看日志页面
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/log/list")
	@ResponseBody
	public ModelAndView list(String code) {
		String type = "";
		ModelAndView mv = new ModelAndView();
		// 截取code的前两位字符区分对象类型
		if (null != code) {
			if (code.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
				type = "PP";
			} else {
				type = code.substring(0, 2).toString();
			}
		}
		mv.addObject("code", code);
		mv.addObject("title", MapUtils.titleMap.get(type.toUpperCase()));
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("product/pages/logList");
		return mv;
	}

	/**
	 * 获取操作日志数据
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/log/listdata")
	@ResponseBody
	public String listdata(String code, int page, int rows, String searchStr) {

		// String searchStr = "";
		Map<String, Object> pageInfo = operationLogService.pageOfOperationLog(page, rows, searchStr, code);
		JSONObject json = new JSONObject();
		try {
			json.put("rows", pageInfo.get("rows"));
			json.put("total", pageInfo.get("total"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json.toString();
	}

	/**
	 * 获取更改前操作日志数据
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/log/getEditBefore")
	@ResponseBody
	public String getEditBefore(String code, String id) {
		String type = "";
		// 截取code的前两位字符区分对象类型
		if (null != code) {
			if (code.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
				type = "PP";
			} else {
				type = code.substring(0, 2).toString();
			}
		}
		Map<String, String> map = new HashMap<>();
		Map<String, Object> param = new HashMap<>();
		param.put("id", id);
		List<view_OperationLog> lstOparation = operationLogMapper.findByPage(param);
		List<Map<String, String>> list = colunmConfigMapper.getColunmConfigCode(type);
		// 所属父级关联名称
		JSONObject obj1 = new JSONObject(lstOparation.get(0).getOldvalue());
		if (obj1.has("plipmtno")) {
			IBDS_PLIPMT ipmt = service.selectByCode(obj1.get("plipmtno").toString());
			obj1.put("plipmt1", ipmt.getPlipmt());
		}
		if (obj1.has("prodlineno")) {
			ProdLineVew prodline = service.selectByCode(obj1.get("prodlineno").toString());
			obj1.put("prodline1", prodline.getProdline());
		}
		if (obj1.has("pdtno")) {
			PdtView pdt = service.selectByCode(obj1.get("pdtno").toString());
			obj1.put("pdt1", pdt.getPdt());
		}
		if (obj1.has("productno")) {
			ProductView product = service.selectByCode(obj1.get("productno").toString());
			obj1.put("product1", product.getProduct());
		}
		if (obj1.has("versionno")) {
			VersionView version = service.selectByCode(obj1.get("versionno").toString());
			obj1.put("version1", version.getVersion());
		}
		if (obj1.has("releaseno")) {
			ReleaseView release = service.selectByCode(obj1.get("releaseno").toString());
			obj1.put("release1", release.getRelease());
		}
		if (obj1.has("featureno")) {
			FeatureView feature = service.selectByCode(obj1.get("featureno").toString());
			obj1.put("feature1", feature.getFeature());
		}
		if (obj1.has("subsystemno")) {
			SubSystemView subsystem = service.selectByCode(obj1.get("subsystemno").toString());
			obj1.put("subsystem1", subsystem.getSubsystem());
		}
		if (obj1.has("moduleno")) {
			ModuleView module = service.selectByCode(obj1.get("moduleno").toString());
			obj1.put("module1", module.getModule());
		}

		if (obj1.has("bversioncname")) {
			/*
			 * Bversion_view bversion = bversionService.selectByCode(code); String name =
			 * ""; if (bversion != null &&
			 * !obj1.get("bversioncname").toString().contains(bversion.getRelease())) {
			 * 
			 * name += bversion.getRelease();
			 * 
			 * } if (obj1.has("release")) { name += obj1.get("release").toString(); } name
			 * += obj1.get("bversioncname").toString(); obj1.remove("bversioncname");
			 * obj1.put("bversioncname", name);
			 */

		}
		return EasyUIJSONUtils.buildPropertygridByCondition(list, obj1, service.selectByCode(code));
	}

	/**
	 * 获取更改前操作日志数据
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/log/getEditAfter")
	@ResponseBody
	public String getEditAfter(String code, String id) {
		String type = "";
		// 截取code的前两位字符区分对象类型
		if (null != code) {
			if (code.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
				type = "PP";
			} else {
				type = code.substring(0, 2).toString();
			}
		}
		Map<String, String> map = new HashMap<>();
		Map<String, Object> param = new HashMap<>();
		param.put("id", id);
		List<view_OperationLog> lstOparation = operationLogMapper.findByPage(param);
		List<Map<String, String>> list = colunmConfigMapper.getColunmConfigCode(type);
		// 所属父级关联名称
		JSONObject obj1 = new JSONObject(lstOparation.get(0).getNewvalue());
		if (obj1.has("plipmtno")) {
			IBDS_PLIPMT ipmt = service.selectByCode(obj1.get("plipmtno").toString());
			obj1.put("plipmt1", ipmt.getPlipmt());
		}
		if (obj1.has("prodlineno")) {
			ProdLineVew prodline = service.selectByCode(obj1.get("prodlineno").toString());
			obj1.put("prodline1", prodline.getProdline());
		}
		if (obj1.has("pdtno")) {
			PdtView pdt = service.selectByCode(obj1.get("pdtno").toString());
			obj1.put("pdt1", pdt.getPdt());
		}
		if (obj1.has("productno")) {
			ProductView product = service.selectByCode(obj1.get("productno").toString());
			obj1.put("product1", product.getProduct());
		}
		if (obj1.has("versionno")) {
			VersionView version = service.selectByCode(obj1.get("versionno").toString());
			obj1.put("version1", version.getVersion());
		}
		if (obj1.has("releaseno")) {
			ReleaseView release = service.selectByCode(obj1.get("releaseno").toString());
			obj1.put("release1", release.getRelease());
		}
		if (obj1.has("featureno")) {
			FeatureView feature = service.selectByCode(obj1.get("featureno").toString());
			obj1.put("feature1", feature.getFeature());
		}
		if (obj1.has("subsystemno")) {
			SubSystemView subsystem = service.selectByCode(obj1.get("subsystemno").toString());
			obj1.put("subsystem1", subsystem.getSubsystem());
		}
		if (obj1.has("moduleno")) {
			ModuleView module = service.selectByCode(obj1.get("moduleno").toString());
			obj1.put("module1", module.getModule());
		}

		if (obj1.has("bversioncname")) {
			/*
			 * Bversion_view bversion = bversionService.selectByCode(code); String name =
			 * ""; if (bversion != null &&
			 * !obj1.get("bversioncname").toString().contains(bversion.getRelease())) {
			 * 
			 * name += bversion.getRelease();
			 * 
			 * } if (obj1.has("release")) { name += obj1.get("release").toString(); } name
			 * += obj1.get("bversioncname").toString(); obj1.remove("bversioncname");
			 * obj1.put("bversioncname", name);
			 */

		}
		return EasyUIJSONUtils.buildPropertygridByCondition(list, obj1, service.selectByCode(code));
	}

	@RequestMapping("/download")
	@ResponseBody
	public void download(HttpServletResponse response, HttpServletRequest request, String fileUrl) {
		try {
			File file = new File(fileUrl);
			String filename = file.getName();
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(filePath + fileUrl));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();

			response.setContentType("application/octet-stream;charset=UTF-8");
			String fileName = new String(filename.getBytes("gb2312"), "iso8859-1");
			response.setHeader("Content-disposition", "attachment;filename=" + fileName);
			OutputStream ouputStream = response.getOutputStream();
			ouputStream.write(buffer);
			ouputStream.flush();
			ouputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/export")
	public void Export(String type, String searchParas, String[] projectStatus, HttpServletResponse response) {

		String fileName = "IPMT";
		switch (type) {
		case "pi":
			fileName = "IPMT";
			break;
		case "pl":
			fileName = "产品线";
			break;
		case "pt":
			fileName = "PDT";
			break;
		case "pp":
			fileName = "研发产品";
			break;
		case "pv":
			fileName = "产品V级";
			break;
		case "pr":
			fileName = "产品R级";
			break;
		case "pb":
			fileName = "产品B级";
			break;
		case "pj":
			fileName = "研发项目";
			break;
		case "bl":
			fileName = "基线版本";
			break;
		case "ft":
			fileName = "特性";
			break;
		case "sf":
			fileName = "子特性";
			break;
		case "tm":
			fileName = "项目组T";
			break;
		case "ss":
			fileName = "子系统";
			break;
		case "md":
			fileName = "模块";
			break;
		case "mv":
			fileName = "模块版本";
			break;
		}
		response.setContentType("application/vnd.ms-excel");
		response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName) + ".xlsx");
		Workbook workbook = service.getExcel(fileName, type.toUpperCase(), searchParas, projectStatus);

		try {
			workbook.write(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭资源
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@RequestMapping("/exportByMail")
	public void ExportByMail(String type, String searchParas, String[] projectStatus) {

		String fileName = "IPMT";
		switch (type) {
		case "pi":
			fileName = "IPMT";
			break;
		case "pl":
			fileName = "产品线";
			break;
		case "pt":
			fileName = "PDT";
			break;
		case "pp":
			fileName = "研发产品";
			break;
		case "pv":
			fileName = "产品V级";
			break;
		case "pr":
			fileName = "产品R级";
			break;
		case "pb":
			fileName = "产品B级";
			break;
		case "pj":
			fileName = "研发项目";
			break;
		case "bl":
			fileName = "基线版本";
			break;
		case "ft":
			fileName = "特性";
			break;
		case "sf":
			fileName = "子特性";
			break;
		case "tm":
			fileName = "项目组";
			break;
		case "ss":
			fileName = "子系统";
			break;
		case "md":
			fileName = "模块";
			break;
		case "mv":
			fileName = "模块版本";
			break;
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Workbook workbook = service.getExcel(fileName, type.toUpperCase(), searchParas, projectStatus);
		try {
			workbook.write(baos);
			baos.flush();
			byte[] bt = baos.toByteArray();
			InputStream is = new ByteArrayInputStream(bt, 0, bt.length);
			List<String> lst = new ArrayList<>();
			lst.add((String) SecurityUtils.getSubject().getPrincipal() + "@h3c.com");
			mailService.sendMail((String) SecurityUtils.getSubject().getPrincipal(), "", fileName + "导出数据", "",
					fileName, is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭资源
				baos.close();
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
