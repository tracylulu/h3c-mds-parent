package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.utils.combobox.ComboBoxData;

public interface ComboboxService {
	public List<ComboBoxData> getCombobox(Map<String, Object> param);

	public List<ComboBoxData> getComboboxWithEng(Map<String, Object> param);

	public List<ComboBoxData> getdataList(Map<String, String> param);

	public List<ComboBoxData> getComboboxWithId(Map<String, Object> param);

	public List<ComboBoxData> getDatagridWithId(Map<String, Object> param);

	/**
	 * 提供给产品R级以下和难度系数 产品R级以下和难度系数中下拉框的数据应该从产品R级获取
	 * 
	 * @param param
	 * @return
	 */

	public List<ComboBoxData> getReleaseCombobox(Map<String, Object> param);

}
