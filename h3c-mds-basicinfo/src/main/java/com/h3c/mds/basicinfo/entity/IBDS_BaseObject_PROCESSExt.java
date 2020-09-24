package com.h3c.mds.basicinfo.entity;

import java.util.List;

public class IBDS_BaseObject_PROCESSExt extends IBDS_BaseObject_PROCESS {
	private List<IBDS_BaseLine_Apply> baseLines;
	private List<List<IBDS_BaseObject_Apply>> baseObjects;
	private String baseLineParentName;
	private String baseLine1Name;
	private String baseLineEditParentName;
	private String baseLine1EditName;
	private String baseLineEditOldParentName;
	private String baseLine1EditOldName;

	public List<IBDS_BaseLine_Apply> getBaseLines() {
		return baseLines;
	}

	public void setBaseLines(List<IBDS_BaseLine_Apply> baseLines) {
		this.baseLines = baseLines;
	}

	public List<List<IBDS_BaseObject_Apply>> getBaseObjects() {
		return baseObjects;
	}

	public void setBaseObjects(List<List<IBDS_BaseObject_Apply>> baseObjects) {
		this.baseObjects = baseObjects;
	}

	public String getBaseLineParentName() {
		return baseLineParentName;
	}

	public void setBaseLineParentName(String baseLineParentName) {
		this.baseLineParentName = baseLineParentName == null ? null : baseLineParentName.trim();
		;
	}

	public String getBaseLine1Name() {
		return baseLine1Name;
	}

	public void setBaseLine1Name(String baseLine1Name) {
		this.baseLine1Name = baseLine1Name;
	}

	public String getBaseLineEditParentName() {
		return baseLineEditParentName;
	}

	public void setBaseLineEditParentName(String baseLineEditParentName) {
		this.baseLineEditParentName = baseLineEditParentName == null ? null : baseLineEditParentName.trim();
		;
	}

	public String getBaseLine1EditName() {
		return baseLine1EditName;
	}

	public void setBaseLine1EditName(String baseLine1EditName) {
		this.baseLine1EditName = baseLine1EditName;
	}

	public String getBaseLineEditOldParentName() {
		return baseLineEditOldParentName;
	}

	public void setBaseLineEditOldParentName(String baseLineEditOldParentName) {
		this.baseLineEditOldParentName = baseLineEditOldParentName == null ? null : baseLineEditOldParentName.trim();
		;
	}

	public String getBaseLine1EditOldName() {
		return baseLine1EditOldName;
	}

	public void setBaseLine1EditOldName(String baseLine1EditOldName) {
		this.baseLine1EditOldName = baseLine1EditOldName;
	}
}