package com.h3c.mds.flowable.executor;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.h3c.mds.flowable.entity.IbdsEip;
import com.h3c.mds.utils.HttpClientUtil;


@Component("eipExecutor")
public class EipThreadExecutor {
	
	@SuppressWarnings("static-access")
	@Async
    public void sendEip(IbdsEip eip, String userId, String syspwd, String sysid, String eipUrl){
		JSONObject json = JSONObject.fromObject(eip);// 将java对象转换为json对象
		String eipJson = json.toString();// 将json对象转换为字符串
		HttpClientUtil httpClient = new HttpClientUtil();
		Map<String, String> headMap = new HashMap<String, String>();
		headMap.put("userId", userId);
		headMap.put("syspwd", syspwd);
		headMap.put("sysid", sysid);
		httpClient.sendHttpPostJsonWithHeader(eipUrl, eipJson, headMap);
    }
}
