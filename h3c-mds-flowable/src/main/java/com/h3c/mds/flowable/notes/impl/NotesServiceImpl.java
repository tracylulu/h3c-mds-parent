package com.h3c.mds.flowable.notes.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.finance.dao.FProjectCodeHisMapper;
import com.h3c.mds.finance.dao.FProjectCodeMapper;
import com.h3c.mds.finance.dao.FProjectProductRelHisMapper;
import com.h3c.mds.finance.dao.FProjectProductRelMapper;
import com.h3c.mds.finance.dao.NotesProjectCodeMapper;
import com.h3c.mds.finance.dao.NotesProjectCodeTmpMapper;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeExample;
import com.h3c.mds.finance.entity.FProjectCodeHis;
import com.h3c.mds.finance.entity.FProjectCodeHisExample;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.FProjectProductRelExample;
import com.h3c.mds.finance.entity.FProjectProductRelHis;
import com.h3c.mds.finance.entity.FProjectProductRelHisExample;
import com.h3c.mds.finance.entity.NotesProjectCode;
import com.h3c.mds.finance.entity.NotesProjectCodeExample;
import com.h3c.mds.finance.entity.NotesProjectCodeTmp;
import com.h3c.mds.finance.service.FProjectCodeService;
import com.h3c.mds.flowable.dao.IbdsInitLogMapper;
import com.h3c.mds.flowable.entity.IbdsInitLog;
import com.h3c.mds.flowable.entity.IbdsInitLogExample;
import com.h3c.mds.flowable.notes.NotesService;
import com.h3c.mds.product.dao.IBDSNotesReleaseTempMapper;
import com.h3c.mds.product.entity.IBDSNotesReleaseTemp;
import com.h3c.mds.product.entity.IBDSNotesReleaseTempExample;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IbdsErrorCode;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.FlowableBversionService;
import com.h3c.mds.product.service.FlowableReleaseService;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.IbdsErrorCodeService;

@Service
public class NotesServiceImpl implements NotesService{

	public final String PROJECTCODE_INIT_TYPE="projectCode";
	
	public final String PROJECTCODE_IS_INIT = "1";
	
	public final String PROJECTCODE_NOT_INIT = "0";
	@Autowired
	private NotesProjectCodeMapper  notesProjectCodeMapper;
	
	@Autowired
	private FProjectCodeService fProjectCodeService;
	@Autowired
	private DicService dicService;
	@Autowired
	private IBDS_ReleaseService ibds_ReleaseService;
	@Autowired
	private FProjectCodeMapper fProjectCodeMapper;
	@Autowired
	private FProjectCodeHisMapper fProjectCodeHisMapper;
	@Autowired
	private FProjectProductRelMapper fProjectProductRelMapper;
	
	@Autowired
	private FlowableBversionService flowableBversionService;
	@Autowired
	private FlowableReleaseService flowableReleaseService;
	@Autowired
	private IbdsErrorCodeService ibdsErrorCodeService;
	@Autowired
	private IBDS_BversionService ibdsBversionService;
	@Autowired
	private NotesProjectCodeTmpMapper notesProjectCodeTmpMapper;
	@Autowired
	private IBDSNotesReleaseTempMapper ibdsNotesReleaseTempMapper;
	@Autowired
	private FProjectCodeHisMapper fprojectCodeHisMapper;
	@Autowired
	private FProjectProductRelHisMapper fProjectProductRelHisMapper;
	@Autowired
	private IbdsInitLogMapper ibdsInitLogMapper;
	private Map<String, String> objCaNameMap = new HashMap<String, String>();
	private Map<String, String> assignPointMap = new HashMap<String, String>();
	private Map<String, String> deptMap = new HashMap<String, String>();
	private Map<String, String> notesObjCaNameToObjCaNameMap = new HashMap<String, String>(){
		{
			put("产品项目","产品项目");
			put("所有项目","平台项目");
			put("平台项目","平台项目");
			put("预研项目","预研项目");
			put("技术开发项目","预研项目");
			put("解决方案","解决方案项目");
			put("其他","其他项目");
			put("自产直销","其他项目");
			put("所有产品","其他项目");
			put("合作项目","其他项目");
			put("SMB","产品项目");
		}
	};
	//存放所有的错误数据
	private List<NotesProjectCodeTmp> notesProjectCodeTmpList = new ArrayList<NotesProjectCodeTmp>();
	
