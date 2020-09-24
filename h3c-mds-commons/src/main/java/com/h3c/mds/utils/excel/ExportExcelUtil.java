package com.h3c.mds.utils.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcelUtil<T> {

	// 2007 版本以上 最大支持1048576行
	public final static String EXCEl_FILE_2007 = "2007";
	// 2003 版本 最大支持65536 行
	public final static String EXCEL_FILE_2003 = "2003";

	/**
	 * 通过版本类判断是
	 *
	 * @param sheetName
	 *            表格标题名
	 * @param headers
	 *            表格头部标题集合
	 * @param dataset
	 *            数据集合
	 * @param out
	 *            输出流
	 * @param version
	 *            指定生成Excel文件的版本
	 */
	public void exportExcel(String sheetName, String[] headers, String[] column, Collection<T> dataset, OutputStream out,
			String version) {
		Workbook workbook = null;
		if (StringUtils.isBlank(version) || EXCEL_FILE_2003.equals(version.trim())) {
			workbook = new HSSFWorkbook();
		} else {
			workbook = new XSSFWorkbook();
		}
		exportExcel(workbook, sheetName, headers, column, dataset, out, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 通用Excel导出方法,利用反射机制遍历对象的所有字段，将数据写入Excel文件中 <br>
	 * 此版本生成2007以上版本的文件 (文件后缀：xlsx)
	 *
	 * @param sheetName
	 *            表格标题名
	 * @param headers
	 *            表格头部标题集合
	 *  @param column
	 *    对应头部实体字段           
	 * @param dataset
	 *            需要显示的数据集合,集合中一定要放置符合JavaBean风格的类的对象。此方法支持的
	 *            JavaBean属性的数据类型有基本数据类型及String,Date
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 * @param pattern
	 *            如果有时间数据，设定输出格式。默认为"yyyy-MM-dd hh:mm:ss"
	 */
	public void exportExcel(Workbook workbook, String sheetName, String[] headers,String[] column, Collection<T> dataset,
			OutputStream out, String pattern) {
		// 生成一个表格
		Sheet sheet = workbook.createSheet(sheetName);
		// 设置表格默认列宽度为15个字节
		// 设置宽度
		// sheet.setDefaultColumnWidth(20);
		sheet.setDefaultColumnWidth(18);
		// sheet.trackAllColumnsForAutoSizing();
		// sheet.autoSizeColumn(0);
		// 生成一个样式
		CellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);// 内容居中
		// 生成一个字体
		Font font = workbook.createFont();
		font.setFontName("宋体");
		font.setBold(true);// 加粗
		font.setFontHeightInPoints((short) 11);
		// 把字体应用到当前的样式
		style.setFont(font);
		// 生成并设置另一个样式
		CellStyle style2 = workbook.createCellStyle();
		style2.setAlignment(HorizontalAlignment.LEFT);
		// 生成另一个字体
		Font font2 = workbook.createFont();
		// font2.setBold(true);//加粗
		// 把字体应用到当前的样式
		style2.setFont(font2);
		// 产生表格标题行
		Row row = sheet.createRow(0);
		Cell cellHeader;
		for (int i = 0; i < headers.length; i++) {
			cellHeader = row.createCell(i);
			cellHeader.setCellStyle(style);
			cellHeader.setCellValue(headers[i]);
		}

		// 遍历集合数据，产生数据行
		Iterator<T> it = dataset.iterator();
		int index = 0;
		T t;
		Field[] fields;
		Field field;
		// HSSFRichTextString richString;
		Pattern p = Pattern.compile("^//d+(//.//d+)?$");
		Matcher matcher;
		String fieldName;
		String getMethodName;
		Cell cell;
		Class tCls;
		Method getMethod;
		Object value;
		String textValue;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		while (it.hasNext()) {
			index++;
			row = sheet.createRow(index);
			t = (T) it.next();
			// 利用反射，根据JavaBean属性的先后顺序，动态调用getXxx()方法得到属性值
			//fields = t.getClass().getDeclaredFields();
			for (int i = 0; i < column.length; i++) {				
				//field = fields[i];
				fieldName =column[i];
				cell = row.createCell(i);
				cell.setCellStyle(style2);
				//getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				getMethodName = "get" + fieldName;
				try {
					tCls = t.getClass();
					getMethod = tCls.getMethod(getMethodName, new Class[] {});
					value = getMethod.invoke(t, new Object[] {});
					// 判断值的类型后进行强制类型转换
					textValue = null;
					if (value instanceof Integer) {
						cell.setCellValue((Integer) value);
					} else if (value instanceof Float) {
						textValue = String.valueOf((Float) value);
						cell.setCellValue(textValue);
					} else if (value instanceof Double) {
						textValue = String.valueOf((Double) value);
						cell.setCellValue(textValue);
					} else if (value instanceof Long) {
						cell.setCellValue((Long) value);
					}
					if (value instanceof Boolean) {
						textValue = "是";
						if (!(Boolean) value) {
							textValue = "否";
						}
					} else if (value instanceof Date) {
						textValue = sdf.format((Date) value);
					} else {
						// 其它数据类型都当作字符串简单处理
						if (value != null) {
							textValue = value.toString();
						}
					}
					if (textValue != null) {
						matcher = p.matcher(textValue);
						if (matcher.matches()) {
							// 是数字当作double处理
							cell.setCellValue(Double.parseDouble(textValue));
						} else {
							// richString = new HSSFRichTextString(textValue);
							cell.setCellValue(textValue);
						}
					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}		
		}
		
		  try { 
			  workbook.write(out); 
		  } catch (IOException e) { 
			  e.printStackTrace(); }
		  finally {
			  try {
					// 关闭资源
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		  }
		
	}
	
	/**
	 * 通用Excel导出方法,利用反射机制遍历对象的所有字段，将数据写入Excel文件中 <br>
	 * 此版本生成2007以上版本的文件 (文件后缀：xlsx)
	 *
	 * @param sheetName
	 *            表格标题名
	* @param headers
	 *            表格头部标题集合
	 *  @param column
	 *    对应头部实体字段      
	 * @param dataset
	 *            需要显示的数据集合,集合中一定要放置符合JavaBean风格的类的对象。此方法支持的
	 *            JavaBean属性的数据类型有基本数据类型及String,Date
	 * @param out
	 *            与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
	 * @param pattern
	 *            如果有时间数据，设定输出格式。默认为"yyyy-MM-dd hh:mm:ss"
	 */
	public Workbook exportExcel(Workbook workbook, String sheetName, List<String> headers,List<String> column, Collection<T> dataset,
			 String pattern) {
		// 生成一个表格
		Sheet sheet =createSheetAndtTitle(workbook,sheetName,headers,column);	

		// 生成并设置另一个样式
		CellStyle style2 = workbook.createCellStyle();
		style2.setAlignment(HorizontalAlignment.LEFT);
		// 生成另一个字体
		Font font2 = workbook.createFont();
		// font2.setBold(true);//加粗
		// 把字体应用到当前的样式
		style2.setFont(font2);
		// 产生表格标题行
		Row row ;
		Cell cellHeader;

		// 遍历集合数据，产生数据行
		Iterator<T> it = dataset.iterator();
		int index = 0,sheetIndex=1;
		T t;
		Field[] fields;
		Field field;
		// HSSFRichTextString richString;
		Pattern p = Pattern.compile("^//d+(//.//d+)?$");
		Matcher matcher;
		String fieldName;
		String getMethodName;
		Cell cell;
		Class tCls;
		Method getMethod;
		Object value;
		String textValue;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		while (it.hasNext()) {
			if(index==100000) {
				index=0;
				sheet =createSheetAndtTitle(workbook,sheetName+String.valueOf(sheetIndex) ,headers,column);
				sheetIndex++;
			}
			index++;
			row = sheet.createRow(index);
			t = (T) it.next();
			// 利用反射，根据JavaBean属性的先后顺序，动态调用getXxx()方法得到属性值
			//fields = t.getClass().getDeclaredFields();

			for (int i = 0; i < column.size(); i++) {				
				//field = fields[i];
				fieldName =column.get(i);
				cell = row.createCell(i);
				cell.setCellStyle(style2);
				getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				//getMethodName = "get" + fieldName;
				try {
					tCls = t.getClass();
					getMethod = tCls.getMethod(getMethodName, new Class[] {});
					value = getMethod.invoke(t, new Object[] {});
					// 判断值的类型后进行强制类型转换
					textValue = null;
					if("ifofficialnaming".equals(fieldName)) {
						if("1".equals(value)) textValue="是";
						if("0".equals(value)) textValue="否";
						
						cell.setCellValue(StringUtils.isNotBlank(textValue)?textValue:"");
						continue;
					}
					if (value instanceof Integer) {
						cell.setCellValue((Integer) value);
					} else if (value instanceof Float) {
						textValue = String.valueOf((Float) value);
						cell.setCellValue(textValue);
					} else if (value instanceof Double) {
						textValue = String.valueOf((Double) value);
						cell.setCellValue(textValue);
					} else if (value instanceof Long) {
						cell.setCellValue((Long) value);
					}
					if (value instanceof Boolean) {
						textValue = "是";
						if (!(Boolean) value) {
							textValue = "否";
						}
					} else if (value instanceof Date) {
						textValue = sdf.format((Date) value);
					} else {
						// 其它数据类型都当作字符串简单处理
						if (value != null) {
							textValue = value.toString();
						}
					}
					if (textValue != null) {
						matcher = p.matcher(textValue);
						if (matcher.matches()) {
							// 是数字当作double处理
							cell.setCellValue(Double.parseDouble(textValue));
						} else {
							// richString = new HSSFRichTextString(textValue);
							cell.setCellValue(textValue);
						}
					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}		
		}
//		try {
//			workbook.write(out);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			
//		}
		
		/*
		 * try { // 关闭资源 workbook.close(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		return workbook;
	}
	
	private Sheet createSheetAndtTitle(Workbook workbook, String sheetName, List<String> headers, List<String> column) {
		// 生成一个表格
		Sheet sheet = workbook.createSheet(sheetName);
		// 设置表格默认列宽度为15个字节
		// 设置宽度
		// sheet.setDefaultColumnWidth(20);
		sheet.setDefaultColumnWidth(18);
		// sheet.trackAllColumnsForAutoSizing();
		// sheet.autoSizeColumn(0);
		// 生成一个样式
		CellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);// 内容居中
		// 生成一个字体
		Font font = workbook.createFont();
		font.setFontName("宋体");
		font.setBold(true);// 加粗
		font.setFontHeightInPoints((short) 11);
		// 把字体应用到当前的样式
		style.setFont(font);
		// 生成并设置另一个样式
		CellStyle style2 = workbook.createCellStyle();
		style2.setAlignment(HorizontalAlignment.LEFT);
		// 生成另一个字体
		Font font2 = workbook.createFont();
		// font2.setBold(true);//加粗
		// 把字体应用到当前的样式
		style2.setFont(font2);
		// 产生表格标题行
		Row row = sheet.createRow(0);
		Cell cellHeader;

		for (int i = 0; i < headers.size(); i++) {
			String _header = headers.get(i);
			if (column.get(i).contains("no") && !headers.get(i).contains("内码"))
				_header = _header + "内码";
			cellHeader = row.createCell(i);
			cellHeader.setCellStyle(style);
			cellHeader.setCellValue(_header);
		}

		return sheet;
	}
	
	public void getExcel(String fileName, String title, List<String> headers,List<String> column, Collection<T> dataset,  String pattern) {
        try {
        	// 获取模板
    		String path = "/excel/模板.xlsx" ;
    		FileInputStream template = new FileInputStream(path);
    		XSSFWorkbook workBook = new XSSFWorkbook(template);
    		// 获取第一个sheet页
    		Sheet sheet = workBook.getSheetAt(0);
    		//Sheet sheet =createSheetAndtTitle(workbook,sheetName,headers,column);	

    		// 生成并设置另一个样式
    		
    		// font2.setBold(true);//加粗
    		// 把字体应用到当前的样式
    	
    		// 产生表格标题行
    		Row row = sheet.createRow(0);
    		Cell cellHeader;

    		// 遍历集合数据，产生数据行
    		Iterator<T> it = dataset.iterator();
    		int index = 0,sheetIndex=1;
    		T t;
    		Field[] fields;
    		Field field;
    		// HSSFRichTextString richString;
    		Pattern p = Pattern.compile("^//d+(//.//d+)?$");
    		Matcher matcher;
    		String fieldName;
    		String getMethodName;
    		Cell cell;
    		Class tCls;
    		Method getMethod;
    		Object value;
    		String textValue;
    		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    		while (it.hasNext()) {
    			if(index==100000) {
    				index=0;
    				sheet =workBook.getSheetAt(sheetIndex);
    				sheetIndex++;
    			}
    			index++;
    			row = sheet.createRow(index);
    			t = (T) it.next();
    			// 利用反射，根据JavaBean属性的先后顺序，动态调用getXxx()方法得到属性值
    			//fields = t.getClass().getDeclaredFields();

    			for (int i = 0; i < column.size(); i++) {				
    				//field = fields[i];
    				fieldName =column.get(i);
    				cell = row.createCell(i);
    				//cell.setCellStyle(style2);
    				getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    				//getMethodName = "get" + fieldName;
    				try {
    					tCls = t.getClass();
    					getMethod = tCls.getMethod(getMethodName, new Class[] {});
    					value = getMethod.invoke(t, new Object[] {});
    					// 判断值的类型后进行强制类型转换
    					textValue = null;
    					if("ifofficialnaming".equals(fieldName)) {
    						if("1".equals(value)) textValue="是";
    						if("0".equals(value)) textValue="否";
    						
    						cell.setCellValue(StringUtils.isNotBlank(textValue)?textValue:"");
    						continue;
    					}
    					if (value instanceof Integer) {
    						cell.setCellValue((Integer) value);
    					} else if (value instanceof Float) {
    						textValue = String.valueOf((Float) value);
    						cell.setCellValue(textValue);
    					} else if (value instanceof Double) {
    						textValue = String.valueOf((Double) value);
    						cell.setCellValue(textValue);
    					} else if (value instanceof Long) {
    						cell.setCellValue((Long) value);
    					}
    					if (value instanceof Boolean) {
    						textValue = "是";
    						if (!(Boolean) value) {
    							textValue = "否";
    						}
    					} else if (value instanceof Date) {
    						textValue = sdf.format((Date) value);
    					} else {
    						// 其它数据类型都当作字符串简单处理
    						if (value != null) {
    							textValue = value.toString();
    						}
    					}
    					if (textValue != null) {
    						matcher = p.matcher(textValue);
    						if (matcher.matches()) {
    							// 是数字当作double处理
    							cell.setCellValue(Double.parseDouble(textValue));
    						} else {
    							// richString = new HSSFRichTextString(textValue);
    							cell.setCellValue(textValue);
    						}
    					}
    				} catch (SecurityException e) {
    					e.printStackTrace();
    				} catch (NoSuchMethodException e) {
    					e.printStackTrace();
    				} catch (IllegalArgumentException e) {
    					e.printStackTrace();
    				} catch (IllegalAccessException e) {
    					e.printStackTrace();
    				} catch (InvocationTargetException e) {
    					e.printStackTrace();
    				}
    			}		
    		}
//    		try {
//    			workbook.write(out);
//    		} catch (IOException e) {
//    			e.printStackTrace();
//    		} finally {
//    			
//    		}
    		
    		
			/*
			 * try { // 关闭资源 //workbook.close(); } catch (IOException e) {
			 * e.printStackTrace(); }
			 */
    		 
    		
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
        	
    }

}