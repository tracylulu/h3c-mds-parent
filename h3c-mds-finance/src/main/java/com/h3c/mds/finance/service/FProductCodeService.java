package com.h3c.mds.finance.service;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProductCode;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FProductCodeService {

    @Transactional(readOnly = true)
    List<FProductCode> getByProdIdNo00(Integer prodId);

    @Transactional
    void create(FProductCode fProductCode);

    @Transactional
    void update(FProductCode fProductCode);


    @Transactional(readOnly = true)
    List<FProductCode> getByProductCode(String productCode);

    @Transactional(readOnly = true)
    Integer getCountByProductCode(String productCode);

    @Transactional(readOnly = true)
    Integer getCountByBomCode(String bomCode);

    @Transactional(readOnly=true)
    String getMaxCode();

    FProductCode getById(Integer id);

    PageInfo<FProductCode> findByPage(Integer page, Integer rows, String dep,String status,String searchStr,String prodLine,String pdt,String state,String start,String end);

    /**
     * 根据产品族id获取产品编码集合
     * @param prodId
     * @return
     */
    List<FProductCode> getByProdId(Integer prodId);

    List<String> getProductCodeByBomCodeNoCode(String bomCode, String productCode);
}
