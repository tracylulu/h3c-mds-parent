package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBDS_ReleaseMapper {
    long countByExample(IBDS_ReleaseExample example);

    int deleteByExample(IBDS_ReleaseExample example);

    int insert(IBDS_Release record);

    int insertSelective(IBDS_Release record);

    List<IBDS_Release> selectByExample(IBDS_ReleaseExample example);

    int updateByExampleSelective(@Param("record") IBDS_Release record, @Param("example") IBDS_ReleaseExample example);

    int updateByExample(@Param("record") IBDS_Release record, @Param("example") IBDS_ReleaseExample example);
    
    String getMaxCode();
    
    IBDS_Release selectByCode(@Param("code") String code);
    
    IBDS_Release selectByID(@Param("code") Integer code);
    
    IBDS_Release selectByPrimaryKey(Integer id);
    
    int updateByPrimaryKeySelective(IBDS_Release record);
    
    List<IBDS_Release> selectByMap(@Param("param") Map<String, String> param);
    
    List<IBDS_Release> selectByCodeList(@Param("codeList")List<String> lst);
}