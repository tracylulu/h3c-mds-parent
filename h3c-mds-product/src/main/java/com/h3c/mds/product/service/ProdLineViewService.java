package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.ProdLineVew;

import java.util.List;
import java.util.Map;

public interface ProdLineViewService {
    List<ProdLineVew> getDataList(Map<String, String> searchMap);
}
