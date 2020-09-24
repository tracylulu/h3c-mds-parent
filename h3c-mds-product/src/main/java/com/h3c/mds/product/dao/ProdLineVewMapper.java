package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.entity.ProdLineVewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProdLineVewMapper {
    long countByExample(ProdLineVewExample example);

    int deleteByExample(ProdLineVewExample example);

    int insert(ProdLineVew record);

    int insertSelective(ProdLineVew record);

    List<ProdLineVew> selectByExample(ProdLineVewExample example);

    int updateByExampleSelective(@Param("record") ProdLineVew record, @Param("example") ProdLineVewExample example);

    int updateByExample(@Param("record") ProdLineVew record, @Param("example") ProdLineVewExample example);

    @BusinessFilter(resource = "prodline",type = "treeFilter",strategy = "prodlineFilterStrategy")
    List<ProdLineVew> getDataList(@Param("param") Map<String, String> searchMap);

    ProdLineVew selectByCode(String code);
    
    ProdLineVew selectByID(Integer code);
    
    List<ProdLineVew> getExportList(@Param("param") Map<String, String> param);
}