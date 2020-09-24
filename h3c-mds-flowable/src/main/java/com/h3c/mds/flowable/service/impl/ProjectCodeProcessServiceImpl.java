package com.h3c.mds.flowable.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.dao.ProjectCodeProcessMapper;
import com.h3c.mds.flowable.entity.ProjectCodeProcess;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExample;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExample.Criteria;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ProjectCodeProcessService;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IbdsMaxCode;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.product.service.IbdsMaxCodeService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.TimeUtil;

@Service
public class ProjectCodeProcessServiceImpl implements ProjectCodeProcessService {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectCodeProcessServiceImpl.class);
	
//	private static  String APPLY_CODE;
	
	@Autowired
	private ProjectCodeProcessMapper projectCodeProcessMapper;
	
	@Autowired
	private DicService dicService;
	
//	@Autowired
//	private RedisUtil redisUtil;
	
	@Autowired
	private IbdsMaxCodeService ibdsMaxCodeService;
	
	@Autowired
	private UserService userService;
	
	@Override
	public int addProjectCodeProcess(ProjectCodeProcess projectCodeProcess) {
		int successNum = -1;
		try {
			successNum = projectCodeProcessMapper.insertSelective(projectCodeProcess);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出现问题");
		}
		return successNum;
	}

	@Override
	public int updateProjectCodeProcess(ProjectCodeProcess projectCodeProcess) {
		int successNum = -1;
		try {
			/*ProjectCodeProcessExample example = new ProjectCodeProcessExample();
			Criteria criteria = example.createCriteria();
			criteria.andProcessInsIdEqualTo(projectCodeProcess.getProcessInsId());*/
			successNum = projectCodeProcessMapper.updateByPrimaryKeySelective(projectCodeProcess);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出现问题");
		}
		return successNum;
	}

	@Override
	@Transactional(readOnly=true,propagation=Propagation.REQUIRES_NEW)
	public ProjectCodeProcess getProjectCodeProcessByProcessId(String proInsId) {
		ProjectCodeProcess projectCodeProcess = null;
		try {
			ProjectCodeProcessExample example = new ProjectCodeProcessExample();
			Criteria criteria = example.createCriteria();
			criteria.andProcessInsIdEqualTo(proInsId);
			List<ProjectCodeProcess> projectCodeProcessList = projectCodeProcessMapper.selectByExample(example);
			
			if(projectCodeProcessList != null && projectCodeProcessList.size() == 1){
				projectCodeProcess =  projectCodeProcessList.get(0);
			}else{
				LOG.error("流程实例id" + proInsId + "没有数据");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出现问题");
		}
		return projectCodeProcess;
	}
	
	@Override
	public ProjectCodeProcess getProjectCodeProcessByProcessId1(String proInsId) {
		ProjectCodeProcess projectCodeProcess = null;
		try {
			ProjectCodeProcessExample example = new ProjectCodeProcessExample();
			Criteria criteria = example.createCriteria();
			criteria.andProcessInsIdEqualTo(proInsId);
			List<ProjectCodeProcess> projectCodeProcessList = projectCodeProcessMapper.selectByExample(example);
			
			if(projectCodeProcessList != null && projectCodeProcessList.size() == 1){
				projectCodeProcess =  projectCodeProcessList.get(0);
			}else{
				LOG.error("流程实例id" + proInsId + "没有数据");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出现问题");
		}
		return projectCodeProcess;
	}

	@Override
	public ProjectCodeProcess getProjectCodeProcessByApplyNo(String applyNo){
		ProjectCodeProcess projectCodeProcess = null;
		try {
			ProjectCodeProcessExample example = new ProjectCodeProcessExample();
			Criteria criteria = example.createCriteria();
			criteria.andApplyNoEqualTo(applyNo);
			List<ProjectCodeProcess> projectCodeProcessList = projectCodeProcessMapper.selectByExample(example);
			
			if(projectCodeProcessList != null && projectCodeProcessList.size() == 1){
				projectCodeProcess =  projectCodeProcessList.get(0);
			}else{
//				LOG.error("申请单号" + applyNo + "没有数据");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出现问题");
		}
		return projectCodeProcess;
	}
	@Override
	public PageInfo<ProjectCodeProcess> findByPage(Integer page, Integer rows, String searchStr) {
		  if(page == null || page < 1){
	            page = 1;
	        }
	        if(rows == null || rows <15){
	            rows = 15;
	        }
	        PageHelper.startPage(page, rows);
	        List<ProjectCodeProcess> list = projectCodeProcessMapper.selectByExample(null);
	        PageInfo<ProjectCodeProcess> pageInfo = new PageInfo<ProjectCodeProcess>(list);
	        return pageInfo;
	}

	@Override
	public int delProjectCodeProcessByApplyNo(String applyNo) {
		int successNum = -1;
		ProjectCodeProcessExample example = new ProjectCodeProcessExample();
		Criteria criteria = example.createCriteria();
		criteria.andApplyNoEqualTo(applyNo);
		successNum = projectCodeProcessMapper.deleteByExample(example);
		return successNum;
	}
	

	@Override
	public PageInfo<Map<String, Object>> findProjectCodeByApplyNo(Integer page, Integer rows, String searchParams){
//		PageHelper.startPage(page, rows);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("applyNo", null);
		param.put("searchParams", searchParams);
		param.put("page", (page - 1) * rows);
		param.put("rows", rows);
		int total = projectCodeProcessMapper.findProjectCodeByApplyNoCount(param);
		List<Map<String, Object>> res = transDicCodeToDicValue(projectCodeProcessMapper.findProjectCodeByApplyNo(param));
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(res);
		pageInfo.setTotal(total);
		return pageInfo;
	}
	
	@Override
	public List<Map<String, Object>> findProjectCodeByApplyer(Map<String, Object> param){
		return transDicCodeToDicValue(projectCodeProcessMapper.findProjectCodeByApplyer(param));
	}
	
	@Override
	public List<Map<String, Object>> findProjectCodeByStatus(Map<String, Object> param){
		return transDicCodeToDicValue(projectCodeProcessMapper.findProjectCodeByStatus(param));
	}
	
	@Override
	public List<Map<String, Object>> findProjectCodeByProcess(Map<String, Object> param){
		// TODO 这个要把没有走完的流程查出来处理，应该要加判断
		return transDicCodeToDicValue(projectCodeProcessMapper.findProjectCodeByProcess(param));
	}
	
	@Override
	public List<Map<String, Object>> findProjectCodeByCurHandler(Map<String, Object> param){
		return transDicCodeToDicValue(projectCodeProcessMapper.findProjectCodeByCurHandler(param));
	}
	
	
	private List<Map<String, Object>> transDicCodeToDicValue(List<Map<String, Object>> list){
		Map<String, String> param = new HashMap<String, String>();
		//部门对应的码是20
		param.put("typeCode", "20");
		List<IBDS_Dic> deptList = dicService.getDic(param);
		Map<String, String> deptMap = new HashMap<String, String>();
		
		for(IBDS_Dic dic : deptList){
			deptMap.put(dic.getDicValue(), dic.getDicName());
		}
		for(Map<String, Object> map : list){
			//转换部门字典
			if(map.get("dept") != null){
				map.put("dept", deptMap.get(map.get("dept")));
			}
			
			if(map.get("optType") != null){
				if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equalsIgnoreCase(String.valueOf(map.get("optType")))){
					map.put("optType", FlowableConst.PROJECTCODE_OPTTYPE_ADD_VALUE);
				}
			}
			if(map.get("optType") != null){
				if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equalsIgnoreCase(String.valueOf(map.get("optType")))){
					map.put("optType", FlowableConst.PROJECTCODE_OPTTYPE_EDIT_VALUE);
				}
			}
			if(map.get("optType") != null){
				if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equalsIgnoreCase(String.valueOf(map.get("optType")))){
					map.put("optType", FlowableConst.PROJECTCODE_OPTTYPE_DEL_VALUE);
				}
			}
			//当前处理者
			if(map.get("curDeal") != null){
				
				map.put("curDeal", userService.getNameDescByAccount((String)map.get("curDeal")));
			}
			
			//申请人
			
			if(map.get("applyer") != null){
				
				map.put("applyer", userService.getNameDescByAccount((String)map.get("applyer")));
			}
			//转换操作类型字典
		}
		return list;
	}
	
	@PostConstruct
    @Transactional(readOnly = true)
    public void initApplyCode(){
//		String redisKey = RedisConst.APPLYTION_PROJECTCODE_PREFIX + "APPLYNO_" + TimeUtil.getSysYear().substring(2) + "_" + TimeUtil.getSysMonth();
//		if(redisUtil.get(redisKey) == null){
			//取数据库
//			 redisUtil.set(redisKey, value);
//		}
		
		
		
		
		
    }
	
