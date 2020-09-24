package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.ProjectView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ProjectService;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;

@RestController
@RequestMapping("/product")
public class ProjectController {

	
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private IBDS_ProjectService ibds_ProjectService;
	
	@Autowired
	private OperationLogUtils<IBDSProject> optLogUtils;
	
	@Autowired
	private CheckUtils checkUtils;
	
	@Autowired
	private SearchParamUtils searchParamUtils;
	
	
	
		// 研发项目树显示
		@RequestMapping("/data/pjdata")
		public Object dataList(String id, String searchParas, String projectStatus) {
			// 定义回传id类型(内码前缀),用于树节点展开时使用
			String type = null;
			// 截取code的前两位字符区分对象类型
			if (null != id) {

				type = id.substring(0, 2).toString();
			}
			System.out.print(projectStatus);
			// 查询参数放入Map中
			Map<String, String> searchMap = new HashMap<>();
			searchMap.put("id", id);
			searchMap.put("type", type);
			searchMap.put("searchParas", searchParas);
			searchMap.put("projectStatus", projectStatus);
			
			searchMap=searchParamUtils.setSearchParamFromIPMT(type, searchMap, id);
			
			// 根据不同参数查询R版本树
			List<ProjectView> lstRd = ibds_ProjectService.getTreeData(searchMap);

			/*
			 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
			 * 关闭状态list2EasyUiTreeGrid_close
			 */
			return type != null && type.equals("PT") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
		}

		/**
		 * 研发项目 右侧详细页显示
		 * 
		 * @param code
		 * @return
		 */
		@RequestMapping("/prop/pjdata")
		public String gridList(String code,Integer id) {
			return colunmConfigService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
		}
		
		/**
		 * 新增研发项目
		 * @return
		 */
		@RequestMapping(value="/data/pjadd",produces="text/html;charset=utf-8")
		public ResponseResult addProject(IBDSProject project){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_PROJECT");
    		para.put("column", "PROJECT");
    		para.put("value", project.getProject());    		

    		String msg = checkUtils.repeatCheck(para, "研发项目名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false,msg);
    		}
			project.setCreatedUser(UserUtil.getUserId());
			project.setCreatedDate(new Date());
			project.setStatus(ProductConst.STATUS_ON);
			project.setProjectno(ibds_ProjectService.getMaxCode());
			ibds_ProjectService.addIBDSProject(project);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(null, project, project.getProjectno());
			return ResponseResult.success(true, "增加研发项目成功");
		}
		

		/**
		 * 更新研发项目
		 * @return
		 */
		@RequestMapping(value="/data/pjedit",produces="text/html;charset=utf-8")
		public ResponseResult editVersion(IBDSProject project){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_PROJECT");
    		para.put("column", "PROJECT");
    		para.put("value", project.getProject());
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", project.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "研发项目名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false,msg);
    		}
    		
			IBDSProject bfe =colunmConfigService.selectByPrimaryKey(project.getId(),project.getProjectno());
			project.setModifyUser(UserUtil.getUserId());
			project.setModifyData(new Date());
			ibds_ProjectService.editIBDSProject(project);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(bfe, project, project.getProjectno());
			return ResponseResult.success(true, "编辑研发项目成功");
		}
}
