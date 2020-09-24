package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_ModuleVersion;
import com.h3c.mds.product.entity.IBDS_ModuleVersionExample;

public interface IBDS_ModuleVersionMapper {
	long countByExample(IBDS_ModuleVersionExample example);

	int deleteByExample(IBDS_ModuleVersionExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_ModuleVersion record);

	int insertSelective(IBDS_ModuleVersion record);

	List<IBDS_ModuleVersion> selectByExample(IBDS_ModuleVersionExample example);

	IBDS_ModuleVersion selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_ModuleVersion record,
			@Param("example") IBDS_ModuleVersionExample example);

	int updateByExample(@Param("record") IBDS_ModuleVersion record,
			@Param("example") IBDS_ModuleVersionExample example);

	int updateByPrimaryKeySelective(IBDS_ModuleVersion record);

	int updateByPrimaryKey(IBDS_ModuleVersion record);

	String getMaxCode();

	int insertSelectiveBatch(@Param("list") List<IBDS_ModuleVersion> list);

	int updateByBatch(@Param("list") List<IBDS_ModuleVersion> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_ModuleVersion> selectModuleVerisonbyCodes(@Param("param") Map<String, Object> param);
}