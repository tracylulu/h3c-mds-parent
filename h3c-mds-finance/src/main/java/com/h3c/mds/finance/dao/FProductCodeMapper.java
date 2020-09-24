package com.h3c.mds.finance.dao;

import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProductCodeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface FProductCodeMapper {
    long countByExample(FProductCodeExample example);

    int deleteByExample(FProductCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FProductCode record);

    int insertSelective(FProductCode record);

    List<FProductCode> selectByExample(FProductCodeExample example);

    FProductCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FProductCode record, @Param("example") FProductCodeExample example);

    int updateByExample(@Param("record") FProductCode record, @Param("example") FProductCodeExample example);

    int updateByPrimaryKeySelective(FProductCode record);

    int updateByPrimaryKey(FProductCode record);

    Integer getCountByProductCode(String productCode);

    Integer getCountByBomCode(String bomCode);

    String getMaxCode();

    @DataAuth(resource = "productCode",type = "userRole")
    List<FProductCode> findByPage(@Param("params") Map<String, Object> params);

    List<String> getProductCodeByBomCodeNoCode(@Param("params") Map<String, Object> params);
}