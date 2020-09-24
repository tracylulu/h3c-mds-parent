package com.h3c.mds.basicinfo.controller;

import java.util.ArrayList;
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
/*import org.json.JSONObject;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;
import com.h3c.mds.basicinfo.entity.view_DifficultyCoefficient;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientApplyService;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientItemApplyService;
import com.h3c.mds.basicinfo.service.DifficultyCoefficientProcessService;
import com.h3c.mds.basicinfo.service.view_DifficultyCoefficientService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.ProdLineService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;

import net.sf.json.JSONException;

@RestController
@RequestMapping("/basicinfo/DifficultyCoefficient")
public class DifficultyCoefficientController {
	private static final Logger logger = LoggerFactory.getLogger(DifficultyCoefficientController.class);

	@Autowired
	private DifficultyCoefficientApplyService diffApplyService;
	@Autowired
	private DifficultyCoefficientItemApplyService diffItemApplyService;
	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private DifficultyCoefficientProcessService diffProcessService;
	
	@Autowired
	private view_DifficultyCoefficientService viewDiffService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProdLineService prodService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private MailInfoService mailInfoService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IBDS_ReleaseService releaseService;

	@RequestMapping("/add")
	public ModelAndView add(Integer selId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "难度系数申请表");
		mv.addObject("code", "");
		mv.addObject("currentNodeDesc", "产品POP提出申请");
		mv.addObject("currentNode", "");
		mv.addObject("Handler", UserUtil.getUserId());
		mv.addObject("isHandler", true);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("isEdit", "editable");
		view_DifficultyCoefficient viewDiffProcess = new view_DifficultyCoefficient();
		mv.addObject("viewDiffProcess", viewDiffProcess);
		if (selId != null) {
			view_DifficultyCoefficient viewDiffProcessApply = viewDiffService.selectByID(selId);
			if (viewDiffProcessApply != null) {
				mv.addObject("apply", viewDiffProcessApply);
			}
		} else {
			mv.addObject("apply", null);
		}

		mv.setViewName("/basicinfo/DifficultyCoefficient/add");

		return mv;
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/basicinfo/DifficultyCoefficient/add");
		mv.addObject("title", "难度系数申请表");

		if (id != null) {
			view_DifficultyCoefficient viewDiffProcess = viewDiffService.selectByID(id);
			if (viewDiffProcess != null) {
				mv.addObject("code", viewDiffProcess.getApplyCode());
				mv.addObject("id", viewDiffProcess.getId());
				mv.addObject("currentNodeDesc", viewDiffProcess.getStatusDesc());
				mv.addObject("state", viewDiffProcess.getStatus());
				mv.addObject("currentNode", viewDiffProcess.getCurrentnode());
				mv.addObject("Handler", viewDiffProcess.getHandler());
				mv.addObject("applyCode", viewDiffProcess.getApplyCode());
				mv.addObject("subSign", viewDiffProcess.getFirstSign());
				mv.addObject("submitDate", viewDiffProcess.getFirstDate());
				mv.addObject("mgnSign", viewDiffProcess.getMgnSign());
				mv.addObject("mgnDate", viewDiffProcess.getMgnDate());
				mv.addObject("qualitySign", viewDiffProcess.getQualitySign());
				mv.addObject("qualityDate", viewDiffProcess.getQualityDate());
				mv.addObject("IPMTSign", viewDiffProcess.getIpmtSign());
				mv.addObject("IPMTDate", viewDiffProcess.getIpmtDate());
				mv.addObject("processID", viewDiffProcess.getProcessid());
				if(StringUtils.isNotBlank(viewDiffProcess.getReleaseno())) {
					IBDS_Release release=releaseService.selectByCode(viewDiffProcess.getReleaseno());
					mv.addObject("copyTitle","难度系数申请 : "+(release!=null?release.getRelease():""));
				}
				
				if (FlowableConst.PROJECTCODE_STATUS_DRAFT.equals(viewDiffProcess.getStatus())) {
					if (((String) SecurityUtils.getSubject().getPrincipal())
							.equalsIgnoreCase(viewDiffProcess.getHandler())) {
						mv.addObject("isEdit", "editable");
					} else {
						mv.addObject("isEdit", "disable");
					}
				} else if ("10".equals(viewDiffProcess.getStatus())) {
					mv.addObject("isEdit", "disable");
				} else {
					Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(viewDiffProcess.getInstanseId(),
							(String) SecurityUtils.getSubject().getPrincipal());
					if (task != null) {
						mv.addObject("taskId", task.getId());
						mv.addObject("isHandler", ((String) SecurityUtils.getSubject().getPrincipal())
								.equalsIgnoreCase(viewDiffProcess.getHandler()));
						mv.addObject("isChangeUser", (UserUtil.checkIsAdmin()
								|| SecurityUtils.getSubject().getPrincipal().equals(viewDiffProcess.getHandler()))
										? true
										: false);
					}
				}
				mv.addObject("logs", processLogService.getByProcessCode(viewDiffProcess.getApplyCode()));
				mv.addObject("viewDiffProcess", viewDiffProcess);
			}
		}
		mv.addObject("id_suffix", new Date().getTime());

		return mv;
	}

	@RequestMapping(value = "/getDiffByID/{id}")
	public ResponseResult getDiff(@PathVariable("id") Integer id) {
		return ResponseResult.success(viewDiffService.selectByID(id));
	}

	@RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
	public ResponseResult save(IBDS_DifficultyCoefficient_APPLY diffApply,
			IBDS_DifficultyCoefficient_PROCESS diffProcess, Integer applyID, Integer processID, String itemList) {
		List<IBDS_DifficultyCoefficient_Item_APPLY> lstItem = new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();

		try {
			if (StringUtil.isNotEmpty(itemList)) {
				lstItem = JSONObject.parseArray(itemList, IBDS_DifficultyCoefficient_Item_APPLY.class);
			}

			diffApply.setId(applyID);
			diffProcess.setId(processID);

			if (applyID == null || applyID == 0) {
				String maxcode = diffProcessService.getMaxCode();
				diffApply.setProcessCode(maxcode);

				diffProcess.setApplyCode(maxcode);
				diffProcess.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				diffProcess.setHandler(UserUtil.getUserId());
				diffProcess.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DRAFTName);
				diffProcess.setFirstSign(UserUtil.getUserId());
				diffProcess.setFirstDate(new Date());

			} else {
				diffProcess.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				diffProcess.setFirstSign(UserUtil.getUserId());
				diffProcess.setFirstDate(new Date());
			}

			diffApplyService.Save(diffApply, diffProcess, lstItem);

			return ResponseResult.success(true, diffApply.getId());
		} catch (Exception e) {
			logger.error("新增失败", e);
			return ResponseResult.fail(false);
		}
	}

	/**
	 * 提交，启动流程
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/submit", produces = "text/html;charset=utf-8")
	public ResponseResult submit(IBDS_DifficultyCoefficient_APPLY diffApply,
			IBDS_DifficultyCoefficient_PROCESS diffProcess, Integer applyID, Integer processID, String itemList) {
		try {
			diffApply.setId(applyID);
			diffProcess.setId(processID);

			List<IBDS_DifficultyCoefficient_Item_APPLY> lstItem = new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();

			if (StringUtil.isNotEmpty(itemList)) {
				lstItem = JSONObject.parseArray(itemList, IBDS_DifficultyCoefficient_Item_APPLY.class);
			}
			
			diffProcessService.submit(diffApply,diffProcess,lstItem);
			
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

	/**
	 * 审核
	 * 
	 * @param params
	 * @param id
	 * @param taskId
	 * @return
	 */
	@RequestMapping(value = "/check/{id}/{taskId}", produces = "text/html;charset=utf-8")
	public ResponseResult check(@RequestBody Map<String, Object> params, @PathVariable Integer id,
			@PathVariable String taskId) {
		try {
			diffProcessService.check(id, taskId, params);
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

	/**
	 * 转其他人处理
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/changeHandler", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	public ResponseResult changeHandler(Integer id, String taskId, String userId) {
		try {
			view_DifficultyCoefficient process = viewDiffService.selectByProcessID(id);
			String user = userService.backDomainAccount(userId);

			if (StringUtils.isBlank(user)) {
				throw new RuntimeException("未找到指定的人员");
			}
			diffProcessService.changeHandler(id, taskId, user);

			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(), "修改处理人",
					null, "处理人由" + userService.getNameDescByAccount(process.getHandler()) + "更改为:" + userId,
					process.getApplyCode());
			mailInfoService.sendMailAndRecord(userId, process.getFirstSign(), "请您审核难度系数申请", null, id,
					"/basicinfo/DifficultyCoefficient/edit/" + process.getId(), "难度系数申请", taskId);
			
			//同步eip
			diffProcessService.sendProjectCodeEipMsg(process.getId(),false);
			return ResponseResult.success("指派成功");
		} catch (Exception e) {
			logger.error("指派失败", e);
			return ResponseResult.fail(e.getMessage());
		}
	}

	@RequestMapping("/dataList")
	public String getDataList(Integer diffid) {
		List<IBDS_DifficultyCoefficient_Item_APPLY> lst = new ArrayList<IBDS_DifficultyCoefficient_Item_APPLY>();
		lst = diffItemApplyService.getDataList(diffid);
		JSONObject json = new JSONObject();
		try {
			json.put("rows", lst);
			json.put("total", lst.size());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}

	@RequestMapping(value = "/getTipMsg")
	public ResponseResult getTipMsg(String proCode, String hardCode) {
		return ResponseResult.success(diffApplyService.getTipMsg(proCode, hardCode));
	}
	
	/**
	 * 作废（草稿、返回修改）
	 * @param processID
	 * @return
	 */
	@RequestMapping(value = "/delProcess", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	public ResponseResult delProcess(Integer processID) {
		try {
			diffProcessService.delProcess(processID);
			return ResponseResult.success("作废成功");
		}catch(Exception e) {
			logger.error("作废失败", e);
			return ResponseResult.fail(e.getMessage());
		}
	}

}
