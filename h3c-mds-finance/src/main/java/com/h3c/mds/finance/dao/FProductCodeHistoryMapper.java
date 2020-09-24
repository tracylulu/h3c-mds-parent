package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProductCodeHistory;
import com.h3c.mds.finance.entity.FProductCodeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FProductCodeHistoryMapper {
    long countByExample(FProductCodeHistoryExample example);

    int deleteByExample(FProductCodeHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FProductCodeHistory record);

    int insertSelective(FProductCodeHistory record);

    List<FProductCodeHistory> selectByExample(FProductCodeHistoryExample example);

    FProductCodeHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FProductCodeHistory record, @Param("example") FProductCodeHistoryExample example);

    int updateByExample(@Param("record") FProductCodeHistory record, @Param("example") FProductCodeHistoryExample example);

    int updateByPrimaryKeySelective(FProductCodeHistory record);

    int updateByPrimaryKey(FProductCodeHistory record);

    FProductCodeHistory getProductCodeById(Integer id);
}