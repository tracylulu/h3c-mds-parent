package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.MailInfo;
import com.h3c.mds.flowable.entity.MailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailInfoMapper {
    long countByExample(MailInfoExample example);

    int deleteByExample(MailInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MailInfo record);

    int insertSelective(MailInfo record);

    List<MailInfo> selectByExample(MailInfoExample example);

    MailInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MailInfo record, @Param("example") MailInfoExample example);

    int updateByExample(@Param("record") MailInfo record, @Param("example") MailInfoExample example);

    int updateByPrimaryKeySelective(MailInfo record);

    int updateByPrimaryKey(MailInfo record);
}