package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_ModuleMapper;
import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleExample;
import com.h3c.mds.product.service.IBDS_ModuleService;

@Service
public class IBDS_ModuleServiceImpl implements IBDS_ModuleService {

	@Autowired
	private IBDS_ModuleMapper moduleMapper;

	@Override
	@Transactional
	public void create(IBDS_Module module) {
		module.setModuleno(getMaxCode());
		moduleMapper.insertSelective(module);
	}

	@Override
	@Transactional
	public void update(IBDS_Module module) {
		// module.setId(null);
		IBDS_Module old = moduleMapper.selectByPrimaryKey(module.getId());
		if (old != null && !StringUtils.equals(old.getModule(), module.getModule())) {
			if (StringUtils.isNotBlank(old.getModuleold())) {
				module.setModuleold(old.getModuleold() + ";" + old.getModule());
			} else {
				module.setModuleold(old.getModule());
			}
		}
		moduleMapper.updateByPrimaryKeySelective(module);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = moduleMapper.getMaxCode();
		if (maxCode == null) {
			maxCode = "MD000000";
		}
		int val = Integer.parseInt(maxCode.substring(2, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "MD";
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
	public int insertSelectiveBatch(List<IBDS_Module> moduleList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(moduleList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < moduleList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_Module> tmpmoduleList = moduleList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				moduleMapper.insertSelectiveBatch(tmpmoduleList);
			}

			if (0 != moduleList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_Module> tmpmoduleList = moduleList.subList(
						moduleList.size() - (moduleList.size() % ProductConst.PRODUCT_COUNT), moduleList.size());

				moduleMapper.insertSelectiveBatch(tmpmoduleList);
			}

			num = moduleList.size();
		}
		return num;
		// return moduleMapper.insertSelectiveBatch(feature);
	}

	/**
	 * 批量更新
	 * 
	 * @param list
	 * @return
	 */
	@Override
	@Transactional
	public int updateByBatch(List<IBDS_Module> moduleList) {
		int num = 0;
		if (CollectionUtils.isNotEmpty(moduleList)) {
			// 分批次处理，每次处理ProductConst.PRODUCT_COUNT条
			for (int count = 0; count < moduleList.size() / ProductConst.PRODUCT_COUNT; count++) {
				List<IBDS_Module> tmpmoduleList = moduleList.subList(count * ProductConst.PRODUCT_COUNT,
						(count + 1) * ProductConst.PRODUCT_COUNT);

				moduleMapper.updateByBatch(tmpmoduleList);
			}

			if (0 != moduleList.size() % ProductConst.PRODUCT_COUNT) {
				List<IBDS_Module> tmpmoduleList = moduleList.subList(
						moduleList.size() - (moduleList.size() % ProductConst.PRODUCT_COUNT), moduleList.size());

				moduleMapper.updateByBatch(tmpmoduleList);
			}

			num = moduleList.size();
		}
		return num;
		// return moduleMapper.updateByBatch(list);
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
		return moduleMapper.updateByStatusBatch(param);
	}

	@Override
	public List<IBDS_Module> selectByExample(IBDS_ModuleExample example) {
		return moduleMapper.selectByExample(example);
	}
}
