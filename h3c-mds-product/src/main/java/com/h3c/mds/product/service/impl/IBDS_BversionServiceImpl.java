package com.h3c.mds.product.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.Bversion_viewMapper;
import com.h3c.mds.product.dao.IBDS_BversionMapper;
import com.h3c.mds.product.entity.Bversion_view;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_BversionExample;
import com.h3c.mds.product.entity.IBDS_BversionExample.Criteria;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.IBDS_BversionService;

@Service
public class IBDS_BversionServiceImpl implements IBDS_BversionService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_BversionServiceImpl.class);
	@Autowired
	private IBDS_BversionMapper bversionMapper;

	@Autowired
	private Bversion_viewMapper bversion_ViewMapper;

	@Override
	@Transactional(readOnly = true)
	public List<Bversion_view> getTreeData(Map<String, String> param) {
		List<Bversion_view> versionTreeDada = null;
		try {
			versionTreeDada = bversion_ViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return versionTreeDada;
	}

	@Override
	@Transactional(readOnly = true)
	public Bversion_view selectByCode(String code) {
		return bversion_ViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addBversion(IBDS_Bversion version) {
		return bversionMapper.insertSelective(version);
	}

	@Override
	@Transactional
	public int editBversion(IBDS_Release release, IBDS_Bversion version) {
		version.setId(null);
		IBDS_BversionExample example = new IBDS_BversionExample();
		Criteria criteria = example.createCriteria();
		criteria.andBversionnoEqualTo(version.getBversionno());
		IBDS_Bversion oldBversion = this.getBversionByBversionCode(version.getBversionno());
		// 处理曾用名

		if (oldBversion != null && version.getBversioncname() != null
				&& !version.getBversioncname().equals(oldBversion.getBversioncname())) {
			if (StringUtils.isNotBlank(oldBversion.getBversionold())) {
				version.setBversionold((release.getRelease() == null ? "" : release.getRelease())
						+ oldBversion.getBversioncname() + ";" + oldBversion.getBversionold());

			} else {
				version.setBversionold(
						(release.getRelease() == null ? "" : release.getRelease()) + oldBversion.getBversioncname());
			}
		}

		version.setBversioncname(version.getBversioncname());
		version.setBversionename(version.getBversionename());
		return bversionMapper.updateByExampleSelective(version, example);
	}

	/**
	 * 根据内码更新B版本状态
	 */
	@Override
	@Transactional
	public int updateByProjectStatusBatch(String releaseno, String projectStatus, String bversion, String modifyUser) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("releaseno", releaseno);
		param.put("projectStatus", projectStatus);
		param.put("bversion", bversion);
		param.put("modifyUser", modifyUser);
		return bversionMapper.updateByProjectStatusBatch(param);
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_Bversion getBversionByBversionCode(String bversionCode) {
		IBDS_BversionExample example = new IBDS_BversionExample();
		Criteria criteria = example.createCriteria();
		criteria.andBversionnoEqualTo(bversionCode);
		List<IBDS_Bversion> list = bversionMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0);

		} else {
			LOG.error("B版本内码: " + bversionCode + " size " + list.size());
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = bversion_ViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错");
		}
		if (maxCode == null) {
			maxCode = ProductConst.BVERSION_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = ProductConst.BVERSION_CODE_PREFIX;
		for (int i = 0; i < ProductConst.CODECONST - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	public List<IBDS_Bversion> getAllBversionByReleaseCode(String reseaseCode) {
		IBDS_BversionExample example = new IBDS_BversionExample();
		Criteria criteria = example.createCriteria();
		criteria.andReleasenoEqualTo(reseaseCode);
		// criteria.andVersionnoEqualTo(reseaseCode);
		return bversionMapper.selectByExample(example);
	}

	@Override
	public List<IBDS_Bversion> getBversionByReleaseCodeAndBversion(String reseaseCode, String Bversion) {

		return bversionMapper.getBversionByReleaseCodeAndBversion(reseaseCode, Bversion);
	}

	@Override
	public int updateByCode(IBDS_Bversion bversion) {
		bversion.setId(null);
		IBDS_BversionExample example = new IBDS_BversionExample();
		Criteria criteria = example.createCriteria();
		criteria.andBversionnoEqualTo(bversion.getBversionno());
		// return bversionMapper.updateByPrimaryKeySelective(bversion);
		return bversionMapper.updateByExampleSelective(bversion, example);
	}

	@Override
	public List<IBDS_Bversion> selectByCodeList(String[] codeList) {
		return bversionMapper.selectByCodeList(Arrays.asList(codeList));
	}

	@Override
	public List<IBDS_Bversion> selectBymap(Map<String, String> param) {
		return bversionMapper.selectByMap(param);
	}

	@Override
	public IBDS_Bversion getBversionByReleaseCodeAndBversionName(Map<String, String> param) {
		IBDS_BversionExample example = new IBDS_BversionExample();
		Criteria criteria = example.createCriteria();
		criteria.andReleasenoEqualTo(param.get("releaseNo"));
		criteria.andBversioncnameEqualTo(param.get("bVersionName"));
		List<IBDS_Bversion> list = bversionMapper.selectByExample(example);

		if (CollectionUtils.isNotEmpty(list)) {
			if (list.size() == 1) {
				return list.get(0);
			} else {
				// TODO 记录错误数据
				LOG.error("R级内码 :" + param.get("releaseNo") + "B级名称 : " + param.get("bVersionName") + "数据有问题");
				return null;
			}
		} else {
			return null;
		}

		// if(list != null && list.size() == 1){
		// return list.get(0);
		// }else{
		// LOG.error("R级内码 :" + param.get("releaseNo") + "B级名称 : " +
		// param.get("bVersionName") + "数据有问题");
		// return null;
		// }
	}

	@Override
	public List<IBDS_Bversion> selectByExample(IBDS_BversionExample example) {
		return bversionMapper.selectByExample(example);
	}
}
