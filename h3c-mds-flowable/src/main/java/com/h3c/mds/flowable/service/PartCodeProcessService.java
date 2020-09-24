package com.h3c.mds.flowable.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartCodeProcessExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;

/**
 * Part编码流程接口类
 */
public interface PartCodeProcessService {

    PageInfo<PartCodeProcess> findByPage(Integer page, Integer rows, Map<String,Object> param);

    PartCodeProcessExt getByIdCasecadeSub(Integer id);

    @Transactional(readOnly = true)
    PartCodeProcessExt getExtById(Integer id);

    void create(PartCodeProcessExt processExt);

    void update(PartCodeProcessExt processExt);

    String getMaxApplyCode();
    
    List<Map<String, Object>> findPartCodeByCurHandler( Map<String,Object> param);
    
    List<Map<String, Object>> findPartCodeByApplyer(Map<String, Object> param);
    
    List<Map<String, Object>> findPartCodeByStatus(Map<String, Object> param);
    
    PageInfo<List<Map<String, Object>>> findPartCodeByCloseProcess(Integer page, Integer rows, String searchParam);

    void check(Integer id, String taskId, Map<String, Object> params) throws Exception;

    PartCodeProcess getById(Integer id);

    void changeHandler(Integer id, String taskId, String userId);

    @Transactional
    void updateEntity(PartCodeProcess process);

    void endProcess(Integer id, String taskId);
    
    PartCodeProcess getByApplyNo(String applyNo);
    
    void sendSyncDataEmail(String type, PartCodeProcess partCodeProcess,String content, String subject, String taskId);

    void validateForm(PartCodeProcessExt processExt);
    
    /**
     * 获取所有的未完成的part流程
     * @return
     */
    List<PartCodeProcess> getAllNotCompletePartCodeProcess();
    /**
     * 同步到财务参考信息
     * @param applyNo
     */
    void updateFinance(String applyNo);

    void deleteById(Integer id);
    
    public List<PartCodeProcess> getPartCodeProcessbyPdmCode(String pdmCode);
    
    public void syncOldPdmData(String pdmStrs);
}
