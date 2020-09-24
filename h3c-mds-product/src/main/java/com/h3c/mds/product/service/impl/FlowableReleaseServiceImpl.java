package com.h3c.mds.product.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.dao.IBDS_ReleaseMapper;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.service.FlowableReleaseService;
import com.h3c.mds.product.service.ReleaseViewService;

@Service
public class FlowableReleaseServiceImpl implements FlowableReleaseService {

	@Autowired
	private ReleaseViewService releaseViewService;
	
	@Autowired
	private IBDS_ReleaseMapper ibds_ReleaseMapper;
	
	@Override
	public ReleaseView getAllProductLineByReleaseNo(String releaseNo) {
		return releaseViewService.selectByCode(releaseNo);
	}

	@Override
	public IBDS_Release getReleaseByName(String releaseName){
		IBDS_Release release = null;
		IBDS_ReleaseExample example = new IBDS_ReleaseExample();
		IBDS_ReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andReleaseEqualTo(releaseName);
		List<IBDS_Release> list = ibds_ReleaseMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)){
			if(list.size() == 1){
				release =  list.get(0);
			}else{
				criteria.andStatusEqualTo("1");
				list = ibds_ReleaseMapper.selectByExample(example);
				if(CollectionUtils.isNotEmpty(list)){
					release = list.get(0);
				}else{
					if(list.size() > 0){
						throw new RuntimeException("R版本数据有问题" + releaseName);
					}
				}
			}
		}
		return release;
	}
}
