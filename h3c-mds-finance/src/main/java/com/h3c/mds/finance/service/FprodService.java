package com.h3c.mds.finance.service;

import com.h3c.mds.finance.entity.FProd;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FprodService {

    /**
     * 根据产品编号获取产品族信息
     * @param lineNo
     * @return
     */
    @Transactional(readOnly = true)
    List<FProd> getByLineNo(String lineNo);

    /**
     * 根据产品族编码查询
     * @param code
     * @return
     */
    FProd getByCode(String code);

    @Transactional(readOnly = true)
    Integer getCountByCode(String code);

    @Transactional
    void create(FProd fProd);

    @Transactional
    void update(FProd fProd);
    
    void updateFProd(FProd fProd);

    List<FProd> getByLineId(Integer id);

    FProd getById(Integer id);

    List<FProd> getByNoAndName(String productNo, String productName);

    List<FProd> getByPdtId(Integer pdtId);
}
