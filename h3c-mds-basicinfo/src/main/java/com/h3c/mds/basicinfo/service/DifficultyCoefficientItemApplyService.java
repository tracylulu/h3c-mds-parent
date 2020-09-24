package com.h3c.mds.basicinfo.service;

import java.util.List;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;

public interface DifficultyCoefficientItemApplyService {
	
	 List<IBDS_DifficultyCoefficient_Item_APPLY>  getDataList( Integer diffid);
	 
}
