package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IbdsErrorCode;
import com.h3c.mds.product.entity.IbdsErrorCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IbdsErrorCodeMapper {
    long countByExample(IbdsErrorCodeExample example);

    int deleteByExample(IbdsErrorCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IbdsErrorCode record);

    int insertSelective(IbdsErrorCode record);

    List<IbdsErrorCode> selectByExample(IbdsErrorCodeExample example);

    IbdsErrorCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IbdsErrorCode record, @Param("example") IbdsErrorCodeExample example);

    int updateByExample(@Param("record") IbdsErrorCode record, @Param("example") IbdsErrorCodeExample example);

    int updateByPrimaryKeySelective(IbdsErrorCode record);

    int updateByPrimaryKey(IbdsErrorCode record);
}