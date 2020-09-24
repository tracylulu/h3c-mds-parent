package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_DifficultyCoefficient_PROCESSMapper {
    long countByExample(IBDS_DifficultyCoefficient_PROCESSExample example);

    int deleteByExample(IBDS_DifficultyCoefficient_PROCESSExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_DifficultyCoefficient_PROCESS record);

    int insertSelective(IBDS_DifficultyCoefficient_PROCESS record);

    List<IBDS_DifficultyCoefficient_PROCESS> selectByExample(IBDS_DifficultyCoefficient_PROCESSExample example);

    IBDS_DifficultyCoefficient_PROCESS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_DifficultyCoefficient_PROCESS record, @Param("example") IBDS_DifficultyCoefficient_PROCESSExample example);

    int updateByExample(@Param("record") IBDS_DifficultyCoefficient_PROCESS record, @Param("example") IBDS_DifficultyCoefficient_PROCESSExample example);

    int updateByPrimaryKeySelective(IBDS_DifficultyCoefficient_PROCESS record);

    int updateByPrimaryKey(IBDS_DifficultyCoefficient_PROCESS record);
    
    String getMaxCode();
    
    int insertSelectiveBackID(IBDS_DifficultyCoefficient_PROCESS record);
}