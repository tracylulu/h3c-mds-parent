package com.h3c.mds.flowable.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeHis;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.FProjectProductRelHis;
import com.h3c.mds.finance.service.FlowableFProjectCodeService;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.entity.ProjectProductRel;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.FinanceProjectCodeService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.product.common.ProductConst;

@Service
public class FinanceProjectCodeServiceImpl implements FinanceProjectCodeService {

	private static final Logger LOG = LoggerFactory.getLogger(FinanceProjectCodeServiceImpl.class);
	@Autowired
	private FlowableFProjectCodeService flowableFProjectCodeService;
	
	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Override
	public int addProjectCode(String processInsId) {
		Date beginTime = new Date(); 
		//通过流程id查出对应的项目编码，产品编码信息
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(processInsId);
		
		if(projectCodeProcessExt != null){
			if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
				for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
					ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
					FProjectCode fProjectCode = changeProjectCode2FProjectCode(projectCodeProcessExt, projectCodeApplyExt, beginTime);
					FProjectCode oldFProjectCode = flowableFProjectCodeService.getFProjectCodeByCode(fProjectCode.getfProjno());
					if(oldFProjectCode != null){
						LOG.info(oldFProjectCode.getfProjno() + "已经存在了");
						continue;
					}
					List<FProjectProductRel> fProjectProductRelList = new ArrayList<FProjectProductRel>();
					if(projectCodeApplyExt.getProjectProductRelList() != null && projectCodeApplyExt.getProjectProductRelList().size() > 0){
						for(int j = 0; j < projectCodeApplyExt.getProjectProductRelList().size(); j++){
							FProjectProductRel fProjectProductRel =
									changeProjectProductRel2FProjectProductRel(projectCodeApplyExt.getProjectProductRelList().get(j));
							
							fProjectProductRelList.add(fProjectProductRel);
						}
					}
					flowableFProjectCodeService.addProjectCode(fProjectCode, fProjectProductRelList);
				}
			}
			
		}else{
			LOG.error("数据有问题");
		}
		
		return 0;
	}

	//项目编码适配
	private FProjectCode changeProjectCode2FProjectCode(ProjectCodeProcessExt projectCodeProcessExt, 
														ProjectCodeApplyExt projectCodeApplyExt, Date beginTime){
		FProjectCode fProjectCode = new FProjectCode();
		
		
		fProjectCode.setfObjca(projectCodeApplyExt.getProCa());//种类
		fProjectCode.setfPdtno(projectCodeApplyExt.getPdtNo());//所属pdt
		fProjectCode.setfProjno(projectCodeApplyExt.getProNumber());//项目编码
		
		//项目名称特殊处理
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			if(StringUtils.isNotBlank(projectCodeApplyExt.getBversion())){
				fProjectCode.setfProjname(projectCodeApplyExt.getProName() + projectCodeApplyExt.getBversion());//项目名称				
			}else{
				fProjectCode.setfProjname(projectCodeApplyExt.getProName());//项目名称	
			}
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			if(!projectCodeApplyExt.getProName().equals(projectCodeApplyExt.getOldProName())){
				if(StringUtils.isNotBlank(projectCodeApplyExt.getBversion())){
					fProjectCode.setfProjname(projectCodeApplyExt.getProName() + projectCodeApplyExt.getBversion());//项目名称					
				}else{
					fProjectCode.setfProjname(projectCodeApplyExt.getProName());
				}
				
			}
		}else{
			fProjectCode.setfProjname(projectCodeApplyExt.getProName());//项目名称
		}
		
		
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			if(StringUtils.isNotBlank(projectCodeApplyExt.getBversion())){
				fProjectCode.setfProjcode(projectCodeApplyExt.getProNo() + projectCodeApplyExt.getBversion());//项目代号
			}else{
				fProjectCode.setfProjcode(projectCodeApplyExt.getProNo());//项目代号
			}
			
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setfProjcode(projectCodeApplyExt.getProNo());//项目代号
		}else{
			fProjectCode.setfProjcode(projectCodeApplyExt.getProNo());//项目代号
		}
		
		fProjectCode.setfProductlineno(projectCodeApplyExt.getProProdlineNo());//所属产品线
		
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			if(StringUtils.isNotBlank(projectCodeApplyExt.getBversion())){
				fProjectCode.setfVersion(projectCodeApplyExt.getVersion() + projectCodeApplyExt.getBversion());//对应版本
			}else{
				fProjectCode.setfVersion(projectCodeApplyExt.getVersion());//对应版本
			}
			
			
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setfVersion(projectCodeApplyExt.getVersion());//对应版本
		}else{
			fProjectCode.setfVersion(projectCodeApplyExt.getVersion());//对应版本
		}
		
