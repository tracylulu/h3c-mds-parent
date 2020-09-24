package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_NoList;
import com.h3c.mds.product.entity.IBDS_NoListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_NoListMapper {
    long countByExample(IBDS_NoListExample example);

    int deleteByExample(IBDS_NoListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_NoList record);

    int insertSelective(IBDS_NoList record);

    List<IBDS_NoList> selectByExample(IBDS_NoListExample example);

    IBDS_NoList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_NoList record, @Param("example") IBDS_NoListExample example);

    int updateByExample(@Param("record") IBDS_NoList record, @Param("example") IBDS_NoListExample example);

    int updateByPrimaryKeySelective(IBDS_NoList record);

    int updateByPrimaryKey(IBDS_NoList record);
}