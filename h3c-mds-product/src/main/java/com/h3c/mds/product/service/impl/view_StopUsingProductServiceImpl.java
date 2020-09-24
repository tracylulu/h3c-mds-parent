package com.h3c.mds.product.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.h3c.mds.product.entity.view_StopUsingProducts;
import com.h3c.mds.product.entity.view_StopUsingProductsExample;
import com.h3c.mds.product.service.view_StopUsingProductsService;
import com.h3c.mds.product.dao.view_StopUsingProductsMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.github.pagehelper.*;

@Service
public class view_StopUsingProductServiceImpl  implements view_StopUsingProductsService{
	
	@Autowired 
	private view_StopUsingProductsMapper stopUsingProductsMapper;
	
	@Override
	@Transactional(readOnly = true)
	public PageInfo<view_StopUsingProducts> pageOfStopUsingProducts(int pageNum,int pageSize , String searchStr, String proType){
		PageHelper.startPage(pageNum, pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchStr", searchStr);
		map.put("proType", proType);
		List<view_StopUsingProducts> lst=stopUsingProductsMapper.findByPage(map);
		PageInfo<view_StopUsingProducts> pageInfo = new PageInfo<view_StopUsingProducts>(lst);

		return pageInfo;
	}
	
	
	public List<view_StopUsingProducts> selectGrid(Map<String,String> param){
		
		return stopUsingProductsMapper.selectGrid(param);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<view_StopUsingProducts> selectTreeGrid(Map<String,String> param){
		
		return  stopUsingProductsMapper.selectTreeGrid(param);
	}

}
