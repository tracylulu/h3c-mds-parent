package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.ProductCodeApply;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 产品编码申请服务类
 */
public interface ProductCodeApplyService {

    /**
     * 创建产品编码子表单数据
     * @param productCodeApply
     */
    @Transactional
    void create(ProductCodeApply productCodeApply);

    /**
     * 更新产品编码申请信息
     * @param productCodeApply
     */
    @Transactional
    void update(ProductCodeApply productCodeApply);

    /**
     * 根据流程申请编号获取子表单id集合
     * @param processCode   申请编号
     * @return  ids id集合
     */
    @Transactional(readOnly = true)
    List<Integer> getIdsByProcessCode(String processCode);

    /**
     * 根据id删除数据
     * @param id
     */
    @Transactional
    void deleteById(Integer id);

    List<ProductCodeApply> getByProcessCode(String applyCode);

    /**
     * 根据产品编号获取在途申请
     * @param productCode
     * @return
     */
    List<ProductCodeApply> getZTByProductCode(String productCode);

    @Transactional(readOnly = true)
    Integer getZTCountByProductCode(String productCode);

    @Transactional(readOnly = true)
    Integer getZTCountByBomCode(String bomCode);

    Integer getZTCountByOldProductCode(String oldProductCode);

    List<ProductCodeApply> getZTByOldProductCode(String oldProductCode);


    ProductCodeApply getById(Integer id);

    List<ProductCodeApply> getZTByBomCode(String bomCode);

    /**
     * 根据原产品编码获取在途流程编号
     * @param oldProductCode
     * @return
     */
    List<String> getZTProcessCodeByOldProductCode(String oldProductCode);

    /**
     * 根据Bom编码获取在途流程编号
     * @param bomCode
     * @return
     */
    List<String> getZTProcessCodeByBomCode(String bomCode);

    /**
     * 根据产品编码获取在途流程编号
     * @param productCode
     * @return
     */
    List<String> getZTProcessCodeByProductCode(String productCode);

    List<String> getZTProcessCodeByProductNo(String productNo);

    List<String> getZTProcessCodeByProdlineNoAndProdlineName(String prodlineNo, String prodlineName);
}
