package com.h3c.mds.basicinfo.service;

import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;


public interface VRApplyService {
	
	/**
	 * 保存
	 * @param vrApply
	 * @return
	 */
	public int insertOrUpdate(String Code,IBDS_VR_APPLY vrApply, IBDS_VR_PROCESS vrProcess);
	
	/**
	 * 验证
	 * @param vrApply
	 * @return
	 */
	public void validateApply(IBDS_VR_APPLY vrApply);
	
	/**
	 * 验证VR是否在途
	 * 
	 * @param type 类型  v/r
	 * @param value	值
	 * @param msg	错误信息
	 */
	public void validateVRIntransit(String type, String value, String msg);

}
