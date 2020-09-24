package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_PDTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_PDTMapper {
    long countByExample(IBDS_PDTExample example);

    int deleteByExample(IBDS_PDTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_PDT record);

    int insertSelective(IBDS_PDT record);

    List<IBDS_PDT> selectByExample(IBDS_PDTExample example);

    IBDS_PDT selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_PDT record, @Param("example") IBDS_PDTExample example);

    int updateByExample(@Param("record") IBDS_PDT record, @Param("example") IBDS_PDTExample example);

    int updateByPrimaryKeySelective(IBDS_PDT record);

    int updateByPrimaryKey(IBDS_PDT record);

    String getMaxCode();

    IBDS_PDT selectByCode(String code);
    
    IBDS_PDT selectByID(Integer code);
    
    List<IBDS_PDT> selectByCodeList(@Param("codeList")List<String> lst);
}