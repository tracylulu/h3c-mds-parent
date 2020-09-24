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
import com.h3c.mds.product.dao.BaseLineViewMapper;
import com.h3c.mds.product.dao.IBDS_BaseLineMapper;
import com.h3c.mds.product.entity.BaseLineView;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_BaseLineExample;
import com.h3c.mds.product.entity.IBDS_BaseLineExample.Criteria;
import com.h3c.mds.product.service.IBDS_BaseLineService;

@Service
public class IBDS_BaseLineServiceImpl implements IBDS_BaseLineService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_BaseLineServiceImpl.class);
	@Autowired
	private IBDS_BaseLineMapper ibdsBaseLineMapper;

	@Autowired
	private BaseLineViewMapper baseLineViewMapper;

	@Override
	@Transactional(readOnly = true)
	public List<BaseLineView> getTreeData(Map<String, String> param) {
		List<BaseLineView> baseLineTreeData = null;
		try {
			baseLineTreeData = baseLineViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return baseLineTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public List<BaseLineView> getBaseLineTreeData(Map<String, String> param) {
		List<BaseLineView> baseLineTreeData = null;
		try {
			baseLineTreeData = baseLineViewMapper.getBaseLineTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return baseLineTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public BaseLineView selectByCode(String code) {
		return baseLineViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addIBDSBaseLine(IBDS_BaseLine baseLine) {

		return ibdsBaseLineMapper.insertSelective(baseLine);
	}

	@Override
	@Transactional
	public int editIBDSProject(IBDS_BaseLine baseLine) {
		baseLine.setId(null);
		IBDS_BaseLineExample example = new IBDS_BaseLineExample();
		Criteria criteria = example.createCriteria();
		criteria.andBaselinenoEqualTo(baseLine.getBaselineno());
		IBDS_BaseLine oldBaseLine = getBaseLineByCode(baseLine.getBaselineno());
		if (oldBaseLine != null && baseLine.getBaseline() != null
				&& !baseLine.getBaseline().equals(oldBaseLine.getBaseline())) {
			if (StringUtils.isNotBlank(oldBaseLine.getBaselineold())) {
				baseLine.setBaselineold(oldBaseLine.getBaselineold() + ";" + oldBaseLine.getBaseline());
			} else {
				baseLine.setBaselineold(oldBaseLine.getBaseline());
			}
		}
		return ibdsBaseLineMapper.updateByExampleSelective(baseLine, example);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = baseLineViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错");
		}
		if (maxCode == null) {
			maxCode = ProductConst.BASELINE_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = ProductConst.BASELINE_CODE_PREFIX;
		for (int i = 0; i < ProductConst.CODECONST - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	@Override
	@Transactional(readOnly = true)
	public IBDS_BaseLine getBaseLineByCode(String code) {
		IBDS_BaseLineExample example = new IBDS_BaseLineExample();
		Criteria criteria = example.createCriteria();
		criteria.andBaselinenoEqualTo(code);
		List<IBDS_BaseLine> baseLineList = ibdsBaseLineMapper.selectByExample(example);
		if (baseLineList != null && baseLineList.size() == 1) {
			return baseLineList.get(0);
		} else {
			LOG.error("基线版本内码:" + code + " size " + baseLineList.size());
			return null;
		}
	}

	/**
	 * 批量新增基线
	 * 
	 * @param record
	 * @return
	 */
	@Override
	@Transactional
	public int insertSelectiveBatch(List<IBDS_BaseLine> baselineList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(baselineList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < baselineList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_BaseLine> tmpbaselineList = baselineList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				ibdsBaseLineMapper.insertSelectiveBatch(tmpbaselineList);
			}

			if (0 != baselineList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_BaseLine> tmpbaselineList = baselineList.subList(
						baselineList.size() - (baselineList.size() % ProductConst.PRODUCT_COUNT), baselineList.size());

				ibdsBaseLineMapper.insertSelectiveBatch(tmpbaselineList);
			}

			num = baselineList.size();
		}
		return num;
		// return ibdsBaseLineMapper.insertSelectiveBatch(feature);
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_BaseLine> baselineList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(baselineList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < baselineList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_BaseLine> tmpbaselineList = baselineList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				ibdsBaseLineMapper.updateByBatch(tmpbaselineList);
			}

			if (0 != baselineList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_BaseLine> tmpbaselineList = baselineList.subList(
						baselineList.size() - (baselineList.size() % ProductConst.PRODUCT_COUNT), baselineList.size());

				ibdsBaseLineMapper.updateByBatch(tmpbaselineList);
			}

			num = baselineList.size();
		}
		return num;
		// return ibdsBaseLineMapper.updateByBatch(list);
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
		return ibdsBaseLineMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_BaseLine> selectByExample(IBDS_BaseLineExample example) {
		return ibdsBaseLineMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public BaseLineView selectByPrimaryKey(Integer id) {
		return baseLineViewMapper.selectByID(id);
	}

	/**
	 * 根据查询查询数据
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public List<BaseLineView> getDataByColunm(Map<String, Object> param) {
		return baseLineViewMapper.getDataByColunm(param);
	}

	/**
	 * 获取基线版本软件平台（从列表拆分）
	 */
	@Override
	@Transactional(readOnly = true)
	public List<BaseLineView> getBaseLineSowtWare(Map<String, String> param) {
		List<BaseLineView> baseLineTreeData = null;
		try {
			baseLineTreeData = baseLineViewMapper.getBaseLineSowtWare(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return baseLineTreeData;
	}

}