//		fProjectCode.setfProductno(fProductno);//服务的产品编码  此字段弃用了
		//fProjectCode.setfProductname();//服务的产品名称
		fProjectCode.setfFbizhong(projectCodeApplyExt.getProfbizhong());//分摊非运营商比重
		fProjectCode.setfBizhong(projectCodeApplyExt.getProbizhong());//分摊运营商比重
		// TODO 编码生效日期待定
		fProjectCode.setBegintime(beginTime);//编码生效日期
		fProjectCode.setfProjmng(projectCodeApplyExt.getProManager());//项目经理
		fProjectCode.setfDept(projectCodeProcessExt.getDept());//申请人部门
		fProjectCode.setfStartProjectTime(projectCodeApplyExt.getProTime());//立项时间
		fProjectCode.setfAssignPoint(projectCodeApplyExt.getProPoint());//对应的评审点
		fProjectCode.setRemark(projectCodeApplyExt.getRemark());//备注
//		fProjectCode.setCreateUser(projectCodeProcessExt.getApplyer());//创建人
		
		buildUserAndTime(fProjectCode,  projectCodeProcessExt);
//		fProjectCode.setCreateTime();//创建时间，
//		fProjectCode.setModifyUser(modifyUser);//修改人
//		fProjectCode.setModifyDate(modifyDate);//修改时间
		//fProjectCode.setfProfile(projectCodeApplyExt.getProfile());//依据材料
		fProjectCode.setBasisMaterial(projectCodeApplyExt.getBasisMaterial());//依据材料
		fProjectCode.setBasisMaterialId(projectCodeApplyExt.getBasisMaterialId());//依据材料
//		fProjectCode.setDatasource("流程写入");
		fProjectCode.setfObjcaName(projectCodeApplyExt.getProCaName());//项目类别名称
		fProjectCode.setfPdtName(projectCodeApplyExt.getPdtName());//所属pdt名称
		fProjectCode.setfProductlineName(projectCodeApplyExt.getProProdlineName());//所属产品线名称
		fProjectCode.setfAssignPoint(projectCodeApplyExt.getProPoint());//对应评审点
		fProjectCode.setfAssignPointName(projectCodeApplyExt.getProPointName());//对应评审点名称
		fProjectCode.setfBversionno(projectCodeApplyExt.getBversionNo());//产品B级内码
		fProjectCode.setfReleaseno(projectCodeApplyExt.getReleaseNo());
//		fProjectCode.setfReleasename(projectCodeApplyExt.getReleaseNo());//R级名称没存
		fProjectCode.setfBversionname(projectCodeApplyExt.getBversion());//B级名称
//		fProjectCode.setfRate(fRate);//弃用
		fProjectCode.setfOldObjca(projectCodeApplyExt.getOldProCa());//原项目类别
		fProjectCode.setfOldObjcaName(projectCodeApplyExt.getOldProCaName());//原项目类别名称
//		fProjectCode.setfOldPdtno(projectCodeApplyExt.getoldp);//pdt弃用
		fProjectCode.setfOldProjno(projectCodeApplyExt.getOldProNumber());
		fProjectCode.setfOldProjname(projectCodeApplyExt.getOldProName());
		fProjectCode.setfOldProjcode(projectCodeApplyExt.getOldProNo());//原项目代号
		fProjectCode.setfOldProductlineno(projectCodeApplyExt.getOldProProdlineNo());//原所属产品线内码
		fProjectCode.setfOldProductlineName(projectCodeApplyExt.getOldProProdlineName());//原所属产品线
		fProjectCode.setfOldReleaseno(projectCodeApplyExt.getOldReleaseNo());
