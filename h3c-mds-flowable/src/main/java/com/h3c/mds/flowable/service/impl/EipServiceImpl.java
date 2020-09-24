package com.h3c.mds.flowable.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.h3c.mds.flowable.dao.IbdsEipMapper;
import com.h3c.mds.flowable.entity.IbdsEip;
import com.h3c.mds.flowable.entity.IbdsEipExample;
import com.h3c.mds.flowable.entity.ProcessLog;
import com.h3c.mds.flowable.exception.EipException;
import com.h3c.mds.flowable.executor.EipThreadExecutor;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.HttpClientUtil;
import com.h3c.mds.utils.TimeUtil;

@Service
public class EipServiceImpl implements EipService {

	@Value("${eip.url}")
	private String eipUrl;
	@Value("${eip.sysid}")
	private String sysid;
	@Value("${eip.syspwd}")
	private String syspwd;
	@Autowired
	private IbdsEipMapper eipMapper;
	@Autowired
	private ProcessLogService processLogService;
	@Autowired
	private EipThreadExecutor eipExecutor;

	@Override
	public void syncEip(String appName, String docunId, String authorId, String authorName, String nodeName,
			String processId, String url, String applicationUrl, String addUserId, String addUserName, boolean end) {

		IbdsEip eip = buildEipEntity(appName, docunId, authorId, authorName, nodeName, processId, url, applicationUrl,
				addUserId, addUserName, end);
		sendAsyncMsgToIflow(eip, UserUtils.getCurrentUserId());
		saveAsyncMsgToDb(eip);
	}

	@Override
	public void sendAsyncMsgToIflow(IbdsEip eip, String userId) {
		eipExecutor.sendEip(eip, userId, syspwd, sysid, eipUrl);
	}

	@Override
	public void saveAsyncMsgToDb(IbdsEip eip) {
		if (getEipByApplyNo(eip.getDocunId()) == null) {
			eipMapper.insertSelective(eip);
		} else {
			updateEip(eip);
		}
	}

	public void updateEip(IbdsEip eip) {
		IbdsEipExample example = new IbdsEipExample();
		IbdsEipExample.Criteria criteria = example.createCriteria();
		criteria.andDocunIdEqualTo(eip.getDocunId());
		eipMapper.updateByExample(eip, example);
	}

