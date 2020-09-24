package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.IbdsProjectCodeRecommend;

public interface IbdsProjectCodeRecommendService {

	/**
	 * 新增推荐的项目编码
	 * @param projectCodeRecommend
	 * @return
	 */
	int addProjectCodeRecommend(IbdsProjectCodeRecommend projectCodeRecommend);
	
	/**
	 * 编辑推荐的项目编码 
	 * @param projectCodeRecommend
	 * @return
	 */
	int editProjectCodeRecommend(IbdsProjectCodeRecommend projectCodeRecommend);
	
	/**
	 * 删除推荐的项目编码
	 * @param projectCodeRecommend
	 * @return
	 */
	int delProjectCodeRecommend(IbdsProjectCodeRecommend projectCodeRecommend);
}
