package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.TeamView;
import com.h3c.mds.product.entity.TeamViewExample;

public interface TeamViewMapper {
    long countByExample(TeamViewExample example);

    int deleteByExample(TeamViewExample example);

    int insert(TeamView record);

    int insertSelective(TeamView record);

    List<TeamView> selectByExample(TeamViewExample example);

    int updateByExampleSelective(@Param("record") TeamView record, @Param("example") TeamViewExample example);

    int updateByExample(@Param("record") TeamView record, @Param("example") TeamViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "teamFilterStrategy")
    List<TeamView> getTreeData(@Param("param") Map<String, String> param);//selectByCode
    
    TeamView selectByCode(@Param("code") String code);
    
    TeamView selectByID(@Param("code") Integer code);
    
    String getMaxCode();
    
    List<TeamView> getExportList(@Param("param") Map<String, String> param);
}