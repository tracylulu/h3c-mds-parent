package com.h3c.mds.basicinfo.service.impl;

import org.springframework.stereotype.*;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.basicinfo.service.DifficultyCoefficientApplyService;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLYExample;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_Item_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_DifficultyCoefficient_PROCESSMapper;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.mchange.v1.util.CollectionUtils;
import com.h3c.mds.product.entity.IBDS_Bversion;

@Service
public class DifficultyCoefficientApplyServiceImpl implements DifficultyCoefficientApplyService {
	@Autowired
	private IBDS_DifficultyCoefficient_APPLYMapper diffApplyMapper;
	@Autowired
	private IBDS_DifficultyCoefficient_Item_APPLYMapper diffItemApplyMapper;
	@Autowired
	private IBDS_DifficultyCoefficient_PROCESSMapper diffProcessMapper;
	@Autowired
	private DifficultyCoefficientProcessService diffProcessService;
	@Autowired
	private IBDS_BversionService bversionService;
	
	/**
	 * 保存数据
	 */
	@Override
	@Transactional
	public void Save(IBDS_DifficultyCoefficient_APPLY diffApply,IBDS_DifficultyCoefficient_PROCESS diffProcess,
			List<IBDS_DifficultyCoefficient_Item_APPLY> lst) {
		
		if(diffApply.getId()==null) {
			IBDS_DifficultyCoefficient_APPLYExample example=new IBDS_DifficultyCoefficient_APPLYExample();
			IBDS_DifficultyCoefficient_APPLYExample.Criteria cirteria=example.createCriteria();
			cirteria.andProcessCodeEqualTo(diffApply.getProcessCode());
			List<IBDS_DifficultyCoefficient_APPLY> lstTemp=diffApplyMapper.selectByExample(example);
			if(lstTemp!=null&&lstTemp.size()>0) {
				String maxCode=diffProcessService.getMaxCode();
				diffApply.setProcessCode(maxCode);
				diffProcess.setApplyCode(maxCode);
			}
			diffApply.setCreatetime(new Date());
			diffApply.setCreator((String) SecurityUtils.getSubject().getPrincipal());
			diffApply.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			diffApply.setModifytime(new Date());
			diffApplyMapper.insertBackID(diffApply);
			
			insertItem(lst,diffApply.getId());
			
			if(StringUtil.isNotEmpty(diffProcess.getApplyCode())) {
				diffProcess.setCreatetime(new Date());
				diffProcess.setCreator((String) SecurityUtils.getSubject().getPrincipal());
				diffProcess.setModifier((String) SecurityUtils.getSubject().getPrincipal());
				diffProcess.setModifytime(new Date());
				diffProcessMapper.insertSelectiveBackID(diffProcess);
			}
		}else {
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstDel=new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstAll=diffItemApplyMapper.getDataList(diffApply.getId());
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstAdd=new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstEdit=new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();			
			
			for(IBDS_DifficultyCoefficient_Item_APPLY item :lst) {
				Optional<IBDS_DifficultyCoefficient_Item_APPLY> temp=lstAll.stream().filter(o->o.getBversionno().equals(item.getBversionno())).findFirst();
				if(temp.isPresent()) {
					//修改
					IBDS_DifficultyCoefficient_Item_APPLY itemTemp=temp.get();
					itemTemp.setBversion(item.getBversion());
					itemTemp.setProdifficult(item.getProdifficult());
					itemTemp.setHarddifficult(item.getHarddifficult());
					lstEdit.add(itemTemp);
				}else {
					//新增
					lstAdd.add(item);
				}
			}
			
			for(IBDS_DifficultyCoefficient_Item_APPLY item :lstAll) {
				Optional<IBDS_DifficultyCoefficient_Item_APPLY> temp=lst.stream().filter(o->o.getBversionno().equals(item.getBversionno())).findFirst();
				if(!temp.isPresent()) {
					lstDel.add(item);
				}				
			}			
			
			diffApply.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			diffApply.setModifytime(new Date());
			diffApplyMapper.updateByPrimaryKeySelective(diffApply);
			
			if(StringUtil.isNotEmpty(diffProcess.getApplyCode())) {
				diffProcess.setModifier((String) SecurityUtils.getSubject().getPrincipal());
				diffProcess.setModifytime(new Date());
				diffProcessMapper.updateByPrimaryKeySelective(diffProcess);
			}
			//新增子表
			insertItem(lstAdd,diffApply.getId());
			//修改子表
			updateItem(lstEdit,diffApply.getId());
			//状态删除子表
			delItem(lstDel,diffApply.getId());
		}
	}
	
	/**
	 * 新增子表信息
	 * @param lstAdd
	 * @param id
	 */
	public void insertItem(List<IBDS_DifficultyCoefficient_Item_APPLY> lstAdd,Integer id) {
		for(IBDS_DifficultyCoefficient_Item_APPLY item: lstAdd) {
			item.setDiffId(id);
			item.setStatus("1");
			item.setCreatetime(new Date());
			item.setCreator((String) SecurityUtils.getSubject().getPrincipal());
			item.setModifytime(new Date());
			item.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			diffItemApplyMapper.insertSelective(item);
		}
	}
	
