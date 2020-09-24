package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.FileLog;
import com.h3c.mds.flowable.entity.FileLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileLogMapper {
    long countByExample(FileLogExample example);

    int deleteByExample(FileLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileLog record);

    int insertSelective(FileLog record);

    List<FileLog> selectByExample(FileLogExample example);

    FileLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileLog record, @Param("example") FileLogExample example);

    int updateByExample(@Param("record") FileLog record, @Param("example") FileLogExample example);

    int updateByPrimaryKeySelective(FileLog record);

    int updateByPrimaryKey(FileLog record);
}