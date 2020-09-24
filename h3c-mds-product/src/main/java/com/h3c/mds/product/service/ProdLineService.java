package com.h3c.mds.product.service;

import java.util.List;
import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.IBDS_PRODLINEExample;

import org.springframework.transaction.annotation.Transactional;

public interface ProdLineService {
    void create(IBDS_PRODLINE prodline);

    void update(IBDS_PRODLINE prodline);

    @Transactional(readOnly=true)
    String getMaxCode();
    
    IBDS_PRODLINE selectByCode(String code);
    
    List<IBDS_PRODLINE> selectByExample(IBDS_PRODLINEExample example);
    
    List<IBDS_PRODLINE> getAll();

    List<IBDS_PRODLINE> getByName(String name);
}

