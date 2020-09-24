package com.h3c.mds.finance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.finance.entity.FProjectCodeHis;
import com.h3c.mds.finance.entity.FProjectCodeHisExample;

public interface FProjectCodeHisMapper {
    long countByExample(FProjectCodeHisExample example);

    int deleteByExample(FProjectCodeHisExample example);

    int insert(FProjectCodeHis record);

    int insertSelective(FProjectCodeHis record);

    List<FProjectCodeHis> selectByExample(FProjectCodeHisExample example);

    int updateByExampleSelective(@Param("record") FProjectCodeHis record, @Param("example") FProjectCodeHisExample example);

    int updateByExample(@Param("record") FProjectCodeHis record, @Param("example") FProjectCodeHisExample example);
    
    int  insertAndGetId(FProjectCodeHis record);
    
    List<FProjectCodeHis> getByColumn(@Param("param") Map<String, Object> param);
}