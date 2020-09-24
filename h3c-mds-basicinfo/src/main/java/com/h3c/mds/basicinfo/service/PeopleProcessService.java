package com.h3c.mds.basicinfo.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.basicinfo.entity.IBDS_People_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;

public interface PeopleProcessService {

	String getMaxCode();
	
	void submit(IBDS_People_APPLY apply,IBDS_People_PROCESS process, List<IBDS_People_Item_APPLY> lstEdit);

	void check(Integer id, String taskId, Map<String, Object> params);

	void changeHandler(Integer id, String taskId, String userId);

	void writeProData(IBDS_People_APPLY apply);

	void sendProjectCodeEipMsg(Integer id, boolean end);
	
	void delProcess(Integer processID);

}
