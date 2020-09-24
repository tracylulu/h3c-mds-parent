package com.h3c.mds.flowable.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.dao.PartCodeApplyMapper;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeApplyExample;
import com.h3c.mds.flowable.entity.PartExport;
import com.h3c.mds.flowable.service.PartCodeApplyService;
import com.h3c.mds.flowable.entity.PartExport;
import com.h3c.mds.flowable.dao.PartExportMapper;

/**
 * Part编码申请服务实现类
 */
@Service
public class PartCodeApplyServiceImpl implements PartCodeApplyService {

    @Autowired
    private PartCodeApplyMapper partCodeApplyMapper;
    @Autowired
    private PartExportMapper partExportMapper;

    @Override
    @Transactional(readOnly = true)
    public List<PartCodeApply> getByProcessCode(String applyCode) {
        PartCodeApplyExample example = new PartCodeApplyExample();
        PartCodeApplyExample.Criteria criteria = example.createCriteria();
        criteria.andProcessCodeEqualTo(applyCode);
        return partCodeApplyMapper.selectByExample(example);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<PartCodeApply> batchGetByProcessCodes(List<String> applyCodeList){
    	List<PartCodeApply> resPartCodeApplyList = new ArrayList<PartCodeApply>();
    	if(CollectionUtils.isNotEmpty(applyCodeList)){
    		for(int i = 0; i < applyCodeList.size(); i++){
    			List<PartCodeApply> tmpPartCodeApplyList = this.getByProcessCode(applyCodeList.get(i));
    			if(CollectionUtils.isNotEmpty(tmpPartCodeApplyList)){
    				resPartCodeApplyList.addAll(tmpPartCodeApplyList);
    			}
    		}
    	}
    	
        return resPartCodeApplyList;
    }

    @Override
    @Transactional
    public void update(PartCodeApply apply) {
        apply.setModifyDate(new Date());
        apply.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
        partCodeApplyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getZTCountByProductCode(String productCode) {
        return partCodeApplyMapper.getZTCountByProductCode(productCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PartCodeApply> getZTByProductCode(String productCode){
        return partCodeApplyMapper.getZTByProductCode(productCode);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<PartExport> getExportList(Map<String,Object> param){
    	return partExportMapper.getExportList(param);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getZTProcessCodeByProductCode(String productCode) {
        return partCodeApplyMapper.getZTProcessCodeByProductCode(productCode);
    }
}
