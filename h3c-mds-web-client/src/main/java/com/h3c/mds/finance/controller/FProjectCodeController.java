package com.h3c.mds.finance.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.finance.entity.FProjectCodeViewAll;
import com.h3c.mds.finance.finaceconst.FinanceConst;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FProjectCodeService;
import com.h3c.mds.finance.service.FlowableFProjectCodeService;
import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.NumberUtil;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;

@Controller
@RequestMapping("/finance/fprojectCode")
public class FProjectCodeController {

    private static final Logger logger = LoggerFactory.getLogger(FProjectCodeController.class);
    
    @Value("${export.maxCount}")
    private String maxCount;
    
    @Autowired
    private FlowableFProjectCodeService flowableFProjectCodeService;

    @Autowired
    private FProjectCodeService fProjectCodeService;
    
    @Autowired
    private FProductCodeService fProductCodeService;
    //添加项目编码
    @RequestMapping("/toAddProjectCode")
    public String toAddProjectCode(Model model, String isEdit, String fProjno, String productCode){
//    	isEdit  true为新增   false为修改
    	model.addAttribute("id_suffix", System.currentTimeMillis());
    	model.addAttribute("isEdit", isEdit);
    	if(StringUtils.isNotBlank(fProjno)){
    		model.addAttribute("projCode", fProjno);
    		model.addAttribute("productCode", productCode);
    	}
    	return "finance/fproj/add";
    }
    
    @RequestMapping("/getFProjectCodeByCode")
    @ResponseBody
    public Map<String, Object> getFProjectCodeByCode(String fProjno, String productCode){
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("fProjno", fProjno);
    	param.put("fProductCode", productCode);
    	return fProjectCodeService.getFProjectCodeByProjCodeAndProductCode(param);
    }
    
    //添加项目编码
    @RequestMapping(value="addProjectCode", produces="text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult addProjectCode(FProjectCodeView fProjectCodeView){
    	
    	List<FProductCode> productList = fProductCodeService.getByProductCode(fProjectCodeView.getfProductCode());
    	if(CollectionUtils.isEmpty(productList)){
    		return ResponseResult.fail("不存在此产品编码");
    	}
    	FProjectCode fProjectCode = fProjectCodeService.getFProjectCodeByProjCode(fProjectCodeView.getfProjno());
    	if(fProjectCode != null){
    		return ResponseResult.fail("项目编码已经存在");
    	}
    	
    	fProjectCodeService.addProjectCodeAndProductCode(fProjectCodeView);
    	return ResponseResult.success("添加成功");
    }
    
