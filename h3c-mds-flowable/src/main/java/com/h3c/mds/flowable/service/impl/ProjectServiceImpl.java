package com.h3c.mds.flowable.service.impl;

import java.util.Date;
import java.util.List;

import com.h3c.mds.product.entity.Bversion_view;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.flowable.entity.ProjectCodeApplyExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.flowable.service.ProjectService;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ProjectService;
import com.h3c.mds.product.service.IBDS_ReleaseService;

@Service
public class ProjectServiceImpl implements ProjectService {

	
	private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);
	@Autowired
	private IBDS_ProjectService ibds_ProjectService;

	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Autowired
	private IBDS_ReleaseService ibds_ReleaseService;
	
	@Autowired
	private IBDS_BversionService ibds_BversionService;
	
	@Override
	@Transactional
	public int addProject(String proInsId) {

		//通过流程id查出对应的项目编码，产品编码信息
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(proInsId);
		
		if(projectCodeProcessExt != null){
			if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
				for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
					ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
					
					
					// TODO  通过内码判断，如果存在，就不添加了
					if(!(ibds_ProjectService.getProjectByCoaCode(projectCodeApplyExt.getProNumber()) != null)){
						IBDSProject project = changeProjectCode2Project(projectCodeProcessExt, projectCodeApplyExt, null);
					
						ibds_ProjectService.addIBDSProject(project);
						
						// TODO 处理与R级 B级相关的信息
						handleAddReleaseOrBVersion(projectCodeApplyExt);
						
					}else{
						LOG.error("项目编码 : " + projectCodeApplyExt.getProNumber() + " 在研发项目中已经存在");
					}
					
				}
			}
			
		}else{
			LOG.error("数据有问题");
		}
		
		return 0;
	
	}

	
	
	@Override
	public int updateProject(String proInsId) {
		//通过流程id查出对应的项目编码，产品编码信息
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(proInsId);
		
		if(projectCodeProcessExt != null){
			if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
				for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
					ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
					IBDSProject oldProject = ibds_ProjectService.getProjectByCoaCode(projectCodeApplyExt.getProNumber());
					if(oldProject != null){
						IBDSProject project = changeProjectCode2Project(projectCodeProcessExt, projectCodeApplyExt, oldProject);
						ibds_ProjectService.updateIBDSProject(project);
//						现在R 和B版本在修改流程不让修改，先注释
						handleUpdateReleaseOrBVersion(projectCodeApplyExt);
						
					}
				}
			}
			
		}else{
			LOG.error("数据有问题");
		}
		return 0;
	}

	@Override
	public int delProject(String proInsId) {
		//通过流程id查出对应的项目编码，产品编码信息
				ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(proInsId);
				if(projectCodeProcessExt != null){
					if(projectCodeProcessExt.getApplys() != null && projectCodeProcessExt.getApplys().size() > 0){
						for(int i = 0; i < projectCodeProcessExt.getApplys().size(); i++){
							ProjectCodeApplyExt projectCodeApplyExt = projectCodeProcessExt.getApplys().get(i);
							//  TODO 这里有问题
							IBDSProject oldProject = ibds_ProjectService.getProjectByCoaCode(projectCodeApplyExt.getProNumber());
							if(oldProject != null){
								IBDSProject project = changeProjectCode2Project(projectCodeProcessExt, projectCodeApplyExt, oldProject);
								ibds_ProjectService.editIBDSProject(project);
							}else{
								LOG.error("项目编码 : " + projectCodeApplyExt.getProNumber() + " 在研发项目中不存在");
							}
							//如果对应B版本
							if(StringUtils.isNotBlank(projectCodeApplyExt.getBversionNo())){
								IBDS_Bversion bversion = ibds_BversionService.getBversionByBversionCode(projectCodeApplyExt.getBversionNo());
								bversion.setProjectstatus("终止");
								ibds_BversionService.updateByCode(bversion);
								List<IBDS_Bversion> bversions = ibds_BversionService.getAllBversionByReleaseCode(bversion.getReleaseno());
								boolean flag = true;
								for(IBDS_Bversion bversion1 : bversions){
									if(!"终止".equals(bversion1.getProjectstatus())){
										flag = false;
									}
								}
								if(flag){
									IBDS_Release ibds_release = ibds_ReleaseService.selectByCode(bversion.getReleaseno());
									ibds_release.setProjectstatus("终止");
									ibds_ReleaseService.updateByPrimaryKey(ibds_release);
								}
							}else{ //对应R版本
								IBDS_Release release = ibds_ReleaseService.selectByCode(projectCodeApplyExt.getReleaseNo());
								release.setProjectstatus("终止");
								ibds_ReleaseService.updateByPrimaryKey(release);
							}
						}
					}
					
				}else{
					LOG.error("数据有问题");
				}
				return 0;
	}
	
	
	
	//处理研发项目和R级和B级的关系
		private void handleAddReleaseOrBVersion(ProjectCodeApplyExt projectCodeApplyExt){
			//   001 代表产品项目   关联B版本
			//如果有通过B版本关联，则关联B版本，否则关联R版本
			if(StringUtils.isNotBlank(projectCodeApplyExt.getBversionNo())){//关联B版本
				IBDS_Bversion bversion = ibds_BversionService.getBversionByBversionCode(projectCodeApplyExt.getBversionNo());		
				if(bversion != null){
					bversion.setProjectno(projectCodeApplyExt.getProNumber());
					ibds_BversionService.updateByCode(bversion);
				}
				
			}else{
				IBDS_Release release = ibds_ReleaseService.selectByCode(projectCodeApplyExt.getReleaseNo());
				release.setProjectno(projectCodeApplyExt.getProNumber());
				ibds_ReleaseService.updateByPrimaryKey(release);
			}
		}
		
		private void handleUpdateReleaseOrBVersion(ProjectCodeApplyExt projectCodeApplyExt){
			//如果有通过B版本关联，则关联B版本，否则关联R版本
			if(StringUtils.isNotBlank(projectCodeApplyExt.getBversionNo())){//关联B版本
					IBDS_Bversion bversion = ibds_BversionService.getBversionByBversionCode(projectCodeApplyExt.getBversionNo());		
					if(bversion != null){
						bversion.setProjectno(projectCodeApplyExt.getProNumber());
						ibds_BversionService.updateByCode(bversion);
					}
					
				}else{
					IBDS_Release release = ibds_ReleaseService.selectByCode(projectCodeApplyExt.getReleaseNo());
					if(release != null){
						release.setProjectno(projectCodeApplyExt.getProNumber());
						ibds_ReleaseService.updateByPrimaryKey(release);						
					}
				}
		}
		
		// 通用的把项目编码转化为研发项目方法
		/**
		 * @param projectCodeProcessExt
		 * @param projectCodeApplyExt
		 * @return
		 */
		private IBDSProject changeProjectCode2Project(ProjectCodeProcessExt projectCodeProcessExt, ProjectCodeApplyExt projectCodeApplyExt, IBDSProject oldProject){
			
			IBDS_Release release = ibds_ReleaseService.selectByCode(projectCodeApplyExt.getReleaseNo());
			//
			IBDSProject project = new IBDSProject();
//			project.setProjectno(ibds_ProjectService.getMaxCode());//项目内码
			handleProjectNo(projectCodeProcessExt, project, oldProject);//项目内码
			//处理中英文
			handleProjectName(projectCodeProcessExt, projectCodeApplyExt, project);//研发项目中文名称
			handleProjectTime(projectCodeProcessExt, projectCodeApplyExt, project);
			handleProjectNameOld(projectCodeProcessExt, projectCodeApplyExt, project);//研发项目曾用名
			
//			project.setEngproject(engproject);//研发项目英文名称
			handleProjectalias(projectCodeProcessExt, projectCodeApplyExt, project);
//			project.setProjectalias(projectCodeApplyExt.getProNo() + (StringUtils.isNotBlank(projectCodeApplyExt.getBversion()) ? projectCodeApplyExt.getBversion() : ""));//项目代号 + B版本
//			IfPlan
//			project.setIfplan(ifplan);//是否规划中
			project.setProjectcoacode(projectCodeApplyExt.getProNumber());//研发项目财务编码
			//  TODO 项目种类有问题，是不是一样, 我这里是通过字典吗判断的，字典码可能不一样
			project.setProjecttypeno(projectCodeApplyExt.getProCa());//项目种类
			
//			project.setPlipmtno(release.getPlipmtno());//ipmt
//			project.setPdtno(release.getPdtno());//pdt
//			project.setProdlineno(release.getProdlineno());//产品线
			
			if(release != null){
				project.setPlipmtno(release.getPlipmtno());//所属ipmt
				project.setProdlineno(release.getProdlineno());//产品线
				project.setPdtno(release.getPdtno());//所属pdt				
			}
			
			project.setDeptNo(projectCodeProcessExt.getDept());
			project.setRemark(projectCodeApplyExt.getRemark());//备注
//			project.setProjectno(projectno);//财务参考信息修改后的项目名称
			handleOptType(projectCodeProcessExt, project);
			handleProjectStatus(projectCodeProcessExt, project);
			//给个默认值
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				project.setReaders("*/huawei-3com,*/h3c,");				
			}
			return project;
		}
		
		//处理项目内码
		private void handleProjectNo(ProjectCodeProcessExt projectCodeProcessExt, IBDSProject project, IBDSProject oldProject){
			
			if(projectCodeProcessExt != null){
				if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
					project.setProjectno(ibds_ProjectService.getMaxCode());//项目内码
				}else if (FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
					project.setProjectno(oldProject.getProjectno());//项目内码
				}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
					project.setProjectno(oldProject.getProjectno());//项目内码
				}
			}
		}
		
		//处理研发项目状态
		private void handleProjectStatus(ProjectCodeProcessExt projectCodeProcessExt, IBDSProject project){
			if(projectCodeProcessExt != null){
				if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
					project.setStatus(ProductConst.STATUS_ON);
				}else if (FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
					project.setStatus(ProductConst.STATUS_ON);
				}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
					project.setStatus(ProductConst.STATUS_OFF);
				}
			}
		}
		
		
		//处理项目名称
		private void handleProjectName(ProjectCodeProcessExt projectCodeProcessExt, ProjectCodeApplyExt projectCodeApplyExt, IBDSProject project){
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				project.setProject(projectCodeApplyExt.getProName() + 
						(StringUtils.isNotBlank(projectCodeApplyExt.getBversion()) ? projectCodeApplyExt.getBversion() : ""));//项目名称   + B版本为研发项目名称				
				project.setEngproject(projectCodeApplyExt.getProName() + 
						(StringUtils.isNotBlank(projectCodeApplyExt.getBversion()) ? projectCodeApplyExt.getBversion() : ""));
			}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
				//修改了R的中文名称走此逻辑
				if(!projectCodeApplyExt.getOldProName().equals(projectCodeApplyExt.getProName())){
					project.setProject(projectCodeApplyExt.getProName() + 
							(StringUtils.isNotBlank(projectCodeApplyExt.getBversion()) ? projectCodeApplyExt.getBversion() : ""));//项目名称   + B版本为研发项目名称				
					project.setEngproject(projectCodeApplyExt.getProName() + 
							(StringUtils.isNotBlank(projectCodeApplyExt.getBversion()) ? projectCodeApplyExt.getBversion() : ""));
				}
			}
		}
		
		private void handleProjectTime(ProjectCodeProcessExt projectCodeProcessExt, ProjectCodeApplyExt projectCodeApplyExt, IBDSProject project){
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				project.setCreatedDate(new Date());				
				project.setModifyData(new Date());
			}else{
				project.setModifyData(new Date());
			}
		}
		
		private void handleProjectNameOld(ProjectCodeProcessExt projectCodeProcessExt, ProjectCodeApplyExt projectCodeApplyExt, IBDSProject project){
			//只有修改流程才涉及到曾用名
			if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
				if(!projectCodeApplyExt.getOldProName().equals(projectCodeApplyExt.getProName())){
					if(StringUtils.isNotBlank(project.getProjectold())){
						project.setProjectold(project.getProjectold() + "," + projectCodeApplyExt.getOldProName());						
					}else{
						project.setProjectold(projectCodeApplyExt.getOldProName());	
					}
					
				}
			}
		}
		
		private void handleProjectalias(ProjectCodeProcessExt projectCodeProcessExt, ProjectCodeApplyExt projectCodeApplyExt, IBDSProject project){
			if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
				project.setProjectalias(projectCodeApplyExt.getProNo() + (StringUtils.isNotBlank(projectCodeApplyExt.getBversion()) ? projectCodeApplyExt.getBversion() : ""));//项目代号 + B版本
				
			}
			
		}
		//处理操作类型，新增，修改  ， 删除
		private void handleOptType(ProjectCodeProcessExt projectCodeProcessExt, IBDSProject project){
			if(projectCodeProcessExt != null){
				if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
					project.setMatch(FlowableConst.PROJECTCODE_OPTTYPE_ADD_VALUE);
					project.setStatus(ProductConst.STATUS_ON);
				}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
					project.setMatch(FlowableConst.PROJECTCODE_OPTTYPE_EDIT_VALUE);
					project.setStatus(ProductConst.STATUS_ON);
				}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
					project.setMatch(FlowableConst.PROJECTCODE_OPTTYPE_DEL_VALUE);
					project.setStatus(ProductConst.STATUS_OFF);
				}
			}
		}
		
		
		//处理研发项目和R级与B级的关系
		private void handleReleaseorBversion(ProjectCodeApplyExt projectCodeApplyExt){
			// TODO 这里先写死
			//如果是产品项目则关联B版本 001 代表产品项目
			if("001".equals(projectCodeApplyExt.getOldProCa())){
				
			}else{
				//关联R版本
			}
		}
}
