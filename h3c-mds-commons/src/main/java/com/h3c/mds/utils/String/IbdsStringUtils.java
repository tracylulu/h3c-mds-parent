package com.h3c.mds.utils.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class IbdsStringUtils {

	//用；和，分割的字符串拆分
	public static List<String> splitStrBySemiAndComma(String str){
		List<String> resList = new ArrayList<String>();
		if(StringUtils.isNotBlank(str)){
			String [] strArr = str.split(",");
			for(int i = 0; i < strArr.length; i++){
				String[] tmp = strArr[i].split(";");
				if(tmp != null && tmp.length > 0){
					resList.addAll(Arrays.asList(tmp));
				}
			}
		}
		
		return resList;
	}
	
	public static void main(String[] args) {
		String str = "9801A1FR, 9801A1FS, 9801A1FT, 9801A1FU, 9801A1FV, 9801A1FW, 9801A1TJ, 9801A1TK";
		
		List<String> list = splitStrBySemiAndComma(str);
		for(int i = 0;i < list.size(); i++){
			System.out.println(list.get(i).trim());
		}
	}
}
