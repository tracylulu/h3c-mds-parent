package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.PdtView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_PDTService;
import com.h3c.mds.product.service.PdtViewService;
import com.h3c.mds.product.web.service.PdtTransactionService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.common.CheckUtils;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

@RestController
@RequestMapping("/product")
public class PDTController {

	private static final Logger logger = LoggerFactory.getLogger(PDTController.class);

	@Autowired
	private IBDS_PDTService pdtService;
	@Autowired
	private IBDS_ColunmConfigService configService;
	@Autowired
	private PdtViewService pdtViewService;
	@Autowired
	private OperationLogUtils<IBDS_PDT> optLogUtils;
	@Autowired
	private CheckUtils checkUtils;
	@Autowired
	private ProcessConfigItemService processConfigItemService;
	@Autowired
	private UserService userService;
	@Autowired
	private PdtTransactionService pdtTransactionService;

	@RequestMapping("/data/ptdata")
	public Object dataList(String id, String searchParas, String projectStatus) {
		// 定义回传id类型(内码前缀),用于树节点展开时使用
		String type = null;
		// 截取code的前两位字符区分对象类型
		if (null != id) {

			type = id.substring(0, 2).toString();
		}
		System.out.print(projectStatus);
		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("type", type);
		searchMap.put("searchParas", searchParas);
		searchMap.put("projectStatus", projectStatus);
		List<PdtView> list = pdtViewService.getDataList(searchMap);
		return type != null && type.equals("PL") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(list)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(list);
	}

	@RequestMapping(value = "/data/ptadd", produces = "text/html;charset=utf-8")
	public ResponseResult create(IBDS_PDT pdt) {
		try {
			// 校验名称是否重复
			Map<String, String> para = new HashMap<>();
			para.put("tableName", "IBDS_PDT");
			para.put("column", "PDT");
			para.put("value", pdt.getPdt());

			String msg = checkUtils.repeatCheck(para, "PDT中文名称");
			if (msg != null && msg != "") {
				return ResponseResult.fail(msg);
			}

			if (StringUtil.isEmpty(pdt.getPdtManager())) {
				return ResponseResult.fail("请填写PDT经理！");
			}

			// if(StringUtil.isEmpty(pdt.getFinpdtId())) {
			// return ResponseResult.fail("请填写财务代表！");
			// }

			pdt.setStatus("1");
			pdt.setCreateDate(new Date());
			pdt.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
			pdt.setModifyDate(new Date());
			pdt.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			// pdtService.create(pdt);

			ProcessConfigItem item = new ProcessConfigItem();
			item.setPdtCode(pdt.getPdtno());
			item.setContent(pdt.getPdt());
			item.setNote(pdt.getPdt());
			item.setConfigCode("processPDT");
			item.setState(1);
			if (StringUtils.isNotBlank(pdt.getFinpdtId())) {
				String[] findpdtIds = pdt.getFinpdtId().split(",");
				if (findpdtIds != null && findpdtIds.length > 0) {
					User user = userService.selectByPCode(findpdtIds[0]);
					if (user != null) {
						item.setFprodPerson(user.getUda10511());
					}
				}
			}
			// item.setFprodPerson(userService.selectByPCode(pdt.getFinpdtId()).getUda10511());
			User users = userService.selectByPCode(pdt.getPdtManager());
			if (users != null) {
				item.setPdtMgn(users.getUda10511());
			} else {
				return ResponseResult.fail("新增失败,请检查PDT经理是否存在！");
			}

			// processConfigItemService.create(item);
			pdtTransactionService.create(pdt, item);
			// 添加操作日志
			optLogUtils.RecordOpearteLog(null, pdt, pdt.getPdtno());
			return ResponseResult.success("新增成功");
		} catch (Exception e) {
			logger.error("新增失败", e);
			return ResponseResult.fail("新增失败");
		}

	}

	@RequestMapping(value = "/data/ptedit", produces = "text/html;charset=utf-8")
	public ResponseResult update(IBDS_PDT pdt) {
		try {
			// 校验名称是否重复
			Map<String, String> para = new HashMap<>();
			para.put("tableName", "IBDS_PDT");
			para.put("column", "PDT");
			para.put("value", pdt.getPdt());
			para.put("isEdit", "True");
			para.put("Key", "ID");
			para.put("KeyValue", pdt.getId().toString());

			String msg = checkUtils.repeatCheck(para, "PDT中文名称");
			if (msg != null && msg != "") {
				return ResponseResult.fail(msg);
			}

			IBDS_PDT bfe = configService.selectByPrimaryKey(pdt.getId(), pdt.getPdtno());
			pdt.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
			pdt.setModifyDate(new Date());
			// pdtService.update(pdt);
			// 添加操作日志
			optLogUtils.RecordOpearteLog(bfe, pdt, pdt.getPdtno());
			ProcessConfigItem item = processConfigItemService.getByPdtCode(pdt.getPdtno());
			if (item != null) {
				item.setContent(pdt.getPdt());
				item.setNote(pdt.getPdt());
				item.setState(Integer.parseInt(pdt.getStatus()));
				if (StringUtils.isNotBlank(pdt.getFinpdtId())) {
					String[] findpdtIds = pdt.getFinpdtId().split(",");
					if (findpdtIds != null && findpdtIds.length > 0) {
						User user = userService.selectByPCode(findpdtIds[0]);
						if (user != null) {
							item.setFprodPerson(user.getUda10511());
						}
					}
				}
				// item.setFprodPerson(userService.selectByPCode(pdt.getFinpdtId()).getUda10511());
				User userPdt = userService.selectByPCode(pdt.getPdtManager().replace(",", ""));
				if (userPdt != null) {
					item.setPdtMgn(userPdt.getUda10511());
				} else {
					return ResponseResult.fail("请检查PDT经理是否有效！");
				}
				item.setState(Integer.parseInt(pdt.getStatus()));
				// processConfigItemService.update(item);
			}
			pdtTransactionService.update(pdt, item);
			return ResponseResult.success("更新成功");
		} catch (Exception e) {
			logger.error("更新失败", e);
			return ResponseResult.fail("更新失败");
		}

	}

	@RequestMapping("/prop/ptdata")
	public String gridList(String code, Integer id) {
		return configService.buildPropertygrid(code,
				id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
	}

	@RequestMapping("/getPdtByProlineno")
	@ResponseBody
	public List<IBDS_PDT> getPdtByProlineno(String prodlineno) {
		Map<String, Object> param = new HashMap<String, Object>();

		if (StringUtils.isNotBlank(prodlineno)) {
			param.put("prodlineno", prodlineno);
		}
		return pdtService.getPdtByProlineno(param);
	}

	@RequestMapping("/getAllPdt")
	@ResponseBody
	public List<IBDS_PDT> getAllPdt() {
		return pdtService.getPdtByProlineno(null);
	}
}
