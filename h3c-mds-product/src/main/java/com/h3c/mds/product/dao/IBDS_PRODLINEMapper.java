package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.IBDS_PRODLINEExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_PRODLINEMapper {
    long countByExample(IBDS_PRODLINEExample example);

    int deleteByExample(IBDS_PRODLINEExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_PRODLINE record);

    int insertSelective(IBDS_PRODLINE record);

    List<IBDS_PRODLINE> selectByExample(IBDS_PRODLINEExample example);

    IBDS_PRODLINE selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_PRODLINE record, @Param("example") IBDS_PRODLINEExample example);

    int updateByExample(@Param("record") IBDS_PRODLINE record, @Param("example") IBDS_PRODLINEExample example);

    int updateByPrimaryKeySelective(IBDS_PRODLINE record);

    int updateByPrimaryKey(IBDS_PRODLINE record);

    String getMaxCode();

    IBDS_PRODLINE selectByCode(String code);
    
    IBDS_PRODLINE selectByID(Integer code);
    
    List<IBDS_PRODLINE> selectByCodeList(@Param("codeList")List<String> lst);
}