package com.h3c.mds.flowable.excel;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.flowable.util.SpringContextUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductCodeExcelReader extends AbstractExcelReader{



    public ProductCodeExcelReader() {
    }

    public ProductCodeExcelReader(File file) throws IOException {
        super(file);
    }

    public ProductCodeExcelReader(InputStream inputStream,String fileName) throws IOException {
        super(inputStream,fileName);
    }

    public List<ProductCodeApply> parseExcel(){

        List<ProductCodeApply> list = new ArrayList<>();
        while(hasNextRow()){
            //先往下走一行，去除标题行
            Row row = nextRow();
            ProductCodeApply apply = generateProductCode(row);
            //模板bom编码数量
            Integer bomCount = Integer.parseInt(readCellValue(row.getCell(9)));
            //bom编码
            String bomCode = readCellValue(row.getCell(10));
            String bomDesc = readCellValue(row.getCell(11));
            for(int i = 0;i < bomCount-1;i++){
                Row nextRow = nextRow();
                bomCode += (";"+readCellValue(nextRow.getCell(10)));
                bomDesc += (";"+readCellValue(nextRow.getCell(11)));
            }
            apply.setBomCode(bomCode);
            apply.setBomDesc(bomDesc);
            list.add(apply);
        }
        return list;
    }

    public ProductCodeApply generateProductCode(Row row){
        //TODO 先写死测试，后续修改
        ProductCodeApply productCodeApply = new ProductCodeApply();
        //产品线
        productCodeApply.setProdline(readCellValue(row.getCell(1)));
        //产品线编码
        productCodeApply.setProdlineNo(readCellValue(row.getCell(2)));
        //产品族名称
        productCodeApply.setProduct(readCellValue(row.getCell(3)));
        //产品族编码
        productCodeApply.setProductNo(readCellValue(row.getCell(4)));
        //产品编码
        productCodeApply.setProductCode(readCellValue(row.getCell(5)));
        //产品中文名称
        productCodeApply.setProductNameCn(readCellValue(row.getCell(6)));
        //产品英文名称
        productCodeApply.setProductNameEn(readCellValue(row.getCell(7)));
        //pdt名称
        //productCodeApply.setPdtName(readCellValue(row.getCell(8)));
        //备注
        productCodeApply.setNote(readCellValue(row.getCell(12)));
        ProcessConfigItemService itemService = (ProcessConfigItemService) SpringContextUtils.getBean(ProcessConfigItemService.class);
        List<ProcessConfigItem> items = itemService.getByContent(readCellValue(row.getCell(8)));
        if(!CollectionUtils.isEmpty(items)){
            productCodeApply.setPdtId(items.get(0).getId());
            productCodeApply.setPdtName(items.get(0).getContent());
        }
        return productCodeApply;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\sys2403\\Desktop\\数据初始化\\新增产品编导入模板V1.1.xlsx");
        ProductCodeExcelReader reader = new ProductCodeExcelReader(file);
        List<ProductCodeApply> list = reader.parseExcel();
        System.out.println(list);
    }
}
