package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.PartPdmNotSync;
import com.h3c.mds.flowable.entity.PartPdmNotSyncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartPdmNotSyncMapper {
    long countByExample(PartPdmNotSyncExample example);

    int deleteByExample(PartPdmNotSyncExample example);

    int insert(PartPdmNotSync record);

    int insertSelective(PartPdmNotSync record);

    List<PartPdmNotSync> selectByExample(PartPdmNotSyncExample example);

    int updateByExampleSelective(@Param("record") PartPdmNotSync record, @Param("example") PartPdmNotSyncExample example);

    int updateByExample(@Param("record") PartPdmNotSync record, @Param("example") PartPdmNotSyncExample example);
}