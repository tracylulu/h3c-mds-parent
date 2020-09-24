package com.h3c.mds.product.service.impl;

import com.h3c.mds.product.dao.ModuleVersionViewMapper;
import com.h3c.mds.product.entity.ModuleVersionView;
import com.h3c.mds.product.service.ModuleVersionViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ModuleVersionViewServiceImpl implements ModuleVersionViewService {

    @Autowired
    private ModuleVersionViewMapper versionViewMapper;

    @Override
    public List<ModuleVersionView> getDataList(Map<String, String> searchMap) {
        return versionViewMapper.getDataList(searchMap);
    }
}
