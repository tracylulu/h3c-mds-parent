package com.h3c.mds.flowable.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.image.ProcessDiagramGenerator;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.flowable.entity.ExcelProjectCodeModel;
import com.h3c.mds.flowable.entity.ProjectCodeApplyExt;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;
import com.h3c.mds.flowable.entity.ProjectCodeRecommend;
import com.h3c.mds.flowable.entity.ProjectProductRel;
import com.h3c.mds.flowable.exception.ProjectCodeDraftException;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.FinanceProjectCodeService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProjectCodeApplyService;
import com.h3c.mds.flowable.service.ProjectCodeProcessService;
import com.h3c.mds.flowable.service.ProjectCodeRecommendService;
import com.h3c.mds.flowable.service.ProjectCodeService;
import com.h3c.mds.flowable.service.ProjectProductRelService;
import com.h3c.mds.flowable.service.ProjectService;
import com.h3c.mds.flowable.service.WebFlowService;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.flowable.util.FlowableProjectCodeCache;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.ReleaseView;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.ReleaseViewService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.NumberUtil;
import com.h3c.mds.utils.ResponseMessageConst;
import com.h3c.mds.utils.TimeUtil;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.EasyExcelUtil;



@Controller
@RequestMapping(value = "projectWebFlow")
public class ProjectWebFlowController {

	@Autowired
	private WebFlowService webFlowService;
	
	@Autowired
	private ProcessEngine processEngine;
	
	@Autowired
	private HttpServletResponse httpServletResponse;
	
	@Autowired
	private ProjectCodeService projectCodeService;
	
	@Autowired
	private ProjectProductRelService  projectProductRelService;
	
	@Autowired
	private ProjectCodeApplyService projectCodeApplyService;
	
	@Autowired
	private ProjectCodeProcessService projectCodeProcessService;
	
	
	@Autowired
	private ProjectService  projectService;
	@Autowired
	private DicService dicService;
	
	@Autowired
	private ReleaseViewService releaseViewService;
	
	@Autowired
	private IBDS_ReleaseService ibdsReleaseService;
	
	@Autowired
    private FinanceProjectCodeService financeProjectCodeService;
	
	@Autowired
	private ProjectCodeRecommendService projectCodeRecommendService;
	
