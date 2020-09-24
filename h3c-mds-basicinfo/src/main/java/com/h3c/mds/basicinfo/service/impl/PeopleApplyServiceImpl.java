package com.h3c.mds.basicinfo.service.impl;

import com.h3c.mds.basicinfo.service.PeopelApplyService;
import com.h3c.mds.basicinfo.service.PeopleProcessService;
import com.h3c.mds.basicinfo.service.ProductProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.basicinfo.entity.IBDS_People_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_APPLYExample;
import com.h3c.mds.basicinfo.entity.IBDS_People_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;
import com.h3c.mds.sysmgr.entity.User;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.dao.IBDS_People_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_People_Item_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_People_PROCESSMapper;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;
import java.util.List;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;


@Service
public class PeopleApplyServiceImpl implements PeopelApplyService {
	@Autowired
	private IBDS_People_APPLYMapper pApplyMapper;
	@Autowired
	private IBDS_People_Item_APPLYMapper itemApplyMapper;
	@Autowired
	private IBDS_People_PROCESSMapper pProcessMapper;
	@Autowired
	private PeopleProcessService processService;
	@Autowired
	private UserService userService;
	
	@Override
	@Transactional
	public void save(IBDS_People_APPLY pApply,List<IBDS_People_Item_APPLY> lst,IBDS_People_PROCESS pProcess) {
		if(pApply.getId()==null) {
			
			insert(pApply,lst,pProcess);
		}else {
			update(pApply,lst,pProcess);
		}
	}
	
	/**
	 * 新增
	 * @param pApply
	 * @param lst
	 * @param pProcess
	 */
	public void insert(IBDS_People_APPLY pApply,List<IBDS_People_Item_APPLY> lst,IBDS_People_PROCESS pProcess) {
		IBDS_People_APPLYExample example=new IBDS_People_APPLYExample();
		IBDS_People_APPLYExample.Criteria cirteria=example.createCriteria();
		cirteria.andProcessCodeEqualTo(pApply.getProcessCode());
		List<IBDS_People_APPLY> lstTemp=pApplyMapper.selectByExample(example);
		if(lstTemp!=null&&lstTemp.size()>0) {
			String maxCode=processService.getMaxCode();
			pApply.setProcessCode(maxCode);
			pProcess.setApplyCode(maxCode);
		}
		pApply.setCreator((String) SecurityUtils.getSubject().getPrincipal());
		pApply.setCreatetime(new Date());
		pApply.setModifier((String) SecurityUtils.getSubject().getPrincipal());
		pApply.setModifytime(new Date());
		pApplyMapper.insertBackID(pApply);
		
		if(pProcess!=null) {
			pProcess.setCreator((String) SecurityUtils.getSubject().getPrincipal());
			pProcess.setCreatetime(new Date());
			pProcess.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			pProcess.setModifytime(new Date());
			pProcessMapper.insertSelectiveBackID(pProcess);
		}
		
		for(IBDS_People_Item_APPLY item: lst) {
			item.setpId(pApply.getId());
			item.setCreator((String) SecurityUtils.getSubject().getPrincipal());
			item.setCreatetime(new Date());
			item.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			item.setModifytime(new Date());
			item.setStatus("1");
			itemApplyMapper.insertSelective(item);
		}
				
	}
	
	/**
	 * 修改
	 * @param pApply
	 * @param lst
	 * @param pProcess
	 */
	public void update(IBDS_People_APPLY pApply,List<IBDS_People_Item_APPLY> lst,IBDS_People_PROCESS pProcess) {
		List<IBDS_People_Item_APPLY> lstEdit=new ArrayList<IBDS_People_Item_APPLY>();
		List<IBDS_People_Item_APPLY> lstAdd=new ArrayList<IBDS_People_Item_APPLY>();
		List<IBDS_People_Item_APPLY> lstAll=itemApplyMapper.selectByPid(pApply.getId());
		
		pApply.setModifier((String) SecurityUtils.getSubject().getPrincipal());
		pApply.setModifytime(new Date());
		pApplyMapper.updateByPrimaryKeySelective(pApply);
		
		
		for(IBDS_People_Item_APPLY item :lst) {
			Optional<IBDS_People_Item_APPLY> temp=lstAll.stream().filter(o->o.getProcode().equals(item.getProcode())
					&&o.getColumnname().equals(item.getColumnname())).findFirst();
			if(temp.isPresent()) {
				IBDS_People_Item_APPLY itemTemp=temp.get();
				itemTemp.setIssync(item.getIssync());
				itemTemp.setRolename(item.getRolename());
				itemTemp.setOldpeoples(item.getOldpeoples());
				itemTemp.setNewpeoples(item.getNewpeoples());
				itemTemp.setModifier((String) SecurityUtils.getSubject().getPrincipal());
				itemTemp.setModifytime(new Date());
				lstEdit.add(itemTemp);
			}else {
				item.setpId(pApply.getId());
				item.setCreator((String) SecurityUtils.getSubject().getPrincipal());
				item.setCreatetime(new Date());
				item.setModifier((String) SecurityUtils.getSubject().getPrincipal());
				item.setModifytime(new Date());
				item.setStatus("1");
				lstAdd.add(item);
			}			
		}
		
		for(IBDS_People_Item_APPLY item :lstAll) {
			Optional<IBDS_People_Item_APPLY> temp=lst.stream().filter(o->o.getProcode().equals(item.getProcode())
					&&o.getColumnname().equals(item.getColumnname())).findFirst();
			if(!temp.isPresent()) {
				item.setStatus("0");
				item.setModifier((String) SecurityUtils.getSubject().getPrincipal());
				item.setModifytime(new Date());
				lstEdit.add(item);
			}
		}
	
		lstAdd.stream().forEach(item->{
			itemApplyMapper.insertSelective(item);
		});
		
		lstEdit.stream().forEach(item->{
			itemApplyMapper.updateByPrimaryKeySelective(item);
		});
		
		if(pProcess!=null) {
			pProcess.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			pProcess.setModifytime(new Date());
			pProcessMapper.updateByPrimaryKeySelective(pProcess);
		}	
	}
	
