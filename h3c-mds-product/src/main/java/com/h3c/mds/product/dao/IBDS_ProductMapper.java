package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_ProductMapper {
    long countByExample(IBDS_ProductExample example);

    int deleteByExample(IBDS_ProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_Product record);

    int insertSelective(IBDS_Product record);

    List<IBDS_Product> selectByExample(IBDS_ProductExample example);

    IBDS_Product selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_Product record, @Param("example") IBDS_ProductExample example);

    int updateByExample(@Param("record") IBDS_Product record, @Param("example") IBDS_ProductExample example);

    int updateByPrimaryKeySelective(IBDS_Product record);

    int updateByPrimaryKey(IBDS_Product record);

    String getMaxCode();


}