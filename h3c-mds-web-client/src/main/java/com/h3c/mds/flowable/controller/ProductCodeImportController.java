package com.h3c.mds.flowable.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.entity.ProductCodeProcessExt;
import com.h3c.mds.flowable.excel.ProductCodeExcelReader;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.excel.ParseExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/flowable/productCodeApply")
public class ProductCodeImportController {

    private static final Logger logger = LoggerFactory.getLogger(ProductCodeImportController.class);

    @Value("${file.path}")
    private String basePath;

    private String FILE_PATH;

    private String TEMP_PATH;

    @PostConstruct
    public void initPath(){
        String seperator = File.separator;
        TEMP_PATH =  basePath+"temp"+seperator+"flowable"+seperator;
    }

    @RequestMapping("/uploadFile1111")
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request,Model model){
        try {
            if(file.isEmpty()){
                //return ResponseResult.fail("文件不能为空");
            }
            String fileApplyCode = request.getParameter("fileApplyCode");
            String fileApplyDept = request.getParameter("fileApplyDept");
            String timestamp = request.getParameter("timestamp");
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
            processExt.setApplyDept("D0001");
            model.addAttribute("applyType", processExt.getApplyType());
            model.addAttribute("applyCount", processExt.getApplyCount());
            model.addAttribute("currentNode", "editable");
            model.addAttribute("entity", processExt);
            model.addAttribute("timestamp", timestamp);
            return "flowable/productCodeApply/subAdd";
        }catch (Exception e){
            logger.error("文件导入失败", e);
            return "flowable/productCodeApply/subAdd";
        }
    }



}
