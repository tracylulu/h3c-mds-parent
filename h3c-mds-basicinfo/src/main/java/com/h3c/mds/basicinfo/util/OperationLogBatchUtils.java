package com.h3c.mds.basicinfo.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.product.entity.IBDS_OperationLog;
import com.h3c.mds.product.service.IBDS_OperationLogService;
import com.h3c.mds.utils.BeanUtils;
import com.h3c.mds.utils.entity.BeanChangeContent;

@Component
public class OperationLogBatchUtils<T> {

	@Autowired
	private IBDS_OperationLogService optLogService;

	/**
	 * 批量新增操作日志
	 * 
	 * @param bef
	 * @param aft
	 * @param param
	 */
	public void LstOperateLog(List<T> bef, List<T> aft, Map<String, Object> param) {
		List<IBDS_OperationLog> optLogLst = new ArrayList<IBDS_OperationLog>();
		int i = 0;
		if (param.containsKey("type") && param.containsValue("ADD")) {
			for (T logAft : aft) {
				BeanChangeContent<T> result = BeanUtils.getChange(null, logAft);
				IBDS_OperationLog optLog = new IBDS_OperationLog();
				optLog.setCode(param.get("code").toString().split(",")[i]);
				optLog.setOpttype(result.changeType.toString());
				optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
				optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
				optLog.setOperator((String) SecurityUtils.getSubject().getPrincipal());
				optLog.setOpttime(new Date());
				optLogLst.add(optLog);
				i++;
			}
		} else {
			for (T logBef : bef) {
				BeanChangeContent<T> result = BeanUtils.getChange(logBef, aft.get(i));
				IBDS_OperationLog optLog = new IBDS_OperationLog();
				optLog.setCode(param.get("code").toString().split(",")[i]);
				optLog.setOpttype(result.changeType.toString());
				optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
				optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
				optLog.setOperator((String) SecurityUtils.getSubject().getPrincipal());
				optLog.setOpttime(new Date());
				optLogLst.add(optLog);
				i++;
			}
		}
		optLogService.insertSelectiveBatch(optLogLst);
	}

	/**
	 * 批量新增操作日志
	 * 
	 * @param bef
	 * @param aft
	 * @param param
	 */
	public void LstOperateLog(List<T> bef, List<T> aft, Map<String, Object> param, String modifyUser) {
		List<IBDS_OperationLog> optLogLst = new ArrayList<IBDS_OperationLog>();
		int i = 0;
		if (param.containsKey("type") && param.containsValue("ADD")) {
			for (T logAft : aft) {
				BeanChangeContent<T> result = BeanUtils.getChange(null, logAft);
				IBDS_OperationLog optLog = new IBDS_OperationLog();
				optLog.setCode(param.get("code").toString().split(",")[i]);
				optLog.setOpttype(result.changeType.toString());
				optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
				optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
				optLog.setOperator(modifyUser);
				optLog.setOpttime(new Date());
				optLogLst.add(optLog);
				i++;
			}
		} else {
			for (T logBef : bef) {
				BeanChangeContent<T> result = BeanUtils.getChange(logBef, aft.get(i));
				IBDS_OperationLog optLog = new IBDS_OperationLog();
				optLog.setCode(param.get("code").toString().split(",")[i]);
				optLog.setOpttype(result.changeType.toString());
				optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
				optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
				optLog.setOperator(modifyUser);
				optLog.setOpttime(new Date());
				optLogLst.add(optLog);
				i++;
			}
		}
		optLogService.insertSelectiveBatch(optLogLst);
	}

	/**
	 * 单个添加操作日志
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
}
