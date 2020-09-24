package com.h3c.mds.flowable.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.*;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.service.UserService;

import com.h3c.mds.sysmgr.util.UserUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartCodeProcessExt;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;
import com.h3c.mds.flowable.entity.PartExport;
import com.h3c.mds.flowable.service.PartCodeApplyService;

/**
 * Part编码流程控制器
 */
@Controller
@RequestMapping("/flowable/partCodeProcess")
public class PartCodeProcessController {

    private static final Logger logger = LoggerFactory.getLogger(PartCodeProcessController.class);

    @Autowired
    private PartCodeProcessService partCodeProcessService;
    @Autowired
    private ProductCodeFlowableService productCodeFlowableService;
    @Autowired
    private ProcessConfigItemService processConfigItemService;
    @Autowired
    private ProcessLogService processLogService;
    @Autowired
    private MailInfoService mailInfoService;
    @Autowired
    private PartCodeApplyService partCodeApplyService;
    @Autowired
    private UserService userService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private FprodService fprodService;
    @Autowired
    private EipService eipService;
    @Value("${sso.main.url}")
    private String siteMainUrl;

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/add";
    }

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/list";
    }

    
//按当前责任人
    
    @RequestMapping("/listByCurHandler")
    public String listByCurHandler(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/curHandlerList";
    }
    
    @RequestMapping("/findPartCodeByCurHandler")
	@ResponseBody
	public String findPartCodeByCurHandler(String id, String searchStr,String prodLine,String pdt,String start,String end){
    	Map<String, Object> param = new HashMap<>();
    	param.put("curHandler", id);
    	param.put("searchStr", searchStr);
    	param.put("prodLine", prodLine);
    	param.put("pdt", pdt);
    	param.put("start", start);
    	param.put("end", end);
		if(StringUtils.isBlank(id)){
			return EasyUIJSONUtils.list2EasyUiTreeGrid_close(partCodeProcessService.findPartCodeByCurHandler(param));
		}else{
			return EasyUIJSONUtils.list2EasyUiTreeGrid_open(partCodeProcessService.findPartCodeByCurHandler(param));
		}
	}
    
    
    //按申请人
    @RequestMapping("/listByApplyer")
    public String listByApplyer(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/applyerList";
    }
    
    
    @RequestMapping("/findPartCodeByApplyer")
	@ResponseBody
	public String findPartCodeByApplyer(String id, String searchStr,String prodLine,String pdt,String start,String end){
    	Map<String, Object> param = new HashMap<>();
    	param.put("applyPerson", id);
    	param.put("searchStr", searchStr);
    	param.put("prodLine", prodLine);
    	param.put("pdt", pdt);
    	param.put("start", start);
    	param.put("end", end);
		if(StringUtils.isBlank(id)){
			return EasyUIJSONUtils.list2EasyUiTreeGrid_close(partCodeProcessService.findPartCodeByApplyer(param));
		}else{
			return EasyUIJSONUtils.list2EasyUiTreeGrid_open(partCodeProcessService.findPartCodeByApplyer(param));
		}
	}
    
    
    //按状态
    @RequestMapping("/listByStatus")
    public String listByStatus(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/statusList";
    }
    
    
    @RequestMapping("/findPartCodeByStatus")
	@ResponseBody
	public String findPartCodeByStatus(String id, String searchStr,String prodLine,String pdt,String start,String end){
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("statusDesc", id);
    	param.put("searchStr", searchStr);
    	param.put("prodLine", prodLine);
    	param.put("pdt", pdt);
    	param.put("start", start);
    	param.put("end", end);
		if(StringUtils.isBlank(id)){
			return EasyUIJSONUtils.list2EasyUiTreeGrid_close(partCodeProcessService.findPartCodeByStatus(param));
		}else{
			return EasyUIJSONUtils.list2EasyUiTreeGrid_open(partCodeProcessService.findPartCodeByStatus(param));
		}
	}
    
    //按pdm申请单号
    @RequestMapping("/listByPdm")
    public String listByPdm(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/pdmList";
    }
    
    @RequestMapping("/findPartCodeByPdm")
	@ResponseBody
	public Map<String,Object> findPartCodeByPdm(Integer page, Integer rows, String searchStr,String prodLine,String pdt,String start,String end){
        try {
        	Map<String, Object> searchMap = new HashMap<>();        
    		searchMap.put("searchParas", searchStr);
    		searchMap.put("prodLine", prodLine);
    		searchMap.put("pdt", pdt);
    		searchMap.put("start", start);
    		searchMap.put("end", end);
            PageInfo<PartCodeProcess> pageInfo = partCodeProcessService.findByPage(page,rows,searchMap);
            Map<String,Object> map = new HashMap<>();
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return map;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
    //按已关闭待更新
    @RequestMapping("/listByCloseProcess")
    public String listByCloseProcess(Model model){
        model.addAttribute("timestamp", System.currentTimeMillis());
        return "/flowable/partCode/closeProcessList";
    }
    
    @RequestMapping("/findPartCodeByCloseProcess")
	@ResponseBody
	public Map<String, Object> findPartCodeByCloseProcess(Integer page, Integer rows,  String searchStr){
    	PageInfo pageInfo =  partCodeProcessService.findPartCodeByCloseProcess(page, rows, searchStr);
    	Map<String,Object> map = new HashMap<>();
        map.put("rows", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return map;
		
	}
    
    @RequestMapping("/edit/{id}")
    public String edit(Model model,@PathVariable Integer id){

        PartCodeProcessExt processExt = partCodeProcessService.getByIdCasecadeSub(id);
        //草稿
        if("0".equals(processExt.getStatus()) || null == processExt.getStatus()){
            String s = userService.backDomainAccount(processExt.getApplyPerson());
            if(StringUtils.equalsIgnoreCase(processExt.getHandler(), UserUtils.getCurrentUserId()) || StringUtils.equalsIgnoreCase(s, UserUtils.getCurrentUserId())){
                model.addAttribute("currentNode", "editable");
            }else{
                model.addAttribute("currentNode", "disable");
            }

            //流程结束
        }else if("10".equals(processExt.getStatus())){
            model.addAttribute("currentNode", "disable");
        }else{
            Task task = taskService.createTaskQuery().processInstanceId(processExt.getInstanseId()).singleResult();
            if(task != null){
                model.addAttribute("taskId", task.getId());
                model.addAttribute("isHandler", org.apache.commons.lang3.StringUtils.equalsIgnoreCase((CharSequence) SecurityUtils.getSubject().getPrincipal(),processExt.getHandler()));
                model.addAttribute("currentNode", processExt.getCurrentNode());
            }
        }
        boolean isAdmin = UserUtil.checkIsAdmin();
        if(!UserUtil.checkIsAdmin()){
            String roleCode = (String) SecurityUtils.getSubject().getSession().getAttribute("roleCode");
            if(roleCode.contains("R_000008")){
                isAdmin = true;
            }else{
                isAdmin = false;
            }
        }
        model.addAttribute("isAdmin", isAdmin);
        model.addAttribute("timestamp", System.currentTimeMillis());
        model.addAttribute("pageType", "edit");
        model.addAttribute("id", id);
        model.addAttribute("entity", processExt);
        if(processExt.getPdtId() != null){
            ProcessConfigItem item = processConfigItemService.getById(processExt.getPdtId());
            if(item != null){
                processExt.setPdtName(item.getContent());
            }
        }
        model.addAttribute("logs", processLogService.getByProcessCode(processExt.getApplyCode()));
        return "/flowable/partCode/add";
    }

    @RequestMapping("/findByPage")
    @ResponseBody
    public Map<String,Object> findByPage(Integer page, Integer rows, String searchStr,String prodLine,String pdt,String start,String end){
        try {
        	Map<String, Object> searchMap = new HashMap<>();        
    		searchMap.put("searchStr", searchStr);
    		searchMap.put("prodLine", prodLine);
    		searchMap.put("pdt", pdt);
    		searchMap.put("start", start);
    		searchMap.put("end", end);
            PageInfo<PartCodeProcess> pageInfo = partCodeProcessService.findByPage(page,rows,searchMap);
            Map<String,Object> map = new HashMap<>();
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return map;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }

    @RequestMapping( value = "/save",produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult save(PartCodeProcessExt processExt){
        try {
            initProdineId(processExt);
            processExt.setHandler((String) SecurityUtils.getSubject().getPrincipal());
            processExt.setStatusDesc("草稿");
            processExt.setStatus("0");  //草稿
            if(processExt.getId() == null){
                partCodeProcessService.create(processExt);
            }else{
                partCodeProcessService.update(processExt);
            }
            return ResponseResult.success(processExt);
        }catch (Exception e){
            logger.error("保存失败", e);
            return ResponseResult.fail("保存失败");
        }
    }

    @RequestMapping("/deleteById/{id}")
    @ResponseBody
    public ResponseResult deleteById(@PathVariable Integer id){
        try {
            partCodeProcessService.deleteById(id);
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("删除失败", e);
            return ResponseResult.fail("删除失败");
        }
    }

    private void initProdineId(PartCodeProcessExt processExt) {
        //获取产品族
        if(!CollectionUtils.isEmpty(processExt.getApplys())){
            for(PartCodeApply apply : processExt.getApplys()){
                FProd fprod = fprodService.getById(apply.getProdId());
                apply.setProdlineId(fprod.getProdlineId());
            }
        }
    }

    @RequestMapping(value = "/submit",produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult submit(PartCodeProcessExt processExt){
        try {
            initProdineId(processExt);
            partCodeProcessService.validateForm(processExt);
            Map<String, Object> variables = new HashMap<String, Object>();

            variables.put("applyDept", processExt.getDeptType());
            variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal());
            variables.put("pdtMgn", processExt.getPdtMgn());
            variables.put("applyCode", processExt.getApplyCode());
            variables.put("applyType", "1");
            ProcessConfigItem item = processConfigItemService.getById(processExt.getPdtId());
            if(item == null) throw new FlowableException("PDT异常，请联系管理员检查PDT！");
            if(org.apache.commons.lang3.StringUtils.isBlank(item.getPdtMgn())) throw new FlowableException("该PDT没有配置PDT经理,请联系管理员！");
            if(org.apache.commons.lang3.StringUtils.isBlank(item.getFprodPerson())) throw new FlowableException("该PDT没有配置财务接口人，请联系管理员！");
            variables.put("fprodPerson", item.getFprodPerson());
            variables.put("pdtMgn",item.getPdtMgn());
            String userId = (String) SecurityUtils.getSubject().getPrincipal();
            //第一次提交
            if(org.apache.commons.lang3.StringUtils.isBlank(processExt.getInstanseId())){
                //启动流程并通过第一个
                String instanceId = productCodeFlowableService.startFlowableAndPassOne("partCodeApply",userId,variables);
                processExt.setInstanseId(instanceId);
            }else{
                //打回后重复提交
                Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(processExt.getInstanseId(), userId);
                taskService.complete(task.getId(), variables);
                //productCodeFlowableService.pass(task.getId());
            }
            processExt.setHandler(FlowableCache.getCurrentHandler());
            processExt.setCurrentNode(FlowableCache.getCurrentNode());
            processExt.setStatusDesc(FlowableCache.getCurrentStatusDesc());
            processExt.setStatus(FlowableConst.PROJECTCODE_STATUS_APPLY);
            processExt.setSubmitDate(new Date());
            processExt.setSubSign(userId);
            if(processExt.getId()==null){
                partCodeProcessService.create(processExt);
            }else{
                partCodeProcessService.update(processExt);
            }
            processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),"提交申请" , null, FlowableCache.getCurrentStatusDesc(), processExt.getApplyCode());
            Task task = taskService.createTaskQuery().processInstanceId(processExt.getInstanseId()).singleResult();
            mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),userId,"请您审核Part编码申请表："+FlowableCache.getCurrentStatusDesc(),null,processExt.getId(),
                    "/flowable/partCodeProcess/edit/"+processExt.getId(),"Part编码申请",task.getId());
            // 集成eip
            String eipUrl = siteMainUrl + "/eipLogin?docuId=" + processExt.getApplyCode();
            String productUrl = "/flowable/partCodeProcess/edit/" + processExt.getId();
            String authorName = userService
                    .getUserNameByAccount(processExt.getCreateUser() == null ? userId : processExt.getCreateUser());
            String addUserName = userService.getUserNameByAccount(processExt.getHandler());

            eipService.syncEip("Part编码申请", processExt.getApplyCode(), processExt.getHandler(), addUserName,
                    processExt.getStatusDesc(), EipConst.PROCESSID_PARTTCODE, eipUrl, productUrl,
                    processExt.getCreateUser() == null ? userId : processExt.getCreateUser(), authorName, false);
            return ResponseResult.success(processExt, "提交成功");
        }catch (FlowableException e){
            return ResponseResult.fail(e.getMessage());
        }catch (Exception e){
            logger.error("提交失败", e);
            return ResponseResult.fail("提交 失败");
        }finally {
            FlowableCache.removeAll();
        }
    }

    @RequestMapping("/check/{id}/{taskId}")
    @ResponseBody
    public ResponseResult check(@RequestBody Map<String,Object> params, @PathVariable Integer id, @PathVariable String taskId){
        try {
            partCodeProcessService.check(id,taskId,params);
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("审核失败", e);
            return ResponseResult.fail("审核失败");
        }finally {
            FlowableCache.removeAll();
        }
    }

    @RequestMapping(value = "/changeHandler",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult changeHandler(Integer id,String taskId,String userId){
        try {
            partCodeProcessService.changeHandler(id,taskId,userId);
            PartCodeProcess process = partCodeProcessService.getById(id);
            mailInfoService.sendMailAndRecord(userId,process.getSubSign(),"请您审核Part编码申请表："+process.getStatusDesc(),null,id,
                    "/flowable/partCodeProcess/edit/"+id,"Part编码申请",taskId);
            return ResponseResult.success("指派成功");
        } catch (FlowableException e){
            return ResponseResult.fail(e.getMessage());
        }catch (Exception e){
            logger.error("修改当前处理人失败", e);
            return ResponseResult.fail("修改当前处理人失败");
        }
    }

    @RequestMapping("/endProcess")
    @ResponseBody
    public ResponseResult endProcess(Integer id,String taskId){
        try {
            partCodeProcessService.endProcess(id,taskId);
            PartCodeProcess process = partCodeProcessService.getById(id);
            String account = userService.backDomainAccount(process.getApplyPerson());
            mailInfoService.sendMailAndRecord(account,"您的Part编码申请表单据被终止："+process.getStatusDesc(),null,id,
                    "/flowable/partCodeProcess/edit/"+id,"Part编码申请",taskId);
            return ResponseResult.success("终止当前流程成功");
        }catch (Exception e){
            logger.error("终止当前流程失败", e);
            return ResponseResult.fail("终止当前流程失败");
        }
    }
    
    @RequestMapping("/export")
    @ResponseBody
    public void Export(String searchStr,String prodLine,String pdt,String start,String end, HttpServletResponse response) {

    	 String[] header=new String[] {"申请编号","PDM申请编号","BOM编码","BOM描述","产品代码","对内英文描述","对外中文描述","对外英文描述","商业模式","产品线","产品族","产品中文名称",
				 "产品编码","编码类型"};
		 String[] column=new String[] {"ApplyCode","PdmApplyCode","ProjectNo","ProjectName","ProductNum","InsideDescEn","AbroadDescCn","AbroadDescEn","BusinessModel"
		 		,"ProdlineName","ProdName","ProductNameCn","ProductCode", "Datasource"};
		 Map<String, Object> searchMap = new HashMap<>();        
		 searchMap.put("searchParas", searchStr);
		 searchMap.put("prodLine", prodLine);
		 searchMap.put("pdt", pdt);
		 searchMap.put("start", start);
		 searchMap.put("end", end);
		 
		 List<PartExport> lst=partCodeApplyService.getExportList(searchMap);
		 
		 ExportExcelWrapper<PartExport> excelWrapper=new ExportExcelWrapper<PartExport>();
	    	
		 excelWrapper.exportExcel("Part编码导出", "Part编码导出", header,column, lst, response, "2007");
    }

}
