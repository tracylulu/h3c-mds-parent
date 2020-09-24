package com.h3c.mds.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.dao.IBDS_PLIPMTMapper;
import com.h3c.mds.product.entity.IBDS_PLIPMT;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.product.service.IBDS_PLIPMTService;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class IBDS_PLIPMTServiceImpl implements IBDS_PLIPMTService{

    @Autowired
    private IBDS_PLIPMTMapper plipmtMapper;

    @Override
    @Transactional(readOnly = true)
    public PageInfo<IBDS_PLIPMT> findByPage(Integer pageNo, Integer pageSize, Map<String,Object> queryParams) {
        if(pageNo == null || pageNo < 1) pageNo = 1;
        if(pageSize == null || pageNo < 0) pageSize = 15;
        PageHelper.startPage(pageNo, pageSize);
        List<IBDS_PLIPMT> ibdsPlipmts = plipmtMapper.findByPage(queryParams);
        PageInfo<IBDS_PLIPMT> pageInfo = new PageInfo<>(ibdsPlipmts);

        return pageInfo;
    }

    @Override
    @Transactional(readOnly = true)
    public List<IBDS_PLIPMT> getByMap(Map<String, String> searchMap) {
        List<IBDS_PLIPMT> list = plipmtMapper.getByMap(searchMap);
        return list;
    }

    @Override
    @Transactional
    public void create(IBDS_PLIPMT ipmt) {
        ipmt.setPlipmtno(getMaxCode());
        plipmtMapper.insertSelective(ipmt);
    }

    @Override
    @Transactional
    public void update(IBDS_PLIPMT ipmt) {
        IBDS_PLIPMT old = plipmtMapper.selectByPrimaryKey(ipmt.getId());
        if(old != null && !StringUtils.equals(old.getPlipmt(), ipmt.getPlipmt())){
            if(StringUtils.isNotBlank(old.getPlipmtold())){
                ipmt.setPlipmtold(old.getPlipmtold()+";"+old.getPlipmt());
            }else{
                ipmt.setPlipmtold(old.getPlipmt());
            }

        }
        plipmtMapper.updateByPrimaryKey(ipmt);
    }

    @Override
    @Transactional(readOnly=true)
    public String getMaxCode() {
        String maxCode = plipmtMapper.getMaxCode();
        if(maxCode == null){
            maxCode = "PI000000";
        }
        int val = Integer.parseInt(maxCode.substring(2,maxCode.length()))+1;
        String valStr = String.valueOf(val);
        String code = "PI";
        for(int i = 0;i<6-valStr.length();i++){
            code += "0";
        }
        code += valStr;
        return code;
    }
    
    @Override
    @Transactional(readOnly=true)
    public IBDS_PLIPMT selectByPrimaryKey(Integer id) {
    	return plipmtMapper.selectByPrimaryKey(id);    	
    }
    
    /**
     * 根据内码查询
     * @param code
     * @return
     */
    @Override
    @Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
    public IBDS_PLIPMT selectByCode(String code) {
    	return plipmtMapper.selectByCode(code);
    }
}
