package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProduct;
import com.h3c.mds.finance.entity.FProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FProductMapper {
    long countByExample(FProductExample example);

    int deleteByExample(FProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FProduct record);

    int insertSelective(FProduct record);

    List<FProduct> selectByExample(FProductExample example);

    FProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FProduct record, @Param("example") FProductExample example);

    int updateByExample(@Param("record") FProduct record, @Param("example") FProductExample example);

    int updateByPrimaryKeySelective(FProduct record);

    int updateByPrimaryKey(FProduct record);

    String getMaxCode();
}