	public IbdsEip getEipByDocunId(String docunId) {
		IbdsEipExample example = new IbdsEipExample();
		IbdsEipExample.Criteria criteria = example.createCriteria();
		criteria.andDocunIdEqualTo(docunId);
		List<IbdsEip> eipList = eipMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(eipList)) {
			return eipList.get(0);
		} else {
			return null;
		}
	}

	public IbdsEip getEipByApplyNo(String applyNo) {
		IbdsEipExample example = new IbdsEipExample();
		IbdsEipExample.Criteria criteria = example.createCriteria();
		criteria.andDocunIdEqualTo(applyNo);
		List<IbdsEip> eipList = eipMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(eipList)) {
			return eipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public String getEndUserIdList(String applyNo) {
		String endUsers = "";
		List<ProcessLog> processLogList = processLogService.getByProcessCodeForEip(applyNo);
		if (CollectionUtils.isNotEmpty(processLogList)) {
			for (int i = 0; i < processLogList.size(); i++) {
				endUsers += processLogList.get(i).getCheckAccount() + ",";
			}
			endUsers = endUsers.substring(0, endUsers.length() - 1);
		}
		return endUsers;
	}

	@Override
	public String getDocunId(String applyNo) {
		String docunId = "";
		IbdsEip eip = getEipByApplyNo(applyNo);
		if (eip != null) {
			docunId = eip.getDocunId();
		} else {
			docunId = applyNo + "_" + System.currentTimeMillis();
		}
		return docunId;
	}

	@Override
	public IbdsEip buildEipEntity(String appName, String docunId, String authorId, String authorName, String nodeName,
			String processId, String url, String applicationUrl, String addUserId, String addUserName, boolean end) {
		IbdsEip eip = createDefaultEip(end);
		// 项目编码特有的内容
		eip.setSubject(appName);
		eip.setProcessName(appName);
		eip.setDocunId(docunId);
		if (StringUtils.isNotBlank(authorId)) {
			eip.setAuthorId(authorId.toLowerCase());
		} else {
			eip.setAuthorId("");
		}
		eip.setAuthorName(authorName);
		eip.setNodeName(nodeName);
		eip.setNodeId(nodeName);
		eip.setProcessId(processId);
		eip.setUrl(url);
		eip.setApplicationUrl(applicationUrl);
		if (StringUtils.isNoneBlank(addUserId)) {
			eip.setAddUserId(addUserId.toLowerCase());
		} else {
			eip.setAddUserId("");
		}
		eip.setAddUserName(addUserName);

		handlerEndUserId(eip);
		checkIbdsEip(eip, end);
		return eip;
	}

	public void handlerEndUserId(IbdsEip eip) {
		eip.setEndUserId(getEndUserIdList(eip.getDocunId()));
	}

	public IbdsEip createDefaultEip(boolean end) {
		IbdsEip eip = new IbdsEip();
		eip.setSystemId("IBDS");
		// eip.setAppId();
		eip.setTimesTamp(TimeUtil.getStringTime2(new Date()));
		eip.setApplyTime(TimeUtil.getStringTime1(new Date()));
		if(end){
			eip.setStatus(EipConst.STATUS_APPROVED);
		}else{
			eip.setStatus(EipConst.STATUS_APPROVING);
		}
		eip.setIsBatch(EipConst.BATCH_FALSE);
		eip.setIsSms(EipConst.SMS_NO);
		eip.setAcceptType(EipConst.ACCEPTTYPE_PC);
		// TODO
		// eip.setNodeId(System.currentTimeMillis() + "");
		return eip;
	}

	public static void checkIbdsEip(IbdsEip eip, boolean end) {
		if (eip != null) {
			if (StringUtils.isBlank(eip.getSubject())) {
				throw new EipException("主题为空");
			} else if (StringUtils.isBlank(eip.getAddUserId())) {
				throw new EipException("申请人id（域账号）为空");
			} else if (StringUtils.isBlank(eip.getAddUserName())) {
				throw new EipException("申请人姓名（中文名）为空");
			} else if (StringUtils.isBlank(eip.getApplyTime())) {
				throw new EipException("申请时间为空");
			} else if (StringUtils.isBlank(eip.getAuthorId()) && !end) {
				throw new EipException("当前处理人id（被委托人）（域账号）为空");
			} else if (StringUtils.isBlank(eip.getAuthorName()) && !end) {
				throw new EipException("当前处理人（被委托人）姓名为空");
			} else if (StringUtils.isBlank(eip.getUrl())) {
				throw new EipException("PC端文档访问链接为空");
			} else if (StringUtils.isBlank(eip.getSystemId())) {
				throw new EipException("系统id为空");
			} else if (StringUtils.isBlank(eip.getDocunId())) {
				throw new EipException("文档id为空");
			} else if (StringUtils.isBlank(eip.getProcessId())) {
				throw new EipException("申请单号为空");
			} else if (StringUtils.isBlank(eip.getProcessName())) {
				throw new EipException("流程名称为空");
			} else if (StringUtils.isBlank(eip.getStatus())) {
				throw new EipException("状态为空");
			} else if (StringUtils.isBlank(eip.getEndUserId())) {
				throw new EipException("已处理用户id为空");
			} else if (StringUtils.isBlank(eip.getNodeId())) {
				throw new EipException("节点id为空");
			} else if (StringUtils.isBlank(eip.getNodeName())) {
				throw new EipException("节点名称为空");
			} else if (StringUtils.isBlank(eip.getTimesTamp())) {
				throw new EipException("时间戳为空");
			}
		} else {
			throw new NullPointerException("eip 为空");
		}
	}

}
