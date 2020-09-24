package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.flowable.dao.FileLogMapper;
import com.h3c.mds.flowable.entity.FileLog;
import com.h3c.mds.flowable.service.FileLogService;
import com.h3c.mds.sysmgr.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class FileLogServiceImpl implements FileLogService {

    @Autowired
    private FileLogMapper fileLogMapper;

    @Override
    @Transactional
    public void create(FileLog fileLog) {
        fileLog.setCreateDate(new Date());
        fileLog.setCreateUser(UserUtils.getCurrentUserId());
        fileLog.setModifyDate(new Date());
        fileLog.setModifyUser(UserUtils.getCurrentUserId());
        fileLogMapper.insertSelective(fileLog);
    }
}
