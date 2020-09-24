package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.ProcessLog;

import java.util.Date;
import java.util.List;

public interface ProcessLogService {

    void create(ProcessLog log);

    void createLog(Date checkDate,String checkPerson,String checkAccount,String checkResult,String checkOpion,String checkStatus,String processCode);

    List<ProcessLog> getByProcessCode(String processCode);

    //以不加锁的方式查询
	List<ProcessLog> getByProcessCodeForEip(String processCode);

    List<ProcessLog> getByProcessCodeAndCheckNode(String applyCode, String checkPerson);

    void update(ProcessLog log);
}
