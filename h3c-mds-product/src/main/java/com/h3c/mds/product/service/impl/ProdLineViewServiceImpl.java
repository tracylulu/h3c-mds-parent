package com.h3c.mds.product.service.impl;

import com.h3c.mds.product.dao.ProdLineVewMapper;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.service.ProdLineViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class ProdLineViewServiceImpl implements ProdLineViewService {

    @Autowired
    private ProdLineVewMapper prodLineVewMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ProdLineVew> getDataList(Map<String, String> searchMap) {
        return prodLineVewMapper.getDataList(searchMap);
    }
}
