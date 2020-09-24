package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.usermodel.Workbook;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;

public interface IBDS_ColunmConfigService {

	public List<Map<String, String>> getColunmConfig(String type);

	/**
	 * 
	 * @param code    内码
	 * @param service 执行的service，必须有selectByCode(String code)方法
	 * @return propertiegrid拼接的字符串
	 */
	public <T> String buildPropertygrid(String code, Integer ID);

	/**
	 * 分页方法
	 * 
	 * @param pageNum  当前页
	 * @param pageSize 每页数据量
	 * @return
	 */
	PageInfo<IBDS_ColunmConfig> pageOfColumnConfig(int pageNum, int pageSize);

	/**
	 * 查询所有配置项
	 */
	public List<IBDS_ColunmConfig> getColunmConfigByParam(Map<String, String> param);

	/**
	 * 根据id获取配置项
	 * 
	 * @param id
	 * @return
	 */
	public IBDS_ColunmConfig getById(Integer id);

	/**
	 * 新增配置项
	 * 
	 * @param colunmConfig
	 * @return
	 */
	public int create(IBDS_ColunmConfig colunmConfig);

	/**
	 * 更新配置项
	 * 
	 * @param colunmConfig
	 */
	public int update(IBDS_ColunmConfig colunmConfig);

	public PageInfo<IBDS_ColunmConfig> findByPage(Integer page, Integer rows, String type, String searchStr);

	/**
	 * 
	 * @param code
	 * @param queryType "edit" "prop"
	 * @return
	 */
	public <T> T selectByCode(String code);

	/**
	 * 
	 * @param code
	 * @param queryType "edit" "prop"
	 * @return
	 */
	public <T> T selectByID(String code, Integer ID);

	public <T> T selectByPrimaryKey(Integer id, String code);

	/**
	 * 人员选择参照框
	 * 
	 * @param map
	 * @return
	 */
	public List<IBDS_ColunmConfig> selectForReference(Map<String, String> map);

	public List<IBDS_ColunmConfig> selectProByColumn(List<String> lst, Map<String, String> map);

	public <T> String selectProByExample(String type, String column, String code);
	
	int updateProByColumn(Map<String,Object> param);
	
	public <T> Workbook getExcel(String fileName,String type,String searchParas,String[] projectStatus);
}
