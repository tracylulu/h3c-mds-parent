package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.entity.Bversion_view;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.common.CheckUtils;
import com.h3c.mds.utils.common.SearchParamUtils;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

@RestController
@RequestMapping("/product")
public class BversionController {

	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;
	@Autowired
	private IBDS_ReleaseService releaseService;

	@Autowired
	private IBDS_BversionService ibds_BversionService;

	@Autowired
	private OperationLogUtils<IBDS_Bversion> optLogUtils;

	@Autowired
	private CheckUtils checkUtils;

	@Autowired
	private SearchParamUtils searchParamUtils;

	// 产品v版本树显示
	@RequestMapping("/data/pbdata")
	public Object dataList(String id, String searchParas, String projectStatus) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {
			if (id.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
				type = "PP";
			} else {
				type = id.substring(0, 2).toString();
			}
		}
		System.out.print(projectStatus);
		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchParas", searchParas);
		searchMap.put("projectStatus", projectStatus);

		searchMap = searchParamUtils.setBVersionSearchParam(type, searchMap, id);

		// 根据不同参数查询R版本树
		List<Bversion_view> lstRd = ibds_BversionService.getTreeData(searchMap);

		/*
		 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
		 * 关闭状态list2EasyUiTreeGrid_close
		 */
		return type != null && type.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

	/**
	 * 产品v版本 右侧详细页显示
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/prop/pbdata")
	public String gridList(String code, Integer id) {
		return colunmConfigService.buildPropertygrid(code,
				id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
	}

	/**
	 * 新增B级版本
	 * 
	 * @return
	 */
	@RequestMapping(value = "/data/pbadd", produces = "text/html;charset=utf-8")
	public ResponseResult addbVersion(IBDS_Bversion version) {
		// 校验名称是否重复
		Map<String, String> para = new HashMap<>();
		para.put("tableName", "IBDS_Bversion");
		para.put("column", "BVersionCName");
		para.put("value", version.getBversioncname());

		String msg = checkUtils.repeatCheck(para, "产品B级");
		if (msg != null && msg != "") {
			return ResponseResult.fail(false, msg);
		}

		version.setCreatedUser(UserUtil.getUserId());
		version.setCreatedDate(new Date());
		version.setStatus(ProductConst.STATUS_ON);
		version.setBversionno(ibds_BversionService.getMaxCode());
		ibds_BversionService.addBversion(version);

		// 添加操作日志
		optLogUtils.RecordOpearteLog(null, version, version.getBversionno());
		return ResponseResult.success(true, "新增B版本成功");
	}

	/**
	 * 更新V级信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/data/pbedit", produces = "text/html;charset=utf-8")
	public ResponseResult editBversion(IBDS_Bversion version) {
		// 获取R版本名称 校验B版本应该为R版本名称+版本
		// 校验名称是否重复
		Map<String, String> para = new HashMap<>();
		para.put("tableName", "bversion_view");
		para.put("column", "BVersionCName");
		para.put("value", version.getBversioncname());
		para.put("isEdit", "True");
		para.put("Key", "ID");
		para.put("KeyValue", version.getId().toString());

		String msg = checkUtils.repeatCheck(para, "产品B级");
		if (msg != null && msg != "") {
			return ResponseResult.fail(false, msg);
		}
		// 存 新进来的名称 判断名称是否更改 更改取新名称 没更改取之前的名称
		String cname = version.getBversioncname();
		String ename = version.getBversionename();
		IBDS_Bversion bfe = colunmConfigService.selectByPrimaryKey(version.getId(), version.getBversionno());
		version.setModifyUser(UserUtil.getUserId());
		version.setModifyData(new Date());
		IBDS_Release release = releaseService.selectByCode(version.getReleaseno());
		// ReleaseView release =
		// colunmConfigService.selectByCode(version.getReleaseno());
		if (!cname.contains(release.getRelease())) {
			return ResponseResult.fail(false, "产品B级名称中拼接的R版本名称不能更改!");
		}
		if (!ename.contains(release.getEngrelease())) {
			return ResponseResult.fail(false, "产品B级英文名称中拼接的R版本英文名称不能更改!");
		}
		// 去掉拼接的R
		version.setBversioncname(version.getBversioncname().replace(release.getRelease(), ""));
		version.setBversionename(version.getBversionename().replace(release.getEngrelease(), ""));
		// 更新数据
		ibds_BversionService.editBversion(release, version);
		// 日志上拼接R
		if (StringUtil.isNotEmpty(cname)) {
			version.setBversioncname(cname);
			bfe.setBversioncname((release.getRelease() == null ? "" : release.getRelease()) + bfe.getBversioncname());
		} else {
			version.setBversioncname(
					(release.getRelease() == null ? "" : release.getRelease()) + bfe.getBversioncname());
			bfe.setBversioncname((release.getRelease() == null ? "" : release.getRelease()) + bfe.getBversioncname());
		}

		if (StringUtil.isNotEmpty(ename)) {
			version.setBversionename(ename);
			bfe.setBversionename((release.getEngrelease() == null ? "" : release.getEngrelease())
					+ (bfe.getBversionename() == null ? "" : bfe.getBversionename()));
		}

		// Bversion_view bversionbef =
		// colunmConfigService.selectByCode(version.getBversionno());
		// version.setRelease(bfe.getReleaseno());
		// 添加操作日志
		optLogUtils.RecordOpearteLog(bfe, version, version.getBversionno());
		return ResponseResult.success(true, "编辑B版本成功");
	}

	// 参照框产品树展示
	@RequestMapping("/bversion/selectByMap")
	public Object selectByMap(String id, String code, String sub_code) {
		String projectStatus = id;
		String type = "PB";
		// 查询参数放入Map中
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
		List<IBDS_Bversion> lstRd = ibds_BversionService.selectBymap(param);

		return projectStatus != null ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}

}
