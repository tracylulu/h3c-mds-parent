package com.h3c.mds.product.service;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.view_StopUsingProducts;
import java.util.Map;
import java.util.List;

public interface view_StopUsingProductsService {
	
	/**
	 * 分页方法
	 * @param pageNum  当前页
	 * @param pageSize 每页数据量
	 * @param searchStr 查询条件
	 * @param proType 产品类型
	 * @return
	 */
	PageInfo<view_StopUsingProducts>  pageOfStopUsingProducts(int pageNum, int pageSize, String searchStr, String proType);

	
	/**
	 * 查询树表格
	 * @param param
	 * @return
	 */
	List<view_StopUsingProducts> selectTreeGrid(Map<String,String> param);
	

}
