package com.h3c.mds.product.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.dao.IbdsMaxCodeMapper;
import com.h3c.mds.product.entity.IbdsMaxCode;
import com.h3c.mds.product.entity.IbdsMaxCodeExample;
import com.h3c.mds.product.service.IbdsMaxCodeService;

@Service
public class IbdsMaxCodeServiceImpl implements IbdsMaxCodeService {

	@Autowired
	private IbdsMaxCodeMapper ibdsMaxCodeMapper;
	
	
	@Override
	public IbdsMaxCode getIbdsMaxCodeByProjectNameAndPrefix(
			Map<String, Object> param) {
		IbdsMaxCodeExample example = new IbdsMaxCodeExample();
		
		IbdsMaxCodeExample.Criteria criteria = example.createCriteria();
		criteria.andProjectNameEqualTo(String.valueOf(param.get("projectName")));
		criteria.andPrefixEqualTo(String.valueOf(param.get("prefix")));
		
		List<IbdsMaxCode> list = ibdsMaxCodeMapper.selectByExample(example);
		
		if(CollectionUtils.isNotEmpty(list)){
			if(list.size() == 1){
				return list.get(0);
			}
		}
		
		return null;
	}


	@Override
	public int addIbdsMaxCode(IbdsMaxCode ibdsMaxCode) {
		return ibdsMaxCodeMapper.insertSelective(ibdsMaxCode);
	}


	@Override
	public int updateIbdsMaxCode(IbdsMaxCode ibdsMaxCode) {
		return ibdsMaxCodeMapper.updateByPrimaryKey(ibdsMaxCode);
	}

	@Override
	public IbdsMaxCode getByName(String productCode) {
		IbdsMaxCodeExample example = new IbdsMaxCodeExample();
		IbdsMaxCodeExample.Criteria criteria = example.createCriteria();
		criteria.andProjectNameEqualTo(productCode);
		Map<String, Object> param  = new HashMap<String, Object>();
		param.put("projectName", productCode);
		
		return ibdsMaxCodeMapper.getByName(param);
		
	}

}
