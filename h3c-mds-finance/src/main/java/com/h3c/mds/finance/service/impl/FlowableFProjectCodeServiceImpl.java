package com.h3c.mds.finance.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.dao.FProjectCodeHisMapper;
import com.h3c.mds.finance.dao.FProjectCodeMapper;
import com.h3c.mds.finance.dao.FProjectCodeViewMapper;
import com.h3c.mds.finance.dao.FProjectProductRelHisMapper;
import com.h3c.mds.finance.dao.FProjectProductRelMapper;
import com.h3c.mds.finance.dao.ProjectCodeProductCodeViewMapper;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeExample;
import com.h3c.mds.finance.entity.FProjectCodeExample.Criteria;
import com.h3c.mds.finance.entity.FProjectCodeHis;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.FProjectProductRelExample;
import com.h3c.mds.finance.entity.FProjectProductRelHis;
import com.h3c.mds.finance.finaceconst.FinanceConst;
import com.h3c.mds.finance.service.FlowableFProjectCodeService;

@Service
public class FlowableFProjectCodeServiceImpl implements FlowableFProjectCodeService {

	private static final Logger LOG = LoggerFactory.getLogger(FlowableFProjectCodeServiceImpl.class);
	@Autowired
	private FProjectCodeMapper fProjectCodeMapper;
	@Autowired
	private FProjectCodeHisMapper fProjectCodeHisMapper;
	
	@Autowired
	private ProjectCodeProductCodeViewMapper projectCodeProductCodeViewMapper;
	
	@Autowired
	private FProjectProductRelMapper fProjectProductRelMapper;
	
	@Autowired
	private FProjectProductRelHisMapper fProjectProductRelHisMapper;
	@Autowired
	private FProjectCodeViewMapper fProjectCodeViewMapper;
	
