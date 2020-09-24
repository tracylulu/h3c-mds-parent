package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.flowable.dao.ProcessConfigPersonMapper;
import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.flowable.entity.ProcessConfigPersonExample;
import com.h3c.mds.flowable.service.ProcessConfigPersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 流程人员服务实现类
 */
@Service
public class ProcessConfigPersonServiceImpl implements ProcessConfigPersonService {

    @Autowired
    private ProcessConfigPersonMapper personMapper;

    //TODO 先按一人处理后续改为集合 组任务
    @Override
    @Transactional(readOnly = true)
    public ProcessConfigPerson getByProcessCodeAndRoleCode(String processCode, String roleCode){
        Map<String,Object> map = new HashMap<>();
        map.put("processCode",processCode);
        map.put("roleCode",roleCode);
        List<ProcessConfigPerson> list = personMapper.getByProcessCodeAndRoleCode(map);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }
    
    @Override
    @Transactional(readOnly = true)
    public  ProcessConfigPerson selectByPrimaryKey(int id) {
    	 return personMapper.selectByPrimaryKey(id);
    }
    
    @Override
    @Transactional
    public int create(ProcessConfigPerson processConfigPerson) {
    	
    	return personMapper.insertSelective(processConfigPerson);
    }
    
    @Override
    @Transactional
    public int update(ProcessConfigPerson processConfigPerson) {    	

    	return personMapper.updateByPrimaryKeySelective(processConfigPerson);
    }
    
    @Override
    @Transactional(readOnly = true)
    public int checkRepeat(Map<String,String> map) {
    	
    	return personMapper.checkRepeat(map);
    }

    @Override
    @Transactional(readOnly = true)
    public ProcessConfigPerson getCheckPerson(String processKey, String taskDefinitionKey, String applyDept) {
        ProcessConfigPersonExample example = new ProcessConfigPersonExample();
        ProcessConfigPersonExample.Criteria criteria = example.createCriteria();
        criteria.andProcessCodeEqualTo(processKey).andProcessRoleCodeEqualTo(taskDefinitionKey).andDeptCodeEqualTo(applyDept);
        List<ProcessConfigPerson> processConfigPeople = personMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(processConfigPeople)){
            return getByProcessCodeAndRoleCode(processKey, taskDefinitionKey);
        }else{
            return processConfigPeople.get(0);
        }
    }

    @Override
    public List<ProcessConfigPerson>  getAllCheckPersonByProcessCodeAndDeptNo(String processCode, String applyDept){
    	 ProcessConfigPersonExample example = new ProcessConfigPersonExample();
         ProcessConfigPersonExample.Criteria criteria = example.createCriteria();
         criteria.andDeptCodeEqualTo(applyDept);
         criteria.andProcessCodeEqualTo(processCode);
         return personMapper.selectByExample(example);
    }
}
