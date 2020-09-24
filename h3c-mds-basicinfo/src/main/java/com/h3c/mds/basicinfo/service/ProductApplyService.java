package com.h3c.mds.basicinfo.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;

/**
 * 产品编码申请服务类
 */
public interface ProductApplyService {

	/**
	 * 创建产品编码子表单数据
	 * 
	 * @param productCodeApply
	 */
	void create(IBDS_Product_Apply productApply);

	/**
	 * 更新产品编码申请信息
	 * 
	 * @param productCodeApply
	 */
	void update(IBDS_Product_Apply productApply);

	/**
	 * 根据流程申请编号获取子表单id集合
	 * 
	 * @param processCode
	 *            申请编号
	 * @return ids id集合
	 */
	List<Integer> getIdsByProcessCode(String processCode);

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 */
	void deleteById(Integer id);

	/**
	 * 根据流程申请编号获取子表单集合
	 * 
	 * @param applyCode
	 * @return
	 */
	List<IBDS_Product_Apply> getByProcessCode(String applyCode);

	/**
	 * 根据产品编号获取在途申请
	 * 
	 * @param productCode
	 * @return
	 */
	List<IBDS_Product_Apply> getZTByProductCode(Map<String, String> param);

	Integer getZTCountByProductCode(Map<String, String> param);

	/**
	 * 更新产品库相关信息
	 * 
	 * @param
	 */
	void updateBaseinfo(Map<String, Object> param);

	/**
	 * 状态删除VR子级产品 （版本、项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param param
	 */
	void updateVRChildren(Map<String, Object> param);

	/**
	 * 状态批量删除子级产品 （版本、项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param param
	 */
	void updateChildrenBatch(Map<String, Object> param);

	/**
	 * 根据列获取是否存在记录
	 * 
	 * @param param
	 * @return
	 */
	int getCountByColunm(Map<String, Object> param);

	/**
	 * 根据列获取是否存在记录
	 * 
	 * @param param
	 * @return
	 */
	String getNameByColunm(Map<String, Object> param);

	/**
	 * 根据查询列获取内码和名称 支持多个
	 * 
	 * @param param
	 * @return
	 */
	String[] getDataByColunm(Map<String, Object> param);

	/**
	 * 根据主键查询
	 * 
	 * @param param
	 * @return
	 */
	IBDS_Product_Apply selectByPrimaryKey(Integer id);
}
