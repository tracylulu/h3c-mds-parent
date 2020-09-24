package com.h3c.mds.product.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.h3c.mds.product.dao.IBDS_ProductMapper;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_ProductExample;
import com.h3c.mds.product.service.IBDS_ProductService;

@Service
public class IBDS_ProductServiceImpl implements IBDS_ProductService {

	@Autowired
	private IBDS_ProductMapper productMapper;

	@Override
	@Transactional
	public void create(IBDS_Product product) {
		product.setProductno(getMaxCode());
		productMapper.insertSelective(product);
	}

	@Override
	@Transactional(readOnly = true)
	public synchronized String getMaxCode() {
		String maxCode = productMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "PP000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "PP";
		for (int i = 0; i < 6 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional
	public void update(IBDS_Product product) {
		IBDS_Product old = productMapper.selectByPrimaryKey(product.getId());
		if (old != null && !StringUtils.equals(old.getProduct(), product.getProduct())) {
			if (StringUtils.isNotBlank(old.getProductold())) {
				product.setProductold(old.getProductold() + ";" + old.getProduct());
			} else {
				product.setProductold(old.getProduct());
			}
		}
		productMapper.updateByPrimaryKeySelective(product);
	}

	@Transactional(readOnly = true)
	@Override
	public IBDS_Product getByProductNo(String productNo) {
		IBDS_ProductExample example = new IBDS_ProductExample();
		IBDS_ProductExample.Criteria criteria = example.createCriteria();
		criteria.andProductnoEqualTo(productNo);
		List<IBDS_Product> list = productMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list))
			return null;
		return list.get(0);
	}

	@Override
	public List<IBDS_Product> selectByExample(IBDS_ProductExample example) {
		return productMapper.selectByExample(example);
	}
}
