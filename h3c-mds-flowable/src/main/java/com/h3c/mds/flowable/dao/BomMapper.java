package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.Bom;
import com.h3c.mds.flowable.entity.BomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BomMapper {
    long countByExample(BomExample example);

    int deleteByExample(BomExample example);

    int insert(Bom record);

    int insertSelective(Bom record);

    List<Bom> selectByExample(BomExample example);

    int updateByExampleSelective(@Param("record") Bom record, @Param("example") BomExample example);

    int updateByExample(@Param("record") Bom record, @Param("example") BomExample example);

    List<Bom> findByPage(String searchStr);
}