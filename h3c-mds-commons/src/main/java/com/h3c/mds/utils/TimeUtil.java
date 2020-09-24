package com.h3c.mds.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeUtil {
	
    public static SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static SimpleDateFormat formatter3 = new SimpleDateFormat("yyyyMMdd");

    
    
    public static String getStringTime1(Date date){
    	if(date != null){
    		return formatter1.format(date);    		
    	}else{
    		return "";
    	}
    }
    
    public static String getStringTime2(Date date){
    	if(date != null){
    		return formatter2.format(date);
    		
    	}else{
    		return "";
    	}
    }
    
    public static String getStringDay(Date date){
    	return formatter3.format(date);
    }
    
    
    public static void main(String[] args) {
//		System.out.println(getStringTime1(new Date()));
//		System.out.println(getStringTime2(new Date()));
    	System.out.println(getSysYear());
    	System.out.println(getSysMonth());
	}
    
    
	public static String getSysYear() {
		Calendar date = Calendar.getInstance();
		String year = String.valueOf(date.get(Calendar.YEAR));
		return year;
	}

	public static String getSysMonth() {
		Calendar date = Calendar.getInstance();
		String month = String.valueOf(date.get(Calendar.MONTH) + 1);
		return month;
	}
}
