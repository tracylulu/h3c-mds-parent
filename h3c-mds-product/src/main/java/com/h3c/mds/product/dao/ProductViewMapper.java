package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.ProductView;
import com.h3c.mds.product.entity.ProductViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProductViewMapper {
    long countByExample(ProductViewExample example);

    int deleteByExample(ProductViewExample example);

    int insert(ProductView record);

    int insertSelective(ProductView record);

    List<ProductView> selectByExample(ProductViewExample example);

    int updateByExampleSelective(@Param("record") ProductView record, @Param("example") ProductViewExample example);

    int updateByExample(@Param("record") ProductView record, @Param("example") ProductViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "productFilterStrategy")
    List<ProductView> getDataList(@Param("param") Map<String, String> map);

    ProductView selectByCode(String code);
    
    ProductView selectByID(Integer code);
    
    List<ProductView> getExportList(@Param("param") Map<String, String> map);
}