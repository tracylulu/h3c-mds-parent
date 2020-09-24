package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_ModuleVersionMapper;
import com.h3c.mds.product.entity.IBDS_ModuleVersion;
import com.h3c.mds.product.entity.IBDS_ModuleVersionExample;
import com.h3c.mds.product.service.IBDS_ModuleVersionService;

@Service
public class IBDS_ModuleVersionServiceImpl implements IBDS_ModuleVersionService {

	@Autowired
	private IBDS_ModuleVersionMapper moduleVersionMapper;

	@Override
	@Transactional
	public void create(IBDS_ModuleVersion moduleVersion) {
		moduleVersion.setMdlvsnno(getMaxCode());
		moduleVersionMapper.insertSelective(moduleVersion);
	}

	@Override
	@Transactional
	public void update(IBDS_ModuleVersion moduleVersion) {
		// moduleVersion.setId(null);
		IBDS_ModuleVersion old = moduleVersionMapper.selectByPrimaryKey(moduleVersion.getId());
		if (old != null && !StringUtils.equals(old.getMdlvsn(), moduleVersion.getMdlvsn())) {
			if (StringUtils.isNotBlank(old.getMdlvsnold())) {
				moduleVersion.setMdlvsnold(old.getMdlvsnold() + ";" + old.getMdlvsn());
			} else {
				moduleVersion.setMdlvsnold(old.getMdlvsn());
			}
		}
		moduleVersionMapper.updateByPrimaryKeySelective(moduleVersion);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = moduleVersionMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "MV000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "MV";
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
	public int insertSelectiveBatch(List<IBDS_ModuleVersion> moduleVersionList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(moduleVersionList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < moduleVersionList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_ModuleVersion> tmpmoduleVersionList = moduleVersionList
						.subList(count * ProductConst.PRODUCT_COUNT, (count + 1) * ProductConst.PRODUCT_COUNT);

				moduleVersionMapper.insertSelectiveBatch(tmpmoduleVersionList);
			}

			if (0 != moduleVersionList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_ModuleVersion> tmpmoduleVersionList = moduleVersionList.subList(
						moduleVersionList.size() - (moduleVersionList.size() % ProductConst.PRODUCT_COUNT),
						moduleVersionList.size());

				moduleVersionMapper.insertSelectiveBatch(tmpmoduleVersionList);
			}

			num = moduleVersionList.size();
		}
		return num;
		// return moduleVersionMapper.insertSelectiveBatch(feature);
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_ModuleVersion> moduleVersionList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(moduleVersionList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < moduleVersionList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_ModuleVersion> tmpmoduleVersionList = moduleVersionList
						.subList(count * ProductConst.PRODUCT_COUNT, (count + 1) * ProductConst.PRODUCT_COUNT);

				moduleVersionMapper.updateByBatch(tmpmoduleVersionList);
			}

			if (0 != moduleVersionList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_ModuleVersion> tmpmoduleVersionList = moduleVersionList.subList(
						moduleVersionList.size() - (moduleVersionList.size() % ProductConst.PRODUCT_COUNT),
						moduleVersionList.size());

				moduleVersionMapper.updateByBatch(tmpmoduleVersionList);
			}

			num = moduleVersionList.size();
		}
		return num;
		// return moduleVersionMapper.updateByBatch(list);
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
		return moduleVersionMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_ModuleVersion> selectByExample(IBDS_ModuleVersionExample example) {
		return moduleVersionMapper.selectByExample(example);
	}
}
