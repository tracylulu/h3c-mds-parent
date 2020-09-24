package com.h3c.mds.flowable.service.impl;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.h3c.mds.flowable.entity.*;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.*;
import com.h3c.mds.utils.TimeUtil;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProduct;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FProductService;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.flowable.dao.ProductCodeProcessMapper;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.IbdsMaxCode;
import com.h3c.mds.product.service.IBDS_ProductService;
import com.h3c.mds.product.service.IbdsMaxCodeService;
import com.h3c.mds.product.service.ProdLineService;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.CommonsThreadCache;

/**
 * 产品编码流程服务实现类
 * @author sYS2403
 *
 */
@Service
public class ProductCodeProcessServiceImpl implements ProductCodeProcessService {

    private static final Logger logger = LoggerFactory.getLogger(ProductCodeProcessServiceImpl.class);

    public static ConcurrentHashMap concurrentHashMap = null;

    private static String APPLY_CODE;


    @Autowired
    private ProductCodeProcessMapper productCodeProcessMapper;
    @Autowired
    private ProductCodeApplyService productCodeApplyService;
    @Autowired
    private FProductCodeService fProductCodeService;
    @Autowired
    private FProductService fProductService;
    @Autowired
    private FprodService fprodService;
    @Autowired
    private FProdLineService fProdLineService;
    @Autowired
    private IBDS_ProductService productService;
    @Autowired
    private ProdLineService prodLineService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private ProcessLogService processLogService;
    @Autowired
    private MailInfoService mailInfoService;
    @Autowired
    private IbdsMaxCodeService ibdsMaxCodeService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleRelationService userRoleRelationService;
    @Autowired
    private PartCodeApplyService partCodeApplyService;
    @Value("${sso.main.url}")
    private String siteMainUrl;
    @Autowired
    private EipService eipService;
    @Autowired
    private ProductCodeFlowableService productCodeFlowableService;
    @Autowired
    private ProcessConfigItemService processConfigItemService;
    /**
     * 创建流程实体数据
     * @param process
     */
    @Override
    @Transactional
    public void create(ProductCodeProcess process){
        process.setCreateDate(new Date());
        process.setCreateUser((String) UserUtils.getCurrentUserId());
        process.setModifyDate(new Date());
        process.setModifyUser((String) UserUtils.getCurrentUserId());
        //productCodeProcessMapper.insertSelective(process);
        productCodeProcessMapper.insertAndGetId(process);
        //如果子表单不为空级联创建子表单数据
        ProductCodeProcessExt processExt = (ProductCodeProcessExt)process;
        if(!CollectionUtils.isEmpty(processExt.getApplys())){
            for(ProductCodeApply apply : processExt.getApplys()){
                apply.setProcessCode(process.getApplyCode());
                productCodeApplyService.create(apply);
            }
        }
    }


