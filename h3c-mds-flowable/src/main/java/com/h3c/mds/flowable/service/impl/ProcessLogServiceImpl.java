package com.h3c.mds.flowable.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.dao.ProcessLogMapper;
import com.h3c.mds.flowable.entity.ProcessLog;
import com.h3c.mds.flowable.entity.ProcessLogExample;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.sysmgr.util.UserUtils;

@Service
public class ProcessLogServiceImpl implements ProcessLogService {

    @Autowired
    private ProcessLogMapper processLogMapper;

    @Override
    @Transactional
    public void create(ProcessLog log){
        log.setCreateDate(new Date());
        log.setCreateUser(UserUtils.getCurrentUserId());
        log.setModifyDate(new Date());
        log.setModifyUser(UserUtils.getCurrentUserId());
        processLogMapper.insertSelective(log);
    }

    @Override
    @Transactional
    public void createLog(Date checkDate, String checkPerson, String checkAccount, String checkResult, String checkOpion, String checkStatus, String processCode) {
        ProcessLog log = new ProcessLog();
        log.setCheckDate(checkDate);
        log.setCheckPerson(checkPerson);
        log.setCheckAccount(checkAccount);
        log.setCheckResult(checkResult);
        log.setCheckOpion(checkOpion);
        log.setCheckStatus(checkStatus);
        log.setProcessCode(processCode);
        create(log);
    }

    @Override
    @Transactional(readOnly=true)
    public List<ProcessLog> getByProcessCode(String processCode){
        ProcessLogExample example = new ProcessLogExample();
        ProcessLogExample.Criteria criteria = example.createCriteria();
        criteria.andProcessCodeEqualTo(processCode);
        example.setOrderByClause("CHECK_DATE");
        return processLogMapper.selectByExample(example);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<ProcessLog> getByProcessCodeForEip(String processCode){
       Map<String, Object> param = new HashMap<String, Object>();
       param.put("processCode", processCode);
        return processLogMapper.getByProcessCode(param);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProcessLog> getByProcessCodeAndCheckNode(String applyCode, String checkPerson) {
        ProcessLogExample example = new ProcessLogExample();
        ProcessLogExample.Criteria criteria = example.createCriteria();
        criteria.andProcessCodeEqualTo(applyCode);
        criteria.andCheckPersonEqualTo(checkPerson);
        return processLogMapper.selectByExample(example);
    }

    @Override
    @Transactional
    public void update(ProcessLog log) {
        log.setModifyUser(UserUtils.getCurrentUserId());
        log.setModifyDate(new Date());
        processLogMapper.updateByPrimaryKeySelective(log);
    }
}
