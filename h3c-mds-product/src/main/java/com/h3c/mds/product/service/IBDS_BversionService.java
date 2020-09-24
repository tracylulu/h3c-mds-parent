package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.Bversion_view;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_BversionExample;
import com.h3c.mds.product.entity.IBDS_Release;

public interface IBDS_BversionService {

	/**
	 * 查询展现tree形表格
	 * 
	 * @param param
	 * @return
	 */
	public List<Bversion_view> getTreeData(Map<String, String> param);

	public Bversion_view selectByCode(String code);

	/**
	 * 新增Version
	 * 
	 * @param version
	 * @return
	 */
	public int addBversion(IBDS_Bversion version);

	/**
	 * 更新versin
	 * 
	 * @param version
	 * @return
	 */
	public int editBversion(IBDS_Release release, IBDS_Bversion version);

	/**
	 * 通过内码获取对应的B版本
	 * 
	 * @param bversionCode
	 * @return
	 */
	public IBDS_Bversion getBversionByBversionCode(String bversionCode);

	/**
	 * 获取B版本内码
	 * 
	 * @return
	 */
	public String getMaxCode();

	public List<IBDS_Bversion> getAllBversionByReleaseCode(String reseaseCode);

	public int updateByCode(IBDS_Bversion bversion);

	public List<IBDS_Bversion> selectByCodeList(String[] codeList);

	public List<IBDS_Bversion> selectBymap(Map<String, String> param);

	public IBDS_Bversion getBversionByReleaseCodeAndBversionName(Map<String, String> param);

	public List<IBDS_Bversion> selectByExample(IBDS_BversionExample example);

	public int updateByProjectStatusBatch(String releaseno, String projectStatus, String bversion, String modifyUser);

	public List<IBDS_Bversion> getBversionByReleaseCodeAndBversion(String reseaseCode, String Bversion);

}