	@Override
	public void validateApply(IBDS_People_APPLY pApply,List<IBDS_People_Item_APPLY> lst) {
		String userCode="", msg="";
		List<String> lstCode=new ArrayList<String>();
		List<User> lstUser=userService.findAll();
		
		for(IBDS_People_Item_APPLY item:lst) {
			if(StringUtil.isEmpty(item.getNewpeoples())) {
				msg+="修改后的人员不能为空！\n";
				continue;
			}

			if (item.getNewpeoples().contains(",")) {				
				for(String str: item.getNewpeoples().split(",")) {
					if(StringUtils.isBlank(str)) continue;
					Optional<User> temp= lstUser.stream().filter(o->str.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
					if(!temp.isPresent()) {
						msg+="人员【"+str+"】填写错误！\n";
					}					
				}				
			} else {				
				Optional<User> temp= lstUser.stream().filter(o->item.getNewpeoples().equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
				if(!temp.isPresent()) {
					msg+="人员【"+item.getNewpeoples()+"】填写错误！\n";
				}				
			}			
		}
		
		if(StringUtil.isNotEmpty(msg)) {
			throw new FlowableException(msg);
		}
		
		List<IBDS_People_Item_APPLY> lstZTAll=itemApplyMapper.selectAllZT();
		
		for(IBDS_People_Item_APPLY item:lst) {
			List<IBDS_People_Item_APPLY> lstTemp=lstZTAll.stream().filter(o->StringUtils.isNotBlank(o.getProcode())
					&&o.getProcode().equals(item.getProcode())&&o.getColumnname().equals(item.getColumnname())).collect(Collectors.toList());
			if(lstTemp!=null&&lstTemp.size()>0) {
				lstCode.add(item.getProname());
				
			}
		}
		
		if(lstCode.size()>0) {
			throw new FlowableException("【"+String.join(",", lstCode)+"】已存在在途单据！");
		}
	}
	
	/**
	 * 获取子表有效数据
	 */
	public List<IBDS_People_Item_APPLY> getByPid(Integer pid) {

		List<IBDS_People_Item_APPLY> lst = itemApplyMapper.selectByPid(pid);
		List<String> lstColumn = new ArrayList<>();
		List<IBDS_People_Item_APPLY> lstNew = new ArrayList<>();
		List<String> lstProCode=new ArrayList<>();
		List<String> lstProName=new ArrayList<>();
		List<String> lstOldP = new ArrayList<>();
		List<String> lstNewP = new ArrayList<>();
		boolean isSync=false;
		for (IBDS_People_Item_APPLY item : lst) {
			lstProCode.clear();
			lstProName.clear();
			lstOldP.clear();
			lstNewP.clear();			
			Optional<String> temp = lstColumn.stream().filter(o -> o.equals(item.getColumnname())).findAny();
			if (temp.isPresent()) {
				continue;
			} 
			lstColumn.add(item.getColumnname());
			// 不存在的合并 
			List<IBDS_People_Item_APPLY> lstTemp = lst.stream().filter(o -> item.getColumnname().equals(o.getColumnname())).collect(Collectors.toList());
			for(IBDS_People_Item_APPLY merge :lstTemp) {
				lstProCode.add(merge.getProcode());
				lstProName.add(merge.getProname());
				lstOldP.addAll(Arrays.asList(merge.getOldpeoples().split(",")));
				lstNewP.addAll(Arrays.asList(merge.getNewpeoples().split(",")));
				if(isSync!=true&&"1".equals(merge.getIssync())) {
					isSync=true;
				}
			}
			
			HashSet<String> oldSet = new HashSet<String>(lstOldP);
			HashSet<String> newSet = new HashSet<String>(lstNewP);
			IBDS_People_Item_APPLY itemNew = new IBDS_People_Item_APPLY();
			itemNew.setProcode(String.join(",", lstProCode));
			itemNew.setProname(String.join(",", lstProName));
			itemNew.setRolename(item.getRolename());
			itemNew.setColumnname(item.getColumnname());			
			itemNew.setOldpeoples(String.join(",", oldSet));
			itemNew.setNewpeoples(String.join(",", newSet));
			itemNew.setIssync(isSync?"1":"0");
			lstNew.add(itemNew);
		} 

		return lstNew;
	}
}
