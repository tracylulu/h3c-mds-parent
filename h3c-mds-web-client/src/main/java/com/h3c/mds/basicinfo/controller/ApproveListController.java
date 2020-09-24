package com.h3c.mds.basicinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.h3c.mds.basicinfo.entity.view_ApproveList;
import com.h3c.mds.basicinfo.service.view_ApproveListService;

import net.sf.json.JSONException;

@RestController
@RequestMapping("/basic/ApproveList")
public class ApproveListController {

	@Autowired
	private view_ApproveListService approveListService;
	
	@RequestMapping("/getList")
	public Object getList(String type) {
		List<view_ApproveList> lst=approveListService.getList(type);
		JSONObject json = new JSONObject();
		try {
			json.put("rows", lst);
			json.put("total", lst.size());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();	
	}
	
	@RequestMapping("/getApproveCount")
	public Integer getApproveCount() {
		List<view_ApproveList> lst=approveListService.getList("1");
		return lst==null||lst.size()==0?0:lst.size();	
	}
	
	@RequestMapping("/getMyApplicationList")
	public String getMyApplicationList(String type) {		
		List<view_ApproveList> lst=approveListService.getMyApplicationList(type);
		JSONObject json = new JSONObject();
		try {
			json.put("rows", lst);
			json.put("total", lst.size());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	
	@RequestMapping("/getMyApplicationCount")
	public Integer getMyApplicationCount() {
		List<view_ApproveList> lst=approveListService.getMyApplicationList("1");
		return lst==null||lst.size()==0?0:lst.size();	
	}
	
	@RequestMapping("/getHistoryList")
	public String getHistoryList(String type) {		
		List<view_ApproveList> lst=approveListService.getHistoryList(type);
		JSONObject json = new JSONObject();
		try {
			json.put("rows", lst);
			json.put("total", lst.size());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
	
	@RequestMapping("/getHistoryCount")
	public Integer getHistoryCount() {
		List<view_ApproveList> lst=approveListService.getHistoryList("1");
		return lst==null||lst.size()==0?0:lst.size();	
	}
}
