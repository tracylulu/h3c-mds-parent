package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_People_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_APPLYExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_People_APPLYMapper {
    long countByExample(IBDS_People_APPLYExample example);

    int deleteByExample(IBDS_People_APPLYExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_People_APPLY record);

    int insertSelective(IBDS_People_APPLY record);

    List<IBDS_People_APPLY> selectByExample(IBDS_People_APPLYExample example);

    IBDS_People_APPLY selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_People_APPLY record, @Param("example") IBDS_People_APPLYExample example);

    int updateByExample(@Param("record") IBDS_People_APPLY record, @Param("example") IBDS_People_APPLYExample example);

    int updateByPrimaryKeySelective(IBDS_People_APPLY record);

    int updateByPrimaryKey(IBDS_People_APPLY record);
    
    int insertBackID(IBDS_People_APPLY record);
}