package com.h3c.mds.product.service.impl;

import com.h3c.mds.product.dao.PdtViewMapper;
import com.h3c.mds.product.entity.PdtView;
import com.h3c.mds.product.service.PdtViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class PdtViewServiceImpl implements PdtViewService {

    @Autowired
    private PdtViewMapper pdtViewMapper;

    @Override
    @Transactional(readOnly = true)
    public List<PdtView> getDataList(Map<String, String> searchMap) {

        return pdtViewMapper.getDataList(searchMap);
    }
}
