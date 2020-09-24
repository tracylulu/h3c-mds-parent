package com.h3c.mds.basicinfo.basicinfoconst;

import java.util.HashMap;
import java.util.Map;

public class BasicinfoConst {

	/* 申请的businesskey */
	public static String PRODUCT_APPLY_BUSINESSKEY = "productApply";

	/* 同意 */
	public static String AGREE = "同意";
	/* 不同意 */
	public static String DISAGREE = "不同意";

	public static String DISAGREE_POSTFIX = "审核不通过";
	/** 数据处于返回修改状态 */
	public static String PRODUCT_STATUS_Return = "-1";
	/** 数据处于草稿状态 */
	public static String PRODUCT_STATUS_DRAFT = "0";
	/** 数据处于提交申请状态 */
	public static String PRODUCT_STATUS_APPLY = "1";
	/** 数据生效 */
	public static String PRODUCT_STATUS_EFFECTIVE = "2";
	/** 数据处于删除状态 */
	public static String PRODUCT_STATUS_Del = "-2";

	/** 数据处于返回修改状态 */
	public static String PRODUCT_STATUS_ReturnName = "返回修改";
	/** 数据处于草稿状态 */
	public static String PRODUCT_STATUS_DRAFTName = "草稿";
	/** 数据处于提交申请状态 */
	public static String PRODUCT_STATUS_APPLYName = "审核";
	/** 数据生效 */
	public static String PRODUCT_STATUS_EFFECTIVEName = "流程结束";
	/** 数据处于删除状态 */
	public static String PRODUCT_STATUS_DelName = "删除";

	// 新增
	public static String PRODUCT_OPTTYPE_ADD = "1";
	// 修改
	public static String PRODUCT_OPTTYPE_EDIT = "2";
	// 停用
	public static String PRODUCT_OPTTYPE_DEL = "3";

	// 新增
	public static String PRODUCT_OPTTYPE_ADDName = "新增";
	// 修改
	public static String PRODUCT_OPTTYPE_EDITName = "修改";
	// 停用
	public static String PRODUCT_OPTTYPE_DELName = "停用";

	// 申请类型 用于产品信息创建继承
	// 产品
	public static String PRODUCT_APPLYTYPE_PT = "产品信息修改";
	// VR
	public static String PRODUCT_APPLYTYPE_VR = "产品V-R信息修改";
	// R级以下
	public static String PRODUCT_APPLYTYPE_PR = "产品R级以下信息修改";

	// 最大内码前缀设置
	// 产品
	public static String PRODUCT_Prefix_PT = "ProductApply";
	// R级以下
	public static String PRODUCT_Prefix_PR = "PrBelowApply";

	public static String remarks = "*/huawei-3com, */h3c";

	/*
	 * 申请单号 key
	 * 
	 * 为了系统多个操作共享一个变量 用于特性 子系统 模块
	 */
	public static final Map<String, StringBuilder> sbSubsystemMap = new HashMap<String, StringBuilder>();

	// 子系统内码前缀
	public static String subsystem_Prefix = "SS";
	// 特性内码前缀
	public static String feature_Prefix = "FT";
	// 模块内码前缀
	public static String module_Prefix = "MD";

}
