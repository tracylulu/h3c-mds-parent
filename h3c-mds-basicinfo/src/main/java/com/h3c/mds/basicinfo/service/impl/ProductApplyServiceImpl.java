package com.h3c.mds.basicinfo.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.basicinfo.dao.IBDS_Product_ApplyMapper;
import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;
import com.h3c.mds.basicinfo.service.ProductApplyService;

/**
 * 产品申请服务实现类
 */
@Service
public class ProductApplyServiceImpl implements ProductApplyService {

	@Autowired
	private IBDS_Product_ApplyMapper productApplyMapper;

	/**
	 * 创建产品表单数据
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public void create(IBDS_Product_Apply productApply) {
		productApply.setCreateDate(new Date());
		productApply.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
		productApply.setModifyDate(new Date());
		productApply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		productApplyMapper.insertSelective(productApply);
	}

	/**
	 * 更新产品申请信息
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public void update(IBDS_Product_Apply productApply) {
		productApply.setModifyDate(new Date());
		productApply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		productApplyMapper.updateByPrimaryKeySelective(productApply);
	}

	/**
	 * 根据流程申请编号获取子表单id集合
	 * 
	 * @param processCode
	 *            申请编号
	 * @return ids id集合
	 */
	@Override
	public List<Integer> getIdsByProcessCode(String processCode) {
		return productApplyMapper.getIdsByProcessCode(processCode);
	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 */
	@Override
	@Transactional
	public void deleteById(Integer id) {
		productApplyMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据流程申请编号获取子表单集合
	 * 
	 * @param applyCode
	 * @return
	 */
	@Override
	public List<IBDS_Product_Apply> getByProcessCode(String applyCode) {
		return productApplyMapper.getByProcessCode(applyCode);
	}

	/**
	 * 获取在途流程数据
	 */
	@Override
	public List<IBDS_Product_Apply> getZTByProductCode(Map<String, String> param) {
		return productApplyMapper.getZTByProductCode(param);
	}

	/**
	 * 获取是否存在在途数据
	 */
	@Override
	public Integer getZTCountByProductCode(Map<String, String> param) {
		return productApplyMapper.getZTCountByProductCode(param);
	}

	/**
	 * 更新产品库相关信息
	 * 
	 * @param
	 */
	@Override
	@Transactional
	public void updateBaseinfo(Map<String, Object> param) {
		productApplyMapper.updateBaseinfo(param);
	}

	/**
	 * 
	 */
	@Override
	@Transactional
	public void updateVRChildren(Map<String, Object> param) {
		productApplyMapper.updateVRChildren(param);
	}

	/**
	 * 状态批量删除子级产品 （版本、项目组、特性、子系统、模块、模块版本）
	 * 
	 * @param param
	 */
	@Override
	@Transactional
	public void updateChildrenBatch(Map<String, Object> param) {
		productApplyMapper.updateChildrenBatch(param);
	}

	/**
	 * 根据列获取是否存在记录
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public int getCountByColunm(Map<String, Object> param) {
		if (!param.containsKey("status")) {
			param.put("status", "1");
		}
		return productApplyMapper.getCountByColunm(param);
	}

	/**
	 * 根据列获取是否存在记录
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public String getNameByColunm(Map<String, Object> param) {
		if (!param.containsKey("status")) {
			param.put("status", "1");
		}
		return productApplyMapper.getNameByColunm(param);
	}

	/**
	 * 根据查询列获取内码和名称 支持多个
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public String[] getDataByColunm(Map<String, Object> param) {
		return productApplyMapper.getDataByColunm(param);
	}

	/**
	 * 根据主键查询
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public IBDS_Product_Apply selectByPrimaryKey(Integer id) {
		return productApplyMapper.selectByPrimaryKey(id);
	}
}
