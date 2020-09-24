package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.IBDS_ColunmConfigExample;

public interface IBDS_ColunmConfigMapper {
	long countByExample(IBDS_ColunmConfigExample example);

	int deleteByExample(IBDS_ColunmConfigExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_ColunmConfig record);

	int insertSelective(IBDS_ColunmConfig record);

	List<IBDS_ColunmConfig> selectByExample(IBDS_ColunmConfigExample example);

	IBDS_ColunmConfig selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_ColunmConfig record,
			@Param("example") IBDS_ColunmConfigExample example);

	int updateByExample(@Param("record") IBDS_ColunmConfig record, @Param("example") IBDS_ColunmConfigExample example);

	int updateByPrimaryKeySelective(IBDS_ColunmConfig record);

	int updateByPrimaryKey(IBDS_ColunmConfig record);

	List<Map<String, String>> getColunmConfig(@Param("type") String type);

	List<Map<String, String>> getColunmConfigCode(@Param("type") String type);

	List<IBDS_ColunmConfig> getColunmConfigByParam(@Param("param") Map<String, String> param);

	List<IBDS_ColunmConfig> findByPage(@Param("param") Map<String, Object> map);

	List<IBDS_ColunmConfig> selectForReference(@Param("param") Map<String, String> map);

	List<IBDS_ColunmConfig> selectProByColumn(@Param("codeList") List<String> codeList,
			@Param("param") Map<String, String> map);

	int updateProByColumn(@Param("param") Map<String, Object> map);
}