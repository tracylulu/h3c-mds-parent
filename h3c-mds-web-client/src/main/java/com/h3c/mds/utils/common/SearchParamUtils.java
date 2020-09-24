package com.h3c.mds.utils.common;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.github.pagehelper.util.StringUtil;

import java.util.Map;

@Component
public class SearchParamUtils {

	/**
	 * 设置R版本查询条件
	 * 
	 * @param type      产品类型
	 * @param searchMap 查询条件
	 * @param id        产品编码
	 * @return
	 */
	public Map<String, Object> setReleaseSearchParam(String type, Map<String, Object> searchMap, String id) {
		// 重新设置id的值
		if (StringUtils.isNotEmpty(id) && id.indexOf("_") != -1) {
			searchMap.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);
		}

		if (type != null && type.equals("PL")) {
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODLINENo", "");

		} else if (type != null && type.equals("PT")) {
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");

		} else {
			searchMap.put("PLIPMTNo", "");
			searchMap.put("PRODLINENo", "");
		}

		return searchMap;

	}

	/**
	 * 设置R版本和B版本查询条件
	 * 
	 * @param type      产品类型
	 * @param searchMap 查询条件
	 * @param id        产品编码
	 * @return
	 */
	public Map<String, String> setBVersionSearchParam(String type, Map<String, String> searchMap, String id) {
		// 重新设置id的值
		if (StringUtils.isNotEmpty(id) && id.indexOf("_") != -1) {
			searchMap.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);
		}

		if (type != null && type.equals("PL")) {
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODLINENo", "");

		} else if (type != null && type.equals("PT")) {
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");

		} else if (type != null && type.equals("PR")) {
			searchMap.put("PDTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");
		} else if (type != null && type.equals("PB")) {
			searchMap.put("ReleaseNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PDTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[5] : "");
		} else {
			//searchMap.put("VERSIONNo", "");
			searchMap.put("PDTNo", "");
			searchMap.put("PRODLINENo", "");
			searchMap.put("PLIPMTNo", "");
		}

		return searchMap;

	}

	/**
	 * 设置顶级为IPMT的查询条件（使用模块：研发项目，B版本）
	 * 
	 * @param type      产品类型
	 * @param searchMap 查询条件
	 * @param id        产品编码
	 * @return
	 */
	public Map<String, String> setSearchParamFromIPMT(String type, Map<String, String> searchMap, String id) {
		// 重新设置id的值
		if (StringUtils.isNotEmpty(id) && id.indexOf("_") != -1) {
			searchMap.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);
		}

		if (type != null && type.equals("PL")) {
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
		} else if (type != null && type.equals("PP")) {
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
		} else if (type != null && type.equals("PT")) {
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
		} else if (type != null && type.equals("PV")) {
			searchMap.put("PRODUCTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");
		} else if (type != null && type.equals("PR")) {
			searchMap.put("VERSIONNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODUCTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");
			searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[4] : "");
		} else {
			searchMap.put("VERSIONNo", "");
			searchMap.put("PRODUCTNo", "");
			searchMap.put("PRODLINENo", "");
			searchMap.put("PLIPMTNo", "");
		}

		return searchMap;
	}

	/**
	 * 设置顶级为产品线的查询条件（使用模块：基线，特性，子特性，项目组，子系统，模块，模块版本）
	 * 
	 * @param type      产品类型
	 * @param searchMap 查询条件
	 * @param id        产品编码
	 * @return
	 */
	public Map<String, String> setSearchParamFromProdLine(String type, Map<String, String> searchMap, String id) {
		// 重新设置id的值
		if (StringUtils.isNotEmpty(id) && id.indexOf("_") != -1) {
			searchMap.put("id", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[0] : id);
		}

		if (type != null && type.equals("PP")) {
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			/*
			 * searchMap.put("PLIPMTNo",
			 * StringUtil.isNotEmpty(id)&&id.indexOf("_")!=-1?id.split("_")[2]:"");
			 */
		} else if (type != null && type.equals("PR")) {
			searchMap.put("PRODUCTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
		} else if (type != null && type.equals("SS")) {
			searchMap.put("RELEASENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODUCTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");
		} else if (type != null && type.equals("FT")) {
			searchMap.put("RELEASENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("PRODUCTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");

		} else if (type != null && type.equals("MD")) {

			searchMap.put("SUBSYSTEMNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[1] : "");
			searchMap.put("RELEASENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[2] : "");
			searchMap.put("PRODUCTNo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[3] : "");
			searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id) && id.indexOf("_") != -1 ? id.split("_")[4] : "");
		} else {
			searchMap.put("PRODLINENo", "");
			searchMap.put("PLIPMTNo", "");
		}

		return searchMap;

	}

}