    /**
     * 更新流程实体数据
     * @param process
     */
    @Override
    @Transactional
    public void update(ProductCodeProcess process){
        process.setModifyDate(new Date());
        process.setModifyUser((String) UserUtils.getCurrentUserId());
        productCodeProcessMapper.updateByPrimaryKeySelective(process);
        //获取库中该流程的表单数据id集合
        List<Integer> oldIds = productCodeApplyService.getIdsByProcessCode(process.getApplyCode());

        //如果子表单不为空级联更新子表单数据
        ProductCodeProcessExt processExt = (ProductCodeProcessExt)process;
        List<Integer> ids = new ArrayList<>();
        if(!CollectionUtils.isEmpty(processExt.getApplys())){
            for(ProductCodeApply apply : processExt.getApplys()){
                apply.setProcessCode(process.getApplyCode());
                //如果子表单id为空则创建
                if(apply.getId() == null){
                    productCodeApplyService.create(apply);
                }else {
                    //不为空更新
                    productCodeApplyService.update(apply);
                    ids.add(apply.getId());
                }

            }
        }


        if(!CollectionUtils.isEmpty(oldIds)){
            for (Integer id :oldIds){
                //如果库中的id没有在新提交的id集合中则把库中的数据删除
                if(!ids.contains(id)){
                    productCodeApplyService.deleteById(id);
                }
            }
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ProductCodeProcess getById(Integer id){
        return productCodeProcessMapper.selectByPrimaryKey(id);
    }

    /**
     * 审核
     * @param id
     * @param params
     */
    @Override
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void check(Integer id, String taskId, Map<String, Object> params) throws Exception {
        //long i = System.currentTimeMillis();
        //String name = Thread.currentThread().getName();
        //String s = UUID.randomUUID().toString();
        //concurrentHashMap.put(s,"开始");
        //logger.info("UUID------"+s+"-------开始");
        //logger.info("service当前线程名称------"+name+"----1");
        try {
            //logger.info("流程任务id---------------"+taskId);
            String userId;
            if("system".equals(CommonsThreadCache.getCurrentOperateType())){
                userId = "system";
            }else{
                userId = (String) SecurityUtils.getSubject().getPrincipal();
            }
            //logger.info("service当前线程名称------"+name+"----2");
            // 1 为同意  0 为不同意
            Map<String,Object> variables = new HashMap<>();
            if("1".equals(params.get("checkResult"))){
                variables.put("checkResult", "同意");
            }else if("0".equals(params.get("checkResult"))){
                variables.put("checkResult", "不同意");
            }else if("2".equals(params.get("checkResult"))){
                variables.put("checkResult","不同意");
            }
            //logger.info("service当前线程名称------"+name+"----3");
            //logger.info("流程任务id---------------"+taskId+"通过执行");
            taskService.complete(taskId, variables);
            //logger.info("流程任务id---------------"+taskId+"通过结束");
            //logger.info("service当前线程名称------"+name+"----4");
            ProductCodeProcess process = getById(id);
            //logger.info("service当前线程名称------"+name+"----5");
            String checkPerson = process.getCurrentNode();
            String checkRole = (String) params.get("checkRole");
            //对应角色的审核日期
            PropertyUtils.setProperty(process, (String) params.get("checkDate"),new Date());
            //TODO 人员设置
            PropertyUtils.setProperty(process, (String) params.get("checkPerson"), userId);
            //对应角色审核结果
            Map<String,String> checkResultForRole = (Map<String, String>) params.get("checkResultForRole");
            PropertyUtils.setProperty(process,checkResultForRole.get("resultName") ,checkResultForRole.get("resultValue"));
            //对应角色审核意见
            Map<String,String> checkOpinionForRole = (Map<String, String>) params.get("checkOpinionForRole");
            if(checkOpinionForRole != null){
                PropertyUtils.setProperty(process, checkOpinionForRole.get("opinionName"), checkOpinionForRole.get("opinionValue"));
            }

            process.setCurrentNode(FlowableCache.getCurrentNode()==null?"":"no-update".equals(FlowableCache.getCurrentNode())?process.getCurrentNode():FlowableCache.getCurrentNode());
            process.setHandler(FlowableCache.getCurrentHandler()==null?"":FlowableCache.getCurrentHandler());
            process.setStatusDesc("no-update".equals(FlowableCache.getCurrentStatusDesc())?process.getStatusDesc():FlowableCache.getCurrentStatusDesc());
            //当前元素为结束事件

//            if("end".equals(FlowableCache.getCurrentElement())){
//                //TODO 代表流程结束状态 后续放到常量类中
//                process.setStatus("10");
//                //process.setInstanseId("");
//            }
            //logger.info("service当前线程名称------"+name+"----6");
            //logger.info("流程任务id---------------"+taskId+"查询流程实例执行");
            ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(process.getInstanseId()).singleResult();
            //logger.info("流程任务id---------------"+taskId+"查询流程实例结束");
            //logger.info("service当前线程名称------"+name+"----7");
            if("end".equals(FlowableCache.getCurrentElement())){
                process.setStatus("10");
                process.setHandler("");

            }


            List<Task> list = FlowableCache.getCurrentTask();
            if(!"10".equals(process.getStatus())){
                if(process.getCurrentNode() != null && !CollectionUtils.isEmpty(list)){
                    for(Task task : list){
                        if(!StringUtils.equals(task.getTaskDefinitionKey(), process.getCurrentNode())) continue;
                        if("0".equals(params.get("checkResult"))){
                            process.setStatus("-1");
                            process.setStatusDesc("返回修改");
                            mailInfoService.sendMailAndRecord(process.getSubSign(),"您的产品编码申请表被退回，审核意见："+(checkOpinionForRole==null?null:checkOpinionForRole.get("opinionValue")),null,process.getId(),
                                    "/flowable/productCodeApply/edit/"+process.getId(),"产品编码申请",task.getId());
                        }else if("1".equals(params.get("checkResult"))){
                            if(task != null){
                                if(StringUtils.isNotBlank(task.getAssignee())){
                                    mailInfoService.sendMailAndRecord(task.getAssignee(),process.getSubSign(),"请您审核产品编码申请表："+process.getStatusDesc(),null,process.getId(),
                                            "/flowable/productCodeApply/edit/"+process.getId(),"产品编码申请",task.getId());
                                }

                            }
                        }
                    }
                }
            }




            productCodeProcessMapper.updateByPrimaryKeySelective(process);
//            if("usertask5".equals(process.getCurrentNode())){
//                updateBaseInfo(id, taskId, params);
//            }

            //logger.info("service当前线程名称------"+name+"----11");
            if("10".equals(process.getStatus())){
                processLogService.createLog(new Date(), null, "ERP",(String)variables.get("checkResult") ,"ERP同步成功" , process.getStatusDesc(), process.getApplyCode());
                List<ProcessConfigItem> items = processConfigItemService.getListByConfigCodeAndCode("productCodeApply", "mailPerson");
                List<String> sendTo = new ArrayList<>();
                List<String> ccTo = new ArrayList<>();
                if(!CollectionUtils.isEmpty(items)){
                    for(ProcessConfigItem item : items){
                        if("sendTo".equals(item.getType())){
                            sendTo.add(item.getContent());
                        }else if("ccTo".equals(item.getType())){
                            ccTo.add(item.getContent());
                        }
                    }
                }
                ccTo.add(process.getSubSign()+"@h3c.com");
                String applyTpe;
                if("1".equals(process.getApplyType())){
                    applyTpe = "新增";
                }else if ("2".equals(process.getApplyType())){
                    applyTpe = "修改";
                }else if("3".equals(process.getApplyType())){
                    applyTpe = "停用";
                }else{
                    applyTpe = process.getApplyType();
                }
                mailInfoService.sendEffectNotice(sendTo,ccTo,"产品编码"+applyTpe+"申请已完成（"+process.getApplyCode()+"）","/flowable/productCodeApply/edit/"+process.getId(),"产品编码申请");
            }else{
                processLogService.createLog(new Date(), checkPerson, (String) userId,(String)variables.get("checkResult") ,checkOpinionForRole==null?null:checkOpinionForRole.get("opinionValue") , process.getStatusDesc(), process.getApplyCode());
            }
            //logger.info("service当前线程名称------"+name+"----12");
            // 集成eip
            String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplyCode();
            String productUrl = "/flowable/productCodeApply/edit/" + process.getId();

            if(process.getCurrentNode() != null && !CollectionUtils.isEmpty(list)){
                for(Task task : list){
                    if(!StringUtils.equals(task.getTaskDefinitionKey(), process.getCurrentNode())) continue;
                    if(StringUtils.isNotBlank(task.getAssignee())){
                        String authorName = userService
                                .getUserNameByAccount(process.getCreateUser() == null ? userId : process.getCreateUser());
                        String addUserName = userService.getUserNameByAccount(task.getAssignee());

                        eipService.syncEip("产品编码申请", process.getApplyCode(), task.getAssignee(), addUserName,
                                process.getStatusDesc(), EipConst.PROCESSID_PRODUCTCODE, eipUrl, productUrl,
                                process.getCreateUser() == null ? userId : process.getCreateUser(), authorName, false);
                    }
                }
            }
            if("10".equals(process.getStatus())){
                String authorName = userService
                        .getUserNameByAccount(process.getCreateUser() == null ? userId : process.getCreateUser());
                eipService.syncEip("产品编码申请", process.getApplyCode(), "", "",
                        process.getStatusDesc(), EipConst.PROCESSID_PRODUCTCODE, eipUrl, productUrl,
                        process.getCreateUser() == null ? userId : process.getCreateUser(), authorName, true);
            }


            //logger.info("service当前线程名称------"+name+"----13");
            //logger.info("UUID------"+s+"-------结束");
            //long j = System.currentTimeMillis();
            //concurrentHashMap.put(s,"结束---耗时---"+(j-i));
            //concurrentHashMap.put(s+"--耗时", "耗时---"+(j-i));
        }catch (Exception e){

            String message = e.getMessage();
            if(message != null && message.indexOf("流程节点")>-1){
                message = message.substring(message.indexOf("流程节点"));
                throw new FlowableException(message);
            }
            logger.error("审核失败", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            throw new RuntimeException("审核失败");
        }finally {
            FlowableCache.removeAll();
        }

    }




    @Override
    @Transactional(readOnly = true)
    public PageInfo<ProductCodeProcess> findByPage(Integer page, Integer rows, String searchStr) {
        if(page == null || page < 1){
            page = 1;
        }
        if(rows == null || rows <15){
            rows = 15;
        }
        PageHelper.startPage(page, rows);
        List<ProductCodeProcess> list = productCodeProcessMapper.findByPage(searchStr);
        PageInfo<ProductCodeProcess> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    /**
     * 根据id获取申请流程并级联子表单
     * @param id
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public ProductCodeProcess getByIdCasecadeSub(Integer id) {
        ProductCodeProcessExt processExt = getExtById(id);
        if (processExt != null){
            List<ProductCodeApply> applys = productCodeApplyService.getByProcessCode(processExt.getApplyCode());
            processExt.setApplys(applys);
        }
        return processExt;
    }

    @Override
    @Transactional(readOnly = true)
    public ProductCodeProcessExt getExtById(Integer id){
        return productCodeProcessMapper.getExtById(id);
    }

    @Override
    @Transactional
    public void changeHandler(Integer id, String taskId, String userId) {
        ProductCodeProcess process = getById(id);

        process.setAssignSign((String) UserUtils.getCurrentUserId());
        process.setAssignDate(new Date());
        Task task;
        if(StringUtils.isNotBlank(taskId)){
            task = productCodeFlowableService.getTask(taskId);
        }else{
            task = productCodeFlowableService.getTaskByInstanceId(process.getInstanseId());
        }
        if(task == null){
            throw new RuntimeException("没有运行该任务");
        }
        process.setHandler(process.getHandler().replace(task.getAssignee(),userId));
        taskService.setAssignee(task.getId(), userId);
        updateEntity(process);
        String nameDesc = userService.getNameDescByAccount(userId);
        processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),"转单："+nameDesc , null, process.getStatusDesc(), process.getApplyCode());

        mailInfoService.sendMailAndRecord(userId,process.getSubSign(),"请您审核产品编码申请表："+process.getStatusDesc(),null,id,
                "/flowable/productCodeApply/edit/"+id,"产品编码申请",task.getId());

        // 集成eip
        String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplyCode();
        String productUrl = "/flowable/productCodeApply/edit/" + process.getId();
        String authorName = userService
                .getUserNameByAccount(process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser());
        String addUserName = userService.getUserNameByAccount(userId);

        eipService.syncEip("产品编码申请", process.getApplyCode(), userId, addUserName,
                process.getStatusDesc(), EipConst.PROCESSID_PRODUCTCODE, eipUrl, productUrl,
                process.getCreateUser() == null ? UserUtils.getCurrentUserId() : process.getCreateUser(), authorName, false);
    }

    @Override
    @Transactional
    public void updateBaseInfo(Integer id, String taskId, Map<String, Object> params) throws Exception{
//        check(id, taskId, params);
    	
        //TODO 同步基本信息
        ProductCodeProcessExt process = (ProductCodeProcessExt) getByIdCasecadeSub(id);

        //新增同步
        if("1".equals(process.getApplyType())){
            synchronizeCWInfo(process);
            synchronizeAdd(process);
            synchronizeBaseAdd(process);

        //改变同步
        }else if("2".equals(process.getApplyType())){
            synchronizeCWInfoChange(process);
            synchronizeChange(process);
            synchronizeBaseChange(process);
        //停用同步
        }else if("3".equals(process.getApplyType())){
            synchronizeDel(process);
            //synchronizeBaseDel(process);
        }else{
            throw new RuntimeException("数据错误申请类型为空");
        }
    }

    @Transactional
    public void synchronizeCWInfo(ProductCodeProcessExt process) {
        if(!CollectionUtils.isEmpty(process.getApplys())){
            List<ProductCodeApply> applys = process.getApplys();
            for (ProductCodeApply apply : applys){
                //产品编码和产品族编码都为空，则为申请产品线
                if(StringUtils.isBlank(apply.getProductCode()) && StringUtils.isBlank(apply.getProductNo())){
                    Integer prodlineId =0;
                    if(apply.getProdlineId() == 0){
                        List<FProdLine> prodLines = fProdLineService.getByNoAndName(apply.getProdlineNo(), apply.getProdlineName());
                        if(CollectionUtils.isEmpty(prodLines)){
                            List<FProdLine> fProdLines = fProdLineService.getByNoAndName(null, apply.getProdlineName());
                            if(!CollectionUtils.isEmpty(fProdLines)){
                                FProdLine fProdLine = fProdLines.get(0);
                                fProdLine.setProdlineNo(apply.getProdlineNo());
                                fProdLineService.update(fProdLine);
                                apply.setProdlineId(fProdLine.getId());
                            } else{

                                FProdLine fProdLine = new FProdLine();
                                fProdLine.setProdlineNo(apply.getProdlineNo());
                                fProdLine.setProdlineDesc(apply.getProdlineName());
                                fProdLine.setProdlineDescEn(apply.getProductNameEn());
                                List<FProdLine> lines = fProdLineService.getByName(apply.getProdlineName());
                                if(!CollectionUtils.isEmpty(lines)){
                                    fProdLine.setProdlineCode(lines.get(0).getProdlineCode());
                                }
                                fProdLineService.create(fProdLine);
                                prodlineId = fProdLine.getId();
                                apply.setProdlineId(fProdLine.getId());
                            }

                        }else {
                            apply.setProdlineId(prodLines.get(0).getId());
                        }
                    }else{
                        FProdLine fProdLine = fProdLineService.getById(apply.getProdlineId());
                        prodlineId = apply.getProdlineId();
                        if(fProdLine != null && !StringUtils.equals(fProdLine.getProdlineNo(), apply.getProdlineNo())){
                            fProdLine.setProdlineNo(apply.getProdlineNo());
                            fProdLineService.update(fProdLine);
                        }
                    }
                }
            }
            for(ProductCodeApply apply : applys){
                //产品编码为空产品族编码不为空，则为申请产品族
                if(StringUtils.isBlank(apply.getProductCode()) && StringUtils.isNotBlank(apply.getProductNo())){
                    if(apply.getProductId() == 0){
                        List<FProd> prodList = fprodService.getByNoAndName(apply.getProductNo(),apply.getProductName());
                        if(CollectionUtils.isEmpty(prodList)){
                            FProd fProd = new FProd();
                            fProd.setProdNo(apply.getProductNo());
                            fProd.setProdName(apply.getProductName());
                            fProd.setProdNameEn(apply.getProductNameEn());
                            fProd.setProdlineId(fProdLineService.getByNoAndName(apply.getProdlineNo(), apply.getProdlineName()).get(0).getId());
                            fprodService.create(fProd);
                            apply.setProductId(fProd.getId());
                        }else {
                            apply.setProductId(prodList.get(0).getId());
                        }
                    }else{

                        //TODO 不确定先注释
//                    FProd fProd = fprodService.getById(apply.getId());
//                    if(fProd != null && !StringUtils.equals(fProd.getProdNo(), apply.getProductNo())){
//                        fProd.setProdNo(apply.getProductNo());
//                        fprodService.update(fProd);
//                    }
                    }
                }
            }
            for(ProductCodeApply apply : applys){
                //申请产品编码
                if(StringUtils.isNotBlank(apply.getProductCode())){
                    if(apply.getProdlineId() == 0){
                        apply.setProdlineId(fProdLineService.getByNoAndName(apply.getProdlineNo(), apply.getProdlineName()).get(0).getId());
                    }
                    if(apply.getProductId() == 0){
                        apply.setProductId(fprodService.getByNoAndName(apply.getProductNo(), apply.getProductName()).get(0).getId());
                    }

                }
            }
        }
    }

    @Transactional
    public void synchronizeCWInfoChange(ProductCodeProcessExt processExt) {

        for(ProductCodeApply apply : processExt.getApplys()){
            //只有已00结尾的产品编码才能更新产品线产品族
            String endCode = apply.getProductCode().substring(apply.getProductCode().length()-2);

            apply.setProductId(apply.getOldProductId());
            if(!"00".equals(endCode)) continue;

            //比较产品线是否变化---产品线变动
            if(!apply.getProdlineId().equals(apply.getOldProdlineId())){

                FProd fProd = fprodService.getById(apply.getOldProductId());
                //根据产品线名称和产品族编码的前两位获取产品线  获取不到则创建产品线
                List<FProdLine> fProdLineList = fProdLineService.getByNoAndName(fProd.getProdNo().substring(0, 2), apply.getProdlineName());
                if(CollectionUtils.isEmpty(fProdLineList)){
                    FProdLine fProdLine = new FProdLine();
                    fProdLine.setProdlineNo(fProd.getProdNo().substring(0,2));
                    fProdLine.setProdlineDesc(apply.getProdlineName());
                    fProdLine.setProdlineName(apply.getProdlineName());
                    fProdLine.setProdlineDescEn(apply.getProdlineNameEn());
                    List<IBDS_PRODLINE> prodlineList = prodLineService.getByName(apply.getProdlineName());
                    if(!CollectionUtils.isEmpty(prodlineList)){
                        fProdLine.setProdlineCode(prodlineList.get(0).getProdlineno());
                    }
                    //fProdLine.setProdlineCode(fProdLineService.getById(apply.getProdlineId()).getProdlineCode());
                    //fProdLine.setProdlineDescEn(apply.getProdlineNameEn());
                    fProdLineService.create(fProdLine);
                    apply.setProdlineId(fProdLine.getId());
                }else{
                    apply.setProdlineId(fProdLineList.get(0).getId());
                }
                //改变产品族和产品线的关联关系，把产品族移到新的产品线下
                fProd.setProdlineId(apply.getProdlineId());
                fProd.setProdName(apply.getProductName());
                fProd.setProdNameEn(apply.getProdNameEn());
                fprodService.update(fProd);
                //把该产品族下的产品编码的产品线全部替换为新产品线
                List<FProductCode> list = fProductCodeService.getByProdId(fProd.getId());
                if(!CollectionUtils.isEmpty(list)){
                    for(FProductCode fProductCode : list){
                        if(fProductCode.getId().equals(apply.getOldId())) continue;
                        fProductCode.setProdlineId(apply.getProdlineId());
                        fProductCode.setProdlineName(apply.getProdlineName());
                        fProductCode.setProductName(apply.getProductName());
                        if(!apply.getPdtId().equals(apply.getOldPdtId())){
                            fProductCode.setPdtId(apply.getPdtId());
                            fProductCode.setPdtName(apply.getPdtName());
                        }
                        fProductCodeService.update(fProductCode);
                    }
                }
            }else{
                //如果产品线没有变动，只需要检查产品族名称有没有变动，如果变动同步更新产品族名称
                FProd fProd = fprodService.getById(apply.getProductId());
//                if(!StringUtils.equals(apply.getProductName(), fProd.getProdName()) || !StringUtils.equals(apply.getProdNameEn(), fProd.getProdNameEn())){
//                    fProd.setProdName(apply.getProductName());
//                    fprodService.update(fProd);
//                }
                if(!StringUtils.equals(apply.getProductName(), fProd.getProdName()) || !StringUtils.equals(apply.getProdNameEn(), fProd.getProdNameEn())){
                    fProd.setProdName(apply.getProductName());
                    fProd.setProdNameEn(apply.getProdNameEn());
                    fprodService.update(fProd);
                }
                if(!StringUtils.equals(apply.getProdlineNameEn(), apply.getOldProdlineNameEn())){
                    FProdLine byId = fProdLineService.getById(apply.getProdlineId());
                    byId.setProdlineDescEn(apply.getProdlineNameEn());
                    fProdLineService.update(byId);
                }
                //如果PDT变动，则把该产品族下的产品编码PDT全部更新为新PDT
                if(!apply.getPdtId().equals(apply.getOldPdtId())){
                    //把该产品族下的产品编码的产品线全部替换为新产品线
                    List<FProductCode> list = fProductCodeService.getByProdId(fProd.getId());
                    if(!CollectionUtils.isEmpty(list)){
                        for(FProductCode fProductCode : list){
                            if(fProductCode.getId().equals(apply.getOldId())) continue;
                            fProductCode.setPdtId(apply.getPdtId());
                            fProductCode.setPdtName(apply.getPdtName());
                            fProductCodeService.update(fProductCode);
                        }
                    }
                }

            }


        }
    }

    @Transactional
    @Override
    public void synchronizeChange(ProductCodeProcessExt process) {
        List<ProductCodeApply> applys = process.getApplys();
        if(!CollectionUtils.isEmpty(applys)){
            for (ProductCodeApply apply : applys){
                FProductCode fProductCode = new FProductCode();
                fProductCode.setId(apply.getOldId());
                fProductCode.setEffectDate(new Date());
                fProductCode.setStatus(process.getApplyType());
                fProductCode.setBasisMaterial(apply.getBasisMaterial());
                fProductCode.setBasisMaterialId(apply.getBasisMaterialId());
                fProductCode.setBomCode(apply.getBomCode());
                fProductCode.setBomDesc(apply.getBomDesc());
                fProductCode.setNote(apply.getNote());
                fProductCode.setOldBomCode(apply.getOldBomCode());
                fProductCode.setOldBomDesc(apply.getOldBomDesc());
                fProductCode.setOldPdtMng(apply.getOldPdtMng());
                fProductCode.setOldPdtName(apply.getOldPdtName());
                fProductCode.setOldPdtNo(apply.getOldPdtNo());
                fProductCode.setOldProdlineName(apply.getOldProdlineName());
                fProductCode.setOldProdlineNo(apply.getOldProdlineNo());
                fProductCode.setOldProductCode(apply.getOldProductCode());
                fProductCode.setOldProductName(apply.getOldProductName());
                fProductCode.setOldProductNameCn(apply.getOldProductNameCn());
                fProductCode.setOldProductNameEn(apply.getOldProductNameEn());
                fProductCode.setOldProductNo(apply.getOldProductNo());
                fProductCode.setOrderBy(apply.getOrderBy());
                fProductCode.setPdtMng(apply.getPdtMng());
                fProductCode.setPdtName(apply.getPdtName());
                fProductCode.setPdtNo(apply.getPdtNo());
                fProductCode.setProcessCode(apply.getProcessCode());
                fProductCode.setProdlineName(apply.getProdlineName());
                fProductCode.setProdlineNo(apply.getProdlineNo());
                fProductCode.setProductCode(apply.getProductCode());
                fProductCode.setProductName(apply.getProductName());
                fProductCode.setProductNo(apply.getProductNo());
                fProductCode.setProductNameCn(apply.getProductNameCn());
                fProductCode.setProductNameEn(apply.getProductNameEn());
                fProductCode.setProdlineId(apply.getProdlineId());
                fProductCode.setProductId(apply.getProductId());
                fProductCode.setPdtId(apply.getPdtId());
                fProductCode.setOldProdlineId(apply.getOldProdlineId());
                fProductCode.setOldProductId(apply.getOldProductId());
                fProductCode.setOldPdtId(apply.getOldPdtId());
                fProductCode.setApplyDept(process.getApplyDept());
                fProductCodeService.update(fProductCode);
            }
        }
    }

    @Transactional
    @Override
    public void synchronizeAdd(ProductCodeProcessExt process) {
        List<ProductCodeApply> applys = process.getApplys();
        if (!CollectionUtils.isEmpty(applys)){
            for (ProductCodeApply apply : applys){
                if(StringUtils.isBlank(apply.getProductCode())) continue;
                FProductCode fProductCode = new FProductCode();
                fProductCode.setEffectDate(new Date());
                fProductCode.setStatus(process.getApplyType());
                fProductCode.setBasisMaterial(apply.getBasisMaterial());
                fProductCode.setBasisMaterialId(apply.getBasisMaterialId());
                fProductCode.setBomCode(apply.getBomCode());
                fProductCode.setBomDesc(apply.getBomDesc());
                fProductCode.setNote(apply.getNote());
                fProductCode.setOldBomCode(apply.getOldBomCode());
                fProductCode.setOldBomDesc(apply.getOldBomDesc());
                fProductCode.setOldPdtMng(apply.getOldPdtMng());
                fProductCode.setOldPdtName(apply.getOldPdtName());
                fProductCode.setOldPdtNo(apply.getOldPdtNo());
                fProductCode.setOldProdlineName(apply.getOldProdlineName());
                fProductCode.setOldProdlineNo(apply.getOldProdlineNo());
                fProductCode.setOldProductCode(apply.getOldProductCode());
                fProductCode.setOldProductName(apply.getOldProductName());
                fProductCode.setOldProductNameCn(apply.getOldProductNameCn());
                fProductCode.setOldProductNameEn(apply.getOldProductNameEn());
                fProductCode.setOldProductNo(apply.getOldProductNo());
                fProductCode.setOrderBy(apply.getOrderBy());
                fProductCode.setPdtMng(apply.getPdtMng());
                fProductCode.setPdtName(apply.getPdtName());
                fProductCode.setPdtNo(apply.getPdtNo());
                fProductCode.setProcessCode(apply.getProcessCode());
                fProductCode.setProdlineName(apply.getProdlineName());
                fProductCode.setProdlineNo(apply.getProdlineNo());
                fProductCode.setProductCode(apply.getProductCode());
                fProductCode.setProductName(apply.getProductName());
                fProductCode.setProductNo(apply.getProductNo());
                fProductCode.setProductNameCn(apply.getProductNameCn());
                fProductCode.setProductNameEn(apply.getProductNameEn());
                fProductCode.setProdlineId(apply.getProdlineId());
                fProductCode.setProductId(apply.getProductId());
                fProductCode.setPdtId(apply.getPdtId());
                fProductCode.setOldProdlineId(apply.getOldProdlineId());
                fProductCode.setOldProductId(apply.getOldProductId());
                fProductCode.setOldPdtId(apply.getOldPdtId());
                fProductCode.setApplyDept(process.getApplyDept());
                fProductCodeService.create(fProductCode);
            }
        }
    }

    /**
     * 同步研发基本信息（新增）
     * @param processExt
     */
    @Transactional
    public void synchronizeBaseAdd(ProductCodeProcessExt processExt){
        List<ProductCodeApply> applys = processExt.getApplys();
        if(!CollectionUtils.isEmpty(applys)){
            for(ProductCodeApply apply : applys){
                //如果产品族编码为空，则为申请产品线，不创建研发产品
                if(StringUtils.isBlank(apply.getProductNo())) continue;
                //如果产品编码不未空，则未申请产品编码，不创建研发产品
                if(StringUtils.isNotBlank(apply.getProductCode())) continue;
                //校验财务产品中有没有产品族编码
                Integer count = fProductService.getCountByCode(apply.getProductNo());
                if(count > 0) continue; //财务产品中有该编码不新增

                FProduct fProduct = new FProduct();
                fProduct.setFproduct(apply.getProductName()); //产品族描述
                fProduct.setFproductcoacode(apply.getProductNo());  //产品族编码
                fProduct.setEngfproduct(apply.getProductNameEn());
                fProduct.setBom(apply.getBomCode());
                fProduct.setMatch("新增");
                fProduct.setStatus("1");

                if(apply.getProdlineId() != 0){
                    FProdLine fProdLine = fProdLineService.getById(apply.getProdlineId());
                    IBDS_PRODLINE prodline = null;
                    if(fProdLine != null && fProdLine.getProdlineCode() != null ){
                        prodline = prodLineService.selectByCode(fProdLine.getProdlineCode());
                        if(prodline != null){
                            fProduct.setPlipmtno(prodline.getPlipmtno());
                            fProduct.setProdlineno(prodline.getProdlineno());
                        }
                    }
                }

//                FProd fProd = fprodService.getByCode(apply.getProductNo());
//                IBDS_Product product = null;
//                if(fProd != null){
//                    product = productService.getByProductNo(fProd.getProdCode());
//                    if(product != null){
//                        fProduct.setPlipmtno(product.getPlipmtno());
//                        fProduct.setProdlineno(product.getProdlineno());
//                        //更新研发产品中的财务信息
//                        product.setProductcoacode(fProduct.getFproductcoacode());
//                    }
//                }
                fProductService.create(fProduct);
//                if(product != null){
//                    product.setFproduct(fProduct.getFproductno());
//                    productService.update(product);
//                }
            }

        }
    }

    @Transactional(readOnly = true)
    public void synchronizeBaseChange(ProductCodeProcessExt processExt){
        List<ProductCodeApply> applys = processExt.getApplys();
        if(!CollectionUtils.isEmpty(applys)){
            for(ProductCodeApply apply : applys){
                String endCode = apply.getProductCode().substring(apply.getProductCode().length()-2);
                if(!"00".equals(endCode)) continue;
                String oldProductNo = apply.getOldProductNo();
                List<FProduct> productList = fProductService.getByCode(oldProductNo);
                for(FProduct fProduct : productList){
                    fProduct.setFproductcoacode(apply.getProductNo());
                    if(StringUtils.equals(apply.getProductName(), fProduct.getFproduct())){
                        fProduct.setFproductold(fProduct.getFproduct());
                    }
                    fProduct.setFproduct(apply.getProductName());
                    fProduct.setEngfproduct(apply.getProdNameEn());
                    fProduct.setBom(apply.getBomCode());
                    if(apply.getProdlineId() != 0){
                        FProdLine fProdLine = fProdLineService.getById(apply.getProdlineId());
                        IBDS_PRODLINE prodline = null;
                        if(fProdLine != null && fProdLine.getProdlineCode() != null ){
                            prodline = prodLineService.selectByCode(fProdLine.getProdlineCode());
                            if(prodline != null){
                                fProduct.setPlipmtno(prodline.getPlipmtno());
                                fProduct.setProdlineno(prodline.getProdlineno());
                            }
                        }
                    }
                    fProduct.setMatch("改变");
                    fProduct.setStatus("1");
                    fProductService.update(fProduct);

                }
            }
        }
    }

    @Transactional
    public void synchronizeBaseDel(ProductCodeProcessExt processExt){
        List<ProductCodeApply> applys = processExt.getApplys();
        if(!CollectionUtils.isEmpty(applys)){
            for(ProductCodeApply apply : applys){
                String productNo = apply.getProductNo();
                List<FProduct> fProductList = fProductService.getByCode(productNo);
                for(FProduct fProduct : fProductList){
                    fProduct.setStatus("0");
                    fProduct.setMatch("改变");
                    fProductService.update(fProduct);
                }
            }
        }
    }

    @Transactional
    @Override
    public void synchronizeDel(ProductCodeProcessExt process) {
        List<ProductCodeApply> applys = process.getApplys();
        if(!CollectionUtils.isEmpty(applys)){
            for (ProductCodeApply apply: applys) {
                FProductCode fProductCode = new FProductCode();
                fProductCode.setStatus(process.getApplyType());
                fProductCode.setEffectDate(new Date());
                fProductCode.setId(apply.getOldId());
                fProductCodeService.update(fProductCode);
            }

        }
    }

    @Transactional
    public void updateEntity(ProductCodeProcess process){
        process.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
        process.setModifyDate(new Date());
        productCodeProcessMapper.updateByPrimaryKeySelective(process);
    }

    @Transactional(readOnly = true)
    public String initApplyCode(){
        String maxCode = productCodeProcessMapper.getMaxCode();
        if(maxCode == null){
            maxCode = "PRC0000000";
        }
        return maxCode;
    }

//    public synchronized String getMaxCode(){
//        IbdsMaxCode maxCode = ibdsMaxCodeService.getByName("productCodeApply");
//        if(maxCode == null){
//            maxCode = new IbdsMaxCode();
//            maxCode.setProjectName("productCodeApply");
//            maxCode.setPrefix(initApplyCode());
//        }
//        int val = Integer.parseInt(maxCode.getPrefix().substring(3,maxCode.getPrefix().length()))+1;
//        String valStr = String.valueOf(val);
//        String code = "PRC";
//        for(int i = 0;i<7-valStr.length();i++){
//            code += "0";
//        }
//        code += valStr;
//        maxCode.setPrefix(code);
//        if(maxCode.getId() == null){
//            ibdsMaxCodeService.addIbdsMaxCode(maxCode);
//        }else{
//            ibdsMaxCodeService.updateIbdsMaxCode(maxCode);
//        }
//        return code;
//    }

    @Transactional
    @Override
    public synchronized String getMaxCode() {
        String prefix = "PRC_" + TimeUtil.getSysYear().substring(2) + "_" + TimeUtil.getSysMonth();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("projectName", "productCode");
        param.put("prefix", prefix);
        IbdsMaxCode ibdsMaxCode = ibdsMaxCodeService.getIbdsMaxCodeByProjectNameAndPrefix(param);

        if(ibdsMaxCode == null){
//			插入
            ibdsMaxCode = new IbdsMaxCode();
            ibdsMaxCode.setProjectName("productCode");
            ibdsMaxCode.setPrefix(prefix);
            ibdsMaxCode.setCode(1);
            ibdsMaxCodeService.addIbdsMaxCode(ibdsMaxCode);
        }else{
            //自增
            ibdsMaxCode.setCode(ibdsMaxCode.getCode() + 1);
            ibdsMaxCodeService.updateIbdsMaxCode(ibdsMaxCode);
        }

        int val = ibdsMaxCode.getCode();
        String valStr = String.valueOf(val);
        String code = "PRC";
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

    @Transactional(readOnly = true)
    @Override
    public void validateForm(ProductCodeProcessExt processExt){
        long l = System.currentTimeMillis();
        List<ProductCodeApply> applys = processExt.getApplys();
        if(CollectionUtils.isEmpty(applys)){
            throw new FlowableException("申请信息不能为空");
        }else{
            if("1".equals(processExt.getApplyType())){
                addValidateForm(applys);
            }else if("2".equals(processExt.getApplyType())){
                updateValidateForm(applys);
            }else if("3".equals(processExt.getApplyType())){
                deleteValidateForm(applys);
            }
        }
        long j = System.currentTimeMillis();
        System.out.println("校验表单耗时："+(j-l)+" 毫秒");
    }

    public void addValidateForm(List<ProductCodeApply> applys){
        int i = 1;
        int pdt  = 0;
        for(ProductCodeApply apply : applys){
            if( i == 1){
                pdt = (apply.getPdtId()==null?0:apply.getPdtId());
            } else{
                if(pdt != (apply.getPdtId()==null?0:apply.getPdtId())) throw new FlowableException("现所属PDT必须一致！");
            }
            //------申请产品编码----------新增流程产品编码不为空则为申请产品编码
            if(StringUtils.isNotBlank(apply.getProductCode())){
                if(StringUtils.isBlank(apply.getProdlineName())) throw new FlowableException("产品线名称必填！");
                if(StringUtils.isBlank(apply.getProdlineNo())) throw new FlowableException("产品线编码必填！");
                if(StringUtils.isBlank(apply.getProductName())) throw new FlowableException("产品族名称必填！");
                if(StringUtils.isBlank(apply.getProductNo())) throw new FlowableException("产品族编码必填！");
                if(StringUtils.isBlank(apply.getProductNameCn())) throw new FlowableException("产品中文描述必填！");
                if(StringUtils.isBlank(apply.getProductNameEn())) throw new FlowableException("产品英文描述必填！");
                String endCode = apply.getProductCode().substring(apply.getProductCode().length() - 2);
                if("00".equals(endCode)){
                    if(StringUtils.isNotBlank(apply.getBomCode())) throw new FlowableException("00结尾的产品编码不可填写BOM编码");
                }

                //校验财务参考信息是否存在产品线,不存在报错
                List<FProdLine> fProdlines = fProdLineService.getByNoAndName(apply.getProdlineNo(), apply.getProdlineName());
                if(CollectionUtils.isEmpty(fProdlines)) {
                    //如果财务参考信息中不存在该产品线，判断当前流程中有没有申请该产品线
                    validateProdline(i,apply.getProdlineNo(),apply.getProdlineName(),applys);
                }
                //校验产品族是否存在，不存在报错
                //FProd fProd = fprodService.getByCode(apply.getProductNo());
                List<FProd> byNoAndName = fprodService.getByNoAndName(apply.getProductNo(), apply.getProductName());
                if(CollectionUtils.isEmpty(byNoAndName)){
                    //如果财务参考信息中不存在该产品族，判断当前流程中有没有申请该产品族
                    validateProd(i,apply.getProductNo(),apply.getProductName(),applys);
                }
                List<String> ztProcessCodeByProductCode = productCodeApplyService.getZTProcessCodeByProductCode(apply.getProductCode());
                if(!CollectionUtils.isEmpty(ztProcessCodeByProductCode)) throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getProductCode()+"，已经有在途申请单，不能提交，申请编号："+StringUtils.join(ztProcessCodeByProductCode,","));
                List<String> ztProcessCodeByProductCode1 = partCodeApplyService.getZTProcessCodeByProductCode(apply.getProductCode());
                if(!CollectionUtils.isEmpty(ztProcessCodeByProductCode1)) throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getProductCode()+"，在part编码已经有在途申请单，不能提交，申请编号："+StringUtils.join(ztProcessCodeByProductCode1,","));

                //新增校验财务产品  产品编码为空 是 新增产品族 不校验产品编码
                Integer count1 = fProductCodeService.getCountByProductCode(apply.getProductCode());
                if(count1 > 0)throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getProductCode()+"，在财务产品中已经存在，不能提交");


                //------申请产品族---------产品编码为空，产品族编码不为空，则为申请产品族，需要校验在途和财务参考信息是否存在
            } else if(StringUtils.isNotBlank(apply.getProductNo())){
                if(StringUtils.isBlank(apply.getProdlineName())) throw new FlowableException("产品线名称必填！");
                if(StringUtils.isBlank(apply.getProdlineNo())) throw new FlowableException("产品线编码必填！");
                if(StringUtils.isBlank(apply.getProductName())) throw new FlowableException("产品族名称必填！");
                if(StringUtils.isBlank(apply.getProductNo())) throw new FlowableException("产品族编码必填！");
                if(StringUtils.isBlank(apply.getProductNameEn())) throw new FlowableException("产品英文描述必填！");
                if(!StringUtils.equals(apply.getProductName(), apply.getProductNameCn())) throw new FlowableException("申请产品族时，产品族名称和产品中文描述必须一致！");
                //申请产品族时必须连同以00结尾的7为编码一起申请
                boolean flag = false;
                for(ProductCodeApply productCodeApply : applys){
                    if(StringUtils.isNotBlank(productCodeApply.getProductCode())){
                        String endCode = productCodeApply.getProductCode().substring(productCodeApply.getProductCode().length() - 2);
                        String fiveNo = productCodeApply.getProductCode().substring(0, 5);
                        if("00".equals(endCode) && apply.getProductNo().equals(fiveNo)){
                            flag = true;
                            break;
                        }
                    }
                }
                if(!flag){
                    throw new FlowableException("申请产品族时，必须连同以00结尾的7为编码一起申请！");
                }
                //校验财务参考信息是否存在产品线,不存在报错
                List<FProdLine> fProdlines = fProdLineService.getByNoAndName(apply.getProdlineNo(), apply.getProdlineName());
                if(CollectionUtils.isEmpty(fProdlines)){
                    validateProdline(i, apply.getProdlineNo(), apply.getProdlineName(), applys);
                }

                //第一校验财务产品是否存在
                FProd fProd = fprodService.getByCode(apply.getProductNo());
                if(fProd != null) throw new FlowableException("第 "+i+" 个子表单产品族编码："+apply.getProductNo()+"，在财务参考信息中已经存在，不能提交");
                //第二校验是否存在在途
                List<String> ztProcessCodeByProductNo = productCodeApplyService.getZTProcessCodeByProductNo(apply.getProductNo());
                if(!CollectionUtils.isEmpty(ztProcessCodeByProductNo))throw new FlowableException("第 "+i+" 个子表单产品族编码："+apply.getProductNo()+"，已经有在途申请单，不能提交，申请编号："+StringUtils.join(ztProcessCodeByProductNo,","));

                //----申请产品线--------产品编码产品族编码为空，产品线编码不为空，则为申请产品线，需要校验在途和参考信息是否存在
            } else if(StringUtils.isNotBlank(apply.getProdlineNo())){
                if(StringUtils.isBlank(apply.getProdlineName())) throw new FlowableException("产品线名称必填！");
                if(StringUtils.isBlank(apply.getProdlineNo())) throw new FlowableException("产品线编码必填！");
                if(StringUtils.isBlank(apply.getProductNameEn())) throw new FlowableException("产品英文描述必填！");
                //第一校验财务产品是否存在
                List<FProdLine> fProdLines = fProdLineService.getByNoAndName(apply.getProdlineNo(), apply.getProdlineName());
                if(!CollectionUtils.isEmpty(fProdLines)) throw new FlowableException("第 "+i+" 个子表单产品线编码："+apply.getProdlineNo()+" 产品线名称："+apply.getProdlineName()+"，在财务参考信息中已经存在，不能提交");
                //第二校验是否存在在途
                List<String> ztProcessCodeByProdlineNoAndProdlineName = productCodeApplyService.getZTProcessCodeByProdlineNoAndProdlineName(apply.getProdlineNo(), apply.getProdlineName());
                if(!CollectionUtils.isEmpty(ztProcessCodeByProdlineNoAndProdlineName)) throw new FlowableException("第 "+i+" 个子表单产品族编码："+apply.getProdlineNo()+" 产品线名称："+apply.getProdlineName()+"，已经有在途申请单，不能提交，申请编号："+StringUtils.join(ztProcessCodeByProdlineNoAndProdlineName,","));
            }
            if(apply.getBomCode() != null){
                String[] bomCodes = apply.getBomCode().replace(" ", "").split(";|,");
                for(String bomCode : bomCodes){
                    List<String> ztProcessCodeByBomCode = productCodeApplyService.getZTProcessCodeByBomCode(bomCode);
                    if(!CollectionUtils.isEmpty(ztProcessCodeByBomCode)) throw new FlowableException("第 "+i+" 个子表单BOM编码:"+bomCode+"，在在途申请单中已经存在，不能提交；流程编号为："+StringUtils.join(ztProcessCodeByBomCode,","));
                    //新增校验财务产品
                    Integer count3 = fProductCodeService.getCountByBomCode(bomCode);
                    if(count3 > 0) throw new FlowableException("第 "+i+" 个子表单BOM编码:"+bomCode+"，在财务产品中已经存在，不能提交");
                }
            }
            i++;
        }
    }

    private void validateProd(int i, String productNo, String productName, List<ProductCodeApply> applys) {
        boolean flag = false;
        for(ProductCodeApply apply : applys){
            //产品编码为空，产品族编码不为空，则为申请产品族
            if(StringUtils.isBlank(apply.getProductCode()) && StringUtils.isNotBlank(apply.getProductNo())){
                if(StringUtils.equals(apply.getProductNo(), productNo) && StringUtils.equals(apply.getProductName(), productName)){
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            throw new FlowableException("第 "+i+" 个子表单产品族编码："+productNo+" 产品族名称："+productName+"，在财务参考信息中不存在且在当前流程中不存在该产品族，不能提交，请先申请产品族或在当前流程中同时申请产品族！");
        }
    }

    private void validateProdline(int index,String prodlineNo, String prodlineName, List<ProductCodeApply> applys) {
        boolean flag = false;
        for(ProductCodeApply apply : applys){
            //产品编码和产品族编码都为空，则为申请产品线
            if(StringUtils.isBlank(apply.getProductCode()) && StringUtils.isBlank(apply.getProductNo())){
                if(StringUtils.equals(apply.getProdlineNo(), prodlineNo) && StringUtils.equals(apply.getProdlineName(), prodlineName)){
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            throw new FlowableException("第 "+index+" 个子表单产品线编码："+prodlineNo+" 产品线名称："+prodlineName+"，在财务参考信息中不存在且在当前流程没申请该产品线，不能提交，请先申请产品线或在当前流程同时申请产品线！");
        }
    }

    public void updateValidateForm(List<ProductCodeApply> applys){
        int i = 1;
        String endCode = "";
        for(ProductCodeApply apply : applys){
            if(StringUtils.isNotBlank(apply.getProductCode())){
                List<String> ztProcessCodeByProductCode = productCodeApplyService.getZTProcessCodeByProductCode(apply.getProductCode());
                if(!CollectionUtils.isEmpty(ztProcessCodeByProductCode)) throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getProductCode()+"，已经有在途申请单，不能提交，申请编号："+StringUtils.join(ztProcessCodeByProductCode,","));
                List<String> ztProcessCodeByProductCode1 = partCodeApplyService.getZTProcessCodeByProductCode(apply.getProductCode());
                if(!CollectionUtils.isEmpty(ztProcessCodeByProductCode1)) throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getProductCode()+"，在part编码已经有在途申请单，不能提交，申请编号："+StringUtils.join(ztProcessCodeByProductCode1,","));
                //更新流程校验：以00结尾的编码不可和非00结尾的编码同时提交
                String substring = apply.getProductCode().substring(apply.getProductCode().length() - 2);
                if("00".equals(substring)){
                    if(StringUtils.isNotBlank(apply.getBomCode())) throw new FlowableException("00结尾的产品编码不可填写BOM编码！");
                }
                if(StringUtils.isNotBlank(endCode) ){
                    if("00".equals(endCode)){
                        if(!"00".equals(substring)) throw new FlowableException("以00结尾的编码不可和非00结尾的编码同时提交!");
                    }else if("00".equals(substring)){
                        throw new FlowableException("以00结尾的编码不可和非00结尾的编码同时提交!");
                    }
                }else {
                    endCode = substring;
                }
            }
            if(apply.getBomCode() != null){
                String[] bomCodes = apply.getBomCode().replace(" ", "").split(";|,");
                for(String bomCode : bomCodes){
                    List<String> ztProcessCodeByBomCode = productCodeApplyService.getZTProcessCodeByBomCode(bomCode);
                    if(!CollectionUtils.isEmpty(ztProcessCodeByBomCode)) throw new FlowableException("第 "+i+" 个子表单BOM编码:"+bomCode+"，在在途申请单中已经存在，不能提交；流程编号为："+StringUtils.join(ztProcessCodeByBomCode,","));
                    //更新校验财务产品
                    List<String> codes = fProductCodeService.getProductCodeByBomCodeNoCode(bomCode,apply.getProductCode());
                    if(!CollectionUtils.isEmpty(codes)) {
                        validateBom(codes,bomCode,applys,i);

                    }

                }
            }
            i++;
        }
    }

    private void validateBom(List<String> codes, String bomCode, List<ProductCodeApply> applys,int i) {
        for(String code : codes){
            boolean flag = false;
            for(ProductCodeApply apply : applys){
                if(StringUtils.equals(code, apply.getProductCode())){
                    flag = true;
                    String applyBomCode = apply.getBomCode();
                    if(StringUtils.contains(applyBomCode, bomCode)){
                        throw new FlowableException("第 "+i+" 个子表单BOM编码:"+bomCode+"，在财务产品中已经存在，产品编码为："+code+"不能提交");
                    }
                }
            }
            if(!flag){
                throw new FlowableException("第 "+i+" 个子表单BOM编码:"+bomCode+"，在财务产品中已经存在，产品编码为："+code+"不能提交");
            }
        }

    }

    public void deleteValidateForm(List<ProductCodeApply> applys){
        int i = 1;
        int pdt  = 0;
        for(ProductCodeApply apply : applys){
            //停用校验原产品编码
            List<String> ztProcessCodeByOldProductCode = productCodeApplyService.getZTProcessCodeByOldProductCode(apply.getOldProductCode());
            if(!CollectionUtils.isEmpty(ztProcessCodeByOldProductCode)) throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getOldProductCode()+"，已经有在途申请单，不能提交,申请编号为："+StringUtils.join(ztProcessCodeByOldProductCode,","));
            //校验part编码流程
            List<String> ztProcessCodeByProductCode = partCodeApplyService.getZTProcessCodeByProductCode(apply.getOldProductCode());
            if(!CollectionUtils.isEmpty(ztProcessCodeByProductCode)) throw new FlowableException("第 "+i+" 个子表单产品编码："+apply.getOldProductCode()+"，在part编码已经有在途申请单，不能提交,申请编号："+StringUtils.join(ztProcessCodeByProductCode,","));
            if( i == 1){
                pdt = (apply.getOldPdtId()==null?0:apply.getOldPdtId());
            } else{
                if(pdt != (apply.getOldPdtId()==null?0:apply.getOldPdtId())) throw new FlowableException("所属PDT必须一致！");
            }
            i++;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductCodeProcessExt> dataList(Map<String, String> searchMap) {
        return productCodeProcessMapper.dataList(searchMap);
    }
    
    @Override
    public ProductCodeProcess getProductCodeProcessByApplyCode(String applyCode){
    	ProductCodeProcessExample example = new ProductCodeProcessExample();
    	ProductCodeProcessExample.Criteria criteria =  example.createCriteria();
    	criteria.andApplyCodeEqualTo(applyCode);
    	List<ProductCodeProcess> list = productCodeProcessMapper.selectByExample(example);
    	
    	if(!CollectionUtils.isEmpty(list)){
    		if(list.size() == 1){
    			return list.get(0);    			
    		}else{
    			logger.error("产品编码申请单号" + applyCode + "数据条数大于一条");
    			return null;
    		}
    	}else{
    		return null;
    	}
    	
    }
    
    @Override
    public void sendSyncDataEmail(String type, ProductCodeProcess productCodeProcess,String content, String subject, String taskId){
    	
    	
    	String url = "flowable/productCodeApply/edit/"+productCodeProcess.getId();
		Task task = taskService.createTaskQuery().processInstanceId(productCodeProcess.getInstanseId()).singleResult();
		if(task != null){
			taskId = task.getId();
		}
		
		String sendTo = "";
		/*if(StringUtils.isNotBlank(productCodeProcess.getCheckSign())){
			sendTo += productCodeProcess.getCheckSign() + ",";			
		}
		if(StringUtils.isNotBlank(productCodeProcess.getPdtSign())){
			sendTo += productCodeProcess.getPdtSign() + ",";			
		}
		if(StringUtils.isNotBlank(productCodeProcess.getFprodSign())){
			sendTo += productCodeProcess.getFprodSign() + ",";
		}*/
		if(StringUtils.isNotBlank(productCodeProcess.getCwSign())){
			sendTo += productCodeProcess.getCwSign() + ",";
		}
		/*if(StringUtils.isNotBlank(productCodeProcess.getSubSign())){
			sendTo += productCodeProcess.getSubSign() + ",";			
		}*/
		String applyer = productCodeProcess.getSubSign();
		//获取管理员
		List<UserRoleRelation> adminUserList = userRoleRelationService.getAdminRelListByAdminRoleCode(null);
		
		if(adminUserList != null && adminUserList.size() > 0){
			for(int i = 0; i < adminUserList.size(); i++){
				sendTo += adminUserList.get(i).getHurrHulCode() + ",";
			}
		}
		
		
		mailInfoService.sendMailAndRecord(sendTo, applyer,  content,
				subject, Integer.valueOf(productCodeProcess.getInstanseId()), url ,"产品编码编码申请", taskId);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        ProductCodeProcess process = getById(id);
        process.setStatus("-2");
        process.setStatusDesc("逻辑删除");
        process.setModifyDate(new Date());
        process.setModifyUser(UserUtils.getCurrentUserId());
        if(StringUtils.isNotBlank(process.getInstanseId())){
            runtimeService.deleteProcessInstance(process.getInstanseId(), "终止当前流程");
        }
        productCodeProcessMapper.updateByPrimaryKeySelective(process);
    }
}
