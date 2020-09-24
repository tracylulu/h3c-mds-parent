package com.h3c.mds.basicinfo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientApplyList;
import com.h3c.mds.basicinfo.entity.view_ProductApplyList;
import com.h3c.mds.basicinfo.service.view_ProductApplyListService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

import net.sf.json.JSONException;

@Controller
@RequestMapping("/basicinfo")
public class ProductListController {

	@Autowired
	private view_ProductApplyListService productApplyListService;

	@Autowired
	private UserService userService;

	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("/productList/list/{pages}")
	@ResponseBody
	public ModelAndView getByLineNo(@PathVariable("pages") String pages) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("page", pages);
		if (pages.equals("DF")) {
			mv.setViewName("basicinfo/productList/DifficultyCoefficientList");
		} else {
			mv.setViewName("basicinfo/productList/list");
		}
		return mv;
	}

	@RequestMapping("/productList/listdata")
	@ResponseBody
	public String Treedata(String id, String searchStr, String type) {

		String mark = "";

		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		if (type == "" || type == null) {
			type = "PP";
		}
		searchMap.put("type", type.trim());
		if (id != "" && id != null) {
			if (id.contains("_")) {
				searchMap.put("applytype", id.split("_")[1]);
				searchMap.put("prodlineno", id.split("_")[0]);
				// searchMap.put("code", id.split("_")[2]);
				mark = "PP";
			} else {
				searchMap.put("prodlineno", id);

			}

		}
		if (searchStr != "" && searchStr != null) {
			searchMap.put("searchParam", searchStr);
		}
		// 获取当前用户角色 李卫娜提的管理员能看全部 by20191127
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 更改 王萍提出:权限控制：自己能查自己的流程，以及自己处理过的流程 by20191120
		String userId = (String) SecurityUtils.getSubject().getPrincipal();
		List<view_ProductApplyList> lst = new ArrayList<view_ProductApplyList>();

		if (roleCode.contains("R_000001")) {// 管理员查询所有
			searchMap.put("users", "all");
			// 根据不同参数查询R版本树
			lst = productApplyListService.getProductApplyList(searchMap);
		} else if (StringUtil.isNotEmpty(userId)) {
			User users = userService.getUserByAccount(userId);
			if (users != null && StringUtil.isNotEmpty(users.getUda10509())
					&& StringUtil.isNotEmpty(users.getUda10512())) {
				searchMap.put("users", users.getUda10509() + " " + users.getUda10512());
				// 根据不同参数查询R版本树
				lst = productApplyListService.getProductApplyList(searchMap);
			}
		}

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return mark != "" && mark.equals("PP") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst);

	}

	@RequestMapping("/productList/difficultyListdata")
	@ResponseBody
	public String Treedifficultydata(String id, String searchStr) {

		String type = "";

		// 查询参数放入Map中
		Map<String, Object> searchMap = new HashMap<>();
		if (id != "" && id != null) {
			type = id.substring(0, 2).toString();
			;
		}
		searchMap.put("type", type);
		searchMap.put("prodlineno", id);

		if (searchStr != "" && searchStr != null) {
			searchMap.put("searchParam", searchStr);
		}

		// 获取当前用户角色 李卫娜提的管理员能看全部 by20191127
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");

		// 更改 王萍提出:权限控制：自己能查自己的流程，以及自己处理过的流程 by20191120
		String userId = (String) SecurityUtils.getSubject().getPrincipal();
		List<view_DifficultyCoefficientApplyList> lst = new ArrayList<view_DifficultyCoefficientApplyList>();
		if (roleCode.contains("R_000001")) {// 管理员查询所有
			searchMap.put("users", "all");
			// 根据不同参数查询R版本树
			lst = productApplyListService.getDifficultyCoefficientApplyList(searchMap);
		} else if (StringUtil.isNotEmpty(userId)) {
			User users = userService.getUserByAccount(userId);
			if (users != null && StringUtil.isNotEmpty(users.getUda10509())
					&& StringUtil.isNotEmpty(users.getUda10512())) {
				searchMap.put("users", users.getUda10509() + " " + users.getUda10512());
				// 根据不同参数查询R版本树
				lst = productApplyListService.getDifficultyCoefficientApplyList(searchMap);
			}
		}

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != "" && type.equals("PP") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst);

	}

	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("/productList/dataView")
	@ResponseBody
	public ModelAndView getDataGridList() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("basicinfo/productList/productDataGridList");
		return mv;
	}

	@RequestMapping("/productList/listdatagrid")
	@ResponseBody
	public String listdata(int page, int rows, String searchStr, String applytype) {
		Map<String, Object> param = new HashMap<>();
		param.put("searchParam", searchStr);
		param.put("applytype", applytype);
		// 获取当前用户角色 李卫娜提的管理员能看全部 by20191127
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		String userId = (String) SecurityUtils.getSubject().getPrincipal();
		PageInfo<view_ProductApplyList> pageInfo = new PageInfo<view_ProductApplyList>();
		if (roleCode.contains("R_000001")) {// 管理员查询所有
			param.put("users", "all");
			pageInfo = productApplyListService.pageOfProductApplyDataGridList(page, rows, param);
		} else if (StringUtil.isNotEmpty(userId)) {
			User users = userService.getUserByAccount(userId);
			if (users != null && StringUtil.isNotEmpty(users.getUda10509())
					&& StringUtil.isNotEmpty(users.getUda10512())) {
				param.put("users", users.getUda10509() + " " + users.getUda10512());
				pageInfo = productApplyListService.pageOfProductApplyDataGridList(page, rows, param);
			}
		}
		JSONObject json = new JSONObject();
		try {
			json.put("rows", pageInfo.getList());
			json.put("total", pageInfo.getTotal());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json.toString();
	}

}
