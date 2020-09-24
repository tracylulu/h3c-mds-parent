package com.h3c.mds.flowable.controller;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.Bom;
import com.h3c.mds.flowable.service.BomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/flowable/bom")
public class BomController {

    private static final Logger logger = LoggerFactory.getLogger(BomController.class);

    @Autowired
    private BomService bomService;

    @RequestMapping("/findByPage")
    @ResponseBody
    public Map<String,Object> findByPage(Integer page, Integer rows,String searchStr){
        try {
            PageInfo<Bom> pageInfo = bomService.findByPage(page,rows,searchStr);
            Map<String,Object> map = new HashMap<>();
            map.put("rows", pageInfo.getList());
            map.put("total", pageInfo.getTotal());
            return map;
        }catch (Exception e){
            logger.error("查询失败", e);
            return null;
        }
    }
}
