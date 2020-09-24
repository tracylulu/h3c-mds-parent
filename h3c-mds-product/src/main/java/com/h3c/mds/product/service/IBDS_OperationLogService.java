package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.IBDS_OperationLog;

public interface IBDS_OperationLogService {

	int insertSelective(IBDS_OperationLog optLog);

	/**
	 * 分页方法
	 * 
	 * @param pageNum
	 *            当前页
	 * @param pageSize
	 *            每页数据量
	 * @param searchStr
	 *            查询条件
	 * @param proType
	 *            产品类型
	 * @return
	 */
	Map<String, Object> pageOfOperationLog(int pageNum, int pageSize, String searchStr, String proType);

	/**
	 * 批量新增操作日志
	 * 
	 * @param list
	 * @return
	 */
	int insertSelectiveBatch(@Param("list") List<IBDS_OperationLog> list);
	
	/**
	 * vr流程修改V名称及R名称时记录一条B修改日志
	 * @param map
	 */
	void insertModPBName(Map<String,Object> map);

}
