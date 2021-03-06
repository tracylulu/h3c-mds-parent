package com.h3c.mds.flowable.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.flowable.dao.IbdsTaskMapper;
import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.IbdsTaskExample;
import com.h3c.mds.flowable.entity.IbdsTaskExample.Criteria;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.utils.IpUtils;

@Service
public class IbdsTaskServiceImpl implements IbdsTaskService{

	@Autowired
	private IbdsTaskMapper  ibdsTaskMapper;
	
	
	@Override
	public int addTask(IbdsTask task) {
		
		return ibdsTaskMapper.insertSelective(task);
	}

	@Override
	public int updateTask(IbdsTask task) {
		task.setUpdateTime(new Date());
		if(StringUtils.isNoneBlank(task.getCause())){
			task.setCause(IpUtils.getIpInfo() + "----" + task.getCause());
		}
		return ibdsTaskMapper.updateByPrimaryKeySelective(task);
	}
	
	
	@Override
	public IbdsTask getTaskById(Integer id){
		return ibdsTaskMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<IbdsTask> getUnHandleTask() {
		IbdsTaskExample example = new IbdsTaskExample();
		Criteria criteria = example.createCriteria();
		criteria.andFinalStatusIsNull();
		return ibdsTaskMapper.selectByExample(example);
	}
	
	@Override
	public List<IbdsTask> getUnHandleCoaTask() {
		IbdsTaskExample example = new IbdsTaskExample();
		Criteria criteria = example.createCriteria();
		
//		criteria.andTypeEqualTo("");
		criteria.andFinalStatusIsNull();
		return ibdsTaskMapper.selectByExample(example);
	}
	
	@Override
	public List<IbdsTask> getTaskByStatus(String status){
		IbdsTaskExample example = new IbdsTaskExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(status);
		return ibdsTaskMapper.selectByExample(example);
	}

	@Override
	public List<IbdsTask> getSuccessTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IbdsTask> getFailTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExistErpImportNoByApplyNo(String applyNo) {
		IbdsTaskExample example = new IbdsTaskExample();
		Criteria criteria = example.createCriteria();
		criteria.andTaskIdEqualTo(applyNo);
		List<IbdsTask> taskList = ibdsTaskMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(taskList)){
			
			return taskList.get(0).getErpApplyNo();
		}
		
		return null;
	}
	
	@Override
	public String getNewErpImportNoByApplyNo(String applyNo){
		String erpImportNo = "";
		String oldErpImportApplyNo = getExistErpImportNoByApplyNo(applyNo);
		if(StringUtils.isBlank(oldErpImportApplyNo)){
			erpImportNo = applyNo + "~" + 1;
		}else{
			String taskId = oldErpImportApplyNo.split("~")[0];
			String count = String.valueOf(Integer.valueOf(oldErpImportApplyNo.split("~")[1]) + 1);
			erpImportNo = taskId + "~" + count;
		}
		return erpImportNo;
	}
	
	@Override
	public  List<IbdsTask> getTaskByTaskId(String taskId){
		IbdsTaskExample example = new IbdsTaskExample();
		Criteria criteria = example.createCriteria();
		criteria.andTaskIdEqualTo(taskId);
		List<IbdsTask> taskList = ibdsTaskMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(taskList)){
			
			return taskList;
		}else{
			return null;
		}
	}
	
	
	@Override
	public int deleteTaskByTaskId(String taskId){
		IbdsTaskExample example = new IbdsTaskExample();
		Criteria criteria = example.createCriteria();
		criteria.andTaskIdEqualTo(taskId);
		return ibdsTaskMapper.deleteByExample(example);
	}
}
