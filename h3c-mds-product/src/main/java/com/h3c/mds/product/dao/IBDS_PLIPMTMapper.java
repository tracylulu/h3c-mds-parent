package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_PLIPMTExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBDS_PLIPMTMapper {
    long countByExample(IBDS_PLIPMTExample example);

    int deleteByExample(IBDS_PLIPMTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_PLIPMT record);

    int insertSelective(IBDS_PLIPMT record);

    List<IBDS_PLIPMT> selectByExample(IBDS_PLIPMTExample example);

    IBDS_PLIPMT selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_PLIPMT record, @Param("example") IBDS_PLIPMTExample example);

    int updateByExample(@Param("record") IBDS_PLIPMT record, @Param("example") IBDS_PLIPMTExample example);

    int updateByPrimaryKeySelective(IBDS_PLIPMT record);

    int updateByPrimaryKey(IBDS_PLIPMT record);

    List<IBDS_PLIPMT> findByPage(Map<String, Object> queryParams);

    @BusinessFilter(type = "baseFilter")
    List<IBDS_PLIPMT> getByMap(Map<String, String> searchMap);

    IBDS_PLIPMT selectByCode(String code);
    
    IBDS_PLIPMT selectByID(Integer code);

    String getMaxCode();
    List<IBDS_PLIPMT> selectByCodeList(@Param("codeList")List<String> lst);
    
    @BusinessFilter(type = "baseFilter")
    List<IBDS_PLIPMT> getExportList(Map<String, String> searchMap);
}