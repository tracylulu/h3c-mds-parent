package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.BasisMaterial;
import com.h3c.mds.flowable.entity.BasisMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasisMaterialMapper {
    long countByExample(BasisMaterialExample example);

    int deleteByExample(BasisMaterialExample example);

    int deleteByPrimaryKey(String id);

    int insert(BasisMaterial record);

    int insertSelective(BasisMaterial record);

    List<BasisMaterial> selectByExample(BasisMaterialExample example);

    BasisMaterial selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BasisMaterial record, @Param("example") BasisMaterialExample example);

    int updateByExample(@Param("record") BasisMaterial record, @Param("example") BasisMaterialExample example);

    int updateByPrimaryKeySelective(BasisMaterial record);

    int updateByPrimaryKey(BasisMaterial record);
}