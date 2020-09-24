package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.utils.combobox.ComboBoxData;

public interface ComboboxMapper {

	@BusinessFilter(type = "baseFilter") // 过滤readers权限
	List<ComboBoxData> getCombobox(@Param("param") Map<String, Object> param);

	/**
	 * 获取产品下拉框 test格式:中文名|英文名
	 * 
	 * @param param
	 * @return
	 */
	@BusinessFilter(type = "baseFilter") // 过滤readers权限
	List<ComboBoxData> getComboboxWithEng(@Param("param") Map<String, Object> param);

	/**
	 * 获取产品下拉框 test格式:中文名|英文名 value格式:内码+ID
	 * 
	 * @param param
	 * @return
	 */
	@BusinessFilter(type = "baseFilter") // 过滤readers权限
	List<ComboBoxData> getComboboxWithId(@Param("param") Map<String, Object> param);

	/**
	 * 获取产品弹出框数据
	 * 
	 * @param param
	 * @return
	 */
	@BusinessFilter(type = "baseFilter") // 过滤readers权限
	List<ComboBoxData> getDatagridWithId(@Param("param") Map<String, Object> param);

	@BusinessFilter(type = "baseFilter") // 过滤readers权限
	List<ComboBoxData> getdataList(@Param("param") Map<String, String> param);

	/**
	 * 提供给产品R级以下和难度系数 产品R级以下和难度系数中下拉框的数据应该从产品R级获取
	 * 
	 * @param param
	 * @return
	 */
	@BusinessFilter(type = "baseFilter") // 过滤readers权限
	List<ComboBoxData> getReleaseCombobox(@Param("param") Map<String, Object> param);

}