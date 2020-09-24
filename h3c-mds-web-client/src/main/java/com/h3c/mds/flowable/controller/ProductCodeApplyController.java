package com.h3c.mds.flowable.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h3c.mds.auth.util.BusinessFilterThreadContext;
import com.h3c.mds.flowable.entity.*;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.*;
import com.h3c.mds.flowable.service.impl.ProductCodeProcessServiceImpl;
import com.h3c.mds.utils.CommonsThreadCache;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.shiro.SecurityUtils;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.image.ProcessDiagramGenerator;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.flowable.excel.AbstractExcelReader;
import com.h3c.mds.flowable.excel.ProductCodeExcelReader;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;

/**
 * 产品编码控制器
 * @author sYS2403
 *
 */
@Controller
@RequestMapping("/flowable/productCodeApply")
public class ProductCodeApplyController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductCodeApplyController.class);
	
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private ProcessEngine processEngine;
	@Autowired
	private ProductCodeFlowableService productCodeFlowableService;
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	@Autowired
    private ProductCodeApplyService productCodeApplyService;
	@Autowired
    private FProdLineService fProdLineService;
	@Autowired
    private FprodService fprodService;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private ProcessConfigItemService processConfigItemService;
	@Autowired
	private MailInfoService mailInfoService;
	@Autowired
	private UserService userService;
	@Autowired
    private FProductCodeService fProductCodeService;
	@Autowired
	private BomService bomService;
	@Autowired
	private DicService dicService;
	@Autowired
	private EipService eipService;
	@Value("${sso.main.url}")
	private String siteMainUrl;
	
	@RequestMapping("/getDicItem")
	@ResponseBody
	public List<IBDS_Dic> getDicItem(String type){
		Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", type);
		List<IBDS_Dic> deptList = dicService.getDic(param);
		return deptList;
	}

	/**
	 * 开始流程
	 */
	@RequestMapping("/startFlowable")
	public void startFlowable(){
		Map<String, Object> variables = new HashMap<String, Object>();
		productCodeFlowableService.startFlowable("productCodeApply", variables);
	}
	
	@RequestMapping("/pass")
	public void pass(String taskId){
		productCodeFlowableService.pass(taskId);
	}
	
	@RequestMapping("/reject")
	public void reject(String taskId){
		productCodeFlowableService.reject(taskId);
	}
	
	@RequestMapping("/dutyList")
	public void dutyList(String userId){
		productCodeFlowableService.dutyList(userId);
	}

	@RequestMapping("/change")
	public void change(String taskId,String userId){
		productCodeFlowableService.changeHandler(taskId, userId);
	}
	
	/**
	 * 保存，暂存数据不启动流程
	 */
	@ResponseBody
	@RequestMapping(value = "/save",produces = "text/html;charset=utf-8")
	public ResponseResult save(ProductCodeProcessExt process){
		try {
		    checkSubForm(process);
		    process.setHandler((String) SecurityUtils.getSubject().getPrincipal());
		    process.setStatusDesc("草稿");
			process.setStatus(FlowableConst.PROJECTCODE_STATUS_DRAFT);
			if(process.getId()==null){
				productCodeProcessService.create(process);
			}else{
				productCodeProcessService.update(process);
			}
			return ResponseResult.success(process,"保存成功");
		}catch (Exception e){
			logger.error("保存失败", e);
			return ResponseResult.fail("保存失败");
		}
	}

	@RequestMapping("/deleteById/{id}")
	@ResponseBody
	public ResponseResult deleteById(@PathVariable Integer id){
		try {
			productCodeProcessService.deleteById(id);
			return ResponseResult.success();
		}catch (Exception e){
			logger.error("删除失败", e);
			return ResponseResult.fail("删除失败");
		}
	}

    private void checkSubForm(ProductCodeProcessExt process) {
        List<ProductCodeApply> applys = process.getApplys();
        if(!CollectionUtils.isEmpty(applys)){
            for(ProductCodeApply apply : applys){
                String prodline = apply.getProdline();
				List<FProdLine> fProdLines;
                if(StringUtils.isNotBlank(apply.getProductCode())){
					fProdLines = fProdLineService.getByNoAndName(apply.getProductCode().substring(0, 2), prodline);
				}else{
					fProdLines = fProdLineService.getByNoAndName(apply.getProdlineNo()==null?"":apply.getProdlineNo(), apply.getProdline()==null?"":apply.getProdline());
				}

                if(!CollectionUtils.isEmpty(fProdLines)){
                    apply.setProdlineId(fProdLines.get(0).getId());
                    apply.setProdlineName(apply.getProdline());
                }else{
                    boolean isIntProdline = false;
                    try {
                        Integer.parseInt(prodline);
                        isIntProdline = true;
                    }catch (NumberFormatException e){
                        isIntProdline = false;
                    }
                    //如果为整数  可能是id  也可能是 手动输入数字字符出
                    if(isIntProdline){
                        FProdLine fProdLine = fProdLineService.getById(Integer.parseInt(prodline));
                        //如果为null 或者 财务产品线名称和产品编码产品线名称不一致 则为
                        if(fProdLine == null){
                            apply.setProdlineId(0);
                            apply.setProdlineName(prodline);
                        }else if(!StringUtils.equals(fProdLine.getProdlineDesc(), apply.getProdlineName())){
                            apply.setProdlineId(0);
                            apply.setProdlineName(prodline);
                        }else {
                            apply.setProdlineId(fProdLine.getId());
                        }
                    }else{
                        //如果不是整数  则为手动输入  产品线id置空 产品线名称设为 手动输入的值
                        apply.setProdlineId(0);
                        apply.setProdlineName(prodline);
                    }
                }

                String product = apply.getProduct();
                if(StringUtils.isNotBlank(product)){
					List<FProd> fProdList = fprodService.getByNoAndName(apply.getProductNo(), product);
					if(!CollectionUtils.isEmpty(fProdList)){
						apply.setProductId(fProdList.get(0).getId());
						apply.setProductName(product);
					}else{
						//如果不是整数  则为手动输入  产品线id置空 产品线名称设为 手动输入的值
						apply.setProductId(0);
						apply.setProductName(product);
					}
//                    boolean isIntProduct = false;
//                    try {
//                        Integer.parseInt(product);
//                        isIntProduct = true;
//                    }catch (NumberFormatException e){
//                        isIntProduct = false;
//                    }
//                    //如果为整数  可能是id  也可能是 手动输入数字字符出
//                    if(isIntProduct){
//                        FProd fProd = fprodService.getById(Integer.parseInt(product));
//                        //如果为null 或者 财务产品线名称和产品编码产品线名称不一致 则为
//                        if(fProd == null){
//                            apply.setProductId(0);
//                            apply.setProductName(product);
//                        }else if(!StringUtils.equals(fProd.getProdName(), apply.getProductName())){
//                            apply.setProductId(0);
//                            apply.setProductName(product);
//                        }else {
//                            apply.setProductId(fProd.getId());
//                        }
//                    }else{
//                        List<FProd> fProdList = fprodService.getByNoAndName(apply.getProductNo(), product);
//                        if(!CollectionUtils.isEmpty(fProdList)){
//                            apply.setProductId(fProdList.get(0).getId());
//                            apply.setProductName(product);
//                        }else{
//                            //如果不是整数  则为手动输入  产品线id置空 产品线名称设为 手动输入的值
//                            apply.setProductId(0);
//                            apply.setProductName(product);
//                        }
//
//                    }
                }

            }
        }
    }

    /**
	 * 提交，启动流程
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/submit", produces = "text/html;charset=utf-8")
	public ResponseResult submit(ProductCodeProcessExt process){
		try {
            checkSubForm(process);

            productCodeProcessService.validateForm(process);

			String userId = (String) SecurityUtils.getSubject().getPrincipal();

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put("applyType", process.getApplyType());
			variables.put("applyDept", process.getApplyDept());
			variables.put("applyPerson", SecurityUtils.getSubject().getPrincipal());
			variables.put("applyCode", process.getApplyCode());
			//TODO 后续有事件重构从配置表中获取
			Integer pdtId;
			if("1".equals(process.getApplyType()) || "2".equals(process.getApplyType())){
				pdtId = process.getApplys().get(0).getPdtId();
			}else{
				FProductCode productCodeApply = fProductCodeService.getById(process.getApplys().get(0).getOldId());
				pdtId = productCodeApply.getPdtId();
			}
			ProcessConfigItem item = processConfigItemService.getById(pdtId);
			if(item == null) throw new FlowableException("PDT异常，请联系管理员检查PDT！");
			if(StringUtils.isBlank(item.getPdtMgn())) throw new FlowableException("该PDT没有配置PDT经理,请联系管理员！");
            if(StringUtils.isBlank(item.getFprodPerson())) throw new FlowableException("该PDT没有配置财务接口人，请联系管理员！");
			variables.put("fprodPerson", item.getFprodPerson());
            variables.put("pdtMgn",item.getPdtMgn());
            if(!"1".equals(process.getApplyType())){
				setCounterSignPersons(variables,process);
			}

			//第一次提交
			if(StringUtils.isBlank(process.getInstanseId())){
				//启动流程并通过第一个
				String instanceId = productCodeFlowableService.startFlowableAndPassOne("productCodeApply",userId,variables);
				process.setInstanseId(instanceId);
			}else{
				//打回后重复提交
				Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId(process.getInstanseId(), userId);
				taskService.complete(task.getId(), variables);
				//productCodeFlowableService.pass(task.getId());
			}
			process.setHandler(FlowableCache.getCurrentHandler());
			process.setCurrentNode(FlowableCache.getCurrentNode());
			process.setStatusDesc(FlowableCache.getCurrentStatusDesc());
			process.setStatus(FlowableConst.PROJECTCODE_STATUS_APPLY);
			process.setSubmitDate(new Date());
			process.setSubSign(userId);
			if(process.getId()==null){
				productCodeProcessService.create(process);
			}else{
				productCodeProcessService.update(process);
			}
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),"提交申请" , null, FlowableCache.getCurrentStatusDesc(), process.getApplyCode());
			//mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),userId,"请您审核产品编码申请表："+FlowableCache.getCurrentStatusDesc(),"<a href='http://10.90.14.38:8080/flowable/productCode/edit/"+process.getId()+"'>打开链接</a>",process.getId());
			List<ProcessLog> usertask4 = processLogService.getByProcessCodeAndCheckNode(process.getApplyCode(), "usertask4");
			if(!CollectionUtils.isEmpty(usertask4)){
				for(ProcessLog log : usertask4){
					log.setCheckPerson("");
					processLogService.update(log);
				}
			}
			Task task = taskService.createTaskQuery().processInstanceId(process.getInstanseId()).singleResult();
			mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),userId,"请您审核产品编码申请表："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
					"/flowable/productCodeApply/edit/"+process.getId(),"产品编码申请",task.getId());
			// 集成eip
			String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplyCode();
			String productUrl = "/flowable/productCodeApply/edit/" + process.getId();
			String authorName = userService
					.getUserNameByAccount(process.getCreateUser() == null ? userId : process.getCreateUser());
			String addUserName = userService.getUserNameByAccount(process.getHandler());

			eipService.syncEip("产品编码申请", process.getApplyCode(), process.getHandler(), addUserName,
					process.getStatusDesc(), EipConst.PROCESSID_PRODUCTCODE, eipUrl, productUrl,
					process.getCreateUser() == null ? userId : process.getCreateUser(), authorName, false);
			return ResponseResult.success(process, "提交成功");
		}catch (FlowableException e){
			return ResponseResult.fail(e.getMessage());
		}catch (Exception e){
			logger.error("保存失败", e);
			return ResponseResult.fail("保存失败");
		}finally {
			FlowableCache.removeCurrentNode();
			FlowableCache.removeCurrentHandler();
			FlowableCache.removeAll();
		}
	}

	private void setCounterSignPersons(Map<String, Object> variables, ProductCodeProcessExt process) {
		List<String> counterSingPersons = new ArrayList<>();
		for (ProductCodeApply productCodeApply : process.getApplys()){
			Integer pdtId;
			if("1".equals(process.getApplyType()) || "2".equals(process.getApplyType())){
				pdtId = productCodeApply.getPdtId();
			}else{
				FProductCode fProductCode = fProductCodeService.getById(productCodeApply.getOldId());
				pdtId = fProductCode.getPdtId();
			}
			ProcessConfigItem item = processConfigItemService.getById(pdtId);
			if(item == null) throw new FlowableException("PDT异常，请联系管理员检查PDT！");
			if(StringUtils.isBlank(item.getFprodPerson())) throw new FlowableException("PDT："+item.getContent()+"，没有配置财务接口人，请联系管理员！");
			if(!counterSingPersons.contains(item.getFprodPerson())){
				counterSingPersons.add(item.getFprodPerson());
			}

		}
		variables.put("counterSignPersons", counterSingPersons);
	}

	@RequestMapping("/check/{id}/{taskId}")
    @ResponseBody
	public ResponseResult check(@RequestBody Map<String,Object> params, @PathVariable Integer id,@PathVariable String taskId){
		//
		String s = UUID.randomUUID().toString();
		String name = Thread.currentThread().getName();
		try {
            productCodeProcessService.check(id,taskId,params);
            return ResponseResult.success();
        }catch (FlowableException e){
        	return ResponseResult.fail(e.getMessage());
		}catch (Exception e){


			logger.info("controller当前线程名称------"+name);
            logger.error("审核失败", e);
            return ResponseResult.fail("审核失败");
        }finally {
			FlowableCache.removeAll();
		}
    }

    @RequestMapping("/viewMap")
	@ResponseBody
    public String viewMap(){
		ConcurrentHashMap concurrentHashMap = ProductCodeProcessServiceImpl.concurrentHashMap;
		Set<Map.Entry> set = concurrentHashMap.entrySet();
		String str = "";
		for (Map.Entry m :set){
			Object key = m.getKey();
			Object value = m.getValue();
			//logger.info("线程安全MAP：key---"+key+"----value---"+value);
			//System.out.println("线程安全MAP：key---"+key+"----value---"+value);
			str += "线程安全MAP：key---"+key+"----value---"+value +"\n";
		}
		return str;
	}

	@RequestMapping("/clearMap")
	public void clear(){
		ProductCodeProcessServiceImpl.concurrentHashMap.clear();
	}

    @RequestMapping("/updateBaseInfo/{id}/{taskId}")
	@ResponseBody
    public ResponseResult updateBaseInfo(@RequestBody Map<String,Object> params, @PathVariable Integer id,@PathVariable String taskId){
		try {
			productCodeProcessService.updateBaseInfo(id,taskId,params);
			return ResponseResult.success();
		}catch (Exception e){
			logger.error("更新基本信息失败", e);
			return ResponseResult.fail("更新基本信息失败");
		}
	}

    @RequestMapping("/list")
    public String list(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "flowable/productCodeApply/list";
	}

	@RequestMapping("/add")
	public String add(Model model,ProductCodeProcessExt process){
		String maxCode = productCodeProcessService.getMaxCode();
		process.setApplyCode(maxCode);
		process.setStatusDesc("填写申请");
		process.setHandler((String) SecurityUtils.getSubject().getPrincipal());
		model.addAttribute("timestamp", System.currentTimeMillis());
		model.addAttribute("entity", process);

		model.addAttribute("pageType", "add");
		model.addAttribute("currentNode", "editable");
		return "flowable/productCodeApply/add";
	}

	@RequestMapping("/edit/{id}")
	public String edit(Model model,@PathVariable Integer id){
        ProductCodeProcess process = productCodeProcessService.getByIdCasecadeSub(id);
        if(FlowableConst.PROJECTCODE_STATUS_DRAFT.equals(process.getStatus())){

            if(StringUtils.equalsIgnoreCase((CharSequence) SecurityUtils.getSubject().getPrincipal(),process.getHandler())){
                model.addAttribute("currentNode", "editable");
				model.addAttribute("isHandler", true);
            }else{
                model.addAttribute("currentNode", "disable");
				model.addAttribute("isHandler", false);
            }

		}else if("10".equals(process.getStatus())){
			model.addAttribute("currentNode", "disable");
		}else{
			Task task = productCodeFlowableService.getTaskByInstanceIdAndUserId1(process.getInstanseId(), (String) SecurityUtils.getSubject().getPrincipal());
			if(task != null){
				model.addAttribute("taskId", task.getId());
				model.addAttribute("isHandler", StringUtils.equalsIgnoreCase((CharSequence) SecurityUtils.getSubject().getPrincipal(),task.getAssignee()));
				model.addAttribute("currentNode", process.getCurrentNode());
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
		model.addAttribute("applyCount", process.getApplyCount());
		model.addAttribute("id", id);
		model.addAttribute("entity", process);
		model.addAttribute("logs", processLogService.getByProcessCode(process.getApplyCode()));
		if("2".equals(process.getApplyType())){
			List<ProcessLog> list = processLogService.getByProcessCodeAndCheckNode(process.getApplyCode(),"usertask4");
			model.addAttribute("fprdLogs", list);
		}
		return "flowable/productCodeApply/add";
	}

	@RequestMapping("/getByIdCasecadeSub/{id}")
	@ResponseBody
	public ResponseResult getByIdCasecadeSub(@PathVariable Integer id){
		try {
			ProductCodeProcess process = productCodeProcessService.getByIdCasecadeSub(id);
			return ResponseResult.success(process);
		}catch (Exception e){
			logger.error("根据id级联查询失败", e);
			return ResponseResult.fail("根据id级联查询失败");
		}
	}

	@RequestMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(Integer page, Integer rows,String searchStr){
		try {
			PageInfo<ProductCodeProcess> pageInfo = productCodeProcessService.findByPage(page,rows,searchStr);
			List<ProductCodeProcess> list = pageInfo.getList();
			for(ProductCodeProcess process : list){
				process.setSubSign(userService.getNameDescByAccount(process.getSubSign()));
				process.setHandler(userService.getNameDescsByAccounts(process.getHandler()));
				ProductCodeProcessExt processExt = (ProductCodeProcessExt) process;
				if(",".equals(processExt.getProductCodes())){
					processExt.setProductCodes("");
				}
			}
			Map<String,Object> map = new HashMap<>();
			map.put("rows", pageInfo.getList());
			map.put("total", pageInfo.getTotal());
			return map;
		}catch (Exception e){
			logger.error("查询失败", e);
			return null;
		}

	}

	@RequestMapping(value = "/changeHandler",method = RequestMethod.POST)
	@ResponseBody
	public ResponseResult changeHandler(Integer id,String taskId,String userId){
		try {
			productCodeProcessService.changeHandler(id,taskId,userId);
			ProductCodeProcess process = productCodeProcessService.getById(id);
			return ResponseResult.success("指派成功");
		} catch (Exception e){
			logger.error("指派失败", e);
			return ResponseResult.fail("指派失败");
		}
	}

//	@RequestMapping("/subForm/{type}")
//	public String subForm(@PathVariable String type,Integer id,String applyType,String applyCount,Long timestamp,Model model){
//        model.addAttribute("timestamp", timestamp);
//        model.addAttribute("applyType", applyType);
//        model.addAttribute("applyCount", applyCount);
//        model.addAttribute("currentNode", "editable");
//        //新增
//        if("1".equals(applyType)){
//			return "flowable/productCodeApply/sub"+type;
//		}else if("2".equals(applyType)){
//			return "flowable/productCodeApply/subEdit"+type;
//		}
//        return "flowable/productCodeApply/subAdd";
//    }

    @RequestMapping("/subForm/{type}")
    public String subForm(@PathVariable String type,Model model,ProductCodeProcessExt processExt,Long timestamp,String pageType,String clearBasisMaterial){
        model.addAttribute("timestamp", timestamp);
        model.addAttribute("applyType", processExt.getApplyType());
        model.addAttribute("applyCount", processExt.getApplyCount());
        model.addAttribute("currentNode", "editable");
        model.addAttribute("entity", processExt);
        model.addAttribute("pageType", pageType);
        model.addAttribute("clearBasisMaterial", clearBasisMaterial);
        //新增
        if(processExt.getApplys() == null){
            processExt.setApplys(new ArrayList<ProductCodeApply>());
        }
        if(processExt.getApplys().size()<Integer.parseInt(processExt.getApplyCount())){
            for(int i=0;i<Integer.parseInt(processExt.getApplyCount())-processExt.getApplys().size();i++){
                processExt.getApplys().add(new ProductCodeApply());
            }
        }else if(processExt.getApplys().size()>Integer.parseInt(processExt.getApplyCount())){
            for(int i=processExt.getApplys().size()-1;i>Integer.parseInt(processExt.getApplyCount())-1;i-- ){
                processExt.getApplys().remove(i);
            }
        }
        checkSubForm(processExt);

        if("1".equals(processExt.getApplyType())){
            return "flowable/productCodeApply/sub"+type;
        }else if("2".equals(processExt.getApplyType())){
            return "flowable/productCodeApply/subEdit"+type;
        }else if("3".equals(processExt.getApplyType())){
        	return "flowable/productCodeApply/subDel"+type;
		}
        return "flowable/productCodeApply/sub";
    }

    @RequestMapping("/subFormJson/{type}")
    public String subFormJson(@PathVariable String type,Model model,@RequestBody Map<String,Object> map, ProductCodeProcessExt processExt,Long timestamp){
        model.addAttribute("timestamp", timestamp);
        model.addAttribute("applyType", processExt.getApplyType());
        model.addAttribute("applyCount", processExt.getApplyCount());
        model.addAttribute("currentNode", "editable");
        model.addAttribute("entity", processExt);
		model.addAttribute("clearBasisMaterial", "false");
        //新增
        if(processExt.getApplys() == null){
            processExt.setApplys(new ArrayList<ProductCodeApply>());
        }
        if(processExt.getApplys().size()<Integer.parseInt(processExt.getApplyCount())){
            for(int i=0;i<Integer.parseInt(processExt.getApplyCount())-processExt.getApplys().size();i++){
                processExt.getApplys().add(new ProductCodeApply());
            }
        }else if(processExt.getApplys().size()>Integer.parseInt(processExt.getApplyCount())){
            for(int i=processExt.getApplys().size()-1;i>Integer.parseInt(processExt.getApplyCount())-1;i-- ){
                processExt.getApplys().remove(i);
            }
        }
        checkSubForm(processExt);

        if("1".equals(processExt.getApplyType())){
            return "flowable/productCodeApply/sub"+type;
        }else if("2".equals(processExt.getApplyType())){
            return "flowable/productCodeApply/subEdit"+type;
        }else if("3".equals(processExt.getApplyType())){
            return "flowable/productCodeApply/subDel"+type;
        }
        return "flowable/productCodeApply/sub";
    }

    @RequestMapping("/hasProductCode")
    @ResponseBody
    public ResponseResult hasProductCode(String productCode){
	    try {
            List<ProductCodeApply> list = productCodeApplyService.getZTByProductCode(productCode);
            if(CollectionUtils.isEmpty(list)){
                return ResponseResult.success(false);
            }else{
                return ResponseResult.success(true);
            }

        }catch (Exception e){
	        logger.error("查询失败", e);
	        return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping("/getDataList")
	@ResponseBody
    public Object getDataList(String id,String searchStr,String type){
		// 查询参数放入Map中
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("id", id);
		searchMap.put("searchParas", searchStr);
		searchMap.put("type", type);
		List<ProductCodeProcessExt> list = productCodeProcessService.dataList(searchMap);

		for (ProductCodeProcessExt processExt : list){
			if(processExt == null) continue;
			if(("1".equals(type) && StringUtils.isEmpty(id)) || ("4".equals(type) && StringUtils.isEmpty(id))){
				processExt.setName(userService.getNameDescByAccount(processExt.getName()));
				if(",".equals(processExt.getProductCodes())){
					processExt.setProductCodes("");
				}
			}
			processExt.setSubSign(userService.getNameDescByAccount(processExt.getSubSign()));
			processExt.setHandler(userService.getNameDescsByAccounts(processExt.getHandler()));
		}

		return id==null? EasyUIJSONUtils.list2EasyUiTreeGrid_close(list):EasyUIJSONUtils.list2EasyUiTreeGrid_open(list);
	}

	@RequestMapping("/dataList/{type}")
	public String dataList(Model model,@PathVariable String type){
		model.addAttribute("id_suffix", System.currentTimeMillis());
		model.addAttribute("type", type);
		return "flowable/productCodeApply/dataList";
	}

	@RequestMapping("/exportBomCode")
	public void exportBomCode(String bomCodeValue,HttpServletResponse response){
		try {
			List<Bom> dataList = new ArrayList<>();
			if(StringUtils.isNotBlank(bomCodeValue)){
				String[] bomCodes = bomCodeValue.split(",|;");

				for (String bomCode : bomCodes){
					Bom bom = new Bom();
					bom.setS1partnumber(bomCode);
					bom.setS1partdescelements(bomService.getBomDescByBomCode(bomCode));
					dataList.add(bom);
				}
			}
			String[] header = {"Bom编码","Bom描述"};
			String[] column = {"S1partnumber","S1partdescelements"};
			ExportExcelWrapper wrapper = new ExportExcelWrapper();
			wrapper.exportExcel("Bom编码","Bom编码" ,header ,column ,dataList ,response ,"2007" );
		}catch (Exception e){
			logger.error("bom编码导出失败", e);
		}
	}

	@RequestMapping(value = "/importBomCode", produces = "text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult importBomCode(@RequestParam("file") MultipartFile file){
		try {
			String fileName = file.getOriginalFilename();
			if(fileName.indexOf("\\")>-1){
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			}
			AbstractExcelReader excelReader = new AbstractExcelReader(file.getInputStream(), fileName);
			List<Map<String,Object>> list = new ArrayList<>();
			while (excelReader.hasNextRow()){
				Row row = excelReader.nextRow();
				String bomCode = excelReader.readCellValue(row.getCell(0));
				Boolean hasBomCode = bomService.hasBomCode(bomCode);
				if(!hasBomCode) throw new FlowableException("第 "+(row.getRowNum()+1)+"行数据有误，Bom编码："+bomCode+" 不存在，请核对数据！");
				String bomDesc = excelReader.readCellValue(row.getCell(1));
				list.add(new HashMap<String,Object>(){
					{
						put("bomCode", bomCode);
						put("bomDesc", bomDesc);
					}
				});
			}
			return ResponseResult.success(list);
		}catch (FlowableException e){
			return ResponseResult.fail(e.getMessage());
		}catch (Exception e){
			logger.error("bom编码导入失败", e);
			return ResponseResult.fail("bom编码导入失败");
		}
	}

    @RequestMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request, Model model){
        String fileApplyDept = request.getParameter("fileApplyDept");
        String timestamp = request.getParameter("timestamp");
	    try {
            if(file.isEmpty()){
                //return ResponseResult.fail("文件不能为空");
            }
            String fileApplyCode = request.getParameter("fileApplyCode");

            String fileName = file.getOriginalFilename();
            if(fileName.indexOf("\\")>-1){
                fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
            }

            ProductCodeExcelReader reader = new ProductCodeExcelReader(file.getInputStream(),fileName);
            List<ProductCodeApply> list = reader.parseExcel();
            ProductCodeProcessExt processExt = new ProductCodeProcessExt();
            processExt.setApplyCount(list.size()+"");
            processExt.setApplyType("1");
            processExt.setApplys(list);
            processExt.setApplyDept(fileApplyDept);
            checkSubForm(processExt);
            model.addAttribute("applyType", processExt.getApplyType());
            model.addAttribute("applyCount", processExt.getApplyCount());
            model.addAttribute("currentNode", "editable");
            model.addAttribute("entity", processExt);
            model.addAttribute("timestamp", timestamp);
            model.addAttribute("isImport", "true");
			model.addAttribute("clearBasisMaterial", "false");
            return "flowable/productCodeApply/subAdd";
        }catch (Exception e){
            logger.error("文件导入失败", e);
            ProductCodeProcessExt processExt = new ProductCodeProcessExt();
            List<ProductCodeApply> list = new ArrayList<>();
            list.add(new ProductCodeApply());
            processExt.setApplys(list);
            processExt.setApplyCount(list.size()+"");
            processExt.setApplyType("1");
            processExt.setApplys(list);
            processExt.setApplyDept(fileApplyDept);
            model.addAttribute("applyType", processExt.getApplyType());
            model.addAttribute("applyCount", processExt.getApplyCount());
            model.addAttribute("currentNode", "editable");
            model.addAttribute("entity", processExt);
            model.addAttribute("timestamp", timestamp);
            model.addAttribute("isImport", "true");
			model.addAttribute("clearBasisMaterial", "false");
            return "flowable/productCodeApply/subAdd";
        }
    }


	/**
     * 生成流程图
     *
     * @param processId 任务ID
     */
    @RequestMapping("/processDiagram")
    public void genProcessDiagram(HttpServletResponse httpServletResponse, String processId) throws Exception {
        ProcessInstance pi = runtimeService.createProcessInstanceQuery().processInstanceId(processId).singleResult();
 
        //流程走完的不显示图
        if (pi == null) {
            return;
        }
        Task task = taskService.createTaskQuery().processInstanceId(pi.getId()).singleResult();
        //使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
        String InstanceId = task.getProcessInstanceId();
        List<Execution> executions = runtimeService
                .createExecutionQuery()
                .processInstanceId(InstanceId)
                .list();
 
        //得到正在执行的Activity的Id
        List<String> activityIds = new ArrayList<>();
        List<String> flows = new ArrayList<>();
        for (Execution exe : executions) {
            List<String> ids = runtimeService.getActiveActivityIds(exe.getId());
            activityIds.addAll(ids);
        }
 
        //获取流程图
        BpmnModel bpmnModel = repositoryService.getBpmnModel(pi.getProcessDefinitionId());
        ProcessEngineConfiguration engconf = processEngine.getProcessEngineConfiguration();
        ProcessDiagramGenerator diagramGenerator = engconf.getProcessDiagramGenerator();
        InputStream in = diagramGenerator.generateDiagram(bpmnModel, "png", activityIds, flows, engconf.getActivityFontName(), engconf.getLabelFontName(), engconf.getAnnotationFontName(), engconf.getClassLoader(), 1.0);
        OutputStream out = null;
        byte[] buf = new byte[1024];
        int legth = 0;
        try {
            out = httpServletResponse.getOutputStream();
            while ((legth = in.read(buf)) != -1) {
                out.write(buf, 0, legth);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    } 

}
