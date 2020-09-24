package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.PdmPartView;
import com.h3c.mds.flowable.entity.PdmPartViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdmPartViewMapper {
    long countByExample(PdmPartViewExample example);

    int deleteByExample(PdmPartViewExample example);

    int insert(PdmPartView record);

    int insertSelective(PdmPartView record);

    List<PdmPartView> selectByExample(PdmPartViewExample example);

    int updateByExampleSelective(@Param("record") PdmPartView record, @Param("example") PdmPartViewExample example);

    int updateByExample(@Param("record") PdmPartView record, @Param("example") PdmPartViewExample example);
}