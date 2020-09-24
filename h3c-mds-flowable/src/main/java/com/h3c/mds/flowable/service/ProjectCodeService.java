package com.h3c.mds.flowable.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.flowable.task.api.Task;

import com.h3c.mds.flowable.entity.ExcelProjectCodeModel;
import com.h3c.mds.flowable.entity.ProcessConfigPerson;
import com.h3c.mds.flowable.entity.ProjectCodeApply;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcess;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.entity.ProjectProductRel;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Release;

public interface ProjectCodeService {

	/**
	 * 增加项目编码和对应的产品编码
	 * @param projectCodeApply
	 * @param projectProductRelList
	 * @return
	 */
	public int addProjectCode(ProjectCodeApply projectCodeApply, List<ProjectProductRel>  projectProductRelList);
	
	/**
	 * 处理表单提交  开启事务
	 * @param projectCodeProcessExt
	 * @param proInsId
	 * @return
	 */
	public String addProjectCodeTrans(ProjectCodeProcessExt projectCodeProcessExt, String proInsId, String userId);
	
	
	/**
	 * 审核者审批  开启事务
	 * @param proInsId
	 * @param status
	 * @param taskId
	 * @param suggest
	 * @param projectCodeData
	 * @return
	 */
	public String approveApplyTrans(String proInsId, String status, String taskId, String suggest, String projectCodeData, String userId);
	
	
	/**
	 * 项目经理审核
	 * @param proInsId
	 * @param status
	 * @param taskId
	 * @param suggest
	 * @return
	 */
	public String projectMngApplyTrans(String proInsId, String status, String taskId, String suggest, String userId);
	
	
	/**
	 * //财务接口人审批   事务
	 * @param proInsId
	 * @param status
	 * @param taskId
	 * @param suggest
	 * @return
	 */
	public String financeInterfaceApplyTrans(String proInsId, String status, String taskId, String suggest, String userId);
	
	
	
	/**
	 * //财务审批  开启事务
	 * @param proInsId
	 * @param status
	 * @param taskId
	 * @param suggest
	 * @return
	 */
	public String financerApplyTrans(String proInsId, String status, String taskId, String suggest, String userId);
	
	
	//
	/**
	 * 项目管理处审批
	 * @param proInsId
	 * @param status
	 * @param taskId
	 * @param suggest
	 * @return
	 */
	public void projectOfficeApplyTrans(String proInsId, String status, String taskId, String suggest, String userId);
	
	/**
	 * 向财务参考信息和研发基本信息中写入数据
	 * @param projectCodeProcessExt
	 * @return
	 */
	public String handleFinanceAndProject(String proInsId);
	
