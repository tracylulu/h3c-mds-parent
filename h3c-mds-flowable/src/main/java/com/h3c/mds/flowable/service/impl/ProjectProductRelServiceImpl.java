package com.h3c.mds.flowable.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.flowable.dao.ProjectProductRelMapper;
import com.h3c.mds.flowable.entity.ProjectProductRel;
import com.h3c.mds.flowable.entity.ProjectProductRelExample;
import com.h3c.mds.flowable.entity.ProjectProductRelExample.Criteria;
import com.h3c.mds.flowable.service.ProjectProductRelService;

@Service
public class ProjectProductRelServiceImpl implements ProjectProductRelService {

	
	@Autowired
	private ProjectProductRelMapper  projectProductRelMapper;
	
	
	
	@Override
	public int addProjectProductRel(ProjectProductRel projectProductRel) {
		return projectProductRelMapper.insertSelective(projectProductRel);
	}

	@Override
	public int updateProjectProductRelByPrimary(ProjectProductRel projectProductRel) {
		return projectProductRelMapper.updateByPrimaryKey(projectProductRel);
	}

	@Override
	public int delProjectProductRel(Integer projectCodeId) {
		ProjectProductRelExample example = new ProjectProductRelExample();
		Criteria criteria = example.createCriteria();
//		criteria.andProjNoEqualTo(projectCodeNum);
		criteria.andProjectCodeIdEqualTo(projectCodeId);
		return projectProductRelMapper.deleteByExample(example);
	}

	@Override
	public List<ProjectProductRel> getProjectProductRelByProjectCode(String projectCode) {
		ProjectProductRelExample example = new ProjectProductRelExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjNoEqualTo(projectCode);
		return projectProductRelMapper.selectByExample(example);
	}

	@Override
	public List<ProjectProductRel> getProjectProductRelByPId(Integer id){
		ProjectProductRelExample example = new ProjectProductRelExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjectCodeIdEqualTo(id);
		return projectProductRelMapper.selectByExample(example);
	}
}
