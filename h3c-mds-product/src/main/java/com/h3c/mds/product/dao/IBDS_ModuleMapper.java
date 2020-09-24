package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleExample;

public interface IBDS_ModuleMapper {
	long countByExample(IBDS_ModuleExample example);

	int deleteByExample(IBDS_ModuleExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_Module record);

	int insertSelective(IBDS_Module record);

	List<IBDS_Module> selectByExample(IBDS_ModuleExample example);

	IBDS_Module selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_Module record, @Param("example") IBDS_ModuleExample example);

	int updateByExample(@Param("record") IBDS_Module record, @Param("example") IBDS_ModuleExample example);

	int updateByPrimaryKeySelective(IBDS_Module record);

	int updateByPrimaryKey(IBDS_Module record);

	String getMaxCode();

	int insertSelectiveBatch(@Param("list") List<IBDS_Module> list);

	int updateByBatch(@Param("list") List<IBDS_Module> list);

	int updateByStatusBatch(@Param("param") Map<String, Object> param);

	List<IBDS_Module> selectModulebyCodes(@Param("param") Map<String, Object> param);
}