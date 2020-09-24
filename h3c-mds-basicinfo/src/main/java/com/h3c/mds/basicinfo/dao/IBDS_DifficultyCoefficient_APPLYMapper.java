package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLYExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_DifficultyCoefficient_APPLYMapper {
    long countByExample(IBDS_DifficultyCoefficient_APPLYExample example);

    int deleteByExample(IBDS_DifficultyCoefficient_APPLYExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_DifficultyCoefficient_APPLY record);

    int insertSelective(IBDS_DifficultyCoefficient_APPLY record);

    List<IBDS_DifficultyCoefficient_APPLY> selectByExample(IBDS_DifficultyCoefficient_APPLYExample example);

    IBDS_DifficultyCoefficient_APPLY selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_DifficultyCoefficient_APPLY record, @Param("example") IBDS_DifficultyCoefficient_APPLYExample example);

    int updateByExample(@Param("record") IBDS_DifficultyCoefficient_APPLY record, @Param("example") IBDS_DifficultyCoefficient_APPLYExample example);

    int updateByPrimaryKeySelective(IBDS_DifficultyCoefficient_APPLY record);

    int updateByPrimaryKey(IBDS_DifficultyCoefficient_APPLY record);
    
    int insertBackID(IBDS_DifficultyCoefficient_APPLY record);
    
    int selectByReleaseCode(@Param("codeList") List<String> codeList);
}