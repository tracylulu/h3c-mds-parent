package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.ModuleVersionView;

import java.util.List;
import java.util.Map;

public interface ModuleVersionViewService {
    List<ModuleVersionView> getDataList(Map<String, String> searchMap);
}
