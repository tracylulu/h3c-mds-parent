package com.h3c.mds.finance.service;

import com.h3c.mds.finance.entity.FProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FProductService {
    @Transactional(readOnly = true)
    Integer getCountByCode(String code);

    @Transactional(readOnly = true)
    List<FProduct> getByCode(String code);

    @Transactional
    void create(FProduct fProduct);

    @Transactional
    void update(FProduct fProduct);

    @Transactional(readOnly = true)
    String getMaxCode();
}
