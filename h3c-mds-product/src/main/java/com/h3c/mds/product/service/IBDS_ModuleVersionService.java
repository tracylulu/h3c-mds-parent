package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleVersion;
import com.h3c.mds.product.entity.IBDS_ModuleVersionExample;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface IBDS_ModuleVersionService {
    void create(IBDS_ModuleVersion moduleVersion);

    void update(IBDS_ModuleVersion moduleVersion);

    @Transactional(readOnly=true)
    String getMaxCode();

    /**
	 * 批量新增特性
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_ModuleVersion> record);
	/**
	 * 批量更新
	 * @param list
	 * @return
	 */
	public int updateByBatch (List<IBDS_ModuleVersion> list);
	 /**
	  * 批量停用  启用   
	  * @param param
	  * @return
	  */
	public int updateByStatusBatch(Map<String,Object> param);
	
	public List<IBDS_ModuleVersion> selectByExample(IBDS_ModuleVersionExample example);
}
