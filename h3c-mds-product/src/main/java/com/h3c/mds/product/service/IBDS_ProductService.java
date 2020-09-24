package com.h3c.mds.product.service;

import java.util.List;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_ProductExample;

import org.springframework.transaction.annotation.Transactional;

public interface IBDS_ProductService {
    void create(IBDS_Product product);


    String getMaxCode();

    void update(IBDS_Product product);

    @Transactional(readOnly = true)
    IBDS_Product getByProductNo(String productNo);
    
    List<IBDS_Product> selectByExample(IBDS_ProductExample example);
}
