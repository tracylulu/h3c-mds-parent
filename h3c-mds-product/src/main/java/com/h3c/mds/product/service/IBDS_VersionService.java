package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.entity.IBDS_VersionExample;
import com.h3c.mds.product.entity.VersionView;

public interface IBDS_VersionService {
	
	/**
	 * 查询展现tree形表格
	 * @param param
	 * @return
	 */
	public List<VersionView> getTreeData(Map<String, String> param);
	
	public VersionView selectByCode(String code);
	
	/**
	 * 新增Version
	 * @param version
	 * @return
	 */
	public int addVersion(IBDS_Version version);
	
	/**
	 * 更新versin
	 * @param version
	 * @return
	 */
	public int editVersion(IBDS_Version version);
	
	/**
	 * 获取version最新内码
	 * @return
	 */
	public String getMaxCode();
	
	/**
	 * 通过内码获取对应的Version
	 * @param code
	 * @return
	 */
	public IBDS_Version  getVersionByCode(String code);
	
	/**
	 * 通过名称获取Version
	 * @param versionName
	 * @return
	 */
	public IBDS_Version getVersionByName(String versionName);
	
	/**
	 * 
	 * @param example
	 * @return
	 */
	public List<IBDS_Version> getByExample(IBDS_VersionExample example);
}
