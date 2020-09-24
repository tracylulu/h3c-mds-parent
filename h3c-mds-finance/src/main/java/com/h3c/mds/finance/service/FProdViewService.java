package com.h3c.mds.finance.service;

import com.h3c.mds.finance.entity.FProdView;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface FProdViewService {
    @Transactional(readOnly = true)
    List<FProdView> getDataList(Map<String, String> params);

    @Transactional(readOnly = true)
    FProdView selectByCode(String code);

    FProdView getById(Integer code);

    List<FProdView> getByProdlineNameAndNo(String prodlineName, String prodlineNo);

    @Transactional(readOnly = true)
    List<FProdView> getByProdlineName(String prodlineName);
}
