package com.h3c.mds.flowable.util;

import java.util.Date;

import com.h3c.mds.flowable.entity.IbdsEip;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.utils.TimeUtil;

public class EipUtil {
	
	
	
	public static IbdsEip buildProjectCodeEip(String docunId, String authorId, String authorName, String nodeName, String processId,
			 String url, String applicationUrl, String addUserId, String addUserName){
		
		IbdsEip eip  = createDefaultEip();
		//项目编码特有的内容
		eip.setSubject("项目编码申请");
		eip.setProcessName("项目编码申请");
		eip.setDocunId(docunId);
		eip.setAuthorId(authorId);
		eip.setAuthorName(authorName);
		eip.setNodeName(nodeName);
		eip.setProcessId(processId);
		eip.setUrl(url);
		eip.setApplicationUrl(applicationUrl);
		eip.setAddUserId(addUserId);
		eip.setAddUserName(addUserName);
		
		handlerEndUserId(eip);
		checkIbdsEip(eip);
		return eip;
	}
	
	public static void handlerEndUserId(IbdsEip eip){
	}
	public static IbdsEip createDefaultEip(){
		IbdsEip  eip = new IbdsEip();
		eip.setSystemId("IBDS");
//		eip.setAppId();
		eip.setTimesTamp(TimeUtil.getStringTime2(new Date()));
		eip.setApplyTime(TimeUtil.getStringTime1(new Date()));
		eip.setStatus(EipConst.STATUS_APPROVING);
		eip.setIsBatch(EipConst.BATCH_FALSE);
		eip.setIsSms(EipConst.SMS_NO);
		eip.setAcceptType(EipConst.ACCEPTTYPE_PC);
		// TODO
		eip.setNodeId(System.currentTimeMillis() + "");
		return eip;
	}
	
	
	public static void checkIbdsEip(IbdsEip eip){
		if(eip != null){
			
		}else{
			throw new NullPointerException("eip 为空");
		}
	}
}
