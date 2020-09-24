package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FProjectCodeMapper {
    long countByExample(FProjectCodeExample example);

    int deleteByExample(FProjectCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FProjectCode record);

    int insertSelective(FProjectCode record);

    List<FProjectCode> selectByExample(FProjectCodeExample example);

    FProjectCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FProjectCode record, @Param("example") FProjectCodeExample example);

    int updateByExample(@Param("record") FProjectCode record, @Param("example") FProjectCodeExample example);

    int updateByPrimaryKeySelective(FProjectCode record);

    int updateByPrimaryKey(FProjectCode record);
}