package com.h3c.mds.product.service.impl;

import com.h3c.mds.product.dao.ProductViewMapper;
import com.h3c.mds.product.entity.ProductView;
import com.h3c.mds.product.service.ProductViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class ProductViewServiceImpl implements ProductViewService {

    @Autowired
    private ProductViewMapper productViewMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ProductView> getDataList(Map<String, String> map){
        return productViewMapper.getDataList(map);
    }
    
    @Override
    @Transactional(readOnly = true)
    public ProductView selectByCode(String code) {
    	return productViewMapper.selectByCode(code);
    }
}
