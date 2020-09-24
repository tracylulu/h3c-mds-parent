package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDSNotesReleaseTemp;
import com.h3c.mds.product.entity.IBDSNotesReleaseTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDSNotesReleaseTempMapper {
    long countByExample(IBDSNotesReleaseTempExample example);

    int deleteByExample(IBDSNotesReleaseTempExample example);

    int insert(IBDSNotesReleaseTemp record);

    int insertSelective(IBDSNotesReleaseTemp record);

    List<IBDSNotesReleaseTemp> selectByExample(IBDSNotesReleaseTempExample example);

    int updateByExampleSelective(@Param("record") IBDSNotesReleaseTemp record, @Param("example") IBDSNotesReleaseTempExample example);

    int updateByExample(@Param("record") IBDSNotesReleaseTemp record, @Param("example") IBDSNotesReleaseTempExample example);
}