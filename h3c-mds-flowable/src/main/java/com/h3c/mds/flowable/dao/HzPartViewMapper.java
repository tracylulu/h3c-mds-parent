package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.HzPartView;
import com.h3c.mds.flowable.entity.HzPartViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HzPartViewMapper {
    long countByExample(HzPartViewExample example);

    int deleteByExample(HzPartViewExample example);

    int insert(HzPartView record);

    int insertSelective(HzPartView record);

    List<HzPartView> selectByExample(HzPartViewExample example);

    int updateByExampleSelective(@Param("record") HzPartView record, @Param("example") HzPartViewExample example);

    int updateByExample(@Param("record") HzPartView record, @Param("example") HzPartViewExample example);
}