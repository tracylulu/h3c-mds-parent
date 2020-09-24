package com.h3c.mds.utils.common;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.product.service.CheckUtilsService;

@Component
public class CheckUtils{ //<T,TExample,TService>
	
	@Autowired
	private CheckUtilsService checkUtilsService;
	
	public String repeatCheck(Map<String,String> map,String columnName) {		
		String msg="";
		int count= checkUtilsService.query(map);		
		if(count>0) {
			//重复
			msg="【"+columnName+"】不能重复！";
		}
		
		return msg;
	}
	


}
