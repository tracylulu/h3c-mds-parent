package com.h3c.mds.product.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.service.ComboboxService;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.utils.combobox.ComboBoxData;

@RestController
@RequestMapping("/product")
public class ComboboxController {
	@Autowired
	private ComboboxService comboboxService;

	@Autowired
	private DicService dicService;

	/**
	 * 下拉框初始化
	 * 
	 * @param id
	 * @param searchParas
	 * @param projectStatus
	 * @return
	 */
	@RequestMapping("/comboboxdata/list")
	public List<ComboBoxData> dataCombobox(HttpServletRequest request, String type, String code, String sub_code) {
		// 查询参数放入Map中
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		String[] codes;
		if (code.contains(",")) {
			codes = code.split(",");
			param.put("codes", codes);
		} else {
			param.put("code", code);
		}
		param.put("sub_code", sub_code);
		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}
		// 根据不同参数查询
		return comboboxService.getCombobox(param);

	}

	@RequestMapping("/comboboxdata/listWithEng")
	public List<ComboBoxData> dataComboboxWithEng(HttpServletRequest request, String type, String code,
			String sub_code) {
		// 查询参数放入Map中
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		String[] codes;
		if (code.contains(",")) {
			codes = code.split(",");
			param.put("codes", codes);
		} else {
			param.put("code", code);
		}
		param.put("sub_code", sub_code);
		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}
		// 根据不同参数查询
		return comboboxService.getComboboxWithEng(param);

	}

	/**
	 * 下拉查询，带ID
	 * 
	 * @param request
	 * @param type
	 * @param code
	 * @param sub_code
	 * @return
	 */
	@RequestMapping("/comboboxdata/listWithId")
	public List<ComboBoxData> dataComboboxWithID(HttpServletRequest request, String type, String code,
			String sub_code) {
		// 查询参数放入Map中
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		String[] codes;
		String codeItem = "";
		Integer id;
		StringBuilder sbCode = new StringBuilder();
		StringBuilder sbId = new StringBuilder();

		if (code.contains(",")) {
			codes = code.split(",");
			for (String strCode : codes) {
				if (strCode.contains("_")) {
					codeItem = strCode.split("_")[0];
					sbCode.append(codeItem + ",");
					id = Integer.valueOf(strCode.split("_")[1] != null ? strCode.split("_")[1] : "0");
					sbId.append(id.toString() + ",");
				} else {
					sbCode.append(strCode + ",");
				}
			}

			param.put("codes", sbCode.toString().split(","));
			param.put("ids", sbId.toString().split(","));
		} else {
			param.put("code", code.contains("_") ? code.split("_")[0] : code);
			param.put("id", code.contains("_") ? Integer.valueOf(code.split("_")[1]) : 0);
		}
		StringBuilder subId = new StringBuilder();
		Integer subids;

		if (sub_code.contains("_")) {
			if (sub_code.contains(",")) {
				for (String sub_id : sub_code.split(",")) {
					if (sub_id.contains("_")) {
						subids = Integer.valueOf(sub_id.split("_")[1] != null ? sub_id.split("_")[1] : "0");
						subId.append(subids.toString() + ",");
					}
				}
				param.put("current_id", subId.toString().split(","));
			} else if (sub_code.contains("\r\n")) {
				for (String sub_id : sub_code.split("\r\n")) {
					if (sub_id.contains("_")) {
						subids = Integer.valueOf(sub_id.split("_")[1] != null ? sub_id.split("_")[1] : "0");
						subId.append(subids.toString() + ",");
					}
				}
				param.put("current_id", subId.toString().split(","));
			} else {
				subId.append(sub_code.split("_")[1] + ",");
				param.put("current_id", subId.toString().split(","));
			}
		}

		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}
		// 根据不同参数查询
		return comboboxService.getComboboxWithId(param);

	}

	/**
	 * 下拉查询，带ID
	 * 
	 * @param request
	 * @param type
	 * @param code
	 * @param sub_code
	 * @return
	 */
	@RequestMapping("/comboboxdata/getDatagridWithId")
	public List<ComboBoxData> getDatagridWithId(HttpServletRequest request, String type, String code, String sub_code,
			String searchStr) {
		// 查询参数放入Map中
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		param.put("searchStr", searchStr);
		String[] codes;
		String codeItem = "";
		Integer id;
		StringBuilder sbCode = new StringBuilder();
		StringBuilder sbId = new StringBuilder();

		if (code.contains(",")) {
			codes = code.split(",");
			for (String strCode : codes) {
				if (strCode.contains("_")) {
					codeItem = strCode.split("_")[0];
					sbCode.append(codeItem + ",");
					id = Integer.valueOf(strCode.split("_")[1] != null ? strCode.split("_")[1] : "0");
					sbId.append(id.toString() + ",");
				} else {
					sbCode.append(strCode + ",");
				}
			}

			param.put("codes", sbCode.toString().split(","));
			param.put("ids", sbId.toString().split(","));
		} else {
			param.put("code", code.contains("_") ? code.split("_")[0] : code);
			param.put("id", code.contains("_") ? Integer.valueOf(code.split("_")[1]) : 0);
		}
		StringBuilder subId = new StringBuilder();
		Integer subids;

		if (sub_code.contains("_")) {
			if (sub_code.contains(",")) {
				for (String sub_id : sub_code.split(",")) {
					if (sub_id.contains("_")) {
						subids = Integer.valueOf(sub_id.split("_")[1] != null ? sub_id.split("_")[1] : "0");
						subId.append(subids.toString() + ",");
					}
				}
				param.put("current_id", subId.toString().split(","));
			} else if (sub_code.contains("\r\n")) {
				for (String sub_id : sub_code.split("\r\n")) {
					if (sub_id.contains("_")) {
						subids = Integer.valueOf(sub_id.split("_")[1] != null ? sub_id.split("_")[1] : "0");
						subId.append(subids.toString() + ",");
					}
				}
				param.put("current_id", subId.toString().split(","));
			} else {
				subId.append(sub_code.split("_")[1] + ",");
				param.put("current_id", subId.toString().split(","));
			}
		}

		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}
		// 根据不同参数查询
		return comboboxService.getDatagridWithId(param);

	}

	@RequestMapping("/comboboxdata/getdataList")
	public List<ComboBoxData> getdataList(HttpServletRequest request, String type, String code, String sub_code) {
		// 查询参数放入Map中
		Map<String, String> param = new HashMap<>();
		param.put("type", type);
		param.put("code", code);
		param.put("sub_code", sub_code);
		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}
		// 根据不同参数查询
		return comboboxService.getdataList(param);

	}

	/**
	 * 字典下拉框数据初始化
	 * 
	 * @param id
	 * @param searchParas
	 * @param projectStatus
	 * @return
	 */
	@RequestMapping("/comboboxDicdata/list")
	public List<ComboBoxData> datacomboboxDic(String type) {

		// 查询参数放入Map中
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		param.put("typeCode", "dic");
		// 根据不同参数查询
		return comboboxService.getCombobox(param);

	}

	/**
	 * 获取父V版本 基线版本 路标版本
	 * 
	 * @param type
	 * @param code
	 * @return
	 */
	@RequestMapping("/combobox/getparentitemnoByCode")
	public List<ComboBoxData> getparentitemnoByCode(String type, String code, String searchParas) {
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		param.put("code", code);
		return comboboxService.getCombobox(param);
	}

	/**
	 * 获取父V版本 基线版本 路标版本
	 * 
	 * @param type
	 * @param code
	 * @return
	 */
	@RequestMapping("/combobox/getparentitemnoByParas")
	public List<ComboBoxData> getparentitemnoByParas(String type, String code, String searchParas) {
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		param.put("code", code);
		param.put("searchParas", searchParas);
		return comboboxService.getCombobox(param);
	}

	/**
	 * 提供给产品R级以下和难度系数 产品R级以下和难度系数中下拉框的数据应该从产品R级获取
	 * 
	 * @param param
	 * @return
	 */
	@RequestMapping("/comboboxdata/Releaselist")
	public List<ComboBoxData> dataReleaseCombobox(HttpServletRequest request, String type, String UpperCode,
			String code, String sub_code) {
		// 查询参数放入Map中
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		String[] codes;
		if (code.contains(",")) {
			codes = code.split(",");
			param.put("codes", codes);
		} else {
			if (UpperCode.contains("_")) {
				for (String splCode : UpperCode.split("_")) {
					if (StringUtil.isNotEmpty(splCode)) {
						switch (splCode.substring(0, 2).toUpperCase().toString()) {
						case "PI":
							param.put("plipmtNo", splCode);
							break;
						case "PL":
							param.put("prodlineNo", splCode);
							break;
						case "PP":
							param.put("productNo", splCode);
							break;
						case "PV":
							param.put("versionNo", splCode);
							break;
						case "PR":
							param.put("releaseNo", splCode);
							break;
						}
					}
				}
			}
			param.put("code", code);

		}
		param.put("sub_code", sub_code);
		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}
		// 根据不同参数查询
		return comboboxService.getReleaseCombobox(param);

	}
}
