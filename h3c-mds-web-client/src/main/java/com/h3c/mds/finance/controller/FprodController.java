package com.h3c.mds.finance.controller;

import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProdView;
import com.h3c.mds.finance.exception.FinanceException;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FProdViewService;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/finance/fprod")
public class FprodController {

    private static final Logger logger = LoggerFactory.getLogger(FprodController.class);

    @Autowired
    private FprodService fprodService;
    @Autowired
    private FProdViewService fProdViewService;

    @RequestMapping("/getByLineNo/{lineNo}")
    @ResponseBody
    public ResponseResult getByLineNo(@PathVariable String lineNo){
        try {
            List<FProd> prodList = fprodService.getByLineNo(lineNo);
            return ResponseResult.success(prodList);
        }catch (Exception e){
            logger.error("根据产品线编号获取产品族失败", e);
            return ResponseResult.fail("根据产品线编号获取产品族失败");
        }
    }

    @RequestMapping("/getByLineId/{id}")
    @ResponseBody
    public ResponseResult getByLineId(@PathVariable Integer id){
        try {
            List<FProd> prodList = fprodService.getByLineId(id);
            return ResponseResult.success(prodList);
        }catch (Exception e){
            logger.error("根据产品线编号获取产品族失败", e);
            return ResponseResult.fail("根据产品线编号获取产品族失败");
        }
    }

    @RequestMapping("/list")
    public String list(Model model){
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
        return "finance/fprod/list";
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("id_suffix", System.currentTimeMillis());
        return "finance/fprod/add";
    }

    @RequestMapping("/edit/{code}")
    public String edit(Model model,@PathVariable String code){
        model.addAttribute("code", code);
        model.addAttribute("id_suffix", System.currentTimeMillis());
        model.addAttribute("IsEdit", "true");
        return "finance/fprod/add";
    }

    @RequestMapping("/getByCode/{code}")
    @ResponseBody
    public ResponseResult getByCode(@PathVariable Integer code){
        try {
            FProd fProd = fprodService.getById(code);
            return ResponseResult.success(fProd);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping(value = "/create",produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult create(FProd fProd){
        try {
            fprodService.create(fProd);
            return ResponseResult.success("保存成功");
        }catch (FinanceException e){
            return ResponseResult.fail(e.getMessage());
        }catch (Exception e){
            logger.error("保存失败", e);
            return ResponseResult.fail("保存失败");
        }
    }

    @RequestMapping(value = "/update",produces = "text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult update(FProd fProd){
        try {
            fprodService.update(fProd);
            return ResponseResult.success("保存成功");
        }catch (FinanceException e){
            return ResponseResult.fail(e.getMessage());
        }catch (Exception e){
            logger.error("保存失败", e);
            return ResponseResult.fail("保存失败");
        }
    }

    @RequestMapping("/getTreeData")
    @ResponseBody
    public Object getTreeData(String id,String searchStr,String type){
        // 查询参数放入Map中
        if(id == null){
            type = null;
        }else{
            if(id.split("_").length == 1){
                id = "null";
            }else{
                id = id.split("_")[1];
            }

        }
        Map<String, String> searchMap = new HashMap<>();
        searchMap.put("id", id);
        searchMap.put("searchParas", searchStr);
        searchMap.put("type", type);
        List<FProdView> dataList = fProdViewService.getDataList(searchMap);
        return "2".equals(type) ?  EasyUIJSONUtils.list2EasyUiTreeGrid_open(dataList):
            EasyUIJSONUtils.list2EasyUiTreeGrid_close(dataList) ;
    }

    @RequestMapping("/getPropertyByCode")
    @ResponseBody
    public List<Map<String,Object>> getPropertyByCode(Integer code){

        FProdView fProdView = fProdViewService.getById(code);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>(){
            {
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品线编码");
                        put("value", fProdView.getProdlineNo());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品线描述");
                        put("value", fProdView.getProdlineDesc());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品族编码");
                        put("value", fProdView.getProdNo());
                    }
                });
                add(new HashMap<String, Object>(){
                    {
                        put("name","产品族名称");
                        put("value", fProdView.getProdName());
                    }
                });

            }
        };
       return list;
    }

    @ResponseBody
    @RequestMapping("/getByProdlineNameAndNo/{prodlineName}/{prodlineNo}")
    public ResponseResult getByProdlineNameAndNo(@PathVariable String prodlineName,@PathVariable String prodlineNo){
        try {
            List<FProdView> fProdViews = fProdViewService.getByProdlineNameAndNo(prodlineName,prodlineNo);
            return ResponseResult.success(fProdViews);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @ResponseBody
    @RequestMapping("/getByProdlineName")
    public ResponseResult getByProdlineName( String prodlineName){
        try {
            List<FProdView> fProdViews = fProdViewService.getByProdlineName(prodlineName);
            return ResponseResult.success(fProdViews);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping("/getByPdtId/{pdtId}")
    @ResponseBody
    public ResponseResult getByPdtId(@PathVariable Integer pdtId){
        try {
            List<FProd> list = fprodService.getByPdtId(pdtId);
            return ResponseResult.success(list);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }
}
