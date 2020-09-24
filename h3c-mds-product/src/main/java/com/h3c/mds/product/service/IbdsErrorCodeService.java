package com.h3c.mds.product.service;

import java.util.Map;

import com.h3c.mds.product.entity.IbdsErrorCode;

public interface IbdsErrorCodeService {

	int addErrorCode(IbdsErrorCode ibdsErrorCode);
	
	
	IbdsErrorCode getErrorCodeByTypeAndName(Map<String, String> param);
	
	int updateErrorCode(IbdsErrorCode ibdsErrorCode);
}
