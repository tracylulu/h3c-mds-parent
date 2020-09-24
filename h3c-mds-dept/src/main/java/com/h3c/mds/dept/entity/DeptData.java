package com.h3c.mds.dept.entity;

import java.math.BigDecimal;

public class DeptData {
	
	private String deptCode;
	
	private String deptName;
	
	private String coaCode;
	
	private BigDecimal deptLevel;
	
	private String supDeptCode;
	
	private String deptType;

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCoaCode() {
		return coaCode;
	}

	public void setCoaCode(String coaCode) {
		this.coaCode = coaCode;
	}

	public BigDecimal getDeptLevel() {
		return deptLevel;
	}

	public void setDeptLevel(BigDecimal deptLevel) {
		this.deptLevel = deptLevel;
	}

	public String getSupDeptCode() {
		return supDeptCode;
	}

	public void setSupDeptCode(String supDeptCode) {
		this.supDeptCode = supDeptCode;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	@Override
	public String toString() {
		return "DeptData [deptCode=" + deptCode + ", deptName=" + deptName + ", coaCode=" + coaCode + ", deptLevel="
				+ deptLevel + ", supDeptCode=" + supDeptCode + ", deptType=" + deptType + "]";
	}
	
}
