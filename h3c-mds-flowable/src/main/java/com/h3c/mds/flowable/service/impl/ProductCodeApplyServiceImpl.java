package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.flowable.dao.ProductCodeApplyMapper;
import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.entity.ProductCodeApplyExample;
import com.h3c.mds.flowable.service.ProductCodeApplyService;
import com.h3c.mds.sysmgr.util.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 产品编码申请服务实现类
 */
@Service
public class ProductCodeApplyServiceImpl implements ProductCodeApplyService {

    @Autowired
    private ProductCodeApplyMapper productCodeApplyMapper;

    /**
     * 创建产品编码子表单数据
     * @param productCodeApply
     */
    @Override
    @Transactional
    public void create(ProductCodeApply productCodeApply){
        productCodeApply.setCreateDate(new Date());
        productCodeApply.setCreateUser(UserUtils.getCurrentUserId());
        productCodeApply.setModifyDate(new Date());
        productCodeApply.setModifyUser(UserUtils.getCurrentUserId());
        productCodeApplyMapper.insertSelective(productCodeApply);
    }

    /**
     * 更新产品编码申请信息
     * @param productCodeApply
     */
    @Override
    @Transactional
    public void update(ProductCodeApply productCodeApply){
        productCodeApply.setModifyDate(new Date());
        productCodeApply.setModifyUser(UserUtils.getCurrentUserId());
        productCodeApplyMapper.updateByPrimaryKeySelective(productCodeApply);
    }

    /**
     * 根据流程申请编号获取子表单id集合
     * @param processCode   申请编号
     * @return  ids id集合
     */
    @Override
    @Transactional(readOnly = true)
    public List<Integer> getIdsByProcessCode(String processCode){
        return productCodeApplyMapper.getIdsByProcessCode(processCode);
    }

    /**
     * 根据id删除数据
     * @param id
     */
    @Override
    @Transactional
    public void deleteById(Integer id){
        productCodeApplyMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据流程申请编号获取子表单集合
     * @param applyCode
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<ProductCodeApply> getByProcessCode(String applyCode) {
        return productCodeApplyMapper.getByProcessCode(applyCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductCodeApply> getZTByProductCode(String productCode) {
        return productCodeApplyMapper.getZTByProductCode(productCode);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getZTCountByProductCode(String productCode) {
        return productCodeApplyMapper.getZTCountByProductCode(productCode);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getZTCountByBomCode(String bomCode){
        return productCodeApplyMapper.getZTCountByBomCode(bomCode);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getZTCountByOldProductCode(String oldProductCode) {
        return productCodeApplyMapper.getZTCountByOldProductCode(oldProductCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductCodeApply> getZTByOldProductCode(String oldProductCode) {
        return productCodeApplyMapper.getZTByOldProductCode(oldProductCode);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductCodeApply getById(Integer id) {
        return productCodeApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductCodeApply> getZTByBomCode(String bomCode) {
        return productCodeApplyMapper.getZTByBomCode(bomCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getZTProcessCodeByOldProductCode(String oldProductCode) {
        return productCodeApplyMapper.getZTProcessCodeByOldProductCode(oldProductCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getZTProcessCodeByBomCode(String bomCode) {
        return productCodeApplyMapper.getZTProcessCodeByBomCode(bomCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getZTProcessCodeByProductCode(String productCode) {
        return productCodeApplyMapper.getZTProcessCodeByProductCode(productCode);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getZTProcessCodeByProductNo(String productNo){
        return productCodeApplyMapper.getZTProcessCodeByProductNo(productNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getZTProcessCodeByProdlineNoAndProdlineName(String prodlineNo, String prodlineName){
        Map<String,Object> map = new HashMap<>();
        map.put("prodlineNo", prodlineNo);
        map.put("prodlineName", prodlineName);
        return productCodeApplyMapper.getZTProcessCodeByProdlineNoAndProdlineName(map);
    }
}
