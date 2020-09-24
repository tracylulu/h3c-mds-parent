package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProdView;
import com.h3c.mds.finance.entity.FProdViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface FProdViewMapper {
    long countByExample(FProdViewExample example);

    int deleteByExample(FProdViewExample example);

    int insert(FProdView record);

    int insertSelective(FProdView record);

    List<FProdView> selectByExample(FProdViewExample example);

    int updateByExampleSelective(@Param("record") FProdView record, @Param("example") FProdViewExample example);

    int updateByExample(@Param("record") FProdView record, @Param("example") FProdViewExample example);

    List<FProdView> getDataList(@Param("param") Map<String, String> params);

    FProdView selectByCode(String code);
}