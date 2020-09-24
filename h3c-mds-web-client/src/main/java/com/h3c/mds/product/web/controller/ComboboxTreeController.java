package com.h3c.mds.product.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.service.IBDS_BaseLineService;
import com.h3c.mds.product.service.ReleaseViewService;
import com.h3c.mds.utils.common.SearchParamUtils;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.map.MapUtils;

@Controller
@RequestMapping("/product")
public class ComboboxTreeController {
	@Autowired
	private ReleaseViewService releaseService;

	@Autowired
	private IBDS_BaseLineService baselineService;
	@Autowired
	private SearchParamUtils searchParamUtils;

	/**
	 * 下拉树框初始化
	 * 
	 * @param id
	 * @param searchParas
	 * @param projectStatus
	 * @return
	 */
	@RequestMapping("/comboboxtree/{type}")
	public Object pagesCombobox(@PathVariable("type") String type) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("title", MapUtils.titleMap.get(type.toUpperCase()));
		mv.addObject("type", type);
		mv.setViewName("product/comboboxtree/list");
		// 根据不同参数查询
		return mv;// "product/comboboxtree/list";

	}

	/**
	 * 下拉树框初始化
	 * 
	 * @param id
	 * @param searchParas
	 * @param projectStatus
	 * @return
	 */
	@RequestMapping("/comboboxtree/prdata")
	@ResponseBody
	public Object dataCombobox(String id) {
		try {

			// 定义回传id类型(内码前缀),用于树节点展开时使用
			String typeData = null;
			// 截取code的前两位字符区分对象类型
			if (null != id) {

				typeData = id.substring(0, 2).toString();
			} else {
				id = "PL000024";
				typeData = id.substring(0, 2).toString();

			}

			Map<String, Object> param = new HashMap<>();
			param.put("type", typeData);
			param.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);
			List<ReleaseView> lstRd = releaseService.getSoftware(param);
			return typeData != null && typeData.equals("PT") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);

		} catch (Exception e) {

		}
		return null;

	}

	/**
	 * 下拉树框初始化
	 * 
	 * @param id
	 * @param searchParas
	 * @param projectStatus
	 * @return
	 */
	@RequestMapping("/comboboxtree/bldata")
	@ResponseBody
	public Object bldataCombobox(String id) {
		try {
			// 定义回传id类型(内码前缀),用于树节点展开时使用
			String typeData = null;
			// 截取code的前两位字符区分对象类型
			if (null != id) {

				typeData = id.substring(0, 2).toString();
			} else {
				List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
				Map<String, Object> map = new HashMap<>();
				map.put("state", "closed");
				map.put("iconCls", "icon-ok");
				map.put("prodlineno", "PL000024");
				map.put("prodline", "软件平台");
				map.put("release", "");
				map.put("releaseno", "");
				lst.add(map);
				return lst;
			}

			Map<String, String> param = new HashMap<>();
			param.put("type", typeData);
			param.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);

			List<BaseLineView> lstRd = baselineService.getBaseLineSowtWare(param);
			return typeData != null && typeData.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);

		} catch (Exception e) {

		}
		return null;

	}

	/**
	 * 平台版本号初始化
	 * 
	 * @param id
	 * @param searchParas
	 * @param projectStatus
	 * @return
	 */
	@RequestMapping("/treegrid/bldata")
	@ResponseBody
	public Object bldatatree(String id, String searchStr) {
		try {
			// 定义回传id类型(内码前缀),用于树节点展开时使用
			String typeData = null;
			// 截取code的前两位字符区分对象类型
			if (null != id) {

				typeData = id.substring(0, 2).toString();
			} else {
				List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
				Map<String, Object> map = new HashMap<>();
				map.put("state", "closed");
				map.put("iconCls", "icon-ok");
				map.put("prodlineno", "PL000024");
				map.put("prodline", "软件平台");
				map.put("release", "");
				map.put("releaseno", "");
				lst.add(map);
				return lst;
			}

			Map<String, String> param = new HashMap<>();
			param.put("type", typeData);
			param.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);
			param.put("searchParas", searchStr);
			List<BaseLineView> lstRd = baselineService.getBaseLineSowtWare(param);
			return typeData != null && typeData.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);

		} catch (Exception e) {

		}
		return null;

	}

}
