package com.h3c.mds.basicinfo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.entity.IBDS_BaseLine_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_BaseObject_PROCESSExt;
import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESSExt;
import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;
import com.h3c.mds.basicinfo.entity.view_VRProcess;
import com.h3c.mds.basicinfo.service.BaseObjectProcessService;
import com.h3c.mds.basicinfo.service.ProductProcessService;
import com.h3c.mds.basicinfo.service.VRApplyService;
import com.h3c.mds.basicinfo.service.VRProcessService;
import com.h3c.mds.basicinfo.service.view_VRProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ProductService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;

@RestController
@RequestMapping("/basicinfo/VRApply")
public class VRApplyController {

	private static final Logger logger = LoggerFactory.getLogger(VRApplyController.class);

	@Autowired
	private VRProcessService vrProcessService;
	@Autowired
	private VRApplyService vrApplyService;
	@Autowired
	private view_VRProcessService viewVRService;
	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private MailInfoService mailInfoService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private BaseObjectProcessService baseObjectprocessService;
	@Autowired
	private ProductProcessService productProcessService;
	@Autowired
	private IBDS_ProductService productService;

	@RequestMapping("/add")
	public ModelAndView add(Integer selId, String applyType) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("timestamp", new Date().getTime());
		mv.addObject("title", "研发产品V级/R级基本信息修改申请表");
		mv.addObject("code", "");
		mv.addObject("currentNodeDesc", "产品POP提出修改申请");
		mv.addObject("currentNode", "usertask1");
		mv.addObject("Handler", UserUtil.getUserId());
		mv.addObject("isHandler", true);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("isEdit", "editable");

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

		mv.setViewName("/basicinfo/VRApply/add");

