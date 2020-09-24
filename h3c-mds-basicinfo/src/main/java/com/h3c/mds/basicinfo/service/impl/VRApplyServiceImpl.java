package com.h3c.mds.basicinfo.service.impl;

import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLY;
import com.h3c.mds.basicinfo.entity.IBDS_VR_APPLYExample;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.dao.IBDS_VR_APPLYMapper;
import com.h3c.mds.basicinfo.dao.IBDS_VR_PROCESSMapper;
import com.h3c.mds.basicinfo.service.VRApplyService;
import com.h3c.mds.basicinfo.service.VRProcessService;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_ReleaseExample;
import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.entity.IBDS_VersionExample;
import com.h3c.mds.product.entity.IBDS_VersionExample.Criteria;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.product.service.IBDS_VersionService;
import com.mchange.v1.util.CollectionUtils;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.h3c.mds.basicinfo.service.BaseObjectApplyService;

@Service
public class VRApplyServiceImpl implements VRApplyService {
	private static final Logger logger = LoggerFactory.getLogger(VRApplyServiceImpl.class);
	@Autowired
	private IBDS_VR_APPLYMapper vrApplyMapper;
	@Autowired
	private IBDS_VR_PROCESSMapper vrProcessMapper;
	@Autowired
	private IBDS_VersionService versionService;
	@Autowired
	private IBDS_ReleaseService releaseService;
	@Autowired
	private BaseObjectApplyService baseObjectApplyService;
	@Autowired
	private VRProcessService processService;

