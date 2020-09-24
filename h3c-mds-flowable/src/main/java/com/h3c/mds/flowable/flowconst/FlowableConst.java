package com.h3c.mds.flowable.flowconst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowableConst {

	
	

	//执行成功（同意与不同意）
	public static final String EXE_SUCCESS = "审批成功";

	//提交成功
	public static final String SUBMIT_SUCCESS = "提交成功";
	
	public static final String SYNC_ERP_ERROR = "同步ERP数据出现异常";
	
	public static final String SYNC_FINA_ERROR = "同步财务参考信息数据出现异常";
	
	public static final String PROJECTCODE_IS_USING = "项目编码在途";
	//pdm
	public static final String GETDATAFROM_FROM_PDM = "pdm";
	
	public static final String GETDATAFROM_FROM_PDM_NOTSYNC = "pdmNotSync";
	
	public static final String GETDATAFROM_FROM_HZ = "hz";
	
	public static final String ERP_HANDLER = "系统ERP";
	
	//项目类别为产品项目
	public static final String PROJECTCODE_TYPE_PRODUCT = "0011";
	
	
	/**项目编码长度*/
	public static final Integer PROJECT_CODE_LENGTH = 7;
	
	/**产品线位数*/
	public static final Integer PRODUCT_LINE = 2;
	/**产品族位数*/
	public static final Integer PRODUCT_PROD = 5;
	
	
	/*项目编码申请的businesskey*/
	public static final String PROJECT_CODE_APPLY_BUSINESSKEY = "projectCodeApply";
	
	public static final String TEST_BUSINESS = "qingjia";
	/*同意*/
	public static final String AGREE = "同意";
	/*不同意*/
	public static final String DISAGREE = "不同意";
	
	public static final String DISAGREE_POSTFIX = "返回修改";
	/**数据处于草稿状态*/
	public static final String PROJECTCODE_STATUS_DRAFT = "0";
	/**数据处于提交申请状态*/
	public static final String PROJECTCODE_STATUS_APPLY = "1";
	/**数据生效*/
	public static final String PROJECTCODE_STATUS_EFFECTIVE = "2";
	
	//新增
	public static final String PROJECTCODE_OPTTYPE_ADD = "1";
	public static final String PROJECTCODE_OPTTYPE_ADD_VALUE = "新增";
	//修改
	public static final String PROJECTCODE_OPTTYPE_EDIT = "2";
	public static final String PROJECTCODE_OPTTYPE_EDIT_VALUE = "改变";
//	编辑
	public static final String PROJECTCODE_OPTTYPE_DEL = "3";
	public static final String PROJECTCODE_OPTTYPE_DEL_VALUE = "停用";
	//人员信息相关的
	public static final String FLOW_PRODUCT = "产品编码申请电子流";
	
	public static final String FLOW_PROJECT = "项目编码申请电子流";
	
	public static final String ROLE_FINANCE = "财务部";
	public static final String ROLE_PRODUCT_BOM = "产品与bom对应维护者";
	
	public static final String DEPT_RD = "研发";
	
	
	
	//项目编码申请流程审核者开始
	
	//申请者
	public static final String PROJECT_CODE_APPLY = "applyer";
	
	//审核者
	public static final String PROJECT_CODE_APPROVE = "approver";
	//项目经理
	public static final String PROJECT_CODE_PROJ_MNG = "projMng";
	//财务接口人
	public static final String PROJECT_CODE_FINA_INTERFACE="finaInterface";
	//财务
	public static String PROJECT_CODE_FINANCER = "financer";
	//项目管理处
	public static final String PROJECT_CODE_PROJ_OFFICE = "projOffice";
	
	//流程维护者
	public static final String PROJECT_CODE_FLOW_ADMIN = "flowAdmin";
	//项目编码申请流程审核者结束
	
	//草稿
	public static final String PROJECT_CODE_PROJ_NOTSUBMIT = "0";
	//已提交
	public static final String PROJECT_CODE_PROJ_SUBMIT = "1";
	//等待审批
	public static final String PROJECT_CODE_PROJ_OFFICE_NOTCOMPLETE = "2";
	//审批结束，生效
	public static final String PROJECT_CODE_PROJ_OFFICE_COMPLETE = "3";
	
	//默认值 在途
	public static final String PROJECT_CODE_IS_EDIT_DEFAULT = "-1";
	//草稿状态
	public static final String PROJECT_CODE_IS_EDIT_TRUE = "1";
	//废弃的流程
	public static final String PROJECT_CODE_IS_EDIT_FALSE = "0";
	//流程已经结束了
	public static final String PROJECT_CODE_IS_EDIT_END = "2";
	//任务刚提交
	public static final String TASK_STATUS_SUBMIT = "new";
	
	//任务正在处理
	public static final String TASK_STATUS_HANDLING = "deal";
	
	
	//写入erp  coa  成功
	public static final String TASK_STATUS_SAVE_TO_ERP_COA_S = "save_coa_s";
	
	//写入erp  coa  库  失败
	public static final String TASK_STATUS_SAVE_TO_ERP_COA_F = "save_coa_f";
	
	//写入  erp  inv  库  成功
	public static final String TASK_STATUS_SAVE_TO_ERP_INV_S = "save_inv_s";
	
	//写入erp  inv库  失败
	public static final String TASK_STATUS_SAVE_TO_ERP_INV_F = "save_inv_f";
	//项目编码同步到erp   coa   模块   失败
	public static final String TASK_STATUS_PROJECTCODE_TO_ERP_COA_FAIL = "project_coa_f";
	
	//项目编码数据同步到erp coa 成功
	public static final String TASK_STATUS_PROJECTCODE_TO_ERP_COA_SUCESS = "project_coa_s";
	
	
	public static final String TASK_STATUS_PRODUCTCODE_TO_ERP_COA_SUCESS = "product_coa_s";
	
	public static final String TASK_STATUS_PRODUCTCODE_TO_ERP_COA_FAIL = "product_coa_f";
	
	//产品编码数据同步到   erp  库存    成功
	public static final String TASK_STATUS_PRODUCTCODE_TO_ERP_INV_SUCESS = "product_inv_s";
	
	//产品编码数据同步到  erp  库存   失败
	public static final String TASK_STATUS_PRODUCTCODE_TO_ERP_INV_FAIL = "product_inv_f";
	
	//新增part编码同步到  erp 库存  库存   成功
	public static final String TASK_STATUS_PARTCODE_TO_ERP_INV_SUCESS = "part_inv_s";
	
	//新增part编码同步到  erp 库存  库存   失败
	public static final String TASK_STATUS_PARTCODE_TO_ERP_INV_FAIL = "part_inv_f";
	
	//新增part同步财务参考信息失败
	public static final String TASK_STATUS_PARTCODE_TO_FINA_INV_FAIL = "part_fina_f";
	//新增part同步财务参考信息成功
	public static final String TASK_STATUS_PARTCODE_TO_FINA_INV_SUCCESS = "part_fina_s";
	
	//数据已经同步到财务参考信息
//	public static final String TASK_STATUS_TO_FINANCE = "20";
	//任务处理完成
//	public static final String TASK_STATUS_COMPLETE = "30";
	
	//任务处理出现异常
	public static final String TASK_STATUS_EXCEPTION = "error";
	
	//同步项目编码到erp   coa模块
	public static final String TASK_TYPE_PROJECTCODE_COA = "projectcode_coa";
	
	//同步产品编码到erp   coa模块
	public static final String TASK_TYPE_PRODUCTCODE_COA = "productcode_coa";
	
	//同步产品编码    到erp  库存模块
	public static final String TASK_TYPE_PRODUCTCODE_INV = "productcode_inv";
	
	//同步产品编码流程的产品编码  到erp  库存模块
//	public static final String TASK_TYPE_PRODUCTCODE_INV_PEODUCTCODE = "productcode_inv_productcode";
	
	//同步产品编码流程的产品编码和bom  到erp  库存模块
//	public static final String TASK_TYPE_PRODUCTCODE_INV_PEODUCTCODEANDBOM ="productcode_inv_productcodeandbom";
	
	
	//同步新增part编码流程中的        数据到   erp   库存  模块
	public static final String TASK_TYPE_PART_INV = "partcode_inv";
		
	//同步新增part编码流程中的产品编码数据到   erp   库存  模块
//	public static final String TASK_TYPE_PART_INV_PRODUCTCODE = "partcode_inv_productcode";
	
	//同步新增part编码流程中的产品编码和bom编码到   erp  库存   模块
//	public static final String TASK_TYPE_PART_INV_PRODUCTCODEANDBOM = "partcode_inv_productcodeandbom";
	
	//同步新增part编码流程中的bom和商业模式到   erp  库存   模块
//	public static final String TASK_TYPE_PART_INV_BOMANDBUSINESS = "partcode_inv_bomandbusiness";
	
	//  同步产品编码数据到  财务参考信息和研发基本信息
	public static final String TASK_TYPE_PRODUCTCODE_FINANCE_AND_PRODUCT = "productcode_finance_product";
	
	// 同步项目编码数据到  财务参考信息和研发基本信息
	public static final String TASK_TYPE_PROJECTCODE_FINANCE_AND_PRODUCT = "projectcode_finance_product";
	
	public static final String TASK_TYPE_PARTCODE_FINANCE_AND_PRODUCT = "partcode_finance_product";
	

	//项目编码数据处理成功
	public static final String TASK_TYPE_PROJECTCODE_SUCCESS = "projectcode_s";
	
	//项目编码数据处理   失败
	public static final String TASK_TYPE_PROJECTCODE_FAIL = "projectcode_f";
	//产品编码数据处理成功
	public static final String TASK_TYPE_PRODUCTCODE_SUCCESS = "productcode_s";
	
	//产品编码数据处理   失败
	public static final String TASK_TYPE_PRODUCTCODE_FAIL = "productcode_f";
	
	//新增part编码数据处理成功
	public static final String TASK_TYPE_PARTCODE_SUCCESS = "partcode_s";
	
	//新增part编码数据处理 失败
	public static final String TASK_TYPE_PARTCODE_FAIL = "partcode_f";
	
	//每次同步part编码个数
	public static final Integer PDM_COUNT = 20;
	
	//批量插入oracle数据上限
	public static final Integer ERP_BATCH_COUNT = 10;
	
	//写入erp删除的前缀
	public static final String ERP_COA_STOP_PREFIX = "(DO NOT USE)";
	
	public static final String ERP_CUR_STATUS = "等待ERP处理--预计明天生效";
	
	//erp  coa  模块  数据  未处理
	public static final String ERP_COA_NEW = "NEW";
	
	
	//向erp  coa  模块  写入数据成功
	public static final String ERP_COA_SUCESS = "P";
	
	//向erp  库存  模块  写入数据成功
	public static final String ERP_INV_SUCESS = "E";
	//向  erp  库存  模块  写入数据  失败
	public static final String ERP_INV_FAIL = "S";
	
	public static final List<String> projectCodeUserTasks = new ArrayList<String>(){
		{
			add("usertask2");
			add("usertask4");
			add("usertask5");
			add("usertask6");
		}
	};
	
	public static final Map<String, String> curStatusDisagreeMap = new HashMap<String, String>(){
		{
			put(PROJECT_CODE_APPLY, "申请者");
			put(PROJECT_CODE_APPROVE, "审核者");
			put(PROJECT_CODE_PROJ_MNG, "项目经理");
			put(PROJECT_CODE_FINA_INTERFACE, "财务接口人");
			put(PROJECT_CODE_FINANCER,"财务");
			put(PROJECT_CODE_PROJ_OFFICE, "项目管理处");
			put(PROJECT_CODE_FLOW_ADMIN, "流程维护者");
		}
	};
	public static final Map<String, String> curStatusAgreeMap = new HashMap<String, String>(){
		{
			put(PROJECT_CODE_APPLY, "审核者");
			put(PROJECT_CODE_APPROVE, "项目经理");
			put(PROJECT_CODE_PROJ_MNG, "财务接口人");
			put(PROJECT_CODE_FINA_INTERFACE, "财务");
			put(PROJECT_CODE_FINANCER,"项目管理处");
			put(PROJECT_CODE_PROJ_OFFICE,"ERP");
		}
	};
}
