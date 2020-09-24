package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartCodeApplyMapper {
    long countByExample(PartCodeApplyExample example);

    int deleteByExample(PartCodeApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartCodeApply record);

    int insertSelective(PartCodeApply record);

    List<PartCodeApply> selectByExample(PartCodeApplyExample example);

    PartCodeApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartCodeApply record, @Param("example") PartCodeApplyExample example);

    int updateByExample(@Param("record") PartCodeApply record, @Param("example") PartCodeApplyExample example);

    int updateByPrimaryKeySelective(PartCodeApply record);

    int updateByPrimaryKey(PartCodeApply record);

    Integer getZTCountByProductCode(String productCode);

    List<PartCodeApply> getZTByProductCode(String productCode);

    List<String> getZTProcessCodeByProductCode(String productCode);
}