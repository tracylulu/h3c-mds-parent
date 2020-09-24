package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.finance.exception.FinanceException;
import com.h3c.mds.flowable.dao.ProcessConfigItemMapper;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.entity.ProcessConfigItemExample;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.sysmgr.util.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 流程配置明细服务实现类
 */
@Service
public class ProcessConfigItemServiceImpl implements ProcessConfigItemService {

    @Autowired
    private ProcessConfigItemMapper itemMapper;

    @Override
    @Transactional
    public void create(ProcessConfigItem processConfigItem){
        processConfigItem.setCreateDate(new Date());
        processConfigItem.setCreateUser((String) UserUtils.getCurrentUserId());
        processConfigItem.setModifyDate(new Date());
        processConfigItem.setModifyUser((String) UserUtils.getCurrentUserId());
        itemMapper.insertSelective(processConfigItem);
    }

    @Override
    @Transactional
    public void update(ProcessConfigItem processConfigItem){
        processConfigItem.setModifyUser((String) UserUtils.getCurrentUserId());
        processConfigItem.setModifyDate(new Date());
        itemMapper.updateByPrimaryKeySelective(processConfigItem);
    }

    @Override
    @Transactional(readOnly = true)
    public ProcessConfigItem getByConfigCodeAndCode(String configCode, String code){
        Map<String,Object> map = new HashMap<>();
        map.put("configCode", configCode);
        map.put("code", code);
        return itemMapper.getByConfigCodeAndCode(map);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getListByConfigCodeAndCode(String configCode,String code){
        ProcessConfigItemExample example = new ProcessConfigItemExample();
        ProcessConfigItemExample.Criteria criteria = example.createCriteria();
        criteria.andConfigCodeEqualTo(configCode);
        criteria.andCodeEqualTo(code);
        return itemMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getByConfigCode(String configCode) {
    	Map<String,Object> map = new HashMap<>();
        map.put("configCode", configCode);
        return itemMapper.getByConfigCode(map);
      
    }
    
    @Override
    @Transactional(readOnly = true)
    public String getMaxCode() {    	
    	return	itemMapper.getMaxCode();
    }

    @Override
    @Transactional(readOnly = true)
    public ProcessConfigItem getByPdtCode(String pdtno) {
        ProcessConfigItemExample example = new ProcessConfigItemExample();
        ProcessConfigItemExample.Criteria criteria = example.createCriteria();
        criteria.andPdtCodeEqualTo(pdtno);
        List<ProcessConfigItem> processConfigItems = itemMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(processConfigItems)){
            return null;
        }else if(processConfigItems.size() == 1){
            return processConfigItems.get(0);
        }else {
            throw new FinanceException("存在相同的PDT内码数据："+pdtno+"，请联系管理员修改数据");
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getPdtList(boolean hasPdtCode){
        ProcessConfigItemExample example = new ProcessConfigItemExample();
        ProcessConfigItemExample.Criteria criteria = example.createCriteria();
        if(hasPdtCode){
            criteria.andPdtCodeIsNotNull();
        }else{
            criteria.andPdtCodeIsNull();
        }
        criteria.andConfigCodeEqualTo("processPDT");
        criteria.andStateEqualTo(1);
        return itemMapper.selectByExample(example);
    }

    @Override
    @Transactional
    public ProcessConfigItem getById(Integer id) {
        return itemMapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<ProcessConfigItem> getAddPageList(Map<String,String> param){
    	return itemMapper.getAddPageList(param);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getByContent(String content) {
        ProcessConfigItemExample example = new ProcessConfigItemExample();
        ProcessConfigItemExample.Criteria criteria = example.createCriteria();
        criteria.andContentEqualTo(content);
        return itemMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getByProdlineId(Integer prolineId){
        return itemMapper.getByProdlineId(prolineId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getByProdlineName(String prodlineName){
        return itemMapper.getByProdlineName(prodlineName);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getByProdlineIdFromBase(Integer prodlineId) {
        return itemMapper.getByProdlineIdFromBase(prodlineId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessConfigItem> getByProdlineCodeFromBase(String prodlineCode) {
        return itemMapper.getByProdlineCodeFromBase(prodlineCode);
    }
}
