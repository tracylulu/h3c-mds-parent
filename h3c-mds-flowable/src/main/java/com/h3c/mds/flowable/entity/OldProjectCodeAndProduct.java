package com.h3c.mds.flowable.entity;

import java.util.List;
import java.util.Map;

import com.h3c.mds.finance.entity.FProjectCode;

public class OldProjectCodeAndProduct {

	private FProjectCode fProjectCode;
	
	private List<Map<String, Object>> productList;

	public FProjectCode getfProjectCode() {
		return fProjectCode;
	}

	public void setfProjectCode(FProjectCode fProjectCode) {
		this.fProjectCode = fProjectCode;
	}

	public List<Map<String, Object>> getProductList() {
		return productList;
	}

	public void setProductList(List<Map<String, Object>> productList) {
		this.productList = productList;
	}
}
