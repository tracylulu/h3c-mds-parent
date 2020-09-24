package com.h3c.mds.flowable.service;

import java.util.List;

import com.h3c.mds.entity.ErpCoaEntity;

/**
 * 项目编码申请流程向erp同步数据
 * @author l20095
 *
 */
public interface ErpProjectCodeService {

	
	/**
	 * 项目编码是否向ERP写入数据
	 * @param applyNo
	 * @param optType
	 * @return
	 */
	boolean isSyncProjectCode2Erp(String applyNo, String optType);
	
	/**
	 * 向erp同步项目编码
	 * @param applyNo	申请单号
	 * @param optType	申请类型
	 * @return
	 */
	boolean syncProjectCode2Erp(String applyNo, String optType);
	
	/**
	 * 向erp同步新增的项目编码
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncAddProjectCode2Erp(String applyNo);
	
	/**
	 * 向erp同步修改的项目编码
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncEditProjectCode2Erp(String applyNo);
	
	/**
	 * 项目编码修改流程是否需要向ERP同步数据
	 * @param applyNo
	 * @return
	 */
	List<ErpCoaEntity> getChangedEditProjectCode2Erp(String applyNo);
	
	
	/**
	 * 向erp同步删除的项目编码
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncDelProjectCode2Erp(String applyNo);
	
	/**
	 * 分批插入erp  oracle
	 * @param coaList
	 */
	void batchInsertErpCoaByPage(List<ErpCoaEntity> coaList);
}
