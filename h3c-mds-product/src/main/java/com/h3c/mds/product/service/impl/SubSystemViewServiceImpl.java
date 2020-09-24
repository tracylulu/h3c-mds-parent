package com.h3c.mds.product.service.impl;

import com.h3c.mds.product.dao.SubSystemViewMapper;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.entity.SubSystemView;
import com.h3c.mds.product.service.SubSystemViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class SubSystemViewServiceImpl implements SubSystemViewService {

    @Autowired
    private SubSystemViewMapper viewMapper;

    @Override
    @Transactional(readOnly = true)
    public List<SubSystemView> getDataList(Map<String, String> searchMap) {
        return viewMapper.getDataList(searchMap);
    }
}
