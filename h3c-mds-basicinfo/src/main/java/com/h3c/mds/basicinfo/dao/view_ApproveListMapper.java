package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.view_ApproveList;
import com.h3c.mds.basicinfo.entity.view_ApproveListExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface view_ApproveListMapper {
    long countByExample(view_ApproveListExample example);

    int deleteByExample(view_ApproveListExample example);

    int insert(view_ApproveList record);

    int insertSelective(view_ApproveList record);

    List<view_ApproveList> selectByExample(view_ApproveListExample example);

    int updateByExampleSelective(@Param("record") view_ApproveList record, @Param("example") view_ApproveListExample example);

    int updateByExample(@Param("record") view_ApproveList record, @Param("example") view_ApproveListExample example);
    
    List<view_ApproveList> getList(@Param("param")Map<String,String> param);
    
    List<view_ApproveList> getMyApplicationList(@Param("param") Map<String,String> param);
    
    List<view_ApproveList> getHistoryList(@Param("param") Map<String,String> param);    
}