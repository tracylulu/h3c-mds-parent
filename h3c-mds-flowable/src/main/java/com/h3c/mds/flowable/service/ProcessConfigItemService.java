package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 流程配置明细服务接口类
 */
public interface ProcessConfigItemService {
    @Transactional
    void create(ProcessConfigItem processConfigItem);

    @Transactional
    void update(ProcessConfigItem processConfigItem);

    @Transactional(readOnly = true)
    ProcessConfigItem getByConfigCodeAndCode(String configCode, String code);

    @Transactional(readOnly = true)
    List<ProcessConfigItem> getListByConfigCodeAndCode(String configCode, String code);

    /**
     * 根据配置表编号获取配置明细
     * @param configCode
     * @return
     */
    List<ProcessConfigItem> getByConfigCode(String configCode);
    
    /**
     * 获取最大编码
     * @return
     */
    String getMaxCode();

    ProcessConfigItem getByPdtCode(String pdtno);

    @Transactional(readOnly = true)
    List<ProcessConfigItem> getPdtList(boolean hasPdtCode);

    ProcessConfigItem getById(Integer id);
    
    List<ProcessConfigItem> getAddPageList(Map<String,String> param);

    List<ProcessConfigItem> getByContent(String readCellValue);

    /**
     * 根据产品线id获取pdt
     * @param prodlineId
     * @return
     */
    List<ProcessConfigItem> getByProdlineId(Integer prodlineId);

    @Transactional(readOnly = true)
    List<ProcessConfigItem> getByProdlineName(String prodlineName);

    /**
     * 根据产品线id关联研发基本信息获取pdt
     * @param prodlineId
     * @return
     */
    List<ProcessConfigItem> getByProdlineIdFromBase(Integer prodlineId);


    List<ProcessConfigItem> getByProdlineCodeFromBase(String prodlineCode);
}
