package com.h3c.mds.finance.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.dao.FProjectCodeMapper;
import com.h3c.mds.finance.dao.FProjectCodeViewAllMapper;
import com.h3c.mds.finance.dao.FProjectCodeViewMapper;
import com.h3c.mds.finance.dao.FProjectProductRelMapper;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeExample;
import com.h3c.mds.finance.entity.FProjectCodeExample.Criteria;
import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.finance.entity.FProjectCodeViewAll;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.finaceconst.FinanceConst;
import com.h3c.mds.finance.service.FProjectCodeService;
import com.h3c.mds.utils.TimeUtil;

@Service
public class FProjectCodeServiceImpl implements FProjectCodeService {

	private static final Logger LOG = LoggerFactory.getLogger(FProjectCodeServiceImpl.class);
	
	@Autowired
	private FProjectCodeViewMapper fProjectCodeViewMapper;
	@Autowired
	private FProjectCodeViewAllMapper fProjectCodeViewAllMapper;
	
	@Autowired
	private FProjectCodeMapper fProjectCodeMapper;
	
	@Autowired
	private FProjectProductRelMapper fProjectProductRelMapper;
	
	
	@Override
	public int addProjectCode(FProjectCode fProjectCode){
		fProjectCode.setId(null);
		return fProjectCodeMapper.insertSelective(fProjectCode);
	}
	
	@Override
	public int addProjectCodeAndProductCode(FProjectCodeView fProjectCodeView){
		
    	FProjectCode fProjectCode = new FProjectCode();
    	FProjectProductRel rel = new FProjectProductRel();
    	
    	try {
			BeanUtils.copyProperties(fProjectCode, fProjectCodeView);
			BeanUtils.copyProperties(rel, fProjectCodeView);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
    	fProjectCode.setStatus(FinanceConst.PROJECT_CODE_STATUS_ON);
//    	fProjectCode.setCreateUser();
    	fProjectCode.setCreateTime(new Date());
    	fProjectCode.setModifyDate(new Date());
    	int successNum = addProjectCode(fProjectCode);
    	rel.setId(null);
    	rel.setfProjno(fProjectCode.getfProjno());
    	fProjectProductRelMapper.insertSelective(rel);
		return successNum;
	}
	
	
	@Override
	public int editProjectCode(FProjectCode fProjectCode){
		fProjectCode.setId(null);
		fProjectCode.setModifyDate(new Date());
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(fProjectCode.getfProjno());
		return fProjectCodeMapper.updateByExampleSelective(fProjectCode, example);
	}
	
	@Override
	public Map<String, Object> getFProjectCodeByProjCodeAndProductCode(Map<String, Object> param){
		List<Map<String, Object>> list =  fProjectCodeViewMapper.getFProjectCodeByCode(param);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			//
			LOG.error("内码 " + param.get("fProjno") + " 产品编码:"  + param.get("fProductCode") + "数据有问题");
			return null;
		}
	}
	
	@Override
	public FProjectCode getFProjectCodeByProjCode(String projCode){
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(projCode);
		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)){
			return list.get(0);
		}else{
			LOG.error("项目编码内码 ：" + projCode + " 有问题");
		}
		return null;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public PageInfo<List<Map<String, Object>>> listOfProjectCode(Integer page, Integer rows, Map<String, Object> param) {
//		PageHelper.startPage(page, rows);
		int total = fProjectCodeViewMapper.countListOfProjectCode(param);
		param.put("page", (page - 1) * rows);
		param.put("rows", rows);
		List<Map<String, Object>> resList = changeProjectCodeDate(fProjectCodeViewMapper.listOfProjectCode(param));
		PageInfo pageInfo = new PageInfo();
		pageInfo.setList(resList);
		pageInfo.setTotal(total);
		return pageInfo;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public PageInfo<List<Map<String, Object>>> listOfProjectCodeAll(Integer page, Integer rows, Map<String, Object> param) {
//		PageHelper.startPage(page, rows);
		int total = fProjectCodeViewAllMapper.countListOfProjectCodeAll(param);
		param.put("page", (page - 1) * rows);
		param.put("rows", rows);
		
		List<Map<String, Object>> resList = changeProjectCodeDate(fProjectCodeViewAllMapper.listOfProjectCodeAll(param));
		PageInfo pageInfo = new PageInfo();
		pageInfo.setList(resList);
		pageInfo.setTotal(total);
		return pageInfo;
	}
	@Override
	public List<Map<String, Object>> listOfProjectCodeByPdt(Map<String, Object> param) {
		return changeProjectCodeDate(fProjectCodeViewMapper.listOfProjectCodeByPdt(param));
	}

	
	@Override
	public List<Map<String, Object>> listOfProjectCodeByProjType(Map<String, Object> param){
		return changeProjectCodeDate(fProjectCodeViewMapper.listOfProjectCodeByProjType(param));
	}
	
	@Override
	public List<Map<String, Object>> listOfProjectCodeByProd(Integer page, Integer rows, String searchParams){
		PageHelper.startPage(page, rows);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("searchParams", searchParams);
		return changeProjectCodeDate(fProjectCodeViewMapper.listOfProjectCodeByProd(param));
	}

	private List<Map<String, Object>> changeProjectCodeDate(List<Map<String, Object>> resList){
		if(CollectionUtils.isNotEmpty(resList)){
			for(int i = 0; i < resList.size(); i++){
				if(resList.get(i) != null && resList.get(i).get("begintime") != null){
					resList.get(i).put("begintime", TimeUtil.getStringTime1((Date)resList.get(i).get("begintime")));					
				}
			}
		}
		return resList;
	}
	@Override
	public Map<String, Object> getProperties(Map<String, Object> param){
		return fProjectCodeViewMapper.getProperties(param).get(0);
	}
	
	@Override
	public List<FProjectCodeView> getExport(Map<String, Object> param){
		return fProjectCodeViewMapper.getExportList(param);
	}
	
	@Override
	public List<FProjectCodeViewAll> getExportAll(Map<String, Object> param){
		return fProjectCodeViewAllMapper.getExportList(param);
	}

	@Override
	public List<FProjectCodeView> getExport2(Map<String, Object> param){
		return fProjectCodeViewMapper.getExportList2(param);
	}

	@Override
	public List<FProjectCodeViewAll> getExportAll2(Map<String, Object> param){
		return fProjectCodeViewAllMapper.getExportList2(param);
	}

	@Override
	public List<Map<String, String>> getAllProdline(String state, String start, String end) {
		Map<String, Object> param = new HashMap<String, Object>();
		if(StringUtils.isBlank(state)){
			state = null;
		}
		param.put("state", state);
		param.put("start", start);
		param.put("end", end);
		return fProjectCodeViewMapper.getAllProdline(param);
	}

	@Override
	public List<Map<String, String>> getAllPdt(String state, String start, String end) {
		if(StringUtils.isBlank(state)){
			state = null;
		}
		Map<String , Object> param = new HashMap<String, Object>();
		param.put("state", state);
		param.put("start", start);
		param.put("end", end);
		return fProjectCodeViewMapper.getAllPdt(param);
	}

	@Override
	public List<Map<String, String>> getPdtByProlineno(String prolineNo, String state) {
		
		if(StringUtils.isBlank(state)){
			state = null;
		}
		
		Map<String , Object> param = new HashMap<String, Object>();
		param.put("prolineNo", prolineNo);
		param.put("state", state);
		return fProjectCodeViewMapper.getPdtByProlineno(param);
	}
}