	/**
	 * 向财务参考信息和历史记录中写入数据
	 * @param proInsId
	 * @return
	 */
	public String handleHisFinance(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 新增项目编码表单里面的数据
	 * @param projectCodeApplyExt
	 * @return
	 */
	public int addProjectCodeExt(ProjectCodeApplyExt projectCodeApplyExt);
	
	/**
	 * 新增, 修改流程，项目，产品编码相关数据
	 * @param projectCodeProcessExt
	 * @return
	 */
	public int addProjectCodeProcessExtForAddOrEdit(ProjectCodeProcessExt projectCodeProcessExt, String status);
	
	/**
	 * 删除流程，项目，产品编码相关数据
	 * @param projectCodeProcessExt
	 * @return
	 */
	public int addProjectCodeProcessExtForDel(ProjectCodeProcessExt projectCodeProcessExt, String status);
	
	/**
	 * 保存草稿数据
	 * @param projectCodeProcessExt
	 * @param userId
	 * @return
	 */
	public  int saveDraftFormData(ProjectCodeProcessExt projectCodeProcessExt, String userId);
	/**
	 * 更新项目编码和对应的产品编码
	 * @param projectCodeApply
	 * @param projectProductRelList
	 * @return
	 */
//	public int updateProjectCode(ProjectCodeApply projectCodeApply, List<ProjectProductRel>  projectProductRelList);
	
	/**
	 * 更新流程  项目编码和对应的产品编码
	 * @param projectCodeApply
	 * @param projectProductRelList
	 * @return
	 */
	public int updateProjectCodeProcess(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 删除项目编码和对应的产品编码
	 * @param projectCodeApply
	 * @param projectProductRelList
	 * @return
	 */
//	public int delProjectCode(List<String> productCodeList);
	
	
	/**
	 * 项目名称是否存在，如果存在在返回true，反之返回false
	 * @param projname
	 * @return
	 */
	public boolean hasProjectCode(String projName);
	
	/**
	 * 项目是否处于草稿状态
	 * @param projName
	 * @return
	 */
	public boolean isProjectCodeApply(String projName);
	
	/**
	 * 获取当前处理节点，为了控制前台是否显示出来
	 * @return
	 */
	public String getCurrentHandler(String proInsId, String userId);
	
	/**
	 * 通过流程实例id获取当前流程和表单数据
	 * @param proInsId
	 * @return
	 */
	public ProjectCodeProcessExt getCurProjectCodeProcessExtByProcessId(String proInsId);
	
	public ProjectCodeProcess getCurProjectCodeProcessByProcessId(String proInsId);
	
	/**
	 * 通过申请编号获取当前流程和表单数据
	 * @param applyNo
	 * @return
	 */
	public ProjectCodeProcessExt getCurProjectCodeProcessExtByApplyNo(String applyNo); 
	
	//项目编码申请流程目前没有太复杂节点，一个流程一个时间点只能由一个人处理
	public Task getCurTaskByProInsId(String proInsId, String userId);
	
	public Task getCurTaskByProInsId(String proInsId);
	
	/**
	 * 通过申请单删除流程相关的表单数据
	 * @param applyNo
	 * @return
	 */
	public int delProjectCodeProcessExtByApplyNo(String applyNo);
	
	/**
	 * 删除类型的表单数据处理
	 * @param projectCodeProcessExt
	 * @return
	 */
//	public int delProjectCodeProcessExtForm(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 项目编码是否处于在途状态
	 * @param projCode
	 * @return
	 */
	public Map<String, String> isZTProjectCodeForAdd(ProjectCodeProcessExt projectCodeProcessExt);
	
	
	/**
	 * 项目编码是否处于在途状态
	 * @param projCode
	 * @return
	 */
	public Map<String, String> isProjectCodeEditForUpdateAndDel(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 判断R级或者B级是否在途
	 * @param projectCodeProcessExt
	 * @return
	 */
	public Map<String, String> isReleaseOrBversionEditForAdd(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 表单数据是否项目经理是同一个
	 * @param projectCodeProcessExt
	 * @return
	 */
	public boolean isSameProjMng(ProjectCodeProcessExt projectCodeProcessExt);
	
	public Map<String, String> isSamePdt(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 申请编号是否是同一个
	 * @param projectCodeProcessExt
	 * @return
	 */
	public boolean isSameApplyNo(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 项目名称是否一样
	 * @param projectCodeProcessExt
	 * @return
	 */
	public boolean isSameProjName(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * B版本或者R版本内码是否一样
	 * @param projectCodeProcessExt
	 * @return
	 */
	public boolean isSameBversionOrReleaseNo(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 判断费用分摊比例是否是100%
	 * @param projectCodeProcessExt
	 * @return
	 */
	public Map<String, String> handleProjectRate(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 设置当前状态
	 * @param handler
	 * @param status
	 * @return
	 */
	public String getCurStatusAndUpdateProjectCodeStatus(ProjectCodeProcess projectCodeProcess, String handler, String status, Date date, String userId);
	
	
	/**
	 * 
	 * @param proInsId
	 * @param userId
	 * @return
	 */
	public ProcessConfigPerson getCurDeal(String proInsId, String userId);
	
	/**
	 * 修改此次流程中的项目编码的状态
	 * @param projectCodeProcessExt
	 */
	public void updateProjectCodeStatusToComplete(ProjectCodeProcessExt projectCodeProcessExt);
	
	public void updateProjectCodeStatusToDraft(ProjectCodeProcess projectCodeProcess);
	
	public void updateProjectCodeStatusToDel(ProjectCodeProcessExt projectCodeProcessExt);
	
	public void deleteByApplyNo(String applyNo);
	
	/**
	 * 检查配置表中是否配置相关人员信息
	 * @param deptNo
	 * @return
	 */
	public Map<String, String> checkHandler(ProjectCodeProcessExt projectCodeProcessExt, String deptNo);
	
	/**
	 * 转单
	 * @param id
	 * @param taskId
	 * @param userId
	 */
	public void  changeHandler(String id,String taskId,String userId);
	
	/**
	 * 项目名称是否存在，
	 * @return
	 */
	public String isProjectCodeNameExist(ProjectCodeProcessExt projectCodeProcessExt);
	
	/**
	 * 同步数据出现问题  发送邮件
	 * @param projectCodeProcessExt
	 */
	public void sendSyncDataEmail(String type, ProjectCodeProcessExt projectCodeProcessExt,String content, String subject, String taskId);
	
	/**
	 * 同步数据出现问题  同步到eip
	 * @param projectCodeProcessExt
	 * @param status
	 */
	public void sendSyncEipMsg(ProjectCodeProcessExt projectCodeProcessExt, String status);
	
	/**
	 * 把excel对象转为ProjectCodeProcessExt
	 * @param excelProjectCodeModel
	 * @return
	 */
	public ProjectCodeProcessExt changeProjectCodeToProjectCodeProcessExt(List<ExcelProjectCodeModel> excelProjectCodeModelList, 
			Map<String, IBDS_Release> releaseMap, Map<String, IBDS_Bversion> bversionMap) throws Exception;
	
	/**
	 * 验证格式是否有问题
	 * @param excelProjectCodeModelList
	 */
	public void valicateProjectCodeExcel(List<ExcelProjectCodeModel> excelProjectCodeModelList);
	
	/**
	 * 验证数据是否有问题
	 * @param excelProjectCodeModelList
	 */
	public Map<String, Object> checkProjectCodeExcel(List<ExcelProjectCodeModel> excelProjectCodeModelList);
}
