package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.Resource;
import com.h3c.mds.sysmgr.entity.ResourceExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {
    long countByExample(ResourceExample example);

    int deleteByExample(ResourceExample example);

    int deleteByPrimaryKey(Integer hresId);

    int insert(Resource record);

    int insertSelective(Resource record);

    List<Resource> selectByExample(ResourceExample example);

    Resource selectByPrimaryKey(Integer hresId);

    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
    
    List<Resource> getResourcesByRoleCode(String roleCode);

	List<Resource> getResourcesByParentCode(String parentCode);
	
	List<Resource> getResourcesByRoleCodeAndMap(Map<String,Object> map);

	String getMaxCode();
	
	List<Resource> getResourceByUser(@Param("param") Map<String,String> param);
}