	@Override
	@Transactional
	public boolean isInitNotesData() {
		IbdsInitLogExample example = new IbdsInitLogExample();
		IbdsInitLogExample.Criteria criteria =  example.createCriteria();
		criteria.andTypeEqualTo(PROJECTCODE_INIT_TYPE);
		List<IbdsInitLog> ibdsInitLogList =  ibdsInitLogMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(ibdsInitLogList)){
				if(PROJECTCODE_NOT_INIT.equals(ibdsInitLogList.get(0).getIsinit())){
					ibdsInitLogList.get(0).setIsinit(PROJECTCODE_IS_INIT);
					updateInitLog(ibdsInitLogList.get(0));
					return true;
				}else{
					return false;
				}
		}else{
			return false;
		}
	}

	public void updateInitLog(IbdsInitLog ibdsInitLog){
		ibdsInitLogMapper.updateByPrimaryKeySelective(ibdsInitLog);
	}
	@Override
	public boolean isExistUsingProjectCode(FProjectCode fProjectCode, FProjectProductRel FProjectProductRel){
		boolean flag = false;
		FProjectCodeExample example = new FProjectCodeExample();
		FProjectCodeExample.Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(fProjectCode.getfProjno());
		criteria.andStatusEqualTo(fProjectCode.getStatus());			
		/*if(StringUtil.isNotEmpty(fProjectCode.getStatus())){
		}*/

		List<FProjectCode> list = fProjectCodeMapper.selectByExample(example);
		if(list != null && list.size() == 1){
			flag = true;
		}
		return flag;
	}
	
	@Override
	public boolean isExistNotUsingProjectCode(FProjectCodeHis fProjectCodehis, FProjectProductRelHis FProjectProductRelHis){
		if("9030037".equals(fProjectCodehis.getfProjno())){
			System.out.println("aa");
		}
		boolean flag = false;
		/*FProjectCodeHisExample example = new FProjectCodeHisExample();
		FProjectCodeHisExample.Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(fProjectCodehis.getfProjno());
		criteria.andStatusEqualTo(fProjectCodehis.getStatus());			
		if(StringUtils.isNoneBlank(fProjectCodehis.getStatus())){
		}
		//同一批次的项目编码  编码生效时间相同
		//TODO
		criteria.andBegintimeEqualTo(fProjectCodehis.getBegintime());*/			

		Map<String, Object> param = new HashMap<String, Object>();
		
		param.put("fObjcaName", fProjectCodehis.getfObjcaName());
		param.put("fPdtName", fProjectCodehis.getfPdtName());
		param.put("fProjno", fProjectCodehis.getfProjno());
		param.put("fProjname", fProjectCodehis.getfProjname());
		param.put("fProjcode", fProjectCodehis.getfProjcode());
		param.put("fProductlineName", fProjectCodehis.getfProductlineName());
		param.put("fVersion", fProjectCodehis.getfVersion());
		param.put("fBizhong", fProjectCodehis.getfBizhong());
		param.put("fFbizhong", fProjectCodehis.getfFbizhong());
		param.put("begintime", fProjectCodehis.getBegintime());
		param.put("fProjmng", fProjectCodehis.getfProjmng());
		param.put("fStartProjectTime", fProjectCodehis.getfStartProjectTime());
		param.put("fAssignPointName", fProjectCodehis.getfAssignPointName());
		param.put("remark", fProjectCodehis.getRemark());
		param.put("fOldObjcaName", fProjectCodehis.getfOldObjcaName());
		param.put("fOldPdtName", fProjectCodehis.getfOldPdtName());
		param.put("fOldProjno", fProjectCodehis.getfOldProjno());
		param.put("fOldProjname", fProjectCodehis.getfOldProjname());
		param.put("fOldProjcode", fProjectCodehis.getfOldProjcode());
		param.put("fOldProductlineName", fProjectCodehis.getfOldProductlineName());
		param.put("fOldVersion", fProjectCodehis.getfOldVersion());
		param.put("fOldBizhong", fProjectCodehis.getfOldBizhong());
		param.put("fOldFbizhong", fProjectCodehis.getfOldFbizhong());
		
		param.put("status", fProjectCodehis.getStatus());
			
		
		
		List<FProjectCodeHis> list = fProjectCodeHisMapper.getByColumn(param);
		if(list != null && list.size() == 1){
			flag = true;
		}
		return flag;
	}

	public boolean isExistUsingProjectCodeProductRel(FProjectCode fProjectCode, FProjectProductRel FProjectProductRel){
		boolean flag = false;
		FProjectProductRelExample example = new FProjectProductRelExample();
		FProjectProductRelExample.Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(fProjectCode.getfProjno());
		criteria.andFProductCodeEqualTo(FProjectProductRel.getfProductCode());
		
		List<FProjectProductRel> list = fProjectProductRelMapper.selectByExample(example);
		
		if(list != null && list.size() == 1){
			flag = true;
		}
		return flag;
	}
	
	public boolean isExistNotUsingProjectCodeProductRel(FProjectCodeHis fProjectCodeHis, FProjectProductRelHis FProjectProductRelHis){
		boolean flag = false;
		FProjectProductRelHisExample example = new FProjectProductRelHisExample();
		FProjectProductRelHisExample.Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(fProjectCodeHis.getfProjno());
		criteria.andFProductCodeEqualTo(FProjectProductRelHis.getfProductCode());
		criteria.andFProjectcodeIdEqualTo(fProjectCodeHis.getId());
		List<FProjectProductRelHis> list = fProjectProductRelHisMapper.selectByExample(example);
		
		if(list != null && list.size() == 1){
			flag = true;
		}
		return flag;
	}
	
	public void initDic(){
		Map<String, String> param = new HashMap<String, String>();
		//项目类型
		param.put("typeCode", "6");
		List<IBDS_Dic> objCaNameList = dicService.getDic(param);
		if(CollectionUtils.isNotEmpty(objCaNameList)){
			for(int i = 0; i < objCaNameList.size(); i++){
				IBDS_Dic dic = objCaNameList.get(i);
				objCaNameMap.put(dic.getDicName(), dic.getDicValue());
			}
		}else{
			throw new RuntimeException("项目类型  没有数据");
		}
		
		
		
		//对应评审点
		param.put("typeCode", "21");
		List<IBDS_Dic> assignPointList = dicService.getDic(param);
		
		if(CollectionUtils.isNotEmpty(assignPointList)){
			for(int i = 0; i < assignPointList.size(); i++){
				IBDS_Dic dic = assignPointList.get(i);
				assignPointMap.put(dic.getDicName(), dic.getDicValue());
			}
		}else{
			throw new RuntimeException("对应评审点  没有数据");
		}
		
		//部门类型		
		param.put("typeCode", "20");
		List<IBDS_Dic> deptList = dicService.getDic(param);
		
		if(CollectionUtils.isNotEmpty(deptList)){
			for(int i = 0; i < deptList.size(); i++){
				IBDS_Dic dic = deptList.get(i);
				deptMap.put(dic.getDicName(), dic.getDicValue());
			}
		}else{
			throw new RuntimeException("部门类型  没有数据");
		}
		
	}
	
	
	@Override
	@PostConstruct
	@Transactional
	public void transAllNotesDataToFProjectCode() {
		
		if(isInitNotesData()){
			try {
				initDic();
				transUsingNotesDataToFProjectCode();
				transNotUsingNotesDataToFProjectCode();
				clearCache();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("初始化项目编码数据失败");
			}
			
		}
	}
	
	private void clearCache(){
		objCaNameMap.clear();
		assignPointMap.clear();
		deptMap.clear();
		//存放所有的错误数据
		notesProjectCodeTmpList.clear();
	}

	@Transactional
	private boolean transUsingNotesDataToFProjectCode(){

		Long startTime = System.currentTimeMillis();
		System.out.println("--------------" + (System.currentTimeMillis() - startTime));
		List<NotesProjectCode> projectCodeList =  getUsingProjectCodeFromNotes();
		//清洗部门错误数据
		handleExceptionDept(projectCodeList);
		if(CollectionUtils.isNotEmpty(projectCodeList)){
			for(int i = 0; i < projectCodeList.size(); i++){
				NotesProjectCode tmpNotesProjectCode = projectCodeList.get(i);
				// TODO 如何判断项目编码是否存在   
//				1  内码   + mark（标记）
				FProjectCode fProjectCode = buildFProjectCode(tmpNotesProjectCode);
				FProjectProductRel FProjectProductRel = buildProjectCodeAndProductCodeRel(tmpNotesProjectCode);
				
				//1 区分名称是 R还是B版本
				if(StringUtils.isNotBlank(fProjectCode.getfProjname())){
					//B版本存在
					if(StringUtils.isNotBlank(fProjectCode.getfProjname())){
						String bVersionName = endWithBversion(fProjectCode.getfProjname());
						String releaseName = fProjectCode.getfProjname().substring(0, fProjectCode.getfProjname().lastIndexOf(bVersionName));
						
						IBDS_Release release = getRelease(releaseName,tmpNotesProjectCode.getfProjno());
						if(release != null){
							String releaseNo = release.getReleaseno();
							Map<String, String> param = new HashMap<String, String>();
							param.put("releaseNo", releaseNo);
							param.put("bVersionName", bVersionName);
							
							fProjectCode.setfReleaseno(releaseNo);
							fProjectCode.setfReleasename(release.getRelease());
							
							if(StringUtils.isNotBlank(bVersionName)){
								IBDS_Bversion bversion = getBversion(releaseNo,  bVersionName,  releaseName, tmpNotesProjectCode.getfProjno());
								if(bversion != null){
									fProjectCode.setfBversionno(bversion.getBversionno());
									fProjectCode.setfBversionname(bVersionName);
								}
							}
							
						}else{
							System.err.println("找不到对应的R级，没法关联R级内码");
						}
					}
					
				}else{
					System.err.println("没有项目名称" + fProjectCode);
				}
				
				//项目编码存在
				if(!isExistUsingProjectCode(fProjectCode, FProjectProductRel)){
					fProjectCodeService.addProjectCode(fProjectCode);
					
				}
				
				//处理产品编码关联数据
				if(!isExistUsingProjectCodeProductRel(fProjectCode, FProjectProductRel)){
					fProjectProductRelMapper.insertSelective(FProjectProductRel);
				}
			}
			
			//异常数据入库
			if(CollectionUtils.isNotEmpty(notesProjectCodeTmpList)){
				System.out.println("异常数据入库开始-----------------------------------------------");
				
				for(int i = 0; i < notesProjectCodeTmpList.size(); i++){
					notesProjectCodeTmpMapper.insertSelective(notesProjectCodeTmpList.get(i));
				}
				notesProjectCodeTmpList.clear();
				System.out.println("异常数据入库结束------------------------------------------------");
			}
			
		}
		
	
		return false;
	}
	@Transactional
	private void transNotUsingNotesDataToFProjectCode() throws Exception{
		Long startTime = System.currentTimeMillis();
		System.out.println("--------------" + (System.currentTimeMillis() - startTime));
		List<NotesProjectCode> projectCodeList =  getNotUsingProjectCodeFromNotes();
		//清洗部门错误数据
		handleExceptionDept(projectCodeList);
		if(CollectionUtils.isNotEmpty(projectCodeList)){
			for(int i = 0; i < projectCodeList.size(); i++){
				NotesProjectCode tmpNotesProjectCode = projectCodeList.get(i);
				// TODO 如何判断项目编码是否存在   
//				1  内码   + mark（标记）
				FProjectCode fProjectCode = buildFProjectCode(tmpNotesProjectCode);
				FProjectCodeHis tmpFProjectCodeHis = new FProjectCodeHis();
				BeanUtils.copyProperties(tmpFProjectCodeHis, fProjectCode);
				
				
				FProjectProductRel FProjectProductRel = buildProjectCodeAndProductCodeRel(tmpNotesProjectCode);
				FProjectProductRelHis FProjectProductRelHis  = new FProjectProductRelHis();
				BeanUtils.copyProperties(FProjectProductRelHis, FProjectProductRel);
				//1 区分名称是 R还是B版本
				if(StringUtils.isNotBlank(fProjectCode.getfProjname())){
					//B版本存在
					if(StringUtils.isNotBlank(fProjectCode.getfProjname())){
						String bVersionName = endWithBversion(fProjectCode.getfProjname());
						String releaseName = fProjectCode.getfProjname().substring(0, fProjectCode.getfProjname().lastIndexOf(bVersionName));
						
						IBDS_Release release = getRelease(releaseName,tmpNotesProjectCode.getfProjno());
						if(release != null){
							String releaseNo = release.getReleaseno();
							Map<String, String> param = new HashMap<String, String>();
							param.put("releaseNo", releaseNo);
							param.put("bVersionName", bVersionName);
							
							tmpFProjectCodeHis.setfReleaseno(releaseNo);
							tmpFProjectCodeHis.setfReleasename(release.getRelease());
							
							if(StringUtils.isNotBlank(bVersionName)){
								IBDS_Bversion bversion = getBversion(releaseNo,  bVersionName,  releaseName, tmpNotesProjectCode.getfProjno());
								if(bversion != null){
									tmpFProjectCodeHis.setfBversionno(bversion.getBversionno());
									tmpFProjectCodeHis.setfBversionname(bVersionName);
								}
							}
							
						}else{
							System.err.println("找不到对应的R级，没法关联R级内码");
						}
					}
					
				}else{
					System.err.println("没有项目名称" + fProjectCode);
				}
				
				
				//项目编码存在
				// TODO 
				
				if(!isExistNotUsingProjectCode(tmpFProjectCodeHis, FProjectProductRelHis)){
					fprojectCodeHisMapper.insertAndGetId(tmpFProjectCodeHis);
				}else{
					tmpFProjectCodeHis = getFProjectCodeHisByProjectCodeAndBeginTime(fProjectCode);
				}
				//处理产品编码关联数据
//				if(!isExistNotUsingProjectCodeProductRel(tmpFProjectCodeHis, FProjectProductRelHis)){
					FProjectProductRelHis.setfProjectcodeId(tmpFProjectCodeHis.getId());
					fProjectProductRelHisMapper.insertSelective(FProjectProductRelHis);
//				}
			}
		}
	}
	
	public FProjectCodeHis getFProjectCodeHisByProjectCodeAndBeginTime(FProjectCode fProjectCode){
		FProjectCodeHisExample example = new FProjectCodeHisExample();
		FProjectCodeHisExample.Criteria criteria = example.createCriteria();
		criteria.andFProjnoEqualTo(fProjectCode.getfProjno());
		criteria.andBegintimeEqualTo(fProjectCode.getBegintime());			
		List<FProjectCodeHis> fprojectCodeHisList = fprojectCodeHisMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(fprojectCodeHisList)){
			return fprojectCodeHisList.get(0);
		}else{
			return null;
			//暂时注释掉
//			throw new RuntimeException("历史数据有异常");
		}
	}
	public void handleExceptionDept(List<NotesProjectCode> notesProjectCodeList){
		Map<String, String> deptMap = buildDeptMap();
		if(CollectionUtils.isNotEmpty(notesProjectCodeList)){
			for(int i = 0; i < notesProjectCodeList.size(); i++){
				if(deptMap.get(notesProjectCodeList.get(i).getfDept()) != null){
					notesProjectCodeList.get(i).setfDept(deptMap.get(notesProjectCodeList.get(i).getfDept()));
				}else{
					notesProjectCodeList.get(i).setfDept("研发");
				}
				
			}
		}
	}
	
	public Map<String, String> buildDeptMap(){
		Map<String, String> deptMap = new HashMap<String, String>();
		deptMap.put("其他", "其他");
		deptMap.put("市场总工办", "其它");
		return deptMap;
		
	}
	@Override
	public List<NotesProjectCode> getUsingProjectCodeFromNotes() {
		NotesProjectCodeExample example = new NotesProjectCodeExample();
		NotesProjectCodeExample.Criteria crireria =  example.createCriteria();
		//只有mark为1的数据才是有用的数据
		crireria.andMarkEqualTo("1");
		/*crireria.andMarkIsNotNull();
		crireria.andFZhuangtaiIsNotNull();
		crireria.andFZhuangtaiNotEqualTo("");*/
//		crireria.andBegintimeIsNotNull();
		example.setOrderByClause("f_projno asc");
		return notesProjectCodeMapper.selectByExample(example);
	}

	@Override
	public List<NotesProjectCode> getNotUsingProjectCodeFromNotes() {
		NotesProjectCodeExample example = new NotesProjectCodeExample();
		NotesProjectCodeExample.Criteria crireria =  example.createCriteria();
		//只有mark为1的数据才是有用的数据
		crireria.andMarkEqualTo("0");
		/*crireria.andMarkIsNotNull();
		crireria.andFZhuangtaiIsNotNull();
		crireria.andFZhuangtaiNotEqualTo("");
		crireria.andBegintimeIsNotNull();*/
		example.setOrderByClause("f_projno asc");
		return notesProjectCodeMapper.selectByExample(example);
	}
	
	@Override
	public FProjectProductRel buildProjectCodeAndProductCodeRel(
			NotesProjectCode notesProjectCode) {
		BigDecimal zero = new BigDecimal("0");
		FProjectProductRel fProjectProductRel = new FProjectProductRel();
		fProjectProductRel.setfProductCode(notesProjectCode.getfProductCode());
		fProjectProductRel.setfProjno(notesProjectCode.getfProjno());
		if(notesProjectCode.getRate() != null){
			
			if(0 == zero.compareTo(notesProjectCode.getRate())){
				fProjectProductRel.setRate(String.valueOf((zero)));
			}else{
				fProjectProductRel.setRate(String.valueOf((notesProjectCode.getRate().multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString())));							
			}
			
		}
		fProjectProductRel.setfOldProductCode(notesProjectCode.getfOldProductno());
		
		if(notesProjectCode.getfOldRate() != null){
			if(0 == zero.compareTo(notesProjectCode.getfOldRate())){
				fProjectProductRel.setfOldRate(String.valueOf(zero));
			}else{
				fProjectProductRel.setfOldRate(String.valueOf(notesProjectCode.getfOldRate().multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString()));						
			}
		}
		
		return fProjectProductRel;
	}

	@Override
	public FProjectCode buildFProjectCode(NotesProjectCode notesProjectCode) {
		
		boolean isError = false;
		BigDecimal zero = new BigDecimal("0");
		FProjectCode tmpFProjectCode = new FProjectCode();
		
		NotesProjectCodeTmp  notesProjectCodeTmp = new NotesProjectCodeTmp();
		String cause = notesProjectCode.getfProjname() + "_" + notesProjectCode.getfProjno();
		notesProjectCodeTmp.setCause(cause);
		// TODO
		if(StringUtils.isNotBlank(notesProjectCode.getfObjcaName())){
			System.out.println(notesProjectCode.getfObjcaName() +"--类别---" +  changeNotesnotesObjcaName(notesProjectCode.getfObjcaName()));
			if(objCaNameMap.containsKey(changeNotesnotesObjcaName(notesProjectCode.getfObjcaName()))){
				tmpFProjectCode.setfObjca(objCaNameMap.get(changeNotesnotesObjcaName(notesProjectCode.getfObjcaName())));
				tmpFProjectCode.setfObjcaName(changeNotesnotesObjcaName(notesProjectCode.getfObjcaName()));
			}else{
				isError = true;
				notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "----项目类别转码失败");
			}			
		}
		tmpFProjectCode.setfPdtName(notesProjectCode.getfPdtName());
		tmpFProjectCode.setfProjno(notesProjectCode.getfProjno());
		tmpFProjectCode.setfProjname(notesProjectCode.getfProjname());
		tmpFProjectCode.setfProjcode(notesProjectCode.getfProjcode());
		tmpFProjectCode.setfProductlineName(notesProjectCode.getfProductlineName());
		tmpFProjectCode.setfVersion(notesProjectCode.getfVersion());
