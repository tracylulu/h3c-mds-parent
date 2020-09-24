package com.h3c.mds.product.web.controller;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.product.entity.IBDS_ColunmConfig;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.ProductView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ProductService;
import com.h3c.mds.product.service.ProductViewService;
import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.flowable.service.FileLogService;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;
import com.h3c.mds.utils.MailUtils;
import com.h3c.mds.utils.common.*;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private IBDS_ProductService productService;
    @Autowired
    private IBDS_ColunmConfigService configService;
    @Autowired
    private ProductViewService productViewService;
    @Autowired
	private OperationLogUtils<IBDS_Product> optLogUtils;
	@Autowired
	private CheckUtils checkUtils;
	@Autowired
	private SearchParamUtils searchParamUtils;

    @RequestMapping(value="/data/ppdata")
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
        searchMap.put("id",id);
        searchMap.put("type", type);
        searchMap.put("searchParas", searchParas);
        searchMap.put("projectStatus", projectStatus);
        
        searchMap=searchParamUtils.setSearchParamFromIPMT(type, searchMap, id);
        
        List<ProductView> list =  productViewService.getDataList(searchMap);
        return type != null && type.equals("PL") ? EasyUIJSONUtils.list2EasyUiTreeGrid_open(list)
                : EasyUIJSONUtils.list2EasyUiTreeGrid_close(list);
    }

    @RequestMapping(value="/data/ppadd",produces="text/html;charset=utf-8")
    public ResponseResult create(IBDS_Product product){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Product");
    		para.put("column", "product");
    		para.put("value", product.getProduct());    		

    		String msg = checkUtils.repeatCheck(para, "研发产品中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
    		
            product.setStatus("1");
            product.setCreateDate(new Date());
            product.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
            product.setModifyDate(new Date());
            product.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            productService.create(product);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(null, product, product.getProductno());
            return ResponseResult.success("新增成功");
        }catch (Exception e){
            logger.error("新增失败", e);
            return ResponseResult.fail("新增失败");
        }
    }

    @RequestMapping(value="/data/ppedit",produces="text/html;charset=utf-8")
    public ResponseResult update(IBDS_Product product){
        try {
        	// 校验名称是否重复
    		Map<String, String> para = new HashMap<>();
    		para.put("tableName", "IBDS_Product");
    		para.put("column", "product");
    		para.put("value", product.getProduct());
    		para.put("isEdit", "True");
    		para.put("Key", "ID");
    		para.put("KeyValue", product.getId().toString());

    		String msg = checkUtils.repeatCheck(para, "研发产品中文名称");
    		if (msg != null && msg != "") {
    			return ResponseResult.fail(msg);
    		}
        	IBDS_Product bfe =configService.selectByPrimaryKey(product.getId(),product.getProductno());
            product.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
            product.setModifyDate(new Date());
            productService.update(product);
            // 添加操作日志			
         	optLogUtils.RecordOpearteLog(bfe, product, product.getProductno());
            return ResponseResult.success("更新成功");
        }catch (Exception e){
            logger.error("更新失败", e);
            return ResponseResult.fail("更新失败");
        }
    }

    @RequestMapping("/prop/ppdata")
    public String gridList(String code,Integer id) {
        return configService.buildPropertygrid(code,id);/* Common公用方法 传入对应的service,会自动查找该层下selectByCode方法 返回类型必须是Map<String, String> */
    }
    
    
}
