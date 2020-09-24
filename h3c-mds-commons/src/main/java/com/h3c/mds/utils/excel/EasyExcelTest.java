package com.h3c.mds.utils.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.support.ExcelTypeEnum;


public class EasyExcelTest {

	
	public static void main(String[] args) throws Exception {
//        writeExcel();
		/*Field[] fields = ExcelProjectCodeModel.class.getDeclaredFields();
	    for (Field field : fields) {
//	        Annotation[] allFAnnos= field.getAnnotations();
//	        Annotation[] deFAnnos = field.getDeclaredAnnotations();
	    	ExcelProperty subFAnno = field.getAnnotation(ExcelProperty.class);
//	        printAnnotation("allFAnnos",allFAnnos);
//	        printAnnotation("deFAnnos",deFAnnos);
//	        printAnnotation("subFAnno",subFAnno.value());
	    	System.out.println(subFAnno.value()[0]);
	        System.out.println("**************************************************\n");
	    }*/
		
        readExcel();
   }
	private static void printAnnotation(String msg,ExcelProperty... annotations){
        System.out.println("=============="+msg+"======================");
        if(annotations == null){
            System.out.println("Annotation is null");
        }
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println();
    }
   /**
    * 写入Excel
    * 
    * @throws FileNotFoundException
    * @author Lynch
    */
   private static void writeExcel() throws FileNotFoundException {
       List<ExcelModel> excelModelList = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
           ExcelModel excelModel = new ExcelModel();
           excelModel.setAddress("address" + i);
           excelModel.setAge(i + "");
           excelModel.setEmail("email" + i);
           excelModel.setHeigh("heigh" + i);
           excelModel.setLast("last" + i);
           excelModel.setName("name" + i);
           excelModel.setSax("sax" + i);
           excelModelList.add(excelModel);
       }
       
       long beginTime = System.currentTimeMillis();
       OutputStream out = new FileOutputStream("E:/aaa.xlsx");
       EasyExcelUtil.writeExcelWithModel(out, excelModelList, ExcelModel.class, ExcelTypeEnum.XLSX);
       long endTime = System.currentTimeMillis();
       System.out.println(String.format("总共耗时 %s 毫秒", (endTime - beginTime)));
       
       excelModelList = null;
   }

   /**
    * 读取Excel
    * 
    * @throws FileNotFoundException
    * @author Lynch
    */
   private static void readExcel() throws FileNotFoundException {
       try {
           InputStream inputStream=new FileInputStream("E:\\新增项目编码申请模板V1.1.xlsx");
           //读入文件，每一行对应一个 Model，获取 Model 列表
           List<ExcelProjectCodeModel> objectList = EasyExcelUtil.readExcelWithModel(inputStream, ExcelProjectCodeModel.class, ExcelTypeEnum.XLSX);
           for(ExcelProjectCodeModel excelModel: objectList) {
        	   Field[] fields = ExcelProjectCodeModel.class.getDeclaredFields();
       	    for (Field field : fields) {
//       	        Annotation[] allFAnnos= field.getAnnotations();
//       	        Annotation[] deFAnnos = field.getDeclaredAnnotations();
//       	    	excelModel.getClass().get
       	    	ExcelProperty subFAnno = field.getAnnotation(ExcelProperty.class);
//       	        printAnnotation("allFAnnos",allFAnnos);
//       	        printAnnotation("deFAnnos",deFAnnos);
//       	        printAnnotation("subFAnno",subFAnno.value());
       	    	System.out.println(subFAnno.value()[0]);
       	        System.out.println("**************************************************\n");
       	    }
               System.out.println(excelModel);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}