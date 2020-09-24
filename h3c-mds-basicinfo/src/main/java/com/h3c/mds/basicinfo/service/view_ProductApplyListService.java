package com.h3c.mds.basicinfo.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientApplyList;
import com.h3c.mds.basicinfo.entity.view_ProductApplyList;

public interface view_ProductApplyListService {
	/**
	 * 通过参数获取流程数据
	 * 
	 * @param param
	 * @return
	 */
	List<view_ProductApplyList> getProductApplyList(Map<String, String> param);

	/**
	 * 查询难度系数
	 * 
	 * @param param
	 * @return
	 */
	List<view_DifficultyCoefficientApplyList> getDifficultyCoefficientApplyList(Map<String, Object> param);

	/**
	 * 分页方法
	 * 
	 * @param pageNum
	 *            当前页
	 * @param pageSize
	 *            每页数据量
	 * @return
	 */
	PageInfo<view_ProductApplyList> pageOfProductApplyDataGridList(int pageNum, int pageSize,
			Map<String, Object> param);
}
