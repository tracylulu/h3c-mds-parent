package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.PdtView;

import java.util.List;
import java.util.Map;

public interface PdtViewService {
    List<PdtView> getDataList(Map<String, String> searchMap);
}
