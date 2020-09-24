package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.view_PeopleApplyList;
import com.h3c.mds.basicinfo.entity.view_PeopleApplyListExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface view_PeopleApplyListMapper {
    long countByExample(view_PeopleApplyListExample example);

    int deleteByExample(view_PeopleApplyListExample example);

    int insert(view_PeopleApplyList record);

    int insertSelective(view_PeopleApplyList record);

    List<view_PeopleApplyList> selectByExample(view_PeopleApplyListExample example);

    int updateByExampleSelective(@Param("record") view_PeopleApplyList record, @Param("example") view_PeopleApplyListExample example);

    int updateByExample(@Param("record") view_PeopleApplyList record, @Param("example") view_PeopleApplyListExample example);
    
    List< view_PeopleApplyList> selectByMap(@Param("param") Map<String,String> param);
}