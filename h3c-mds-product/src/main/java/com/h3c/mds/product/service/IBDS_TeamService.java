package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_TeamExample;
import com.h3c.mds.product.entity.TeamView;

public interface IBDS_TeamService {

	/**
	 * 查询展现tree形表格
	 * 
	 * @param param
	 * @return
	 */
	public List<TeamView> getTreeData(Map<String, String> param);

	public TeamView selectByCode(String code);

	/**
	 * 新增项目组版本
	 * 
	 * @param project
	 * @return
	 */
	public int addIBDSTeam(IBDS_Team team);

	/**
	 * 更新项目组
	 * 
	 * @param project
	 * @return
	 */
	public int editIBDSTeam(IBDS_Team team);

	/**
	 * 获取最新内码
	 * 
	 * @return
	 */
	public String getMaxCode();

	/**
	 * 通过内码获取项目组
	 * 
	 * @param code
	 * @return
	 */
	public IBDS_Team getTeamByCode(String code);

	/**
	 * 批量新增特性
	 * 
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_Team> record);

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	public int updateByBatch(List<IBDS_Team> list);

	/**
	 * 批量停用 启用
	 * 
	 * @param param
	 * @return
	 */
	public int updateByStatusBatch(Map<String, Object> param);
	
	public List<IBDS_Team> selectByExample(IBDS_TeamExample example);
}
