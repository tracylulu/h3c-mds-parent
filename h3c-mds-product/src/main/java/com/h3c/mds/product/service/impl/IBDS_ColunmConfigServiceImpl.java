package com.h3c.mds.product.service.impl;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import com.h3c.mds.product.dao.*;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.IBDS_ColunmConfigExample;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;

@Service
public class IBDS_ColunmConfigServiceImpl implements IBDS_ColunmConfigService {

	public static Map<String, Class> mapperViewMap = new HashMap<>();
	public static Map<String, Class> mapperMap = new HashMap<>();

	static {
		mapperMap.put("PR", IBDS_ReleaseMapper.class);
		mapperMap.put("PL", IBDS_PRODLINEMapper.class);
		mapperMap.put("PI",IBDS_PLIPMTMapper.class);
		mapperMap.put("PB", IBDS_BversionMapper.class);
		mapperMap.put("PV", IBDS_VersionMapper.class);
		mapperMap.put("PJ", IBDSProjectMapper.class);
		mapperMap.put("PT", IBDS_PDTMapper.class);
		mapperMap.put("PP", IBDS_ProductMapper.class);
		mapperMap.put("BL", IBDS_BaseLineMapper.class);
		mapperMap.put("FT", IBDS_FeatureMapper.class);
		mapperMap.put("SF", IBDS_SubFeatureMapper.class);
		mapperMap.put("TM", IBDS_TeamMapper.class);
		mapperMap.put("SS", IBDS_SubSystemMapper.class);
		mapperMap.put("MD", IBDS_ModuleMapper.class);
		mapperMap.put("MV", IBDS_ModuleVersionMapper.class);
	}
	static {
		mapperViewMap.put("PR", ReleaseViewMapper.class);
		mapperViewMap.put("PL", ProdLineVewMapper.class);
		mapperViewMap.put("PI",IBDS_PLIPMTMapper.class);
		mapperViewMap.put("PB", Bversion_viewMapper.class);
		mapperViewMap.put("PV", VersionViewMapper.class);
		mapperViewMap.put("PJ", ProjectViewMapper.class);
		mapperViewMap.put("PT", PdtViewMapper.class);
		mapperViewMap.put("PP", ProductViewMapper.class);
		mapperViewMap.put("BL", BaseLineViewMapper.class);
		mapperViewMap.put("FT", FeatureViewMapper.class);
		mapperViewMap.put("SF", SubFeatureViewMapper.class);
		mapperViewMap.put("TM", TeamViewMapper.class);
		mapperViewMap.put("SS", SubSystemViewMapper.class);
		mapperViewMap.put("MD", ModuleViewMapper.class);
		mapperViewMap.put("MV", ModuleVersionViewMapper.class);
	}

	@Autowired
	ApplicationContext context;

	@Autowired
	private IBDS_ColunmConfigMapper colunmConfigMapper;

	@Override
	public List<Map<String, String>> getColunmConfig(String type) {
		List<Map<String, String>> lstColunmConfig = colunmConfigMapper.getColunmConfig(type);
		return lstColunmConfig;
	}

