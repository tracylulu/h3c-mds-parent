package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.entity.IBDS_VersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_VersionMapper {
    long countByExample(IBDS_VersionExample example);

    int deleteByExample(IBDS_VersionExample example);

    int insert(IBDS_Version record);

    int insertSelective(IBDS_Version record);

    List<IBDS_Version> selectByExample(IBDS_VersionExample example);

    int updateByExampleSelective(@Param("record") IBDS_Version record, @Param("example") IBDS_VersionExample example);

    int updateByExample(@Param("record") IBDS_Version record, @Param("example") IBDS_VersionExample example);
    
    IBDS_Version selectByPrimaryKey(Integer id);
    
    List<IBDS_Version> selectByCodeList(@Param("codeList")List<String> lst);
}