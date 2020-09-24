package com.h3c.mds.finance.service.impl;

import com.h3c.mds.finance.dao.FProductMapper;
import com.h3c.mds.finance.entity.FProduct;
import com.h3c.mds.finance.entity.FProductExample;
import com.h3c.mds.finance.service.FProductService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class FProductServiceImpl implements FProductService {

    @Autowired
    private FProductMapper fProductMapper;

    @Transactional(readOnly = true)
    @Override
    public Integer getCountByCode(String code){
        FProductExample example = new FProductExample();
        FProductExample.Criteria criteria = example.createCriteria();
        criteria.andFproductcoacodeEqualTo(code);
        Long count = fProductMapper.countByExample(example);
        return count.intValue();
    }

    @Transactional(readOnly = true)
    @Override
    public List<FProduct> getByCode(String code){
        FProductExample example = new FProductExample();
        FProductExample.Criteria criteria = example.createCriteria();
        criteria.andFproductcoacodeEqualTo(code);
        return fProductMapper.selectByExample(example);
    }


    @Transactional
    @Override
    public void create(FProduct fProduct){
//        fProduct.setCreateDate(new Date());
//        fProduct.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
//        fProduct.setModifyDate(new Date());
//        fProduct.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
        fProduct.setFproductno(getMaxCode());
        fProductMapper.insertSelective(fProduct);
    }

    @Transactional
    @Override
    public void update(FProduct fProduct){
//        fProduct.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
//        fProduct.setModifyDate(new Date());
        fProductMapper.updateByPrimaryKeySelective(fProduct);
    }

    @Override
    @Transactional(readOnly=true)
    public String getMaxCode() {
        String maxCode = fProductMapper.getMaxCode();
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
}
