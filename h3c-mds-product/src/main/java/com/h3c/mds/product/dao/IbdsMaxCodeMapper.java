package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IbdsMaxCode;
import com.h3c.mds.product.entity.IbdsMaxCodeExample;

public interface IbdsMaxCodeMapper {
    long countByExample(IbdsMaxCodeExample example);

    int deleteByExample(IbdsMaxCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IbdsMaxCode record);

    int insertSelective(IbdsMaxCode record);

    List<IbdsMaxCode> selectByExample(IbdsMaxCodeExample example);

    IbdsMaxCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IbdsMaxCode record, @Param("example") IbdsMaxCodeExample example);

    int updateByExample(@Param("record") IbdsMaxCode record, @Param("example") IbdsMaxCodeExample example);

    int updateByPrimaryKeySelective(IbdsMaxCode record);

    int updateByPrimaryKey(IbdsMaxCode record);
    
    IbdsMaxCode getByName(@Param("param") Map<String,Object> param);
    
}