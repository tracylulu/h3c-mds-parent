package com.h3c.mds.basicinfo.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_ApplyExample;

/**
 * 产品编码申请服务类
 */
public interface BaseLineApplyService {

	/**
	 * 创建产品编码子表单数据
	 * 
	 * @param productCodeApply
	 */
	void create(IBDS_BaseLine_Apply productApply);

	/**
	 * 更新产品编码申请信息
	 * 
	 * @param productCodeApply
	 */
	void update(IBDS_BaseLine_Apply productApply);

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
	 * 根据条件删除数据
	 * 
	 * @param id
	 */

	int deleteByExample(IBDS_BaseLine_ApplyExample example);

	/**
	 * 根据流程申请编号获取子表单集合
	 * 
	 * @param applyCode
	 * @return
	 */
	List<IBDS_BaseLine_Apply> getByProcessCode(String applyCode);

	/**
	 * 根据产品编号获取在途申请
	 * 
	 * @param productCode
	 * @return
	 */
	List<IBDS_BaseLine_Apply> getZTByProductCode(Map<String, String> param);

	Integer getZTCountByProductCode(Map<String, String> param);

	/**
	 * 更新产品库相关信息
	 * 
	 * @param
	 */
	void updateBaseinfo(Map<String, Object> param);

	/**
	 * 根据主键获取数据
	 */
	IBDS_BaseLine_Apply selectByPrimaryKey(Integer id);

}
