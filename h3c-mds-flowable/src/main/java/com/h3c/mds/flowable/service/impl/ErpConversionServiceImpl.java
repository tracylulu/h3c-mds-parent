package com.h3c.mds.flowable.service.impl;

import org.springframework.stereotype.Service;

import com.h3c.mds.flowable.service.ConversionService;

@Service("erpConversionService")
public class ErpConversionServiceImpl implements ConversionService {

	@Override
	public <ErpCoaEntity> ErpCoaEntity convert(Object source, Class<ErpCoaEntity> targetType) {
		// TODO Auto-generated method stub
		return null;
	}

}
