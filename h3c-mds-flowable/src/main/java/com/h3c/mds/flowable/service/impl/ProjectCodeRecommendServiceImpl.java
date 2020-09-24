package com.h3c.mds.flowable.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.dao.ProjectCodeRecommendMapper;
import com.h3c.mds.flowable.dao.ProjectcodeRecommendViewMapper;
import com.h3c.mds.flowable.entity.ProjectCodeRecommend;
import com.h3c.mds.flowable.entity.ProjectCodeRecommendExample;
import com.h3c.mds.flowable.entity.ProjectCodeRecommendExample.Criteria;
import com.h3c.mds.flowable.service.ProjectCodeRecommendService;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.service.IBDS_PDTService;

@Service
public class ProjectCodeRecommendServiceImpl implements ProjectCodeRecommendService {

	
	private static final Logger LOG = LoggerFactory.getLogger(ProjectCodeRecommendServiceImpl.class);
	
	@Autowired
	private ProjectCodeRecommendMapper projectCodeRecommendMapper;
	@Autowired
	private ProjectcodeRecommendViewMapper projectcodeRecommendViewMapper;
	
	@Autowired
	private IBDS_PDTService ibdsPDTService;
	
	@Override
	public List<ProjectCodeRecommend> pageOfProjectCodeRecommend(String proName, String bversionName, String pdtNo) {
		ProjectCodeRecommendExample example = new ProjectCodeRecommendExample();
		Criteria criteria = example.createCriteria();
		// TODO 测试
//		criteria.andProNameEqualTo(proName);
//		criteria.andBversionNameEqualTo(bversionName);
		criteria.andPdtNoEqualTo(pdtNo);
		List<ProjectCodeRecommend> resList = projectCodeRecommendMapper.selectByExample(example);
		return resList;
	}


	@Override
	public ProjectCodeRecommend getProjectCodeRecommendByPdtNo(String pdtNo) {
		
		ProjectCodeRecommendExample example = new ProjectCodeRecommendExample();
		Criteria criteria = example.createCriteria();
		criteria.andPdtNoEqualTo(pdtNo);
//		criteria.andStatusEqualTo(ProductConst.STATUS_ON);
		List<ProjectCodeRecommend> resList = projectCodeRecommendMapper.selectByExample(example);
		if(resList != null && resList.size() == 1){
			return resList.get(0);
		}else{
			LOG.error("pdtNo : " + pdtNo + "数据有问题");
			return null;
		}
	}


	@Override
	public int updateProjectCodeNumberByPdtNo(String pdtNo, String projectCode) {
		//更新就是把项目编码加1
		ProjectCodeRecommend projectCodeRecommend = getProjectCodeRecommendByPdtNo(pdtNo);
		if(StringUtils.isNoneBlank(projectCode)){
			if(projectCodeRecommend != null){
				
				if(StringUtils.isNotBlank(projectCodeRecommend.getProNumber())){
					int oldProNumber = Integer.parseInt(projectCodeRecommend.getProNumber());
					int curProNumber = Integer.parseInt(projectCode);
				
					if(oldProNumber == curProNumber){
						projectCodeRecommend.setProNumber(String.valueOf(Integer.parseInt(projectCode) + 1));
					}
					
				}else{
					projectCodeRecommend.setProNumber(String.valueOf(Integer.parseInt(projectCode) + 1));
				}
										
			}
		}
		if(projectCodeRecommend != null){
			return projectCodeRecommendMapper.updateByPrimaryKey(projectCodeRecommend);			
		}else{
			return 0;
		}
	}
	
	@Override
	public int updateProjectCodeRecommend(ProjectCodeRecommend projectCodeRecommend){
		
		return projectCodeRecommendMapper.updateByPrimaryKeySelective(projectCodeRecommend);
	}
	
	@Override
	public PageInfo<ProjectCodeRecommend> listRecommendProjectCode(Integer page, Integer rows, String searchStr){
		if(page == null || page < 1){
            page = 1;
        }
        if(rows == null || rows <15){
            rows = 15;
        }
		PageHelper.startPage(page, rows);
		ProjectCodeRecommendExample example = new ProjectCodeRecommendExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(ProductConst.STATUS_ON);
		List<ProjectCodeRecommend> resList = projectCodeRecommendMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(resList)){
			for(int i = 0; i < resList.size(); i++){
				IBDS_PDT pdt =  ibdsPDTService.selectByCode(resList.get(i).getPdtNo());
				 String pdtName = "";
				 if(pdt != null){
					 pdtName = pdt.getPdt();
				 }
				if(StringUtils.isNotBlank(pdtName)){
					resList.get(i).setPdtName(pdtName);					
				}
			}
		}
		PageInfo<ProjectCodeRecommend> pageInfo = new PageInfo<ProjectCodeRecommend>(resList);
		return pageInfo;
	}
	@Override
	public List<Map<String, Object>> treeRecommendProjectCode(Map<String, Object> param){
		return projectcodeRecommendViewMapper.treeRecommendProjectCode(param);
	}
	public ProjectCodeRecommend getProjectCodeRecommendById(Integer id){
		return projectCodeRecommendMapper.selectByPrimaryKey(id);
	}
}
