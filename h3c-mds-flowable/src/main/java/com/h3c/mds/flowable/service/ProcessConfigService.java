package com.h3c.mds.flowable.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.flowable.entity.ProcessConfig;
import com.h3c.mds.flowable.entity.ProcessConfigItem;

public interface ProcessConfigService {
	
	int create(ProcessConfig processConfig,List<ProcessConfigItem> lstAdd,List<ProcessConfigItem> lstUpdate,List<ProcessConfigItem> lstDelete,String user);
	
	int update(ProcessConfig processConfig,List<ProcessConfigItem> lstAdd,List<ProcessConfigItem> lstUpdate,List<ProcessConfigItem> lstDelete,String user);
	
	List<ProcessConfigItem> getTreeData( Map<String,String> param);
	
	ProcessConfig getByCode(String code);
	
	List<ProcessConfig> getComboxList();

}