	@Autowired
	private ProcessLogService processLogService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/importProjectCode", produces="text/html;charset=utf-8")
	@ResponseBody
	@SuppressWarnings("unchecked")
	public ResponseResult importProjectCode(@RequestParam("file") MultipartFile file, String applyNo, String applyDept){
//		 InputStream inputStream;
		try {
//			inputStream = new FileInputStream("E:\\新增项目编码申请模板V1.1.xlsx");
			List<ExcelProjectCodeModel> objectList = EasyExcelUtil.readExcelWithModel(file.getInputStream(), ExcelProjectCodeModel.class, ExcelTypeEnum.XLSX);
			projectCodeService.valicateProjectCodeExcel(objectList);
			Map<String, Object> cacheMap = projectCodeService.checkProjectCodeExcel(objectList);
			
			if(cacheMap.get("error") == null){
				Map<String, IBDS_Release> releaseMap = (Map<String, IBDS_Release>) cacheMap.get("release");
				Map<String, IBDS_Bversion> bversionMap = (Map<String, IBDS_Bversion>) cacheMap.get("bversion");
				ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.changeProjectCodeToProjectCodeProcessExt(objectList,releaseMap, bversionMap);
				projectCodeProcessExt.setApplyNo(applyNo);
				projectCodeProcessExt.setDept(applyDept);
				projectCodeProcessExt.setOptType(FlowableConst.PROJECTCODE_OPTTYPE_ADD);
//				ProjectCodeProcessExt projectCodeProcessExt = this.projectCodeService.getCurProjectCodeProcessExtByApplyNo(appplyNo);
				return ResponseResult.success(projectCodeProcessExt);
			}else{
				return ResponseResult.fail(cacheMap.get("error"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseResult.fail(e.getMessage());
		}
         //读入文件，每一行对应一个 Model，获取 Model 列表
//		ProjectCodeProcessExt projectCodeProcessExt = this.projectCodeService.getCurProjectCodeProcessExtByApplyNo(appplyNo);
		
	}
	
	
	@RequestMapping("/toRecommendProjectCode")
	public String toRecommendProjectCode(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "flowable/projectcode/recommendProjectCodeList";
	}
	
	@RequestMapping("/toAddRecommendProjectCode")
	public String toAddRecommendProjectCode(Model model, Integer id){
		ProjectCodeRecommend projectCodeRecommend = projectCodeRecommendService.getProjectCodeRecommendById(id);
		model.addAttribute("timestamp", System.currentTimeMillis());
		model.addAttribute("id", id);
		model.addAttribute("entity", projectCodeRecommend);
		return "flowable/projectcode/addRecommendProjectCode";
	}
	
	@RequestMapping("updateRecommendProjectCode")
	@ResponseBody
	public ResponseResult updateRecommendProjectCode(ProjectCodeRecommend projectCodeRecommend){
		
		try {
			projectCodeRecommendService.updateProjectCodeRecommend(projectCodeRecommend);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.success("保存失败");
		}
		
		return ResponseResult.success("保存成功");
	}
	
	
	@RequestMapping("/listRecommendProjectCode")
    @ResponseBody
    public Map<String,Object> listRecommendProjectCode(Integer page, Integer rows, String searchStr){
        try {
            PageInfo<ProjectCodeRecommend> pageInfo = projectCodeRecommendService.listRecommendProjectCode(page,rows,searchStr);
            Map<String,Object> map = new HashMap<>();
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return map;
        }catch (Exception e){
           
            return null;
        }
    }
	
	
	@RequestMapping("/treeRecommendProjectCode")
    @ResponseBody
    public String treeRecommendProjectCode(String id, String searchStr){
		Map<String, Object> param = new HashMap<String, Object>();
		
		if(StringUtils.isNotBlank(searchStr)){
			param.put("searchParams", searchStr);
		}
		
        try {
        	if(StringUtils.isNotBlank(id)){
        		param.put("prodlineno", id);
        		param.put("id", id);
        		return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeRecommendService.treeRecommendProjectCode(param));
        	}else{
        		return EasyUIJSONUtils.list2EasyUiTreeGrid_close(projectCodeRecommendService.treeRecommendProjectCode(param));
        	}
        }catch (Exception e){
           
           return null;
        }
    }
	
	//获取推荐的项目编码
	@RequestMapping("/getRecommendProjectCode")
	@ResponseBody
	public Map<String,Object> getRecommendProjectCode(String proInsId){
		try {
			//通过processInsId获取所有的项目编码
			List<ProjectCodeRecommend> resList = new ArrayList<ProjectCodeRecommend>();
			ProjectCodeProcessExt process = projectCodeService.getCurProjectCodeProcessExtByProcessId(proInsId);
			for(ProjectCodeApplyExt projectCodeApplyExt : process.getApplys()){
				String pdtNo = projectCodeApplyExt.getPdtNo();
				ProjectCodeRecommend tmpProjectCodeRecommend = 
						projectCodeRecommendService.getProjectCodeRecommendByPdtNo(pdtNo);
				if(tmpProjectCodeRecommend != null){
					if(StringUtils.isNotBlank(projectCodeApplyExt.getBversion())){
						tmpProjectCodeRecommend.setProName(projectCodeApplyExt.getProName() + projectCodeApplyExt.getBversion());						
					}else{
						tmpProjectCodeRecommend.setProName(projectCodeApplyExt.getProName());
					}
					tmpProjectCodeRecommend.setPdtName(projectCodeApplyExt.getPdtName());
					tmpProjectCodeRecommend.setPdtNo(projectCodeApplyExt.getPdtNo());
					tmpProjectCodeRecommend.setProlineName(projectCodeApplyExt.getProProdlineName());
					if(StringUtils.isNotBlank(projectCodeApplyExt.getProNumber())){
						tmpProjectCodeRecommend.setProNumber(projectCodeApplyExt.getProNumber());	
					}
					resList.add(tmpProjectCodeRecommend);					
				}else{
					ProjectCodeRecommend projectCodeRecommend = new  ProjectCodeRecommend();
					projectCodeRecommend.setProName(projectCodeApplyExt.getProName() + projectCodeApplyExt.getBversion());
					projectCodeRecommend.setPdtName(projectCodeApplyExt.getPdtName());
					projectCodeRecommend.setPdtNo(projectCodeApplyExt.getPdtNo());
					projectCodeRecommend.setProlineName(projectCodeApplyExt.getProProdlineName());
//					projectCodeRecommend.setProNumber();
					resList.add(projectCodeRecommend);
				}
			}
			//查询推荐表推荐处相关的项目编码
			Map<String,Object> map = new HashMap<>();
			map.put("rows", resList);
			map.put("total", resList.size());
			return map;
		}catch (Exception e){
			return null;
		}
	}
	
	
	
	@RequestMapping("/getDicItem")
	@ResponseBody
	public List<IBDS_Dic> getDicItem(String type){
		Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", type);
		List<IBDS_Dic> deptList = dicService.getDic(param);
		return deptList;
	}
	
	
	
	
	@RequestMapping("/toProjectCode")
	public String toProjectCode(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "flowable/projectcode/list";
	}
	
	@RequestMapping("/toAddProjectCode")
	public String toAddProjectCode(Model model,String applyDep,String applyType,Integer applyCount){
		

		ProjectCodeProcessExt processExt = new ProjectCodeProcessExt();
		String maxCode = projectCodeProcessService.getMaxCode();

		processExt.setApplyNo(maxCode);
        processExt.setCurDeal(UserUtil.getUserId());
        processExt.setCurStatus("提交申请");
		model.addAttribute("timestamp", System.currentTimeMillis());
		model.addAttribute("applyDep", applyDep);
		model.addAttribute("applyType", applyType);
		model.addAttribute("applyCount", applyCount);
		model.addAttribute("entity", processExt);
    	model.addAttribute("curHandler",FlowableConst.PROJECT_CODE_APPLY); 
		return "flowable/projectcode/add";
	}
	
	
	@RequestMapping("/subForm/{type}")
    public String subForm(@PathVariable String type,Model model,ProjectCodeProcessExt processExt,Long timestamp, String processExtJson){
		
//		ProjectCodeProcessExt aa = JSONArray.parseObject(processExtJson, ProjectCodeProcessExt.class);
//		ProjectCodeProcessExt a = (ProjectCodeProcessExt) net.sf.json.JSONObject.toBean(net.sf.json.JSONObject.fromObject(processExtJson));
		String resUrl = "flowable/projectcode/subAdd";
		if(StringUtils.isNoneBlank(processExtJson)){
			try {
				ProjectCodeProcessExt  processExtImport = build(processExtJson);
				model.addAttribute("timestamp", timestamp);
		        model.addAttribute("optType", processExtImport.getOptType());
				model.addAttribute("entity", processExtImport);
				model.addAttribute("applyCount", processExtImport.getApplyCount());
				return resUrl;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        ProjectCodeProcessExt projectCodeProcessExt = this.projectCodeService.getCurProjectCodeProcessExtByApplyNo(processExt.getApplyNo());
        //如果已经有流程id了，说明已经启动流程了,这里说明要回显
        
        
        
        if(type.equals(processExt.getOptType())){
        	if(StringUtils.isNoneBlank(processExt.getProcessInsId())){
            	resUrl = handelSubmitProcess(type, model,processExt, processExt.getProcessInsId(), timestamp);   	
            }else if(projectCodeProcessExt != null){//草稿
            	resUrl = handelDraftProcess(model,processExt, timestamp, UserUtil.getUserId());
            }else{//调到新增，修改，删除页面
            	
            	resUrl = handelNotSubmitProcess(type, model, processExt, timestamp);
            }
        }else{
        	resUrl = handelChangeTypeProcess(type, model, processExt, timestamp);
        }
//        if(processExt != null){
//        	model.addAttribute("logs", processLogService.getByProcessCode(processExt.getApplyNo()));        	
//        }
        
        return resUrl;
    }
	
	@SuppressWarnings("rawtypes")
	public ProjectCodeProcessExt  build(String processExtJson) throws Exception{
		ProjectCodeProcessExt ext = new ProjectCodeProcessExt();
		if(StringUtils.isNoneBlank(processExtJson)){
			
			JSONObject obj = JSONObject.parseObject(processExtJson);
//			ext = this.projectCodeService.getCurProjectCodeProcessExtByApplyNo(obj.getString("applyNo"));
			BeanUtils.copyProperties(ext, obj);
//			List<ProjectCodeApplyExt>  applys = (List<ProjectCodeApplyExt>) obj.get("applys");
			List jsonApplys = JSONArray.parseObject(obj.get("applys").toString(), List.class);
			List<ProjectCodeApplyExt> applys = new ArrayList<ProjectCodeApplyExt>();
			ext.setApplys(applys);
			if(CollectionUtils.isNotEmpty(jsonApplys)){
				for(Object projectCode : jsonApplys){
					ProjectCodeApplyExt tmpProjectCodeApplyExt = new ProjectCodeApplyExt();
					applys.add(tmpProjectCodeApplyExt);
					BeanUtils.copyProperties(tmpProjectCodeApplyExt, projectCode);
					JSONObject jsonObj = JSONObject.parseObject(projectCode.toString());
					Date proTimeDate = new Date((Long) jsonObj.get("proTime"));
					tmpProjectCodeApplyExt.setProTimeStr(TimeUtil.getStringTime1(proTimeDate));
					List<ProjectProductRel> projectProductRelList = new ArrayList<ProjectProductRel>();
					List rels = JSONArray.parseObject(JSONObject.parseObject(projectCode.toString()).get("projectProductRelList").toString(), List.class);
					if(CollectionUtils.isNotEmpty(rels)){
						for(Object rel : rels){
							ProjectProductRel tmpProjectProductRel = new ProjectProductRel();
							BeanUtils.copyProperties(tmpProjectProductRel, rel);
							projectProductRelList.add(tmpProjectProductRel);
						}
					}
				}
			}
		}
		
//		JSONObject processExt = (JSONObject) JSONObject.wrap(processExtJson);
		 //return (ProjectCodeProcessExt) JSON.parseObject(processExtJson, new TypeReference<List<ProjectCodeProcessExt>>(){});
		return ext;
	}
	//处理数据回显问题
	private void handleHisData(ProjectCodeProcessExt processExt){
		if(processExt.getApplys() == null){
            processExt.setApplys(new ArrayList<ProjectCodeApplyExt>());
        }
        if(processExt.getApplys().size()<processExt.getApplyCount()){
            for(int i=0;i<processExt.getApplyCount()-processExt.getApplys().size();i++){
                processExt.getApplys().add(new ProjectCodeApplyExt());
            }
        }else if(processExt.getApplys().size()>processExt.getApplyCount()){
            for(int i=processExt.getApplys().size()-1;i>processExt.getApplyCount()-1;i-- ){
                processExt.getApplys().remove(i);
            }
        }
	}
	
	
	
	
	private String handelChangeTypeProcess(String type,Model model,ProjectCodeProcessExt processExt,Long timestamp){
		String resUrl = "flowable/projectcode/subAdd";
//		handleHisData(processExt);
    	model.addAttribute("timestamp", timestamp);
        model.addAttribute("optType", processExt.getOptType());
        model.addAttribute("applyCount", processExt.getApplyCount());
        
        model.addAttribute("entity", new ProjectCodeProcessExt());
        
    	model.addAttribute("isSubmit","show");
    	if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(processExt.getOptType())){
    		//新增
    		resUrl = "flowable/projectcode/subAdd";
    	}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(processExt.getOptType())){
    		//修改
    		resUrl =  "flowable/projectcode/subEdit";
    	}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(processExt.getOptType())){
    		resUrl =  "flowable/projectcode/subDel";
    	}
    	
    	return resUrl;
	}
	private String handelNotSubmitProcess(String type,Model model,ProjectCodeProcessExt processExt,Long timestamp){
		String resUrl = "flowable/projectcode/subAdd";
		handleHisData(processExt);
    	model.addAttribute("timestamp", timestamp);
        model.addAttribute("optType", processExt.getOptType());
        model.addAttribute("applyCount", processExt.getApplyCount());
        
        model.addAttribute("entity", processExt);
        
    	model.addAttribute("isSubmit","show");
    	if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(processExt.getOptType())){
    		//新增
    		resUrl = "flowable/projectcode/subAdd";
    	}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(processExt.getOptType())){
    		//修改
    		resUrl =  "flowable/projectcode/subEdit";
    	}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(processExt.getOptType())){
    		resUrl =  "flowable/projectcode/subDel";
    	}
    	
    	return resUrl;
	}
	
	
	private String handelSubmitProcess(String type, Model model, ProjectCodeProcessExt formProcessExt, String processInsId, Long timestamp){
		String resUrl = "flowable/projectcode/subAdd";
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(processInsId);
		if(formProcessExt != null && formProcessExt.getApplys() != null){
			handleHisData(formProcessExt);
			model.addAttribute("entity", formProcessExt);
			model.addAttribute("applyCount", formProcessExt.getApplyCount());
		}else{
			//handleHisData(projectCodeProcessExt);
			model.addAttribute("entity", projectCodeProcessExt);
			model.addAttribute("applyCount", projectCodeProcessExt.getApplyCount());
		}
		
		
    	Task task = projectCodeService.getCurTaskByProInsId(processInsId, UserUtil.getUserId());
    	if(task != null){
    		model.addAttribute("taskId",task.getId());
    		//管理员可以转单
//            model.addAttribute("isAdmin", UserUtil.checkIsAdmin());
    	}
    	String handler = projectCodeService.getCurrentHandler(processInsId, UserUtil.getUserId());
    	
    	model.addAttribute("processInsId", processInsId);
    	
    	model.addAttribute("timestamp", timestamp);
    	model.addAttribute("curHandler",handler);
    	
    	
    	
    	if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
    		if(FlowableConst.PROJECT_CODE_APPLY.equals(handler)){
    			resUrl = "flowable/projectcode/subAdd";        			
    		}else{
    			resUrl = "flowable/projectcode/subAddEdit";
    		}
    	}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
    		
    		if(FlowableConst.PROJECT_CODE_APPLY.equals(handler)){
    			resUrl =  "flowable/projectcode/subEdit";        			
    		}else{
    			resUrl =  "flowable/projectcode/subEditEdit";
    		}
    	}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
    		if(FlowableConst.PROJECT_CODE_APPLY.equals(handler)){
    			resUrl = "flowable/projectcode/subDel";        			
    		}else{
    			resUrl = "flowable/projectcode/subDelEdit";
    		}
    	}
    	return resUrl;
	}
	
	
	private String handelDraftProcess(Model model, ProjectCodeProcessExt formProcessExt, Long timestamp, String userId){
		String resUrl = "flowable/projectcode/subAdd";
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByApplyNo(formProcessExt.getApplyNo());
		if(formProcessExt != null && formProcessExt.getApplys() != null){
			handleHisData(formProcessExt);
			model.addAttribute("entity", formProcessExt);
			model.addAttribute("applyCount", formProcessExt.getApplyCount());
		}else{
			//handleHisData(projectCodeProcessExt);
			model.addAttribute("entity", projectCodeProcessExt);
			model.addAttribute("applyCount", projectCodeProcessExt.getApplyCount());
		}

    	
    	model.addAttribute("timestamp", timestamp);
    	
    	
    	if(StringUtil.isNotEmpty(userId) && StringUtil.isNotEmpty(projectCodeProcessExt.getApplyer()) 
    			&& userId.equalsIgnoreCase(projectCodeProcessExt.getApplyer())){
    		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(formProcessExt.getOptType())){
        		resUrl = "flowable/projectcode/subAdd";        			
        	}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(formProcessExt.getOptType())){
        		resUrl =  "flowable/projectcode/subEdit";        			
        	}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(formProcessExt.getOptType())){
        		resUrl = "flowable/projectcode/subDel";        			
        	}
    	}else{
    		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
        		resUrl = "flowable/projectcode/subAddEdit";        			
        	}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(projectCodeProcessExt.getOptType())){
        		resUrl =  "flowable/projectcode/subEditEdit";        			
        	}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
        		resUrl = "flowable/projectcode/subDelEdit";        			
        	}
    	}
    	
    	return resUrl;
	}
	
	@RequestMapping(value="/save" , produces="text/html;charset=utf-8")
	@ResponseBody
	public ResponseResult save(ProjectCodeProcessExt projectCodeProcessExt){
		
		//简单判空，申请的时候还要判断
		projectCodeProcessExt.setApplyer(UserUtil.getUserId());
//		Map<String, String> resMap = checkNullForProjectProcessExt(projectCodeProcessExt);
//		
//		if(resMap != null && StringUtils.isNotBlank(resMap.get("res"))){
//			return ResponseResult.fail(resMap.get("res"));
//		}
		
		try {
			checkDriftFormData(projectCodeProcessExt);
			this.projectCodeService.saveDraftFormData(projectCodeProcessExt, UserUtil.getUserId());
		}catch(ProjectCodeDraftException e){
			return ResponseResult.fail(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.fail(ResponseMessageConst.PROJECT_CODE_SAVE_ERROR);
		}
		
		return ResponseResult.success(ResponseMessageConst.PROJECT_CODE_SAVE_OK);
	}
	
	private void checkDriftFormData(ProjectCodeProcessExt projectCodeProcessExt){
		//草稿状态不让上传附件，安全需要
		if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
			List<ProjectCodeApplyExt> projectCodeApplyExtList = projectCodeProcessExt.getApplys();
			for(int i = 0; i < projectCodeApplyExtList.size(); i++){
				if(StringUtils.isNotBlank(projectCodeApplyExtList.get(i).getBasisMaterial())
					|| StringUtils.isNotBlank(projectCodeApplyExtList.get(i).getBasisMaterialId())){
					throw new ProjectCodeDraftException("草稿状态不让上传附件");
				}
			}
		}
	}
	
	private Map<String, String> checkNullForProjectProcessExt(ProjectCodeProcessExt projectCodeProcessExt){
		Map<String, String> resMap = new HashMap<String, String>();
		
		if(projectCodeProcessExt != null){
			
			
			if(CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
				List<ProjectCodeApplyExt> projectCodeExtList = projectCodeProcessExt.getApplys();
				for(ProjectCodeApplyExt projectCodeApplyExt : projectCodeExtList){
					//项目编码前台已经做过判断了，现在直接判断产品编码关联情况
					if(CollectionUtils.isNotEmpty(projectCodeApplyExt.getProjectProductRelList())){
						List<ProjectProductRel> relList = projectCodeApplyExt.getProjectProductRelList();
						//删除不用判断产品编码
						if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
							return resMap;
						}
						
						for(ProjectProductRel rel : relList){
							if(StringUtils.isBlank(rel.getProductCode())){
								resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_CODE_IS_EMPTY);
								return resMap;
							}
							
						}
						
					}else{
						resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_IS_EMPTY);
						return resMap;
					}
				}
			}else{
				resMap.put("res", "没有项目编码");
				return resMap;
			}
		}else{
			resMap.put("res", "表单数据为空");
			return resMap;
		}
		
		return resMap;
	}
	
	
	
	@RequestMapping("/edit")
	public String edit(Model model,String applyNo){
        ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByApplyNo(applyNo);
        if(projectCodeProcessExt != null){
        	model.addAttribute("applyCount", projectCodeProcessExt.getApplyCount());
        	model.addAttribute("processInsId", projectCodeProcessExt.getProcessInsId());
        	model.addAttribute("entity", projectCodeProcessExt);
        	String handler = projectCodeService.getCurrentHandler(projectCodeProcessExt.getProcessInsId(), UserUtil.getUserId());
        	
        	if(StringUtils.isEmpty(handler) 
        			&& StringUtils.isEmpty(projectCodeProcessExt.getProcessInsId())
        			&& UserUtil.getUserId().equalsIgnoreCase(projectCodeProcessExt.getCurDeal())){
        		model.addAttribute("curHandler", FlowableConst.PROJECT_CODE_APPLY);  
        	}else{
        		model.addAttribute("curHandler",handler);        		
        	}
        	
        	Task task = projectCodeService.getCurTaskByProInsId(projectCodeProcessExt.getProcessInsId(), UserUtil.getUserId());
        	if(task != null){
        		model.addAttribute("taskId",task.getId());
        		model.addAttribute("curDeal", task.getAssignee());			
        	}
        	Task curTask = projectCodeService.getCurTaskByProInsId(projectCodeProcessExt.getProcessInsId());
        	if(curTask != null){
        		model.addAttribute("isAdmin",UserUtil.checkIsAdmin() && StringUtils.isNoneBlank(curTask.getAssignee()) 
        				&& !FlowableConst.ERP_HANDLER.equals(curTask.getAssignee()) && !"usertask1".equals(curTask.getTaskDefinitionKey()));        		
        	}
        	//是否显示废弃，只有草稿和返回修改的流程能废弃，并且只有管理员和提交申请的人能看
        	if(FlowableConst.PROJECT_CODE_IS_EDIT_TRUE.equals(projectCodeProcessExt.getIsEdit())){
        		if(UserUtil.getUserId().equals(projectCodeProcessExt.getApplyer()) || UserUtil.checkIsAdmin()){
        			model.addAttribute("isShowDel",true);
        		}
        	}
        	model.addAttribute("logs", processLogService.getByProcessCode(projectCodeProcessExt.getApplyNo()));
        }
        model.addAttribute("timestamp", System.currentTimeMillis());
		model.addAttribute("pageType", "edit");
		model.addAttribute("curStatus", "当前状态");
		return "flowable/projectcode/add";
	}
	
	
	/**
	 * 草稿，未提交申请
	 * @return
	 */
	@RequestMapping(value = "/beforeAddProjectCode")
	@ResponseBody
	public String beforeAddProjectCode(List<ProjectCodeApplyExt> projectCodeApplyExtList){
		
		//遍历所有项目编码，数据状态为提交草稿状态
		if(projectCodeApplyExtList != null){
			for(int i = 0; i < projectCodeApplyExtList.size(); i++){
				this.projectCodeService.addProjectCodeExt(projectCodeApplyExtList.get(i));				
			}
		}
		return "";
	}
	
	
	
	/**
	 * 提交申请
	 * @return
	 */
	
	@RequestMapping(value = "/addProjectCode", produces="text/html;charset=utf-8")
	@ResponseBody
	public String addProjectCode(ProjectCodeProcessExt projectCodeProcessExt, String proInsId){
		
		//规则校验
		String resStr = validateForm(projectCodeProcessExt, proInsId);
		
		if(StringUtil.isNotEmpty(resStr)){
			return resStr;
		}
		Map<String, String> handlerMap = projectCodeService.checkHandler(projectCodeProcessExt, projectCodeProcessExt.getDept());
		if(handlerMap != null && StringUtil.isNotEmpty(handlerMap.get("res"))){
			return handlerMap.get("res");
		}
		
		String ztRes = ZTProjectcode(projectCodeProcessExt);
		if(StringUtils.isNotBlank(ztRes)){
			return ztRes;
		};
		
		
		
		
		
		projectCodeProcessExt.setApplyer(UserUtil.getUserId());
//		projectCodeProcessExt.setApplyNo(proInsId);
		String projMng = projectCodeProcessExt.getApplys().get(0).getProManager();
		projectCodeProcessExt.setProjMng(projMng.split("\\s+")[0].substring(0, 1) + projMng.split("\\s+")[1]);
		String res = "";
		try{
			res = projectCodeService.addProjectCodeTrans(projectCodeProcessExt, proInsId, UserUtil.getUserId());
		}catch(Exception e){
			e.printStackTrace();
			res = "提交失败";
		}finally{
			FlowableCache.removeAll();
			FlowableProjectCodeCache.removeAll();
		}
		
		return res;
	}
	
	
	//判断在途
	private String ZTProjectcode(ProjectCodeProcessExt projectCodeProcessExt){
			//删除和更新的在途在这里判断
				if(!FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
					Map<String, String> resMap = projectCodeService.isProjectCodeEditForUpdateAndDel(projectCodeProcessExt);
					if(resMap != null && resMap.get("projectCodeProNumber") != null){
						String res = "";
						res =  ResponseMessageConst.PROJECT_CODE_PROJECT_NUMBER.replaceAll("projectNumver", resMap.get("projectCodeProNumber"));
						res = res.replaceAll("applyno", resMap.get("applyno"));
						return res;
					}
				}
				
				//判断关联的R版本或者B版本是否在途
				if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
					Map<String, String> resMap = projectCodeService.isReleaseOrBversionEditForAdd(projectCodeProcessExt);
					if(resMap != null && resMap.get("res") != null){
						return  resMap.get("res");
					}
				}
				
				//如果是新增，项目名称存在就不让加
				if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
					String name = projectCodeService.isProjectCodeNameExist(projectCodeProcessExt);
					if(StringUtils.isNotBlank(name)){
						return  ResponseMessageConst.PROJECT_CODE_PROJECT_NAME_EXIST_IN_FINANCE.replaceAll("projectName", name);
					}
				}
				
				
				return null;
	}
	
	private String validateForm(ProjectCodeProcessExt projectCodeProcessExt, String proInsId){

		// TODO 
		//各种判断规则  
		
		Map<String, String> sameProjectMap = checkSameProjectForUpdateAndDel(projectCodeProcessExt);
		
		if(sameProjectMap != null && StringUtils.isNoneBlank(sameProjectMap.get(("res")))){
			return sameProjectMap.get("res");
		}
		
		//费用分摊运营商比重
		
		Map<String, String> proBiZhongMap = checkBiZhongAndFBiZhong(projectCodeProcessExt);
		if(proBiZhongMap != null && StringUtils.isNoneBlank(proBiZhongMap.get(("res")))){
			return proBiZhongMap.get("res");
		}
		
		
		//如果是产品项目，则B版本必填
		Map<String, String>  productProjectCodeMap =  isProductProjectCodeType(projectCodeProcessExt);
		if(productProjectCodeMap != null && StringUtils.isNoneBlank(productProjectCodeMap.get(("res")))){
			return productProjectCodeMap.get(("res"));
		}
		//判断产品编码是否为空
		Map<String, String> productCodeResMap = hasProductCodes(projectCodeProcessExt, proInsId);
		
		if(productCodeResMap != null && StringUtils.isNoneBlank(productCodeResMap.get("res"))){
			return productCodeResMap.get("res");
		}
		
		//分摊项目比例是否合法
		Map<String, String> rateMap = checkProductCodeRate(projectCodeProcessExt, proInsId);
		if(rateMap != null &&  StringUtils.isNotBlank(rateMap.get("res"))){
			return rateMap.get("res");
		}
		//是否有关联产品
		
		//判断申请编号重复提交
//		if(projectCodeService.isSameApplyNo(projectCodeProcessExt)){
//			return ResponseMessageConst.PROJECT_CODE_APPLYNO_EXISTS;
//		}
		
		//判读分摊费用比例是不是100
		if(!FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			if(projectCodeService.handleProjectRate(projectCodeProcessExt) != null){
				Map<String, String> resMap = projectCodeService.handleProjectRate(projectCodeProcessExt);
				if(resMap != null && resMap.size() > 0){
					return resMap.get("rate");				
				}
			}			
		}
		
		Map<String, String> proMngMap = hasProjectMng(projectCodeProcessExt);
		if(proMngMap != null && StringUtils.isNotBlank(proMngMap.get("res"))){
			return proMngMap.get("res");
		}
		
		//判断是否是同一个项目经理
		if(!projectCodeService.isSameProjMng(projectCodeProcessExt)){
			return ResponseMessageConst.PROJECT_CODE_SAME_PROJMNG;
		}
		
		//是否是同一个pdt
		Map<String, String> pdtMap = projectCodeService.isSamePdt(projectCodeProcessExt);
		if( pdtMap!= null 
				&& StringUtils.isNotBlank((String)pdtMap.get("res"))){
			return pdtMap.get("res");
		}
		
		
		//判断新增的项目名称是否一样
		if(projectCodeService.isSameProjName(projectCodeProcessExt)){
			return ResponseMessageConst.PROJECT_CODE_SAME_PROJNAME;
		}
		
		//判断R或者B版本是否唯一
		if(projectCodeService.isSameBversionOrReleaseNo(projectCodeProcessExt)){
			return ResponseMessageConst.PROJECT_CODE_SAME_CODE;
		}
		return null;
	}
	
	//一个流程是否选择了多个项目编码
	private Map<String, String>  checkSameProjectForUpdateAndDel(ProjectCodeProcessExt projectCodeProcessExt){
		Map<String, String> resMap = new HashMap<String, String>();
		if(projectCodeProcessExt != null && FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			return resMap;
		}
		Map<String, List<ProjectCodeApplyExt>> projectCodeMap = new HashMap<String, List<ProjectCodeApplyExt>>();
		if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
			List<ProjectCodeApplyExt> projectCodeList = projectCodeProcessExt.getApplys();
			for(int i = 0; i < projectCodeList.size(); i++){
				if(projectCodeMap.containsKey(projectCodeList.get(i).getProNumber())){
					projectCodeMap.get(projectCodeList.get(i).getProNumber()).add(projectCodeList.get(i));
				}else{
					List<ProjectCodeApplyExt> tmpProjectCodeApplyExtList = new ArrayList<ProjectCodeApplyExt>(5);
					tmpProjectCodeApplyExtList.add(projectCodeList.get(i));
					projectCodeMap.put(projectCodeList.get(i).getProNumber(), tmpProjectCodeApplyExtList);
					
				}
			}
			
			for(Entry<String, List<ProjectCodeApplyExt>> entry : projectCodeMap.entrySet()){
				if(entry.getValue().size() > 1){
					resMap.put("res", ResponseMessageConst.PROJECT_CODE_MUL_PROJECTCODE);
					return resMap;
				}
			}
			
			
		}
			
		
		return resMap;
	}
	
	
	
	//判断费用分摊运营商比重
	private Map<String, String> checkBiZhongAndFBiZhong(ProjectCodeProcessExt projectCodeProcessExt){
		Map<String, String> res = new HashMap<String, String>();
		//删除不用判断这个
		if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			return res;
		}
		if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
			List<ProjectCodeApplyExt> projectCodeList = projectCodeProcessExt.getApplys();
			for(ProjectCodeApplyExt projectCode : projectCodeList){
				if(checkBiZhong(projectCode) != null && StringUtils.isNotBlank(checkBiZhong(projectCode).get("res"))){
					return checkBiZhong(projectCode);
				}
				
				if(checkFBiZhong(projectCode) != null && StringUtils.isNotBlank(checkFBiZhong(projectCode).get("res"))){
					return checkFBiZhong(projectCode);
				}
				if(0 != new BigDecimal(Double.parseDouble(projectCode.getProbizhong()) + Double.parseDouble(projectCode.getProfbizhong())).compareTo(
						new BigDecimal(100))){
					res.put("res", ResponseMessageConst.PROJECT_CODE_BIZHONG_NOT_100);
				}
			}
		}
		return res;
	}
	
	//费用分摊运营商比重
	private Map<String, String> checkBiZhong(ProjectCodeApplyExt projectCode){

		Map<String, String> res = new HashMap<String, String>();
		if(StringUtils.isNotBlank(projectCode.getProbizhong())){
			if(!NumberUtil.isNumeric(projectCode.getProbizhong())){
				res.put("res", ResponseMessageConst.PROJECT_CODE_BIZHONG_NOT_NUMBER);
				return res;
				
			}else{
				try {
					Double.parseDouble(projectCode.getProbizhong());
				} catch (NumberFormatException e) {
					e.printStackTrace();
					res.put("res", ResponseMessageConst.PROJECT_CODE_OVER_INTMAX);
				}
			}
		}else{
			res.put("res", ResponseMessageConst.PROJECT_CODE_BIZHONG_IS_EMPTY);
			return res;
		}
	return res;
	}
	//费用分摊非运营商比重
	private Map<String, String> checkFBiZhong(ProjectCodeApplyExt projectCode){

		Map<String, String> res = new HashMap<String, String>();
		if(StringUtils.isNotBlank(projectCode.getProfbizhong())){
			if(!NumberUtil.isNumeric(projectCode.getProfbizhong())){
				res.put("res", ResponseMessageConst.PROJECT_CODE_FBIZHONG_NOT_NUMBER);
				return res;
			}else{
				
				try {
					Double.parseDouble(projectCode.getProfbizhong());
				} catch (NumberFormatException e) {
					res.put("res", ResponseMessageConst.PROJECT_CODE_OVER_INTMAX);				
				}
				
			}
		}else{
			res.put("res", ResponseMessageConst.PROJECT_CODE_FBIZHONG_IS_EMPTY);
			return res;
		}
	return res;
	}
	private Map<String, String> hasProjectMng(ProjectCodeProcessExt projectCodeProcessExt){
		Map<String, String> resMap = new HashMap<String, String>();
			if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
				List<ProjectCodeApplyExt>  projectCodeList = projectCodeProcessExt.getApplys();
				for(int i = 0; i < projectCodeList.size(); i++){
					if(StringUtils.isBlank(projectCodeList.get(i).getProManager())){
						resMap.put("res", ResponseMessageConst.PROJECT_CODE_PROJMNG);
					}
				}
			}
			return resMap;
	}
	
	//如果是产品项目，则B版本必填
	private Map<String, String> isProductProjectCodeType(ProjectCodeProcessExt projectCodeProcessExt){
		
		Map<String, String> resMap = new HashMap<String, String>();
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(projectCodeProcessExt.getOptType())){
			if(projectCodeProcessExt != null && CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
				List<ProjectCodeApplyExt>  projectCodeList = projectCodeProcessExt.getApplys();
				for(int i = 0; i < projectCodeList.size(); i++){
					if(FlowableConst.PROJECTCODE_TYPE_PRODUCT.equals(projectCodeList.get(i).getProCa())){
						if(StringUtils.isBlank(projectCodeList.get(i).getBversion()) 
								|| StringUtils.isBlank(projectCodeList.get(i).getBversionNo())){
							resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_PROJECT_BVERSION_NOT_EMPTY);
							return resMap;
						}
					}
				}
			}
		}
		return resMap;
	}
	
	
	
	private Map<String, String> checkProductCodeRate(ProjectCodeProcessExt projectCodeProcessExt, String proInsId){
		Map<String, String> resMap = new HashMap<String, String>();
		
		
		if(projectCodeProcessExt != null){
			if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
				return resMap;
			}
			if(CollectionUtils.isNotEmpty(projectCodeProcessExt.getApplys())){
				List<ProjectCodeApplyExt> projectCodeList = projectCodeProcessExt.getApplys();
				if(CollectionUtils.isNotEmpty(projectCodeList)){
					
					for(int i = 0; i < projectCodeList.size(); i++){
						List<ProjectProductRel> productList = projectCodeList.get(i).getProjectProductRelList();
						if(CollectionUtils.isNotEmpty(productList)){
							for(int j = 0; j < productList.size(); j++){
								if(StringUtils.isNotBlank(productList.get(j).getRate())){
									if(!NumberUtil.isNumeric(productList.get(j).getRate())){
										resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_RATE_NOT_NUMBER);
										return resMap;
									}
									
								}else{
									resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_RATE);
									return resMap;
								}
							}
						}else{
							resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_IS_EMPTY);
							return resMap;
						}
					}
					
				}else{
					resMap.put("res", "表单没有项目编码数据");
					return resMap;
				}
			}
		}else{
			resMap.put("res", "表单没有数据");
			return resMap;
		}
		return resMap;
	}
	
	
	
	//是否有关联的产品编码
	private Map<String, String> hasProductCodes(ProjectCodeProcessExt projectCodeProcessExt, String proInsId){
		
		Map<String, String> resMap = new HashMap<String, String>();
		if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(projectCodeProcessExt.getOptType())){
			return resMap;
		}
		
		if(projectCodeProcessExt != null && !projectCodeProcessExt.getOptType().equals(FlowableConst.PROJECTCODE_OPTTYPE_DEL)){
			List<ProjectCodeApplyExt>  projectCodeList = projectCodeProcessExt.getApplys();
			if(CollectionUtils.isNotEmpty(projectCodeList)){
				for(int i = 0; i < projectCodeList.size(); i++){
					List<ProjectProductRel> productList = projectCodeList.get(i).getProjectProductRelList();
					
					if(CollectionUtils.isNotEmpty(productList)){
						for(int j = 0; j < productList.size(); j++){
							if(StringUtils.isBlank(productList.get(j).getProductCode())){
								resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_CODE_IS_EMPTY);
								return resMap;
							}
						}
					}else{
						resMap.put("res", ResponseMessageConst.PROJECT_CODE_PRODUCT_IS_EMPTY);
						return resMap;
					}
					
				}
			}else{
				resMap.put("res","表单数据为空");
				return resMap;
			}
		}
		return resMap;
	}
	
	
	
	
	
	
	//审核者审批 
	
	@RequestMapping(value = "/approveApply")
	@ResponseBody
	public String approveApply(String proInsId, String status, String taskId, String suggest, String projectCodeData){
		String res = "";
		try{
			res = projectCodeService.approveApplyTrans(proInsId, status, taskId, suggest, projectCodeData, UserUtil.getUserId());
		}catch(Exception e){
			e.printStackTrace();
			res = "审核失败";
		}finally{
			FlowableCache.removeAll();
			FlowableProjectCodeCache.removeAll();
		}
		return res;
	}
	
	
	
	
	
	//项目经理审批
	@RequestMapping(value = "/projectMngApply")
	@ResponseBody
	public String projectMngApply(String proInsId, String status, String taskId, String suggest){
		String res = "";
		try{
			res = projectCodeService.projectMngApplyTrans(proInsId, status, taskId, suggest, UserUtil.getUserId());
		}catch(Exception e){
			e.printStackTrace();
			res = "审核失败";
		}finally{
			FlowableCache.removeAll();
			FlowableProjectCodeCache.removeAll();
		}
		return res;
	}
	
	//财务接口人审批
	@RequestMapping(value = "/financeInterfaceApply")
	@ResponseBody
	public String financeInterfaceApply(String proInsId, String status, String taskId, String suggest){
		String res = "";
		try{
			res = projectCodeService.financeInterfaceApplyTrans(proInsId, status, taskId, suggest, UserUtil.getUserId());
		}catch(Exception e){
			e.printStackTrace();
			res = "审核失败";
		}finally{
			FlowableCache.removeAll();
			FlowableProjectCodeCache.removeAll();
		}
		return res;
	}
	
	//财务审批
	@RequestMapping(value = "/financerApply")
	@ResponseBody
	public String financerApply(String proInsId, String status, String taskId, String suggest){
		String res = "";
		try{
			res = projectCodeService.financerApplyTrans(proInsId, status, taskId, suggest, UserUtil.getUserId());
		}catch(Exception e){
			e.printStackTrace();
			res = "审核失败";
		}finally{
			FlowableCache.removeAll();
			FlowableProjectCodeCache.removeAll();
		}
		return res;
	}
	//项目管理处审批
	@RequestMapping(value = "/projectOfficeApply")
	@ResponseBody
	public String projectOfficeApply(String proInsId, String status, String taskId, String suggest){
		String res = "";
		 try {
			projectCodeService.projectOfficeApplyTrans(proInsId, status, taskId, suggest, UserUtil.getUserId());
			res = FlowableConst.EXE_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			res = "审核失败";
		}finally{
			FlowableCache.removeAll();
			FlowableProjectCodeCache.removeAll();
		}
		 return res;
	}
	
	//修改研发基本信息
	@RequestMapping(value = "/updateProductInfo")
	@ResponseBody
	public String updateProductInfo(String proInsId, String taskId){
		
		// TODO 新增，修改，删除，是不是B版本走不同业务
//		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(proInsId);
		projectCodeService.handleFinanceAndProject(proInsId);
	
		return "ok";
	}
	
	//修改研发基本信息
	@RequestMapping(value = "/updateHIsFinaInfo")
	@ResponseBody
	public String updateHIsFinaInfo(String proInsId){
		
		// TODO 新增，修改，删除，是不是B版本走不同业务
		ProjectCodeProcessExt projectCodeProcessExt = projectCodeService.getCurProjectCodeProcessExtByProcessId(proInsId);
		projectCodeService.handleHisFinance(projectCodeProcessExt);
	
		return "ok";
	}
	/**
	 * 获取审批管理列表
	 */
	@RequestMapping(value = "/list")
	@ResponseBody
	public List<Map<String,String>> list(String userId) {
		List<Map<String,String>> list = new ArrayList<>();
		//根据用户ID查询流程
		List<Task> tasks = webFlowService.listTaskByAssingee(userId);
		for (Task task : tasks) {
			Map<String,String> map = new HashMap<>(); 
			map.put("process id",task.getProcessInstanceId());
			map.put("assignee",task.getAssignee());
			map.put("id",task.getId());
			map.put("name",task.getName());
			list.add(map);
		}
		System.out.println(list);
		return list;
	}
	
	/**
	 * 批准
	 *
	 * @param taskId
	 *            任务ID
	 */
	@RequestMapping(value = "/userApply")
	@ResponseBody
	public String apply(String taskId) {
		Task task = webFlowService.getTaskService().createTaskQuery().taskId(taskId).singleResult();
		
		if (task == null) {
			throw new RuntimeException("流程不存在");
		}
		
		
		// 通过审核
		HashMap<String, Object> map = new HashMap<>();
		map.put("outcome", "通过");
		//添加项目经理执行人
		List<String> projectMngs = new ArrayList<String>();
		projectMngs.add("项目经理1");
		projectMngs.add("项目经理2");
		map.put("projectMngs", projectMngs);
		//添加产品经理执行人
		List<String> productMngs = new ArrayList<String>();
		productMngs.add("产品经理1");
		productMngs.add("产品经理经理2");
		map.put("productMngs", productMngs);
		//taskService.setAssignee(taskId, "aa");
		webFlowService.apply(taskId, map);
//		taskService.complete(taskId, map);
		return "processed ok!";
	}
	
	
	
	//申请单号查询页面
	@RequestMapping("/toProjectCodeByApplyNo")
	public String toProjectCodeByApplyNo(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "flowable/projectcode/listByApplyNo";
	}
	
	
	//通过申请单号查询
	@RequestMapping("/findProjectCodeByApplyNo")
	@ResponseBody
	public Map<String,Object> findProjectCodeByApplyNo(Integer page, Integer rows, String searchParams){
		PageInfo pageInfo = projectCodeProcessService.findProjectCodeByApplyNo(page, rows, searchParams);
		Map<String,Object> map = new HashMap<>();
        map.put("rows", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return map;
	}
	
	
	
	//通过申请人查询
	@RequestMapping("/toProjectCodeByApplyer")
	public String toProjectCodeByApplyer(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "flowable/projectcode/listByApplyer";
	}
	//通过申请人查询
	
	@RequestMapping("/findProjectCodeByApplyer")
	@ResponseBody
	public String findProjectCodeByApplyer(String id, String searchParams){
		Map<String, Object> param = new HashMap<String, Object>();
		if(StringUtils.isNoneBlank(searchParams)){
			param.put("searchParams", searchParams);
		}
		param.put("id", id);
		if(StringUtils.isBlank(id)){
			return EasyUIJSONUtils.list2EasyUiTreeGrid_close(projectCodeProcessService.findProjectCodeByApplyer(param));
		}else{
			if(id.contains("_")){//点击申请编号
				String val = id.substring(id.lastIndexOf("_") + 1);
				param.put("applyno", val);
				return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByApplyer(param));
			}else{//点击申请人
				param.put("applyer", id);
				return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByApplyer(param));
			}
		}
	}
	
	//通过当前状态查询
	@RequestMapping("/toProjectCodeByStatus")
	public String toProjectCodeByStatus(Model model){
		model.addAttribute("timestamp", System.currentTimeMillis());
		return "flowable/projectcode/listByStatus";
	}
		//通过当前状态查询
	
		@RequestMapping("/findProjectCodeByStatus")
		@ResponseBody
		public String findProjectCodeByStatus(String id, String searchParams){
			Map<String, Object> param = new HashMap<String, Object>();
			if(StringUtils.isNoneBlank(searchParams)){
				param.put("searchParams", searchParams);
			}
			param.put("id", id);
			
			if(StringUtils.isBlank(id)){
				return EasyUIJSONUtils.list2EasyUiTreeGrid_close(projectCodeProcessService.findProjectCodeByStatus(param));
			}else{
				if(id.contains("_")){//点击申请编号
					String val = id.substring(id.lastIndexOf("_") + 1);
					param.put("applyno", val);
					return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByStatus(param));
				}else{//点击申请人
					param.put("curStatus", id);
					return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByStatus(param));
				}
			}
		}
		
		//通过未关闭流程查询
		@RequestMapping("/toProjectCodeByProcess")
		public String toProjectCodeByProcess(Model model){
			model.addAttribute("timestamp", System.currentTimeMillis());
			return "flowable/projectcode/listByProcess";
		}
		//通过未关闭流程查询
		
			@RequestMapping("/findProjectCodeByProcess")
			@ResponseBody
			public String findProjectCodeByProcess(String id, String searchParams){
				Map<String, Object> param = new HashMap<String, Object>();
				
				if(StringUtils.isNoneBlank(searchParams)){
					param.put("searchParams", searchParams);
				}
				param.put("id", id);
				if(StringUtils.isBlank(id)){
					return EasyUIJSONUtils.list2EasyUiTreeGrid_close(projectCodeProcessService.findProjectCodeByProcess(param));
				}else{
					if(id.contains("_")){//点击申请编号
						String val = id.substring(id.lastIndexOf("_") + 1);
						param.put("applyno", val);
						return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByProcess(param));
					}else{//点击申请人
						param.put("curStatus", id);
						return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByProcess(param));
					}
				}
			}
	
			//按当前责任人
			@RequestMapping("/toProjectCodeByCurHandler")
			public String toProjectCodeByCurHandler(Model model){
				model.addAttribute("timestamp", System.currentTimeMillis());
				return "flowable/projectcode/listByCurHandler";
			}
			
			//按当前责任人
			@RequestMapping("/findProjectCodeByCurHandler")
			@ResponseBody
			public String findProjectCodeByCurHandler(String id, String searchParams){
				Map<String, Object> param = new HashMap<String, Object>();
				if(StringUtils.isNoneBlank(searchParams)){
					param.put("searchParams", searchParams);
				}
				
				param.put("id", id);
				if(StringUtils.isBlank(id)){
					return EasyUIJSONUtils.list2EasyUiTreeGrid_close(projectCodeProcessService.findProjectCodeByCurHandler(param));
				}else{
					if(id.contains("_")){//点击申请编号
						String val = id.substring(id.lastIndexOf("_") + 1);
						param.put("applyno", val);
						return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByCurHandler(param));
					}else{//点击申请人
						param.put("curDeal", id);
						return EasyUIJSONUtils.list2EasyUiTreeGrid_open(projectCodeProcessService.findProjectCodeByCurHandler(param));
					}
				}
			}
	
	/**
	 * 生成流程图
	 *
	 * @param processId
	 *            任务ID
	 */
	@RequestMapping(value = "/processDiagram")
	@ResponseBody
	public void genProcessDiagram(String processId) throws Exception {
		ProcessInstance pi = webFlowService.getRuntimeService().createProcessInstanceQuery().processInstanceId(processId).singleResult();
		
		// 流程走完的不显示图
		if (pi == null) {
			return;
		}
		// 使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
		List<Execution> executions = webFlowService.getRuntimeService().createExecutionQuery().processInstanceId(processId).list();

		// 得到正在执行的Activity的Id
		List<String> activityIds = new ArrayList<>();
		List<String> flows = new ArrayList<>();
		for (Execution exe : executions) {
			List<String> ids = webFlowService.getRuntimeService().getActiveActivityIds(exe.getId());
			activityIds.addAll(ids);
		}
		
		// 获取流程图
		BpmnModel bpmnModel = webFlowService.getRepositoryService().getBpmnModel(pi.getProcessDefinitionId());
		ProcessEngineConfiguration engconf = processEngine.getProcessEngineConfiguration();
		ProcessDiagramGenerator diagramGenerator = engconf.getProcessDiagramGenerator();
		InputStream in = diagramGenerator.generateDiagram(bpmnModel, "png", activityIds, flows,
				engconf.getActivityFontName(), engconf.getLabelFontName(), engconf.getAnnotationFontName(),
				engconf.getClassLoader(), 1.0);
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
			List<String> list= new ArrayList<String>();
			if(projectStatus != null && projectStatus.length > 0){
				list=Arrays.asList(projectStatus);
			}
			if(list.contains("无")) {
				searchMap.put("projectStatusNull", "all");
			}
			searchMap.put("projectStatus", projectStatus);
			
			searchMap = setReleaseSearchParam(type, searchMap, id);

			// 根据不同参数查询R版本树
			List<ReleaseView> lstRd = releaseViewService.getTreeDataForFlowable(searchMap);
			/*
			 * 树节点顶级展示不一致时，PT需要更改 返回json格式的数据 树节点打开状态list2EasyUiTreeGrid_open
			 * 关闭状态list2EasyUiTreeGrid_close
			 */
			return type != null && type.equals("PT") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(lstRd)
					: EasyUIJSONUtils.list2EasyUiTreeGrid_close(lstRd);
	}
	
		/**
		 * 设置R版本查询条件
		 * @param type  产品类型
		 * @param searchMap 查询条件
		 * @param id 产品编码
		 * @return
		 */
		public Map<String,Object> setReleaseSearchParam(String type,Map<String,Object> searchMap,String id){
			//重新设置id的值
				if(StringUtils.isNotEmpty(id)&& id.indexOf("_")!=-1) {
					searchMap.put("id", StringUtil.isNotEmpty(id)&& id.indexOf("_")!=-1?id.split("_")[0]:id);
				}
				
				if(type!=null && type.equals("PL")) {
					searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id)&&id.indexOf("_")!=-1?id.split("_")[1]:"");
					searchMap.put("PRODLINENo", "");
					
				}else if(type!=null &&type.equals("PT")) {
					searchMap.put("PLIPMTNo", StringUtil.isNotEmpty(id)&&id.indexOf("_")!=-1?id.split("_")[2]:"");
					searchMap.put("PRODLINENo", StringUtil.isNotEmpty(id)&&id.indexOf("_")!=-1?id.split("_")[1]:"");
					
				}else {
					searchMap.put("PLIPMTNo", "");
					searchMap.put("PRODLINENo", "");			
				}
			
				return searchMap;
			
		}
	
		@RequestMapping(value = "/changeHandler",method = RequestMethod.POST)
		@ResponseBody
		public ResponseResult changeHandler(String id,String taskId,String userId){
			String operator = userService.getNameDescByAccount(UserUtil.getUserId());
			String from = "";
			String to = userService.getNameDescByAccount(userId);
			
			ProjectCodeProcessExt projectCodeProcessExt = this.projectCodeService.getCurProjectCodeProcessExtByProcessId(id);
			if(projectCodeProcessExt != null){
				projectCodeProcessExt.setAssignSign(UserUtil.getUserId());
				projectCodeProcessExt.setAssignDate(new Date());
				this.projectCodeService.updateProjectCodeProcess(projectCodeProcessExt);
				try {
					if(StringUtils.isNoneBlank(taskId)){
						projectCodeService.changeHandler(id,taskId,userId.split("\\s+")[0].substring(0,1) + userId.split("\\s+")[1]);
						from = userService.getNameDescByAccount(UserUtil.getUserId());
					}else{
						Task task = this.processEngine.getTaskService().createTaskQuery().processInstanceId(id).singleResult();
						from = userService.getNameDescByAccount(task.getAssignee());
						projectCodeService.changeHandler(id,task.getId(),userId.split("\\s+")[0].substring(0,1) + userId.split("\\s+")[1]);	
					}
					//过程记录
					processLogService.createLog(new Date(), null, operator,
							null,
							null , 
							operator + "把" + from + "转为" + to, 
							projectCodeProcessExt.getApplyNo());
					return ResponseResult.success("指派成功");
				} catch (Exception e){
					return ResponseResult.fail("指派失败");
				}
			}else{
				return ResponseResult.fail("没有此流程");
			}
		}
		
		@RequestMapping("deleteByApplyNo")
		@ResponseBody
		public ResponseResult deleteByApplyNo(String applyNo){
			try {
				this.projectCodeService.deleteByApplyNo(applyNo);
				return ResponseResult.success("删除成功");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ResponseResult.fail("删除失败");
			}
			
		}
}