//		tmpFProjectCode.setfProductno(notesProjectCode.getfProdno());
//		tmpFProjectCode.setProductna setPRODUCT_NAME_CN("");
//		tmpFProjectCode.setfRate(notesProjectCode.getfBili());
		if(notesProjectCode.getfBizhong() != null){
			if(0 == zero.compareTo(notesProjectCode.getfBizhong())){
				tmpFProjectCode.setfBizhong(String.valueOf(zero));
			}else{
				tmpFProjectCode.setfBizhong(String.valueOf((notesProjectCode.getfBizhong().multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString())));							
			}
		}
		if(notesProjectCode.getfFbizhong() != null){
			
			if(0 == zero.compareTo(notesProjectCode.getfFbizhong())){
				tmpFProjectCode.setfFbizhong(String.valueOf(zero));
			}else{
				tmpFProjectCode.setfFbizhong(String.valueOf((notesProjectCode.getfFbizhong().multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString())));				
			}
			
			
		}
		tmpFProjectCode.setBegintime(notesProjectCode.getBegintime());
		if(StringUtils.isNotBlank(notesProjectCode.getfProjmng())){
//			CN=guowu 02070/O=h3c
//			CN=
//			caiyouhua 06629/h3c
//			CN=luxushan 00851/O=huawei-3com
//			if(notesProjectCode.getfProjmng().startsWith("CN=")){

			if(isChinese(notesProjectCode.getfProjmng())){
				isError = true;
				notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause()+"---" + "项目经理为汉字");
			}
			notesProjectCode.setfProjmng(notesProjectCode.getfProjmng().replaceAll("CN=", "").replace("/O=h3c", "").replace("/O=huawei-3com", "").replace("/h3c", ""));
