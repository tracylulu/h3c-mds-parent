package com.h3c.mds.flowable.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.flowable.entity.ProjectCodeProcess;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExample;

public interface ProjectCodeProcessMapper {
    long countByExample(ProjectCodeProcessExample example);

    int deleteByExample(ProjectCodeProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectCodeProcess record);

    int insertSelective(ProjectCodeProcess record);

    List<ProjectCodeProcess> selectByExample(ProjectCodeProcessExample example);

    ProjectCodeProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectCodeProcess record, @Param("example") ProjectCodeProcessExample example);

    int updateByExample(@Param("record") ProjectCodeProcess record, @Param("example") ProjectCodeProcessExample example);

    int updateByPrimaryKeySelective(ProjectCodeProcess record);

    int updateByPrimaryKey(ProjectCodeProcess record);
    
    
    
    /**
	 * 按照申请编号查询Tree
	 * @param id
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByApplyNo(@Param("param")Map<String, Object> param);
	
	public int  findProjectCodeByApplyNoCount(@Param("param")Map<String, Object> param);
	
	/**
	 * 按申请人
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByApplyer(@Param("param")Map<String, Object> param);
	
	/**
	 * 按照状态查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByStatus(@Param("param")Map<String, Object> param);
	
	
	/**
	 * 按照未关闭流程查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByProcess(@Param("param")Map<String, Object> param);
	
	/**
	 * 按照当前责任人查询Tree
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> findProjectCodeByCurHandler(@Param("param")Map<String, Object> param);
	
	
	
	
	/**
	 * 获取申请编号
	 * @return
	 */
	public String getMaxCode();
	
	
	List<ProjectCodeProcess> getZTProjectCodeProcessByProjNumber(@Param("param")Map<String, Object> param);
}