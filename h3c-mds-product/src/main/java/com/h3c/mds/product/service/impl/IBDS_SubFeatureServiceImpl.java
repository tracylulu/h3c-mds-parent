package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_SubFeatureMapper;
import com.h3c.mds.product.dao.SubFeatureViewMapper;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubFeatureExample;
import com.h3c.mds.product.entity.IBDS_SubFeatureExample.Criteria;
import com.h3c.mds.product.entity.SubFeatureView;
import com.h3c.mds.product.service.IBDS_SubFeatureService;

@Service
public class IBDS_SubFeatureServiceImpl implements IBDS_SubFeatureService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_SubFeatureServiceImpl.class);
	@Autowired
	private IBDS_SubFeatureMapper ibdsSubFeatureMapper;

	@Autowired
	private SubFeatureViewMapper subFeatureViewMapper;

	@Override
	@Transactional(readOnly = true)
	public List<SubFeatureView> getTreeData(Map<String, String> param) {
		List<SubFeatureView> subFeatureTreeData = null;
		try {
			subFeatureTreeData = subFeatureViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return subFeatureTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public SubFeatureView selectByCode(String code) {
		return subFeatureViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addIBDSSubFeature(IBDS_SubFeature subFeature) {
		return ibdsSubFeatureMapper.insertSelective(subFeature);
	}

	@Override
	@Transactional
	public int editIBDSSubFeature(IBDS_SubFeature subFeature) {
		subFeature.setId(null);
		IBDS_SubFeatureExample example = new IBDS_SubFeatureExample();
		Criteria criteria = example.createCriteria();
		criteria.andSubfeaturenoEqualTo(subFeature.getSubfeatureno());
		IBDS_SubFeature oldSubFeature = getSubFeatureByCode(subFeature.getSubfeatureno());

		if (oldSubFeature != null && subFeature.getSubfeature() != null
				&& !subFeature.getSubfeature().equals(oldSubFeature.getSubfeature())) {
			if (StringUtils.isNotBlank(oldSubFeature.getSubfeatureold())) {
				subFeature.setSubfeatureold(oldSubFeature.getSubfeature() + ";" + oldSubFeature.getSubfeatureold());
			} else {
				subFeature.setSubfeatureold(oldSubFeature.getSubfeature());
			}
		}
		return ibdsSubFeatureMapper.updateByExampleSelective(subFeature, example);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = subFeatureViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错");
		}
		if (maxCode == null) {
			maxCode = ProductConst.SUB_FEATURE_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = ProductConst.SUB_FEATURE_CODE_PREFIX;
		for (int i = 0; i < ProductConst.CODECONST - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_SubFeature getSubFeatureByCode(String code) {
		IBDS_SubFeatureExample example = new IBDS_SubFeatureExample();
		Criteria criteria = example.createCriteria();
		criteria.andSubfeaturenoEqualTo(code);
		List<IBDS_SubFeature> subFeatureList = ibdsSubFeatureMapper.selectByExample(example);
		if (subFeatureList != null && subFeatureList.size() == 1) {
			return subFeatureList.get(0);
		} else {
			LOG.error("子特性内码 + " + code + " size " + subFeatureList.size());
			return null;
		}
	}

	/**
	 * 批量新增特性
	 * 
	 * @param record
	 * @return
	 */
	@Override
	@Transactional
	public int insertSelectiveBatch(List<IBDS_SubFeature> subfeatureList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(subfeatureList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < subfeatureList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_SubFeature> tmpsubfeatureList = subfeatureList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				ibdsSubFeatureMapper.insertSelectiveBatch(tmpsubfeatureList);
			}

			if (0 != subfeatureList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_SubFeature> tmpfeatureList = subfeatureList.subList(
						subfeatureList.size() - (subfeatureList.size() % ProductConst.PRODUCT_COUNT),
						subfeatureList.size());

				ibdsSubFeatureMapper.insertSelectiveBatch(tmpfeatureList);
			}

			num = subfeatureList.size();
		}
		return num;
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_SubFeature> subfeatureList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(subfeatureList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < subfeatureList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_SubFeature> tmpsubfeatureList = subfeatureList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				ibdsSubFeatureMapper.insertSelectiveBatch(tmpsubfeatureList);
			}

			if (0 != subfeatureList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_SubFeature> tmpsubfeatureList = subfeatureList.subList(
						subfeatureList.size() - (subfeatureList.size() % ProductConst.PRODUCT_COUNT),
						subfeatureList.size());

				ibdsSubFeatureMapper.insertSelectiveBatch(tmpsubfeatureList);
			}

			num = subfeatureList.size();
		}
		return num;
		// return ibdsSubFeatureMapper.updateByBatch(list);
	}

	/**
	 * 批量停用 启用
	 * 
	 * @param param
	 * @return
	 */
	@Override
	@Transactional
	public int updateByStatusBatch(Map<String, Object> param) {
		return ibdsSubFeatureMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_SubFeature> selectByExample(IBDS_SubFeatureExample example) {
		return ibdsSubFeatureMapper.selectByExample(example);
	}
}
