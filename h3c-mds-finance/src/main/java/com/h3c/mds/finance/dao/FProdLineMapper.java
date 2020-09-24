package com.h3c.mds.finance.dao;

import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProdLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FProdLineMapper {
    long countByExample(FProdLineExample example);

    int deleteByExample(FProdLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FProdLine record);

    int insertSelective(FProdLine record);

    List<FProdLine> selectByExample(FProdLineExample example);

    FProdLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FProdLine record, @Param("example") FProdLineExample example);

    int updateByExample(@Param("record") FProdLine record, @Param("example") FProdLineExample example);

    int updateByPrimaryKeySelective(FProdLine record);

    int updateByPrimaryKey(FProdLine record);

    List<FProdLine> getDistinctNameByDept(String dept);

    @DataAuth(resource = "productCode",type = "userRole")
    List<FProdLine> getDistinctDescFromCode();
}