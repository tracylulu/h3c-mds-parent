package com.h3c.mds.flowable.service;

import java.util.List;

import com.h3c.mds.entity.BomAndBusinessEntity;
import com.h3c.mds.entity.ErpCoaEntity;
import com.h3c.mds.entity.ProductCodeBomEntity;
import com.h3c.mds.entity.ProductCodeEntity;


/**
 * 产品编码,bom 向erp同步数据   涉及到的流程    产品编码流程，新增part编码流程
 * @author l20095
 *
 */
public interface ErpProductCodeService {

	
	
	/**
	 * 
	 * @param applyNo   申请单号
	 * @param optType   操作类型
	 * @return
	 */
	boolean SyncProductCode2ErpCoa(String applyNo, String optType);

	/**
	 * 向erp coa模块同步新增的产品编码
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncAddProductCode2ErpCoa(String applyNo);
	
	/**
	 * 向erp coa模块同步修改的产品编码
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncEditProductCode2ErpCoa(String applyNo);
	
	/**
	 * 产品编码修改流程是否同步产品编码相关的数据到erp，不涉及bom
	 * @param applyNo
	 * @return true 需要改变
	 */
	boolean isProductCodeChange(String applyNo);
	
	/**
	 * 产品编码新增流程是否走ERP  INV 模块
	 * @param applyNo
	 * @return
	 */
	boolean isSyncProductCodeToErpInv(String applyNo);
	/**
	 * 获取所有需要同步到erp的修改的产品编码相关数据，不涉及到bom
	 * @param applyNo
	 * @return
	 */
	List<ErpCoaEntity> getChangedProductCode(String applyNo);
	
	
	/**
	 * 向erp coa模块同步删除的产品编码
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncDelProductCode2ErpCoa(String applyNo);
	
	
	/**
	 * 向erp Inventory模块同步产品编码信息
	 * @param applyNo 申请单号
	 * @return
	 */
	boolean syncProductCode2Inventory(String applyNo, String optType);
	
	/**
	 * 向erp Inventory模块同步新增的产品编码信息
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncAddProductCode2Inventory(String applyNo);
	
	/**
	 * 向erp Inventory模块同步修改的产品编码信息
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncEditProductCode2Inventory(String applyNo);
		
	/**
	 * 向erp Inventory 模块同步产品编码流程中产品编码和bom的关系
	 * @param applyNo  申请单号
	 * @return
	 */
	boolean syncProductCodeAndBom2Inventory(String applyNo, String optType);
	
	/**
	 * 向erp Inventory 模块bom编码和商业模式的关系   目前part只有新增
	 * @param applyNo
	 * @return
	 */
	boolean syncBomAndBusiness2Inventory(String applyNo);
	
	/**
	 * 向erp Inventory 模块bom编码和商业模式的关系   目前part只有新增
	 * @param applyNo
	 * @return
	 */
	boolean syncAddBomAndBusiness2Inventory(String applyNo);
	
	/**
	 * 向erp Inventory 模块同步新增part流程的产品编码和bom的关系
	 * @param applyNo
	 * @return
	 */
	boolean syncPartCodeApplyProductCodeAndBom2Inventory(String applyNo);
	
	/**
	 * 批量插入erp  coa
	 * @param coaList
	 */
	void batchInsertErpCoaByPage(List<ErpCoaEntity> coaList);
	
	/**
	 * 同步产品编码到inv
	 * @param productCodeList
	 */
	void batchInsertErpProductCodeEntityByPage(List<ProductCodeEntity> productCodeList);
	
	/**
	 * 同步产品编码和bom关系到inv
	 * @param productCodeBomList
	 */
	void batchInsertErpProductCodeBomEntityByPage(List<ProductCodeBomEntity> productCodeBomList);
	
	/**
	 * 同步bom和商业模式到inv
	 * @param productCodeBomList
	 */
	void batchInsertErpBomAndBusinessEntityByPage(List<BomAndBusinessEntity> bomAndBusinessEntityList);
	
}
