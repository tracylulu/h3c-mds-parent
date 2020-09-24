package com.h3c.mds.product.service;

import java.util.Map;

import com.h3c.mds.product.entity.IbdsMaxCode;

public interface IbdsMaxCodeService {

	IbdsMaxCode   getIbdsMaxCodeByProjectNameAndPrefix(Map<String, Object> param);
	
	int addIbdsMaxCode(IbdsMaxCode ibdsMaxCode);
	
	int updateIbdsMaxCode(IbdsMaxCode ibdsMaxCode);

    IbdsMaxCode getByName(String productCode);
}