		return mv;
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "研发产品V级/R级基本信息修改申请表");

		if (id != null) {
			view_VRProcess viewVRProcess = viewVRService.getByID(id);
			if (viewVRProcess != null) {
				mv.addObject("code", viewVRProcess.getApplyCode());
				mv.addObject("id", viewVRProcess.getId());
				mv.addObject("state",viewVRProcess.getStatus());
				mv.addObject("currentNodeDesc", viewVRProcess.getStatusDesc());
				mv.addObject("currentNode", StringUtils.isBlank(viewVRProcess.getCurrentnode())?"usertask1":viewVRProcess.getCurrentnode());
				mv.addObject("Handler", viewVRProcess.getHandler());
				mv.addObject("applyCode", viewVRProcess.getApplyCode());
				mv.addObject("subSign", viewVRProcess.getFirstSign());
				mv.addObject("submitDate", viewVRProcess.getFirstDate());
				mv.addObject("IPMTSign", viewVRProcess.getIpmtSign());
				mv.addObject("IPMTDate", viewVRProcess.getIpmtDate());
				mv.addObject("processID", viewVRProcess.getProcessid());
				if("1".equals(viewVRProcess.getNewpr())) {
					mv.addObject("copyTitle","产品VR信息修改 : "+viewVRProcess.getReleasenew());
				}else {
					IBDS_Product product=productService.getByProductNo(viewVRProcess.getProductno());
					mv.addObject("copyTitle","产品VR信息修改 : "+(product!=null?product.getProduct():""));
				}
				
				if (FlowableConst.PROJECTCODE_STATUS_DRAFT.equals(viewVRProcess.getStatus())) {
					if (((String) SecurityUtils.getSubject().getPrincipal())
							.equalsIgnoreCase(viewVRProcess.getHandler())) {
						mv.addObject("isEdit", "editable");
					} else {
						mv.addObject("isEdit", "disable");
					}
				} else if ("10".equals(viewVRProcess.getStatus())) {
					mv.addObject("isEdit", "disable");
				} else {
					Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(viewVRProcess.getInstanseId(),
							(String) SecurityUtils.getSubject().getPrincipal());
					if (task != null) {
						mv.addObject("taskId", task.getId());
						mv.addObject("isHandler",
								((String)SecurityUtils.getSubject().getPrincipal()).equalsIgnoreCase(viewVRProcess.getHandler()));
						mv.addObject("isChangeUser",
								(UserUtil.checkIsAdmin()
										|| ((String)SecurityUtils.getSubject().getPrincipal()).equalsIgnoreCase(viewVRProcess.getHandler()))
												? true
												: false);
					}
				}
				mv.addObject("logs", processLogService.getByProcessCode(viewVRProcess.getApplyCode()));
			}
		}
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("timestamp", new Date().getTime());
		mv.setViewName("/basicinfo/VRApply/add");

		return mv;
	}

	/**
	 * 保存草稿
	 * 
	 * @param code      编码
	 * @param vrApply
	 * @param vrProcess
	 * @return
	 */
	@RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
	public ResponseResult save(String code, IBDS_VR_APPLY vrApply, IBDS_VR_PROCESS vrProcess,Integer applyID,Integer processID) {
		try {
			vrApply.setId(applyID);
			vrProcess.setId(processID);
			if (StringUtil.isEmpty(code)) {
				String maxcode = vrProcessService.getMaxCode();
				vrApply.setProcessCode(maxcode);
				vrApply.setCreator(UserUtil.getUserId());
				vrApply.setCreatetime(new Date());
				vrApply.setModifier(UserUtil.getUserId());
				vrApply.setModifytime(new Date());

				vrProcess.setApplyCode(maxcode);
				vrProcess.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				vrProcess.setHandler(UserUtil.getUserId());
				vrProcess.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DRAFTName);
				vrProcess.setFirstSign(UserUtil.getUserId());
				vrProcess.setFirstDate(new Date());
				vrProcess.setCreatetime(new Date());
				vrProcess.setCreator(UserUtil.getUserId());
				vrProcess.setModifier(UserUtil.getUserId());
				vrProcess.setModifytime(new Date());

			} else {				
				vrApply.setModifier(UserUtil.getUserId());
				vrApply.setModifytime(new Date());
				vrProcess.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				vrProcess.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DRAFTName);
				vrProcess.setFirstSign(UserUtil.getUserId());
				vrProcess.setFirstDate(new Date());
				vrProcess.setModifier(UserUtil.getUserId());
				vrProcess.setModifytime(new Date());
			}

			if (StringUtils.isNotBlank(vrApply.getDelpv())) {
				vrApply.setPvifdelbelow("1");
			}
			if (StringUtils.isNotBlank(vrApply.getDelpr())) {
				vrApply.setPrifdelbelow("1");
			}

			vrApplyService.insertOrUpdate(code, vrApply, vrProcess);

			return ResponseResult.success(true, vrProcess.getId());
		} catch (Exception e) {
			logger.error("新增失败", e);
			return ResponseResult.fail("新增失败");
		}
	}

	@RequestMapping(value = "/getByApplyCode/{id}")
	public ResponseResult getByApplyCode(@PathVariable("id") Integer id) {
		return ResponseResult.success(viewVRService.getByID(id));
	}

	/**
	 * 提交，启动流程
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/submit", produces = "text/html;charset=utf-8")
	public ResponseResult submit(IBDS_VR_APPLY vrApply, IBDS_VR_PROCESS vrProcess,Integer applyID,Integer processID) {
		try {
			vrApply.setId(applyID);
			vrProcess.setId(processID);
			vrProcessService.submit(vrApply, vrProcess);
			/*
			 * vrApplyService.validateApply(vrApply);
			 * 
			 * String userCode = ""; String code = vrApply.getProcessCode(); // 设置执行秘书 if
			 * (StringUtils.isNotBlank(vrApply.getPlipmtno())) { IBDS_PLIPMT plipmt =
			 * colunmConfigService.selectByCode(vrApply.getPlipmtno());
			 * 
			 * // 根据选中的PLIPMT查询下一步审批人员 即IPMT执行秘书 if (plipmt.getPlimptSecretary() == null ||
			 * plipmt.getPlimptSecretary().length() == 0) { return
			 * ResponseResult.fail("下一步审批人不能为空,请配置IPMT执行秘书！"); } else { //
			 * 如果配置了多个人员,取逗号前第一个人 if (plipmt.getPlimptSecretary().contains(",")) { userCode
			 * = plipmt.getPlimptSecretary().split(",")[0]; } else { userCode =
			 * plipmt.getPlimptSecretary(); } userCode =
			 * userService.selectByPCode(userCode).getUda10511();
			 * vrApply.setIpmtsecretary(userCode); } }
			 * 
			 * String userId = (String) SecurityUtils.getSubject().getPrincipal();
			 * 
			 * Map<String, Object> variables = new HashMap<String, Object>();
			 * variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal()); //
			 * TODO 后续有事件重构从配置表中获取 variables.put("IPMTSecretary",
			 * vrApply.getIpmtsecretary());
			 * 
			 * // 第一次提交 if (StringUtils.isBlank(vrProcess.getInstanseId())) { // 启动流程并通过第一个
			 * String instanceId =
			 * productCodeFlowableService.startFlowableAndPassOne("VRApply", userId,
			 * variables); vrProcess.setInstanseId(instanceId); } else { // 打回后重复提交 Task
			 * task = productCodeFlowableService.getTaskByInstanceIdAndUserId(vrProcess.
			 * getInstanseId(), userId); productCodeFlowableService.pass(task.getId()); }
			 * 
			 * // 设置编码 if (StringUtil.isEmpty(code)) { String maxcode =
			 * vrProcessService.getMaxCode(); vrApply.setProcessCode(maxcode);
			 * 
			 * vrProcess.setApplyCode(maxcode); }
			 * 
			 * // 设置删除状态 if (StringUtils.isNotBlank(vrApply.getDelpv())) {
			 * vrApply.setPvifdelbelow("1"); } if
			 * (StringUtils.isNotBlank(vrApply.getDelpr())) { vrApply.setPrifdelbelow("1");
			 * }
			 * 
			 * vrProcess.setHandler(FlowableCache.getCurrentHandler());
			 * vrProcess.setCurrentnode(FlowableCache.getCurrentNode());
			 * vrProcess.setStatusDesc(FlowableCache.getCurrentStatusDesc());
			 * vrProcess.setStatus(FlowableConst.PROJECTCODE_STATUS_APPLY);
			 * vrProcess.setFirstSign(UserUtil.getUserId()); vrProcess.setFirstDate(new
			 * Date());
			 * 
			 * vrApplyService.insertOrUpdate(code, vrApply, vrProcess);
			 * 
			 * processLogService.createLog(new Date(), null, (String)
			 * SecurityUtils.getSubject().getPrincipal(), "提交申请", null,
			 * FlowableCache.getCurrentStatusDesc(), vrProcess.getApplyCode()); Task task =
			 * taskService.createTaskQuery().processInstanceId(vrProcess.getInstanseId()).
			 * singleResult();
			 * mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(), userId,
			 * "请您审核产品VR版本申请：" + FlowableCache.getCurrentStatusDesc(), null,
			 * vrProcess.getId(), "/basicinfo/VRApply/edit/" + vrProcess.getId(),
			 * "产品VR版本申请", task.getId());
			 * 
			 * vrProcessService.sendProjectCodeEipMsg(vrApply.getId(),false);
			 */

			return ResponseResult.success(true, "提交成功");
		} catch (FlowableException e) {
			return ResponseResult.fail(e.getMessage());
		} catch (Exception e) {
			logger.error("保存失败", e);
			return ResponseResult.fail("保存失败");
		} finally {
			FlowableCache.removeCurrentNode();
			FlowableCache.removeCurrentHandler();
			FlowableCache.removeAll();
		}
	}

	@RequestMapping(value = "/check/{id}/{taskId}", produces = "text/html;charset=utf-8")
	public ResponseResult check(@RequestBody Map<String, Object> params, @PathVariable Integer id,
			@PathVariable String taskId) {
		try {
			vrProcessService.check(id, taskId, params);
			return ResponseResult.success();
		} catch (Exception e) {
			logger.error("审核失败", e);
			return ResponseResult.fail("审核失败");
		}finally {
			FlowableCache.removeCurrentNode();
			FlowableCache.removeCurrentHandler();
			FlowableCache.removeAll();
		}
	}

	@RequestMapping(value = "/changeHandler", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	public ResponseResult changeHandler(Integer id, String taskId, String userId) {
		try {
			view_VRProcess process = viewVRService.getByID(id);
			String user = userService.backDomainAccount(userId);

			if (StringUtils.isBlank(user)) {
				throw new RuntimeException("未找到指定的人员");
			}
			vrProcessService.changeHandler(id, taskId, user);

			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(), "修改处理人",
					null, "处理人由" + userService.getNameDescByAccount(process.getHandler()) + "更改为:" + userId,
					process.getApplyCode());
			mailInfoService.sendMailAndRecord(userId, process.getFirstSign(), "请您审核产品VR版本申请：IPMT执行秘书审核", null, id,
					"/basicinfo/VRApply/edit/" + id, "产品VR版本申请", taskId);
			
			vrProcessService.sendProjectCodeEipMsg(id,false);
			return ResponseResult.success("指派成功");
		} catch (Exception e) {
			logger.error("指派失败", e);
			return ResponseResult.fail("指派失败");
		}
	}
	
	@RequestMapping(value = "/delProcess", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	public ResponseResult delProcess(Integer processID) {
		try {
			vrProcessService.delProcess(processID);
			return ResponseResult.success("作废成功");
		}catch(Exception e) {
			logger.error("作废失败", e);
			return ResponseResult.fail(e.getMessage());
		}
	}

}
