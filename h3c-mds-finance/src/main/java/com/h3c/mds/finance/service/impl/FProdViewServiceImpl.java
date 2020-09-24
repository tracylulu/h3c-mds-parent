package com.h3c.mds.finance.service.impl;

import com.h3c.mds.finance.dao.FProdViewMapper;
import com.h3c.mds.finance.entity.FProdView;
import com.h3c.mds.finance.entity.FProdViewExample;
import com.h3c.mds.finance.service.FProdViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

@Service
public class FProdViewServiceImpl implements FProdViewService {

    @Autowired
    private FProdViewMapper fProdViewMapper;

    @Transactional(readOnly = true)
    @Override
    public List<FProdView> getDataList(Map<String, String> params){
        return fProdViewMapper.getDataList(params);
    }

    @Transactional(readOnly = true)
    @Override
    public FProdView selectByCode(String code){
        return fProdViewMapper.selectByCode(code);
    }

    @Override
    @Transactional
    public FProdView getById(Integer id) {
        FProdViewExample example = new FProdViewExample();
        FProdViewExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<FProdView> fProdViews = fProdViewMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(fProdViews))
            return null;
        return fProdViews.get(0);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProdView> getByProdlineNameAndNo(String prodlineName, String prodlineNo) {
        FProdViewExample example = new FProdViewExample();
        FProdViewExample.Criteria criteria = example.createCriteria();
        criteria.andProdlineDescEqualTo(prodlineName);
        criteria.andProdlineNoEqualTo(prodlineNo);
        return fProdViewMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProdView> getByProdlineName(String prodlineName){
        FProdViewExample example = new FProdViewExample();
        FProdViewExample.Criteria criteria = example.createCriteria();
        criteria.andProdlineDescEqualTo(prodlineName);
        return fProdViewMapper.selectByExample(example);
    }
}
