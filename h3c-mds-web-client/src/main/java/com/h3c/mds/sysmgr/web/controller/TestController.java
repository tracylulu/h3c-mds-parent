package com.h3c.mds.sysmgr.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h3c.mds.flowable.entity.IbdsTask;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.flowable.entity.PdmPartView;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.ErpProductCodeService;
import com.h3c.mds.flowable.service.ErpProjectCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.service.ProductCodeProcessService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.flowable.strategy.Strategy;
import com.h3c.mds.flowable.strategy.StrategyFactory;
import com.h3c.mds.flowable.task.ProjectCodeCoaTaskHandlerImpl;
import com.h3c.mds.flowable.task.TaskContext;
import com.h3c.mds.flowable.task.TaskHandler;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.redis.RedisUtil;

@Controller
@RequestMapping("/")
public class TestController {

    @Value("${simpleLogin}")
    private String simpleLogin;
	
	@Autowired
	private UserService userService;

	@Autowired
	private RedisUtil redisUtil;
//	@Autowired
//	private ErpService erpService;
	
	@Autowired
	private IbdsTaskService taskService; 
	
	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	@Autowired
	private PartCodeProcessService partCodeProcessService;
	@Autowired
	private ErpProductCodeService erpProductCodeService;
	
	@Autowired
	private ErpProjectCodeService erpProjectCodeService;
	
//	@Autowired
//	private TaskHandler taskHandler;
	
	@Autowired
	private IbdsTaskService ibdsTaskService;
	@Autowired
	private EipService eipService;
	@RequestMapping("/")
	public String test(){
		return "home";
	}
	
	@ResponseBody
	@RequestMapping("/api/a/b")
	public String testApi(String applyNo){
	System.out.println("Im ok");
	return "ok";
	}
	
	
	@RequestMapping("testTask")
	@ResponseBody
	public void testTask(String taskId){
		IbdsTask task = ibdsTaskService.getTaskById(Integer.valueOf(taskId));
		
//		projectCodeCoaTaskHandlerImpl.handle(ibdsTask)
		TaskContext context = new TaskContext(task);
		context.excute(task);
	}
	
	@RequestMapping("testSyncPdm")
	@ResponseBody
	public String testSyncPdm(){
		Strategy pdmStrategy = StrategyFactory.createStrategyImpl(FlowableConst.GETDATAFROM_FROM_PDM);
		List<PdmPartView> pdmList = pdmStrategy.getSourceData(null);
		List<PartProcessAndPartCodeWrapper> wrapperList = pdmStrategy.transferPOJO(pdmList);
		pdmStrategy.saveData(wrapperList);
		return "ok";
	}
	
