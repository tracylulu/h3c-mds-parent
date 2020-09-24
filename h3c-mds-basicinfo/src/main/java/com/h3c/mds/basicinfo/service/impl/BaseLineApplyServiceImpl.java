package com.h3c.mds.basicinfo.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.basicinfo.dao.IBDS_BaseLine_ApplyMapper;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_ApplyExample;
import com.h3c.mds.basicinfo.service.BaseLineApplyService;

/**
 * 产品申请服务实现类
 */
@Service
public class BaseLineApplyServiceImpl implements BaseLineApplyService {

	@Autowired
	private IBDS_BaseLine_ApplyMapper baseLine_ApplyMapper;

	/**
	 * 创建产品表单数据
	 * 
	 * @param IBDS_BaseLine_Apply
	 */
	@Override
	@Transactional
	public void create(IBDS_BaseLine_Apply productApply) {
		productApply.setCreateDate(new Date());
		productApply.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
		productApply.setModifyDate(new Date());
		productApply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		baseLine_ApplyMapper.insertSelective(productApply);
	}

	/**
	 * 更新产品申请信息
	 * 
	 * @param IBDS_BaseLine_Apply
	 */
	@Override
	@Transactional
	public void update(IBDS_BaseLine_Apply productApply) {
		productApply.setModifyDate(new Date());
		productApply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		baseLine_ApplyMapper.updateByPrimaryKeySelective(productApply);
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
		return baseLine_ApplyMapper.getIdsByProcessCode(processCode);
	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 */
	@Override
	@Transactional
	public void deleteById(Integer id) {
		baseLine_ApplyMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据条件删除数据
	 * 
	 * @param id
	 */
	@Override
	@Transactional
	public int deleteByExample(IBDS_BaseLine_ApplyExample example) {
		return baseLine_ApplyMapper.deleteByExample(example);
	}

	/**
	 * 根据流程申请编号获取子表单集合
	 * 
	 * @param applyCode
	 * @return
	 */
	@Override
	public List<IBDS_BaseLine_Apply> getByProcessCode(String applyCode) {
		return baseLine_ApplyMapper.getByProcessCode(applyCode);
	}

	/**
	 * 获取在途流程数据
	 */
	@Override
	public List<IBDS_BaseLine_Apply> getZTByProductCode(Map<String, String> param) {
		return baseLine_ApplyMapper.getZTByProductCode(param);
	}

	/**
	 * 获取是否存在在途数据
	 */
	@Override
	public Integer getZTCountByProductCode(Map<String, String> param) {
		return baseLine_ApplyMapper.getZTCountByProductCode(param);
	}

	/**
	 * 更新产品库相关信息
	 * 
	 * @param
	 */
	@Override
	@Transactional
	public void updateBaseinfo(Map<String, Object> param) {
		baseLine_ApplyMapper.updateBaseinfo(param);
	}

	/**
	 * 根据主键获取数据
	 */
	@Override
	public IBDS_BaseLine_Apply selectByPrimaryKey(Integer id) {
		return baseLine_ApplyMapper.selectByPrimaryKey(id);
	}

}
