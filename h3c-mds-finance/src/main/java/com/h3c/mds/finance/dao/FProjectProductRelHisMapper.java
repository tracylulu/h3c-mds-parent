package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProjectProductRelHis;
import com.h3c.mds.finance.entity.FProjectProductRelHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FProjectProductRelHisMapper {
    long countByExample(FProjectProductRelHisExample example);

    int deleteByExample(FProjectProductRelHisExample example);

    int insert(FProjectProductRelHis record);

    int insertSelective(FProjectProductRelHis record);

    List<FProjectProductRelHis> selectByExample(FProjectProductRelHisExample example);

    int updateByExampleSelective(@Param("record") FProjectProductRelHis record, @Param("example") FProjectProductRelHisExample example);

    int updateByExample(@Param("record") FProjectProductRelHis record, @Param("example") FProjectProductRelHisExample example);
}