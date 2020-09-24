package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.dao.ReleaseViewMapper;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.entity.ReleaseViewExample;
import com.h3c.mds.product.service.ReleaseViewService;

@Service
public class ReleaseViewServiceImpl implements ReleaseViewService {

	@Autowired
	private ReleaseViewMapper releaseViewMapper;

	/**
	 * 根据参数获取R版本树形列表
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public List<ReleaseView> getPDT(Map<String, Object> param) {
		return releaseViewMapper.getPDT(param);
	}

	/**
	 * 根据参数获取R版本树形列表 父级不显示多列
	 * 
	 * @param param
	 * @return
	 */
	@Override
	public List<ReleaseView> getRelease(Map<String, Object> param) {
		return releaseViewMapper.getRelease(param);
	}

	@Override
	public List<ReleaseView> getTreeDataForFlowable(Map<String, Object> param) {
		return releaseViewMapper.getTreeDataForFlowable(param);
	}

	/**
	 * 根据内码获取右侧属性列表 selectByCode 方法名必须按这个命名
	 * 
	 * @param code
	 * @return 返回的类型必须是Map<String, String>
	 */
	@Override
	public ReleaseView selectByCode(String code) {
		return releaseViewMapper.selectByCode(code);
	}

	public List<ReleaseView> selectByExample() {
		ReleaseViewExample example = new ReleaseViewExample();
		return releaseViewMapper.selectByExample(example);
	}

	public List<ReleaseView> getSoftware(Map<String, Object> param) {
		return releaseViewMapper.getSoftware(param);
	}

}
