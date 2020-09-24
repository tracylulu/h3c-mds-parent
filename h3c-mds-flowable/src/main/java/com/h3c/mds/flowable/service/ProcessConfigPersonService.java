package com.h3c.mds.flowable.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.entity.ProcessConfigPerson;

/**
 * 流程人员服务接口类
 */
public interface ProcessConfigPersonService {
    //TODO 先按一人处理后续改为集合 组任务
    @Transactional(readOnly = true)
    ProcessConfigPerson getByProcessCodeAndRoleCode(String processCode, String roleCode);
    
    ProcessConfigPerson selectByPrimaryKey(int id);
    
    int create(ProcessConfigPerson processConfigPerson);

    int update(ProcessConfigPerson processConfigPerson);
    
    int checkRepeat(Map<String,String> map);

    /**
     * 获取审核人
     * @param processKey 流程编号
     * @param taskDefinitionKey 任务编号
     * @param applyDept 申请部门
     * @return
     */
    ProcessConfigPerson getCheckPerson(String processKey, String taskDefinitionKey, String applyDept);
    
   /**
    * 通过流程类型和部门类型获取所有审批人
    * @param processCode
    * @param applyDept
    * @return
    */
    List<ProcessConfigPerson>  getAllCheckPersonByProcessCodeAndDeptNo(String processCode, String applyDept);
}
