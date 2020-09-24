package com.h3c.mds.product.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.product.entity.ReleaseView;

public interface ReleaseViewService {
	/**
	 * 根据参数获取R版本树形列表
	 * 
	 * @param param
	 * @return
	 */
	public List<ReleaseView> getPDT(Map<String, Object> param);

	/**
	 * 根据参数获取R版本树形列表 父级不显示多列
	 * 
	 * @param param
	 * @return
	 */
	public List<ReleaseView> getRelease(Map<String, Object> param);

	/**
	 * 根据参数获取R版本树形列表 项目编码申请页面调用
	 * 
	 * @param param
	 * @return
	 */
	public List<ReleaseView> getTreeDataForFlowable(Map<String, Object> param);

	// /**
	// * 根据内码获取右侧属性列表 selectByCode 方法名必须按这个命名
	// *
	// * @param code
	// * @return 返回的类型必须是Map<String, String>
	// */
	// public Map<String, String> selectByCode(String code);

	/**
	 * 根据内码获取右侧属性列表 selectByCode 方法名必须按这个命名
	 * 
	 * @param code
	 * @return 返回的类型必须是Map<String, String>
	 */
	public ReleaseView selectByCode(String code);

	public List<ReleaseView> selectByExample();

	public List<ReleaseView> getSoftware(Map<String, Object> param);
}
