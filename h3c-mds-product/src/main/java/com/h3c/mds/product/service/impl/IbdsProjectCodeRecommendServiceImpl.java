package com.h3c.mds.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.dao.IbdsProjectCodeRecommendMapper;
import com.h3c.mds.product.entity.IbdsProjectCodeRecommend;
import com.h3c.mds.product.entity.IbdsProjectCodeRecommendExample;
import com.h3c.mds.product.entity.IbdsProjectCodeRecommendExample.Criteria;
import com.h3c.mds.product.service.IbdsProjectCodeRecommendService;

@Service
public class IbdsProjectCodeRecommendServiceImpl implements IbdsProjectCodeRecommendService{

	@Autowired
	private IbdsProjectCodeRecommendMapper projectCodeRecommendMapper;
	
	@Override
	public int addProjectCodeRecommend(IbdsProjectCodeRecommend projectCodeRecommend) {
		projectCodeRecommend.setId(null);
		int successNum = projectCodeRecommendMapper.insertSelective(projectCodeRecommend);
		return successNum;
	}

	@Override
	public int editProjectCodeRecommend(IbdsProjectCodeRecommend projectCodeRecommend){
		IbdsProjectCodeRecommendExample example = new IbdsProjectCodeRecommendExample();
		Criteria criteria= example.createCriteria();
		criteria.andPdtNoEqualTo(projectCodeRecommend.getPdtNo());
		return projectCodeRecommendMapper.updateByExampleSelective(projectCodeRecommend, example);
	}
	
	@Override
	public  int delProjectCodeRecommend(IbdsProjectCodeRecommend projectCodeRecommend){
		IbdsProjectCodeRecommendExample example = new IbdsProjectCodeRecommendExample();
		Criteria criteria= example.createCriteria();
		criteria.andPdtNoEqualTo(projectCodeRecommend.getPdtNo());
		return projectCodeRecommendMapper.deleteByExample(example);
	}
}
