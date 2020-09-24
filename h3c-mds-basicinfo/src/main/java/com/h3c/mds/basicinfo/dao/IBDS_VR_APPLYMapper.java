package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLYExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBDS_VR_APPLYMapper {
    long countByExample(IBDS_VR_APPLYExample example);

    int deleteByExample(IBDS_VR_APPLYExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_VR_APPLY record);

    int insertSelective(IBDS_VR_APPLY record);

    List<IBDS_VR_APPLY> selectByExample(IBDS_VR_APPLYExample example);

    IBDS_VR_APPLY selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_VR_APPLY record, @Param("example") IBDS_VR_APPLYExample example);

    int updateByExample(@Param("record") IBDS_VR_APPLY record, @Param("example") IBDS_VR_APPLYExample example);

    int updateByPrimaryKeySelective(IBDS_VR_APPLY record);

    int updateByPrimaryKey(IBDS_VR_APPLY record);
    
    
    Integer getVZTCountBymap(@Param("param") Map<String, String> param);
    
    Integer getZTCountByCode(@Param("param") Map<String,String> param);
    
    Integer insertSelectiveBackID(IBDS_VR_APPLY record);
    
    Integer validateVRIntransit(@Param("param") Map<String,String> param);
}