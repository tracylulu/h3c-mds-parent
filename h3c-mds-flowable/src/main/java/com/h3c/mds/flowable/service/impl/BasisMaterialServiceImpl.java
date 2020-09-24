package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.flowable.dao.BasisMaterialMapper;
import com.h3c.mds.flowable.entity.BasisMaterial;
import com.h3c.mds.flowable.service.BasisMaterialService;
import com.h3c.mds.sysmgr.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
public class BasisMaterialServiceImpl implements BasisMaterialService {

    @Autowired
    private BasisMaterialMapper basisMaterialMapper;

    @Override
    @Transactional
    public void create(BasisMaterial basisMaterial) {
        basisMaterial.setId(UUID.randomUUID().toString().replace("-", ""));
        basisMaterial.setCreateDate(new Date());
        basisMaterial.setCreateUser(UserUtils.getCurrentUserId());
        basisMaterial.setModifyDate(new Date());
        basisMaterial.setModifyUser(UserUtils.getCurrentUserId());
        basisMaterialMapper.insertSelective(basisMaterial);
    }

    @Override
    @Transactional
    public void update(BasisMaterial basisMaterial) {
        basisMaterial.setModifyUser(UserUtils.getCurrentUserId());
        basisMaterial.setModifyDate(new Date());
        basisMaterialMapper.updateByPrimaryKeySelective(basisMaterial);
    }

    @Override
    @Transactional
    public void deleteById(String id) {
        basisMaterialMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public BasisMaterial getById(String id) {
        return basisMaterialMapper.selectByPrimaryKey(id);
    }


}
