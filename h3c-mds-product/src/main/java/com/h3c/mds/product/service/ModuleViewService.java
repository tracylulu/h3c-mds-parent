package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.ModuleView;


import java.util.List;
import java.util.Map;

public interface ModuleViewService {
    List<ModuleView> getDataList(Map<String, String> searchMap);
}
