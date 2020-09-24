package com.h3c.mds.finance.service.impl;

import com.h3c.mds.finance.dao.FProdMapper;
import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdExample;
import com.h3c.mds.finance.exception.FinanceException;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.sysmgr.util.UserUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class FProdServiceImpl implements FprodService {

    @Autowired
    private FProdMapper fProdMapper;

    /**
     * 根据产品编号获取产品族
     * @param lineNo
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<FProd> getByLineNo(String lineNo){
        FProdExample example = new FProdExample();
        FProdExample.Criteria criteria = example.createCriteria();
        criteria.andProdlineNoEqualTo(lineNo);
        return fProdMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public FProd getByCode(String code) {
        FProdExample example = new FProdExample();
        FProdExample.Criteria criteria = example.createCriteria();
        criteria.andProdNoEqualTo(code);
        List<FProd> fProds = fProdMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(fProds)){
            return null;
        }
        return fProds.get(0);
    }

    @Transactional(readOnly = true)
    @Override
    public Integer getCountByCode(String code){
        FProdExample example = new FProdExample();
        FProdExample.Criteria criteria = example.createCriteria();
        criteria.andProdNoEqualTo(code);
        Long l = fProdMapper.countByExample(example);
        return l.intValue();
    }

    @Transactional
    @Override
    public void create(FProd fProd){
        String userId;
        fProd.setCreateDate(new Date());

        fProd.setCreateUser(UserUtils.getCurrentUserId());
        fProd.setModifyDate(new Date());
        fProd.setModifyUser(UserUtils.getCurrentUserId());
        Integer count = getCountByCode(fProd.getProdNo());
        //if(count > 0) throw  new FinanceException("该编码已经存在，不能提交");
        fProdMapper.insertSelective(fProd);
    }

    @Transactional
    @Override
    public void update(FProd fProd){
        fProd.setModifyUser(UserUtils.getCurrentUserId());
        fProd.setModifyDate(new Date());
        FProd fProd1 = fProdMapper.selectByPrimaryKey(fProd.getId());
        if(StringUtils.equals(fProd1.getProdNo(), fProd.getProdNo())){
            Integer count = getCountByCode(fProd.getProdNo());
            if(count > 1) throw new FinanceException("该编码已经被占用，请更换编码");
        }else{
            Integer count = getCountByCode(fProd.getProdNo());
            if(count > 0) throw new FinanceException("该编码已经被占用，请更换编码");
        }
        fProdMapper.updateByPrimaryKeySelective(fProd);
    }

    @Transactional
    @Override
    public void updateFProd(FProd fProd){
        fProd.setModifyDate(new Date());
        FProd fProd1 = fProdMapper.selectByPrimaryKey(fProd.getId());
        fProdMapper.updateByPrimaryKeySelective(fProd1);
    }
    
    
    @Override
    @Transactional(readOnly = true)
    public List<FProd> getByLineId(Integer id) {
        FProdExample example = new FProdExample();
        FProdExample.Criteria criteria = example.createCriteria();
        criteria.andProdlineIdEqualTo(id);
        return fProdMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public FProd getById(Integer id) {
        return fProdMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProd> getByNoAndName(String productNo, String productName) {
        FProdExample example = new FProdExample();
        FProdExample.Criteria criteria = example.createCriteria();
        criteria.andProdNoEqualTo(productNo);
        criteria.andProdNameEqualTo(productName);
        return fProdMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProd> getByPdtId(Integer pdtId) {
        return fProdMapper.getPdtId(pdtId);
    }
}
