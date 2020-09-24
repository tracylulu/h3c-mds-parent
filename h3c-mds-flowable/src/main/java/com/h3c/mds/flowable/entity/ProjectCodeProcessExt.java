package com.h3c.mds.flowable.entity;

import java.util.List;

public class ProjectCodeProcessExt extends ProjectCodeProcess{
	
	private List<ProjectCodeApplyExt> applys;

	public List<ProjectCodeApplyExt> getApplys() {
		return applys;
	}

	public void setApplys(List<ProjectCodeApplyExt> applys) {
		this.applys = applys;
	}

	

	
}