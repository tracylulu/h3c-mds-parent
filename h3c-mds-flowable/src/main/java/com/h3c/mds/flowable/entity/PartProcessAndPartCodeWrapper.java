package com.h3c.mds.flowable.entity;

import java.util.List;

public class PartProcessAndPartCodeWrapper {

	private PartCodeProcess partCodeProcess;
	
	private List<PartCodeApply> partCodeApplyList;

	public PartCodeProcess getPartCodeProcess() {
		return partCodeProcess;
	}

	public void setPartCodeProcess(PartCodeProcess partCodeProcess) {
		this.partCodeProcess = partCodeProcess;
	}

	public List<PartCodeApply> getPartCodeApplyList() {
		return partCodeApplyList;
	}

	public void setPartCodeApplyList(List<PartCodeApply> partCodeApplyList) {
		this.partCodeApplyList = partCodeApplyList;
	}
}
