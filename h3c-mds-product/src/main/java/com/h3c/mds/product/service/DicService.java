package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;
import com.github.pagehelper.PageInfo;

import com.h3c.mds.product.entity.IBDS_Dic;

public interface DicService {
	public List<IBDS_Dic> getDic(Map<String, String> param);
	
	public List<IBDS_Dic> getList(Map<String, String> param);
	
	PageInfo<IBDS_Dic> pageOfDic(int pageNum, int pageSize, Map<String,String> param);
	
	public int save(IBDS_Dic model);
	
	public int update(IBDS_Dic model);
	
	public List<IBDS_Dic> getDicTypeComb();
	
	public IBDS_Dic getByPrimaryKey(Integer id);
	
	public String validation(IBDS_Dic model,boolean isEdit);
	
}