//		fProjectCode.setfOldProductno(old_version_no);//服务的产品编码弃用
		fProjectCode.setfOldFbizhong(projectCodeApplyExt.getOldProfbizhong());
		fProjectCode.setfOldBizhong(projectCodeApplyExt.getOldProbizhong());
		fProjectCode.setfOldVersion(projectCodeApplyExt.getOldVersion());
		
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setMark(FlowableConst.PROJECTCODE_OPTTYPE_ADD_VALUE);//标记
			fProjectCode.setStatus(ProductConst.STATUS_ON);
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setMark(FlowableConst.PROJECTCODE_OPTTYPE_EDIT_VALUE);//标记
			fProjectCode.setStatus(ProductConst.STATUS_ON);
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setMark(FlowableConst.PROJECTCODE_OPTTYPE_DEL_VALUE);//标记
			fProjectCode.setStatus(ProductConst.STATUS_OFF);
		}
		
		
		return fProjectCode;
	}
	
	private void  buildUserAndTime(FProjectCode fProjectCode, ProjectCodeProcessExt projectCodeProcessExt){
		
		
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setCreateUser(projectCodeProcessExt.getApplyer());
			fProjectCode.setCreateTime(new Date());
			fProjectCode.setModifyDate(new Date());
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
			fProjectCode.setModifyDate(new Date());
			fProjectCode.setModifyUser(projectCodeProcessExt.getApplyer());
		}else{
			fProjectCode.setModifyDate(new Date());
			fProjectCode.setModifyUser(projectCodeProcessExt.getApplyer());
		}
	}
	
	
	//项目编码关联产品编码适配
	private FProjectProductRel changeProjectProductRel2FProjectProductRel(ProjectProductRel projectProductRel){
		FProjectProductRel fProjectProductRel = new FProjectProductRel();
		fProjectProductRel.setfProductCode(projectProductRel.getProductCode());
		fProjectProductRel.setfProjno(projectProductRel.getProjNo());
		fProjectProductRel.setRate(projectProductRel.getRate());
		fProjectProductRel.setfOldProductCode(projectProductRel.getOldProductCode());
		if(StringUtils.isNotBlank(projectProductRel.getOldRate())){
			fProjectProductRel.setfOldRate(String.valueOf(projectProductRel.getOldRate()));			
		}
		return fProjectProductRel;
	}
	
	
	@Override
	public int updateProjectCode(String processInsId) {
		Date beginTime = new Date();
		//通过流程id查出对应的项目编码，产品编码信息
				ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(processInsId);
				
				if(projectCodeProcessExt != null){
					if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
						for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
							ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
							FProjectCode fProjectCode = changeProjectCode2FProjectCode(projectCodeProcessExt, projectCodeApplyExt, beginTime);
							
							List<FProjectProductRel> fProjectProductRelList = new ArrayList<FProjectProductRel>();
							if(projectCodeApplyExt.getProjectProductRelList() != null && projectCodeApplyExt.getProjectProductRelList().size() > 0){
								for(int j = 0; j < projectCodeApplyExt.getProjectProductRelList().size(); j++){
									FProjectProductRel fProjectProductRel =
											changeProjectProductRel2FProjectProductRel(projectCodeApplyExt.getProjectProductRelList().get(j));
									fProjectProductRelList.add(fProjectProductRel);
								}
							}
							//fProjectCode.setId(id);
							flowableFProjectCodeService.updateProjectCode(fProjectCode, fProjectProductRelList);
						}
					}
					
				}else{
					LOG.error("数据有问题");
				}
		return 0;
	}

	@Override
	public int delProjectCode(String processInsId) {
		Date beginTime = new Date();
		//通过流程id查出对应的项目编码，产品编码信息
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(processInsId);
		if(projectCodeProcessExt != null){
			if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
				for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
					ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
					FProjectCode fProjectCode = changeProjectCode2FProjectCode(projectCodeProcessExt, projectCodeApplyExt, beginTime);
					
					flowableFProjectCodeService.delProjectCode(fProjectCode, projectCodeApplyExt.getRemark(), projectCodeApplyExt.getProPoint());
				}
			}
			
		}else{
			LOG.error("数据有问题");
		}
		//把数据写入财务参考信息
		return 0;
	}

	@Override
	public int handleHisProjectCode(ProjectCodeProcessExt projectCodeProcessExt) {
		Date createTime = new Date();
		if(projectCodeProcessExt != null){
			if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
				for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
					try {
						ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
						FProjectCode fProjectCode = flowableFProjectCodeService.getFProjectCodeByCode(projectCodeApplyExt.getProNumber());
						FProjectCodeHis fProjectCodeHis = new FProjectCodeHis();
						BeanUtils.copyProperties(fProjectCodeHis, fProjectCode);
						fProjectCodeHis.setId(null);
						fProjectCodeHis.setCreateTime(createTime);
						fProjectCodeHis.setCreateUser(projectCodeProcessExt.getApplyer());
						fProjectCodeHis.setModifyDate(createTime);
						fProjectCodeHis.setModifyUser(projectCodeProcessExt.getApplyer());
						List<FProjectProductRelHis> fProjectProductRelHisList = new ArrayList<FProjectProductRelHis>();
						List<FProjectProductRel> fProjectProductRelList = flowableFProjectCodeService.getFProjectProductRelListByProjectCode(projectCodeApplyExt.getProNumber());
						if(CollectionUtils.isNotEmpty(fProjectProductRelList)){
							for(int j = 0; j < fProjectProductRelList.size(); j++){
								FProjectProductRelHis fProjectProductRelHis = new FProjectProductRelHis();
								BeanUtils.copyProperties(fProjectProductRelHis, fProjectProductRelList.get(j));
								fProjectProductRelHis.setId(null);
								fProjectProductRelHisList.add(fProjectProductRelHis);
							}
						}
						//fProjectCode.setId(id);
						flowableFProjectCodeService.handleHisProjectCode(fProjectCodeHis, fProjectProductRelHisList);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}else{
			LOG.error("数据有问题");
		}
		return 0;
	}

}
