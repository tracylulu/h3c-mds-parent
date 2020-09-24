package com.h3c.mds.auth.service.impl;

import com.h3c.mds.auth.dao.DataPermMapper;
import com.h3c.mds.auth.entity.DataPerm;
import com.h3c.mds.auth.service.DataPermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataPermServiceImpl implements DataPermService {

    @Autowired
    private DataPermMapper dataPermMapper;

    @Override
    public List<DataPerm> getByUserAccountAndResource(String account, String resource,String type) {

        return dataPermMapper.getByUserAccountAndResource(account,resource,type);
    }
}
