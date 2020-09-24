package com.h3c.mds.product.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.util.OperationLogBatchUtils;
import com.h3c.mds.product.common.OperationLogUtils;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.service.IBDS_BversionService;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ReleaseService;
import com.h3c.mds.sysmgr.response.ResponseResult;

@RestController
@RequestMapping("/api")
public class DcpApiController {

	@Autowired
	private IBDS_ReleaseService releaseService;

	@Autowired
	private OperationLogUtils<IBDS_Release> optLogUtils;

	@Autowired
	private IBDS_ColunmConfigService colunmConfigService;

	@Autowired
	private IBDS_BversionService ibds_BversionService;

	@Autowired
	private OperationLogBatchUtils<IBDS_Bversion> optLogbversionUtils;

	/**
	 * 提供接口，根据R版本内码修改状态，提供给DCP
	 * 
	 * @param releaseno
	 * @param projectStatus
	 * @returnfa
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/updateProjectStatusByReleaseNo")
	public ResponseResult updateProjectStatusByReleaseno(String releaseno, String projectStatus, Boolean isEditR,
			String bversionLst, String modifyUser, HttpServletResponse response) {
		try {
			if (projectStatus.contains("终止")) {
				projectStatus = "终止";
			}
			// isEditR 为true 更改R 为false 更改bvoxiersionLst对应的B状态
			// 查询更新前的数据
			IBDS_Release bfe = releaseService.selectByCode(releaseno);
			if (bfe == null) {
				return ResponseResult.fail(false, "基础数据平台中不存在该R版本数据");
			}
			// 获取更新的B版本
			List<IBDS_Bversion> bef = new ArrayList<>();
			StringBuilder bversions = new StringBuilder();
			if (bversionLst.contains("R")) {
				bef = ibds_BversionService.getAllBversionByReleaseCode(releaseno);
			} else {
				if (bversionLst.contains(",")) {
					for (String bversionCName : bversionLst.split(",")) {
						if (StringUtil.isNotEmpty(bversionCName)) {
							bversions.append(bversionCName + ",");
						} else {
							bversions.append(bversionLst + ",");
						}
					}
				} else {
					if (StringUtil.isNotEmpty(bversionLst)) {
						bversions.append(bversionLst + ",");
					}

				}
				if (bversions.length() > 0) {
					bef = ibds_BversionService.getBversionByReleaseCodeAndBversion(releaseno, bversions.toString());
				}
			}

			if (isEditR) {
				IBDS_Release release = new IBDS_Release();
				release.setReleaseno(releaseno);
				release.setProjectstatus(projectStatus);
				release.setModifyUser(modifyUser);
				release.setModifyDate(new Date());

				int resCount = releaseService.update(release);

				if (resCount > 0) {

					release.setRelease(bfe.getRelease());

					IBDS_Release befRelease = new IBDS_Release();
					befRelease.setReleaseno(bfe.getReleaseno());
					befRelease.setRelease(bfe.getRelease());
					befRelease.setProjectstatus(bfe.getProjectstatus());
					befRelease.setModifyUser(bfe.getModifyUser());
					befRelease.setModifyDate(bfe.getModifyDate());
					// R版本 记录日志
					optLogUtils.RecordOpearteLog(befRelease, release, release.getReleaseno(), modifyUser);

					// 更新B版本状态
					int bCount = updateBversionProjectStatus(releaseno, projectStatus, bef, bversions.toString(), bfe,
							modifyUser);
					if (bCount > 0) {
						return ResponseResult.success(true, "R版本和B版本项目状态更新成功");
					} else {
						return ResponseResult.success(true, "R版本项目状态更新成功,该R版本下的B版本项目状态更新0条");
					}

				} else {
					return ResponseResult.fail(false, "R版本项目状态更新0条数据");
				}
			} else {
				// 更新B版本状态
				int bCount = updateBversionProjectStatus(releaseno, projectStatus, bef, bversions.toString(), bfe,
						modifyUser);
				if (bCount > 0) {
					return ResponseResult.success(true, "B版本项目状态更新成功");
				} else {
					return ResponseResult.fail(false, "B版本项目状态更新0条数据");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseResult.fail(false, "更新失败" + e.getMessage());
		}
	}

	// 更新B版本
	public int updateBversionProjectStatus(String releaseno, String projectStatus, List<IBDS_Bversion> bef,
			String bversions, IBDS_Release bfe, String modifyUser) {
		// 刷新B版本项目状态
		int bCount = ibds_BversionService.updateByProjectStatusBatch(releaseno, projectStatus, bversions, modifyUser);
		if (bCount > 0) {
			// 拼接日志记录
			List<IBDS_Bversion> lst1 = new ArrayList<>();
			List<IBDS_Bversion> beflst = new ArrayList<>();
			StringBuilder lstStr = new StringBuilder();
			for (IBDS_Bversion ibds_Bversion : bef) {
				IBDS_Bversion bversion = new IBDS_Bversion();
				bversion.setId(ibds_Bversion.getId());
				bversion.setBversioncname(
						(bfe.getRelease() == null ? "" : bfe.getRelease()) + ibds_Bversion.getBversioncname());
				bversion.setReleaseno(releaseno);
				bversion.setProjectstatus(projectStatus);
				bversion.setModifyData(new Date());
				bversion.setModifyUser(modifyUser);
				lstStr.append(ibds_Bversion.getBversionno() + ",");
				lst1.add(bversion);

				// 更改前的
				IBDS_Bversion befBversion = new IBDS_Bversion();
				befBversion.setId(ibds_Bversion.getId());
				befBversion.setBversioncname(
						(bfe.getRelease() == null ? "" : bfe.getRelease()) + ibds_Bversion.getBversioncname());
				befBversion.setReleaseno(ibds_Bversion.getReleaseno());
				befBversion.setProjectstatus(ibds_Bversion.getProjectstatus());
				befBversion.setModifyData(ibds_Bversion.getModifyData());
				befBversion.setModifyUser(ibds_Bversion.getModifyUser());
				beflst.add(befBversion);
			}
			// 批量添加操作日志
			Map<String, Object> param = new HashMap<>();
			param.put("code", lstStr);
			param.put("type", "MODIFY");
			optLogbversionUtils.LstOperateLog(beflst, lst1, param, modifyUser);

		}
		return bCount;
	}
}
