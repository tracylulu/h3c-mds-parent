package com.h3c.mds.basicinfo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_Product_PROCESSMapper;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExt;
import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESSExt;
import com.h3c.mds.basicinfo.entity.view_VRProcess;
import com.h3c.mds.basicinfo.service.BaseLineApplyService;
import com.h3c.mds.basicinfo.service.BaseObjectApplyService;
import com.h3c.mds.basicinfo.service.BaseObjectProcessService;
import com.h3c.mds.basicinfo.service.ProductApplyService;
import com.h3c.mds.basicinfo.service.ProductProcessService;
import com.h3c.mds.basicinfo.service.view_VRProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.service.IBDS_PLIPMTService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;

@Controller
@RequestMapping("/basicinfo")
public class ProductApplyController {

	private static final Logger logger = LoggerFactory.getLogger(ProductApplyController.class);

	@Autowired
	private ProductProcessService productprocessService;

	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;

	@Autowired
	private IBDS_PLIPMTService ipmtService;

	@Autowired
	private UserService userService;

	@Autowired
	private ProcessLogService processLogService;

	@Autowired
	private MailInfoService mailInfoService;

	@Autowired
	private TaskService taskService;
	@Autowired
	private ProductApplyService productApplyService;

	@Autowired
	private BaseObjectApplyService baseObjectApplyService;

	@Autowired
	private BaseLineApplyService baseLineApplyService;

	@Autowired
	private view_VRProcessService viewVRService;

	@Autowired
	private BaseObjectProcessService baseObjectprocessService;

	@Autowired
	private ProductProcessService productProcessService;
	@Autowired
	private EipService eipService;

	@Autowired
	private IBDS_Product_PROCESSMapper productProcessMapper;

	@Autowired
	private RuntimeService runtimeService;

	@Value("${sso.main.url}")
	private String siteMainUrl;

	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("/productApply/add")
	@ResponseBody
	public ModelAndView getByLineNo(Integer selId, String applyType) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("timestamp", new Date().getTime());
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("showStatus", "add");
		mv.addObject("currentNode", "editable");
		IBDS_Product_PROCESSExt process = new IBDS_Product_PROCESSExt();
		process.setStatusname("产品POP提出修改申请");
		process.setResponsible((String) SecurityUtils.getSubject().getPrincipal());
		mv.addObject("entity", process);
		// 新增下拉框数据继承
		if (StringUtil.isNotEmpty(applyType) && applyType.contains(BasicinfoConst.PRODUCT_APPLYTYPE_PT)) {// 产品
			/*
			 * IBDS_Product_Apply apply = new IBDS_Product_Apply(); if (selId != null) {
			 * apply = productApplyService.selectByPrimaryKey(selId); }
			 * mv.addObject("apply", apply);
			 */

			IBDS_Product_PROCESSExt processProduct = new IBDS_Product_PROCESSExt();
			if (selId != null) {
				processProduct = productProcessService.getByProductId(selId);
			}
			if (processProduct.getApplys().size() > 0) {
				IBDS_Product_Apply apply = new IBDS_Product_Apply();
				apply = processProduct.getApplys().get(0);
				mv.addObject("apply", apply);
			}

		} else if (StringUtil.isNotEmpty(applyType) && applyType.contains(BasicinfoConst.PRODUCT_APPLYTYPE_PR)) {// R级以下
			// 基线
			/*
			 * IBDS_BaseLine_Apply baseApply = new IBDS_BaseLine_Apply(); if (selId != null)
			 * { baseApply = baseLineApplyService.selectByPrimaryKey(selId); } if (baseApply
			 * != null) { mv.addObject("apply", baseApply); } else { // 基线以下
			 * IBDS_BaseObject_Apply apply = new IBDS_BaseObject_Apply(); if (selId != null)
			 * { apply = baseObjectApplyService.selectByPrimaryKey(selId);
			 * mv.addObject("apply", apply); } }
			 */
			IBDS_BaseObject_PROCESSExt processData = new IBDS_BaseObject_PROCESSExt();
			IBDS_BaseLine_Apply baseApply = new IBDS_BaseLine_Apply();
			IBDS_BaseObject_Apply apply = new IBDS_BaseObject_Apply();
			if (selId != null) {
				processData = baseObjectprocessService.getByProductId(selId);
			}
			if (processData.getBaseLines().size() > 0) {
				baseApply = processData.getBaseLines().get(0);
				mv.addObject("apply", baseApply);
			} else {
				if (processData.getBaseObjects().size() > 0) {
					for (List<IBDS_BaseObject_Apply> applys : processData.getBaseObjects()) {
						if (applys != null && applys.size() > 0) {
							apply.setPlipmtno(applys.get(0).getPlipmtno());
							apply.setProdlineno(applys.get(0).getProdlineno());
							apply.setProductno(applys.get(0).getProductno());
							apply.setVersionno(applys.get(0).getVersionno());
							apply.setReleaseno(applys.get(0).getReleaseno());
							break;
						}
					}
				}
				mv.addObject("apply", apply);
			}
		} else if (StringUtil.isNotEmpty(applyType) && applyType.contains(BasicinfoConst.PRODUCT_APPLYTYPE_VR)) {// VR
			view_VRProcess apply = new view_VRProcess();
			if (selId != null) {
				apply = viewVRService.getByID(selId);
			}
			mv.addObject("apply", apply);
		} else {
			mv.addObject("apply", null);
		}

