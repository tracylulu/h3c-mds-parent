package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.service.IBDS_BaseLineService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import com.h3c.mds.product.common.OperationLogUtils;

@RestController
@RequestMapping("/product")
public class BaseLineController {

	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private IBDS_BaseLineService ibdsBaseLineService;

	@Autowired
	private OperationLogUtils<IBDS_BaseLine> optLogUtils;

	@Autowired
	private CheckUtils checkUtils;
	
	@Autowired
	private SearchParamUtils searchParamUtils;

	// 基线版本树显示
	@RequestMapping("/data/bldata")
	public Object dataList(String id, String searchParas, String projectStatus) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {
			if(id.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
        		type="PP";
        	}else {
			type = id.substring(0, 2).toString();
        	}
		}
		System.out.print(projectStatus);
		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchParas", searchParas);
		searchMap.put("projectStatus", projectStatus);
		
		searchMap=searchParamUtils.setSearchParamFromProdLine(type, searchMap, id);
		
		// 根据不同参数查询R版本树
		List<BaseLineView> lstRd = ibdsBaseLineService.getTreeData(searchMap);

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != null && type.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

	@RequestMapping("/data/bltreedata")
	public Object treeDataList(String id, String searchParas, String projectStatus) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {
			if(id.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
				type="PP";
			}else {
				type = id.substring(0, 2).toString();
			}
		}
		System.out.print(projectStatus);
		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchParas", searchParas);
		searchMap.put("projectStatus", projectStatus);

		searchMap=searchParamUtils.setSearchParamFromProdLine(type, searchMap, id);

		// 根据不同参数查询R版本树
		List<BaseLineView> lstRd = ibdsBaseLineService.getBaseLineTreeData(searchMap);

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != null && type.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

	/**
	 * 基线版本 右侧详细页显示
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/prop/bldata")
	public String gridList(String code,Integer id) {
		return colunmConfigService
				.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
	}

	/**
	 * 新增基线版本
	 * 
	 * @return
	 */
	@RequestMapping(value="/data/bladd",produces="text/html;charset=utf-8")
	public ResponseResult addBaseLine(IBDS_BaseLine baseLine) {
		// 校验名称是否重复
		Map<String, String> para = new HashMap<>();
		para.put("tableName", "IBDS_BASE_LINE");
		para.put("column", "BASELINE");
		para.put("value", baseLine.getBaseline());

		String msg = checkUtils.repeatCheck(para, "基线版本中文名称");
		if (msg != null && msg != "") {
			return ResponseResult.fail(false,msg);
		}

		baseLine.setCreatedUser(UserUtil.getUserId());
		baseLine.setCreatedDate(new Date());
		baseLine.setStatus(ProductConst.STATUS_ON);
		baseLine.setBaselineno(ibdsBaseLineService.getMaxCode());
		ibdsBaseLineService.addIBDSBaseLine(baseLine);
		// 添加操作日志
		optLogUtils.RecordOpearteLog(null, baseLine, baseLine.getBaselineno());
		return ResponseResult.success(true, "新增基线版本成功");
	}

	/**
	 * 更新基线版本
	 * 
	 * @return
	 */
	@RequestMapping(value="/data/bledit",produces="text/html;charset=utf-8")
	public ResponseResult editVersion(IBDS_BaseLine baseLine) {
		Map<String, Object> result = new HashMap<>();
		// 校验名称是否重复
		Map<String, String> para = new HashMap<>();
		para.put("tableName", "IBDS_BASE_LINE");
		para.put("column", "BASELINE");
		para.put("value", baseLine.getBaseline());
		para.put("isEdit", "True");
		para.put("Key", "ID");
		para.put("KeyValue", baseLine.getId().toString());

		String msg = checkUtils.repeatCheck(para, "基线版本中文名称");
		if (msg != null && msg != "") {
			return ResponseResult.fail(false,msg);
		}
		
		IBDS_BaseLine bfe = colunmConfigService.selectByPrimaryKey(baseLine.getId(),baseLine.getBaselineno());
		baseLine.setModifyUser(UserUtil.getUserId());
		baseLine.setModifyData(new Date());
		ibdsBaseLineService.editIBDSProject(baseLine);
		// 添加操作日志
		optLogUtils.RecordOpearteLog(bfe, baseLine, baseLine.getBaselineno());
		return ResponseResult.success(true, "编辑基线版本成功");
	}
}
