package com.h3c.mds.flowable.dao;

import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.entity.ProductCodeProcessExample;
import java.util.List;
import java.util.Map;

import com.h3c.mds.flowable.entity.ProductCodeProcessExt;
import org.apache.ibatis.annotations.Param;

public interface ProductCodeProcessMapper {
    long countByExample(ProductCodeProcessExample example);

    int deleteByExample(ProductCodeProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCodeProcess record);

    int insertSelective(ProductCodeProcess record);

    List<ProductCodeProcess> selectByExample(ProductCodeProcessExample example);

    ProductCodeProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCodeProcess record, @Param("example") ProductCodeProcessExample example);

    int updateByExample(@Param("record") ProductCodeProcess record, @Param("example") ProductCodeProcessExample example);

    int updateByPrimaryKeySelective(ProductCodeProcess record);

    int updateByPrimaryKey(ProductCodeProcess record);

    void insertAndGetId(ProductCodeProcess record);

    @DataAuth(resource = "productCode",type = "userRole")
    List<ProductCodeProcess> findByPage(String searchStr);

    ProductCodeProcessExt getExtById(Integer id);

    String getMaxCode();

    @DataAuth(resource = "productCode",type = "userRole")
    List<ProductCodeProcessExt> dataList(@Param("param") Map<String, String> searchMap);
}