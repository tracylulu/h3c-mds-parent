package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FProdMapper {
    long countByExample(FProdExample example);

    int deleteByExample(FProdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FProd record);

    int insertSelective(FProd record);

    List<FProd> selectByExample(FProdExample example);

    FProd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FProd record, @Param("example") FProdExample example);

    int updateByExample(@Param("record") FProd record, @Param("example") FProdExample example);

    int updateByPrimaryKeySelective(FProd record);

    int updateByPrimaryKey(FProd record);

    List<FProd> getPdtId(Integer pdtId);
}