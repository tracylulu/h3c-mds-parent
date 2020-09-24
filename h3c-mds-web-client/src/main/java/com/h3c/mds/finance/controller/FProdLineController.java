package com.h3c.mds.finance.controller;

import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.sysmgr.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/finance/fprodLine")
public class FProdLineController {

    private static final Logger logger = LoggerFactory.getLogger(FProdLineController.class);

    @Autowired
    private FProdLineService lineService;

    @RequestMapping("/getAll")
    @ResponseBody
    public ResponseResult getAll(){
        try {
            List<FProdLine> all = lineService.getAll();
            return ResponseResult.success(all);
        }catch (Exception e){
            logger.error("获取所有产品线失败", e);
            return ResponseResult.fail("获取所有产品线失败");
        }
    }

    @RequestMapping("/getByName")
    @ResponseBody
    public ResponseResult getByName(String name){
        try {
            List<FProdLine> list = lineService.getByName(name);
            return ResponseResult.success(list);
        }catch (Exception e){
            logger.error("查询失败",e);
            return ResponseResult.fail("查询失败");
        }
    }

    @ResponseBody
    @RequestMapping("/getById/{id}")
    public ResponseResult getById(@PathVariable Integer id){
        try {
            FProdLine line = lineService.getById(id);
            return ResponseResult.success(line);
        }catch (Exception e){
            logger.error("查询失败",e);
            return ResponseResult.fail("查询失败");
        }
    }

    @ResponseBody
    @RequestMapping("/getByDept/{deptId}")
    public ResponseResult getByDept(@PathVariable String deptId){
        try {
            if("D0001".equals(deptId) ){
                List<FProdLine> lines = lineService.getByType("1");
                return ResponseResult.success(lines);
            }else if("D0002".equals(deptId) || "D0003".equals(deptId)){
                List<FProdLine> byType = lineService.getByType("2");
                return ResponseResult.success(byType);
            }else {
                throw new RuntimeException("部门错误");
            }

        }catch (Exception e){
            logger.error("查询失败",e);
            return ResponseResult.fail("查询失败");
        }
    }
    
    @RequestMapping("/getAllWithCom")
    @ResponseBody
    public  List<FProdLine> getAllWithCom(){
    	return lineService.getAll();
    }

    @ResponseBody
    @RequestMapping("/getDistinctNameByDept/{deptId}")
    public ResponseResult getDistinctNameByDept(@PathVariable String deptId){
        try {
            List<FProdLine> prodLines = lineService.getDistinctNameByDept(deptId);
            return ResponseResult.success(prodLines);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @ResponseBody
    @RequestMapping("/getDistinctNameAll")
    public List<FProdLine> getDistinctNameAll(){
        try {
            List<FProdLine> prodLines = lineService.getDistinctNameByDept(null);
            return prodLines;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/getByLineDesc/{desc}")
    public ResponseResult getByLineDesc(@PathVariable String desc){
        try {
            List<FProdLine> lines = lineService.getByLineDesc(desc);
            return ResponseResult.success(lines);
        }catch (Exception e){
            logger.error("查询失败", e);
            return ResponseResult.fail("查询失败");
        }
    }

    @RequestMapping("/getDistinctDescFromCode")
    @ResponseBody
    public List<FProdLine> getDistinctDescFromCode(){
        try {
            List<FProdLine> lines = lineService.getDistinctDescFromCode();
            return lines;
        }catch (Exception e){
            logger.error("根据产品编码获取产品线失败", e);
            return null;
        }
    }
}
