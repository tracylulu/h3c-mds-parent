package com.h3c.mds.basicinfo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.basicinfo.dao.view_DifficultyCoefficientApplyListMapper;
import com.h3c.mds.basicinfo.dao.view_ProductApplyListMapper;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficientApplyList;
import com.h3c.mds.basicinfo.entity.view_ProductApplyList;
import com.h3c.mds.basicinfo.service.view_ProductApplyListService;

@Service
public class view_ProductApplyListServiceImpl implements view_ProductApplyListService {

	@Autowired
	private view_ProductApplyListMapper productApplyListMapper;

	@Autowired
	private view_DifficultyCoefficientApplyListMapper difficultyCoefficientApplyListMapper;

	/**
	 * 通过参数获取流程数据
	 * 
	 * @param param
	 * @return
	 */

	@Override
	public List<view_ProductApplyList> getProductApplyList(Map<String, String> param) {
		return productApplyListMapper.getProductApplyList(param);
	}

	/**
	 * 查询难度系数
	 * 
	 * @param param
	 * @return
	 */
	public List<view_DifficultyCoefficientApplyList> getDifficultyCoefficientApplyList(Map<String, Object> param) {
		return difficultyCoefficientApplyListMapper.getDifficultyCoefficientApplyList(param);
	}

	/**
	 * 分页方法
	 * 
	 * @param pageNum
	 *            当前页
	 * @param pageSize
	 *            每页数据量
	 * @return
	 */
	@Override
	public PageInfo<view_ProductApplyList> pageOfProductApplyDataGridList(int pageNum, int pageSize,
			Map<String, Object> param) {
		PageHelper.startPage(pageNum, pageSize);
		List<view_ProductApplyList> lst = productApplyListMapper.getProductApplyDataGridList(param);
		PageInfo<view_ProductApplyList> pageInfo = new PageInfo<view_ProductApplyList>(lst);

		return pageInfo;
	}

}
