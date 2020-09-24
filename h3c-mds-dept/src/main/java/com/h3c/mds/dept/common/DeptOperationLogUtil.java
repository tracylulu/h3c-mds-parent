package com.h3c.mds.dept.common;

import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.dept.entity.IBDS_Dept_OperationLog;
import com.h3c.mds.dept.service.IbdsDeptOperationLogService;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.BeanUtils;
import com.h3c.mds.utils.CommonsThreadCache;
import com.h3c.mds.utils.entity.BeanChangeContent;

@Component
public class DeptOperationLogUtil<T> {
	
	@Autowired
	private IbdsDeptOperationLogService deptOptLogService;

	private void saveLog(BeanChangeContent<T> result, String code) {
		//CommonsThreadCache.setCurrentOperateType("system");
		// 添加操作日志
		IBDS_Dept_OperationLog optLog = new IBDS_Dept_OperationLog();
		optLog.setCode(code);
		optLog.setOpttype(result.changeType.toString());
		optLog.setOldvalue(result.bef == null ? "" : new JSONObject(result.bef).toString());
		optLog.setNewvalue(result.aft == null ? "" : new JSONObject(result.aft).toString());
		optLog.setOperator(UserUtils.getCurrentUserId());
		optLog.setOpttime(new Date());

		deptOptLogService.saveLog(optLog);
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
	//修改sonarqube上的漏洞：方法名不符合lowerCamelCase命名风格
	public void recordOpearteLog(T bef, T aft, String code) {
		// 获取字段修改记录
		BeanChangeContent<T> result = BeanUtils.getChange(bef, aft);

		saveLog(result, code);
	}

}
