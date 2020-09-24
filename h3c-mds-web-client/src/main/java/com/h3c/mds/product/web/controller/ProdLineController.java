package com.h3c.mds.product.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.ProdLineService;
import com.h3c.mds.product.service.ProdLineViewService;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.common.CheckUtils;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

@RestController
@RequestMapping("/product")
public class ProdLineController {

    private static final Logger logger = LoggerFactory.getLogger(ProdLineController.class);

    @Autowired
    private ProdLineViewService prodLineViewService;
    @Autowired
    private IBDS_ColunmConfigService configService;
    @Autowired
    private ProdLineService lineService;
    @Autowired
	private OperationLogUtils<IBDS_PRODLINE> optLogUtils;
	@Autowired
	private CheckUtils checkUtils;

    @RequestMapping("/data/pldata")
    public Object dataList(String id, String searchParas, String projectStatus){
        // 定义回传id类型(内码前缀),用于树节点展开时使用
        String type = null;
        // 截取code的前两位字符区分对象类型
        if (null != id) {

            type = id.substring(0, 2).toString();
        }
        System.out.print(projectStatus);
        // 查询参数放入Map中
        Map<String, String> searchMap = new HashMap<>();
        searchMap.put("id", id);
        searchMap.put("type", type);
        searchMap.put("searchParas", searchParas);
        searchMap.put("projectStatus", projectStatus);
        List<ProdLineVew> list =  prodLineViewService.getDataList(searchMap);
        return type != null && type.equals("PI") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(list)
                : EasyUIJSONUtils.list2EasyUiTreeGrid_close(list);
    }

    @RequestMapping(value="/data/pladd",produces="text/html;charset=utf-8")
    public ResponseResult create(IBDS_PRODLINE prodline){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_PRODLINE");
    		para.put("column", "PRODLINE");
    		para.put("value", prodline.getProdline());

    		String msg = checkUtils.repeatCheck(para, "产品线中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
    		
            prodline.setStatus("1");
            prodline.setCreateDate(new Date());
            prodline.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
            prodline.setModifyDate(new Date());
            prodline.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            lineService.create(prodline);
            
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(null, prodline, prodline.getProdlineno());
            return ResponseResult.success("新增成功");
        }catch (Exception e){
            logger.error("新增失败", e);
            return ResponseResult.fail("新增失败");
        }
    }

    @RequestMapping(value="/data/pledit",produces="text/html;charset=utf-8")
    public ResponseResult update(IBDS_PRODLINE prodline){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_PRODLINE");
    		para.put("column", "PRODLINE");
    		para.put("value", prodline.getProdline());
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", prodline.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "产品线中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
    		
        	IBDS_PRODLINE bfe =configService.selectByPrimaryKey(prodline.getId(),prodline.getProdlineno());
        	
            prodline.setModifyDate(new Date());
            prodline.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            lineService.update(prodline);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(bfe, prodline, prodline.getProdlineno());
            return ResponseResult.success("更新成功");
        }catch (Exception e){
            logger.error("更新失败", e);
            return ResponseResult.fail("更新失败");
        }
    }

    @RequestMapping("/prop/pldata")
    @ResponseBody
    public String gridList(String code,Integer id) {
        return configService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
    }
    
    /**
     * 项目编码调用
     * @return
     */
    @RequestMapping("/prodLine/getAllWithCom")
    @ResponseBody
    public  List<IBDS_PRODLINE> getAllWithCom(){
    	return lineService.getAll();
    }
}
