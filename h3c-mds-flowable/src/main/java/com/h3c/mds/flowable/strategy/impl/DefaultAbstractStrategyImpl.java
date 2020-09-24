package com.h3c.mds.flowable.strategy.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.dao.PartCodeApplyMapper;
import com.h3c.mds.flowable.dao.PartCodeProcessMapper;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.strategy.Strategy;
import com.h3c.mds.utils.CommonsThreadCache;

@Service
public  abstract class DefaultAbstractStrategyImpl<F, T> implements Strategy<F, T>{

	private static Logger logger = LoggerFactory.getLogger(DefaultAbstractStrategyImpl.class);
	
	@Autowired
	private PartCodeApplyMapper partCodeApplyMapper;
	
	@Autowired
	private PartCodeProcessMapper partCodeProcessMapper;

	@Autowired
	private PartCodeProcessService partCodeProcessService;
	@Autowired
	private MailInfoService mailInfoService;
	
	@Override
	public List<F> getSourceData(F f){
		return doGetSourceData(f);
	}
	
	
	
	@Override
	@Transactional
	public int saveData(List<T> partProcessAndPartCodeWapperList) {
		CommonsThreadCache.setCurrentOperateType("system");
		if(CollectionUtils.isNotEmpty(partProcessAndPartCodeWapperList)){
			logger.info("新增part数据入库 条数" + partProcessAndPartCodeWapperList.size());
			for(int i = 0; i < partProcessAndPartCodeWapperList.size(); i++){
				PartProcessAndPartCodeWrapper wrapperEntity = (PartProcessAndPartCodeWrapper)partProcessAndPartCodeWapperList.get(i);
				List<PartCodeApply> partCodeApplyList = wrapperEntity.getPartCodeApplyList();
				if(CollectionUtils.isNotEmpty(partCodeApplyList)){
					//分批次处理，每次处理FlowableConst.PDM_COUNT条
					for(int count = 0; count < partCodeApplyList.size() / FlowableConst.PDM_COUNT; count++){
						List<PartCodeApply> tmpPartCodeApplyList = 
								partCodeApplyList.subList(count * FlowableConst.PDM_COUNT, (count + 1) * FlowableConst.PDM_COUNT);
						wrapperEntity.getPartCodeProcess().setApplyCode(partCodeProcessService.getMaxApplyCode());
						wrapperEntity.getPartCodeProcess().setCreateDate(new Date());;
						wrapperEntity.getPartCodeProcess().setId(null);
						partCodeProcessMapper.insertSelectiveAndGetId(wrapperEntity.getPartCodeProcess());
						sendPartEmail(wrapperEntity.getPartCodeProcess());
						for(int j = 0; j < tmpPartCodeApplyList.size(); j++){
							PartCodeApply tmpPartCodeApply = tmpPartCodeApplyList.get(j);
							tmpPartCodeApply.setProcessCode(wrapperEntity.getPartCodeProcess().getApplyCode());
							partCodeApplyMapper.insertSelective(tmpPartCodeApply);						
						}
					}
					
					if(0 != partCodeApplyList.size() % FlowableConst.PDM_COUNT){
						List<PartCodeApply> tmpPartCodeApplyList = 
						partCodeApplyList.subList(partCodeApplyList.size() - (partCodeApplyList.size() % FlowableConst.PDM_COUNT), partCodeApplyList.size());
						
						wrapperEntity.getPartCodeProcess().setApplyCode(partCodeProcessService.getMaxApplyCode());
						wrapperEntity.getPartCodeProcess().setId(null);
						partCodeProcessMapper.insertSelectiveAndGetId(wrapperEntity.getPartCodeProcess());
						sendPartEmail(wrapperEntity.getPartCodeProcess());
						for(int j = 0; j < tmpPartCodeApplyList.size(); j++){
							PartCodeApply tmpPartCodeApply = tmpPartCodeApplyList.get(j);
							tmpPartCodeApply.setProcessCode(wrapperEntity.getPartCodeProcess().getApplyCode());
							partCodeApplyMapper.insertSelective(tmpPartCodeApply);						
						}
					}
					
					
				}
			}
			return partProcessAndPartCodeWapperList.size();
		}
		return 0;
	}

	
	public void sendPartEmail(PartCodeProcess partCodeProcess){
		mailInfoService.sendMailAndRecord(partCodeProcess.getHandler(), null, "请您处理新增Part编码流程：",
				null, partCodeProcess.getId(), "/flowable/partCodeProcess/edit/" + partCodeProcess.getId() ,"Part编码申请", "PART_DRAFT");
	}
	
}
