package com.h3c.mds.finance.service;

import com.h3c.mds.finance.entity.FProductCodeHistory;

public interface FproductCodeHistoryService {

    void create(FProductCodeHistory fProductCodeHistory);

    FProductCodeHistory getProductCodeById(Integer id);
}
