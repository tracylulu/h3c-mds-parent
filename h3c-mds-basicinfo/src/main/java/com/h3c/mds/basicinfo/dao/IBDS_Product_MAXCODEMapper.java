package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODE;
import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODEExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_Product_MAXCODEMapper {
    long countByExample(IBDS_Product_MAXCODEExample example);

    int deleteByExample(IBDS_Product_MAXCODEExample example);

    int insert(IBDS_Product_MAXCODE record);

    int insertSelective(IBDS_Product_MAXCODE record);

    List<IBDS_Product_MAXCODE> selectByExample(IBDS_Product_MAXCODEExample example);

    int updateByExampleSelective(@Param("record") IBDS_Product_MAXCODE record, @Param("example") IBDS_Product_MAXCODEExample example);

    int updateByExample(@Param("record") IBDS_Product_MAXCODE record, @Param("example") IBDS_Product_MAXCODEExample example);
}