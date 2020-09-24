package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.view_VRProcess;
import com.h3c.mds.basicinfo.entity.view_VRProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface view_VRProcessMapper {
    long countByExample(view_VRProcessExample example);

    int deleteByExample(view_VRProcessExample example);

    int insert(view_VRProcess record);

    int insertSelective(view_VRProcess record);

    List<view_VRProcess> selectByExample(view_VRProcessExample example);

    int updateByExampleSelective(@Param("record") view_VRProcess record, @Param("example") view_VRProcessExample example);

    int updateByExample(@Param("record") view_VRProcess record, @Param("example") view_VRProcessExample example);
}