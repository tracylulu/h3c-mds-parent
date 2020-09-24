package com.h3c.mds.finance.controller;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProdView;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProductCodeView;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FProductCodeViewService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/finance/fproductCode")
public class FProductCodeController {

    private static final Logger logger = LoggerFactory.getLogger(FProductCodeController.class);

    @Value("${export.maxCount}")
    private String maxCount;
    @Autowired
    private FProductCodeService fProductCodeService;
    @Autowired
    private FProductCodeViewService fProductCodeViewService;

    @RequestMapping("/findByPage")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer rows,String dep,String searchStr,String prodLine,String pdt,String state,String start,String end){
        try {
            PageInfo<FProductCode> pageInfo = fProductCodeService.findByPage(page, rows,dep,"3",searchStr,prodLine,pdt,state,start,end);
            Map<String,Object> map = new HashMap<>();
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return map;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }

    @RequestMapping("/getTreeData")
    @ResponseBody
    public Object getTreeData(String id,String searchStr,String prodLine,String pdt,String state,String start,String end,String type){
        // 查询参数放入Map中
        Map<String, Object> searchMap = new HashMap<>();
        if(id != null){
            if(id.split("_")[0].indexOf("PDT") > -1){
                searchMap.put("type", "PDT");
            }else{
                searchMap.put("type", id.split("_")[0]);
            }
            id = id.split("_")[1];
        }

        searchMap.put("listType", type);

        searchMap.put("id", id);
        searchMap.put("searchParas", searchStr);
        searchMap.put("prodLine", prodLine);
        searchMap.put("pdt", pdt);
		
		  if(StringUtils.isBlank(state)){ state = "1,2"; }
		 
        searchMap.put("state", StringUtils.isNotBlank(state)?state.split(","):null);
		searchMap.put("start", start);
		searchMap.put("end", end);

        List<FProductCodeView> dataList = fProductCodeViewService.getDataList(searchMap);
        if("1".equals(type) || "3".equals(type)){
            return "PL".equals(searchMap.get("type"))  ?  EasyUIJSONUtils.list2EasyUiTreeGrid_open(dataList) :
                    EasyUIJSONUtils.list2EasyUiTreeGrid_close(dataList);
        }
        return "PDT".equals(searchMap.get("type"))  ?  EasyUIJSONUtils.list2EasyUiTreeGrid_open(dataList) :
                EasyUIJSONUtils.list2EasyUiTreeGrid_close(dataList);
    }

    @RequestMapping("/getProdTreeData/{pdtId}")
    @ResponseBody
    public String getProdTreeData(@PathVariable Integer pdtId,String id,String searchStr){
        // 查询参数放入Map中
        Map<String, Object> searchMap = new HashMap<>();
        searchMap.put("id", id);
        searchMap.put("searchParas", searchStr);
        searchMap.put("pdtId", pdtId);
        List<FProductCodeView> dataList = fProductCodeViewService.getProdTreeData(searchMap);
        return id != null ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(dataList) :
                EasyUIJSONUtils.list2EasyUiTreeGrid_close(dataList);
    }

    @RequestMapping(value = "/create",produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult create(FProductCode fProductCode){
        try {
            fProductCodeService.create(fProductCode);
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("新增失败", e);
            return ResponseResult.fail("新增失败");
        }
    }

    @RequestMapping(value = "/update",produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult update(FProductCode fProductCode){
        try {
            fProductCodeService.update(fProductCode);
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("更新失败", e);
            return ResponseResult.fail("更新失败");
        }
    }

    @RequestMapping("/getById/{id}")
    @ResponseBody
    public ResponseResult getById(@PathVariable Integer id){
        try {
            FProductCode fProductCode = fProductCodeService.getById(id);
            return ResponseResult.success(fProductCode);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping("/getByProdId/{prodId}")
    @ResponseBody
    public ResponseResult getByProdId(@PathVariable Integer prodId){
        try {
            List<FProductCode> list = fProductCodeService.getByProdId(prodId);
            return ResponseResult.success(list);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping("/getByProdIdNo00/{prodId}")
    @ResponseBody
    public ResponseResult getByProdIdNo00(@PathVariable Integer prodId){
        try {
            List<FProductCode> list = fProductCodeService.getByProdIdNo00(prodId);
            return ResponseResult.success(list);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping("/list/{type}")
    public String list(Model model,@PathVariable String type){
        model.addAttribute("id_suffix", System.currentTimeMillis());
        model.addAttribute("type", type);
        String title = "产品编码";
        if("1".equals(type)){
            title = "产品编码列表";
        }else if("2".equals(type)){
            title = "按产品线、所属PDT查询";
        }else if("3".equals(type)){
            title = "产品编码列表全视图";
        }else if("4".equals(type)){
            title = "按产品线、所属PDT查询全视图";
        }
        model.addAttribute("title", title);
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
        return "finance/fprod/fprodCodeList";
    }

    @RequestMapping("/add")
    public String add(Model model,String pageType){
        model.addAttribute("id_suffix", System.currentTimeMillis());
        if("edit".equals(pageType)){
            model.addAttribute("IsEdit", "true");
        }
        return "finance/fprod/fprodCodeAdd";
    }

    @RequestMapping("/fproductCodeList")
    public String fproductCodeList(Model model){
        model.addAttribute("id_suffix", System.currentTimeMillis());
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
        return "finance/fprod/fproductCodeList";
    }

    @RequestMapping("/edit/{id}")
    public String edit(Model model,@PathVariable Integer id){
        model.addAttribute("id_suffix", System.currentTimeMillis());
        model.addAttribute("IsEdit", "true");
        model.addAttribute("id", id);
        return "finance/fprod/fprodCodeAdd";
    }

    @RequestMapping("/getPropertyByCode")
    @ResponseBody
    public List<Map<String,Object>> getPropertyByCode(Integer id){
        FProductCode fProductCode = fProductCodeService.getById(id);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>(){
            {
                add(new HashMap<String, Object>(){
                    {
                        put("name","所属产品线");
                        put("value", fProductCode.getProdlineName());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","所属PDT");
                        put("value", fProductCode.getPdtName());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品编码");
                        put("value", fProductCode.getProductCode());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品编码中文描述");
                        put("value", fProductCode.getProductNameCn());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品编码英文描述");
                        put("value", fProductCode.getProductNameEn());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","BOM编码");
                        put("value", fProductCode.getBomCode());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","备注");
                        put("value", fProductCode.getNote());
                    }
                });

                add(new HashMap<String, Object>(){
                    {
                        put("name","状态");
                        put("value", fProductCode.getStatus());
                        put("ColumnCode", "status");
                    }
                });
            }
        };
        return list;
    }

    /**
     * 导出
     * @param searchStr
     * @param prodLine
     * @param pdt
     * @param response
     */
    @RequestMapping("/export")
    public void export(String searchStr,String prodLine,String pdt,String state,String start,String end,String type, HttpServletResponse response) {
    	 try {
    		 //header与column一一对应
    		 String[] header=new String[] {"序号","产品线名称","所属PDT","产品编码","产品中文名称","产品英文名称","BOM编码数量","BOM编码","使用状态","生效时间"};
    		 String[] column=new String[] {"Id","ProdlineName","PdtName","ProductCode","ProductNameCn","ProductNameEn","Name","BomCode","Status","EffectDate"};
    		 List<FProductCodeView> lst=new ArrayList<>();
    		 Map<String, Object> searchMap = new HashMap<>();
    		 searchMap.put("searchParas", searchStr);
    		 searchMap.put("prodLine", prodLine);
    		 searchMap.put("pdt", pdt);
    		 if(StringUtils.isBlank(state)){
      			state = "1,2";
      		 }
    		 searchMap.put("state", StringUtils.isNoneBlank(state)?state.split(","):null);
    		 searchMap.put("start", start);
    		 searchMap.put("end", end);
    		 searchMap.put("listType", type);

    		 List<FProductCodeView> dataList = fProductCodeViewService.getExportList(searchMap);

    		 //使用Name字段 存储”BOM编码数量“
    		 int i=1;
    		 for(FProductCodeView m :dataList) {
    			 if(StringUtils.isNotBlank(m.getBomCode())&&(m.getBomCode().indexOf(";")!=-1||m.getBomCode().indexOf(",")!=-1)) {
    				String bomCode=m.getBomCode().replace(",", ";");
    				String[] bom=bomCode.split(";");
    				int k=0;
    				for(String item:bom) {
    					FProductCodeView fpNew=new FProductCodeView();
    					fpNew.setId(i);
						fpNew.setProdlineName(m.getProdlineName());
						fpNew.setPdtName(m.getPdtName());
						fpNew.setProductCode(m.getProductCode());
						fpNew.setProductNameCn(m.getProductNameCn());
						fpNew.setProductNameEn(m.getProductNameEn());

						Integer len=bom.length;
    					fpNew.setName(len.toString());
    					fpNew.setStatus("1".equals(m.getStatus())?"新增":"2".equals(m.getStatus())?"改变":"3".equals(m.getStatus())?"停用":"");
    					fpNew.setEffectDate(m.getEffectDate());
						/*
						 * if(k==0) {
						 *
						 * }else { fpNew.setName(""); }
						 */
    					fpNew.setBomCode(item);
    					lst.add(fpNew);
    					//i++;
    					k++;
    				}
    			 }else {
    				 m.setName(StringUtils.isNotBlank(m.getBomCode())?"1":"0");
    				 m.setStatus("1".equals(m.getStatus())?"新增":"2".equals(m.getStatus())?"改变":"3".equals(m.getStatus())?"停用":"");
    				 m.setId(i);
    				 lst.add(m);
    			 }
    			 i++;
    		 }
    		 
    		 if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<lst.size()) {
    			 lst=lst.subList(0, Integer.parseInt(maxCount));
    		 }

    		 ExportExcelWrapper<FProductCodeView> excelWrapper=new ExportExcelWrapper<FProductCodeView>();

    		 excelWrapper.exportExcel("产品编码导出", "产品编码导出", header,column, lst, response, "2007");
    	 } catch (Exception e) {
             e.printStackTrace();
         }
    }

    /**
     * 导出不拆分BOM
     * @param searchStr
     * @param prodLine
     * @param pdt
     * @param response
     */
    @RequestMapping("/export1")
    public void export1(String searchStr,String prodLine,String pdt,String state,String start,String end,String type, HttpServletResponse response) {
        try {
            //header与column一一对应
            String[] header=new String[] {"序号","产品线名称","所属PDT","产品编码","产品中文名称","产品英文名称","BOM编码","使用状态","生效时间"};
            String[] column=new String[] {"Id","ProdlineName","PdtName","ProductCode","ProductNameCn","ProductNameEn","BomCode","Status","EffectDate"};
            Map<String, Object> searchMap = new HashMap<>();
            searchMap.put("searchParas", searchStr);
            searchMap.put("prodLine", prodLine);
            searchMap.put("pdt", pdt);
            if(StringUtils.isBlank(state)){
                state = "1,2";
            }
            searchMap.put("state", StringUtils.isNoneBlank(state)?state.split(","):null);
            searchMap.put("start", start);
            searchMap.put("end", end);
            searchMap.put("listType", type);
            List<FProductCodeView> dataList = fProductCodeViewService.getExportList(searchMap);
            if(StringUtils.isNotBlank(maxCount)&&Integer.parseInt(maxCount)<dataList.size()) {
                dataList=dataList.subList(0, Integer.parseInt(maxCount));
            }
            int i = 1;
            for(FProductCodeView fProductCodeView : dataList){
                fProductCodeView.setId(i);
                fProductCodeView.setStatus("1".equals(fProductCodeView.getStatus())?"新增":"2".equals(fProductCodeView.getStatus())?"改变":"3".equals(fProductCodeView.getStatus())?"停用":"");
                i++;
            }
            ExportExcelWrapper<FProductCodeView> excelWrapper=new ExportExcelWrapper<FProductCodeView>();
            excelWrapper.exportExcel("产品编码导出", "产品编码导出", header,column, dataList, response, "2007");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	@RequestMapping("/getExportDataCount")
	@ResponseBody
	public ResponseResult getExpoertDataCount(String searchStr, String prodLine, String pdt, String state, String start,
			String end,String type, HttpServletResponse response) {
		try {
			List<FProductCodeView> lst = new ArrayList<>();
			Map<String, Object> searchMap = new HashMap<>();
			searchMap.put("searchParas", searchStr);
			searchMap.put("prodLine", prodLine);
			searchMap.put("pdt", pdt);
			if (StringUtils.isBlank(state)) {
				state = "1,2";
			}
			searchMap.put("state", StringUtils.isNoneBlank(state) ? state.split(",") : null);
			searchMap.put("start", start);
			searchMap.put("end", end);
			searchMap.put("listType", type);

			List<FProductCodeView> dataList = fProductCodeViewService.getExportList(searchMap);

			// 使用Name字段 存储”BOM编码数量“
			int i = 1;
			for (FProductCodeView m : dataList) {
				if (StringUtils.isNotBlank(m.getBomCode())
						&& (m.getBomCode().indexOf(";") != -1 || m.getBomCode().indexOf(",") != -1)) {
					String bomCode = m.getBomCode().replace(",", ";");
					String[] bom = bomCode.split(";");
					int k = 0;
					for (String item : bom) {
						FProductCodeView fpNew = new FProductCodeView();
						fpNew.setId(i);
						fpNew.setProdlineName(m.getProdlineName());
						fpNew.setPdtName(m.getPdtName());
						fpNew.setProductCode(m.getProductCode());
						fpNew.setProductNameCn(m.getProductNameCn());
						fpNew.setProductNameEn(m.getProductNameEn());

						Integer len = bom.length;
						fpNew.setName(len.toString());
						fpNew.setStatus("1".equals(m.getStatus()) ? "新增"
								: "2".equals(m.getStatus()) ? "改变" : "3".equals(m.getStatus()) ? "停用" : "");
						fpNew.setEffectDate(m.getEffectDate());
						/*
						 * if(k==0) {
						 *
						 * }else { fpNew.setName(""); }
						 */
						fpNew.setBomCode(item);
						lst.add(fpNew);
						// i++;
						k++;
					}
				} else {
					m.setName(StringUtils.isNotBlank(m.getBomCode()) ? "1" : "0");
					m.setStatus("1".equals(m.getStatus()) ? "新增"
							: "2".equals(m.getStatus()) ? "改变" : "3".equals(m.getStatus()) ? "停用" : "");
					m.setId(i);
					lst.add(m);
				}
				i++;
			}

			String msg = "";
			if (StringUtils.isNotBlank(maxCount) && Integer.parseInt(maxCount) < lst.size()) {
				msg = "目前能导出最大数据为" + maxCount + "条，如需导出更多请联系管理员！";
			}

			return ResponseResult.success("",msg, lst.size());
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.fail(e.getMessage());
		}
	}

    @RequestMapping("/getExportDataCount2")
    @ResponseBody
    public ResponseResult getExpoertDataCount2(String searchStr, String prodLine, String pdt, String state, String start,
                                              String end,String type, HttpServletResponse response) {
        try {
            Map<String, Object> searchMap = new HashMap<>();
            searchMap.put("searchParas", searchStr);
            searchMap.put("prodLine", prodLine);
            searchMap.put("pdt", pdt);
            if(StringUtils.isBlank(state)){
                state = "1,2";
            }
            searchMap.put("state", StringUtils.isNoneBlank(state)?state.split(","):null);
            searchMap.put("start", start);
            searchMap.put("end", end);
            searchMap.put("listType", type);
            List<FProductCodeView> dataList = fProductCodeViewService.getExportList(searchMap);

            String msg = "";
            if (StringUtils.isNotBlank(maxCount) && Integer.parseInt(maxCount) < dataList.size()) {
                msg = "目前能导出最大数据为" + maxCount + "条，如需导出更多请联系管理员！";
            }

            return ResponseResult.success("",msg, dataList.size());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.fail(e.getMessage());
        }
    }


    @RequestMapping("/checkAdmin")
    @ResponseBody
    public ResponseResult checkAdmin(){

        Boolean isAdmin ;
        try {
            isAdmin = UserUtil.checkIsAdmin();
            if(!UserUtil.checkIsAdmin()){
                String roleCode = (String) SecurityUtils.getSubject().getSession().getAttribute("roleCode");
                if(roleCode.contains("R_000008")){
                    isAdmin = true;
                }else{
                    isAdmin = false;
                }
            }
            return ResponseResult.success(isAdmin);
        }catch (Exception e){
            logger.error("判断权限失败", e);
            return ResponseResult.fail(false);
        }

    }
}
