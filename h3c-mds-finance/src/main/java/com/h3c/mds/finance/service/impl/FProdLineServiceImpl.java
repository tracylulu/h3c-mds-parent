package com.h3c.mds.finance.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.h3c.mds.finance.dao.FProdLineMapper;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProdLineExample;
import com.h3c.mds.finance.exception.FinanceException;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.sysmgr.util.UserUtils;

@Service
public class FProdLineServiceImpl implements FProdLineService {

	@Autowired
	private FProdLineMapper lineMapper;

	@Transactional
	@Override
	public void create(FProdLine fProdLine) {
		fProdLine.setCreateDate(new Date());
		fProdLine.setCreateUser((String) UserUtils.getCurrentUserId());
		fProdLine.setModifyDate(new Date());
		fProdLine.setModifyUser((String) UserUtils.getCurrentUserId());
		lineMapper.insertSelective(fProdLine);
	}

	@Transactional
	@Override
	public void update(FProdLine fProdLine) {
		fProdLine.setModifyUser((String) UserUtils.getCurrentUserId());
		fProdLine.setModifyDate(new Date());
		lineMapper.updateByPrimaryKeySelective(fProdLine);
	}

	@Transactional
	@Override
	public void updateFProdLine(FProdLine fProdLine) {
		fProdLine.setModifyDate(new Date());
		lineMapper.updateByPrimaryKeySelective(fProdLine);
	}

	/**
	 * 获取所有产品线信息
	 * 
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getAll() {
		FProdLineExample example = new FProdLineExample();
		return lineMapper.selectByExample(example);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getByName(String name) {
		FProdLineExample example = new FProdLineExample();
		if (StringUtils.isNotBlank(name)) {
			FProdLineExample.Criteria criteria = example.createCriteria();
			criteria.andProdlineDescLike(name);
		}
		return lineMapper.selectByExample(example);
	}

	@Override
	@Transactional(readOnly = true)
	public FProdLine getById(Integer id) {
		return lineMapper.selectByPrimaryKey(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getByNoAndName(String prodlineNo, String prodlineName) {
		FProdLineExample example = new FProdLineExample();
		FProdLineExample.Criteria criteria = example.createCriteria();
		if (prodlineNo == null) {
			criteria.andProdlineNoIsNull();
		} else {
			criteria.andProdlineNoEqualTo(prodlineNo);
		}

		criteria.andProdlineDescEqualTo(prodlineName);
		return lineMapper.selectByExample(example);
	}

	@Override
	@Transactional(readOnly = true)
	public FProdLine getByCode(String prodlineno) {
		FProdLineExample example = new FProdLineExample();
		FProdLineExample.Criteria criteria = example.createCriteria();
		criteria.andProdlineCodeEqualTo(prodlineno);
		List<FProdLine> list = lineMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list)) {
			return null;
		} else if (list.size() == 1) {
			return list.get(0);
		} else {
			throw new FinanceException("存在相同内码的数据：" + prodlineno + ",请联系管理员修改数据!");
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getListByCode(String prodlineno) {
		FProdLineExample example = new FProdLineExample();
		FProdLineExample.Criteria criteria = example.createCriteria();
		criteria.andProdlineCodeEqualTo(prodlineno);
		return lineMapper.selectByExample(example);

	}

	/**
	 * 根据类型获取财务产品线
	 * 
	 * @param type
	 *            1 为 同步研发基本信息的产品线 2 为 手动申请的产品线
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getByType(String type) {
		FProdLineExample example = new FProdLineExample();
		FProdLineExample.Criteria criteria = example.createCriteria();
		if ("1".equals(type)) {
			criteria.andProdlineCodeIsNotNull();
		} else {
			criteria.andProdlineCodeIsNull();
		}
		return lineMapper.selectByExample(example);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getDistinctNameByDept(String dept) {
		return lineMapper.getDistinctNameByDept(dept);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FProdLine> getByLineDesc(String desc) {
		FProdLineExample example = new FProdLineExample();
		FProdLineExample.Criteria criteria = example.createCriteria();
		criteria.andProdlineDescEqualTo(desc);
		criteria.andProdlineNoIsNotNull();
		return lineMapper.selectByExample(example);
	}

	@Override
	public List<FProdLine> getDistinctDescFromCode() {
		return lineMapper.getDistinctDescFromCode();
	}

}