	/**
	 * 保存草稿
	 */
	@Override
	@Transactional
	public int insertOrUpdate(String code, IBDS_VR_APPLY vrApply, IBDS_VR_PROCESS vrProcess) {
		int count = 0;
		try {
			if (StringUtil.isEmpty(code)) {
				IBDS_VR_APPLYExample example=new IBDS_VR_APPLYExample();
				IBDS_VR_APPLYExample.Criteria cirteria=example.createCriteria();
				cirteria.andProcessCodeEqualTo(vrApply.getProcessCode());				
				List<IBDS_VR_APPLY> lst=vrApplyMapper.selectByExample(example);
				
				if(lst!=null&&lst.size()>0) {
					String maxCode=processService.getMaxCode();
					vrApply.setProcessCode(maxCode);
					vrProcess.setApplyCode(maxCode);
				}	
				vrApply.setCreator((String)SecurityUtils.getSubject().getPrincipal());
				vrApply.setCreatetime(new Date());
				vrApply.setModifier((String)SecurityUtils.getSubject().getPrincipal());
				vrApply.setModifytime(new Date());
				
				vrProcess.setCreatetime(new Date());
				vrProcess.setCreator((String)SecurityUtils.getSubject().getPrincipal());
				vrProcess.setModifier((String)SecurityUtils.getSubject().getPrincipal());
				vrProcess.setModifytime(new Date());
				count = vrApplyMapper.insertSelectiveBackID(vrApply);
				vrProcessMapper.insertSelectiveBackID(vrProcess);
			} else {
				if(StringUtils.isBlank(vrApply.getNewpv())) {
					vrApply.setNewpv("");
					vrApply.setVersionnewno("");
					vrApply.setVersionnew("");
					vrApply.setEngversionnew("");
				}
				
				if(StringUtils.isBlank(vrApply.getModpv())) {
					vrApply.setModpv("");
					vrApply.setVersionoldno("");
					vrApply.setVersionold("");
					vrApply.setEngversionold("");
					vrApply.setVersionnow("");
					vrApply.setEngversionnow("");					
				}
				
				if(StringUtils.isBlank(vrApply.getDelpv())) {
					vrApply.setDelpv("");
					vrApply.setVersiondelno("");
					vrApply.setVersiondel("");
					vrApply.setEngversiondel("");
				}
				
				if(StringUtils.isBlank(vrApply.getNewpr())) {
					vrApply.setNewpr("");
					vrApply.setReleasenewno("");
					vrApply.setReleasenew("");
					vrApply.setEngreleasenew("");
					vrApply.setPdtno("");
					vrApply.setReleasenoSoftware("");
				}
				
				if(StringUtils.isBlank(vrApply.getModpr())) {
					vrApply.setModpr("");
					vrApply.setReleaseoldno("");
					vrApply.setReleaseold("");
					vrApply.setEngreleaseold("");
					vrApply.setReleasenow("");
					vrApply.setEngreleasenow("");
					vrApply.setReleasenoSoftwarenow("");
				}
				
				if(StringUtils.isBlank(vrApply.getDelpr())) {
					vrApply.setDelpr("");
					vrApply.setReleasedelno("");
					vrApply.setReleasedel("");
					vrApply.setEngreleasedel("");
				}
				
				vrApply.setModifier((String)SecurityUtils.getSubject().getPrincipal());
				vrApply.setModifytime(new Date());

				vrProcess.setModifier((String)SecurityUtils.getSubject().getPrincipal());
				vrProcess.setModifytime(new Date());
				count = vrApplyMapper.updateByPrimaryKeySelective(vrApply);
				vrProcessMapper.updateByPrimaryKeySelective(vrProcess);
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("保存草稿错误");
		}

		return count;
	}

	@Override
	@Transactional(readOnly = true)
	public void validateApply(IBDS_VR_APPLY vrApply) {
		if (StringUtils.isEmpty(vrApply.getPlipmtno())) {
			throw new FlowableException("请选择IPMT！");
		}
		if (StringUtils.isEmpty(vrApply.getProdlineno())) {
			throw new FlowableException("请选择产品线！");
		}
		if (StringUtils.isEmpty(vrApply.getProductno())) {
			throw new FlowableException("请选择产品！");
		}
		validateV(vrApply);
		validateR(vrApply);
	}

	/**
	 * 验证V版本信息
	 * 
	 * @param vrApply
	 */
	public void validateV(IBDS_VR_APPLY vrApply) {
		// 验证新增是否存在（在途，删除），
		if (StringUtils.isNotBlank(vrApply.getNewpv()) && "1".equals(vrApply.getNewpv())) {
			if (StringUtils.isEmpty(vrApply.getVersionnew())) {
				throw new FlowableException("要新增产品V级中文名称不能为空！");
			}
			if (StringUtils.isEmpty(vrApply.getEngversionnew())) {
				throw new FlowableException("要新增产品V级英文名称不能为空！");
			}

			// 校验V名称是否重复
			ValidateVName(vrApply.getVersionnew(),"", "要新增产品V级中文名称在系统中已存在！");

			// 验证中文名称是重复
			validateByName("VersionNew", vrApply.getVersionnew(), "VersionNow", vrApply.getVersionnew(),
					"在途流程中已存在【" + vrApply.getVersionnew() + "】V级中文名称！");
			// 验证英文名称是否重复
			validateByName("engVersionNew", vrApply.getEngversionnew(), "engVersionNow", vrApply.getEngversionnew(),
					"在途流程中已存在【" + vrApply.getVersionnew() + "】V级英文名称！");

		}

		// 验证修改是否在途或删除，不为空
		if (StringUtils.isNotBlank(vrApply.getModpv()) && "1".equals(vrApply.getModpv())) {
			if (StringUtils.isEmpty(vrApply.getVersionnow())) {
				throw new FlowableException("要修改产品V级新中文名称不能为空！");
			}
			if (StringUtils.isEmpty(vrApply.getEngversionnow())) {
				throw new FlowableException("要修改产品V级新英文名称不能为空！");
			}
			// 验证编码是否在途
			validateByCode("VersionOldNo", vrApply.getVersionoldno(),
					"产品编码【" + vrApply.getVersionoldno() + "】已经有在途申请单，不能提交！");
			//验证R级以下是否有在途流程
			baseObjectApplyService.validateVRIntransit("v", vrApply.getVersionoldno(), "产品编码【" + vrApply.getVersionoldno() + "】R级以下在途申请单，不能提交！");

			// 校验V名称是否重复
			ValidateVName(vrApply.getVersionnow(),vrApply.getVersionoldno(), "要修改产品V级新中文名称在系统中已存在！");
			
			//验证此V版本是否有删除在途流程
			validateByCode("VersionDelNo", vrApply.getVersionoldno(),
					"产品编码【" + vrApply.getVersionoldno() + "】已经有在途申请单，不能提交！");

			validateByName("VersionNew", vrApply.getVersionnow(), "VersionNow", vrApply.getVersionnow(),
					"在途流程中已存在【" + vrApply.getVersionnow() + "】V级中文名称！");

			validateByName("engVersionNew", vrApply.getEngversionnow(), "engVersionNow", vrApply.getEngversionnow(),
					"在途流程中已存在【\" + vrApply.getEngversionnow() + \"】V级英文名称！");

		}
		// 验证验证编码是否为空
		if (StringUtils.isNotBlank(vrApply.getDelpv()) && "1".equals(vrApply.getDelpv())) {
			if (StringUtils.isEmpty(vrApply.getVersiondelno())) {
				throw new FlowableException("请选择需要删除的产品V级项目！");
			}
			// 验证编码是否在途
			validateByCode("VersionDelNo", vrApply.getVersiondelno(),
					"产品编码【" + vrApply.getVersiondelno() + "】已经有在途申请单，不能提交！");
			// 验证编码是否存在修改在途
			validateByCode("VersionOldNo", vrApply.getVersiondelno(),
					"产品编码【" + vrApply.getVersiondelno() + "】已经有在途申请单，不能提交！");
		}
		
		//修改和失效的编码不能相同
		if(StringUtils.isNotBlank(vrApply.getModpv()) && "1".equals(vrApply.getModpv())
				&&StringUtils.isNotBlank(vrApply.getDelpv()) && "1".equals(vrApply.getDelpv())) {
			if(vrApply.getVersiondelno().equals(vrApply.getVersionoldno())) {
				throw new FlowableException("要修改产品V级不能和要删除的V级产品不能为同一产品！");
			}
		}
		
		if(StringUtils.isBlank(vrApply.getNewpv())&&StringUtils.isBlank(vrApply.getModpv())&&StringUtils.isBlank(vrApply.getDelpv())
				&&StringUtils.isBlank(vrApply.getNewpr())&&StringUtils.isBlank(vrApply.getModpr())&&StringUtils.isBlank(vrApply.getDelpr())){
			throw new FlowableException("请填写您要修改的内容！");
		}
	}

	/**
	 * 验证R版本信息
	 * 
	 * @param vrApply
	 */
	public void validateR(IBDS_VR_APPLY vrApply) {
		// 验证新增是否存在（在途，删除），
		if (StringUtils.isNotBlank(vrApply.getNewpr()) && "1".equals(vrApply.getNewpr())) {
			// 没有选择所属V默认
			if (StringUtils.isEmpty(vrApply.getVersionno()) && StringUtils.isBlank(vrApply.getNewpv())) {
				throw new FlowableException("请选择新增产品R级所属的产品V级！");
			}
			if (StringUtils.isEmpty(vrApply.getReleasenew())) {
				throw new FlowableException("要新增产品R级中文名称不能为空！");
			}
			if (StringUtils.isEmpty(vrApply.getEngreleasenew())) {
				throw new FlowableException("要新增产品R级英文名称不能为空！");
			}

			// 校验R版本名称
			ValidateRName(vrApply.getReleasenew(),"", "要新增产品R级中文名称在系统中已存在！");

			// 验证中文名称是重复
			validateByName("ReleaseNew", vrApply.getReleasenew(), "ReleaseNow", vrApply.getReleasenew(),
					"在途流程中已存在【" + vrApply.getReleasenew() + "】R级中文名称！");
			// 验证英文名称是否重复
			validateByName("engReleaseNew", vrApply.getEngreleasenew(), "engReleaseNow", vrApply.getEngreleasenew(),
					"在途流程中已存在【" + vrApply.getEngreleasenew() + "】R级英文名称！");
			if(StringUtils.isNotBlank(vrApply.getVersionno())) {
				validateByCode("VersionDelNo", vrApply.getVersionno(),
						"产品编码【" + vrApply.getVersionno() + "】已经有在途申请单执行删除，不能提交！");
			}
		}

		// 验证修改是否在途或删除，不为空
		if (StringUtils.isNotBlank(vrApply.getModpr()) && "1".equals(vrApply.getModpr())) {
			if (StringUtils.isEmpty(vrApply.getReleasenow())) {
				throw new FlowableException("要修改的产品R级中文名称不能为空！");
			}
			if (StringUtils.isEmpty(vrApply.getReleasenow())) {
				throw new FlowableException("要修改的产品R级英文名称不能为空！");
			}
			
			// 验证编码是否在途
			if(StringUtils.isNotBlank(vrApply.getVersionno())) {				
				validateByCode("VersionDelNo", vrApply.getVersionno(),
						"产品编码【" + vrApply.getVersionno() + "】已经有在途申请单执行删除，不能提交！");
			}		
			                 
			validateByCode("ReleaseOldNo", vrApply.getReleaseoldno(),
					"产品编码【" + vrApply.getReleaseoldno() + "】已经有在途申请单，不能提交！");
			
			//验证R级以下是否有在途流程
			baseObjectApplyService.validateVRIntransit("r", vrApply.getReleaseoldno(), "产品编码【" + vrApply.getReleaseoldno() + "】R级以下在途申请单，不能提交！");

			
			//验证编码是否存在删除
			validateByCode("ReleaseDelNo", vrApply.getReleaseoldno(),
					"产品编码【" + vrApply.getReleaseoldno() + "】已经有在途申请单，不能提交！");

			// 校验R版本名称
			ValidateRName(vrApply.getReleasenow(),vrApply.getReleaseoldno(), "要修改的产品R级中文名称在系统中已存在！");

			// 验证中文名称是否重复
			validateByName("ReleaseNew", vrApply.getReleasenow(), "ReleaseNow", vrApply.getReleasenow(),
					"在途流程中已存在【" + vrApply.getReleasenow() + "】R级中文名称！");
			// 验证英文名称是否重复
			validateByName("engReleaseNew", vrApply.getEngreleasenow(), "engReleaseNow", vrApply.getEngreleasenow(),
					"在途流程中已存在【" + vrApply.getEngreleasenow() + "】R级英文名称！");

		}
		// 验证验证编码是否为空
		if (StringUtils.isNotBlank(vrApply.getDelpr()) && "1".equals(vrApply.getDelpr())) {
			if (StringUtils.isEmpty(vrApply.getReleasedelno())) {
				throw new FlowableException("请选择需要删除的产品V级项目！");
			}
			
			validateByCode("ReleaseOldNo", vrApply.getReleasedelno(),
					"产品编码【" + vrApply.getReleasedelno() + "】已经有在途申请单，不能提交！");
			
			validateByCode("ReleaseDelNo", vrApply.getReleasedelno(),
					"产品编码【" + vrApply.getReleasedelno() + "】已经有在途申请单，不能提交！");
			// 验证编码是否在途
			if(StringUtils.isNotBlank(vrApply.getVersionno())) {
				validateByCode("VersionDelNo", vrApply.getVersionno(),
					"产品编码【" + vrApply.getVersionno() + "】已经有在途申请单执行删除操作，不能提交！");
			}
		}
		
		if(StringUtils.isNotBlank(vrApply.getDelpr()) && "1".equals(vrApply.getDelpr())
				&&StringUtils.isNotBlank(vrApply.getModpr()) && "1".equals(vrApply.getModpr())) {
			if(vrApply.getReleasedelno().equals(vrApply.getReleaseoldno())) {
				throw new FlowableException("要修改产品R级不能和要删除的R级产品不能为同一产品！");
			}
		}
	}

	/**
	 * 验证名称是否有重复
	 * 
	 * @param newColumn
	 * @param newColumnValue
	 * @param nowColumn
	 * @param nowColumnValue
	 * @param msg
	 */
	public void validateByName(String newColumn, String newColumnValue, String nowColumn, String nowColumnValue,
			String msg) {
		Map<String, String> param = new HashMap<>();
		param.put("newColumn", newColumn);
		param.put("newColumnValue", newColumnValue);
		param.put("nowColumn", nowColumn);
		param.put("nowColumnValue", nowColumnValue);
		int countEN = vrApplyMapper.getVZTCountBymap(param);
		if (countEN > 0) {
			throw new FlowableException(msg);
		}
	}

	/**
	 * 通过编码验证是否在途
	 * 
	 * @param column
	 * @param value
	 * @param msg
	 */	
	public void validateByCode(String column, String value, String msg) {
		Map<String, String> param = new HashMap<>();
		param.put("column", column);
		param.put("value", value);
		Integer count = vrApplyMapper.getZTCountByCode(param);
		if (count > 0) {
			throw new FlowableException(msg);
		}
	}

	/**
	 * 校验R版本名称
	 * 
	 * @param name
	 * @param msg
	 */
	public void ValidateRName(String name,String code, String msg) {
		IBDS_ReleaseExample example = new IBDS_ReleaseExample();
		IBDS_ReleaseExample.Criteria cirtecia = example.createCriteria();
		cirtecia.andReleaseEqualTo(name);
		if(StringUtils.isNotBlank(code)) {
			cirtecia.andReleasenoNotEqualTo(code);
		}		
		cirtecia.andStatusEqualTo("1");
		List<IBDS_Release> lstReleases = releaseService.getByExample(example);
		if (lstReleases != null && lstReleases.size() > 0) {
			throw new FlowableException(msg);
		}
	}

	/**
	 * 校验V版本名称
	 * 
	 * @param name
	 * @param msg
	 */
	public void ValidateVName(String name,String code, String msg) {
		IBDS_VersionExample example = new IBDS_VersionExample();
		Criteria cirteria = example.createCriteria();
		cirteria.andVersionEqualTo(name);
		if(StringUtils.isNotBlank(code)) {
			cirteria.andVersionnoNotEqualTo(code);
		}
		cirteria.andStatusEqualTo("1");
		List<IBDS_Version> lstVersions = versionService.getByExample(example);
		if (lstVersions != null && lstVersions.size() > 0) {
			throw new FlowableException(msg);
		}
	}
	
	@Override
	public void validateVRIntransit(String type, String value, String msg) {
		Map<String, String> param = new HashMap<>();
		param.put("type", type);
		param.put("value", value);
		Integer count = vrApplyMapper.validateVRIntransit(param);
		if (count > 0) {
			throw new FlowableException(msg);
		}
	}
}
