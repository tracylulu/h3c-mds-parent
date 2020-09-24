package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.entity.ProductCodeApplyExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProductCodeApplyMapper {
    long countByExample(ProductCodeApplyExample example);

    int deleteByExample(ProductCodeApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCodeApply record);

    int insertSelective(ProductCodeApply record);

    List<ProductCodeApply> selectByExample(ProductCodeApplyExample example);

    ProductCodeApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCodeApply record, @Param("example") ProductCodeApplyExample example);

    int updateByExample(@Param("record") ProductCodeApply record, @Param("example") ProductCodeApplyExample example);

    int updateByPrimaryKeySelective(ProductCodeApply record);

    int updateByPrimaryKey(ProductCodeApply record);

    List<Integer> getIdsByProcessCode(String processCode);

    List<ProductCodeApply> getByProcessCode(String applyCode);

    List<ProductCodeApply> getZTByProductCode(String productCode);

    Integer getZTCountByProductCode(String productCode);

    Integer getZTCountByBomCode(String bomCode);

    Integer getZTCountByOldProductCode(String oldProductCode);

    List<ProductCodeApply> getZTByBomCode(String bomCode);

    List<ProductCodeApply> getZTByOldProductCode(String oldProductCode);

    List<String> getZTProcessCodeByOldProductCode(String oldProductCode);

    List<String> getZTProcessCodeByBomCode(String bomCode);

    List<String> getZTProcessCodeByProductCode(String productCode);

    List<String> getZTProcessCodeByProductNo(String productNo);

    List<String> getZTProcessCodeByProdlineNoAndProdlineName(@Param("param") Map<String,Object> map);
}