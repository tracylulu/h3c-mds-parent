package com.h3c.mds.sysmgr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.sysmgr.dao.RoleResourceRelationMapper;
import com.h3c.mds.sysmgr.entity.RoleResourceRelation;
import com.h3c.mds.sysmgr.entity.RoleResourceRelationExample;
import com.h3c.mds.sysmgr.entity.RoleResourceRelationExample.Criteria;
import com.h3c.mds.sysmgr.service.RoleResourceRelationService;

@Service
public class RoleResourceRelationServiceImpl implements RoleResourceRelationService{
	
	@Autowired
	private RoleResourceRelationMapper mapper;

	@Override
	public int create(RoleResourceRelation relation) {
		return mapper.insertSelective(relation);
	}

	@Override
	public int updateRoleResourceRelation(
			RoleResourceRelation roleResourceRelation) {
	
		return mapper.updateByPrimaryKeySelective(roleResourceRelation);
	}

	@Override
	public PageInfo<RoleResourceRelation> pageOfRoleResourceRelation(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		// TODO
		return null;
	}

	@Override
	public int deleteRoleResourceRelationByRoleCode(String roleCode) {
		RoleResourceRelationExample example = new RoleResourceRelationExample();
		Criteria criteria = example.createCriteria();
		criteria.andHrrrHrlCodeEqualTo(roleCode);
		return mapper.deleteByExample(example);
	}

	@Override
	@Transactional
	public void batchCreate(List<RoleResourceRelation> list) {
		if(!CollectionUtils.isEmpty(list)){
			for (RoleResourceRelation roleResourceRelation : list) {
				if(roleResourceRelation == null) continue;
				create(roleResourceRelation);
			}
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<String> getResourceCodesByRoleCode(String roleCode) {
		return mapper.getResourceCodesByRoleCode(roleCode);
	}

	@Override
	@Transactional
	public void deleteByRoleCode(String roleCode) {
		mapper.deleteByRoleCode(roleCode);
	}

	@Override
	@Transactional
	public void distributionResourceForRole(String roleCode,
			List<RoleResourceRelation> list) {
		deleteByRoleCode(roleCode);
		batchCreate(list);
	}

}