	@RequestMapping("testNotSyncPdm")
	@ResponseBody
	public String testNotSyncPdm(String str){
		try {
			partCodeProcessService.syncOldPdmData(str);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "ok";
	}
	
	
	@RequestMapping("/testSyncProjectCode2Erp")
	@ResponseBody
	public String testSyncProjectCode2Erp(String applyNo, String optType){
		boolean res = erpProjectCodeService.syncProjectCode2Erp(applyNo, optType);
		if(res){
			return "ok";
		}else{
			return "error";
		}
	}

	@RequestMapping("testSyncEditProjectCode2Erp")
	public String testSyncEditProjectCode2Erp(String applyNo, String optType){
		erpProjectCodeService.syncEditProjectCode2Erp(applyNo);
		return "ok";
	}
	
	
	@RequestMapping("testsyncAddProductCode2ErpCoa")
	@ResponseBody
	public String testsyncAddProductCode2ErpCoa(String applyNo){
		boolean flag = erpProductCodeService.syncAddProductCode2ErpCoa(applyNo);
		return "ok" + flag;
	}
	
	@ResponseBody
	@RequestMapping("testsyncBomAndBusiness2Inventory")
	public String testsyncBomAndBusiness2Inventory(String applyNo){
	boolean	flag = erpProductCodeService.syncBomAndBusiness2Inventory(applyNo);
	return "ok";
	}
	@ResponseBody
	@RequestMapping("testSyncProductCode2ErpCoa")
	public void testSyncProductCode2ErpCoa(String applyNo, String optType){
		erpProductCodeService.SyncProductCode2ErpCoa(applyNo, optType);
		System.out.println("ok");
	}
	@ResponseBody
	@RequestMapping("/sendPostToEip")
	public String sendPostToEip(){
//		IbdsEip eip = EipUtil.buildProjectCodeEip("OBC1710236_" + System.currentTimeMillis(), "l20095", "lstest", "经理审批", "OBC1710235", "localhost:8080", "l20095", "李晟");
//		
//		eipService.sendAsyncMsgToIflow(eip, "l20095");
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping("/testSyncProductCode2Inventory")
	public String syncProductCode2Inventory(String applyNo, String optType){
		erpProductCodeService.syncProductCode2Inventory(applyNo, optType);
		return "ok";
	}
	
	@RequestMapping("/testSyncProductCodeAndBom2Inventory")
	@ResponseBody
	public String testSyncProductCodeAndBom2Inventory(String applyNo, String optType){
		erpProductCodeService.syncProductCodeAndBom2Inventory(applyNo, optType);
		return "ok";
	}
	@RequestMapping("/testSyncPartCodeApplyProductCodeAndBom2Inventory")
	@ResponseBody
	public String testSyncPartCodeApplyProductCodeAndBom2Inventory(String applyNo){
		erpProductCodeService.syncPartCodeApplyProductCodeAndBom2Inventory(applyNo);
		return "";
	}
	
	@RequestMapping("/sendProjectCodeEmail")
	@ResponseBody
	public String sendProjectCodeEmail(String applyNo){
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByApplyNo(applyNo);
		projectCodeService.sendSyncDataEmail(null, projectCodeProcessExt, "项目编码申请，项目编码向ERP临时表同步数据出现问题，请联系管理员" , "项目编码申请，项目编码向ERP临时表同步数据出现问题，请联系管理员", "111");
		return "ok";
	}
	
	@RequestMapping("/sendProductCodeEmail")
	@ResponseBody
	public String sendProductCodeEmail(String applyNo){
		ProductCodeProcess productCodeProcess = productCodeProcessService.getProductCodeProcessByApplyCode(applyNo);
		productCodeProcessService.sendSyncDataEmail(null, productCodeProcess, "ERP coa 处理出现异常", "ERP coa 处理出现异常", "222");
		return "ok";
	}
	
	@RequestMapping("/sendPartCodeEmail")
	@ResponseBody
	public String sendPartCodeEmail(String applyNo){
		PartCodeProcess partCodeProcess = partCodeProcessService.getByApplyNo(applyNo);
		partCodeProcessService.sendSyncDataEmail(null, partCodeProcess, "新增part编码ERP处理异常,请联系管理员", "", "222");
		return "ok";
	}
	
	@RequestMapping("/addTask")
	@ResponseBody
	public Object addTask(String applyNo){
		IbdsTask task = new IbdsTask();
		
		task.setType(FlowableConst.TASK_TYPE_PROJECTCODE_COA);
		task.setVal("OBC1908173~1");
		task.setTaskId(applyNo);
		task.setErpApplyNo(taskService.getNewErpImportNoByApplyNo(applyNo));
		task.setActTaskId("lstest");
		return taskService.addTask(task);
	}
	
	@RequestMapping("testRedis")
	public void testRedis(){
		try {
			this.redisUtil.set("lstest", "1");
			long a = this.redisUtil.incr("aa", 1);
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	@RequestMapping("/addErp")
//	@ResponseBody
//	public Object addErp(){
//		ProjectCodeApply projectCodeApply = new ProjectCodeApply();
//		ErpCoaEntity erpCoaEntity = ErpEntityUtils.changeProjectCodeToErpCoaEntity(projectCodeApply, "1");
//		System.out.println("lstest");
//		return erpService.insertHw3cFndFlexValuesInf(erpCoaEntity);
//	}
//	
//	@RequestMapping("/batchAddErp")
//	@ResponseBody
//	public Object batchAddErp(){
//		ProjectCodeApply projectCodeApply = new ProjectCodeApply();
//		ErpCoaEntity erpCoaEntity = ErpEntityUtils.changeProjectCodeToErpCoaEntity(projectCodeApply, "1");
//		ErpCoaEntity erpCoaEntity2 = ErpEntityUtils.changeProjectCodeToErpCoaEntity(projectCodeApply, "1");
//		List<ErpCoaEntity> list = new ArrayList<ErpCoaEntity>();
//		list.add(erpCoaEntity);
//		list.add(erpCoaEntity2);
//		System.out.println("lstest");
//		return erpService.batchInsertHw3cFndFlexValuesInf(list);
//	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public Object findAll(){
		List<User> findAll = userService.findAll();
		return findAll;
	}
	
	@RequestMapping("/test")
	public String test(Model model){
		System.out.println("kaishikaishi");
		model.addAttribute("testStr", "测试jsp成功");
		return "test";
	}
	
	@RequestMapping("/sso")
	public String sso(Model model){
		
		return "sso";
	}

	@RequestMapping("/test1")
	public String test1(HttpServletRequest request){
		
		request.setAttribute("testStr", "测试jsp成功");
		Subject subject = SecurityUtils.getSubject();
		Object attribute = subject.getSession().getAttribute("roles");
		Object attribute2 = subject.getSession().getAttribute("resources");
		boolean b = subject.hasRole("测试");
		System.out.println(b);
		return "test";
	}

	@RequestMapping("/login")
	public String login(){
	    if("open".equals(simpleLogin)){
            return "login";
        }
        return "redirect:/";
	}

	@RequestMapping("/test/login")
	public String testLogin(String username, HttpServletRequest request,Model model){
	    try {
	        if(!"open".equals(simpleLogin)) throw new RuntimeException("非法请求");
            if(StringUtils.isBlank(username)) throw new RuntimeException("用户名不能为空");
			username = username.trim();
            User user = userService.getUserByAccount(username);
            if(user == null) throw new RuntimeException("系统中没有该用户，请输入存在的用户名");
            Subject subject = SecurityUtils.getSubject();
            request.getSession(false).setAttribute("UserIdentity", username);
            UsernamePasswordToken token = new UsernamePasswordToken(username, "");
            subject.login(token);
			List<ADMP_MemberGroup> group = userService.getGroupByAccount(username);
			subject.getSession().setAttribute("current_user", user);
			subject.getSession().setAttribute("current_group", group);
			subject.getSession().setAttribute("current_user_desc", userService.getNameDescByAccount(username));
            userService.refreshMenue(username);
            return "redirect:/";
        }catch (RuntimeException e){
            model.addAttribute("message", e.getMessage());
            return "login";
        }catch (Exception e){
	        model.addAttribute("message", "登录失败");
            return "login";
        }

	}

	@RequestMapping("/testUeidtor")
	public String testUeidtor(){
		return "ueditor/UeditorTest";
	}

	@RequestMapping("/ueditor/toController")
	public String toController(){
		return "ueditor/controller";
	}
}
