package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;

public interface IBDS_ReleaseService {

	public List<IBDS_Release> getRoot();

	public int create(IBDS_Release release);

	public String getMaxCode();

	public int update(IBDS_Release release);

	public IBDS_Release selectByCode(String code);

	public List<IBDS_Release> getByExample(IBDS_ReleaseExample example);
	
	public int updateByPrimaryKey(IBDS_Release release);
	
	public List<IBDS_Release> selectBymap(Map<String, String> param);

}
