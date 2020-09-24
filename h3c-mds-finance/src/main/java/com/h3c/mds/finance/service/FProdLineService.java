package com.h3c.mds.finance.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.finance.entity.FProdLine;

public interface FProdLineService {

	@Transactional
	void create(FProdLine fProdLine);

	@Transactional
	void update(FProdLine fProdLine);

	void updateFProdLine(FProdLine fProdLine);

	/**
	 * 获取所有产品线信息
	 * 
	 * @return
	 */
	@Transactional(readOnly = true)
	List<FProdLine> getAll();

	/**
	 * 根据名称模糊查询
	 * 
	 * @param name
	 * @return
	 */
	List<FProdLine> getByName(String name);

	FProdLine getById(Integer id);

	List<FProdLine> getByNoAndName(String prodlineNo, String prodlineName);

	/**
	 * 根据内码获取产品线
	 * 
	 * @param prodlineno
	 * @return
	 */
	FProdLine getByCode(String prodlineno);

	@Transactional(readOnly = true)
	List<FProdLine> getByType(String type);

	/**
	 * 根据部门获取产品线
	 */
	List<FProdLine> getDistinctNameByDept(String dept);

	List<FProdLine> getByLineDesc(String desc);

	List<FProdLine> getDistinctDescFromCode();

	List<FProdLine> getListByCode(String prodlineno);
}
