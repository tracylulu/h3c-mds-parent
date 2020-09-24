package com.h3c.mds.product.web.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.product.entity.IBDS_PRODLINE;

import net.sf.json.JSONException;
import java.lang.reflect.Method;

@Controller
@RequestMapping("/product")
public class ColunmConfigController {

	private static final Logger logger = LoggerFactory.getLogger(ColunmConfigController.class);

	@Autowired
	private IBDS_ColunmConfigService columnConfigServer;

	@Autowired
	private DicService dicServer;

	/**
	 * list页面
	 * 
	 * @return
	 */
	@RequestMapping("/columnConfig/list")
	public String list() {
		return "product/columnConfig/list";
	}

	/**
	 * 获取分页数据
	 * 
	 * @param page 当前页
	 * @param rows 每页数据条数
	 * @return json数据
	 */
	@RequestMapping("/columnConfig/pageOfColumnConfig")
	@ResponseBody
	public String pageOfColumnConfig(Integer page, Integer rows) {

		PageInfo<IBDS_ColunmConfig> pageInfo = columnConfigServer.pageOfColumnConfig(page, rows);
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

	@RequestMapping("/columnConfig/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(Integer page, Integer rows, String type, String searchStr) {
		try {
			PageInfo<IBDS_ColunmConfig> pageInfo = columnConfigServer.findByPage(page, rows, type, searchStr);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("rows", pageInfo.getList());
			map.put("total", pageInfo.getTotal());
			return map;
		} catch (Exception e) {
			logger.error("查询列表失败", e);
			return null;
		}

	}

	/**
	 * 根据id获取
	 */
	@RequestMapping("/columnConfig/getById/{id}")
	@ResponseBody
	public ResponseResult getById(@PathVariable Integer id) {
		try {
			IBDS_ColunmConfig colunmConfig = columnConfigServer.getById(id);
			return ResponseResult.success(colunmConfig);
		} catch (Exception e) {
			logger.error("根据id获取失败", e);
			return ResponseResult.fail("根据id获取失败");
		}

	}

	/**
	 * 提交
	 */
	@RequestMapping("/columnConfig/submit")
	@ResponseBody
	public ResponseResult submit(IBDS_ColunmConfig colunmConfig) {
		try {
			String account = (String) SecurityUtils.getSubject().getPrincipal();
			// 新增
			colunmConfig.setModifydate(new Date());
			colunmConfig.setModifyuser(account);
			if (colunmConfig.getId() == null) {
				colunmConfig.setCreatedate(new Date());
				colunmConfig.setCreateuser(account);
				columnConfigServer.create(colunmConfig);
			} else {
				// 编辑
				columnConfigServer.update(colunmConfig);
			}
			return ResponseResult.success();
		} catch (Exception e) {
			logger.error("提交失败", e);
			return ResponseResult.fail("提交失败");
		}
	}

	@RequestMapping("/columnConfig/add")
	public String add(Model model, Integer id) {
		model.addAttribute("id", id);
		return "product/columnConfig/add";
	}

	@RequestMapping("/data/dicvalue")
	@ResponseBody
	public String getdicvalue(String type, String value) {
		Map<String, String> param = new HashMap<>();
		param.put("typeCode", type);
		param.put("dicvalue", value);
		List<IBDS_Dic> dic = dicServer.getDic(param);
		String divName = "";
		if (dic.size() > 0) {
			divName = dic.get(0).getDicName();
		}

		return divName;
	}

	@RequestMapping("/columnConfig/selectForReference")
	@ResponseBody
	public String selectForReference(String type) {
		Map<String, String> param = new HashMap<>();
		param.put("type", type);
		List<IBDS_ColunmConfig> lst = columnConfigServer.selectForReference(param);
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

	@RequestMapping("/columnConfig/selectProByColumn")
	@ResponseBody
	public ResponseResult selectProByColumn(String type, String code, String column) {
		try {
			Map<String, String> param = new HashMap<>();
			param.put("type", type);
			param.put("column", column);
			String value = columnConfigServer.selectProByExample(type, column, code);	
			value.replace(",,", ",");
			if(StringUtils.startsWith(",", value)) {
				value=value.substring(1);
			}
			return ResponseResult.success(value,"");
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseResult.fail(null);
		}
		
	}

}
