package com.h3c.mds.product.web.controller;

import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.view_StopUsingProducts;
import com.h3c.mds.product.service.view_StopUsingProductsService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.utils.common.SearchParamUtils;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.map.MapUtils;

import net.sf.json.JSONException;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.*;

@Controller
@RequestMapping("/product")
public class StopUsingProductsController {

	@Autowired
	private view_StopUsingProductsService StopUsingProductsService;
	@Autowired
	private SearchParamUtils searchParamUtils;

	@RequestMapping("/StopUsingProducts/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "已停用");
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("isAdmin",UserUtil.checkIsAdmin());
		mv.setViewName("product/StopUsingProducts/list");
		return mv;
	}

	@RequestMapping("/StopUsingProducts/Treelist")
	public ModelAndView Treelist() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("title", "多层");
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("isAdmin",UserUtil.checkIsAdmin());
		mv.setViewName("product/StopUsingProducts/TreeList");
		return mv;
	}

	@RequestMapping("/StopUsingProducts/listdata")
	@ResponseBody
	public String listdata(int page, int rows, String searchStr,String proType) {

		PageInfo<view_StopUsingProducts> pageInfo = StopUsingProductsService.pageOfStopUsingProducts(page, rows,
				searchStr,proType);
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
	
	@RequestMapping("/StopUsingProducts/listTreedata")
	@ResponseBody
	public Object Treedate(String id, String searchStr, String proType) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {

			type = id.substring(0, 2).toString();
		}
		
		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchStr", searchStr);
		searchMap.put("proType", proType);
		
		searchMap=searchParamUtils.setSearchParamFromProdLine(type, searchMap, id);
		
		// 根据不同参数查询R版本树
		List<view_StopUsingProducts> lst = StopUsingProductsService.selectTreeGrid(searchMap);

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != null && type.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst);

	}

}
