package com.h3c.mds.product.web.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.util.ArrayList;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.sysmgr.response.ResponseResult;

import net.sf.json.JSONException;

@RestController
@RequestMapping("/product/dic")
public class DicController {
	@Autowired
	private DicService dicService;
	
	/**
	 * 列表
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "字典列表");
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("product/dic/list");
		return mv;
	}

	/**
	 * 列表分页数据
	 * @param page
	 * @param rows
	 * @param searchStr
	 * @param proType
	 * @return
	 */	
	@RequestMapping("/getList")
	public String getList(int page, int rows, String searchStr,String dicTypeCode) {
		Map<String,String> param=new HashMap<>();
		param.put("searchParas", searchStr);
		param.put("dicTypeCode", dicTypeCode);
		PageInfo<IBDS_Dic> pageInfo=dicService.pageOfDic(page, rows, param);
		
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
	 * 添加页面
	 * @return
	 */
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "新增字典配置");
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("product/dic/add");
		return mv;
	}
	
	/**
	 * 修改页面
	 */
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "修改字典配置");
		mv.addObject("id", id);
		mv.addObject("id_suffix", new Date().getTime());
		mv.setViewName("product/dic/add");
		return mv;
	}
	
	@RequestMapping("/get/{id}")
	public ResponseResult getByID(@PathVariable("id") Integer id) {
		return ResponseResult.success(dicService.getByPrimaryKey(id));
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/save")
	public ResponseResult save(IBDS_Dic model) {
		try {
			String msg=dicService.validation(model, false);
			if(StringUtils.isNotBlank(msg)) {
				return ResponseResult.fail(false,msg);
			}
			dicService.save(model);
			return ResponseResult.success(true);
		}catch(Exception e) {
			return ResponseResult.fail(false);
		}		
	}
	
	@RequestMapping("/update")
	public ResponseResult update(IBDS_Dic model) {
		try {
			String msg=dicService.validation(model, true);
			if(StringUtils.isNotBlank(msg)) {
				return ResponseResult.fail(false,msg);
			}
			dicService.update(model);
			return ResponseResult.success(true);
		}catch(Exception e) {
			return ResponseResult.fail(false);
		}
	}
	
	/**
	 * 获取类型下拉数据
	 * @return
	 */
	@RequestMapping("/getDicTypeComb")
	public List<IBDS_Dic> getDicTypeComb(){
		List<IBDS_Dic> lst=new ArrayList<IBDS_Dic>();
		IBDS_Dic dic=new IBDS_Dic();
		dic.setDicTypecode("");
		dic.setDicTypename("请选择");
		lst.add(dic);
		lst.addAll(dicService.getDicTypeComb());
		return lst;
	}
}
