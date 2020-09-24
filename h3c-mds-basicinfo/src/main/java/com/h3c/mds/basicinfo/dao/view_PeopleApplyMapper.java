package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.view_PeopleApply;
import com.h3c.mds.basicinfo.entity.view_PeopleApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface view_PeopleApplyMapper {
    long countByExample(view_PeopleApplyExample example);

    int deleteByExample(view_PeopleApplyExample example);

    int insert(view_PeopleApply record);

    int insertSelective(view_PeopleApply record);

    List<view_PeopleApply> selectByExample(view_PeopleApplyExample example);

    int updateByExampleSelective(@Param("record") view_PeopleApply record, @Param("example") view_PeopleApplyExample example);

    int updateByExample(@Param("record") view_PeopleApply record, @Param("example") view_PeopleApplyExample example);
}