package com.h3c.mds.sysmgr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroupExample;

public interface ADMP_MemberGroupMapper {
	long countByExample(ADMP_MemberGroupExample example);

	int deleteByExample(ADMP_MemberGroupExample example);

	int insert(ADMP_MemberGroup record);

	int insertSelective(ADMP_MemberGroup record);

	List<ADMP_MemberGroup> selectByExample(ADMP_MemberGroupExample example);

	int updateByExampleSelective(@Param("record") ADMP_MemberGroup record,
			@Param("example") ADMP_MemberGroupExample example);

	int updateByExample(@Param("record") ADMP_MemberGroup record, @Param("example") ADMP_MemberGroupExample example);

}