//	@Transactional(readOnly = true)
	@Override
	public  String getMaxCode() {
//		if(StringUtils.isBlank(APPLY_CODE)){
//            initApplyCode();
//        }
//		String redisKey = RedisConst.APPLYTION_PROJECTCODE_PREFIX + "APPLYNO_" + TimeUtil.getSysYear().substring(2) + "_" + TimeUtil.getSysMonth();
//		long val = this.redisUtil.incr(redisKey, 1);
		String prefix = "OBC_" + TimeUtil.getSysYear().substring(2) + "_" + TimeUtil.getSysMonth();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("projectName", "projectCode");
		param.put("prefix", prefix);
		IbdsMaxCode ibdsMaxCode = ibdsMaxCodeService.getIbdsMaxCodeByProjectNameAndPrefix(param);
		
		if(ibdsMaxCode == null){
//			插入
			ibdsMaxCode = new IbdsMaxCode();
			ibdsMaxCode.setProjectName("projectCode");
			ibdsMaxCode.setPrefix(prefix);
			ibdsMaxCode.setCode(1);
			ibdsMaxCodeService.addIbdsMaxCode(ibdsMaxCode);
		}else{
			//自增
			ibdsMaxCode.setCode(ibdsMaxCode.getCode() + 1);
			ibdsMaxCodeService.updateIbdsMaxCode(ibdsMaxCode);
		}
		
//		int val = Integer.parseInt(APPLY_CODE.substring(7, APPLY_CODE.length())) + 1;
		int val = ibdsMaxCode.getCode();
		String valStr = String.valueOf(val);
		String code = "OBC";
		code += TimeUtil.getSysYear().substring(2);

		if (TimeUtil.getSysMonth().length() == 2) {
			code += TimeUtil.getSysMonth();
		} else {
			code += 0;
			code += TimeUtil.getSysMonth();
		}
		
		
		for (int i = 0; i < 3 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;
		return code;
	}
	
	@Override
	public List<ProjectCodeProcess> getZTProjectCodeProcessByProjNumber(String projNum, String status, String applyNo){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("proNumber", projNum);
		param.put("status", status);
		param.put("applyNo", applyNo);
		return projectCodeProcessMapper.getZTProjectCodeProcessByProjNumber(param);
	}
}