//			}
			tmpFProjectCode.setfProjmng(notesProjectCode.getfProjmng());			
		}
		//  TODO
		if(StringUtils.isNotBlank(notesProjectCode.getfDept())){
			if(deptMap.containsKey(notesProjectCode.getfDept())){
				tmpFProjectCode.setfDept(deptMap.get(notesProjectCode.getfDept()));			
			}else{
				isError = true;
				notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "----------" + "部门转码失败");
			}			
		}
		tmpFProjectCode.setfStartProjectTime(notesProjectCode.getfStartProjectTime());
		
		// TODO
		if(StringUtils.isNotBlank(notesProjectCode.getfAssignPointName())){
			if(assignPointMap.containsKey(notesProjectCode.getfAssignPointName())){
				tmpFProjectCode.setfAssignPoint(assignPointMap.get(notesProjectCode.getfAssignPointName()));
				tmpFProjectCode.setfAssignPointName(notesProjectCode.getfAssignPointName());
			}else{
				isError = true;
				notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "----------" + "对应评审点转码失败");
			}
			
		}
		tmpFProjectCode.setRemark(notesProjectCode.getRemark());
		tmpFProjectCode.setMark(notesProjectCode.getfZhuangtai());
		// TODO
		
		if(StringUtils.isNotBlank(notesProjectCode.getfOldObjcaName())){
			/*if(objCaNameMap.containsKey(notesProjectCode.getfOldObjcaName())){
				tmpFProjectCode.setfOldObjca(objCaNameMap.get(notesProjectCode.getfOldObjcaName()));	
				tmpFProjectCode.setfOldObjcaName(notesProjectCode.getfOldObjcaName());	
			}else{
				isError = true;
				notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "----原项目类别转码失败");
			}*/
			
			if(objCaNameMap.containsKey(changeNotesnotesObjcaName(notesProjectCode.getfOldObjcaName()))){
				tmpFProjectCode.setfOldObjca(objCaNameMap.get(changeNotesnotesObjcaName(notesProjectCode.getfOldObjcaName())));
				tmpFProjectCode.setfOldObjcaName(changeNotesnotesObjcaName(notesProjectCode.getfOldObjcaName()));
			}else{
				isError = true;
				notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "----原项目类别转码失败");
			}	
		}
		tmpFProjectCode.setfOldPdtName(notesProjectCode.getfOldPdtName());
		tmpFProjectCode.setfOldProjno(notesProjectCode.getfOldProjno());
		tmpFProjectCode.setfOldProjname(notesProjectCode.getfOldProjname());
		tmpFProjectCode.setfOldProjcode(notesProjectCode.getfOldProjcode());
		tmpFProjectCode.setfOldProductlineName(notesProjectCode.getfOldProductlineName());
		tmpFProjectCode.setfOldVersion(notesProjectCode.getfOldVersion());
