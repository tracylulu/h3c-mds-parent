package com.h3c.mds.flowable.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.ProjectCodeRecommend;

/**
 * 
 * @author l20095
 *
 */
public interface ProjectCodeRecommendService {

	public List<ProjectCodeRecommend> pageOfProjectCodeRecommend(String proName, String bversionName, String pdtNo);
	
	
	public ProjectCodeRecommend getProjectCodeRecommendByPdtNo(String pdtNo);
	
	//更新项目编码
	public int updateProjectCodeNumberByPdtNo(String pdtNo, String projectCode);
	
	
	public int updateProjectCodeRecommend(ProjectCodeRecommend projectCodeRecommend);
	
	
	PageInfo<ProjectCodeRecommend> listRecommendProjectCode(Integer page, Integer rows, String searchStr);
	
	List<Map<String, Object>> treeRecommendProjectCode(Map<String, Object> param);
	
	public ProjectCodeRecommend getProjectCodeRecommendById(Integer id);
}
