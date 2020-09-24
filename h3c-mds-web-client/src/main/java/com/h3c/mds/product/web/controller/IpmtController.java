package com.h3c.mds.product.web.controller;

import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_PLIPMTService;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class IpmtController {

	private static final Logger logger = LoggerFactory.getLogger(IpmtController.class);

	@Autowired
	private IBDS_ColunmConfigService configService;
	@Autowired
	private IBDS_PLIPMTService plipmtService;
	@Autowired
	private CheckUtils checkUtils;
	@Autowired
	private OperationLogUtils<IBDS_PLIPMT> optLogUtils;

	@RequestMapping("/data/pidata")
	@ResponseBody
	public Object dataList(String id, String searchParas, String projectStatus) {

		Map<String, String> searchMap = new HashMap<>();

		searchMap.put("searchParas", searchParas);
		searchMap.put("projectStatus", projectStatus);
		// 根据不同参数查询R版本树
		List<IBDS_PLIPMT> ibds_plipmts = plipmtService.getByMap(searchMap);

		return EasyUIJSONUtils.list2EasyUiTreeGrid_open(ibds_plipmts);
	}

	/**
	 * 新增IPMT
	 */
	@RequestMapping(value="/data/piadd",produces="text/html;charset=utf-8")
	public ResponseResult create(IBDS_PLIPMT ipmt) {
		try {
			// 校验名称是否重复
			Map<String, String> para = new HashMap<>();
			para.put("tableName", "IBDS_PLIPMT");
			para.put("column", "PLIPMT");
			para.put("value", ipmt.getPlipmt());

			String msg = checkUtils.repeatCheck(para, "IPMT中文名称");
			if (msg != null && msg != "") {
				return ResponseResult.fail(msg);
			}

			ipmt.setStatus("1");
			ipmt.setCreateDate(new Date());
			ipmt.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
			ipmt.setModifyDate(new Date());
			ipmt.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			plipmtService.create(ipmt);
			
			// 添加操作日志			
			optLogUtils.RecordOpearteLog(null, ipmt, ipmt.getPlipmtno());

			return ResponseResult.success("新增成功");
		} catch (Exception e) {
			logger.error("新增失败", e);
			return ResponseResult.fail("新增失败");
		}
	}

	/**
	 * 更新ipmt
	 * 
	 * @param ipmt
	 * @return
	 */
	@RequestMapping(value="/data/piedit",produces="text/html;charset=utf-8")
	public ResponseResult upate(IBDS_PLIPMT ipmt) {
		try {
			// 校验名称是否重复
			Map<String, String> para = new HashMap<>();
			para.put("tableName", "IBDS_PLIPMT");
			para.put("column", "PLIPMT");
			para.put("value", ipmt.getPlipmt());
			para.put("isEdit", "True");
			para.put("Key", "ID");
			para.put("KeyValue", ipmt.getId().toString());
			
			String msg = checkUtils.repeatCheck(para, "IPMT中文名称");
			if (msg != null && msg != "") {
				return ResponseResult.fail(msg);
			}

			IBDS_PLIPMT bfe =configService.selectByPrimaryKey(ipmt.getId(),ipmt.getPlipmtno());

			ipmt.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			ipmt.setModifyDate(new Date());
			plipmtService.update(ipmt);

			// 添加操作日志			
			optLogUtils.RecordOpearteLog(bfe, ipmt, ipmt.getPlipmtno());

			return ResponseResult.success("更新成功");
		} catch (Exception e) {
			logger.error("更新失败", e);
			return ResponseResult.fail("更新失败");
		}
	}

	@RequestMapping("/prop/pidata")
	@ResponseBody
	public String gridList(String code,Integer id) {
		return configService
				.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
	}
}
