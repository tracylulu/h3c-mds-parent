package com.h3c.mds.auth.dao;

import com.h3c.mds.auth.entity.DataPerm;
import com.h3c.mds.auth.entity.DataPermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataPermMapper {
    long countByExample(DataPermExample example);

    int deleteByExample(DataPermExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataPerm record);

    int insertSelective(DataPerm record);

    List<DataPerm> selectByExample(DataPermExample example);

    DataPerm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataPerm record, @Param("example") DataPermExample example);

    int updateByExample(@Param("record") DataPerm record, @Param("example") DataPermExample example);

    int updateByPrimaryKeySelective(DataPerm record);

    int updateByPrimaryKey(DataPerm record);

    List<DataPerm> getByUserAccountAndResource(@Param("account") String account, @Param("resource") String resource,@Param("type") String type);
}