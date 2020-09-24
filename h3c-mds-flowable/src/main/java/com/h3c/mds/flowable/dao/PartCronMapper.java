package com.h3c.mds.flowable.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.flowable.entity.PartCron;
import com.h3c.mds.flowable.entity.PartCronExample;

public interface PartCronMapper {
    long countByExample(PartCronExample example);

    int deleteByExample(PartCronExample example);

    int deleteByPrimaryKey(Integer cronId);

    int insert(PartCron record);

    int insertSelective(PartCron record);

    List<PartCron> selectByExample(PartCronExample example);

    PartCron selectByPrimaryKey(Integer cronId);

    int updateByExampleSelective(@Param("record") PartCron record, @Param("example") PartCronExample example);

    int updateByExample(@Param("record") PartCron record, @Param("example") PartCronExample example);

    int updateByPrimaryKeySelective(PartCron record);

    int updateByPrimaryKey(PartCron record);
    
    /**
     * 根据类型获取cron表达式
     * @param param
     * @return
     */
    public List<Map<String, Object>> getCronByType(Map<String, Object> param);
}