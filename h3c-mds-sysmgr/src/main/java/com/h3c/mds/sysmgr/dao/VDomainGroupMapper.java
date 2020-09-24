package com.h3c.mds.sysmgr.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.sysmgr.entity.VDomainGroup;
import com.h3c.mds.sysmgr.entity.VDomainGroupExample;

public interface VDomainGroupMapper {
	long countByExample(VDomainGroupExample example);

	int deleteByExample(VDomainGroupExample example);

	int insert(VDomainGroup record);

	int insertSelective(VDomainGroup record);

	List<VDomainGroup> selectByExampleWithBLOBs(VDomainGroupExample example);

	List<VDomainGroup> selectByExample(VDomainGroupExample example);

	int updateByExampleSelective(@Param("record") VDomainGroup record, @Param("example") VDomainGroupExample example);

	int updateByExampleWithBLOBs(@Param("record") VDomainGroup record, @Param("example") VDomainGroupExample example);

	int updateByExample(@Param("record") VDomainGroup record, @Param("example") VDomainGroupExample example);

	/**
	 * 群组联想
	 * 
	 * @param param
	 * @return
	 */
	List<VDomainGroup> selUserViewbyparam(@Param("param") Map<String, String> param);
}