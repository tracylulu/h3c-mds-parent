package com.h3c.mds.basicinfo.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExt;

/**
 * 产品编码申请服务类
 */
public interface BaseObjectProcessService {

	/**
	 * 获取当前最大的单号
	 * 
	 * @return
	 */
	String getMaxCode();

	/**
	 * 创建产品编码子表单数据
	 * 
	 * @param IBDS_BaseObject_PROCESS
	 */
	Integer create(IBDS_BaseObject_PROCESS productProcess);

	/**
	 * 更新产品编码申请信息
	 * 
	 * @param productCodeApply
	 */
	void update(IBDS_BaseObject_PROCESS productProcess);

	/**
	 * 校验
	 * 
	 * @param processExt
	 */
	void validateForm(IBDS_BaseObject_PROCESSExt processExt);

	/**
	 * 根据id获取申请流程并级联子表单
	 * 
	 * @param id
	 * @return
	 */
	IBDS_BaseObject_PROCESSExt getByProductId(Integer id);

	/**
	 * 根据id获取信息
	 * 
	 * @param id
	 * @return
	 */
	IBDS_BaseObject_PROCESSExt getExtById(Integer id);

	/**
	 * 审核
	 * 
	 * @param id
	 * @param params
	 */
	void check(Integer id, String taskId, Map<String, Object> params) throws Exception;

	IBDS_BaseObject_PROCESS getById(Integer id);

	/**
	 * 修改当前处理人
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 */
	void changeResponsible(Integer id, String taskId, String userId);

	/**
	 * 修改产品信息
	 * 
	 * @param id
	 * @param taskId
	 * @param params
	 */
	void updateBaseInfo(Integer id, String taskId, Map<String, Object> params) throws Exception;

	/**
	 * 更改产品信息
	 * 
	 * @param process
	 */
	void synchronizeChange(IBDS_BaseObject_PROCESSExt process);

	/**
	 * 查询流程数据
	 * 
	 * @param example
	 * @return
	 */
	List<IBDS_BaseObject_PROCESS> selectByExample(String code);
}
