package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.IbdsInitLog;
import com.h3c.mds.flowable.entity.IbdsInitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IbdsInitLogMapper {
    long countByExample(IbdsInitLogExample example);

    int deleteByExample(IbdsInitLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IbdsInitLog record);

    int insertSelective(IbdsInitLog record);

    List<IbdsInitLog> selectByExample(IbdsInitLogExample example);

    IbdsInitLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IbdsInitLog record, @Param("example") IbdsInitLogExample example);

    int updateByExample(@Param("record") IbdsInitLog record, @Param("example") IbdsInitLogExample example);

    int updateByPrimaryKeySelective(IbdsInitLog record);

    int updateByPrimaryKey(IbdsInitLog record);
}