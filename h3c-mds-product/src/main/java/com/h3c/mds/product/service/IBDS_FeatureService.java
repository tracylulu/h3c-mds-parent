package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.FeatureView;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_FeatureExample;

public interface IBDS_FeatureService {

	/**
	 * 查询展现tree形表格
	 * @param param
	 * @return
	 */
	public List<FeatureView> getTreeData(Map<String, String> param);
	
	public FeatureView selectByCode(String code);
	
	/**
	 * 新增基线版本
	 * @param project
	 * @return
	 */
	public int addIBDSFeature(IBDS_Feature feature);
	
	/**
	 * 更新基线版本
	 * @param project
	 * @return
	 */
	public int editIBDSFeature(IBDS_Feature feature);
	
	/**
	 * 获取特性最新内码
	 * @return
	 */
	public  String getMaxCode();
	
	
	/**
	 * 通过内码获取特性版本
	 * @param code
	 * @return
	 */
	public IBDS_Feature getFeatureByCode(String code);
	/**
	 * 批量新增特性
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_Feature> record);
	/**
	 * 批量更新
	 * @param list
	 * @return
	 */
	public int updateByBatch (List<IBDS_Feature> list);
	 /**
	  * 批量停用  启用   
	  * @param param
	  * @return
	  */
	public int updateByStatusBatch(Map<String,Object> param);
	
	public List<IBDS_Feature> selectByExample(IBDS_FeatureExample example);
}
