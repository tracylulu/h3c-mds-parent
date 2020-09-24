package com.h3c.mds.flowable.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.h3c.mds.flowable.service.view_ProcessConfigPersonService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.flowable.service.ProcessConfigPersonService;
import com.h3c.mds.flowable.entity.view_ProcessConfigPerson;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/flowable/processConfigPerson")
public class ProcessConfigPersonController {
	
	@Autowired
	private  view_ProcessConfigPersonService v_ProcessPersonService;
	@Autowired
	private ProcessConfigPersonService processConfigPersonService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	@ResponseBody
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "人员信息");
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("/flowable/processConfigPerson/list");

		return mv;
	}

	@RequestMapping("/listData")
	@ResponseBody
	public Object listData(String id, String searchParas) {
		Map<String, String> searchMap = new HashMap<>();
		
		if(StringUtil.isNotEmpty(id)&&id.indexOf("_")!=-1) {
			String[] code=id.split("_");
			searchMap.put("id", id.split("_")[0]);
			searchMap.put("code", code[1]);			
		}else {
			searchMap.put("id", id);			
		}
		
		searchMap.put("searchParas", searchParas);
		List<view_ProcessConfigPerson> lst = v_ProcessPersonService.getTreeData(searchMap);

		return id != null&&id.split("_").length>1 ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst);
	}

	@RequestMapping("/add")
	@ResponseBody
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("title", "人员配置");
		mv.addObject("id", 0);
		mv.setViewName("/flowable/processConfigPerson/add");

		return mv;
	}

	@RequestMapping(value="/configPersonAdd",produces="text/html;chartset=utf-8")
	@ResponseBody
	public ResponseResult addConfig(ProcessConfigPerson processConfigPerson) {
		
		try {
			Map<String,String> params=new HashMap<>();
			params.put("processCode", processConfigPerson.getProcessCode());
			params.put("roleCode", processConfigPerson.getProcessRoleCode());
			params.put("deptCode", processConfigPerson.getDeptCode());
			
			int count=processConfigPersonService.checkRepeat(params);
			if(count>0) {
				return ResponseResult.fail(false, "当前角色和部门下已配置人员");
			}
			
			String checkerName=processConfigPerson.getCheckerName();
			if(StringUtil.isEmpty(checkerName)||checkerName.indexOf(" ")==-1) {
				return ResponseResult.fail(false, "人员信息填写有误！");
			}
			
			User user=userService.selectByCode(checkerName.split(" ")[1]);
			
			if(user==null) {
				return ResponseResult.fail(false, "为查找到当前人员信息！");
			}
			processConfigPerson.setCheckerId(user.getUda10511());
			processConfigPerson.setCreateUser(UserUtil.getUserId());
			processConfigPerson.setCreateDate(new Date());
			processConfigPerson.setModifyDate(new Date());
			processConfigPerson.setModifyUser(UserUtil.getUserId());
			
			processConfigPersonService.create(processConfigPerson);

			return ResponseResult.success(true, "ok");
    	} catch (Exception e) {
    		return ResponseResult.fail(false, e.getMessage());
    	}
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("title", "人员配置");
		mv.addObject("id", id);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("IsEdit", true);
		mv.setViewName("/flowable/processConfigPerson/add");

		return mv;
	}

	@RequestMapping(value="/configPersonEdit",produces="text/html;charset=utf-8")
	@ResponseBody
	public Object editConfig(ProcessConfigPerson processConfigPerson) {
		
		try {
			Map<String,String> params=new HashMap<>();
			params.put("processCode", processConfigPerson.getProcessCode());
			params.put("roleCode", processConfigPerson.getProcessRoleCode());
			params.put("deptCode", processConfigPerson.getDeptCode());
			params.put("id", processConfigPerson.getId().toString());
			
			int count=processConfigPersonService.checkRepeat(params);
			if(count>0) {
				return ResponseResult.fail(false, "当前角色和部门下已配置人员");
			}
			
			String checkerName=processConfigPerson.getCheckerName();
			if(StringUtil.isEmpty(checkerName)||checkerName.indexOf(" ")==-1) {
				return ResponseResult.fail(false, "人员信息填写有误！");
			}
			
			User user=userService.selectByCode(checkerName.split(" ")[1]);
			
			if(user==null) {
				return ResponseResult.fail(false, "未查找到当前人员信息！");
			}
			processConfigPerson.setCheckerId(user.getUda10511());
			processConfigPerson.setModifyDate(new Date());
			processConfigPerson.setModifyUser(UserUtil.getUserId());
			
			processConfigPersonService.update(processConfigPerson);
			return ResponseResult.success(true, "ok");
    	} catch (Exception e) {
    		return ResponseResult.fail(false, e.getMessage());
    	}

	}

	@RequestMapping("/getByCode/{id}")
	@ResponseBody
	public ResponseResult getByid(@PathVariable int id) {
		try {
			/* processConfigService.getByCode(code) */
			return ResponseResult.success(processConfigPersonService.selectByPrimaryKey(id));
		} catch (Exception e) {

			return ResponseResult.fail("根据id获取失败");
		}

	}

}
