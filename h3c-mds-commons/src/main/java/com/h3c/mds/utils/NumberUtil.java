package com.h3c.mds.utils;

public class NumberUtil {

	public static boolean isNumeric(String str){
		boolean flag = true;
		try {
			if(Double.valueOf(str) != null){
				flag = true;
			}
		} catch (NumberFormatException e) {
			flag = false;
		}
		return flag;
		
	}
}
