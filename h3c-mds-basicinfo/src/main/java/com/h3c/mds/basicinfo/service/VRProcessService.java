package com.h3c.mds.basicinfo.service;

import java.util.Map;

import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;

public interface VRProcessService {
	
	String getMaxCode();
	
	void check(Integer id, String taskId, Map<String, Object> params);
	
	void submit(IBDS_VR_APPLY vrApply, IBDS_VR_PROCESS vrProcess);
	
	void changeHandler(Integer id, String taskId, String userId);
	
	void sendProjectCodeEipMsg(Integer id, boolean end);
	
	void delProcess(Integer id);

}
