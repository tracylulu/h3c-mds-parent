package com.h3c.mds.product.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.util.OperationLogBatchUtils;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_ColunmConfigMapper;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ProductService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.ReleaseViewService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.common.CheckUtils;
import com.h3c.mds.utils.common.SearchParamUtils;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

@Controller
@RequestMapping("/product")
public class ReleaseController {
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private ReleaseViewService releaseViewService;

	@Autowired
	private IBDS_ReleaseService releaseService;

	@Autowired
	private OperationLogUtils<IBDS_Release> optLogUtils;

	@Autowired
	private OperationLogUtils<IBDS_Bversion> optLogUtilsBversion;

	@Autowired
	private CheckUtils checkUtils;

	@Autowired
	private IBDS_ProductService productService;
	@Autowired
	private DicService dicService;

	@Autowired
	private IBDS_BversionService ibds_BversionService;
	@Autowired
	private SearchParamUtils searchParamUtils;

	@Autowired
	private IBDS_ColunmConfigMapper colunmConfigMapper;

	@Autowired
	private OperationLogBatchUtils<IBDS_Bversion> optLogbversionUtils;

	// @Autowired
	// private ReleaseService releaseService;

	// 产品R版本树显示
	@RequestMapping("/data/prdata")
	@ResponseBody
	public Object dataList(String id, String searchParas, String[] projectStatus) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {

			type = id.substring(0, 2).toString();
		}
		System.out.print(projectStatus);
		// 查询参数放入Map中
		Map<String, Object> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchParas", searchParas);
		List<String> list = new ArrayList<String>();
		if (projectStatus != null && projectStatus.length > 0) {
			list = Arrays.asList(projectStatus);
		}
		if (list.contains("无")) {
			searchMap.put("projectStatusNull", "all");
		}
		searchMap.put("projectStatus", projectStatus);

		searchMap = searchParamUtils.setReleaseSearchParam(type, searchMap, id);

		// 根据不同参数查询R版本树
		List<ReleaseView> lstRd = releaseViewService.getPDT(searchMap);

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != null && type.equals("PT") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

	// 产品R版本树显示 父级不显示为多列
	@RequestMapping("/data/prTreedata")
	@ResponseBody
	public Object dataTreeLst(String id, String searchParas, String[] projectStatus) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {

			type = id.substring(0, 2).toString();
		}
		System.out.print(projectStatus);
		// 查询参数放入Map中
		Map<String, Object> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchParas", searchParas);
		List<String> list = new ArrayList<String>();
		if (projectStatus != null && projectStatus.length > 0) {
			list = Arrays.asList(projectStatus);
		}
		if (list.contains("无")) {
			searchMap.put("projectStatusNull", "all");
		}
		searchMap.put("projectStatus", projectStatus);

		searchMap = searchParamUtils.setReleaseSearchParam(type, searchMap, id);

		// 根据不同参数查询R版本树
		List<ReleaseView> lstRd = releaseViewService.getRelease(searchMap);

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != null && type.equals("PT") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

