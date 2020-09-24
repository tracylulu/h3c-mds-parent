package com.h3c.mds.dept.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.dept.entity.view_DeptOperationLog;
import com.h3c.mds.dept.service.IbdsDeptOperationLogService;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

import net.sf.json.JSONException;

@RestController
@RequestMapping("/dept/log")
public class DeptOperationLogController {
	@Autowired
	private IbdsDeptOperationLogService logService;
	
	public static Map<String, String> mapColumn = new HashMap<>();

	static {
		mapColumn.put("code", "SAP编码");
		mapColumn.put("name", "部门名称");
		mapColumn.put("nameeng", "部门英文名称");
		mapColumn.put("manager", "主管ID");
		mapColumn.put("secretary", "秘书ID");
		mapColumn.put("deptplanner", "部门计划员");
		//部门审批人员以后默认为部门主管
		//mapColumn.put("approver", "部门审批人员");
		mapColumn.put("abbreviation", "部门简称");
		mapColumn.put("planapprover", "计划处审批人员");
		mapColumn.put("pr", "PR录入人员");
		mapColumn.put("consignor", "委托机要员");		
	}
	
	@RequestMapping("/list")
	public ModelAndView list(String code) {
		ModelAndView mv=new ModelAndView();		
		mv.addObject("id_suffix", new Date().getTime());		
		mv.addObject("code", code);	
		mv.setViewName("dept/SecondDept/deptLogList");
		return mv;
	}
	
	@RequestMapping("/listData")
	public String getListData(String code, Integer page, Integer rows, String searchStr) {
		Map<String,Object> param=new HashMap<>();
		param.put("searchStr", searchStr);
		param.put("code", code);
		PageInfo<view_DeptOperationLog> pageInfo = logService.pageOfDeptOptLog(page, rows, param);
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
	
	/**
	 * 获取更改前操作日志数据
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/getEditBefore")
	@ResponseBody
	public String getEditBefore(String code, String id) {
		Map<String, Object> param = new HashMap<>();
		param.put("id", id);
		view_DeptOperationLog vOptLog = logService.getDeptOptLogById(param);
		// 所属父级关联名称
		JSONObject objEntity = new JSONObject(vOptLog.getOldvalue());	
		
		return EasyUIJSONUtils.buildDeptLogPropertygrid(mapColumn, objEntity, vOptLog.getDeptname());
	}

	/**
	 * 获取更改前操作日志数据
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/getEditAfter")
	@ResponseBody
	public String getEditAfter(String code, String id) {
		String type = "";
		// 截取code的前两位字符区分对象类型

		Map<String, String> map = new HashMap<>();
		Map<String, Object> param = new HashMap<>();
		param.put("id", id);
		view_DeptOperationLog vOptLog = logService.getDeptOptLogById(param);
		// 所属父级关联名称
		JSONObject objEntity = new JSONObject(vOptLog.getNewvalue());	
		
		return EasyUIJSONUtils.buildDeptLogPropertygrid(mapColumn, objEntity, vOptLog.getDeptname());
	}

}
