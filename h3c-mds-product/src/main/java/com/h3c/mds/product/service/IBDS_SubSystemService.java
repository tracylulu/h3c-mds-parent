package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_SubSystemExample;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface IBDS_SubSystemService {
    void create(IBDS_SubSystem subSystem);

    void update(IBDS_SubSystem subSystem);

    @Transactional(readOnly=true)
    String getMaxCode();
    
    /**
	 * 批量新增特性
	 * @param record
	 * @return
	 */
	public int insertSelectiveBatch(List<IBDS_SubSystem> record);
	/**
	 * 批量更新
	 * @param list
	 * @return
	 */
	public int updateByBatch (List<IBDS_SubSystem> list);
	 /**
	  * 批量停用  启用   
	  * @param param
	  * @return
	  */
	public int updateByStatusBatch(Map<String,Object> param);
	
	public List<IBDS_SubSystem> selectByExample(IBDS_SubSystemExample example);
}