	@Override
	public int addProjectCode(FProjectCode FProjectCode , List<FProjectProductRel> fProjectProductRelList) {
		int successNum = -1;
		try {
			successNum = fProjectCodeMapper.insertSelective(FProjectCode);
			if(fProjectProductRelList != null && fProjectProductRelList.size() > 0){
				for(FProjectProductRel fProjectProductRel : fProjectProductRelList){
					fProjectProductRelMapper.insertSelective(fProjectProductRel);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("写入数据库失败");
			
		}
		return successNum;
	}
	
	@Override
	public int updateProjectCode(FProjectCode fProjectCode , List<FProjectProductRel> fProjectProductRelList) {
		int successNum = -1;
		try {
			FProjectCodeExample example = new FProjectCodeExample();
			Criteria criteria = example.createCriteria();
			criteria.andFProjnoEqualTo(fProjectCode.getfProjno());
			successNum = fProjectCodeMapper.updateByExampleSelective(fProjectCode, example);
			if(fProjectProductRelList != null && fProjectProductRelList.size() > 0){
				FProjectProductRelExample fProjectProductRelExample = new FProjectProductRelExample();
				FProjectProductRelExample.Criteria fProjectProductRelExampleCriteria = fProjectProductRelExample.createCriteria();
				fProjectProductRelExampleCriteria.andFProjnoEqualTo(fProjectCode.getfProjno());
				//先把原来删除，再新增
				fProjectProductRelMapper.deleteByExample(fProjectProductRelExample);
				for(FProjectProductRel fProjectProductRel : fProjectProductRelList){
					fProjectProductRelMapper.insertSelective(fProjectProductRel);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("写入数据库失败");
			
		}
		return successNum;
	}
	
	@Override
	public int handleHisProjectCode(FProjectCodeHis fProjectCodeHis , List<FProjectProductRelHis> fProjectProductRelHisList){
		if(fProjectCodeHis != null){
			fProjectCodeHisMapper.insertAndGetId(fProjectCodeHis);			
		}
		if(CollectionUtils.isNotEmpty(fProjectProductRelHisList)){
			for(int i = 0; i < fProjectProductRelHisList.size(); i++){
				fProjectProductRelHisList.get(i).setfProjectcodeId(fProjectCodeHis.getId());
				fProjectProductRelHisMapper.insertSelective(fProjectProductRelHisList.get(i));
			}
		}
		return 0;
	}
	@Override
	public int delProjectCode(FProjectCode fProjectCode, String remark, String assignPoint){
		int successNum = -1;
		FProjectCode tmpFProjectCode = getFProjectCodeByCode(fProjectCode.getfProjno());
		tmpFProjectCode.setStatus(FinanceConst.PROJECT_CODE_STATUS_OFF);
		tmpFProjectCode.setMark(fProjectCode.getMark());
		tmpFProjectCode.setRemark(remark);
		tmpFProjectCode.setfAssignPoint(assignPoint);
		tmpFProjectCode.setModifyDate(fProjectCode.getModifyDate());
		tmpFProjectCode.setModifyUser(fProjectCode.getModifyUser());
		tmpFProjectCode.setBegintime(fProjectCode.getBegintime());
		//停用取表单最新的备注信息，业务要取
		successNum = fProjectCodeMapper.updateByPrimaryKeySelective(tmpFProjectCode);
		return successNum;
	}
	
	@Override
	public List<FProjectProductRel> getFProjectProductRelListByProjectCode(String projectCode){
		FProjectProductRelExample example = new FProjectProductRelExample();
		FProjectProductRelExample.Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(projectCode);
		return fProjectProductRelMapper.selectByExample(example);
	}
	
	@Override
	public FProjectCode getFProjectCodeByCode(String fProjno) {
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria= example.createCriteria();
		criteria.andFProjnoEqualTo(fProjno);
		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			LOG.error("项目编码异常 " + fProjno);
		}
		return null;
	}
	@Override
	public FProjectCode getFProjectCodeByName(String projName) {
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria= example.createCriteria();
		criteria.andFProjnameEqualTo(projName);
		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			LOG.error("项目编码异常 " + projName);
		}
		return null;
	}

	
	@Override
	public FProjectCode getFProjectCodeByBversonNo(String bversionNo){
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria= example.createCriteria();
		criteria.andFBversionnoEqualTo(bversionNo);
		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			LOG.error("项目编码数据异常，对应的Bversion内码数据 :  " + bversionNo);
		}
		return null;
	}
	
	@Override
	public FProjectCode getFProjectCodeByReleaseNo(String releaseNo){
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria= example.createCriteria();
		criteria.andFReleasenoEqualTo(releaseNo);
		//重要。。  只取关联R版本不关联B版本的数据
		criteria.andFBversionnoIsNull();
		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			LOG.error("项目编码数据异常，对应的release版本内码数据 :  " + releaseNo);
		}
		return null;
	}
	
	
	
	@Override
	public PageInfo<Map<String, Object>> findByPage(Integer page, Integer rows, String searchArgs){
		 PageHelper.startPage(page, rows);
		 Map<String, Object> param = new HashMap<String, Object>();
		 param.put("searchParams", searchArgs);
		 param.put("projectCodeFlow", "projectCodeFlow");
		 
	     List<Map<String, Object>> productCodes = fProjectCodeViewMapper.listOfFlowableProjectCode(param);
	     PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(productCodes);
	     return pageInfo;
	}
	
	@Override
	public List<Map<String, Object>> findProductByProjNo(String projNo){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("proNo", projNo);
		return fProjectProductRelMapper.getProductByProjectCode(param);
	}

	@Override
	public FProjectCode getFProjectCodeById(Integer id) {
		FProjectCodeExample example = new FProjectCodeExample();
		Criteria criteria= example.createCriteria();
		criteria.andIdEqualTo(id);
		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			return list.get(0);
		}else{
			LOG.error("项目编码异常 " + id);
		}
		return null;
	}
}
