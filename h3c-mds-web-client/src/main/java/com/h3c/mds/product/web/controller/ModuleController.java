package com.h3c.mds.product.web.controller;

import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.ModuleView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ModuleService;
import com.h3c.mds.product.service.ModuleViewService;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ModuleController {

    private static final Logger logger = LoggerFactory.getLogger(ModuleController.class);

    @Autowired
    private IBDS_ColunmConfigService configService;
    @Autowired
    private IBDS_ModuleService moduleService;
    @Autowired
    private ModuleViewService moduleViewService;
    @Autowired
	private OperationLogUtils<IBDS_Module> optLogUtils;
	@Autowired
	private CheckUtils checkUtils;
	@Autowired
	private SearchParamUtils searchParamUtils;

    @RequestMapping("/data/mddata")
    public Object dataList(String id, String searchParas, String projectStatus){
        // 定义回传id类型(内码前缀),用于树节点展开时使用
        String type = null;
        // 截取code的前两位字符区分对象类型
        if (null != id) {
        	if(id.substring(0, 4).toString().toUpperCase().contains("SOHO")) {
        		type="PP";
        	}else {
            type = id.substring(0, 2).toString();
        	}
        }
        System.out.print(projectStatus);
        // 查询参数放入Map中
        Map<String, String> searchMap = new HashMap<>();
        searchMap.put("id", id);
        searchMap.put("type", type);
        searchMap.put("searchParas", searchParas);
        searchMap.put("projectStatus", projectStatus);
        
        searchMap=searchParamUtils.setSearchParamFromProdLine(type, searchMap, id);
        
        List<ModuleView> list =  moduleViewService.getDataList(searchMap);
        return type != null && type.equals("SS") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(list)
                : EasyUIJSONUtils.list2EasyUiTreeGrid_close(list);
    }

    @RequestMapping(value="/data/mdadd",produces="text/html;charset=utf-8")
    public ResponseResult create(IBDS_Module module){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Module");
    		para.put("column", "MODULE");
    		para.put("value", module.getModule());

    		String msg = checkUtils.repeatCheck(para, "模块中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
    		
            module.setStatus("1");
            module.setCreatedDate(new Date());
            module.setCreatedUser((String) SecurityUtils.getSubject().getPrincipal());
            module.setModifyData(new Date());
            module.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            moduleService.create(module);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(null, module, module.getModuleno());
            return ResponseResult.success("新增成功");
        }catch (Exception e){
            logger.error("新增失败", e);
            return ResponseResult.fail("新增失败");
        }
    }

    @RequestMapping(value="/data/mdedit",produces="text/html;charset=utf-8")
    public ResponseResult update(IBDS_Module module){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Module");
    		para.put("column", "MODULE");
    		para.put("value", module.getModule());
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", module.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "模块中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail( msg);
    		}
    		
        	IBDS_Module bfe =configService.selectByPrimaryKey(module.getId(),module.getModuleno());
            module.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            module.setModifyData(new Date());
            moduleService.update(module);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(bfe, module, module.getModuleno());
            return ResponseResult.success("更新成功");
        }catch (Exception e){
            logger.error("更新失败", e);
            return ResponseResult.fail("更新失败");
        }
    }

    @RequestMapping("/prop/mddata")
    public String gridList(String code,Integer id) {
        return configService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
    }
}
