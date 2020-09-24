package com.h3c.mds.flowable.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.dao.ProjectCodeApplyMapper;
import com.h3c.mds.flowable.entity.ProjectCodeApply;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExample;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExample.Criteria;
import com.h3c.mds.flowable.service.ProjectCodeApplyService;

@Service
public class ProjectCodeServiceApplyImpl implements ProjectCodeApplyService {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectCodeServiceApplyImpl.class);
	
	@Autowired
	private ProjectCodeApplyMapper projectCodeApplyMapper;
	
	@Override
	public int addProjectCode(ProjectCodeApply projectCodeApply) {
		return projectCodeApplyMapper.insertSelectiveReturnId(projectCodeApply);
	}

	@Override
	public int updateProjectCode(ProjectCodeApply projectCodeApply) {
		ProjectCodeApplyExample example = new ProjectCodeApplyExample();
		Criteria criteria =   example.createCriteria();
		criteria.andProNumberEqualTo(projectCodeApply.getProNumber());
		criteria.andApplyNoEqualTo(projectCodeApply.getApplyNo());
		projectCodeApply.setId(null);
		return projectCodeApplyMapper.updateByExampleSelective(projectCodeApply, example);
	}

	@Override
	public int updateProjectCodeByApplyNoAndProName(ProjectCodeApply projectCodeApply){
//		projectCodeApply.setId(null);
//		ProjectCodeApplyExample example = new ProjectCodeApplyExample();
//		Criteria criteria =   example.createCriteria();
//		criteria.andApplyNoEqualTo(projectCodeApply.getApplyNo());
//		criteria.andProNameEqualTo(projectCodeApply.getProName());
//		return projectCodeApplyMapper.updateByExampleSelective(projectCodeApply, example);
		return projectCodeApplyMapper.updateByPrimaryKeySelective(projectCodeApply);
	}
	@Override
	public int delProjectCodeByApplyNoAndProjectCode(String projectCodeNo, String applyNo) {
		ProjectCodeApplyExample example = new ProjectCodeApplyExample();
		Criteria criteria =   example.createCriteria();
		criteria.andProNumberEqualTo(projectCodeNo);
		criteria.andApplyNoEqualTo(applyNo);
		return projectCodeApplyMapper.deleteByExample(example);
	}

	@Override
	public List<ProjectCodeApply> getProjectCodeApplyByProjectCode(String projectNum){
		ProjectCodeApplyExample example = new ProjectCodeApplyExample();
		Criteria criteria =   example.createCriteria();
		criteria.andProNumberEqualTo(projectNum);
		return projectCodeApplyMapper.selectByExample(example);
		
	}

	@Override
	public List<ProjectCodeApply> getProjectCodeApplyByBversionNo(String bversionNo){
		if(StringUtils.isNotBlank(bversionNo)){
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("bversionNo", bversionNo);
			return projectCodeApplyMapper.getProjectCodeApplyByBversionNo(param);
		}else{
			return null;
		}
		
	}
	
	
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public List<ProjectCodeApply> getProjectCodeApplyByReleaseNo(String releaseNo){
		if(StringUtils.isNotBlank(releaseNo)){
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("releaseNo", releaseNo);
			return projectCodeApplyMapper.getProjectCodeApplyByReleaseNo(param);			
		}else{
			return null;
		}
	}
	
	@Override
	public ProjectCodeApply getProjectCodeApplyByProjectName(String projectName) {
		ProjectCodeApplyExample example = new ProjectCodeApplyExample();
		Criteria criteria =   example.createCriteria();
		criteria.andProNameEqualTo(projectName);
		List<ProjectCodeApply> list = projectCodeApplyMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			LOG.error("项目名称:" + projectName + "数据有问题");
			return null;
		}
	}

	@Override
	public List<ProjectCodeApply> getProjectCodeApplyByApplyNo(String applyNo) {
		ProjectCodeApplyExample example = new ProjectCodeApplyExample();
		Criteria criteria =   example.createCriteria();
		criteria.andApplyNoEqualTo(applyNo);
		List<ProjectCodeApply> list = projectCodeApplyMapper.selectByExample(example);
		return list;
	}
}
