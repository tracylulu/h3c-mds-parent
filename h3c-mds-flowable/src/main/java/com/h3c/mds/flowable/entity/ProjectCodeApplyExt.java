package com.h3c.mds.flowable.entity;

import java.util.List;

public class ProjectCodeApplyExt extends ProjectCodeApply {

	private String proTimeStr;
	
	
	public String getProTimeStr() {
		return proTimeStr;
	}

	public void setProTimeStr(String proTimeStr) {
		this.proTimeStr = proTimeStr;
	}

	private List<ProjectProductRel> projectProductRelList;

	public List<ProjectProductRel> getProjectProductRelList() {
		return projectProductRelList;
	}

	public void setProjectProductRelList(
			List<ProjectProductRel> projectProductRelList) {
		this.projectProductRelList = projectProductRelList;
	}
}
