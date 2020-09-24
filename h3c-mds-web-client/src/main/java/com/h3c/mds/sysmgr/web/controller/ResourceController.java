package com.h3c.mds.sysmgr.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.ResourceService;
import com.h3c.mds.sysmgr.service.UserService;


@Controller
@RequestMapping("/resource")
public class ResourceController {

	private static final Logger logger = LoggerFactory.getLogger(ResourceController.class);
	
	@Autowired
	private ResourceService resourceService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/addResource")
	@ResponseBody
	public String addRosource(){
		
		Resource resource = new Resource();
		resource.setHresCode("aaa");
//		resource.setHresId(100);
		resourceService.create(resource);
		return "ok";
	}
	
	@RequestMapping("/updateResource")
	@ResponseBody
	public String updateResource(){
		
		
		Resource resource = resourceService.getResourceByResourceCode("aaa");
		resource.setHresContent("lishengtest");
		resourceService.updateResource(resource);
		return "ok";
	}
	
	@RequestMapping("/pageOfResources")
	@ResponseBody
	public String pageOfResources(){
		
		
		return "ok";
	}
	
	@RequestMapping("/list")
	public String list(){
		return "sysmgr/resource/list";
	}
	
	@RequestMapping
	@ResponseBody
	public ResponseResult findByPage(Integer pageSize,Integer pageNo){
//		try {
//			
//			PageInfo<Resource> pageInfo = resourceService.findByPage(pageSize,pageNo);
//			return ResponseResult.success(pageInfo.getList(),pageInfo.getTotal());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		return null;
	}
	
	@RequestMapping("/getResourcesByParentCode")
	@ResponseBody
	public ResponseResult getResourcesByParentCode(String parentCode){
//		try {
//			List<Resource> list = resourceService.getResourcesByParentCode(parentCode==null?"":parentCode);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		return null;
	}
	
	@RequestMapping("/getResourceTree")
	@ResponseBody
	public List<Map<String, Object>> getResourceTree(){
		try {
			List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("id", "");
			map.put("text", "资源树");
			map.put("code", "root");
			map.put("children", resourceService.getResourceTree());
			list.add(map);
			return list;
		} catch (Exception e) {
			logger.error("获取树失败", e);
		}
		return null;
	}
	
	
	@RequestMapping("/getResourceTreeCheckBox")
	@ResponseBody
	public List<Map<String, Object>> getResourceTreeCheckBox(String roleCode){
		try {
			List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("id", "");
			map.put("text", "资源树");
			map.put("code", "root");
			map.put("children", resourceService.getResourceTreeCheckBox(roleCode));
			list.add(map);
			return list;
		} catch (Exception e) {
			logger.error("获取树失败", e);
		}
		return null;
	}
	@RequestMapping("/getById/{id}")
	@ResponseBody
	public Resource getById(@PathVariable Integer id){
		try {
			Resource resource = resourceService.getById(id);
			return resource;
		} catch (Exception e) {
			logger.error("根据id获取资源失败", e);
			return null;
		}
		
	}
	
	@RequestMapping("/submit")
	@ResponseBody
	public ResponseResult submit(Resource resource){
		try {
			String account = (String) SecurityUtils.getSubject().getPrincipal();
			resource.setHresModifyDate(new Date());
			resource.setHresModifyUser(account);
			if(resource.getHresId()==null){
				resource.setHresCreateDate(new Date());
				resource.setHresCreateUser(account);
				resourceService.create(resource);
			}else{
				resourceService.updateResource(resource);
			}
			
			userService.refreshMenue(account);
			return ResponseResult.success(resource, "提交成功", 1);
		} catch (Exception e) {
			logger.error("提交失败", e);
			return ResponseResult.fail("提交失败");
		}
	}
	
	@RequestMapping("/getResourceList")
	@ResponseBody
	public List<Resource> getResourceList() {
		return resourceService.getResourceByUser((String) SecurityUtils.getSubject().getPrincipal(),(String) SecurityUtils.getSubject().getPrincipal());
	}
	
	@RequestMapping("/getCheckedResource")
	@ResponseBody
	public List<Resource> getCheckedResource() {
		List<Resource> lstAll=resourceService.getResourceByUser((String) SecurityUtils.getSubject().getPrincipal(),(String) SecurityUtils.getSubject().getPrincipal());
		List<Resource> lstTemp=lstAll.stream().filter(o->"check".equals(o.getRemark())).collect(Collectors.toList());
		if(lstTemp==null||lstTemp.size()==0) {
			lstTemp=resourceService.getResourceByUser((String) SecurityUtils.getSubject().getPrincipal(),"");
			lstTemp=lstTemp.stream().filter(o->"check".equals(o.getRemark())).collect(Collectors.toList());
		}
		return lstTemp;
	}
	
	@RequestMapping("/setUserResource")
	@ResponseBody
	public ResponseResult setUserResource(String code) {
		try {
			resourceService.setUserResource(code);
			return ResponseResult.success();
		}catch(Exception e) {
			return ResponseResult.fail(false,e.getMessage());
		}
	}
	
	
}
