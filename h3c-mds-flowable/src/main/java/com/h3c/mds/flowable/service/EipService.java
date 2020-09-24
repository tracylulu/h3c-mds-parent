package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.IbdsEip;

public interface EipService {

	public void syncEip(String appName, String docunId, String authorId, String authorName, String nodeName,
			String processId, String url, String applicationUrl, String addUserId, String addUserName, boolean end);

	// 异步调用同步eip接口
	public void sendAsyncMsgToIflow(IbdsEip ibdsEip, String userId);

	// 向eip临时表写入数据
	public void saveAsyncMsgToDb(IbdsEip ibdsEip);

	public IbdsEip getEipByDocunId(String docunId);

	/**
	 * 
	 * @param applyNo
	 * @return l20095, j00250
	 */
	public String getEndUserIdList(String applyNo);

	public String getDocunId(String applyNo);

	/**
	 * 
	 * @param appName
	 *            项目名称 比如 项目编码
	 * @param docunId
	 * @param authorId
	 *            申请者域账号
	 * @param authorName
	 *            申请者姓名
	 * @param nodeName
	 *            节点名称 比如项目经理审核
	 * @param processId
	 *            申请单号
	 * @param url
	 * @param applicationUrl
	 *            需要跳转的url 和 邮箱跳转的url一样
	 * @param addUserId
	 *            当前处理人域账号
	 * @param addUserName
	 *            当前处理人姓名
	 * @return
	 */
	public IbdsEip buildEipEntity(String appName, String docunId, String authorId, String authorName, String nodeName,
			String processId, String url, String applicationUrl, String addUserId, String addUserName, boolean end);

}
