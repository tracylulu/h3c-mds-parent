package com.h3c.mds.product.web.controller;

import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.SubSystemView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_SubSystemService;
import com.h3c.mds.product.service.SubSystemViewService;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.common.*;
import com.h3c.mds.product.common.OperationLogUtils;
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
public class SubSystemController {

    private static final Logger logger = LoggerFactory.getLogger(SubSystemController.class);

    @Autowired
    private IBDS_ColunmConfigService configService;
    @Autowired
    private IBDS_SubSystemService subSystemService;
    @Autowired
    private SubSystemViewService subSystemViewService;
    @Autowired
	private OperationLogUtils<IBDS_SubSystem> optLogUtils;
	@Autowired
	private CheckUtils checkUtils;
	@Autowired
	private SearchParamUtils searchParamUtils;

    @RequestMapping("/data/ssdata")
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
        
        List<SubSystemView> list =  subSystemViewService.getDataList(searchMap);
        return type != null && type.equals("PR") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(list)
                : EasyUIJSONUtils.list2EasyUiTreeGrid_close(list);
    }

    @RequestMapping(value="/data/ssadd",produces="text/html;charset=utf-8")
    public ResponseResult create(IBDS_SubSystem subSystem){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Sub_System");
    		para.put("column", "SUBSYSTEM");
    		para.put("value", subSystem.getSubsystem());    		

    		String msg = checkUtils.repeatCheck(para, "子系统中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
            subSystem.setStatus("1");
            subSystem.setCreatedDate(new Date());
            subSystem.setCreatedUser((String) SecurityUtils.getSubject().getPrincipal());
            subSystem.setModifyData(new Date());
            subSystem.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            subSystemService.create(subSystem);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(null, subSystem, subSystem.getSubsystemno());
            return ResponseResult.success("新增成功");
        }catch (Exception e){
            logger.error("新增失败", e);
            return ResponseResult.fail("新增失败");
        }
    }

    @RequestMapping(value="/data/ssedit",produces="text/html;charset=utf-8")
    public ResponseResult update(IBDS_SubSystem subSystem){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Sub_System");
    		para.put("column", "SUBSYSTEM");
    		para.put("value", subSystem.getSubsystem());    
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", subSystem.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "子系统中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
    		
        	IBDS_SubSystem bfe =configService.selectByPrimaryKey(subSystem.getId(),subSystem.getSubsystemno());
            subSystem.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            subSystem.setModifyData(new Date());
            subSystemService.update(subSystem);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(bfe, subSystem, subSystem.getSubsystemno());
            return ResponseResult.success("更新成功");
        }catch (Exception e){
            logger.error("更新失败", e);
            return ResponseResult.fail("更新失败");
        }
    }

    @RequestMapping("/prop/ssdata")
    public String gridList(String code,Integer id) {
        return configService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
    }
}