   //编辑项目编码
    @RequestMapping(value="editProjectCode", produces="text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult editProjectCode(FProjectCodeView fProjectCodeView){
    	
    	List<FProductCode> productList = fProductCodeService.getByProductCode(fProjectCodeView.getfProductCode());
    	if(CollectionUtils.isEmpty(productList)){
    		return ResponseResult.fail("不存在此产品编码");
    	}
    	FProjectCode fProjectCode = new FProjectCode();
    	Map<String, String> resMap = new HashMap<String, String>();
    	try {
			BeanUtils.copyProperties(fProjectCode, fProjectCodeView);
			resMap = checkNumber(fProjectCode);
			clearFprojectCode(fProjectCode);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
    	if(resMap != null && StringUtils.isNotBlank(resMap.get("res"))){
    		return ResponseResult.success(resMap.get("res"));
    	}
    	fProjectCodeService.editProjectCode(fProjectCode);
    	return ResponseResult.success("添加成功");
    }
    
    public Map<String, String> checkNumber(FProjectCode fProjectCode){
    	Map<String, String> resMap = new HashMap<String, String>();
    	if(StringUtils.isNotBlank(fProjectCode.getfBizhong())){
    		if(!NumberUtil.isNumeric(fProjectCode.getfBizhong())){
    			resMap.put("res", "运营商比重不是数字");
    		}
		}
		if(StringUtils.isNotBlank(fProjectCode.getfFbizhong())){
			if(!NumberUtil.isNumeric(fProjectCode.getfFbizhong())){
    			resMap.put("res", "非运营商比重不是数字");
    		}
		}
		if(StringUtils.isNotBlank(fProjectCode.getfOldFbizhong())){
			if(!NumberUtil.isNumeric(fProjectCode.getfOldFbizhong())){
    			resMap.put("res", "原非运营商比重不是数字");
    		}
		}
		if(StringUtils.isNotBlank(fProjectCode.getfOldBizhong())){
			if(!NumberUtil.isNumeric(fProjectCode.getfOldBizhong())){
    			resMap.put("res", "原运营商比重不是数字");
    		}
		}
		return resMap;
    }
    public void clearFprojectCode(FProjectCode fProjectCode){
    	/**
		 * 由于notes传递数据问题，这里要把数字类型为空的字段改为null
		 */
		if(StringUtils.isBlank(fProjectCode.getfBizhong())){
			fProjectCode.setfBizhong(null);
		}
		if(StringUtils.isBlank(fProjectCode.getfFbizhong())){
			fProjectCode.setfFbizhong(null);
		}
		if(StringUtils.isBlank(fProjectCode.getfOldFbizhong())){
			fProjectCode.setfOldFbizhong(null);
		}
		if(StringUtils.isBlank(fProjectCode.getfOldBizhong())){
			fProjectCode.setfOldBizhong(null);
		}
    }
    
    @SuppressWarnings("serial")
	@RequestMapping("/getPropertyByCode")
    @ResponseBody
    public List<Map<String,Object>> getPropertyByCode(String projProdCode){
    	String id = projProdCode.split("_")[0];
    	String productCode = projProdCode.split("_")[1];
    	
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("id", id);
    	param.put("productCode", productCode);
    	Map<String, Object> fProjectCodeMap = fProjectCodeService.getProperties(param);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>(){
            {
            	add(new HashMap<String, Object>(){
                    {
                        put("name","项目编码");
                        put("value", fProjectCodeMap.get("fProjno"));
                    }
                });
            	
            	add(new HashMap<String, Object>(){
                    {
                        put("name","项目名称");
                        put("value", fProjectCodeMap.get("fProjname"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","项目代号");
                        put("value", fProjectCodeMap.get("fProjcode"));
                    }
                });
            	
            	add(new HashMap<String, Object>(){
                    {
                        put("name","项目类别");
                        put("value", fProjectCodeMap.get("fObjcaName"));
                    }
                });
            	
            	add(new HashMap<String, Object>(){
                    {
                        put("name","项目经理");
                        put("value", fProjectCodeMap.get("fProjMng"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","所属产品线");
                        put("value", fProjectCodeMap.get("fProductlineName"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","产品编码");
                        put("value", fProjectCodeMap.get("fProductCode"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","产品编码中文描述");
                        put("value", fProjectCodeMap.get("productNameCn"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","分摊项目比例");
                        put("value", fProjectCodeMap.get("rate"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","对应的版本");
                        put("value", fProjectCodeMap.get("fVersion"));
                    }
                });
            	add(new HashMap<String, Object>(){
                    {
                        put("name","所属PDT");
                        put("value", fProjectCodeMap.get("fPdtName"));
                    }
                });
            	
            	add(new HashMap<String, Object>(){
                    {
                        put("name","对应的评审点");
                        put("value", fProjectCodeMap.get("fAssignPointName"));
                    }
                });
            	
                add(new HashMap<String, Object>(){
                    {
                        put("name","费用分摊运营商比重");
                        put("value", fProjectCodeMap.get("fBizhong"));
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","费用分摊非运营商比重");
                        put("value", fProjectCodeMap.get("fFbizhong"));
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","备注");
                        put("value", fProjectCodeMap.get("remark"));
                    }
                });

            }
        };
    
        return list;
    }
    
    
    
    /**
     * 流程项目调用
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findByPage")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer rows, String searchArgs){
        try {
            PageInfo<Map<String, Object>> pageInfo = flowableFProjectCodeService.findByPage(page, rows, searchArgs);
            Map<String,Object> map = new HashMap<>();
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return map;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
    
    
    /**
     * 流程调用
     * @param projNo
     * @return
     */
    @RequestMapping("/findProductByProjNo")
    @ResponseBody
    public Map<String, Object> findProductByProjNo(String projNo){
        try {
            List<Map<String, Object>> resList = flowableFProjectCodeService.findProductByProjNo(projNo);
            Map<String, Object> resMap = new HashMap<String, Object>();
            resMap.put("total", resList.size());
            resMap.put("rows", resList);
            return resMap;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
    
    @RequestMapping("toListOfProjectCodeAll")
    public String toListOfProjectCodeAll(Model model){
    	model.addAttribute("id_suffix", System.currentTimeMillis());
    	model.addAttribute("isShow", UserUtil.checkIsAdmin());
    	return "finance/fproj/listAll";
    }
    
    
    
    //项目编码列表
    @RequestMapping("/toListOfProjectCode")
    public String toListOfProjectCode(Model model){
    	model.addAttribute("id_suffix", System.currentTimeMillis());
    	model.addAttribute("isShow", UserUtil.checkIsAdmin());
        return "finance/fproj/list";
    }
    
    //按产品线，pdt查询
    @RequestMapping("/toListOfProjectCodeByPdt")
    public String toListOfProjectCodeByPdt(Model model){
    	model.addAttribute("id_suffix", System.currentTimeMillis());
    	model.addAttribute("isShow", UserUtil.checkIsAdmin());
        return "finance/fproj/pdtList";
    }
    
    //按产品线，pdt查询
    @RequestMapping("/listOfProjectCodeByPdt")
    @ResponseBody
    public String listOfProjectCodeByPdt(String id, String searchParams,String prodLine,String pdt,String state,String start,String end){
    	String res = "";
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("searchParams", searchParams);
    	param.put("id", id);
    	param.put("prodLine", prodLine);
		param.put("pdt", pdt);
		if("0".equals(state)){
			state = null;
		}else if(StringUtils.isBlank(state)){
			state = "1";
		}else{
			state = "1";
		}
		param.put("state", state);
		param.put("start", start);
		param.put("end", end);
    	
    	if(StringUtils.isBlank(id)){
    		res = EasyUIJSONUtils.list2EasyUiTreeGrid_close(fProjectCodeService.listOfProjectCodeByPdt(param));
    	}else{
    		
    		if(!id.contains("_")){
//    			String fProductlineno = id.substring(id.lastIndexOf("_")  + 1);
    			param.put("fProductlineno", id);
    			param.put("pltype", ProductConst.PRODLINE_CODE_PREFIX);
    			res = EasyUIJSONUtils.list2EasyUiTreeGrid_close(fProjectCodeService.listOfProjectCodeByPdt(param));
    		}else{
    			String fPdtNo = id.substring(id.lastIndexOf("_")  + 1);
    			String fProductlineno = id.substring(0, id.lastIndexOf("_"));
    			param.put("fProductlineno", fProductlineno);
//    			param.put("fPdtNo", Integer.valueOf(fPdtNo));
    			param.put("fPdtNo", fPdtNo);
    			param.put("pttype", ProductConst.PDT_CODE_PREFIX);
    			res = EasyUIJSONUtils.list2EasyUiTreeGrid_open(fProjectCodeService.listOfProjectCodeByPdt(param));
    			
    		}    		
    		
    	}
    	
        return res;
    }
    
    
    //按产品线，项目类别查询
    @RequestMapping("/toListOfProjectCodeByProjType")
    public String toListOfProjectCodeByProjType(Model model){
    	model.addAttribute("id_suffix", System.currentTimeMillis());
    	model.addAttribute("isShow", UserUtil.checkIsAdmin());
        return "finance/fproj/proTypeList";
    }
    //按产品线，项目类别查询
    @RequestMapping("/listOfProjectCodeByProjType")
    @ResponseBody
    public String listOfProjectCodeByProjType(String id, String searchParams,String prodLine,String pdt,String state,String start,String end){
    	String res = "";
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("searchParams", searchParams);
    	param.put("id", id);
    	param.put("prodLine", prodLine);
		param.put("pdt", pdt);
		if("0".equals(state)){
			state = null;
		}else if(StringUtils.isBlank(state)){
			state = "1";
		}else{
			state = "1";
		}
		param.put("state", state);
		param.put("start", start);
		param.put("end", end);
    	
    	if(StringUtils.isBlank(id)){
    		res = EasyUIJSONUtils.list2EasyUiTreeGrid_close(fProjectCodeService.listOfProjectCodeByProjType(param));
    	}else{
    		
    		if(!id.contains("_")){
//    			String fProductlineno = id.substring(id.lastIndexOf("_")  + 1);
    			param.put("fProductlineno", id);
    			param.put("pltype", ProductConst.PRODLINE_CODE_PREFIX);
    			res = EasyUIJSONUtils.list2EasyUiTreeGrid_close(fProjectCodeService.listOfProjectCodeByProjType(param));
    		}else{
    			String fObjca = id.substring(id.lastIndexOf("_")  + 1);
    			String fProductlineno = id.substring(0, id.lastIndexOf("_"));
    			param.put("fObjca", fObjca);
    			param.put("fProductlineno", fProductlineno);
    			param.put("catype", FinanceConst.PROJECT_CODE_CA);
    			res = EasyUIJSONUtils.list2EasyUiTreeGrid_open(fProjectCodeService.listOfProjectCodeByProjType(param));
    			
    		}    		
    		
    	}
    	
        return res;
    }
    
    //按产品对应项目查询
    @RequestMapping("/toListOfProjectCodeByProd")
    public String toListOfProjectCodeByProd(Model model){
    	model.addAttribute("id_suffix", System.currentTimeMillis());
    	model.addAttribute("isShow", UserUtil.checkIsAdmin());
        return "finance/fproj/prodList";
    }
    
    
    
    //按产品对应项目查询
    @RequestMapping("/listOfProjectCodeByProd")
    @ResponseBody
    public Map<String, Object> listOfProjectCodeByProd(Integer page, Integer rows, String searchParams){
        try {
            List<Map<String, Object>> resList = fProjectCodeService.listOfProjectCodeByProd(page, rows, searchParams);
            Map<String, Object> resMap = new HashMap<String, Object>();
            resMap.put("total", resList.size());
            resMap.put("rows", resList);
            return resMap;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
    
    //项目编码列表
    @RequestMapping("/listOfProjectCode")
    @ResponseBody
    public Map<String, Object> listOfProjectCode(Integer page, Integer rows, String searchParams,String prodLine,String pdt,String state,String start,String end){
        try {
        	Map<String, Object> param = new HashMap<>();
    		param.put("searchParams", searchParams);
    		param.put("prodLine", prodLine);
    		param.put("pdt", pdt);
    		if("0".equals(state)){
    			state = null;
    		}else if(StringUtils.isBlank(state)){
    			state = "1";
    		}else{
    			state = "1";
    		}
    		param.put("state", state);
    		param.put("start", start);
    		param.put("end", end);
   		 
        	PageInfo pageInfo = fProjectCodeService.listOfProjectCode(page, rows, param);
            Map<String, Object> resMap = new HashMap<String, Object>();
            resMap.put("total", pageInfo.getTotal());
            resMap.put("rows", pageInfo.getList());
            return resMap;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
    
  //项目编码列表  全视图
    @RequestMapping("/listOfProjectCodeAll")
    @ResponseBody
    public Map<String, Object> listOfProjectCodeAll(Integer page, Integer rows, String searchParams,String prodLine,String pdt,String state,String start,String end){
        try {
        	Map<String, Object> param = new HashMap<>();
    		param.put("searchParams", searchParams);
    		param.put("prodLine", prodLine);
    		param.put("pdt", pdt);
    		if("0".equals(state)){
    			state = null;
    		}else if(StringUtils.isBlank(state)){
    			state = "1";
    		}else{
    			state = "1";
    		}
    		param.put("state", state);
    		param.put("start", start);
    		param.put("end", end);
   		 
        	PageInfo pageInfo = fProjectCodeService.listOfProjectCodeAll(page, rows, param);
            Map<String, Object> resMap = new HashMap<String, Object>();
            resMap.put("total", pageInfo.getTotal());
            resMap.put("rows", pageInfo.getList());
            return resMap;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
    
    @RequestMapping("/getFProductByCode")
    @ResponseBody
    public ResponseResult getFProductByCode(String productCode){
    	
    	List<FProductCode> fProductCodeList = fProductCodeService.getByProductCode(productCode);
    	//如果内码有问题，则取第一个
    	return ResponseResult.success(fProductCodeList.get(0));
    }
    
    @RequestMapping("/export")
    @ResponseBody
    public void export(String searchStr,String prodLine,String pdt,String state,String start,String end, HttpServletResponse response) {
		try {
			
			/*
			 * FProjectCodeView a=new FProjectCodeView();
			 */
			 String[] header=new String[] {"序号","项目编码","项目名称","项目代号","项目类别","项目经理","所属产品线","所属PDT","服务产品个数","服务的产品编码","服务的产品名称",
					 "此产品应该分摊的项目费用比例","产品编码对应的产品线","产品编码对应的PDT","编码生效日期","对应版本","对应评审点","费用分摊运营商比重","费用分摊非运营商比重","使用状态"};
    		 String[] column=new String[] {"Id","fProjno","fProjname","fProjcode","fObjcaName","fProjmng","fProductlineName","fPdtName","fProductlineno","fProductCode","ProductNameCn",
    				 "Rate","fProductlineNameProductcode", "fPdtNameProductcode", "Begintime","fVersion","fAssignPointName","fBizhong","fFbizhong","Mark"};
 			
    		 Map<String, Object> searchMap = new HashMap<>();        
    		 searchMap.put("searchParams", searchStr);
    		 searchMap.put("prodLine", prodLine);
    		 searchMap.put("pdt", pdt);
    		 searchMap.put("type", "export");
    		 if("0".equals(state)){
     			state = null;
     		}else if(StringUtils.isBlank(state)){
     			state = "1";
     		}else{
     			state = "1";
     		}
    		 searchMap.put("state", state);
    		 searchMap.put("start", start);
    		 searchMap.put("end", end);
    		 
    		 List<FProjectCodeView> lst=fProjectCodeService.getExport(searchMap);
    		 
    		 if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<lst.size()) {
    			 lst=lst.subList(0, Integer.parseInt(maxCount));
    		 }
    		   
    		 ExportExcelWrapper<FProjectCodeView> excelWrapper=new ExportExcelWrapper<FProjectCodeView>();
    	    	
    		 excelWrapper.exportExcel("项目编码导出", "项目编码导出", header,column, lst, response, "2007");
			
		}catch(Exception e) {
			 e.printStackTrace();
		}
    }
    
    @RequestMapping("/exportAll")
    @ResponseBody
    public void exportAll(String searchStr,String prodLine,String pdt,String state,String start,String end, HttpServletResponse response) {
		try {
			
			/*
			 * FProjectCodeView a=new FProjectCodeView();
			 */
			 String[] header=new String[] {"序号","项目编码","项目名称","项目代号","项目类别","项目经理","所属产品线","所属PDT","服务产品个数","服务的产品编码","服务的产品名称",
					 "此产品应该分摊的项目费用比例","产品编码对应的产品线","产品编码对应的PDT","编码生效日期","对应版本","对应评审点","费用分摊运营商比重","费用分摊非运营商比重","使用状态", "mark"};
    		 String[] column=new String[] {"Id","fProjno","fProjname","fProjcode","fObjcaName","fProjmng","fProductlineName","fPdtName","fProductlineno","fProductCode","ProductNameCn",
    				 "Rate","fProductlineNameProductcode", "fPdtNameProductcode", "Begintime","fVersion","fAssignPointName","fBizhong","fFbizhong","Mark", "Updatestatus"};
 			
    		 Map<String, Object> searchMap = new HashMap<>();        
    		 searchMap.put("searchParams", searchStr);
    		 searchMap.put("prodLine", prodLine);
    		 searchMap.put("pdt", pdt);
    		 searchMap.put("type", "export");
    		 if("0".equals(state)){
     			state = null;
     		}else if(StringUtils.isBlank(state)){
     			state = "1";
     		}else{
     			state = "1";
     		}
    		 searchMap.put("state", state);
    		 searchMap.put("start", start);
    		 searchMap.put("end", end);
    		 
    		 List<FProjectCodeViewAll> lst=fProjectCodeService.getExportAll(searchMap);
    		 
    		 if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<lst.size()) {
    			 lst=lst.subList(0, Integer.parseInt(maxCount));
    		 }
    		   
    		 ExportExcelWrapper<FProjectCodeViewAll> excelWrapper=new ExportExcelWrapper<FProjectCodeViewAll>();
    	    	
    		 excelWrapper.exportExcel("项目编码导出", "项目编码导出", header,column, lst, response, "2007");
			
		}catch(Exception e) {
			 e.printStackTrace();
		}
    }

    @RequestMapping("/export2")
    @ResponseBody
    public void export2(String searchStr,String prodLine,String pdt,String state,String start,String end, HttpServletResponse response) {
        try {

            /*
             * FProjectCodeView a=new FProjectCodeView();
             */
            String[] header=new String[] {"序号","项目编码","项目名称","项目代号","项目类别","项目经理","所属产品线","所属PDT",
                    "编码生效日期","对应版本","对应评审点","费用分摊运营商比重","费用分摊非运营商比重","使用状态"};
            String[] column=new String[] {"Id","fProjno","fProjname","fProjcode","fObjcaName","fProjmng","fProductlineName","fPdtName",
                    "Begintime","fVersion","fAssignPointName","fBizhong","fFbizhong","Mark"};

            Map<String, Object> searchMap = new HashMap<>();
            searchMap.put("searchParams", searchStr);
            searchMap.put("prodLine", prodLine);
            searchMap.put("pdt", pdt);
            searchMap.put("type", "export");
            if("0".equals(state)){
                state = null;
            }else if(StringUtils.isBlank(state)){
                state = "1";
            }else{
                state = "1";
            }
            searchMap.put("state", state);
            searchMap.put("start", start);
            searchMap.put("end", end);

            List<FProjectCodeView> lst=fProjectCodeService.getExport2(searchMap);
            if(CollectionUtils.isNotEmpty(lst)){
                int i = 1;
                for(FProjectCodeView fProjectCodeView : lst){
                    fProjectCodeView.setId(i+"");
                    i++;
                }
            }
            if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<lst.size()) {
                lst=lst.subList(0, Integer.parseInt(maxCount));
            }

            ExportExcelWrapper<FProjectCodeView> excelWrapper=new ExportExcelWrapper<FProjectCodeView>();

            excelWrapper.exportExcel("项目编码导出", "项目编码导出", header,column, lst, response, "2007");

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/exportAll2")
    @ResponseBody
    public void exportAll2(String searchStr,String prodLine,String pdt,String state,String start,String end, HttpServletResponse response) {
        try {

            /*
             * FProjectCodeView a=new FProjectCodeView();
             */
            String[] header=new String[] {"序号","项目编码","项目名称","项目代号","项目类别","项目经理","所属产品线","所属PDT",
                    "编码生效日期","对应版本","对应评审点","费用分摊运营商比重","费用分摊非运营商比重","使用状态", "mark"};
            String[] column=new String[] {"Id","fProjno","fProjname","fProjcode","fObjcaName","fProjmng","fProductlineName","fPdtName",
                    "Begintime","fVersion","fAssignPointName","fBizhong","fFbizhong","Mark", "Updatestatus"};

            Map<String, Object> searchMap = new HashMap<>();
            searchMap.put("searchParams", searchStr);
            searchMap.put("prodLine", prodLine);
            searchMap.put("pdt", pdt);
            searchMap.put("type", "export");
            if("0".equals(state)){
                state = null;
            }else if(StringUtils.isBlank(state)){
                state = "1";
            }else{
                state = "1";
            }
            searchMap.put("state", state);
            searchMap.put("start", start);
            searchMap.put("end", end);

            List<FProjectCodeViewAll> lst=fProjectCodeService.getExportAll2(searchMap);
            if(CollectionUtils.isNotEmpty(lst)){
                int i = 1;
                for(FProjectCodeViewAll fProjectCodeView : lst){
                    fProjectCodeView.setId(i+"");
                    i++;
                }
            }
            if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<lst.size()) {
                lst=lst.subList(0, Integer.parseInt(maxCount));
            }

            ExportExcelWrapper<FProjectCodeViewAll> excelWrapper=new ExportExcelWrapper<FProjectCodeViewAll>();

            excelWrapper.exportExcel("项目编码导出", "项目编码导出", header,column, lst, response, "2007");

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/getExportDataCount")
    @ResponseBody
    public ResponseResult getExpoertDataCount(String searchStr,String prodLine,String pdt,String state,String start,String end, HttpServletResponse response) {
    	try {
    		Map<String, Object> searchMap = new HashMap<>();        
   		 	searchMap.put("searchParams", searchStr);
   		 	searchMap.put("prodLine", prodLine);
   		 	searchMap.put("pdt", pdt);
   		 	searchMap.put("type", "export");
   		 if("0".equals(state)){
  			state = null;
  		}else if(StringUtils.isBlank(state)){
  			state = "1";
  		}else{
  			state = "1";
  		}
   		 	searchMap.put("state", state);
   		 	searchMap.put("start", start);
   		 	searchMap.put("end", end);
   		 
   		 	List<FProjectCodeView> lst=fProjectCodeService.getExport(searchMap);
   		 	
   		 	String msg="";
   		 	if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<lst.size()) {
   		 		msg="目前能导出最大数据为"+maxCount+"条，如需导出更多请联系管理员！";
   		 	}
   		 	return ResponseResult.success("",msg,lst.size());
    	}catch(Exception e) {
    		e.printStackTrace();
    		return ResponseResult.fail(e.getMessage());
    	}
    }
    
    @RequestMapping("/checkAuto")
    @ResponseBody
    public ResponseResult checkAuth(){
    	return ResponseResult.success(UserUtil.checkIsAdmin());
    }
    
    
    
    
    //获取产品线
    /**
     * 项目编码调用
     * @return
     */
    @RequestMapping("/prodLine/getAllWithCom")
    @ResponseBody
    public  List<Map<String, String>> getAllWithCom(String state, String start, String end){
    	return fProjectCodeService.getAllProdline(state, start, end);
    }
    
    
    //根据产品线获取PDT
    
    @RequestMapping("/getAllPdt")
	@ResponseBody
	public List<Map<String, String>> getAllPdt(String state, String start, String end) {
		return fProjectCodeService.getAllPdt(state, start, end);
	}
    
    @RequestMapping("/getPdtByProlineno")
	@ResponseBody
    public List<Map<String, String>> getPdtByProlineno(String prodlineno, String state){
    	
    	return fProjectCodeService.getPdtByProlineno(prodlineno,  state);
    }
}
