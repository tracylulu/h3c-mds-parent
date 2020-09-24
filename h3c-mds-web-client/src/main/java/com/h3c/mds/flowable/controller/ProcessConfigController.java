package com.h3c.mds.flowable.controller;

import org.springframework.stereotype.*;

import com.alibaba.fastjson.JSON;
import com.h3c.mds.flowable.entity.ProcessConfig;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.ProcessConfigService;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.map.MapUtils;

import net.sf.json.JSONException;

import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*import org.json.JSONObject;*/
import org.json.JSONArray;
import java.util.Date;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.*;

@Controller
@RequestMapping("/flowable/processConfig")
public class ProcessConfigController {
	@Autowired
	private ProcessConfigService processConfigService;

	@RequestMapping("list")
	@ResponseBody
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "基础信息");
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("/flowable/processConfig/list");

		return mv;
	}

	@RequestMapping("/listData")
	@ResponseBody
	public Object listData(String id, String searchParas) {
		Map<String, String> searchMap = new HashMap<>();

		searchMap.put("id", id);
		searchMap.put("searchParas", searchParas);
		List<ProcessConfigItem> lst = processConfigService.getTreeData(searchMap);

		return id != null ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst);
	}

	@RequestMapping("/add")
	@ResponseBody
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("title", "基础信息配置");
		mv.addObject("code", "");
		mv.setViewName("/flowable/processConfig/add");

		return mv;
	}

	@RequestMapping(value="/configAdd",produces="text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult addConfig(ProcessConfig processConfig, String inserted, String updated, String deleted) {
		processConfig.setCreateUser(UserUtil.getUserId());
		processConfig.setCreateDate(new Date());
		processConfig.setModifyUser(UserUtil.getUserId());
		processConfig.setModifyDate(new Date());

		List<ProcessConfigItem> lstAdd = new ArrayList<ProcessConfigItem>();
		List<ProcessConfigItem> lstUpdate = new ArrayList<ProcessConfigItem>();
		List<ProcessConfigItem> lstDelete = new ArrayList<ProcessConfigItem>();
		List<String> lstCode = new ArrayList<String>();

		if (StringUtil.isNotEmpty(inserted)) {
			lstAdd = JSONObject.parseArray(inserted, ProcessConfigItem.class);
			lstAdd.stream().forEach(item -> {
				lstCode.add(item.getCode());
			});
		}
		if (StringUtil.isNotEmpty(updated)) {
			lstUpdate = JSONObject.parseArray(updated, ProcessConfigItem.class);
			lstUpdate.stream().forEach(item -> {
				lstCode.add(item.getCode());
			});
		}
		if (StringUtil.isNotEmpty(deleted)) {
			lstDelete = JSONObject.parseArray(deleted, ProcessConfigItem.class);
			lstUpdate.stream().forEach(item -> {
				lstCode.add(item.getCode());
			});
		}

		processConfigService.create(processConfig, lstAdd, lstUpdate, lstDelete, UserUtil.getUserId());

		return ResponseResult.success(true, "ok");
	}

	@RequestMapping("/edit/{code}")
	public ModelAndView edit(@PathVariable("code") String code) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("title", "基础信息配置");
		mv.addObject("code", code);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("IsEdit", true);
		mv.setViewName("/flowable/processConfig/add");

		return mv;
	}

	@RequestMapping(value="/configEdit",produces="text/html;charset=utf-8")
	@ResponseBody
	public Object editConfig(ProcessConfig processConfig, String inserted, String updated, String deleted) {
		
		try {
			List<ProcessConfigItem> lstAdd = new ArrayList<ProcessConfigItem>();
			List<ProcessConfigItem> lstUpdate = new ArrayList<ProcessConfigItem>();
			List<ProcessConfigItem> lstDelete = new ArrayList<ProcessConfigItem>();
			List<String> lstCode = new ArrayList<String>();

			if (StringUtil.isNotEmpty(inserted)) {
				lstAdd = JSONObject.parseArray(inserted, ProcessConfigItem.class);
			}
			if (StringUtil.isNotEmpty(updated)) {
				lstUpdate = JSONObject.parseArray(updated, ProcessConfigItem.class);
			}
			if (StringUtil.isNotEmpty(deleted)) {
				lstDelete = JSONObject.parseArray(deleted, ProcessConfigItem.class);
			}

			processConfigService.update(processConfig, lstAdd, lstUpdate, lstDelete, UserUtil.getUserId());

			return ResponseResult.success(true, "ok");
    	} catch (Exception e) {
    		return ResponseResult.fail(false, e.getMessage());
    	}

	}

	@RequestMapping(value="/getByCode/{code}")
	@ResponseBody
	public ResponseResult getByCode(@PathVariable String code) {
		try {
			return ResponseResult.success(processConfigService.getByCode(code));
		} catch (Exception e) {

			return ResponseResult.fail("根据id获取失败");
		}

	}
	
	@RequestMapping(value="/getComboxList")
	@ResponseBody
	public List<ProcessConfig> getComboxList() {
		
		List<ProcessConfig> lst = processConfigService.getComboxList();
		return lst;

	}

}