//		tmpFProjectCode.setfOldProductno(notesProjectCode.getfOldProductno());
//		tmpFProjectCode.setfOldProductname(notesProjectCode.getfOldProductname());
//		tmpFProjectCode.setfOldRate(String.valueOf((notesProjectCode.getfOldRate().multiply(new BigDecimal(100)))));
		if(notesProjectCode.getfOldBizhong() != null){
			
			if(0 == zero.compareTo(notesProjectCode.getfOldBizhong())){
				tmpFProjectCode.setfOldBizhong(String.valueOf(zero));
			}else{
				tmpFProjectCode.setfOldBizhong(String.valueOf((notesProjectCode.getfOldBizhong().multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString())));							
			}
			
		}
		
		if(notesProjectCode.getfOldFbizhong() != null){
			if(0 == zero.compareTo(notesProjectCode.getfOldFbizhong())){
				tmpFProjectCode.setfOldFbizhong(String.valueOf(zero));
			}else{
				tmpFProjectCode.setfOldFbizhong(String.valueOf((notesProjectCode.getfOldFbizhong().multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString())));							
			}
		}
		if(StringUtils.isNoneBlank(notesProjectCode.getfZhuangtai())){
			if("停用".equals(notesProjectCode.getfZhuangtai())){
				tmpFProjectCode.setStatus("0");				
			}else{
				tmpFProjectCode.setStatus("1");
			}
		}else{
			notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "---" + "对应状态为空");
		}
		
		//判断产品编码数据异常
		
		if(StringUtils.isBlank(notesProjectCode.getfProductCode())){
			isError = true;
			notesProjectCodeTmp.setCause(notesProjectCodeTmp.getCause() + "---" + "产品编码为空");
		}
		
		tmpFProjectCode.setCreateUser("system");
