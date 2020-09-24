package com.h3c.mds.flowable.controller;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.sysmgr.response.ResponseResult;

import net.sf.json.JSONException;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@RequestMapping("/flowable/processConfigItem")
public class ProcessConfigItemController {

    private static final Logger logger = LoggerFactory.getLogger(ProcessConfigItemController.class);

    @Autowired
    private ProcessConfigItemService itemService;

    @RequestMapping("/getByConfigCode/{configCode}")
    @ResponseBody
    public ResponseResult getByConfigCode(@PathVariable String configCode){
        try {
            List<ProcessConfigItem> list = itemService.getByConfigCode(configCode);
            return ResponseResult.success(list);
        }catch (Exception e){
            logger.error("根据配置编号获取明细失败", e);
            return ResponseResult.fail("根据配置编号获取明细失败");
        }
    }
    
    @RequestMapping("/getDataList/{configCode}")
    @ResponseBody
    public String getDataList(@PathVariable String configCode){
    	Map<String,String> param=new HashMap<>();
    	param.put("configCode",configCode);
    	List<ProcessConfigItem> list = itemService.getAddPageList(param);
        JSONObject json =  new JSONObject();
    	try {
    		json.put("rows", list);
    		json.put("total", 10);
    	} catch (JSONException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}	
        return json.toString();
    } 
    
    @RequestMapping("/getComboxList/{configCode}")
    @ResponseBody
    public List<ProcessConfigItem> getComboxList(@PathVariable String configCode){
    	List<ProcessConfigItem> list = itemService.getByConfigCode(configCode);
        return list;
    }

    @RequestMapping("/getPdtList/{dept}")
    @ResponseBody
    public ResponseResult getPdtList(@PathVariable String dept){
        try {
            boolean hasPdtCode = false;
            if("D0001".equals(dept) ){
                hasPdtCode = true;
            }else if("D0002".equals(dept) || "D0003".equals(dept)){
                hasPdtCode = false;
            }
            List<ProcessConfigItem> pdtList = itemService.getPdtList(hasPdtCode);
            return ResponseResult.success(pdtList);
        }catch (Exception e){
            logger.error("获取流程PDT失败", e);
            return ResponseResult.fail("获取流程PDT失败");
        }
    }

    @RequestMapping("/getByProdlineId")
    @ResponseBody
    public ResponseResult getByProdlineId(String prodline){
        try {
            if(StringUtils.isEmpty(prodline)){
                List<ProcessConfigItem> items = itemService.getByConfigCode("processPDT");
                return ResponseResult.success(items);
            }else{
                Integer prodlineId = 0;
                try {
                    prodlineId = Integer.parseInt(prodline);
                }catch (Exception e){}
                List<ProcessConfigItem> items = itemService.getByProdlineId(prodlineId);
                return ResponseResult.success(items);
            }
        }catch (Exception e){
            logger.error("获取失败", e);
            return ResponseResult.fail("获取失败");
        }
    }

    @RequestMapping("/getByProdlineName")
    @ResponseBody
    public ResponseResult getByProdlineName(String prodline){
        try {
            if(StringUtils.isEmpty(prodline)){
                List<ProcessConfigItem> items = itemService.getByConfigCode("processPDT");
                return ResponseResult.success(items);
            }else{

                List<ProcessConfigItem> items = itemService.getByProdlineName(prodline);
                return ResponseResult.success(items);
            }
        }catch (Exception e){
            logger.error("获取失败", e);
            return ResponseResult.fail("获取失败");
        }
    }

    @RequestMapping("/getByProdlineIdFromBase")
    @ResponseBody
    public ResponseResult getByProdlineIdFromBase(String prodline){
        try {
            if(StringUtils.isEmpty(prodline)){
                List<ProcessConfigItem> items = itemService.getPdtList(true);
                return ResponseResult.success(items);
            }else{
                Integer prodlineId = 0;
                try {
                    prodlineId = Integer.parseInt(prodline);
                }catch (Exception e){}
                List<ProcessConfigItem> items = itemService.getByProdlineIdFromBase(prodlineId);
                return ResponseResult.success(items);
            }
        }catch (Exception e){
            logger.error("获取失败", e);
            return ResponseResult.fail("获取失败");
        }
    }

    @RequestMapping("/getByProdlineCodeFromBase")
    @ResponseBody
    public ResponseResult getByProdlineCodeFromBase(String prodlineCode){
        try {
            List<ProcessConfigItem> items = itemService.getByProdlineCodeFromBase(prodlineCode);
            return ResponseResult.success(items);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @ResponseBody
    @RequestMapping("/getById/{id}")
    public ResponseResult getById(@PathVariable Integer id){
        try {
            ProcessConfigItem item = itemService.getById(id);
            return ResponseResult.success(item);
        }catch (Exception e){
            logger.error("根据id查询失败", e);
            return ResponseResult.fail("根据id查询失败");
        }
    }
}
