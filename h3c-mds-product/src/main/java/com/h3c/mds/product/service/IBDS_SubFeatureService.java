package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubFeatureExample;
import com.h3c.mds.product.entity.SubFeatureView;

public interface IBDS_SubFeatureService {

	/**
	 * 查询展现tree形表格
	 * @param param
	 * @return
	 */
	public List<SubFeatureView> getTreeData(Map<String, String> param);
	
	public SubFeatureView selectByCode(String code);
	
	/**
	 * 新增基线版本
	 * @param project
	 * @return
	 */
	public int addIBDSSubFeature(IBDS_SubFeature subFeature);
	
	/**
	 * 更新基线版本
	 * @param project
	 * @return
	 */
	public int editIBDSSubFeature(IBDS_SubFeature subFeature);
	
	/**
	 * 获取最新内码
	 * @return
	 */
	public String getMaxCode();
	
	/**
	 * 通过内码获取子特性
	 * @param code
	 * @return
	 */
	public IBDS_SubFeature getSubFeatureByCode(String code);
	
	/**
	 * 批量新增特性
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_SubFeature> record);
	/**
	 * 批量更新
	 * @param list
	 * @return
	 */
	public int updateByBatch (List<IBDS_SubFeature> list);
	 /**
	  * 批量停用  启用   
	  * @param param
	  * @return
	  */
	public int updateByStatusBatch(Map<String,Object> param);
	
	public List<IBDS_SubFeature> selectByExample(IBDS_SubFeatureExample example);
}
