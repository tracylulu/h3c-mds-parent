package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_BaseLineExample;
import org.springframework.transaction.annotation.Transactional;

public interface IBDS_BaseLineService {

	/**
	 * 查询展现tree形表格
	 * 
	 * @param param
	 * @return
	 */
	public List<BaseLineView> getTreeData(Map<String, String> param);

    @Transactional(readOnly = true)
    List<BaseLineView> getBaseLineTreeData(Map<String, String> param);

    public BaseLineView selectByCode(String code);

	/**
	 * 新增基线版本
	 * 
	 * @param project
	 * @return
	 */
	public int addIBDSBaseLine(IBDS_BaseLine baseLine);

	/**
	 * 更新基线版本
	 * 
	 * @param project
	 * @return
	 */
	public int editIBDSProject(IBDS_BaseLine baseLine);

	public String getMaxCode();

	/**
	 * 通过内码获取基线版本
	 * 
	 * @param code
	 * @return
	 */
	public IBDS_BaseLine getBaseLineByCode(String code);

	/**
	 * 批量新增特性
	 * 
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_BaseLine> record);

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	public int updateByBatch(List<IBDS_BaseLine> list);

	/**
	 * 批量停用 启用
	 * 
	 * @param param
	 * @return
	 */
	public int updateByStatusBatch(Map<String, Object> param);

	public List<IBDS_BaseLine> selectByExample(IBDS_BaseLineExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param id
	 * @return
	 */
	public BaseLineView selectByPrimaryKey(Integer id);

	/**
	 * 根据查询查询数据
	 * 
	 * @param param
	 * @return
	 */
	public List<BaseLineView> getDataByColunm(@Param("param") Map<String, Object> param);
	
	public List<BaseLineView> getBaseLineSowtWare(Map<String, String> param);
	

}
