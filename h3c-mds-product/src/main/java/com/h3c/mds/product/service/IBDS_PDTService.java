package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_PDTExample;

public interface IBDS_PDTService {
    int create(IBDS_PDT pdt);

    @Transactional(readOnly=true)
    String getMaxCode();

    void update(IBDS_PDT pdt);
    
    @Transactional(readOnly=true)
    IBDS_PDT selectByCode(String code);
    
    List<IBDS_PDT> selectByExample(IBDS_PDTExample exapmle);
    
    List<IBDS_PDT> getPdtByProlineno(Map<String, Object> param);
}