	/**
	 * 修改子表信息
	 * @param lstEdit
	 * @param id
	 */
	public void updateItem(List<IBDS_DifficultyCoefficient_Item_APPLY> lstEdit,Integer id) {
		for(IBDS_DifficultyCoefficient_Item_APPLY item: lstEdit) {
			//修改时清空为null设置为0
			if(item.getProdifficult()==null) {
				item.setProdifficult(new BigDecimal(0));
			}
			if(item.getHarddifficult()==null) {
				item.setHarddifficult(new BigDecimal(0));
			}
			item.setStatus("1");
			item.setModifytime(new Date());
			item.setModifier((String) SecurityUtils.getSubject().getPrincipal());

			diffItemApplyMapper.updateByPrimaryKeySelective(item);
		}
	}
	
	/**
	 * 删除子表信息
	 * @param lstDel
	 * @param id
	 */
	public void delItem(List<IBDS_DifficultyCoefficient_Item_APPLY> lstDel,Integer id) {
		for(IBDS_DifficultyCoefficient_Item_APPLY item: lstDel) {
			item.setStatus("0");
			item.setModifytime(new Date());
			item.setModifier((String) SecurityUtils.getSubject().getPrincipal());
			diffItemApplyMapper.updateByPrimaryKeySelective(item);
		}
	}
	
	/**
	 * 表单验证
	 */
	@Override
	public void validateApply(IBDS_DifficultyCoefficient_APPLY diffApply,List<IBDS_DifficultyCoefficient_Item_APPLY> lstAll) {		
	
		List<String> lstCode=new ArrayList<String>();
		List<String> lstAllCode=new ArrayList<String>();
		List<String> lstZTCode=new ArrayList<String>();
		
		if (StringUtils.isEmpty(diffApply.getPlipmtno())) {
			throw new FlowableException("请选择IPMT！");
		}
		if (StringUtils.isEmpty(diffApply.getProdlineno())) {
			throw new FlowableException("请选择产品线！");
		}
		if (StringUtils.isEmpty(diffApply.getProductno())) {
			throw new FlowableException("请选择产品！");
		}
		if (StringUtils.isEmpty(diffApply.getReleaseno())) {
			throw new FlowableException("请选择R版本！");
		}
		
		lstAll.stream().forEach(o->{
			lstCode.addAll(new ArrayList<String>(Arrays.asList(o.getBversionno().split(","))));
			});
		String strCode=String.join(",", lstCode);
		lstAllCode=Arrays.asList(strCode.split(","));
		
		List<IBDS_DifficultyCoefficient_Item_APPLY> lstZT=diffItemApplyMapper.selectZTList();
		
		for(String code :lstAllCode) {
			List<IBDS_DifficultyCoefficient_Item_APPLY> lstTemp= lstZT.stream().filter(o->StringUtils.isNotBlank(o.getBversionno())
					&&o.getBversionno().contains(code)).collect(Collectors.toList());
			if(lstTemp!=null&&lstTemp.size()>0) {
				lstZTCode.add(code);
			}
		}		
		
		if(lstZTCode!=null&&lstZTCode.size()>0) {
			throw new FlowableException("编码【"+String.join(",", lstZTCode)+"】已经有在途申请单，不能提交！！");
		}
	}
	
	/**
	 * 获取提示消息
	 */
	@Override
	public String getTipMsg(String proCode,String hardCode) {
		String msg="";
		List<String> lstName=new ArrayList<String>();
		if(StringUtil.isNotEmpty(proCode)) {
			String[] codeList= proCode.split(",");
			List<IBDS_Bversion> lst=bversionService.selectByCodeList(codeList);
			lst.stream().filter(o->StringUtils.isNotBlank(o.getPack())).forEach(o->{
				
				lstName.add(o.getBversioncname()+"存在打包申请的产品难度系数"+o.getPack()+"："+o.getProdifficult()+"，申请后"+cutStr(o.getPack().replace(o.getBversioncname(), ""))
						+"难度系数需要重新申请，请知！<br/>");
				});				
		}
		
		if(StringUtil.isNotEmpty(hardCode)) {
			String[] codeList= hardCode.split(",");
			List<IBDS_Bversion> lst=bversionService.selectByCodeList(codeList);
			
			lst.stream().filter(o->StringUtils.isNotBlank(o.getHardpack())).forEach(o->{				
				lstName.add(o.getBversioncname()+"存在打包申请的硬件难度系数"+o.getHardpack()+"："+o.getHarddiffcult()+"，申请后"+cutStr(o.getHardpack().replace(o.getBversioncname(), ""))
						+"难度系数需要重新申请，请知！<br/>");
				});				
		}
		if(lstName!=null&&lstName.size()>0) {
			msg=String.join(" ",lstName);
		}
		
		return msg;
	} 
	
	public String cutStr(String str) {
		if("&".equals(str.substring(0,1))) {
			str=str.substring(1,str.length());
		}
		if("&".equals(str.substring(str.length()-1,str.length()))) {
			str=str.substring(0,str.length()-1);
		}
		
		return str.replace("&&", "&").replace("&", ",");
	}
	
}
