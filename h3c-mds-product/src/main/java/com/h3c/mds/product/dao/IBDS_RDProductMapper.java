package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_RDProduct;
import com.h3c.mds.product.entity.IBDS_RDProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_RDProductMapper {
    long countByExample(IBDS_RDProductExample example);

    int deleteByExample(IBDS_RDProductExample example);

    int insert(IBDS_RDProduct record);

    int insertSelective(IBDS_RDProduct record);

    List<IBDS_RDProduct> selectByExample(IBDS_RDProductExample example);

    int updateByExampleSelective(@Param("record") IBDS_RDProduct record, @Param("example") IBDS_RDProductExample example);

    int updateByExample(@Param("record") IBDS_RDProduct record, @Param("example") IBDS_RDProductExample example);
}