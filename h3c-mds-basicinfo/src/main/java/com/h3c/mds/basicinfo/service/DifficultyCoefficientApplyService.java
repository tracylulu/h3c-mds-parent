package com.h3c.mds.basicinfo.service;

import java.util.List;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_Item_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_DifficultyCoefficient_PROCESS;


public interface DifficultyCoefficientApplyService {
	/**
	 * 保存
	 * @param diffApply
	 * @param lstAdd
	 * @param lstEdit
	 * @param lstDel
	 */
	public void Save(IBDS_DifficultyCoefficient_APPLY diffApply, IBDS_DifficultyCoefficient_PROCESS diffProcess,List<IBDS_DifficultyCoefficient_Item_APPLY> lstAll);
	
	/**
	 * 验证
	 * @param diffApply
	 * @param lstAdd
	 * @param lstEdit
	 * @param lstDel
	 */
	public void validateApply(IBDS_DifficultyCoefficient_APPLY diffApply,List<IBDS_DifficultyCoefficient_Item_APPLY> lstAll);
	
	/**
	 * 获取提示消息
	 * @param codeList
	 */
	public String getTipMsg(String proCode,String hardCode);
	
}