	/**
	 * 
	 * @param code
	 *            内码
	 * @param service
	 *            执行的service，必须有selectByCode(String code)方法
	 * @return propertiegrid拼接的字符串
	 */
//	public <T> String buildPropertygrid(String code) {
//		String result = "[]";
//
//		if (code == null || code.length() < 2) {
//
//			return result;
//		}
//
//		try {
//			IBDS_ColunmConfigExample example = new IBDS_ColunmConfigExample();
//			example.createCriteria();
//			// List<IBDS_ColunmConfig> list1 = colunmConfigMapper.selectByExample(example);
//
//			List<Map<String, String>> list = colunmConfigMapper.getColunmConfig(code.substring(0, 2));
//			Object mapperObj = context.getBean(mapperMap.get(code.substring(0, 2)));
//
//			Method method = mapperObj.getClass().getMethod("selectByCode", String.class);
//
//			Map<String, String> map = (Map<String, String>) method.invoke(mapperObj, code);
//
//			result = EasyUIJSONUtils.buildPropertygrid(list, map);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//
//		return result;
//	}
	
	
	/**
	 * 
	 * @param code
	 *            内码
	 * @param service
	 *            执行的service，必须有selectByCode(String code)方法
	 * @return propertiegrid拼接的字符串
	 */
	public <T> String buildPropertygrid(String code,Integer ID) {
		String result = "[]";

		if (code == null || code.length() < 2) {

			return result;
		}

		try {
			IBDS_ColunmConfigExample example = new IBDS_ColunmConfigExample();
			example.createCriteria();
			// List<IBDS_ColunmConfig> list1 = colunmConfigMapper.selectByExample(example);
			String type="";
			if(code.substring(0, 4).toString().toUpperCase().equals("SOHO")) {
				type="PP";
			}else {
				type=code.substring(0, 2);
			}
			List<Map<String, String>> list = colunmConfigMapper.getColunmConfig(type);
			
			Map<String,String> param = new HashMap<>();
			param.put("code", code);
			T entity = selectByID(code,ID);

			result = EasyUIJSONUtils.buildPropertygrid(list, entity);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public <T> T selectByCode(String code)
	{
		T entity =  null;
		try {
			String type="";
			if(code.substring(0, 4).toString().toUpperCase().equals("SOHO")) {
				type="PP";
			}else {
				type=code.substring(0, 2);
			}
			Object mapperObj = context.getBean(mapperViewMap.get(type));
			//Method method = mapperObj.getClass().getMethod("selectByCode", String.class);
			Method method = mapperObj.getClass().getMethod("selectByCode", String.class);
			entity = (T) method.invoke(mapperObj, code);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	public <T> T selectByID(String code,Integer ID)
	{
		T entity =  null;
		try {
			String type="";
			if(code.substring(0, 4).toString().toUpperCase().equals("SOHO")) {
				type="PP";
			}else {
				type=code.substring(0, 2);
			}
			Object mapperObj = context.getBean(mapperViewMap.get(type));
			//Method method = mapperObj.getClass().getMethod("selectByCode", String.class);
			Method method = mapperObj.getClass().getMethod("selectByID", Integer.class);
			entity = (T) method.invoke(mapperObj, ID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}
	
	/**
	 * 获取对应实体
	 * @param id 主键
	 * @param code 产品编码
	 * @return
	 */
	public <T> T selectByPrimaryKey(Integer id,String code)
	{
		T entity =  null;
		try {
			String type="";
			if(code.substring(0, 4).toString().toUpperCase().equals("SOHO")) {
				type="PP";
			}else {
				type=code.substring(0, 2);
			}
			Object mapperObj = context.getBean(mapperMap.get(type));
			Method method = mapperObj.getClass().getMethod("selectByPrimaryKey", java.lang.Integer.class);
			entity = (T) method.invoke(mapperObj, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}

	public PageInfo<IBDS_ColunmConfig> pageOfColumnConfig(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		IBDS_ColunmConfigExample example = new IBDS_ColunmConfigExample();
		List<IBDS_ColunmConfig> lst = colunmConfigMapper.selectByExample(example);
		PageInfo<IBDS_ColunmConfig> pageInfo = new PageInfo<IBDS_ColunmConfig>(lst);

		return pageInfo;
	}

	/**
	 * 查询所有配置项
	 */
	public List<IBDS_ColunmConfig> getColunmConfigByParam(Map<String, String> param) {
		List<IBDS_ColunmConfig> lstColunmConfig = colunmConfigMapper.getColunmConfigByParam(param);
		return lstColunmConfig;
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_ColunmConfig getById(Integer id) {
		return colunmConfigMapper.selectByPrimaryKey(id);
	}

	@Override
	@Transactional
	public int create(IBDS_ColunmConfig colunmConfig) {
		return colunmConfigMapper.insertSelective(colunmConfig);
	}

	@Override
	@Transactional
	public int update(IBDS_ColunmConfig colunmConfig) {
		return colunmConfigMapper.updateByPrimaryKeySelective(colunmConfig);
	}

	@Override
	@Transactional(readOnly = true)
	public PageInfo<IBDS_ColunmConfig> findByPage(Integer page, Integer rows, String type, String searchStr) {
		if (page == null || page < 1)
			page = 1;
		if (rows == null || rows < 15)
			rows = 15;
		PageHelper.startPage(page, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		map.put("searchStr", searchStr);
		List<IBDS_ColunmConfig> list = colunmConfigMapper.findByPage(map);
		PageInfo<IBDS_ColunmConfig> pageInfo = new PageInfo<IBDS_ColunmConfig>(list);
		return pageInfo;
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<IBDS_ColunmConfig> selectForReference(Map<String, String> map){
		return colunmConfigMapper.selectForReference(map);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<IBDS_ColunmConfig> selectProByColumn(List<String> lst,Map<String,String> map){
		return colunmConfigMapper.selectProByColumn(lst, map);
	}
	
	/**
	 * 根据编码及字段获取对应的值
	 */
	public<T> String  selectProByExample(String type,String column,String code){
		List<T> lst =  null;
		List<IBDS_ColunmConfig> lstColumn=new ArrayList<>();
		String valueAll="";
		try {
		
			Object mapperObj = context.getBean(mapperMap.get(type));
			Method method = mapperObj.getClass().getMethod("selectByCodeList", List.class);
			lst = (List<T>) method.invoke(mapperObj, Arrays.asList(code.split(",")));
			
			for(T item: lst) { 
				 String value = (String)PropertyUtils.getProperty(item, column); 
				 String no="",name="";
				Map<String,String> map=new HashMap<>();
				switch(type) {
					case "PI":no="plipmtno";name="plipmt";break;
					case "PL":no="prodlineno";name="prodline";break;
					case "PT":no="pdtno";name="pdt";break;
					case "PV": no="versionno";name="version";break;
					case "PR":no="releaseno";name="release";break;
					case "PB":no="bversionno";name="bversioncname";break;
				}
				String currentCode= (String)PropertyUtils.getProperty(item, no); 
				String currentname=(String)PropertyUtils.getProperty(item, name); 
				IBDS_ColunmConfig columnConfig=new IBDS_ColunmConfig();
				columnConfig.setColumncode(currentCode);
				columnConfig.setColumngroup(currentname);
				columnConfig.setColumnname(value);
				lstColumn.add(columnConfig);
			}			
			
			//将多行合并为1行，编码和人员拼接去重		
			if(lstColumn!=null&&lstColumn.size()>0) {
				List<String> lstValue=new ArrayList<>();
				lstColumn.stream().forEach(o->{
					lstValue.addAll(Arrays.asList(o.getColumnname().split(",")));
				});
				HashSet<String> Setvalue=new HashSet<String>(lstValue);
				valueAll=String.join(",", Setvalue);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valueAll;
	}
	
	@Override
	@Transactional
	public int updateProByColumn(Map<String,Object> param) {
		return colunmConfigMapper.updateProByColumn(param);
	}
	
	public <T> Workbook getExcel(String fileName,String type,String searchParas,String[] projectStatus) {
		List<T> lst =  null;
		List<String> headers=new ArrayList<>();
		List<String> column=new ArrayList<>();
		
	    Map<String,Object> map=new HashMap<>();
	    map.put("type", type);
	    map.put("searchParas",searchParas);
		if ("pr".equalsIgnoreCase(type)) {
			map.put("projectStatus", projectStatus);
			List<String> list = new ArrayList<String>();
			if (projectStatus != null && projectStatus.length > 0) {
				list = Arrays.asList(projectStatus);
			}
			if (list.contains("无")) {
				map.put("projectStatusNull", "all");
			}
		}
	    
	    Map<String,String> configMap=new HashMap<>();
        configMap.put("type",type);
        configMap.put("queryStatus","export");
        List<IBDS_ColunmConfig> lstConfig=getColunmConfigByParam(configMap);
        
        for(IBDS_ColunmConfig config:lstConfig) {
        	if("id".equalsIgnoreCase(config.getColumncode())) continue;
        	headers.add(config.getColumnname());
        	column.add(config.getColumncode());
        }
		try {		
			
 			Object mapperObj = context.getBean(mapperViewMap.get(type));
			Method method = mapperObj.getClass().getMethod("getExportList", java.util.Map.class);
			lst = (List<T>) method.invoke(mapperObj, map);
			
			ExportExcelWrapper<T> excelWrapper=new ExportExcelWrapper<T>();        	
			return excelWrapper.dataToExcel(fileName+"导出", fileName+"导出", headers , column, lst,  "2007");
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return null;	
		
	}

}
