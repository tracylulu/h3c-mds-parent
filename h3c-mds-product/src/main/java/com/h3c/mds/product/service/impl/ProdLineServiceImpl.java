package com.h3c.mds.product.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.finaceconst.FinanceConst;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.product.dao.IBDS_PRODLINEMapper;
import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.IBDS_PRODLINEExample;
import com.h3c.mds.product.service.ProdLineService;

@Service
public class ProdLineServiceImpl implements ProdLineService {

	@Autowired
	private IBDS_PRODLINEMapper prodlineMapper;
	@Autowired
	private FProdLineService fProdLineService;

	@Override
	@Transactional
	public void create(IBDS_PRODLINE prodline) {
		prodline.setProdlineno(getMaxCode());
		prodlineMapper.insertSelective(prodline);
		FProdLine fProdLine = new FProdLine();
		fProdLine.setProdlineCode(prodline.getProdlineno());
		fProdLine.setProdlineDesc(prodline.getProdline());
		fProdLine.setProdlineName(prodline.getProdline());
		fProdLine.setProdlineDescEn(prodline.getEngprodline());
		// 这个状态是想erp同步数据用的
		fProdLine.setSyncStatus(FinanceConst.PRODLINE_STATUS_NEW);
		fProdLineService.create(fProdLine);
	}

	@Override
	@Transactional
	public void update(IBDS_PRODLINE prodline) {
		IBDS_PRODLINE old = prodlineMapper.selectByPrimaryKey(prodline.getId());
		if (old != null && !StringUtils.equals(old.getProdline(), prodline.getProdline())) {
			if (StringUtils.isNotBlank(old.getProdlineold())) {
				prodline.setProdlineold(old.getProdlineold() + ";" + old.getProdline());
			} else {
				prodline.setProdlineold(old.getProdline());
			}
		}
		prodlineMapper.updateByPrimaryKey(prodline);
		if (!StringUtils.equals(old.getProdline(), prodline.getProdline())) {
			List<FProdLine> fProdLines = fProdLineService.getListByCode(prodline.getProdlineno());
			if (CollectionUtils.isNotEmpty(fProdLines)) {
				for (FProdLine fProdLine : fProdLines) {
					fProdLine.setProdlineName(prodline.getProdline());
					fProdLine.setProdlineDesc(prodline.getProdline());
					fProdLine.setProdlineDescEn(prodline.getEngprodline());
					fProdLineService.update(fProdLine);
				}
			}

		}

	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = prodlineMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "PL000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "PL";
		for (int i = 0; i < 6 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_PRODLINE selectByCode(String code) {
		IBDS_PRODLINEExample example = new IBDS_PRODLINEExample();
		IBDS_PRODLINEExample.Criteria criteria = example.createCriteria();
		criteria.andProdlinenoEqualTo(code);
		List<IBDS_PRODLINE> lst = prodlineMapper.selectByExample(example);
		if (lst != null && lst.size() > 0) {
			return lst.get(0);
		}
		return new IBDS_PRODLINE();
	}

	@Override
	public List<IBDS_PRODLINE> selectByExample(IBDS_PRODLINEExample example) {
		return prodlineMapper.selectByExample(example);
	}

	@Override
	public List<IBDS_PRODLINE> getAll() {
		IBDS_PRODLINEExample example = new IBDS_PRODLINEExample();
		return prodlineMapper.selectByExample(example);
	}

	@Override
	@Transactional(readOnly = true)
	public List<IBDS_PRODLINE> getByName(String name) {
		IBDS_PRODLINEExample example = new IBDS_PRODLINEExample();
		IBDS_PRODLINEExample.Criteria criteria = example.createCriteria();
		criteria.andProdlineEqualTo(name);
		return prodlineMapper.selectByExample(example);
	}
}