	/**
	 * 产品R版本 右侧详细页显示
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/prop/prdata")
	@ResponseBody
	public String gridList(String code, Integer id) {
		return colunmConfigService.buildPropertygrid(code,
				id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
	}

	/**
	 * 新增保存
	 * 
	 * @param relea
	 */
	@RequestMapping(value = "/data/pradd", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult addsubmit(IBDS_Release release) {
		Map<String, Object> result = new HashMap<>();

		// 校验名称是否重复
		Map<String, String> para = new HashMap<>();
		para.put("tableName", "IBDS_RELEASE");
		para.put("column", "Release");
		para.put("value", release.getRelease());

		String msg = checkUtils.repeatCheck(para, "产品R级中文名称");
		if (msg != null && msg != "") {
			result.put("success", false);
			result.put("msg", msg);
			return ResponseResult.fail(false, msg);
		}
		release.setCreateUser(UserUtil.getUserId());
		release.setCreateDate(new Date());
		int count = releaseService.create(release);

		if (count > 0) {
			/* result= "{\"success\":true,\"msg\":\"新增保存成功\"}"; */
			result.put("success", true);
			result.put("msg", "新增保存成功");
			// 添加操作日志
			optLogUtils.RecordOpearteLog(null, release, release.getReleaseno());
			// 产品R级申请生效后自动生成B版本[l1(1] 为B01的产品B级
			// 校验名称是否重复
			/*
			 * Map<String, String> para1 = new HashMap<>(); para1.put("tableName",
			 * "IBDS_Bversion"); para1.put("column", "BVersionCName"); para1.put("value",
			 * release.getRelease()+"B01");
			 * 
			 * String msgBv = checkUtils.repeatCheck(para1, "产品B级"); if (msgBv != null &&
			 * msgBv != "") { return ResponseResult.fail(false,msgBv); }
			 */
			// 新增B01 B01自动带R版本的角色：se、项目操作员POP、开发代表、PQA、CMO
			IBDS_Bversion version = new IBDS_Bversion();
			// 销售产品 +B01，其他类型不加
			IBDS_Product product = productService.getByProductNo(release.getProductno());
			// 取字典配置35
			Map<String, String> param = new HashMap<>();
			param.put("typeCode", "35");
			List<IBDS_Dic> dic = dicService.getDic(param);
			if (product != null && dic != null) {
				for (IBDS_Dic ibds_Dic : dic) {
					if (StringUtil.isNotEmpty(product.getProducttype())
							&& ibds_Dic.getDicValue().contains(product.getProducttype())) {
						version.setBversioncname("B01");
						version.setBversionename("B01");
					}
				}
			}
			// 为空置为""
			if (StringUtil.isEmpty(version.getBversioncname())) {
				version.setBversioncname("");
				version.setBversionename("");
			}
			version.setPdtno(release.getPdtno());
			version.setPlipmtno(release.getPlipmtno());
			version.setVersionno(release.getVersionno());
			version.setReleaseno(release.getReleaseno());
			version.setProdlineno(release.getProdlineno());
			version.setProductno(release.getProductno());
			version.setCreatedUser(UserUtil.getUserId());
			version.setCreatedDate(new Date());
			version.setStatus(ProductConst.STATUS_ON);
			version.setBversionno(ibds_BversionService.getMaxCode());
			version.setSe(release.getSystemMnger());
			version.setPopId(release.getPopId());
			version.setRndpdtId(release.getRndpdtId());
			version.setQualityMnger(release.getQualityMnger());
			version.setCmoId(release.getCmoId());
			version.setReaders(BasicinfoConst.remarks);
			ibds_BversionService.addBversion(version);

			version.setBversioncname(
					release.getRelease() == null ? "" : release.getRelease() + version.getBversioncname());
			version.setBversionename(
					release.getEngrelease() == null ? "" : release.getEngrelease() + version.getBversionename());

			optLogUtilsBversion.RecordOpearteLog(null, version, version.getBversionno());
			return ResponseResult.success(true, "新增R版本成功");

		} else {

			return ResponseResult.fail(msg);
		}
	}

	/**
	 * 修改保存
	 * 
	 * @param relea
	 */
	@RequestMapping(value = "/data/predit", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult editsubmit(IBDS_Release release) {
		try {
			// 校验名称是否重复
			Map<String, String> para = new HashMap<>();
			para.put("tableName", "IBDS_RELEASE");
			para.put("column", "Release");
			para.put("value", release.getRelease());
			para.put("isEdit", "True");
			para.put("Key", "ID");
			para.put("KeyValue", release.getId().toString());

			String msg = checkUtils.repeatCheck(para, "产品R级中文名称");
			if (msg != null && msg != "") {
				return ResponseResult.fail(false, msg);
			}

			IBDS_Release bfe = colunmConfigService.selectByPrimaryKey(release.getId(), release.getReleaseno());
			release.setModifyUser(UserUtil.getUserId());
			release.setModifyDate(new Date());
			int count = releaseService.update(release);
			// 记录日志
			optLogUtils.RecordOpearteLog(bfe, release, release.getReleaseno());

			if (!bfe.getRelease().equals(release.getRelease())
					|| !bfe.getEngrelease().equals(release.getEngrelease())) {
				List<IBDS_Bversion> bef = ibds_BversionService.getAllBversionByReleaseCode(release.getReleaseno());
				// 拼接日志记录
				List<IBDS_Bversion> lst1 = new ArrayList<>();
				List<IBDS_Bversion> beflst = new ArrayList<>();
				StringBuilder lstStr = new StringBuilder();
				for (IBDS_Bversion ibds_Bversion : bef) {
					IBDS_Bversion bversion = new IBDS_Bversion();
					bversion.setId(ibds_Bversion.getId());
					bversion.setBversionno(ibds_Bversion.getBversionno());
					bversion.setBversioncname((release.getRelease() == null ? "" : release.getRelease())
							+ ibds_Bversion.getBversioncname());
					bversion.setBversionename((release.getEngrelease() == null ? "" : release.getEngrelease())
							+ (ibds_Bversion.getBversionename() == null ? "" : ibds_Bversion.getBversionename()));
					bversion.setModifyData(new Date());
					bversion.setModifyUser(UserUtil.getUserId());
					lstStr.append(ibds_Bversion.getBversionno() + ",");
					lst1.add(bversion);

					IBDS_Bversion bversionBef = new IBDS_Bversion();
					bversionBef.setBversioncname(
							(bfe.getRelease() == null ? "" : bfe.getRelease()) + ibds_Bversion.getBversioncname());
					bversionBef.setBversionename((bfe.getEngrelease() == null ? "" : bfe.getEngrelease())
							+ (ibds_Bversion.getBversionename() == null ? "" : ibds_Bversion.getBversionename()));
					bversionBef.setId(ibds_Bversion.getId());
					bversionBef.setBversionno(ibds_Bversion.getBversionno());
					beflst.add(bversionBef);
				}
				// 批量添加操作日志
				Map<String, Object> param = new HashMap<>();
				param.put("code", lstStr);
				param.put("type", "MODIFY");
				optLogbversionUtils.LstOperateLog(beflst, lst1, param);
			}
			return ResponseResult.success(true, "修改保存成功");
		} catch (Exception e) {
			return ResponseResult.fail(false, "保存失败，请联系管理员！");
		}
	}

	// 参照框产品树展示
	@RequestMapping("/release/selectByMap")
	@ResponseBody
	public Object selectByMap(String id, String code, String sub_code) {
		// 查询参数放入Map中
		String projectStatus = id;
		String type = "PR";
		Map<String, String> param = new HashMap<>();
		param.put("type", type);
		param.put("code", code);
		param.put("sub_code", sub_code);
		param.put("proStatus", projectStatus);
		// 获取当前用户角色 下拉框数据权限
		Subject subject = SecurityUtils.getSubject();
		// 获取session 角色
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		// 获取session 用户
		User attributeUser = (User) subject.getSession().getAttribute("current_user");
		// 需特殊处理的权限
		if (type.toUpperCase() == "PI") {// IPMT执行秘书只能显示自己的数据，即配置了IPMT执行秘书为自己的数据
			if (roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		} else if (type.toUpperCase() == "PT") {// POP权限需特殊处理 只显示当前POP为自己的数据
			if (roleCode.contains("R_000003") && !roleCode.contains("R_000002") && !roleCode.contains("R_000001")) {
				param.put("sub_user", attributeUser.getCode());
			}
		}

		// 根据不同参数查询R版本树
		List<IBDS_Release> lstRd = releaseService.selectBymap(param);

		return projectStatus != null ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

	/**
	 * 根据PDT内码获取R级人员汇总信息
	 * 
	 * @return
	 */
	@RequestMapping("/release/data")
	@ResponseBody
	public String getPDTByReleaseUser(String code, String[] projectStatus) {
		IBDS_ReleaseExample example = new IBDS_ReleaseExample();
		IBDS_ReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPdtnoEqualTo(code);
		criteria.andStatusEqualTo("1");
		// 根据筛选器获取对应状态的R版本信息
		List<String> statusLst = new ArrayList<>();
		for (String status : projectStatus) {
			statusLst.add(status);
		}
		criteria.andProjectstatusIn(statusLst);
		// 查询参数放入Map中
		Map<String, Object> searchMap = new HashMap<>();
		searchMap.put("id", code);
		searchMap.put("type", "PT");
		List<String> list = new ArrayList<String>();
		if (projectStatus != null && projectStatus.length > 0) {
			list = Arrays.asList(projectStatus);
		}
		if (list.contains("无")) {
			searchMap.put("projectStatusNull", "all");
		}
		searchMap.put("projectStatus", projectStatus);
		List<ReleaseView> lstRelease = releaseViewService.getPDT(searchMap);

		// List<IBDS_Release> lstRelease = releaseService.getByExample(example);
		IBDS_Release release = new IBDS_Release();
		for (ReleaseView ibds_Release : lstRelease) {
			release.setPopId(resData(release.getPopId(), ibds_Release.getPopId()));
			release.setProductMnger(resData(release.getProductMnger(), ibds_Release.getProductMnger()));
			release.setRndpdtId(resData(release.getRndpdtId(), ibds_Release.getRndpdtId()));
			release.setSalesMnger(resData(release.getSalesMnger(), ibds_Release.getSalesMnger()));
			release.setFinpdtId(resData(release.getFinpdtId(), ibds_Release.getFinpdtId()));
			release.setPurchaseMnger(resData(release.getPurchaseMnger(), ibds_Release.getPurchaseMnger()));
			release.setManufactureMnger(resData(release.getManufactureMnger(), ibds_Release.getManufactureMnger()));
			release.setPppdtId(resData(release.getPppdtId(), ibds_Release.getPppdtId()));
			release.setTechsupportMnger(resData(release.getTechsupportMnger(), ibds_Release.getTechsupportMnger()));
			release.setQualityMnger(resData(release.getQualityMnger(), ibds_Release.getQualityMnger()));
			release.setSoftmg(resData(release.getSoftmg(), ibds_Release.getSoftmg()));
			release.setHardmg(resData(release.getHardmg(), ibds_Release.getHardmg()));
			release.setDocumentsMnger(resData(release.getDocumentsMnger(), ibds_Release.getDocumentsMnger()));
			release.setEquipmentMnger(resData(release.getEquipmentMnger(), ibds_Release.getEquipmentMnger()));
			// se列显示
			release.setSe(resData(release.getSe(), ibds_Release.getSe()));
			release.setSqaId(resData(release.getSqaId(), ibds_Release.getSqaId()));
			release.setHqaId(resData(release.getHqaId(), ibds_Release.getHqaId()));
			release.setTqaId(resData(release.getTqaId(), ibds_Release.getTqaId()));
			release.setCmoId(resData(release.getCmoId(), ibds_Release.getCmoId()));
			release.setFldpde(resData(release.getFldpde(), ibds_Release.getFldpde()));
			release.setSofttestmng(resData(release.getSofttestmng(), ibds_Release.getSofttestmng()));
			release.setHardtestmng(resData(release.getHardtestmng(), ibds_Release.getHardtestmng()));
			release.setMarkettm(resData(release.getMarkettm(), ibds_Release.getMarkettm()));
			release.setOmcMnger(resData(release.getOmcMnger(), ibds_Release.getOmcMnger()));
			release.setNetmgnet(resData(release.getNetmgnet(), ibds_Release.getNetmgnet()));
			release.setNetmgpersonId(resData(release.getNetmgpersonId(), ibds_Release.getNetmgpersonId()));
			/*
			 * if (StringUtil.isNotEmpty(release.getPopId()) &&
			 * StringUtil.isNotEmpty(ibds_Release.getPopId())) { if
			 * (ibds_Release.getPopId().contains(",")) { for (String popid :
			 * ibds_Release.getPopId().split(",")) { if (StringUtil.isNotEmpty(popid) &&
			 * !release.getPopId().contains(popid)) { release.setPopId(release.getPopId() +
			 * "," + popid); } } } else { if
			 * (!release.getPopId().contains(ibds_Release.getPopId())) {
			 * release.setPopId(release.getPopId() + "," + ibds_Release.getPopId()); } } }
			 * else { release.setPopId(StringUtil.isEmpty(ibds_Release.getPopId()) ? "" :
			 * (release.getPopId() + ",") + ibds_Release.getPopId()); }
			 */
			// release.setPopId(release.getPopId() == null ? "" : (release.getPopId() + ",")
			// + ibds_Release.getPopId());
		}
		// 新增TR类型 代表获取PDT下面所有R级成员信息
		List<Map<String, String>> lists = colunmConfigMapper.getColunmConfig("TR");

		Map<String, String> param = new HashMap<>();
		param.put("code", code);

		return EasyUIJSONUtils.buildPropertygrid(lists, release);
	}

	public String resData(String resData, String strData) {
		if (StringUtil.isNotEmpty(resData) && StringUtil.isNotEmpty(strData)) {
			if (strData.contains(",")) {
				for (String popid : strData.split(",")) {
					if (StringUtil.isNotEmpty(popid) && !resData.contains(popid)) {
						resData += "," + popid;
					}
				}
			} else {
				if (!resData.contains(strData)) {
					resData += "," + strData;
				}
			}
		} else {
			resData = (StringUtil.isNotEmpty(resData) ? resData : "") + (StringUtil.isNotEmpty(strData) ? strData : "");
		}
		return resData;
	}

}
