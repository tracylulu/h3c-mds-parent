package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.dao.IBDS_ReleaseMapper;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_BaseLineExample;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;
import com.h3c.mds.product.entity.IBDS_ReleaseExample.Criteria;
import com.h3c.mds.product.service.IBDS_ReleaseService;

@Service
public class IBDS_ReleaseServiceImpl implements IBDS_ReleaseService {

	@Autowired
	private IBDS_ReleaseMapper releaseMapper;

	@Override
	public List<IBDS_Release> getRoot() {
		IBDS_ReleaseExample releaseExample = new IBDS_ReleaseExample();
		// releaseExample.createCriteria();
		List<IBDS_Release> lstRelease = releaseMapper.selectByExample(releaseExample);
		return lstRelease;
	}

	@Override
	@Transactional
	public int create(IBDS_Release release) {
		release.setReleaseno(getMaxCode());
		return releaseMapper.insertSelective(release);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = releaseMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "PR000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "PR";
		for (int i = 0; i < 6 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional
	public int update(IBDS_Release release) {
		release.setId(null);
		IBDS_ReleaseExample example = new IBDS_ReleaseExample();
		Criteria criteria = example.createCriteria();
		criteria.andReleasenoEqualTo(release.getReleaseno());
		IBDS_Release oldrelease = selectByCode(release.getReleaseno());
		if (oldrelease != null && release.getRelease() != null
				&& !release.getRelease().equals(oldrelease.getRelease())) {
			if (StringUtils.isNotBlank(oldrelease.getReleaseold())) {
				release.setReleaseold(oldrelease.getReleaseold() + ";" + oldrelease.getRelease());
			} else {
				release.setReleaseold(oldrelease.getRelease());
			}
		}
		return releaseMapper.updateByExampleSelective(release, example);
	}

	@Override
//	@Transactional(readOnly = true,propagation=Propagation.REQUIRES_NEW)
	public IBDS_Release selectByCode(String code) {

		return releaseMapper.selectByCode(code);
	}

	@Override
	@Transactional(readOnly = true)
	public List<IBDS_Release> getByExample(IBDS_ReleaseExample example) {
		return releaseMapper.selectByExample(example);
	}
	
	@Override
	public int updateByPrimaryKey(IBDS_Release release){
		return releaseMapper.updateByPrimaryKeySelective(release);
	}
	
	@Override
	public List<IBDS_Release> selectBymap(Map<String, String> param){
		return releaseMapper.selectByMap(param);
	}
}
