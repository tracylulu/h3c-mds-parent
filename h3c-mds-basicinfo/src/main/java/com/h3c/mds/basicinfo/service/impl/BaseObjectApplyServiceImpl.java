package com.h3c.mds.basicinfo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.basicinfo.dao.IBDS_BaseObject_ApplyMapper;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_ApplyExample;
import com.h3c.mds.basicinfo.service.BaseObjectApplyService;
import com.h3c.mds.flowable.exception.FlowableException;

/**
 * 产品申请服务实现类
 */
@Service
public class BaseObjectApplyServiceImpl implements BaseObjectApplyService {

	@Autowired
	private IBDS_BaseObject_ApplyMapper baseObjectMapper;

	/**
	 * 创建产品表单数据
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public void create(IBDS_BaseObject_Apply productApply) {
		productApply.setCreateDate(new Date());
		productApply.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
		productApply.setModifyDate(new Date());
		productApply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		baseObjectMapper.insertSelective(productApply);
	}

	/**
	 * 更新产品申请信息
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public void update(IBDS_BaseObject_Apply productApply) {
		productApply.setModifyDate(new Date());
		productApply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		baseObjectMapper.updateByPrimaryKeySelective(productApply);
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
		return baseObjectMapper.getIdsByProcessCode(processCode);
	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 */
	@Override
	@Transactional
	public void deleteById(Integer id) {
		baseObjectMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据条件删除数据
	 * 
	 * @param id
	 */
	@Override
	@Transactional
	public int deleteByExample(IBDS_BaseObject_ApplyExample example) {
		return baseObjectMapper.deleteByExample(example);
	}

	/**
	 * 根据流程申请编号获取子表单集合
	 * 
	 * @param applyCode
	 * @return
	 */
	@Override
	public List<IBDS_BaseObject_Apply> getByProcessCode(String applyCode) {
		return baseObjectMapper.getByProcessCode(applyCode);
	}

	/**
	 * 获取在途流程数据
	 */
	@Override
	public List<IBDS_BaseObject_Apply> getZTByProductCode(Map<String, String> param) {
		return baseObjectMapper.getZTByProductCode(param);
	}

	/**
	 * 获取是否存在在途数据
	 */
	@Override
	public Integer getZTCountByProductCode(Map<String, String> param) {
		return baseObjectMapper.getZTCountByProductCode(param);
	}

	/**
	 * 更新产品库相关信息
	 * 
	 * @param
	 */
	@Override
	@Transactional
	public void updateBaseinfo(Map<String, Object> param) {
		baseObjectMapper.updateBaseinfo(param);
	}

	/**
	 * 根据主键获取数据
	 */
	/**
	 * 根据主键获取数据
	 */
	@Override
	public IBDS_BaseObject_Apply selectByPrimaryKey(Integer id) {
		return baseObjectMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据V R验证产品R级以下是否在途 提供给VR使用
	 */
	@Override
	public void validateVRIntransit(String type, String value, String msg) {
		Map<String, String> param = new HashMap<>();
		param.put("type", type);
		param.put("value", value);
		Integer count = baseObjectMapper.validateVRIntransit(param);
		if (count > 0) {
			throw new FlowableException(msg);
		}
	}
}
