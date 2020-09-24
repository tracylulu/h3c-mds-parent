package com.h3c.mds.sysmgr.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.sysmgr.entity.viewDomainGroupMember;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMemberExample;

public interface viewDomainGroupMemberMapper {
	long countByExample(viewDomainGroupMemberExample example);

	int deleteByExample(viewDomainGroupMemberExample example);

	int insert(viewDomainGroupMember record);

	int insertSelective(viewDomainGroupMember record);

	List<viewDomainGroupMember> selectByExample(viewDomainGroupMemberExample example);

	int updateByExampleSelective(@Param("record") viewDomainGroupMember record,
			@Param("example") viewDomainGroupMemberExample example);

	int updateByExample(@Param("record") viewDomainGroupMember record,
			@Param("example") viewDomainGroupMemberExample example);

	/**
	 * 人员联想
	 * 
	 * @param param
	 * @return
	 */
	List<viewDomainGroupMember> selUserViewbyparam(@Param("param") Map<String, String> param);
}