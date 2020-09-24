package com.h3c.mds.utils;

public class ResponseMessageConst {

	//项目编码提示信息          start--------------------------------------------------------
	//保存成功
	public static String PROJECT_CODE_SAVE_OK = "保存成功";
	//保存失败
	public static String PROJECT_CODE_SAVE_ERROR = "保存失败";
	//如果是产品项目，请填写B版本
	public static String PROJECT_CODE_PRODUCT_PROJECT_BVERSION_NOT_EMPTY = "如果是产品项目，请填写B版本";
	//当前B版本在财务参考信息中已存在
	public static String PROJECT_CODE_FINANCE_EXISTS_BVERSION = "当前B版本在财务参考信息中已存在";
	//请填项目经理
	public static String PROJECT_CODE_PROJMNG = "请填项目经理";
	//项目经理必须一致
	public static String PROJECT_CODE_SAME_PROJMNG = "项目经理必须一致，建议分开提交";
	
	public static String PROJECT_CODE_SAME_CODE = "R版本或者B版本重复，请核对以后再提交";
	public static String PROJECT_CODE_SAME_PROJNAME = "项目编码名称重复，请核对以后再提交";
	
	public static String PROJECT_CODE_SAME_PDT = "R版本对应的PDT财务代表必须一致，建议分开提交";
	//请填写立项时间
	public static String PROJECT_CODE_START_PROJ_TIME = "请填写立项时间";
	//请填写对应的评审点
	public static String PROJECT_CODE_ASSIGNPOINT = "请填写对应的评审点";
	//请填写对应的版本
	public static String PROJECT_CODE_VERSION = "请填写对应的版本";
	//请填写依据材料
	public static String PROJECT_CODE_PROFILE = "请填写依据材料";
	//费用分摊运营商比重为空
	public static String PROJECT_CODE_BIZHONG_IS_EMPTY = "费用分摊运营商比重为空，请直接填写1-100的数字";
	//费用分摊非运营商比重为空
	public static String PROJECT_CODE_FBIZHONG_IS_EMPTY = "费用分摊非运营商比重为空，请直接填写1-100的数字";
	//费用分摊比重总和不是100%，请填写正确再提交申请
	public static String PROJECT_CODE_BIZHONG_NOT_100 = "费用分摊比重总和不是100%，请填写正确再提交申请";
	//费用分摊运营商比重不是数字
	public static String PROJECT_CODE_BIZHONG_NOT_NUMBER = "运营商比重，请直接填写1-100的数字";
	//费用分摊非运营商比重不是数字
	public static String PROJECT_CODE_FBIZHONG_NOT_NUMBER = "非运营商比重，请直接填写1-100的数字";
	//没有选择产品编码
	public static String PROJECT_CODE_PRODUCT_IS_EMPTY = "请选择产品编码";
	//产品编码为空
	public static String PROJECT_CODE_PRODUCT_CODE_IS_EMPTY = "产品编码为空";
	//请填写产品费用比例
	public static String PROJECT_CODE_PRODUCT_RATE = "请填写该产品分摊的费用比例，请直接填写1-100的数字";
	//同一个项目编码不能选择相同的产品编码
	public static String PROJECT_CODE_SAME_PROJECTCODE = "同一个项目编码不能选择相同的产品编码";
	
	//同一个项目编码不能选择多次
	public static String PROJECT_CODE_MUL_PROJECTCODE = "修改的项目编码重复，请修改后提交";

	//更新推荐的项目编码失败
	public static String PROJECT_CODE_RECOMMEND_UPDATE_ERROR = "更新推荐的项目编码出现问题,请联系管理员";
	//产品费用比例不是数字
	public static String PROJECT_CODE_PRODUCT_RATE_NOT_NUMBER = "该产品分摊的费用比例，请直接填写1-100的数字";
	//新填写服务产品比例总和不是100%，请填写正确再提交申请
	public static String PROJECT_CODE_PRODUCT_RATE_NOT_100 = "新填写服务产品分摊比例总和不是100%，请填写正确再提交申请";
	//项目编码projectNumver有在途未关闭的申请单，不能再提交
	public static String PROJECT_CODE_PROJECT_NUMBER = "项目编码projectNumver有在途未关闭的申请单applyno，不能再提交";
	//项目编码 projectNumver在财务参考信息中已有记录，不能再新增
	public static String PROJECT_CODE_PROJECT_NUMBER_EXIST_IN_FINANCE = "项目编码 projectNumver在财务参考信息中已有记录，不能再新增";
	//项目名称 projectName在财务参考信息中已有记录，不能再新增
	public static String PROJECT_CODE_PROJECT_NAME_EXIST_IN_FINANCE = "项目名称 projectName在财务参考信息中已有记录，不能再新增";
	//申请单号重复，已经提交过了
	public static String PROJECT_CODE_APPLYNO_EXISTS = "申请单号已经存在";
	//溢出int最大值
	public static String PROJECT_CODE_OVER_INTMAX = "数字太大了";
	//项目编码长度
	public static String PROJECT_CODE_OVER_MAX_LENGTH = "项目编码应为7位数字";
	
	public static String PROJECT_CODE_PROJECT_NUMBER_IS_EMPTY = "项目编码为空，请填写项目编码";
	
	public static String PROJECT_CODE_PROJECT_NUMBER_IS_NOT_NUMBER = "项目编码应为7位数字";
	
	
	
	
	
	
	
	
	
	
	//项目编码提示信息          end--------------------------------------------------------
}
