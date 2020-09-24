package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficient;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface view_DifficultyCoefficientMapper {
    long countByExample(view_DifficultyCoefficientExample example);

    int deleteByExample(view_DifficultyCoefficientExample example);

    int insert(view_DifficultyCoefficient record);

    int insertSelective(view_DifficultyCoefficient record);

    List<view_DifficultyCoefficient> selectByExample(view_DifficultyCoefficientExample example);

    int updateByExampleSelective(@Param("record") view_DifficultyCoefficient record, @Param("example") view_DifficultyCoefficientExample example);

    int updateByExample(@Param("record") view_DifficultyCoefficient record, @Param("example") view_DifficultyCoefficientExample example);
}