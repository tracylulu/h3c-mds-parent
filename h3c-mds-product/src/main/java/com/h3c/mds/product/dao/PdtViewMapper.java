package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.product.entity.PdtView;
import com.h3c.mds.product.entity.PdtViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PdtViewMapper {
    long countByExample(PdtViewExample example);

    int deleteByExample(PdtViewExample example);

    int insert(PdtView record);

    int insertSelective(PdtView record);

    List<PdtView> selectByExample(PdtViewExample example);

    int updateByExampleSelective(@Param("record") PdtView record, @Param("example") PdtViewExample example);

    int updateByExample(@Param("record") PdtView record, @Param("example") PdtViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "pdtFilterStrategy")
    List<PdtView> getDataList(@Param("param") Map<String, String> searchMap);

    PdtView selectByCode(String code);
    
    PdtView selectByID(Integer code);
    
    List<PdtView> getExportList(@Param("param") Map<String, String> searchMap);
}