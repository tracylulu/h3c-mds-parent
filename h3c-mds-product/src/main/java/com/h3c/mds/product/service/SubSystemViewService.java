package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.SubSystemView;

import java.util.List;
import java.util.Map;

public interface SubSystemViewService {
    List<SubSystemView> getDataList(Map<String, String> searchMap);
}
