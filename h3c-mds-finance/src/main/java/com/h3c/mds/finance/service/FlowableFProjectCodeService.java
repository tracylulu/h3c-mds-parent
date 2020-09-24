package com.h3c.mds.finance.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeHis;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.FProjectProductRelHis;

/**
 * 外部接口，供流程写入数据
 * @author l20095
 *
 */
public interface FlowableFProjectCodeService {

	/**
	 * 新增项目编码
	 * @param FProjectCode
	 * @return
	 */
	public int addProjectCode(FProjectCode FProjectCode , List<FProjectProductRel> fProjectProductRelList);
	
	
	/**
	 * 更新项目编码
	 * @param FProjectCode
	 * @param fProjectProductRelList
	 * @return
	 */
	public int updateProjectCode(FProjectCode FProjectCode , List<FProjectProductRel> fProjectProductRelList); 
	
	/**
	 * 记录项目编码历史数据表
	 * @param FProjectCode
	 * @param fProjectProductRelList
	 * @return
	 */
	public int handleHisProjectCode(FProjectCodeHis fProjectCodeHis , List<FProjectProductRelHis> fProjectProductRelHisList);
	
	/**
	 * 停用项目编码
	 * @param FProjectCode
	 * @return
	 */
	public int delProjectCode(FProjectCode FProjectCode, String remark,  String assignPoint);  
	
	/**
	 * 通过项目编码获取关联的产品编码数据
	 * @param projectCode
	 * @return
	 */
	public List<FProjectProductRel> getFProjectProductRelListByProjectCode(String projectCode);
	/**
	 * 通过项目编码内码获取项目编码
	 * @param fProjno
	 * @return
	 */
	public FProjectCode getFProjectCodeByCode(String fProjno);
	
	/**
	 * 通过id获取项目编码
	 * @param id
	 * @return
	 */
	public FProjectCode getFProjectCodeById(Integer id);
	
	/**
	 * 通过项目编码名称获取项目编码
	 * @param projName
	 * @return
	 */
	public FProjectCode getFProjectCodeByName(String projName);
	
	
	/**
	 * 通过B版本获取项目编码
	 * @param bversionNo
	 * @return
	 */
	public FProjectCode getFProjectCodeByBversonNo(String bversionNo);
	
	/**
	 * 通过R版本获取项目编码，并且此项目编码不包含B版本，只关联R版本
	 * @param releaseNo
	 * @return
	 */
	public FProjectCode getFProjectCodeByReleaseNo(String releaseNo);
	
	
	/**
	 * 查询出项目编码
	 * @param page
	 * @param rows
	 * @return
	 */
	PageInfo<Map<String, Object>> findByPage(Integer page, Integer rows, String searchArgs);
	
	/**
	 * 查出项目编码对应的产品
	 * @param projNo
	 * @return
	 */
	public List<Map<String, Object>> findProductByProjNo(String projNo);
}
