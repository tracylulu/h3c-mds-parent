package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientApplyList;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientApplyListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface view_DifficultyCoefficientApplyListMapper {
    long countByExample(view_DifficultyCoefficientApplyListExample example);

    int deleteByExample(view_DifficultyCoefficientApplyListExample example);

    int insert(view_DifficultyCoefficientApplyList record);

    int insertSelective(view_DifficultyCoefficientApplyList record);

    List<view_DifficultyCoefficientApplyList> selectByExample(view_DifficultyCoefficientApplyListExample example);

    int updateByExampleSelective(@Param("record") view_DifficultyCoefficientApplyList record, @Param("example") view_DifficultyCoefficientApplyListExample example);

    int updateByExample(@Param("record") view_DifficultyCoefficientApplyList record, @Param("example") view_DifficultyCoefficientApplyListExample example);
    List<view_DifficultyCoefficientApplyList> getDifficultyCoefficientApplyList(@Param("param") Map<String,Object> param);
}