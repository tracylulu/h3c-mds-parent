package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.dao.IbdsErrorCodeMapper;
import com.h3c.mds.product.entity.IbdsErrorCode;
import com.h3c.mds.product.entity.IbdsErrorCodeExample;
import com.h3c.mds.product.service.IbdsErrorCodeService;

@Service
public class IbdsErrorCodeServiceImpl implements IbdsErrorCodeService{

	@Autowired
	private IbdsErrorCodeMapper ibdsErrorCodeMapper;
	
	@Override
	public int addErrorCode(IbdsErrorCode ibdsErrorCode) {
		return ibdsErrorCodeMapper.insertSelective(ibdsErrorCode);
	}

	@Override
	public IbdsErrorCode getErrorCodeByTypeAndName(Map<String, String> param) {
		IbdsErrorCodeExample example = new IbdsErrorCodeExample();
		IbdsErrorCodeExample.Criteria criteria = example.createCriteria();
		
		criteria.andTypeEqualTo(param.get("type"));
		criteria.andNameEqualTo(param.get("name"));
		List<IbdsErrorCode> list = ibdsErrorCodeMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public int updateErrorCode(IbdsErrorCode ibdsErrorCode) {
		
		return ibdsErrorCodeMapper.updateByPrimaryKeySelective(ibdsErrorCode);
	}

}
