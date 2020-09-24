package com.h3c.mds.finance.service.impl;

import com.h3c.mds.finance.dao.FProductCodeHistoryMapper;
import com.h3c.mds.finance.entity.FProductCodeHistory;
import com.h3c.mds.finance.service.FproductCodeHistoryService;
import com.h3c.mds.sysmgr.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class FproductCodeHistoryServiceImpl implements FproductCodeHistoryService {

    @Autowired
    private FProductCodeHistoryMapper fProductCodeHistoryMapper;


    @Override
    @Transactional
    public void create(FProductCodeHistory fProductCodeHistory) {
        fProductCodeHistory.setModifyDate(new Date());
        fProductCodeHistory.setModifyUser(UserUtils.getCurrentUserId());
        fProductCodeHistoryMapper.insertSelective(fProductCodeHistory);
    }

    @Override
    @Transactional(readOnly = true)
    public FProductCodeHistory getProductCodeById(Integer id) {
        return fProductCodeHistoryMapper.getProductCodeById(id);
    }
}
