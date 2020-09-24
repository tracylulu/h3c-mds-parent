package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.IbdsTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IbdsTaskMapper {
    long countByExample(IbdsTaskExample example);

    int deleteByExample(IbdsTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IbdsTask record);

    int insertSelective(IbdsTask record);

    List<IbdsTask> selectByExample(IbdsTaskExample example);

    IbdsTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IbdsTask record, @Param("example") IbdsTaskExample example);

    int updateByExample(@Param("record") IbdsTask record, @Param("example") IbdsTaskExample example);

    int updateByPrimaryKeySelective(IbdsTask record);

    int updateByPrimaryKey(IbdsTask record);
}