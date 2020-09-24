package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_People_PROCESSMapper {
    long countByExample(IBDS_People_PROCESSExample example);

    int deleteByExample(IBDS_People_PROCESSExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_People_PROCESS record);

    int insertSelective(IBDS_People_PROCESS record);

    List<IBDS_People_PROCESS> selectByExample(IBDS_People_PROCESSExample example);

    IBDS_People_PROCESS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_People_PROCESS record, @Param("example") IBDS_People_PROCESSExample example);

    int updateByExample(@Param("record") IBDS_People_PROCESS record, @Param("example") IBDS_People_PROCESSExample example);

    int updateByPrimaryKeySelective(IBDS_People_PROCESS record);

    int updateByPrimaryKey(IBDS_People_PROCESS record);
    
    String getMaxCode();
    
    int insertSelectiveBackID(IBDS_People_PROCESS record);
}