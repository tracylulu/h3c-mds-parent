package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.TeamView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_TeamService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import com.h3c.mds.product.common.OperationLogUtils;

@RestController
@RequestMapping("/product")
public class TeamController {

	
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private IBDS_TeamService ibdsTeamService;
	
	@Autowired
	private OperationLogUtils<IBDS_Team> optLogUtils;
	
	@Autowired
	private CheckUtils checkUtils;
	
	@Autowired
	private SearchParamUtils searchParamUtils;
	
	
	
		// 基线版本树显示
		@RequestMapping("/data/tmdata")
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
			List<TeamView> lstRd = ibdsTeamService.getTreeData(searchMap);

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
		@RequestMapping("/prop/tmdata")
		public String gridList(String code,Integer id) {
			return colunmConfigService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
		}
		
		/**
		 * 新增项目组
		 * @return
		 */
		@RequestMapping(value="/data/tmadd",produces="text/html;charset=utf-8")
		public ResponseResult addTeam(IBDS_Team team){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Team");
    		para.put("column", "Team");
    		para.put("value", team.getTeam());    		

    		String msg = checkUtils.repeatCheck(para, "项目组中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false, msg);
    		}
    		
			team.setTeamno(ibdsTeamService.getMaxCode());
			team.setCreatedDate(new Date());
			team.setCreatedUser(UserUtil.getUserId());
			team.setStatus(ProductConst.STATUS_ON);
			ibdsTeamService.addIBDSTeam(team);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(null, team, team.getTeamno());
			return ResponseResult.success(true, "新增项目组成功");
		}
		

		/**
		 * 更新基线版本
		 * @return
		 */
		@RequestMapping(value="/data/tmedit",produces="text/html;charset=utf-8")
		public ResponseResult editTeam(IBDS_Team team){
			// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Team");
    		para.put("column", "Team");
    		para.put("value", team.getTeam()); 
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", team.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "项目组中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(false, msg);
    		}
    		
			IBDS_Team bfe =colunmConfigService.selectByPrimaryKey(team.getId(),team.getTeamno());
			team.setModifyData(new Date());
			team.setModifyUser(UserUtil.getUserId());
			ibdsTeamService.editIBDSTeam(team);
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(bfe, team, team.getTeamno());
			return ResponseResult.success(true, "编辑项目组成功");
		}
}
