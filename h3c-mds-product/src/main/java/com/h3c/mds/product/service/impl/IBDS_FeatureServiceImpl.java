package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.FeatureViewMapper;
import com.h3c.mds.product.dao.IBDS_FeatureMapper;
import com.h3c.mds.product.entity.FeatureView;
import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_FeatureExample;
import com.h3c.mds.product.entity.IBDS_FeatureExample.Criteria;
import com.h3c.mds.product.service.IBDS_FeatureService;

@Service
public class IBDS_FeatureServiceImpl implements IBDS_FeatureService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_FeatureServiceImpl.class);
	@Autowired
	private IBDS_FeatureMapper featureMapper;

	@Autowired
	private FeatureViewMapper featureViewMapper;

	@Override
	@Transactional(readOnly = true)
	public List<FeatureView> getTreeData(Map<String, String> param) {

		List<FeatureView> featureTreeData = null;
		try {
			featureTreeData = featureViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return featureTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public FeatureView selectByCode(String code) {
		return featureViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addIBDSFeature(IBDS_Feature feature) {
		return featureMapper.insertSelective(feature);
	}

	@Override
	@Transactional
	public int editIBDSFeature(IBDS_Feature feature) {
		feature.setId(null);
		IBDS_FeatureExample example = new IBDS_FeatureExample();
		Criteria criteria = example.createCriteria();
		criteria.andFeaturenoEqualTo(feature.getFeatureno());
		IBDS_Feature oldFeature = getFeatureByCode(feature.getFeatureno());
		// 处理曾用名
		if (oldFeature != null && feature.getFeature() != null
				&& !feature.getFeature().equals(oldFeature.getFeature())) {
			if (StringUtil.isNotEmpty(oldFeature.getFeatureold())) {
				feature.setFeatureold(oldFeature.getFeature() + ";" + oldFeature.getFeatureold());
			} else {
				feature.setFeatureold(oldFeature.getFeature());
			}
		}
		return featureMapper.updateByExampleSelective(feature, example);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = featureViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错--生成特性内码");
		}
		if (maxCode == null) {
			maxCode = ProductConst.FEATURE_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = ProductConst.FEATURE_CODE_PREFIX;
		for (int i = 0; i < ProductConst.CODECONST - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_Feature getFeatureByCode(String code) {
		IBDS_FeatureExample example = new IBDS_FeatureExample();
		Criteria criteria = example.createCriteria();
		criteria.andFeaturenoEqualTo(code);
		List<IBDS_Feature> featureList = featureMapper.selectByExample(example);

		if (featureList != null && featureList.size() == 1) {
			return featureList.get(0);
		} else {
			LOG.error("内码:" + code + " size " + featureList.size());
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
	public int insertSelectiveBatch(List<IBDS_Feature> featureList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(featureList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < featureList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_Feature> tmpfeatureList = featureList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				featureMapper.insertSelectiveBatch(tmpfeatureList);
			}

			if (0 != featureList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_Feature> tmpfeatureList = featureList.subList(
						featureList.size() - (featureList.size() % ProductConst.PRODUCT_COUNT), featureList.size());

				featureMapper.insertSelectiveBatch(tmpfeatureList);
			}

			num = featureList.size();
		}
		return num;
		// return featureMapper.insertSelectiveBatch(feature);
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_Feature> featureList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(featureList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < featureList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_Feature> tmpfeatureList = featureList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				featureMapper.updateByBatch(tmpfeatureList);
			}

			if (0 != featureList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_Feature> tmpfeatureList = featureList.subList(
						featureList.size() - (featureList.size() % ProductConst.PRODUCT_COUNT), featureList.size());

				featureMapper.updateByBatch(tmpfeatureList);
			}

			num = featureList.size();
		}
		return num;
		// return featureMapper.updateByBatch(list);
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
		return featureMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_Feature> selectByExample(IBDS_FeatureExample example) {
		return featureMapper.selectByExample(example);
	}
}
