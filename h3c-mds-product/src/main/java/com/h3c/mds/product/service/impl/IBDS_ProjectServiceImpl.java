package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDSProjectMapper;
import com.h3c.mds.product.dao.ProjectViewMapper;
import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDSProjectExample;
import com.h3c.mds.product.entity.IBDSProjectExample.Criteria;
import com.h3c.mds.product.entity.ProjectView;
import com.h3c.mds.product.service.IBDS_ProjectService;

@Service
public class IBDS_ProjectServiceImpl implements IBDS_ProjectService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_ProjectServiceImpl.class);
	@Autowired
	private ProjectViewMapper projectViewMapper;
	
	@Autowired
	private IBDSProjectMapper  ibdsProjectMapper;
	@Override
	@Transactional(readOnly = true)
	public List<ProjectView> getTreeData(Map<String, String> param) {
		List<ProjectView> projectTreeData = null;
		try {
			projectTreeData = projectViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return projectTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public ProjectView selectByCode(String code) {
		return projectViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addIBDSProject(IBDSProject project) {
		return ibdsProjectMapper.insertSelective(project);
	}

	@Override
	@Transactional
	public int editIBDSProject(IBDSProject project) {
		project.setId(null);
		IBDSProjectExample example = new IBDSProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjectnoEqualTo(project.getProjectno());
		IBDSProject oldProject = this.getProjectByCode(project.getProjectno());
		//处理曾用名
		if(oldProject != null && project.getProject() != null && !project.getProject().equals(oldProject.getProject())){
			if(StringUtils.isNotBlank(oldProject.getProjectold())){
				project.setProjectold(oldProject.getProject()+ ";" + oldProject.getProjectold());
				
			}else{
				project.setProjectold(oldProject.getProject());
			}
		}
		return ibdsProjectMapper.updateByExampleSelective(project, example);
	}

	@Override
	@Transactional
	public int updateIBDSProject(IBDSProject project){
		project.setId(null);
		IBDSProjectExample example = new IBDSProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjectnoEqualTo(project.getProjectno());
		return ibdsProjectMapper.updateByExampleSelective(project, example);
	}
	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = projectViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错");
		}
		if(maxCode == null){
			maxCode = ProductConst.PROJECT_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2,maxCode.length()))+1;
	    String valStr = String.valueOf(val);
	    String code = ProductConst.PROJECT_CODE_PREFIX;
	    for(int i = 0;i<ProductConst.CODECONST-valStr.length();i++){
	        code += "0";
	    }
	    code += valStr;
	    return code;
	}
	
	@Override
	@Transactional(readOnly = true)
	public IBDSProject getProjectByCode(String code){
		IBDSProjectExample example = new IBDSProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjectnoEqualTo(code);
		List<IBDSProject> projectList = ibdsProjectMapper.selectByExample(example);
		
		if(projectList != null && projectList.size() == 1){
			return projectList.get(0);
		}else{
//			LOG.error("项目内码: " + code + " 数据有问题 ");
			return null;
		}
	}

	
	@Override
	@Transactional
	public IBDSProject getProjectByCoaCode(String coaCode){
		
		IBDSProjectExample example = new IBDSProjectExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjectcoacodeEqualTo(coaCode);
		List<IBDSProject> projectList = ibdsProjectMapper.selectByExample(example);
		
		if(projectList != null && projectList.size() == 1){
			return projectList.get(0);
		}else{
			LOG.error("项目内码: " + coaCode + "数据有问题");
			return null;
		}
	}
	
	@Override
	public List<IBDSProject> selectByExample(IBDSProjectExample example){
		return ibdsProjectMapper.selectByExample(example);
	}
	
	/**
	 * 获取当前R及R下属B层级的研发项目
	 * @param releaseno
	 * @return
	 */
	@Override
	public List<IBDSProject> getCurrentRAndChildBProject(String releaseno){
		Map<String,String> param=new HashMap<>();
		param.put("release", releaseno);
		return ibdsProjectMapper.getCurrentRAndChildBProject(param);
	}
}
