package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_History;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_HistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_DifficultyCoefficient_HistoryMapper {
    long countByExample(IBDS_DifficultyCoefficient_HistoryExample example);

    int deleteByExample(IBDS_DifficultyCoefficient_HistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_DifficultyCoefficient_History record);

    int insertSelective(IBDS_DifficultyCoefficient_History record);

    List<IBDS_DifficultyCoefficient_History> selectByExample(IBDS_DifficultyCoefficient_HistoryExample example);

    IBDS_DifficultyCoefficient_History selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_DifficultyCoefficient_History record, @Param("example") IBDS_DifficultyCoefficient_HistoryExample example);

    int updateByExample(@Param("record") IBDS_DifficultyCoefficient_History record, @Param("example") IBDS_DifficultyCoefficient_HistoryExample example);

    int updateByPrimaryKeySelective(IBDS_DifficultyCoefficient_History record);

    int updateByPrimaryKey(IBDS_DifficultyCoefficient_History record);
}