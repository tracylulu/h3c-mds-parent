package com.h3c.mds.finance.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.finance.entity.FProjectCodeViewAll;

public interface FProjectCodeService {

	
	
	
	/**
	 * 新增项目编码
	 * @param fProjectCode
	 * @return
	 */
	public int addProjectCode(FProjectCode fProjectCode);
	
	/**
	 * 新增项目编码和对应的产品编码
	 * @param fProjectCodeView
	 * @return
	 */
	public int addProjectCodeAndProductCode(FProjectCodeView fProjectCodeView);
	
	/**
	 * 更新项目编码
	 * @param fProjectCode
	 * @return
	 */
	public int editProjectCode(FProjectCode fProjectCode);
	
	/**
	 * 通过项目编码内码和产品编码获取项目编码
	 * @param code
	 * @return
	 */
	public Map<String, Object> getFProjectCodeByProjCodeAndProductCode(Map<String, Object> param);
	
	/**
	 * 通过项目编码内码获取项目编码
	 * @param projCode
	 * @return
	 */
	public FProjectCode getFProjectCodeByProjCode(String projCode);
	/**
	 * 项目编码列表
	 * @param page
	 * @param rows
	 * @param searchArgs
	 * @return
	 */
	public PageInfo<List<Map<String, Object>>> listOfProjectCode(Integer page, Integer rows, Map<String, Object> param);
	
	/**
	 * 项目编码列表
	 * @param page
	 * @param rows
	 * @param searchArgs
	 * @return
	 */
	public PageInfo<List<Map<String, Object>>> listOfProjectCodeAll(Integer page, Integer rows, Map<String, Object> param);
	
	/**
	 * 按产品线，pdt查询
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> listOfProjectCodeByPdt(Map<String, Object> param);
	
	/**
	 * 按产品线，项目类别查询
	 * @param param
	 * @return
	 */
	public List<Map<String, Object>> listOfProjectCodeByProjType(Map<String, Object> param);
	
	/**
	 * 按产品对应项目查询
	 * @param page
	 * @param rows
	 * @param searchArgs
	 * @return
	 */
	public List<Map<String, Object>> listOfProjectCodeByProd(Integer page, Integer rows, String searchParams);
	
	
	
	/**
	 * 根据id查询列表
	 * @param id
	 * @return
	 */
	public Map<String, Object> getProperties(Map<String, Object> param);
	
	/**
	 * 获取导出数据
	 * @return
	 */
	public List<FProjectCodeView> getExport(Map<String, Object> param);
	
	/**
	 * 获取全视图导出数据
	 * @return
	 */
	public List<FProjectCodeViewAll> getExportAll(Map<String, Object> param);


	List<FProjectCodeView> getExport2(Map<String, Object> param);

	List<FProjectCodeViewAll> getExportAll2(Map<String, Object> param);

	public List<Map<String, String>> getAllProdline(String state, String start, String end);
	    
	    
     public List<Map<String , String>> getAllPdt(String state, String start, String end);

	public List<Map<String, String>> getPdtByProlineno(String prolineNo, String state);
	

}
