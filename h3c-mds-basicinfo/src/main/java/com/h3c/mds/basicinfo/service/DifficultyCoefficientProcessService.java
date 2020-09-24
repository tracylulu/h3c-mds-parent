package com.h3c.mds.basicinfo.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;

public interface DifficultyCoefficientProcessService {
	
	String getMaxCode();
	
	void submit(IBDS_DifficultyCoefficient_APPLY diffApply,	IBDS_DifficultyCoefficient_PROCESS diffProcess,List<IBDS_DifficultyCoefficient_Item_APPLY> lstItem);

	void check(Integer processID, String taskId, Map<String, Object> params);

	void changeHandler(Integer id, String taskId, String userId);
	
	IBDS_DifficultyCoefficient_PROCESS getByID(Integer id);
	
	void sendProjectCodeEipMsg(Integer id, boolean end);
	
	void delProcess(Integer processID);
}
