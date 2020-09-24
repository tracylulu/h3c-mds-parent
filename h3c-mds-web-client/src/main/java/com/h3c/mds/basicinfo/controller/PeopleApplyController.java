package com.h3c.mds.basicinfo.controller;

import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.entity.view_PeopleApply;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.entity.IBDS_People_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_People_PROCESS;
import com.h3c.mds.basicinfo.entity.view_PeopleApplyList;
import com.h3c.mds.basicinfo.service.PeopelApplyService;
import com.h3c.mds.basicinfo.service.view_PeopleApplyService;
import com.h3c.mds.basicinfo.service.view_PeopleApplyListService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeFlowableService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.basicinfo.service.PeopleProcessService;
import com.h3c.mds.sysmgr.entity.User;

@RestController
@RequestMapping("/basicinfo/peopleApply")
public class PeopleApplyController {
	private static final Logger logger = LoggerFactory.getLogger(PeopleApplyController.class);
	
	@Autowired
	private PeopelApplyService applyService;
	@Autowired
	private PeopleProcessService processService;
	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;
	@Autowired
	private UserService userService;
	@Autowired
	private view_PeopleApplyService viewApplyService;
	@Autowired
	private view_PeopleApplyListService viewApplyListService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private MailInfoService mailInfoService;
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/list")
	public ModelAndView list(String type){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/basicinfo/peopleApply/list");
		mv.addObject("title", "列表");	
		mv.addObject("type", type);	
		mv.addObject("id_suffix", new Date().getTime());
	
		return mv;
	}
	
