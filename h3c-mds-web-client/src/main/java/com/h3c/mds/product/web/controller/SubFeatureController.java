package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.SubFeatureView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_SubFeatureService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import com.h3c.mds.product.common.OperationLogUtils;


@RestController
@RequestMapping("/product")
public class SubFeatureController {

	
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private IBDS_SubFeatureService ibdsSubFeatureService;
	
	@Autowired
	private OperationLogUtils<IBDS_SubFeature> optLogUtils;
	
	@Autowired
	private CheckUtils checkUtils;
	
	@Autowired
	private SearchParamUtils searchParamUtils;
	
	
		// 特性树树显示
		@RequestMapping("/data/sfdata")
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
			List<SubFeatureView> lstRd = ibdsSubFeatureService.getTreeData(searchMap);

			/*
			 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
			 * 关闭状态list2EasyUiTreeGrid_close
			 */
			return type != null && type.equals("FT") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
		}

		/**
		 * 基线版本 右侧详细页显示
		 * 
		 * @param code
		 * @return
		 */
		@RequestMapping("/prop/sfdata")
		public String gridList(String code,Integer id) {
			return colunmConfigService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
		}
		
		/**
		 * 新增子特性
		 * @return
		 */
		@RequestMapping(value="/data/sfadd",produces="text/html;charset=utf-8")
		public ResponseResult addSubFeature(IBDS_SubFeature feature){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_SUB_FEATRUE");
    		para.put("column", "SUBFEATURE");
    		para.put("value", feature.getSubfeature());    		

    		String msg = checkUtils.repeatCheck(para, "子特性名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false,msg);
    		}
    		
			feature.setSubfeatureno(ibdsSubFeatureService.getMaxCode());
			feature.setCreatedDate(new Date());
			feature.setCreatedUser(UserUtil.getUserId());
			feature.setStatus(ProductConst.STATUS_ON);			
			ibdsSubFeatureService.addIBDSSubFeature(feature);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(null, feature, feature.getSubfeatureno());
			return ResponseResult.success(true, "新增子特性成功");
		}
		

		/**
		 * 更新子特性
		 * @return
		 */
		@RequestMapping(value="/data/sfedit",produces="text/html;charset=utf-8")
		public ResponseResult editSubFeature(IBDS_SubFeature feature){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_SUB_FEATRUE");
    		para.put("column", "SUBFEATURE");
    		para.put("value", feature.getSubfeature());
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", feature.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "子特性名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false,msg);
    		}
    		
			IBDS_SubFeature bfe =colunmConfigService.selectByPrimaryKey(feature.getId(),feature.getSubfeatureno());
			feature.setModifyData(new Date());
			feature.setModifyUser(UserUtil.getUserId());
			ibdsSubFeatureService.editIBDSSubFeature(feature);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(bfe, feature, feature.getSubfeatureno());
			return ResponseResult.success(true, "编辑子特性成功");
		}
}
