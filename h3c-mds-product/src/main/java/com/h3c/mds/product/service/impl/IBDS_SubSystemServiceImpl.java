package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_SubSystemMapper;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_SubSystemExample;
import com.h3c.mds.product.service.IBDS_SubSystemService;

@Service
public class IBDS_SubSystemServiceImpl implements IBDS_SubSystemService {

	@Autowired
	private IBDS_SubSystemMapper subSystemMapper;

	@Override
	@Transactional
	public void create(IBDS_SubSystem subSystem) {
		subSystem.setSubsystemno(getMaxCode());
		subSystemMapper.insertSelective(subSystem);
	}

	@Override
	@Transactional
	public void update(IBDS_SubSystem subSystem) {

		IBDS_SubSystem old = subSystemMapper.selectByPrimaryKey(subSystem.getId());
		if (old != null && !StringUtils.equals(old.getSubsystem(), subSystem.getSubsystem())) {
			if (StringUtils.isNotBlank(old.getSubsystemold())) {
				subSystem.setSubsystemold(old.getSubsystemold() + ";" + old.getSubsystem());
			} else {
				subSystem.setSubsystemold(old.getSubsystem());
			}
		}
		subSystemMapper.updateByPrimaryKeySelective(subSystem);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = subSystemMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "SS000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "SS";
		for (int i = 0; i < 6 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}

	/**
	 * 批量新增特性
	 * 
	 * @param record
	 * @return
	 */
	@Override
	@Transactional
	public int insertSelectiveBatch(List<IBDS_SubSystem> subSystemList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(subSystemList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < subSystemList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_SubSystem> tmpsubSystemList = subSystemList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				subSystemMapper.insertSelectiveBatch(tmpsubSystemList);
			}

			if (0 != subSystemList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_SubSystem> tmpsubSystemList = subSystemList.subList(
						subSystemList.size() - (subSystemList.size() % ProductConst.PRODUCT_COUNT),
						subSystemList.size());

				subSystemMapper.insertSelectiveBatch(tmpsubSystemList);
			}

			num = subSystemList.size();
		}
		return num;
		// return subSystemMapper.insertSelectiveBatch(feature);
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_SubSystem> subSystemList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(subSystemList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < subSystemList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_SubSystem> tmpsubSystemList = subSystemList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				subSystemMapper.updateByBatch(tmpsubSystemList);
			}

			if (0 != subSystemList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_SubSystem> tmpsubSystemList = subSystemList.subList(
						subSystemList.size() - (subSystemList.size() % ProductConst.PRODUCT_COUNT),
						subSystemList.size());

				subSystemMapper.updateByBatch(tmpsubSystemList);
			}

			num = subSystemList.size();
		}
		return num;
		// return subSystemMapper.updateByBatch(list);
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
		return subSystemMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_SubSystem> selectByExample(IBDS_SubSystemExample example) {
		return subSystemMapper.selectByExample(example);
	}
}
