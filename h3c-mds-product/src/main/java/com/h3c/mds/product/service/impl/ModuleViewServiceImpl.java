package com.h3c.mds.product.service.impl;

import com.h3c.mds.product.dao.ModuleViewMapper;
import com.h3c.mds.product.entity.ModuleView;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.service.ModuleViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class ModuleViewServiceImpl implements ModuleViewService {

    @Autowired
    private ModuleViewMapper viewMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ModuleView> getDataList(Map<String, String> searchMap) {
        return viewMapper.getDataList(searchMap);
    }
}
