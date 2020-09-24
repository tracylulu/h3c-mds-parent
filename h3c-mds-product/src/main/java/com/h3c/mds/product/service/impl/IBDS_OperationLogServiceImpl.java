package com.h3c.mds.product.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_OperationLogMapper;
import com.h3c.mds.product.dao.view_OperationLogMapper;
import com.h3c.mds.product.entity.IBDS_OperationLog;
import com.h3c.mds.product.entity.view_OperationLog;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_OperationLogService;
import com.h3c.mds.product.service.IBDS_ReleaseService;

@Service
public class IBDS_OperationLogServiceImpl implements IBDS_OperationLogService {

	@Autowired
	private IBDS_OperationLogMapper optLogMapper;

	@Autowired
	private view_OperationLogMapper vOptLogMapper;

	@Autowired
	private IBDS_ReleaseService releaseService;

	@Autowired
	private IBDS_BversionService bversionService;

	/**
	 * 保存操作日志
	 */
	@Override
	@Transactional
	public int insertSelective(IBDS_OperationLog optLog) {

		return optLogMapper.insertSelective(optLog);
	}

	@Override
	@Transactional(readOnly = true)
	public Map<String, Object> pageOfOperationLog(int pageNum, int pageSize, String searchStr, String proType) {
		PageHelper.startPage(pageNum, pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchStr", searchStr);
		map.put("proType", proType);
		List<view_OperationLog> lst = vOptLogMapper.findByPage(map);

		PageInfo<view_OperationLog> pageInfo = new PageInfo<view_OperationLog>(lst);

		List<view_OperationLog> lstNew = new ArrayList<>();

		// 赋值所属版本
		String name = "";
		for (view_OperationLog view_OperationLog : pageInfo.getList()) {
			if (StringUtil.isNotEmpty(view_OperationLog.getNewvalue())) {
				JSONObject obj1 = new JSONObject(view_OperationLog.getNewvalue());
				switch (view_OperationLog.getCode().substring(0, 2)) {
				case ProductConst.IPMT_CODE_PREFIX:
					if (obj1.has("plipmt")) {
						name = obj1.get("plipmt").toString();
					}
					break;
				case ProductConst.PRODLINE_CODE_PREFIX:
					if (obj1.has("prodline")) {
						name = obj1.get("prodline").toString();
					}
					break;
				case ProductConst.PDT_CODE_PREFIX:
					if (obj1.has("pdt")) {
						name = obj1.get("pdt").toString();
					}
					break;
				case ProductConst.PRODUCT_CODE_PREFIX:
					if (obj1.has("product")) {
						name = obj1.get("product").toString();
					}
					break;
				case ProductConst.VERSION_CODE_PREFIX:
					if (obj1.has("version")) {
						name = obj1.get("version").toString();
					}
					break;
				case ProductConst.RELEASE_CODE_PREFIX:
					if (obj1.has("release")) {
						name = obj1.get("release").toString();
					}
					break;
				case ProductConst.BVERSION_CODE_PREFIX:
					if (obj1.has("bversioncname")) {
						/*
						 * Bversion_view bversion =
						 * bversionService.selectByCode(view_OperationLog.getCode()); if (bversion !=
						 * null &&
						 * !obj1.get("bversioncname").toString().contains(bversion.getRelease())) { name
						 * += bversion.getRelease(); } if (obj1.has("release")) { name +=
						 * obj1.get("release").toString(); }
						 */
						name = obj1.get("bversioncname").toString();
					}
					break;
				case ProductConst.PROJECT_CODE_PREFIX:
					if (obj1.has("project")) {
						name = obj1.get("project").toString();
					}
					break;
				case ProductConst.BASELINE_CODE_PREFIX:
					if (obj1.has("baseline")) {
						name = obj1.get("baseline").toString();
					}
					break;
				case ProductConst.FEATURE_CODE_PREFIX:
					if (obj1.has("feature")) {
						name = obj1.get("feature").toString();
					}
					break;
				case ProductConst.SUB_FEATURE_CODE_PREFIX:
					if (obj1.has("subfeature")) {
						name = obj1.get("subfeature").toString();
					}
					break;
				case ProductConst.TEAM_CODE_PREFIX:
					if (obj1.has("team")) {
						name = obj1.get("team").toString();
					}
					break;
				case ProductConst.SUB_SYSTEM_CODE_PREFIX:
					if (obj1.has("subsystem")) {
						name = obj1.get("subsystem").toString();
					}
					break;
				case ProductConst.MOUDLE_CODE_PREFIX:
					if (obj1.has("module")) {
						name = obj1.get("module").toString();
					}
					break;
				case ProductConst.MOUDLE_VERSION_CODE_PREFIX:
					if (obj1.has("mdlvsn")) {
						name = obj1.get("mdlvsn").toString();
					}
					break;
				}
			}
			if (StringUtil.isNotEmpty(name)) {
				view_OperationLog.setName(name);
			}
			lstNew.add(view_OperationLog);
			name = "";

		}
		// PageInfo<view_OperationLog> pageInfoEnd = new
		// PageInfo<view_OperationLog>(lstNew);
		Map<String, Object> mapRes = new HashMap<>();
		mapRes.put("rows", lstNew);
		mapRes.put("total", pageInfo.getTotal());
		return mapRes;
	}

	/**
	 * 批量新增操作日志
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int insertSelectiveBatch(@Param("list") List<IBDS_OperationLog> list) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(list)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < list.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_OperationLog> tmpbaselineList = list.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				optLogMapper.insertSelectiveBatch(tmpbaselineList);
			}

			if (0 != list.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_OperationLog> tmpbaselineList = list
						.subList(list.size() - (list.size() % ProductConst.PRODUCT_COUNT), list.size());

				optLogMapper.insertSelectiveBatch(tmpbaselineList);
			}

			num = list.size();
		}
		return num;

		// return optLogMapper.insertSelectiveBatch(list);
	}

	/**
	 * vr流程修改V名称及R名称时记录一条B修改日志
	 * 
	 * @param map
	 */
	public void insertModPBName(Map<String, Object> map) {
		optLogMapper.insertModPBName(map);
	}

}
