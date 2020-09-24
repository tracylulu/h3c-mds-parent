package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;

import com.h3c.mds.product.dao.IBDS_DicMapper;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_DicExample;
import com.h3c.mds.product.service.DicService;



@Service
public class DicServiceImpl implements DicService {

	@Autowired
	private IBDS_DicMapper dicMapper;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<IBDS_Dic> getDic(Map<String, String> param) {
		return dicMapper.getDic(param);
	}

	@Override
	@Transactional(readOnly=true)
	public List<IBDS_Dic> getList(Map<String, String> param){
		return dicMapper.getList(param);
	}
	
	/**
	 * 分页方法
	 */
	@Override
	@Transactional(readOnly=true)
	public PageInfo<IBDS_Dic> pageOfDic(int pageNum, int pageSize, Map<String,String> param){
		PageHelper.startPage(pageNum, pageSize);
		List<IBDS_Dic> lst=dicMapper.getList(param);		
		
		PageInfo<IBDS_Dic> pageInfo=new PageInfo<IBDS_Dic>(lst);
		
		return pageInfo;
	}
	
	/**
	 * 保存方法
	 */	
	@Transactional
	@Override
	public int save(IBDS_Dic model) {
		model.setCreatetime(new Date());
		model.setModifytime(new Date());
		model.setCreator((String)SecurityUtils.getSubject().getPrincipal());
		model.setModifier((String)SecurityUtils.getSubject().getPrincipal());
		return dicMapper.insertSelective(model);
	}
	
	/**
	 * 修改方法
	 */
	@Transactional
	@Override
	public int update(IBDS_Dic model) {
		IBDS_Dic dic=dicMapper.selectByPrimaryKey(model.getId());
		dic.setDicName(model.getDicName());
		dic.setDicValue(model.getDicValue());
		dic.setDicTypecode(model.getDicTypecode());
		dic.setDicTypename(model.getDicTypename());
		dic.setFlag(model.getFlag());
		dic.setRemark(model.getRemark());
		dic.setModifier((String)SecurityUtils.getSubject().getPrincipal());
		dic.setModifytime(new Date());
		return dicMapper.updateByPrimaryKey(dic);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<IBDS_Dic> getDicTypeComb(){
		return dicMapper.getDicTypeComb();
	}
	
	/**
	 * 根据主键获取
	 */
	@Override
	@Transactional(readOnly=true)
	public IBDS_Dic getByPrimaryKey(Integer id) {
		return dicMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public String validation(IBDS_Dic model,boolean isEdit){
		String msg="";
		Map<String,String> param=new HashMap<>();
		param.put("value", model.getDicValue());
		param.put("name",model.getDicName());		
		param.put("typeCode",model.getDicTypecode());
		if(isEdit){
			param.put("isEdit", "true");
			param.put("id", model.getId().toString());
		}
		
		List<IBDS_Dic> lst=dicMapper.getValidation(param);
		if(lst!=null&&lst.size()>0) {
			msg="您填写的字典编码或字典名称在系统中已存在";
		}
		return msg;
	}
}