	@RequestMapping("/listData")
	public String Treedata(String id, String searchStr,String type) {
		Map<String,String> param=new HashMap<>();
		param.put("id", id);
		param.put("type", type);
		param.put("searchParam", searchStr);
		List<view_PeopleApplyList> lst=viewApplyListService.selectByMap(param);
		return StringUtil.isNotEmpty(id) ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst);
	}
	
	@RequestMapping("/add")
	public ModelAndView add(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/basicinfo/peopleApply/add");
		mv.addObject("title", "对研发基本信息中人员信息修改申请");
		mv.addObject("code", "");
		mv.addObject("currentNodeDesc", "提出人员修改申请");
		mv.addObject("currentNode", "");
		mv.addObject("Handler", UserUtil.getUserId());
		mv.addObject("isHandler", true);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("isEdit", "editable");
		return mv;
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/basicinfo/peopleApply/add");
		mv.addObject("title", "对研发基本信息中人员信息修改申请");
		
		if (id!=null) {
			view_PeopleApply viewApply = viewApplyService.selectByID(id);
			if (viewApply != null) {
				mv.addObject("code", viewApply.getApplyCode());
				mv.addObject("id", viewApply.getId());
				mv.addObject("currentNodeDesc", viewApply.getStatusDesc());
				mv.addObject("state", viewApply.getStatus());
				mv.addObject("currentNode", viewApply.getCurrentnode());
				mv.addObject("Handler", viewApply.getHandler());
				mv.addObject("applyCode", viewApply.getApplyCode());
				mv.addObject("subSign", viewApply.getFirstSign());
				mv.addObject("submitDate", viewApply.getFirstDate());				
				mv.addObject("IPMTSign", viewApply.getIpmtSign());
				mv.addObject("IPMTDate", viewApply.getIpmtDate());
				mv.addObject("processID", viewApply.getProcessid());
				String title="";
				switch(viewApply.getPinfotype()) {
					case "PLIPMT" :title=viewApply.getPlipmt();break;
					case "ProdLine" :title=viewApply.getProdline();break;
					case "PDT" :title=viewApply.getPdt();break;
					case "Version" :title=viewApply.getVersion();break;
					case "Release" :title=viewApply.getRelease();break;
					case "BVersion" :title=viewApply.getBversion();break;
				}
				mv.addObject("copyTitle", "人员信息申请 : "+title);
				
				if (FlowableConst.PROJECTCODE_STATUS_DRAFT.equals(viewApply.getStatus())) {
					if(((String)SecurityUtils.getSubject().getPrincipal()).equalsIgnoreCase(viewApply.getHandler())) {
						mv.addObject("isEdit", "editable");
					}else {
						mv.addObject("isEdit", "disable");
					}
				} else if ("10".equals(viewApply.getStatus())) {
					mv.addObject("isEdit", "disable");
				} else {
					Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(viewApply.getInstanseId(),
							(String) SecurityUtils.getSubject().getPrincipal());
					if (task != null) {
						mv.addObject("taskId", task.getId());
						mv.addObject("isHandler", ((String)SecurityUtils.getSubject().getPrincipal()).equalsIgnoreCase(viewApply.getHandler()));
						mv.addObject("isChangeUser", (UserUtil.checkIsAdmin() || SecurityUtils.getSubject().getPrincipal().equals(viewApply.getHandler()))?true:false);
					}
				}
				mv.addObject("logs", processLogService.getByProcessCode(viewApply.getApplyCode()));
			}
		}
		mv.addObject("id_suffix", new Date().getTime());
		
		return mv;
	}
	
	@RequestMapping(value="/getByID/{id}")
	public ResponseResult getDiff(@PathVariable("id") Integer id) {
		return ResponseResult.success(viewApplyService.selectByID(id));
	}
	
	@RequestMapping(value="/save",produces="text/html;charset=utf-8")
	public  ResponseResult save(IBDS_People_APPLY apply,String edit,IBDS_People_PROCESS process,Integer applyID, Integer processID) {
		
		try {
			List<IBDS_People_Item_APPLY> lstEdit=new ArrayList<IBDS_People_Item_APPLY>();
			if (StringUtil.isNotEmpty(edit)) {
				lstEdit = JSONObject.parseArray(edit, IBDS_People_Item_APPLY.class);
			}
			apply.setId(applyID);
			process.setId(processID);

			if (applyID==null||applyID==0) {
				String maxcode = processService.getMaxCode();
				apply.setProcessCode(maxcode);			

				process.setApplyCode(maxcode);
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				process.setHandler(UserUtil.getUserId());
				process.setStatusDesc(BasicinfoConst.PRODUCT_STATUS_DRAFTName);
				process.setFirstSign(UserUtil.getUserId());
				process.setFirstDate(new Date());			

			} else {			
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_DRAFT);
				process.setFirstSign(UserUtil.getUserId());
				process.setFirstDate(new Date());			
			}

			applyService.save(apply, lstEdit, process);
			
			return ResponseResult.success(true,apply.getId());
		}catch(Exception e) {
			return ResponseResult.fail(e);
		}		
	}
	
	/**
	 * 提交，启动流程
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/submit",produces="text/html;charset=utf-8")
	public ResponseResult submit(IBDS_People_APPLY apply,String edit,
			IBDS_People_PROCESS process, Integer applyID, Integer processID) {
		try {
			
			apply.setId(applyID);
			process.setId(processID);

			List<IBDS_People_Item_APPLY> lstEdit=new ArrayList<IBDS_People_Item_APPLY>();
			if (StringUtil.isNotEmpty(edit)) {
				lstEdit = JSONObject.parseArray(edit, IBDS_People_Item_APPLY.class);
			}
			
			processService.submit(apply, process, lstEdit);
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
	 * @param params
	 * @param id
	 * @param taskId
	 * @return
	 */
	@RequestMapping(value="/check/{id}/{taskId}",produces="text/html;charset=utf-8")
	public ResponseResult check(@RequestBody Map<String, Object> params, @PathVariable Integer id,
			@PathVariable String taskId) {
		try {
			processService.check(id, taskId, params);
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
	 * @param id
	 * @param taskId
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/changeHandler", method = RequestMethod.POST,produces="text/html;charset=utf-8")
	public ResponseResult changeHandler(Integer id, String taskId, String userId) {
		try {
			view_PeopleApply viewApply = viewApplyService.selectByProcessID(id);
			String user= userService.backDomainAccount(userId);
			
			if(StringUtils.isBlank(user)) {
				throw new RuntimeException("未找到指定的人员");
			}
			processService.changeHandler(id, taskId, user);
			
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
					"修改处理人", null, "处理人由" + userService.getNameDescByAccount(viewApply.getHandler()) + "更改为:" + userId,viewApply.getApplyCode());
			
			mailInfoService.sendMailAndRecord(userId,viewApply.getFirstSign(),"请您审核人员信息申请：IPMT执行秘书审核",null,id,
					"/basicinfo/peopleApply/edit/"+viewApply.getId(),"人员信息申请",taskId);
			//同步eip
			processService.sendProjectCodeEipMsg(viewApply.getId(),false);
			
			return ResponseResult.success("指派成功");
		} catch (Exception e) {
			logger.error("指派失败", e);
			return ResponseResult.fail("指派失败");
		}
	}
	
	@RequestMapping(value="/getByPid")
	public ResponseResult getByPid(Integer pid) {
		return ResponseResult.success(applyService.getByPid(pid));
	}
	
	/**
	 * 作废（草稿、返回修改）
	 * @param processID
	 * @return
	 */
	@RequestMapping(value = "/delProcess", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
	public ResponseResult delProcess(Integer processID) {
		try {
			processService.delProcess(processID);
			return ResponseResult.success("作废成功");
		}catch(Exception e) {
			logger.error("作废失败", e);
			return ResponseResult.fail(e.getMessage());
		}
	}
	

}
