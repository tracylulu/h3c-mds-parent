package com.h3c.mds.basicinfo.service.impl;

import java.util.List;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientApplyService;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientItemApplyService;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_Item_APPLYMapper;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;

@Service
public class DifficultyCoefficientItemApplyServiceImpl implements DifficultyCoefficientItemApplyService {
	@Autowired
	private IBDS_DifficultyCoefficient_Item_APPLYMapper diffItemApplyMapper;
	
	public List<IBDS_DifficultyCoefficient_Item_APPLY> getDataList(Integer diffid){
		return diffItemApplyMapper.getDataList(diffid);
	}

}
