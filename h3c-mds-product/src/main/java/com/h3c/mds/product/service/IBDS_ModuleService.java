package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleExample;
import com.h3c.mds.product.entity.IBDS_Team;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface IBDS_ModuleService {
    void create(IBDS_Module module);

    void update(IBDS_Module module);

    @Transactional(readOnly=true)
    String getMaxCode();
    
    /**
	 * 批量新增特性
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_Module> record);
	/**
	 * 批量更新
	 * @param list
	 * @return
	 */
	public int updateByBatch (List<IBDS_Module> list);
	 /**
	  * 批量停用  启用   
	  * @param param
	  * @return
	  */
	public int updateByStatusBatch(Map<String,Object> param);
	
	public List<IBDS_Module> selectByExample(IBDS_ModuleExample example);
}
