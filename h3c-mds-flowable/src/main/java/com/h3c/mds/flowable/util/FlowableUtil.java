package com.h3c.mds.flowable.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.CommonsThreadCache;

public class FlowableUtil {

	private static final Logger LOG = LoggerFactory.getLogger(FlowableUtil.class);
	
	public static Map<String, Object> buildProductCodeCheckParamAgree(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("checkDate", "processmgnDate");
		param.put("checkPerson", "processmgnSign");
		Map<String, String> subParam = new HashMap<String, String>();
		subParam.put("resultName", "processmgnResult");
		param.put("checkResultForRole", subParam);
		
		param.put("checkResult", "1");
		subParam.put("resultValue", "1");
		CommonsThreadCache.setCurrentOperateType("system");
		LOG.info("FlowableUtil current Thread  set--" + Thread.currentThread().getName() + "--" +  CommonsThreadCache.getCurrentOperateType());
		return param;
	}
	
	public static Map<String, Object> buildProductCodeCheckParamDisagree(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("checkDate", "processmgnDate");
		param.put("checkPerson", "processmgnSign");
		Map<String, String> subParam = new HashMap<String, String>();
		subParam.put("resultName", "processmgnResult");
		param.put("checkResultForRole", subParam);
		
		param.put("checkResult", "2");
		subParam.put("resultValue", "0");
		CommonsThreadCache.setCurrentOperateType("system");
		LOG.info("FlowableUtil  current Thread  set--" + Thread.currentThread().getName() + "--" +  CommonsThreadCache.getCurrentOperateType());
		return param;
	}
	
	public static Map<String, Object> buildPartCodeCheckParamAgree(){

		return buildProductCodeCheckParamAgree();
	}
	
	public static Map<String, Object> buildPartCodeCheckParamDisagree(){
		return buildProductCodeCheckParamDisagree();
	}
}
