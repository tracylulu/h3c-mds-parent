package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.entity.VersionView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_VersionService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import com.h3c.mds.product.common.OperationLogUtils;

@RestController
@RequestMapping("/product")
public class VersionController {

	
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private IBDS_VersionService ibds_VersionService;
	
	@Autowired
	private OperationLogUtils<IBDS_Version> optLogUtils;
	
	@Autowired
	private CheckUtils checkUtils;
	
	@Autowired
	private SearchParamUtils searchParamUtils;
	
	
	
		// 产品v版本树显示
		@RequestMapping("/data/pvdata")
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
			searchMap.put("id", StringUtil.isNotEmpty(id)&& id.indexOf("_")!=-1?id.split("_")[0]:id);
			searchMap.put("type", type);
			searchMap.put("searchParas", searchParas);
			searchMap.put("projectStatus", projectStatus);
			
			searchMap=searchParamUtils.setSearchParamFromIPMT(type, searchMap, id);
			
			// 根据不同参数查询R版本树
			List<VersionView> lstRd = ibds_VersionService.getTreeData(searchMap);

			/*
			 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
			 * 关闭状态list2EasyUiTreeGrid_close
			 */
			return type != null && type.equals("PP") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
		}

		/**
		 * 产品v版本 右侧详细页显示
		 * 
		 * @param code
		 * @return
		 */
		@RequestMapping("/prop/pvdata")
		public String gridList(String code,Integer id) {
			return colunmConfigService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
		}
		
		/**
		 * 新增V级版本
		 * @return
		 */
		@RequestMapping(value="/data/pvadd",produces="text/html;charset=utf-8")
		public ResponseResult addVersion(IBDS_Version version){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Version");
    		para.put("column", "VERSION");
    		para.put("value", version.getVersion());    		

    		String msg = checkUtils.repeatCheck(para, "产品V级名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false, msg);
    		}
    		
			version.setVersionno(ibds_VersionService.getMaxCode());
			version.setCreateDate(new Date());
			version.setCreateUser(UserUtil.getUserId());
			version.setStatus(ProductConst.STATUS_ON);
			ibds_VersionService.addVersion(version);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(null, version, version.getVersionno());
			return ResponseResult.success(true, "添加V版本成功");
		}
		

		/**
		 * 更新V级信息
		 * @return
		 */
		@RequestMapping(value="/data/pvedit",produces="text/html;charset=utf-8")
		public ResponseResult editVersion(IBDS_Version version){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Version");
    		para.put("column", "VERSION");
    		para.put("value", version.getVersion());
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", version.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "产品V级名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false, msg);
    		}
    		
			IBDS_Version bfe =colunmConfigService.selectByPrimaryKey(version.getId(),version.getVersionno());
			
			version.setModifyUser(UserUtil.getUserId());
			version.setModifyDate(new Date());
			ibds_VersionService.editVersion(version);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(bfe, version, version.getVersionno());
		    return ResponseResult.success(true, "编辑V版本成功");
		}
}