		mv.setViewName("basicinfo/productApply/add");
		return mv;
	}

	/**
	 * 保存草稿
	 * 
	 * @return
	 */
	@RequestMapping(value = "/productApply/save", produces = "text/html;charset=utf-8")
	@ResponseBody
	public Integer save(IBDS_Product_PROCESSExt product) {
		try {
			product.setStatusname(BasicinfoConst.PRODUCT_STATUS_DRAFTName);
			product.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
			product.setResponsible((String) SecurityUtils.getSubject().getPrincipal());
			Integer id = 0;
			if (product.getId() == null) {
				String maxcode = productprocessService.getMaxCode();
				product.setApplycode(maxcode);
				id = productprocessService.create(product);
			} else {
				productprocessService.update(product);
				id = product.getId();
			}

			return id;
		} catch (Exception e) {
			logger.error("保存失败", e);
			return 0;
		}
	}

	/**
	 * 提交流程
	 * 
	 * @return
	 */
	@RequestMapping(value = "/productApply/submit", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult submit(IBDS_Product_PROCESSExt product) {
		try {
			productprocessService.validateForm(product);

			String userId = (String) SecurityUtils.getSubject().getPrincipal();

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put("applyType", "1");
			variables.put("applyDept", "");
			variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal());
			// 根据选中的PLIPMT查询下一步审批人员 即IPMT执行秘书
			String userCode = "";
			IBDS_PLIPMT plipmt = ipmtService.selectByCode(product.getApplys().get(0).getPlipmtno());
			if (plipmt.getPlimptSecretary() == null || plipmt.getPlimptSecretary().length() == 0) {
				return ResponseResult.fail("下一步审批人不能为空,请配置IPMT执行秘书！");
			} else {
				// 如果配置了多个人员,取逗号前第一个人
				if (plipmt.getPlimptSecretary().contains(",")) {
					userCode = plipmt.getPlimptSecretary().split(",")[0];
				} else {
					userCode = plipmt.getPlimptSecretary();
				}
				User user = userService.selectByPCode(userCode);
				if (user == null) {
					return ResponseResult.fail("该人员在系统中不存在,请更换人员或联系管理员！！");
				}
				userCode = user.getUda10511();
			}
			// TODO 后续有事件重构从配置表中获取
			variables.put("plimptSecretary", userCode);
			// 第一次提交
			if (StringUtils.isBlank(product.getInstanseId())) {
				// 启动流程并通过第一个
				String instanceId = productCodeFlowableService.startFlowableAndPassOne("ProductProcess",
						userId.toString(), variables);
				product.setInstanseId(instanceId);
			} else {
				// 打回后重复提交
				Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(product.getInstanseId(), userId);
				productCodeFlowableService.pass(task.getId());
			}

			product.setStatus(BasicinfoConst.PRODUCT_STATUS_APPLY);
			product.setCurrentNode(FlowableCache.getCurrentNode());
			product.setStatusname(FlowableCache.getCurrentStatusDesc());
			product.setResponsible(FlowableCache.getCurrentHandler());
			product.setPopFillname(userId);
			product.setPopFilltime(new Date());

			if (product.getId() == null) {
				String maxcode = productprocessService.getMaxCode();
				product.setApplycode(maxcode);
				productprocessService.create(product);
			} else {
				productprocessService.update(product);
			}
			// 创建流程记录
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(), "提交申请",
					null, FlowableCache.getCurrentStatusDesc(), product.getApplycode());
			// Task task =
			// taskService.createTaskQuery().processInstanceId(product.getInstanseId()).singleResult();
			Task task = productprocessService.getTaskByInstanceIdAndUserId(product.getInstanseId(), userId);
			mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(), userId,
					"请您审核研发产品申请表：" + FlowableCache.getCurrentStatusDesc(), null, product.getId(),
					"/basicinfo/productApply/edit/" + product.getId(), "修改产品信息", task.getId());
			// 集成eip
			String eipUrl = siteMainUrl + "/eipLogin?docuId=" + product.getApplycode();
			String productUrl = "/basicinfo/productApply/edit/" + product.getId();
			String authorName = userService
					.getUserNameByAccount(product.getCreateUser() == null ? userId : product.getCreateUser());
			String addUserName = userService.getUserNameByAccount(product.getResponsible());

			eipService.syncEip("研发产品申请", product.getApplycode(), product.getResponsible(), addUserName,
					product.getStatusname(), EipConst.PROCESSID_P, eipUrl, productUrl,
					product.getCreateUser() == null ? userId : product.getCreateUser(), authorName, false);
			return ResponseResult.success(product, "提交成功");

		} catch (FlowableException e) {
			return ResponseResult.fail(e.getMessage());
		} catch (Exception e) {
			logger.error("提交失败", e);
			return ResponseResult.fail("提交失败");
		} finally {
			FlowableCache.removeCurrentNode();
			FlowableCache.removeCurrentHandler();
			FlowableCache.removeAll();
		}
	}

	/**
	 * 根据id获取表单信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/productApply/getByProductId/{id}")
	@ResponseBody
	public ResponseResult getByProductId(@PathVariable Integer id) {
		try {
			IBDS_Product_PROCESS process = productprocessService.getByProductId(id);
			return ResponseResult.success(process);
		} catch (Exception e) {
			logger.error("根据id级联查询失败", e);
			return ResponseResult.fail("根据id级联查询失败");
		}
	}

	/**
	 * 显示流程数据
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/productApply/edit/{id}")
	@ResponseBody
	public ModelAndView edit(@PathVariable Integer id) {
		ModelAndView mv = new ModelAndView();
		List<String> copyTitle = new ArrayList<>();

		IBDS_Product_PROCESSExt process = productprocessService.getByProductId(id);
		// 草稿状态
		if (BasicinfoConst.PRODUCT_STATUS_DRAFT.equals(process.getStatus())
				|| BasicinfoConst.PRODUCT_STATUS_Return.equals(process.getStatus())) {
			mv.addObject("currentNode", "editable");
			mv.addObject("isHandler", SecurityUtils.getSubject().getPrincipal().toString()
					.equalsIgnoreCase(process.getResponsible().toLowerCase()));
			// 结束状态
		} else if (BasicinfoConst.PRODUCT_STATUS_EFFECTIVE.equals(process.getStatus())) {
			mv.addObject("currentNode", "disable");
			mv.addObject("isHandler", SecurityUtils.getSubject().getPrincipal().toString()
					.equalsIgnoreCase(process.getResponsible().toLowerCase()));
		} else {
			Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(process.getInstanseId(),
					(String) SecurityUtils.getSubject().getPrincipal());
			if (task != null) {
				mv.addObject("taskId", task.getId());
				mv.addObject("isHandler", SecurityUtils.getSubject().getPrincipal().toString()
						.equalsIgnoreCase(process.getResponsible().toLowerCase()));
				mv.addObject("currentNode", process.getCurrentNode());
			}

		}
		Boolean isChange = false;
		// 管理员有权限编辑管理区段
		// 获取当前用户角色
		Subject subject = SecurityUtils.getSubject();
		String roleCode = (String) subject.getSession().getAttribute("roleCode");
		if (roleCode.contains("R_000001") && BasicinfoConst.PRODUCT_STATUS_APPLY.equals(process.getStatus())) {
			isChange = true;
		}
		mv.addObject("isChange", isChange);

		mv.addObject("showStatus", "edit");
		mv.addObject("id", id);

		if (process.getApplys() != null && process.getApplys().size() > 0) {
			// 修改顺序
			IBDS_Product_Apply addProductApply = null;
			IBDS_Product_Apply updateProductApply = null;
			IBDS_Product_Apply delProductApply = null;
			for (IBDS_Product_Apply apply : process.getApplys()) {
				if (StringUtil.isNotEmpty(apply.getAppytype()) && apply.getAppytype().equals("1")) {
					addProductApply = apply;
				} else if (StringUtil.isNotEmpty(apply.getAppytype()) && apply.getAppytype().equals("2")) {
					updateProductApply = apply;
				} else if (StringUtil.isNotEmpty(apply.getAppytype()) && apply.getAppytype().equals("3")) {
					delProductApply = apply;
				}

				copyTitle.add(apply.getProduct());
			}
			if (addProductApply == null && updateProductApply == null && delProductApply == null) {
				addProductApply = process.getApplys().get(0);
			}

			if (addProductApply == null) {
				addProductApply = new IBDS_Product_Apply();
			}
			if (updateProductApply == null) {
				updateProductApply = new IBDS_Product_Apply();
			}
			if (delProductApply == null) {
				delProductApply = new IBDS_Product_Apply();
			}

			List<IBDS_Product_Apply> finalProductApplyList = new ArrayList<IBDS_Product_Apply>();
			finalProductApplyList.add(addProductApply);
			finalProductApplyList.add(updateProductApply);
			finalProductApplyList.add(delProductApply);

			process.setApplys(finalProductApplyList);
			if (copyTitle != null && copyTitle.size() > 0) {
				mv.addObject("copyTitle", "研发产品信息申请 : " + copyTitle.get(0));
			} else {
				mv.addObject("copyTitle", "研发产品信息申请 : ");
			}
		}

		mv.addObject("entity", process);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("timestamp", new Date().getTime());
		// 显示流程记录
		mv.addObject("logs", processLogService.getByProcessCode(process.getApplycode()));
		mv.setViewName("basicinfo/productApply/add");

		return mv;
	}

	/**
	 * 审核
	 * 
	 * @param params
	 * @param id
	 * @param taskId
	 * @return
	 */
	@RequestMapping(value = "/productApply/check/{id}/{taskId}", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult check(@RequestBody Map<String, Object> params, @PathVariable Integer id,
			@PathVariable String taskId) {
		//
		try {
			productprocessService.check(id, taskId, params);
			System.out.print(id);
			System.out.print("taskId" + taskId);
			System.out.print(params);
			return ResponseResult.success();
		} catch (Exception e) {
			logger.error("审核失败", e);
			return ResponseResult.fail("审核失败");
		} finally {
			FlowableCache.removeAll();
		}
	}

	/**
	 * 修改当前处理人
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/productApply/changeResponsible", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult changeHandler(Integer id, String taskId, String userId) {
		try {

			IBDS_Product_PROCESS process = productprocessService.getById(id);
			User user = userService.selectByPCode(userId);
			if (user != null) {
				if (user.getUda10511().equals(process.getResponsible())) {
					return ResponseResult.fail("修改的处理人和当前责任人一致，请重新输入！");
				} else {
					productprocessService.changeResponsible(id, taskId, user.getUda10511());
					// 创建流程记录
					processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
							"修改处理人", null, "处理人由" + userService.getNameDescByAccount(process.getResponsible()) + "更改为:"
									+ userService.getNameDescByAccount(user.getUda10511()),
							process.getApplycode());
					mailInfoService.sendMailAndRecord(user.getUda10511(), process.getResponsible(),
							"请您审核研发产品申请表：" + process.getStatusname(), null, id, "/basicinfo/productApply/edit/" + id,
							"修改产品信息处理人", taskId);

					// 集成eip
					String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplycode();
					String productUrl = "/basicinfo/productApply/edit/" + process.getId();
					String authorName = userService.getUserNameByAccount(process.getCreateUser());
					String addUserName = userService.getUserNameByAccount(userId);

					eipService.syncEip("研发产品申请", process.getApplycode(), userId, addUserName, process.getStatusname(),
							EipConst.PROCESSID_P, eipUrl, productUrl, process.getCreateUser(), authorName, false);
					return ResponseResult.success("指派成功");
				}
			} else {
				return ResponseResult.fail("处理人不正确，请重新输入！");
			}
		} catch (Exception e) {
			logger.error("指派失败", e);
			return ResponseResult.fail("指派失败");
		}
	}

	/**
	 * 删除流程
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/productApply/delProcess", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult delProcess(Integer id) {
		try {
			if (id != 0) {
				IBDS_Product_PROCESS delProcess = new IBDS_Product_PROCESS();
				delProcess.setId(id);
				delProcess.setStatus(BasicinfoConst.PRODUCT_STATUS_Del);
				delProcess.setStatusname(BasicinfoConst.PRODUCT_STATUS_DelName);
				delProcess.setModifyDate(new Date());
				delProcess.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
				productProcessMapper.updateByPrimaryKeySelective(delProcess);

				// 查询流程实例
				IBDS_Product_PROCESS process = productProcessMapper.selectByPrimaryKey(id);
				if (process != null && StringUtil.isNotEmpty(process.getInstanseId())) {
					// 废弃后删除该流程
					runtimeService.deleteProcessInstance(process.getInstanseId(),
							(String) SecurityUtils.getSubject().getPrincipal() + "废弃" + process.getInstanseId() + "流程");
				}

				return ResponseResult.success("删除成功");
			} else {
				return ResponseResult.fail("删除的流程不存在,请联系管理员");
			}
		} catch (Exception e) {
			logger.error("删除失败", e);
			return ResponseResult.fail("删除失败");
		}

	}
}
