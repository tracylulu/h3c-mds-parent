package com.h3c.mds.finance.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.dao.FProductCodeMapper;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProductCodeExample;
import com.h3c.mds.finance.entity.FProductCodeHistory;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FproductCodeHistoryService;
import com.h3c.mds.sysmgr.util.UserUtils;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FProductCodeServiceImpl implements FProductCodeService {

    @Autowired
    private FProductCodeMapper productCodeMapper;
    @Autowired
    private FproductCodeHistoryService fproductCodeHistoryService;

    @Override
    @Transactional(readOnly = true)
    public PageInfo<FProductCode> findByPage(Integer page, Integer rows,String dep,String status,String searchStr,String prodLine,String pdt,String state,String start,String end){
        PageHelper.startPage(page, rows);

        Map<String,Object> params = new HashMap<>();
        params.put("dep", dep);
        //params.put("status", status);
        params.put("searchStr", searchStr);
        params.put("prodLine", prodLine);
        params.put("pdt", pdt);

        if(StringUtils.isBlank(state)){ state = "1,2"; }

        params.put("state", StringUtils.isNotBlank(state)?state.split(","):null);
        params.put("start", start);
        params.put("end", end);
        List<FProductCode> productCodes = productCodeMapper.findByPage(params);

        PageInfo<FProductCode> pageInfo = new PageInfo<>(productCodes);
        return pageInfo;
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProductCode> getByProdId(Integer prodId) {
        FProductCodeExample example = new FProductCodeExample();
        FProductCodeExample.Criteria criteria = example.createCriteria();
        criteria.andProductIdEqualTo(prodId);
        return productCodeMapper.selectByExample(example);
    }

    @Override
    public List<String> getProductCodeByBomCodeNoCode(String bomCode, String productCode) {
        Map<String,Object> params = new HashMap<>();
        params.put("bomCode", bomCode==null?"":bomCode.trim());
        params.put("productCode", productCode);
        return productCodeMapper.getProductCodeByBomCodeNoCode(params);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProductCode> getByProdIdNo00(Integer prodId) {
        FProductCodeExample example = new FProductCodeExample();
        FProductCodeExample.Criteria criteria = example.createCriteria();
        criteria.andProductIdEqualTo(prodId);
        criteria.andProductCodeNotLike("%00");
        return productCodeMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public void create(FProductCode fProductCode){
        //fProductCode.setFprodNo(getMaxCode());
        fProductCode.setCreateDate(new Date());
        fProductCode.setCreateUser(UserUtils.getCurrentUserId());
        fProductCode.setModifyDate(new Date());
        fProductCode.setModifyUser(UserUtils.getCurrentUserId());
        productCodeMapper.insertSelective(fProductCode);
    }

    @Transactional
    @Override
    public void update(FProductCode fProductCode){
        FProductCodeHistory fProductCodeHistory = fproductCodeHistoryService.getProductCodeById(fProductCode.getId());
        fProductCodeHistory.setId(null);
        fproductCodeHistoryService.create(fProductCodeHistory);
        fProductCode.setModifyDate(new Date());
        fProductCode.setModifyUser(UserUtils.getCurrentUserId());
        productCodeMapper.updateByPrimaryKeySelective(fProductCode);
    }


    @Transactional(readOnly = true)
    @Override
    public List<FProductCode> getByProductCode(String productCode){
        FProductCodeExample example = new FProductCodeExample();
        FProductCodeExample.Criteria criteria = example.createCriteria();
        criteria.andProductCodeEqualTo(productCode);
        return productCodeMapper.selectByExample(example);
    }

    @Transactional(readOnly = true)
    @Override
    public Integer getCountByProductCode(String productCode){
        return productCodeMapper.getCountByProductCode(productCode);
    }

    @Override
    @Transactional(readOnly = true)
    public Integer getCountByBomCode(String bomCode){
        return productCodeMapper.getCountByBomCode(bomCode);
    }

    @Override
    @Transactional(readOnly=true)
    public String getMaxCode() {
        String maxCode = productCodeMapper.getMaxCode();
        if(maxCode == null){
            maxCode = "FP000000";
        }
        int val = Integer.parseInt(maxCode.substring(2,maxCode.length()))+1;
        String valStr = String.valueOf(val);
        String code = "FP";
        for(int i = 0;i<6-valStr.length();i++){
            code += "0";
        }
        code += valStr;
        return code;
    }

    @Override
    @Transactional
    public FProductCode getById(Integer id) {
        return productCodeMapper.selectByPrimaryKey(id);
    }
}
