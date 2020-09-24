package com.h3c.mds.flowable.service;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.entity.ProductCodeProcessExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;

import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * 产品编码流程服务
 * @author sYS2403
 *
 */
public interface ProductCodeProcessService {

    @Transactional
    void create(ProductCodeProcess process);

    @Transactional
    void update(ProductCodeProcess process);

    @Transactional(readOnly = true)
    ProductCodeProcess getById(Integer id);

    /**
     * 审核
     * @param id
     * @param params
     */
    @Transactional
    void check(Integer id, String taskId, Map<String, Object> params) throws Exception;

    PageInfo<ProductCodeProcess> findByPage(Integer page, Integer rows, String searchStr);

    ProductCodeProcess getByIdCasecadeSub(Integer id);

    @Transactional(readOnly = true)
    ProductCodeProcessExt getExtById(Integer id);

    /**
     * 把当前流程指派给指定用户
     * @param id
     * @param taskId
     * @param userId
     */
    void changeHandler(Integer id, String taskId, String userId);

    /**
     * 更新基本信息
     * @param id
     * @param taskId
     * @param params
     */
    void updateBaseInfo(Integer id, String taskId, Map<String, Object> params) throws Exception;

    @Transactional
    void synchronizeChange(ProductCodeProcessExt process);

    @Transactional
    void synchronizeAdd(ProductCodeProcessExt process);

    @Transactional
    void synchronizeDel(ProductCodeProcessExt process);

    @Transactional(readOnly = true)
    String getMaxCode();

    @Transactional(readOnly = true)
    void validateForm(ProductCodeProcessExt processExt);

    List<ProductCodeProcessExt> dataList(Map<String, String> searchMap);
    
    ProductCodeProcess getProductCodeProcessByApplyCode(String applyCode);
    
    void sendSyncDataEmail(String type, ProductCodeProcess productCodeProcess,String content, String subject, String taskId);

    void deleteById(Integer id);
}
