package com.h3c.mds.product.common;

import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.product.entity.IBDS_OperationLog;
import com.h3c.mds.product.service.IBDS_OperationLogService;
import com.h3c.mds.utils.BeanUtils;
import com.h3c.mds.utils.entity.BeanChangeContent;

@Component
public class OperationLogUtils<T> {

	@Autowired
	private IBDS_OperationLogService optLogService;

	private void saveLog(BeanChangeContent<T> result, String code) {
		// 添加操作日志
		IBDS_OperationLog optLog = new IBDS_OperationLog();
		optLog.setCode(code);
		optLog.setOpttype(result.changeType.toString());
		optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
		optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
		optLog.setOperator((String) SecurityUtils.getSubject().getPrincipal());
		optLog.setOpttime(new Date());

		optLogService.insertSelective(optLog);
	}

	private void saveLog(BeanChangeContent<T> result, String code, String modifyUser) {
		// 添加操作日志
		IBDS_OperationLog optLog = new IBDS_OperationLog();
		optLog.setCode(code);
		optLog.setOpttype(result.changeType.toString());
		optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
		optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
		optLog.setOperator(modifyUser);
		optLog.setOpttime(new Date());

		optLogService.insertSelective(optLog);
	}

	/**
	 * 添加操作日志
	 * 
	 * @param bef
	 *            修改前 （新增 为null）
	 * @param aft
	 *            修改后 (删除为null)
	 * @param code
	 *            产品编码
	 */
	public void RecordOpearteLog(T bef, T aft, String code) {
		// 获取字段修改记录
		BeanChangeContent<T> result = BeanUtils.getChange(bef, aft);

		saveLog(result, code);
	}

	/**
	 * 添加操作日志
	 * 
	 * @param bef
	 *            修改前 （新增 为null）
	 * @param aft
	 *            修改后 (删除为null)
	 * @param code
	 *            产品编码
	 */
	public void RecordOpearteLog(T bef, T aft, String code, String modifyUser) {
		// 获取字段修改记录
		BeanChangeContent<T> result = BeanUtils.getChange(bef, aft);

		saveLog(result, code, modifyUser);
	}
}