//		tmpFProjectCode.setCreateTime(new Date());
		
		try {
			BeanUtils.copyProperties(notesProjectCodeTmp, tmpFProjectCode);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(isError){
			notesProjectCodeTmpList.add(notesProjectCodeTmp);			
		}
		
		return tmpFProjectCode;
	}
	
	private String changeNotesnotesObjcaName(String oldObjcaName){
		if(StringUtils.isNotBlank(oldObjcaName)){
			if(notesObjCaNameToObjCaNameMap.containsKey(oldObjcaName.trim())){
				return notesObjCaNameToObjCaNameMap.get(oldObjcaName.trim());
			}else{
				System.out.println("----" + oldObjcaName);
				throw new RuntimeException("项目类别匹配不上");
			}
		}
		
		return null;
	}
	public boolean isChinese(String str) {
	      Pattern p_str = Pattern.compile("[\\u4e00-\\u9fa5]+");
	      Matcher m = p_str.matcher(str);
	      if(m.find()){
	       return true;
	      }
	      return false;
	    }
	private String endWithBversion(String projectName){
		String res = "";
		String[] bArr = {"B01" ,"B02", "B03", "B04", "B05", "B06", "B07", "B08", "B09", "B10", "B11", "B12", "B13", "B14", "B15", "B16"};
		
		for(int i = 0; i < bArr.length; i++){
			if(projectName.endsWith(bArr[i])){
				res =  bArr[i];
				break;
			}
		}
		return res;
	}


	@Override
	public IBDS_Release getRelease(String name, String projectCodeNo) {
		//测试
		if("9400021".equals(projectCodeNo)){
			System.out.println("asdf");
		}
		
		
		//
		
		
		
		
		String cause = "";
		IBDS_Release release = null;
		//先取纠错表
		Map<String, String> param1 = new HashMap<String, String>();
		param1.put("type","PR");
		param1.put("name", name);
		IbdsErrorCode ibdsErrorCode = ibdsErrorCodeService.getErrorCodeByTypeAndName(param1);
		if(ibdsErrorCode != null && StringUtils.isNotBlank(ibdsErrorCode.getCode())){
			release = ibds_ReleaseService.selectByCode(ibdsErrorCode.getCode());			
		}
		
		
//		再取主表
		if(release == null){
			cause += "通过项目名称" + name + "关联不到R级";
			release = flowableReleaseService.getReleaseByName(name);
			
			if(release == null){
				release = this.getReleaseByProjectCode(projectCodeNo);
			}
			
			if(release == null && ibdsErrorCode == null){
				//插入日志
				IbdsErrorCode tmpIbdsErrorCode = new IbdsErrorCode();
				tmpIbdsErrorCode.setCreateTime(new Date());
//				tmpIbdsErrorCode.setCreateUser("lstest");
				tmpIbdsErrorCode.setType("PR");
				tmpIbdsErrorCode.setName(name);
				tmpIbdsErrorCode.setProjectcodetmp(projectCodeNo);
				ibdsErrorCodeService.addErrorCode(tmpIbdsErrorCode);
			}
		}
		
		if(ibdsErrorCode != null && StringUtils.isNotBlank(ibdsErrorCode.getCode()) && release != null){
			ibdsErrorCode.setCode(release.getReleaseno());
			ibdsErrorCodeService.updateErrorCode(ibdsErrorCode);
		}
		return release;
	}

	public IBDS_Release getReleaseByProjectCode(String projectCodeNo){
		// TODO 这个要加条件，必须保证数据准确性
		IBDSNotesReleaseTempExample example = new IBDSNotesReleaseTempExample();
		IBDSNotesReleaseTempExample.Criteria criteria =  example.createCriteria();
		criteria.andProjectcoacodeEqualTo(projectCodeNo);
		List<IBDSNotesReleaseTemp> list = ibdsNotesReleaseTempMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)){
			IBDSNotesReleaseTemp tmpIBDSNotesReleaseTemp = list.get(0);
			IBDS_Release release = new IBDS_Release();
			release.setReleaseno(tmpIBDSNotesReleaseTemp.getReleaseno());
			release.setRelease(tmpIBDSNotesReleaseTemp.getRelease());
			return release;
		}else{
			return null;
		}
	}

	@Override
	public IBDS_Bversion getBversion(String releaseNo, String bVersionName, String releaseName, String projectCodeNo) {
		IBDS_Bversion ibds_Bversion = null;
		//先取纠错表
		Map<String, String> param1 = new HashMap<String, String>();
		param1.put("type","PB");
		param1.put("name", releaseNo + "_" + bVersionName);
		IbdsErrorCode ibdsErrorCode = ibdsErrorCodeService.getErrorCodeByTypeAndName(param1);
		if(ibdsErrorCode != null && StringUtils.isNotBlank(ibdsErrorCode.getCode())){
			ibds_Bversion = ibdsBversionService.getBversionByBversionCode(ibdsErrorCode.getCode());			
		}
		//再取主表
		if(ibds_Bversion == null){
			Map<String, String> param = new HashMap<String, String>();
			param.put("releaseNo", releaseNo);
			param.put("bVersionName", bVersionName);
			ibds_Bversion = flowableBversionService.getBversionByReleaseCodeAndBversionName(param);
			
			if(ibds_Bversion == null && ibdsErrorCode == null){
				//插入日志处理
				IbdsErrorCode tmpIbdsErrorCode = new IbdsErrorCode();
				tmpIbdsErrorCode.setCreateTime(new Date());
				tmpIbdsErrorCode.setCreateUser("lstest");
				tmpIbdsErrorCode.setType("PB");
				tmpIbdsErrorCode.setName(releaseNo + "_" + bVersionName);
				tmpIbdsErrorCode.setProjectcodetmp(projectCodeNo);
				ibdsErrorCodeService.addErrorCode(tmpIbdsErrorCode);
			}
		}
		if(ibdsErrorCode != null && StringUtils.isNotBlank(ibdsErrorCode.getCode()) && ibds_Bversion != null){
			ibdsErrorCode.setCode(ibds_Bversion.getBversionno());
			ibdsErrorCodeService.updateErrorCode(ibdsErrorCode);
		}
		return ibds_Bversion;
	}
	
}
