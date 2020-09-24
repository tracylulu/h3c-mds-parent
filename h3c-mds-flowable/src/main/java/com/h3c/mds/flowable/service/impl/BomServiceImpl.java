package com.h3c.mds.flowable.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.dao.BomMapper;
import com.h3c.mds.flowable.entity.Bom;
import com.h3c.mds.flowable.entity.BomExample;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.service.BomService;
import com.h3c.mds.utils.redis.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class BomServiceImpl implements BomService {

    @Autowired
    private BomMapper bomMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Transactional(readOnly = true)
    @Override
    public PageInfo findByPage(Integer page, Integer rows, String searchStr){
        if(page == null || page < 1){
            page = 1;
        }
        if(rows == null || rows <15){
            rows = 15;
        }
        PageHelper.startPage(page, rows);
        List<Bom> list = bomMapper.findByPage(searchStr);
        PageInfo<Bom> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    @Transactional
    public Bom getByBomCode(String bomCode){
        BomExample example = new BomExample();
        BomExample.Criteria criteria = example.createCriteria();
        criteria.andS1partnumberEqualTo(bomCode);
        List<Bom> boms = bomMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(boms)){
            return null;
        }else{
            return boms.get(0);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Bom> getAll(){
        BomExample example = new BomExample();
        return bomMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public String getBomDescByBomCode(String bomCode){
        if(StringUtils.isNotBlank(bomCode)){
            String bomDesc = (String) redisUtil.hget("BOM_CODE", bomCode);
            if(StringUtils.isBlank(bomDesc)){
                Bom bom = getByBomCode(bomCode);
                if(bom != null){
                    String s1partdescelements = bom.getS1partdescelements();
                    redisUtil.hset("BOM_CODE", bomCode, s1partdescelements);
                    return s1partdescelements;
                }
            }else {
                return bomDesc;
            }
        }
        return bomCode;
    }

    @Override
    @Transactional(readOnly = true)
    public Boolean hasBomCode(String bomCode){
        if(StringUtils.isNotBlank(bomCode)){
            boolean hasKey = redisUtil.hHasKey("BOM_CODE", bomCode);
            if(hasKey){
                return true;
            }else{
                Bom bom = getByBomCode(bomCode);
                if(bom == null){
                    return false;
                }else{
                    String s1partdescelements = bom.getS1partdescelements();
                    redisUtil.hset("BOM_CODE", bomCode, s1partdescelements);
                    return true;
                }
            }
        }else{
            return false;
        }
    }
}
