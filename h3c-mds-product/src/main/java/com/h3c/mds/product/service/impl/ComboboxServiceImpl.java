package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.dao.ComboboxMapper;
import com.h3c.mds.product.service.ComboboxService;
import com.h3c.mds.utils.combobox.ComboBoxData;

@Service
public class ComboboxServiceImpl implements ComboboxService {

	@Autowired
	private ComboboxMapper comboboxMapper;

	@Override
	public List<ComboBoxData> getCombobox(Map<String, Object> param) {
		/*
		 * else if(param.get("type").toUpperCase()=="PL") {
		 * lst=prodlineMapper.getProdline(param); }else
		 * if(param.get("type").toUpperCase()=="PT") { lst=pdtMapper.getPDT(param);
		 * }else if(param.get("type").toUpperCase()=="PP") {
		 * lst=productMapper.getProduct(param); }else
		 * if(param.get("type").toUpperCase()=="PV") {
		 * lst=versionMapper.getVersion(param); }
		 */
		return comboboxMapper.getCombobox(param);
	}

	@Override
	public List<ComboBoxData> getComboboxWithEng(Map<String, Object> param) {
		return comboboxMapper.getComboboxWithEng(param);
	}

	/**
	 * 内码返回加ID
	 */
	@Override
	public List<ComboBoxData> getComboboxWithId(Map<String, Object> param) {
		return comboboxMapper.getComboboxWithId(param);
	}

	/**
	 * 内码返回加ID
	 */
	@Override
	public List<ComboBoxData> getDatagridWithId(Map<String, Object> param) {
		return comboboxMapper.getDatagridWithId(param);
	}

	@Override
	public List<ComboBoxData> getdataList(Map<String, String> param) {
		return comboboxMapper.getdataList(param);
	}

	/**
	 * 提供给产品R级以下和难度系数 产品R级以下和难度系数中下拉框的数据应该从产品R级获取
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public List<ComboBoxData> getReleaseCombobox(Map<String, Object> param) {
		return comboboxMapper.getReleaseCombobox(param);
	}
}
