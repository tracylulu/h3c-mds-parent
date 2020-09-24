package com.h3c.mds.basicinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_ApplyExample;

public interface IBDS_BaseLine_ApplyMapper {
	long countByExample(IBDS_BaseLine_ApplyExample example);

	int deleteByExample(IBDS_BaseLine_ApplyExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IBDS_BaseLine_Apply record);

	int insertSelective(IBDS_BaseLine_Apply record);

	List<IBDS_BaseLine_Apply> selectByExample(IBDS_BaseLine_ApplyExample example);

	IBDS_BaseLine_Apply selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IBDS_BaseLine_Apply record,
			@Param("example") IBDS_BaseLine_ApplyExample example);

	int updateByExample(@Param("record") IBDS_BaseLine_Apply record,
			@Param("example") IBDS_BaseLine_ApplyExample example);

	int updateByPrimaryKeySelective(IBDS_BaseLine_Apply record);

	int updateByPrimaryKey(IBDS_BaseLine_Apply record);

	List<Integer> getIdsByProcessCode(String processCode);

	List<IBDS_BaseLine_Apply> getByProcessCode(String applyCode);

	List<IBDS_BaseLine_Apply> getZTByProductCode(@Param("param") Map<String, String> param);

	Integer getZTCountByProductCode(@Param("param") Map<String, String> param);

	int updateBaseinfo(@Param("param") Map<String, Object> param);

	/**
	 * 批量或单个 停用 停用下层所有 新增操作日志
	 * 
	 * @param param
	 */
	void updateProjectStatusAddOptionLog(@Param("param") Map<String, Object> param);
}