package com.h3c.mds.flowable.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.h3c.mds.utils.CommonsThreadCache;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.flowable.dao.PartCodeProcessMapper;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartCodeProcessExample;
import com.h3c.mds.flowable.entity.PartCodeProcessExt;
import com.h3c.mds.flowable.entity.PartProcessAndPartCodeWrapper;
import com.h3c.mds.flowable.entity.PdmPartView;
import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.PartCodeApplyService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.ProductCodeApplyService;
import com.h3c.mds.flowable.strategy.Strategy;
import com.h3c.mds.flowable.strategy.StrategyFactory;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.TimeUtil;

/**
 * Part编码流程服务实现类
 */
@Service
public class PartCodeProcessServiceImpl implements PartCodeProcessService {

    private static final Logger logger = LoggerFactory.getLogger(PartCodeProcessServiceImpl.class);

    @Autowired
    private PartCodeProcessMapper partCodeProcessMapper;
    @Autowired
    private PartCodeApplyService partCodeApplyService;
    @Autowired
    private FProdLineService fProdLineService;
    @Autowired
    private FprodService fprodService;
    @Autowired
    private FProductCodeService fProductCodeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private ProcessLogService processLogService;
    @Autowired
    private UserService userService;
    @Autowired
    private MailInfoService mailInfoService;
    @Autowired
    private UserRoleRelationService userRoleRelationService;
    @Autowired
    private ProductCodeApplyService productCodeApplyService;
    @Autowired
    private DicService dicService;
    @Autowired
    private EipService eipService;
    @Value("${sso.main.url}")
    private String siteMainUrl;
    @Override
    @Transactional(readOnly = true)
    public PageInfo<PartCodeProcess> findByPage(Integer page, Integer rows, Map<String,Object> param) {
        if(page == null || page < 1){
            page = 1;
        }
        if(rows == null || rows <15){
            rows = 15;
        }
        PageHelper.startPage(page, rows);
        List<PartCodeProcess> list = partCodeProcessMapper.findByPage(param);
        PageInfo<PartCodeProcess> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    @Transactional(readOnly = true)
    public PartCodeProcessExt getByIdCasecadeSub(Integer id) {
        PartCodeProcessExt processExt = getExtById(id);
        if(processExt != null){
            List<PartCodeApply> list = partCodeApplyService.getByProcessCode(processExt.getApplyCode());
            if(!CollectionUtils.isEmpty(list)){
                for(PartCodeApply apply : list){
                    if(apply.getProdlineId() != null){
                        FProdLine fProdLine = fProdLineService.getById(apply.getProdlineId());
                        if(fProdLine != null) apply.setProdlineName(fProdLine.getProdlineDesc());
                    }
                    if(apply.getProdId() != null){
                        FProd fProd = fprodService.getById(apply.getProdId());
                        if(fProd != null) apply.setProductName(fProd.getProdName());
                    }
                    if(apply.getFprodCodeId() != null){
                        FProductCode fProductCode = fProductCodeService.getById(apply.getFprodCodeId());
                        if(fProductCode != null) apply.setProductNameCn(fProductCode.getProductNameCn());
                    }
                    //转换商业模式
                }
//                translateDic(list);
            }
            processExt.setApplys(list);
        }
        return processExt;
    }

    private void translateDic(List<PartCodeApply> list){
    	Map<String, String> businessModelMap = getBusinessModel();
		
    	if(!CollectionUtils.isEmpty(list)){
    		for(int i = 0; i < list.size(); i++){
    			list.get(i).setBusinessModel(businessModelMap.get(list.get(i).getBusinessModel()));
    		}
    	}
    }
    
    private Map<String, String> getBusinessModel(){
    	Map<String, String> resMap = new HashMap<String, String>();
    	Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", "34");
		List<IBDS_Dic> businessModelList = dicService.getDic(param);
		if(!CollectionUtils.isEmpty(businessModelList)){
			for(int i = 0; i < businessModelList.size(); i++){
				resMap.put( businessModelList.get(i).getDicValue(),businessModelList.get(i).getDicName());
			}
		}
		return resMap;
    }
    @Override
    @Transactional(readOnly = true)
    public PartCodeProcessExt getExtById(Integer id){
        return partCodeProcessMapper.getExtById(id);
    }

    @Override
    @Transactional
    public void create(PartCodeProcessExt processExt) {

    }

    @Override
    @Transactional
    public void update(PartCodeProcessExt processExt) {
        //processExt.setCreateDate(new Date());
        //processExt.setCreateUser(UserUtils.getCurrentUserId());
        processExt.setModifyDate(new Date());
        processExt.setModifyUser((String) UserUtils.getCurrentUserId());
        partCodeProcessMapper.updateByPrimaryKeySelective(processExt);
        if(!CollectionUtils.isEmpty(processExt.getApplys())){
            for(PartCodeApply apply : processExt.getApplys()){
                partCodeApplyService.update(apply);
            }
        }
    }

    @Override
    @Transactional
    public String getMaxApplyCode(){

		String maxCode = "";
		try {
			maxCode = partCodeProcessMapper.getMaxApplyCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(maxCode == null){
			maxCode = "FN" + TimeUtil.getSysYear() +  "000000";
		}
		int val = Integer.parseInt(maxCode.substring(6,maxCode.length()))+1;
	    String valStr = String.valueOf(val);
	    String code = "FN" + TimeUtil.getSysYear();
	    for(int i = 0;i< 6 - valStr.length();i++){
	        code += "0";
	    }
	    code += valStr;
	    return code;
    }
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findPartCodeByCurHandler(Map<String,Object> param){
    	
    	return changeIdToNameAndId(partCodeProcessMapper.findPartCodeByCurHandler(param));
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findPartCodeByApplyer(Map<String, Object> param){
    	
    	return partCodeProcessMapper.findPartCodeByApplyer(param);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Map<String, Object>> findPartCodeByStatus(Map<String, Object> param){
    	
    	return partCodeProcessMapper.findPartCodeByStatus(param);
    }
    
    public  PageInfo<List<Map<String, Object>>> findPartCodeByCloseProcess(Integer page, Integer rows, String searchParam){
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("searchStr", searchParam);
    	param.put("page",(page - 1) * rows);
    	param.put("rows", rows);
//        PageHelper.startPage(page, rows);
        List<Map<String, Object>> list = partCodeProcessMapper.findPartCodeByCloseProcess(param);
        int total = partCodeProcessMapper.countPartCodeByCloseProcess(param);
        PageInfo<List<Map<String, Object>>> pageInfo = new PageInfo(list);
        pageInfo.setTotal(total);
        return pageInfo;
    }

    //把域账号改为姓名 +  工号
    private List<Map<String, Object>> changeIdToNameAndId(List<Map<String, Object>> list){
    	if(!CollectionUtils.isEmpty(list)){
    		for(int i = 0; i < list.size(); i++){
    			String handler = (String)list.get(i).get("handler");
    			list.get(i).put("handler", userService.getNameDescByAccount(handler));
    		}
    	}
    	return  list;
    }
    @Override
    @Transactional
    public void check(Integer id, String taskId, Map<String, Object> params) throws Exception{
        try {
            // 1 为同意  0 为不同意
            Map<String,Object> variables = new HashMap<>();
            if("1".equals(params.get("checkResult"))){
                variables.put("checkResult", "同意");
            }else if("0".equals(params.get("checkResult"))){
                variables.put("checkResult", "不同意");
            }else if("2".equals(params.get("checkResult"))){
                variables.put("checkResult", "不同意");
            }
            taskService.complete(taskId, variables);
            PartCodeProcess process = getById(id);
            //对应角色的审核日期
            PropertyUtils.setProperty(process, (String) params.get("checkDate"),new Date());
            //TODO 人员设置
            PropertyUtils.setProperty(process, (String) params.get("checkPerson"), UserUtils.getCurrentUserId());
            //对应角色审核结果
            Map<String,String> checkResultForRole = (Map<String, String>) params.get("checkResultForRole");
            PropertyUtils.setProperty(process,checkResultForRole.get("resultName") ,checkResultForRole.get("resultValue"));
            //对应角色审核意见
            Map<String,String> checkOpinionForRole = (Map<String, String>) params.get("checkOpinionForRole");
            if(checkOpinionForRole != null){
                PropertyUtils.setProperty(process, checkOpinionForRole.get("opinionName"), checkOpinionForRole.get("opinionValue"));
            }
            process.setCurrentNode(FlowableCache.getCurrentNode()==null?"":FlowableCache.getCurrentNode());
            process.setHandler(FlowableCache.getCurrentHandler()==null?"":FlowableCache.getCurrentHandler());
            process.setStatusDesc(FlowableCache.getCurrentStatusDesc());
            ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(process.getInstanseId()).singleResult();
            if(processInstance == null){
                process.setStatus("10");
            }
            if("0".equals(params.get("checkResult"))){
                process.setStatus("-1");
                process.setStatusDesc("返回修改");
            }
            //Task task = taskService.createTaskQuery().processInstanceId(process.getInstanseId()).singleResult();
            List<Task> list = FlowableCache.getCurrentTask();
            Task task = null;
            if(!CollectionUtils.isEmpty(list)){
                task = list.get(0);
            }
            if("0".equals(params.get("checkResult"))){
                process.setStatus("-1");

                mailInfoService.sendMailAndRecord(process.getSubSign(),"请您审核Part编码申请表："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
                        "/flowable/partCodeProcess/edit/"+process.getId(),"Part编码申请",task.getId());
            }else if("1".equals(params.get("checkResult"))){
                if(task != null){
                    if(StringUtils.isNotBlank(FlowableCache.getCurrentHandler())){
                        mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),process.getSubSign(),"请您审核Part编码申请表："+FlowableCache.getCurrentStatusDesc(),null,process.getId(),
                                "/flowable/partCodeProcess/edit/"+process.getId(),"Part编码申请",task.getId());
                    }

                }
            }
            partCodeProcessMapper.updateByPrimaryKeySelective(process);
            processLogService.createLog(new Date(), null, (String) UserUtils.getCurrentUserId(),(String)variables.get("checkResult") ,checkOpinionForRole==null?null:checkOpinionForRole.get("opinionValue") , FlowableCache.getCurrentStatusDesc(), process.getApplyCode());
            // 集成eip
            String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplyCode();
            String productUrl = "/flowable/partCodeProcess/edit/" + process.getId();
            if(process.getCurrentNode() != null && task != null){

                String authorName = userService
                        .getUserNameByAccount(process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser());
                String addUserName = userService.getUserNameByAccount(process.getHandler());

                eipService.syncEip("Part编码申请", process.getApplyCode(), process.getHandler(), addUserName,
                        process.getStatusDesc(), EipConst.PROCESSID_PARTTCODE, eipUrl, productUrl,
                        process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser(), authorName, false);
            }
            if("10".equals(process.getStatus())){
                String authorName = userService
                        .getUserNameByAccount(process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser());
                eipService.syncEip("Part编码申请", process.getApplyCode(), "", "",
                        process.getStatusDesc(), EipConst.PROCESSID_PARTTCODE, eipUrl, productUrl,
                        process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser(), authorName, true);
            }

        }catch (Exception e){
            logger.error("审核失败", e);
            throw new RuntimeException("审核失败");
        }finally {
            FlowableCache.removeAll();
        }

    }

    @Override
    @Transactional(readOnly = true)
    public PartCodeProcess getById(Integer id) {
        return partCodeProcessMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void changeHandler(Integer id, String taskId, String userId) {
        PartCodeProcess process = getById(id);
        process.setHandler(userId);
        process.setAssignSign((String) UserUtils.getCurrentUserId());
        process.setAssignDate(new Date());
        Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
        if(task == null){
            throw new FlowableException("没有运行该任务");
        }
        taskService.setAssignee(taskId, userId);
        updateEntity(process);
        String nameDesc = userService.getNameDescByAccount(userId);
        processLogService.createLog(new Date(), null, (String) UserUtils.getCurrentUserId(),"转单："+nameDesc , null, process.getStatusDesc(), process.getApplyCode());
        // 集成eip
        String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplyCode();
        String productUrl = "/flowable/partCodeProcess/edit/" + process.getId();
        String authorName = userService
                .getUserNameByAccount(process.getCreateUser() == null ? userId : process.getCreateUser());
        String addUserName = userService.getUserNameByAccount(process.getHandler());

        eipService.syncEip("Part编码申请", process.getApplyCode(), process.getHandler(), addUserName,
                process.getStatusDesc(), EipConst.PROCESSID_PARTTCODE, eipUrl, productUrl,
                process.getCreateUser() == null ? userId : process.getCreateUser(), authorName, false);
    }

    @Transactional
    @Override
    public void updateEntity(PartCodeProcess process) {
        process.setModifyUser((String) UserUtils.getCurrentUserId());
        process.setModifyDate(new Date());
        partCodeProcessMapper.updateByPrimaryKeySelective(process);
    }

    @Override
    @Transactional
    public void endProcess(Integer id, String taskId) {
        PartCodeProcess process = getById(id);
        process.setStatus("10");
        process.setStatusDesc("流程结束");
        process.setHandler("");
        process.setAssignSign((String) UserUtils.getCurrentUserId());
        updateEntity(process);
        if(process.getInstanseId() != null){
            runtimeService.deleteProcessInstance(process.getInstanseId(), "终止当前流程");
        }
        processLogService.createLog(new Date(), null, (String) UserUtils.getCurrentUserId(),"终止单据" , null, process.getStatusDesc(), process.getApplyCode());
        // 集成eip
//        String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplyCode();
//        String productUrl = "/flowable/partCodeProcess/edit/" + process.getId();
//        String authorName = userService
//                .getUserNameByAccount(process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser());
//        String addUserName = userService.getUserNameByAccount(process.getHandler());
//
//        eipService.syncEip("Part编码申请", process.getApplyCode(), process.getHandler(), addUserName,
//                process.getStatusDesc(), process.getApplyCode(), eipUrl, productUrl,
//                process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser(), authorName, false);
    }
    
    @Override
    @Transactional
    public PartCodeProcess getByApplyNo(String applyNo){
    	PartCodeProcessExample example = new PartCodeProcessExample();
    	PartCodeProcessExample.Criteria Criteria= example.createCriteria();
    	Criteria.andApplyCodeEqualTo(applyNo);
    	List<PartCodeProcess> list = partCodeProcessMapper.selectByExample(example);
    	if(!CollectionUtils.isEmpty(list)){
    		return list.get(0);
    	}else{
    		return null;
    	}
    }
    @Override
    @Transactional
    public void sendSyncDataEmail(String type, PartCodeProcess partCodeProcess,String content, String subject, String taskId){
    	String url = "/flowable/partCodeProcess/edit/"+partCodeProcess.getId();
		Task task = taskService.createTaskQuery().processInstanceId(partCodeProcess.getInstanseId()).singleResult();
		if(task != null){
			taskId = task.getId();
		}
		
		String sendTo = "";
		/*sendTo += partCodeProcess.getPdtMgn() + ",";
		sendTo += partCodeProcess.getFprodSign() + ",";*/
		sendTo += partCodeProcess.getCwSign() + ",";
		//获取管理员
		List<UserRoleRelation> adminUserList = userRoleRelationService.getAdminRelListByAdminRoleCode(null);
		
		if(!CollectionUtils.isEmpty(adminUserList)){
			for(int i = 0; i < adminUserList.size(); i++){
				sendTo += adminUserList.get(i).getHurrHulCode() + ",";
			}
		}
		
		
		mailInfoService.sendMailAndRecord(sendTo, partCodeProcess.getSubSign(), content,
				subject, Integer.valueOf(partCodeProcess.getInstanseId()), url ,"新增part编码申请", taskId);
    }

    @Override
    @Transactional(readOnly = true )
    public void validateForm(PartCodeProcessExt processExt) {
        //校验产品编码是否在途
        List<PartCodeApply> applys = processExt.getApplys();
        if(CollectionUtils.isEmpty(applys)) throw new FlowableException("申请单据不能为空！");
        int i = 1;
        for(PartCodeApply partCodeApply : applys){
            String productCode = partCodeApply.getProductCode();
            Integer count = productCodeApplyService.getZTCountByProductCode(productCode);
            if(count > 0){
                List<ProductCodeApply> ztByProductCode = productCodeApplyService.getZTByProductCode(productCode);
                throw new FlowableException("第 "+i+" 个子表单，产品编码："+productCode+"在产品编码流程中已经有在途申请单据，不能提交,流程编号："+ztByProductCode.get(0).getProcessCode());
            }
        }
    }
    
    @Override
    @Transactional(readOnly = true )
    public List<PartCodeProcess> getAllNotCompletePartCodeProcess(){
    	List<PartCodeProcess> partCodeProcessList = new ArrayList<PartCodeProcess>();
    	PartCodeProcessExample example = new PartCodeProcessExample();
    	PartCodeProcessExample.Criteria criteria  =  example.createCriteria();
    	criteria.andStatusDescNotEqualTo("流程结束");
    	criteria.andHandlerEqualTo(FlowableConst.ERP_HANDLER);
//    	criteria.andStatusIsNotNull();
    	partCodeProcessList = partCodeProcessMapper.selectByExample(example);
    	return partCodeProcessList;
    }
    
    @Override
    @Transactional
    public void updateFinance(String applyNo){
    	
    	List<PartCodeApply> partCodeApplyList = partCodeApplyService.getByProcessCode(applyNo);
    	if(!CollectionUtils.isEmpty(partCodeApplyList)){
    		for(int i = 0; i < partCodeApplyList.size(); i++){
    			List<FProductCode> fProductCodeList = this.fProductCodeService.getByProductCode(partCodeApplyList.get(i).getProductCode());
    			updatePProductCodeBom(partCodeApplyList.get(i), fProductCodeList);
    		}
    	}
    	
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        PartCodeProcess process = getById(id);
        process.setStatus("-2");
        process.setStatusDesc("逻辑删除");
        if(process.getInstanseId() != null){
            runtimeService.deleteProcessInstance(process.getInstanseId(), "终止当前流程");
        }
        partCodeProcessMapper.updateByPrimaryKeySelective(process);
    }

    private void updatePProductCodeBom(PartCodeApply partCodeApply, List<FProductCode> fProductCodeList){
    	if(!CollectionUtils.isEmpty(fProductCodeList) && partCodeApply != null){
			 for(int i = 0; i < fProductCodeList.size(); i++){
				 if(StringUtils.isNotBlank(fProductCodeList.get(i).getBomCode())){
					 if(!fProductCodeList.get(i).getBomCode().contains(partCodeApply.getProjectNo())){
						 fProductCodeList.get(i).setBomCode(fProductCodeList.get(i).getBomCode() + ";" + partCodeApply.getProjectNo());
					 }
				 }else{
					 fProductCodeList.get(i).setBomCode(partCodeApply.getProjectNo());
				 }
				 this.fProductCodeService.update(fProductCodeList.get(i));
			 }
		 }
    }

	@Override
	public List<PartCodeProcess> getPartCodeProcessbyPdmCode(String pdmCode) {
		PartCodeProcessExample example = new PartCodeProcessExample();
		PartCodeProcessExample.Criteria criteria = example.createCriteria();
		criteria.andPdmApplyCodeEqualTo(pdmCode);
		return partCodeProcessMapper.selectByExample(example);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional
	public void syncOldPdmData(String pdmStrs){
		List<String> pdmStrList = new ArrayList<String>(Arrays.asList(pdmStrs.split(",")));
		
		if(!CollectionUtils.isEmpty(pdmStrList)){
			for(int i = 0; i < pdmStrList.size(); i++){
				List<PartCodeProcess> partCodeProcessList = getPartCodeProcessbyPdmCode(pdmStrList.get(i));
				if(!CollectionUtils.isEmpty(partCodeProcessList)){
					throw new RuntimeException("pdm单号" + pdmStrList.get(i) + "在新增part中已经存在，不让添加");
				}
			}
		}else{
			throw new RuntimeException("pdm单号为空，请确认以后提交");
		}
		
		Strategy pdmStrategy = StrategyFactory.createStrategyImpl(FlowableConst.GETDATAFROM_FROM_PDM_NOTSYNC);
		List<PdmPartView> pdmList = pdmStrategy.getSourceData(pdmStrList);
		if(CollectionUtils.isEmpty(pdmList)){
			throw new RuntimeException("根据pdm单号" + "" + "没有查询到数据，请核对");
		}
		List<PartProcessAndPartCodeWrapper> wrapperList = pdmStrategy.transferPOJO(pdmList);
		pdmStrategy.saveData(wrapperList);
        CommonsThreadCache.clear();
	 }
}
