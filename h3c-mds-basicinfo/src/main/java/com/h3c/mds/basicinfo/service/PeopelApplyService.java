package com.h3c.mds.basicinfo.service;

import com.h3c.mds.basicinfo.entity.IBDS_People_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;

import java.util.List;

public interface PeopelApplyService {
	
	void save(IBDS_People_APPLY pApply,List<IBDS_People_Item_APPLY> lst,IBDS_People_PROCESS pProcess);
	
	void validateApply(IBDS_People_APPLY pApply,List<IBDS_People_Item_APPLY> lst);
	
	List<IBDS_People_Item_APPLY> getByPid(Integer pid);
	
	
}
