package com.h3c.mds.basicinfo.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.shiro.SecurityUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.basicinfo.basicinfoconst.BasicinfoConst;
import com.h3c.mds.basicinfo.dao.IBDS_BaseLine_ApplyMapper;
import com.h3c.mds.basicinfo.dao.IBDS_Product_MAXCODEMapper;
import com.h3c.mds.basicinfo.dao.IBDS_Product_PROCESSMapper;
import com.h3c.mds.basicinfo.entity.IBDS_Product_Apply;
import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODE;
import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODEExample;
import com.h3c.mds.basicinfo.entity.IBDS_Product_MAXCODEExample.Criteria;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_Product_PROCESSExt;
import com.h3c.mds.basicinfo.service.ProductApplyService;
import com.h3c.mds.basicinfo.service.ProductProcessService;
import com.h3c.mds.basicinfo.util.OperationLogBatchUtils;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.flowconst.EipConst;
import com.h3c.mds.flowable.service.EipService;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessLogService;
import com.h3c.mds.flowable.service.impl.ProductCodeProcessServiceImpl;
import com.h3c.mds.flowable.util.FlowableCache;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_ProductExample;
import com.h3c.mds.product.entity.ProductView;
import com.h3c.mds.product.service.IBDS_ColunmConfigService;
import com.h3c.mds.product.service.IBDS_ProductService;
import com.h3c.mds.product.service.ProductViewService;
import com.h3c.mds.sysmgr.service.UserService;

/**
 * 产品申请服务实现类
 */
@Service
public class ProductProcessServiceImpl implements ProductProcessService {
	private static final Logger logger = LoggerFactory.getLogger(ProductCodeProcessServiceImpl.class);
	@Autowired
	private IBDS_BaseLine_ApplyMapper baseLineApplyMapper;

	@Autowired
	private IBDS_Product_PROCESSMapper productProcessMapper;

	@Autowired
	private IBDS_Product_MAXCODEMapper productMAXCODEMapper;

	@Autowired
	private ProductApplyService productApplyService;

	// private static String APPLY_CODE;

	@Autowired
	private TaskService taskService;

	@Autowired
	private IBDS_ProductService productService;

	@Autowired
	private ProductViewService productViewService;

	@Autowired
	private IBDS_ProductService productsService;

	@Autowired
	private ProcessLogService processLogService;

	@Autowired
	private MailInfoService mailInfoService;

	@Autowired
	private OperationLogBatchUtils<IBDS_Product> optLogProductUtils;

	@Autowired
	private IBDS_ColunmConfigService configService;

	@Autowired
	private EipService eipService;

	@Autowired
	private UserService userService;

	@Autowired
	private ProcessConfigItemService processConfigItemService;

	@Value("${sso.main.url}")
	private String siteMainUrl;


	/**
	 *          
	 */
	/*
	 * public String initApplyCode() { String maxCode =
	 * productMAXCODEMapper.selectByExample(example); if (maxCode == null) { maxCode
	 * = "P" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000"; } return
	 * maxCode; }
	 */

	/**
	 * 
	 * @return
	 */
	@Override
	@Transactional
	public synchronized String getMaxCode() {
		// 查询最大流程内码
		IBDS_Product_MAXCODEExample example = new IBDS_Product_MAXCODEExample();
		Criteria criteria = example.createCriteria();
		criteria.andProjectNameEqualTo(BasicinfoConst.PRODUCT_Prefix_PT);
		// List<IBDS_Product_MAXCODE> lstMaxCode =
		// productMAXCODEMapper.selectByExample(example);
		String maxCode = productProcessMapper.getMaxCode(BasicinfoConst.PRODUCT_Prefix_PT);// lstMaxCode.get(0).getPrefix();
		if (maxCode == null) {
			maxCode = "P" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date()) + "000";
		}
		int val = Integer.parseInt(maxCode.substring(maxCode.length() - 3, maxCode.length())) + 1;
		String valStr = String.valueOf(val);
		String code = "P" + com.h3c.mds.utils.TimeUtil.getStringDay(new Date());
		for (int i = 0; i < 3 - valStr.length(); i++) {
			code += "0";
		}
		code += valStr;

		// 写入新增的内码
		IBDS_Product_MAXCODE record = new IBDS_Product_MAXCODE();
		record.setProjectName(BasicinfoConst.PRODUCT_Prefix_PT);
		record.setPrefix(code);
		productMAXCODEMapper.updateByExample(record, example);
		return code;
	}

	/**
	 * 创建产品表单数据
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public Integer create(IBDS_Product_PROCESS productProcess) {
		productProcess.setCreateDate(new Date());
		productProcess.setCreateUser((String) SecurityUtils.getSubject().getPrincipal());
		productProcess.setModifyDate(new Date());
		productProcess.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());

		productProcessMapper.insertAndGetId(productProcess);
		// 如果表单不为空级联创建表单数据
		IBDS_Product_PROCESSExt processExt = (IBDS_Product_PROCESSExt) productProcess;
		if (!CollectionUtils.isEmpty(processExt.getApplys())) {
			int mark = 0;// 标记是否草稿状态 只保存下拉框列
			for (IBDS_Product_Apply apply : processExt.getApplys()) {

				if (apply.getAppytype() != null) {
					apply.setProcessCode(productProcess.getApplycode());
					productApplyService.create(apply);
					mark = 1;
				}
			}
			if (processExt.getStatus().equals(BasicinfoConst.PRODUCT_STATUS_DRAFT) && mark == 0) {
				processExt.getApplys().get(0).setProcessCode(productProcess.getApplycode());
				productApplyService.create(processExt.getApplys().get(0));
			}
		}
		return productProcess != null ? productProcess.getId() : 0;
	}

	/**
	 * 校验
	 */
	@Override
	public void validateForm(IBDS_Product_PROCESSExt processExt) {
		long l = System.currentTimeMillis();
		List<IBDS_Product_Apply> applys = processExt.getApplys();
		if (CollectionUtils.isEmpty(applys)) {
			throw new FlowableException("申请信息不能为空");
		} else {
			// 申请类型 1新增 2修改 3停用
			for (IBDS_Product_Apply apply : applys) {
				// 判断是否存在在途流程
				Map<String, String> param = new HashMap<String, String>();
				if (apply.getAppytype() != null && apply.getAppytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_ADD)) {
					param.put("product", apply.getProduct());
					if (productApplyService.getZTCountByProductCode(param) > 0) {
						throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单产品编码："
								+ apply.getProductno() + "，已经有在途申请单，不能提交");
					}
					Map<String, Object> para = new HashMap<String, Object>();
					para.put("tabName", "IBDS_product");
					para.put("column", "product");
					para.put("codes", apply.getProduct());
					if (productApplyService.getCountByColunm(para) > 0) {
						throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_ADDName + " 表单新增产品："
								+ apply.getProduct() + "，已经存在该产品，不能提交");
					}
				} else if (apply.getAppytype() != null
						&& apply.getAppytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_EDIT)) {
					param.put("productCode", apply.getProductno());
					if (productApplyService.getZTCountByProductCode(param) > 0) {
						throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_EDITName + " 表单产品："
								+ apply.getProduct() + "，已经有在途申请单，不能提交");
					}

				} else if (apply.getAppytype() != null
						&& apply.getAppytype().equals(BasicinfoConst.PRODUCT_OPTTYPE_DEL)) {
					param.put("productCode", apply.getProductno());
					if (productApplyService.getZTCountByProductCode(param) > 0) {
						throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_DELName + " 表单产品："
								+ apply.getProduct() + "，已经有在途申请单，不能提交");
					}
					IBDS_ProductExample example = new IBDS_ProductExample();
					example.createCriteria().andProductnoEqualTo(apply.getProductno());
					List<IBDS_Product> lstproduct = productService.selectByExample(example);
					if (lstproduct.size() > 0) {
						for (IBDS_Product ibds_Product : lstproduct) {
							if (ibds_Product.getStatus().equals("0")) {
								throw new FlowableException(BasicinfoConst.PRODUCT_OPTTYPE_DELName + " 表单停用产品："
										+ ibds_Product.getProduct() + "，该产品已经停用，不能提交");
							}
						}

					}

				}
			}
		}
		long j = System.currentTimeMillis();
		System.out.println("校验表单耗时：" + (j - l) + " 毫秒");
	}

	/**
	 * 根据id获取申请流程并级联子表单
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public IBDS_Product_PROCESSExt getByProductId(Integer id) {
		IBDS_Product_PROCESSExt processExt = getExtById(id);
		if (processExt != null) {
			List<IBDS_Product_Apply> applys = productApplyService.getByProcessCode(processExt.getApplycode());
			processExt.setApplys(applys);
		}
		return processExt;
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTaskByInstanceIdAndUserId(String instanceId, String userId) {
		// List<Task> tasks =
		// taskService.createTaskQuery().taskAssignee(userId).orderByTaskCreateTime().desc().list();
		// if(!CollectionUtils.isEmpty(tasks)){
		// for (Task task :tasks){
		// if(task.getProcessInstanceId().equals(instanceId)){
		// return task;
		// }
		// }
		// }
		return taskService.createTaskQuery().processInstanceId(instanceId).singleResult();
		// return null;
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Task getTask(String taskId) {
		return taskService.createTaskQuery().taskId(taskId).singleResult();
	}

	@Override
	public IBDS_Product_PROCESSExt getExtById(Integer id) {
		return productProcessMapper.getExtById(id);
	}

	/**
	 * 更新产品申请信息
	 * 
	 * @param productApply
	 */
	@Override
	@Transactional
	public void update(IBDS_Product_PROCESS productProcess) {
		productProcess.setModifyDate(new Date());
		productProcess.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		productProcessMapper.updateByPrimaryKeySelective(productProcess);

		// 获取库中该流程的表单数据id集合
		List<Integer> oldIds = productApplyService.getIdsByProcessCode(productProcess.getApplycode());

		// 如果子表单不为空级联更新子表单数据
		IBDS_Product_PROCESSExt processExt = (IBDS_Product_PROCESSExt) productProcess;
		List<Integer> ids = new ArrayList<>();
		if (!CollectionUtils.isEmpty(processExt.getApplys())) {
			int mark = 0;
			for (IBDS_Product_Apply apply : processExt.getApplys()) {
				if (apply.getAppytype() != null) {
					apply.setProcessCode(productProcess.getApplycode());
					// 如果子表单id为空则创建
					if (apply.getId() == null) {
						productApplyService.create(apply);
					} else {
						// 不为空更新
						productApplyService.update(apply);
						ids.add(apply.getId());
					}
					mark = 1;
				}

			}
			// 草稿状态 并且只保存下拉框数据有用
			if (processExt.getStatus().equals(BasicinfoConst.PRODUCT_STATUS_DRAFT) && mark == 0) {
				processExt.getApplys().get(0).setProcessCode(productProcess.getApplycode());
				// 如果子表单id为空则创建
				if (processExt.getApplys().get(0).getId() == null) {
					productApplyService.create(processExt.getApplys().get(0));
				} else {
					// 不为空更新
					productApplyService.update(processExt.getApplys().get(0));
					ids.add(processExt.getApplys().get(0).getId());
				}
			}
		}

		if (!CollectionUtils.isEmpty(oldIds)) {
			for (Integer id : oldIds) {
				// 如果库中的id没有在新提交的id集合中则把库中的数据删除
				if (!ids.contains(id)) {
					productApplyService.deleteById(id);
				}
			}
		}
	}

	@Override
	public IBDS_Product_PROCESS getById(Integer id) {
		return productProcessMapper.selectByPrimaryKey(id);
	}

	/**
	 * 审核
	 * 
	 * @param id
	 * @param params
	 */
	@Override
	public void check(Integer id, String taskId, Map<String, Object> params) throws Exception {
		try {
			// 1 为同意 0 为不同意
			Map<String, Object> variables = new HashMap<>();
			if ("1".equals(params.get("checkResult"))) {
				variables.put("checkResult", "同意");
			} else if ("0".equals(params.get("checkResult"))) {
				variables.put("checkResult", "不同意");
			}

			IBDS_Product_PROCESS process = getById(id);
			String checkRole = (String) params.get("checkRole");
			// 对应角色的审核日期
			PropertyUtils.setProperty(process, (String) params.get("checkDate"), new Date());
			// TODO 人员设置
			PropertyUtils.setProperty(process, (String) params.get("checkPerson"),
					SecurityUtils.getSubject().getPrincipal());
			// 对应角色审核结果
			Map<String, String> checkResultForRole = (Map<String, String>) params.get("checkResultForRole");
			PropertyUtils.setProperty(process, checkResultForRole.get("resultName"),
					checkResultForRole.get("resultValue"));
			// 对应角色审核意见
			Map<String, String> checkOpinionForRole = (Map<String, String>) params.get("checkOpinionForRole");
			if (checkOpinionForRole != null) {
				PropertyUtils.setProperty(process, checkOpinionForRole.get("opinionName"),
						checkOpinionForRole.get("opinionValue"));
			}

			if ("0".equals(params.get("checkResult"))) {
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_Return);
			}

			/*
			 * // 当前元素为结束事件 if ("end".equals(FlowableCache.getCurrentElement())) { // TODO
			 * 代表流程结束状态 数据生效 process.setStatus(BasicinfoConst.PRODUCT_STATUS_EFFECTIVE); //
			 * 录入正式库 对象 待补充 updateBaseInfo(id, taskId, params); }
			 */

			// Task task =
			// taskService.createTaskQuery().processInstanceId(process.getInstanseId()).singleResult();
			// Task task = getTaskByInstanceIdAndUserId(process.getInstanseId(), null);
			// 涉及增删改操作的提炼为一个事务
			checkOption(id, taskId, variables, params, process);

		} catch (Exception e) {
			logger.error("审核失败", e);
			throw new RuntimeException("审核失败");
		}

	}

	@Transactional
	public void checkTask(String taskId, Map<String, Object> variables) {
		taskService.complete(taskId, variables);
	}

	@Transactional
	public void checkOption(Integer id, String taskId, Map<String, Object> variables, Map<String, Object> params,
			IBDS_Product_PROCESS process) throws Exception {
		try {

			checkTask(taskId, variables);
			process.setCurrentNode(FlowableCache.getCurrentNode());
			process.setStatusname(FlowableCache.getCurrentStatusDesc());
			boolean end = false;
			// 结束清空人员
			if ("end".equals(FlowableCache.getCurrentElement())) {
				process.setResponsible("");
				end = true;
			} else {
				process.setResponsible(FlowableCache.getCurrentHandler());
			}
			List<Task> taskLst = FlowableCache.getCurrentTask();
			Task task = null;
			if (taskLst != null && taskLst.size() > 0) {
				task = taskLst.get(0);
			}
			// 当前元素为结束事件
			if ("end".equals(FlowableCache.getCurrentElement())) {
				// TODO 代表流程结束状态 数据生效
				process.setStatus(BasicinfoConst.PRODUCT_STATUS_EFFECTIVE);
				// 录入正式库 对象 待补充
				updateBaseInfo(id, taskId, params);

				end = true;
			}
			productProcessMapper.updateByPrimaryKeySelective(process);
			if ("0".equals(params.get("checkResult")) && task != null) {
				process.setStatus("0");
				mailInfoService.sendMailAndRecord(process.getResponsible(),
						"请您审核研发产品申请表：" + FlowableCache.getCurrentStatusDesc(), null, process.getId(),
						"/basicinfo/productApply/edit/" + process.getId(), "研发产品申请", task.getId());

			}
			if(end){
				List<ProcessConfigItem> items = processConfigItemService.getListByConfigCodeAndCode("ProductProcess", "mailPerson");
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
				sendTo.add(process.getCreateUser()+"@h3c.com");
				mailInfoService.sendEffectNotice(sendTo,ccTo,"研发产品生效通知","/basicinfo/productApply/edit/" + process.getId(), "研发产品申请");
			}
			/*
			 * else if ("1".equals(params.get("checkResult")) && task != null) {
			 * mailInfoService.sendMailAndRecord(FlowableCache.getCurrentHandler(),
			 * process.getResponsible(), "请您审核研发产品申请表：" +
			 * FlowableCache.getCurrentStatusDesc(), null, process.getId(),
			 * "/basicinfo/productApply/edit/" + process.getId(), "研发产品申请", task.getId()); }
			 */
			Map<String, String> checkOpinionForRole = (Map<String, String>) params.get("checkOpinionForRole");
			// 创建流程记录
			processLogService.createLog(new Date(), null, (String) SecurityUtils.getSubject().getPrincipal(),
					(String) variables.get("checkResult"),
					checkOpinionForRole == null ? null : checkOpinionForRole.get("opinionValue"),
					FlowableCache.getCurrentStatusDesc(), process.getApplycode());
			// 集成eip
			String eipUrl = siteMainUrl + "/eipLogin?docuId=" + process.getApplycode();
			String productUrl = "/basicinfo/productApply/edit/" + process.getId();
			String authorName = userService.getUserNameByAccount(process.getCreateUser());
			String addUserName = "";
			if (StringUtil.isNotEmpty(process.getResponsible())) {
				addUserName = userService.getUserNameByAccount(process.getResponsible());
			}
			eipService.syncEip("研发产品申请", process.getApplycode(), process.getResponsible(), addUserName,
					process.getStatusname(), EipConst.PROCESSID_P, eipUrl, productUrl, process.getCreateUser(),
					authorName, end);

		} catch (Exception e) {
			throw new RuntimeException("审核失败");
		}
	}

	/**
	 * 修改当前处理人
	 * 
	 * @param id
	 * @param taskId
	 * @param userId
	 */
	@Override
	@Transactional
	public void changeResponsible(Integer id, String taskId, String userId) {
		IBDS_Product_PROCESS process = getById(id);
		process.setResponsible(userId);
		process.setAssignsign((String) SecurityUtils.getSubject().getPrincipal());
		process.setAssigndate(new Date());
		// Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		Task task = getTask(taskId);
		if (task == null) {
			throw new RuntimeException("没有运行该任务");
		}
		taskService.setAssignee(taskId, userId);
		updateEntity(process);
	}

	/**
	 * 更新相关信息
	 * 
	 * @param process
	 */
	@Transactional
	public void updateEntity(IBDS_Product_PROCESS process) {
		process.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
		process.setModifyDate(new Date());
		productProcessMapper.updateByPrimaryKeySelective(process);
	}

	/**
	 * 更新研发产品信息库
	 */
	@Override
	@Transactional
	public void updateBaseInfo(Integer id, String taskId, Map<String, Object> params) throws Exception {
		// TODO 同步基本信息
		IBDS_Product_PROCESSExt process = (IBDS_Product_PROCESSExt) getByProductId(id);
		// 新增同步
		if (!CollectionUtils.isEmpty(process.getApplys())) {
			synchronizeChange(process);
		} else {
			throw new RuntimeException("数据错误申请数据为空");
		}
	}

	/**
	 * 更新产品相关表
	 */
	@Transactional
	@Override
	public void synchronizeChange(IBDS_Product_PROCESSExt process) {
		List<IBDS_Product_Apply> applys = process.getApplys();
		if (!CollectionUtils.isEmpty(applys)) {
			for (IBDS_Product_Apply apply : applys) {
				if (apply.getAppytype() != null && apply.getAppytype().equals("1")) {
					// 新增
					IBDS_Product product = new IBDS_Product();
					product.setProductno(productsService.getMaxCode());
					product.setProduct(apply.getProduct());
					product.setEngproduct(apply.getEngproduct());
					product.setProductcoacode(apply.getFproductno());
					product.setProducttype(apply.getProducttypeno());
					product.setPopId(apply.getPopId());
					product.setPmId(apply.getPmId());
					product.setCmoId(apply.getCmoId());
					product.setPdeId(apply.getPdeId());
					product.setPlipmtno(apply.getPlipmtno());
					product.setProdlineno(apply.getProdlineno());
					product.setStatus("1");
					product.setCreateUser(apply.getCreateUser());
					product.setCreateDate(new Date());
					product.setReaders(BasicinfoConst.remarks);
					productService.create(product);
					// 添加操作日志
					optLogProductUtils.RecordOpearteLog(null, product, product.getProductno());
				} else if (apply.getAppytype() != null && apply.getAppytype().equals("2")) {
					// 修改
					IBDS_Product product = new IBDS_Product();
					product.setProductno(apply.getProductno());
					product.setProduct(apply.getProduct());
					product.setEngproduct(apply.getEngproduct());
					product.setModifyUser(apply.getCreateUser());
					product.setModifyDate(new Date());
					ProductView productview = productViewService.selectByCode(apply.getProductoldno());
					if (productview != null && productview.getId() != null) {
						product.setId(productview.getId());
						// 查询更新数据
						IBDS_Product bfe = configService.selectByPrimaryKey(product.getId(), product.getProductno());
						// 更新数据
						productService.update(product);
						// 添加操作日志
						optLogProductUtils.RecordOpearteLog(bfe, product, product.getProductno());
					} else {
						logger.error("录入数据有问题，请联系管理员", "修改基本信息数据获取不到对应的主键");
						throw new RuntimeException("录入数据有问题，请联系管理员");
					}
				} else if (apply.getAppytype() != null && apply.getAppytype().equals("3")) {
					// 停用 产品
					IBDS_Product product = new IBDS_Product();
					product.setProductno(apply.getProductno());
					product.setStatus("0");
					product.setModifyUser(apply.getCreateUser());
					product.setModifyDate(new Date());
					ProductView productview = productViewService.selectByCode(apply.getProductno());
					if (productview != null && productview.getId() != null) {
						product.setId(productview.getId());

						// 查询更新前的记录
						IBDS_Product bfe = configService.selectByPrimaryKey(product.getId(), product.getProductno());

						// 更新数据
						productService.update(product);

						// 添加操作日志
						// optLogProductUtils.RecordOpearteLog(bfe, product, product.getProductno());
						/*
						 * // 停用特性 停用下层所有 Map<String, Object> param = new HashMap<>(); param.put("code",
						 * product.getProductno()); param.put("users", product.getCreateUser());
						 * baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
						 */

					} else {
						logger.error("录入数据有问题，请联系管理员", "停用基本信息数据获取不到对应的主键");
						throw new RuntimeException("录入数据有问题，请联系管理员");
					}

					// 停用该产品会停用该产品以下级别的信息：包括产品V级、R级、版本、项目组、特性、子系统、模块、模块版本

					Map<String, Object> param = new HashMap<>();
					// 产品V级
					param.put("tabName", "IBDS_Version");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// R级
					param.clear();
					param.put("tabName", "IBDS_Release");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// B级
					param.clear();
					param.put("tabName", "IBDS_Bversion");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 基线版本
					param.clear();
					param.put("tabName", "IBDS_Base_Line");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 特性

					param.clear();
					param.put("tabName", "IBDS_FEATRUE");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 子特性
					param.clear();
					param.put("tabName", "IBDS_SUB_FEATRUE");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 项目组
					param.clear();
					param.put("tabName", "IBDS_Team");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 子系统
					param.clear();
					param.put("tabName", "IBDS_SUB_SYSTEM");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 模块
					param.clear();
					param.put("tabName", "IBDS_Module");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);
					// 模块版本
					param.clear();
					param.put("tabName", "IBDS_MODULE_VERSION");
					param.put("code", apply.getProductno());
					param.put("modifyUser", apply.getCreateUser());
					param.put("modifyTime", new Date());
					productApplyService.updateBaseinfo(param);

					// 添加操作日志 停用下层所有
					Map<String, Object> para = new HashMap<>();
					para.put("code", apply.getProductno());
					para.put("users", process.getCreateUser());
					baseLineApplyMapper.updateProjectStatusAddOptionLog(param);
					// 产品V级
					/*
					 * IBDS_Version version=new IBDS_Version();
					 * version.setProductno(apply.getProductno()); version.setStatus("0");
					 * version.setModifyUser(apply.getCreateUser()); version.setModifyDate(new
					 * Date()); versionService.editVersion(version);
					 * 
					 * //R级 IBDS_Release release=new IBDS_Release();
					 * release.setProductno(apply.getProductno()); release.setStatus("0");
					 * releaseService.update(release); //B版本 IBDS_Bversion bversion=new
					 * IBDS_Bversion(); bversion.setProductno(apply.getProductno());
					 * bversion.setStatus("0"); bversion.setModifyUser(apply.getCreateUser());
					 * bversion.setModifyData(new Date()); bversionService.editBversion(bversion);
					 * //基线版本 IBDS_BaseLine baseline=new IBDS_BaseLine();
					 * baseline.setProductno(apply.getProductno()); baseline.setStatus("0");
					 * baseline.setModifyUser(apply.getCreateUser()); baseline.setModifyData(new
					 * Date()); baselineService.editIBDSProject(baseline); //特性 IBDS_Feature
					 * feature=new IBDS_Feature(); feature.setProductno(apply.getFproductno());
					 * feature.setStatus("0"); feature.setModifyUser(apply.getCreateUser());
					 * feature.setModifyData(new Date()); featureService.editIBDSFeature(feature);
					 * //子特性 IBDS_SubFeature subFeature=new IBDS_SubFeature();
					 * subFeature.setProductno(apply.getProductno()); subFeature.setStatus("0");
					 * subFeature.setModifyUser(apply.getCreateUser()); subFeature.setModifyData(new
					 * Date()); subFeatureService.editIBDSSubFeature(subFeature);
					 * 
					 * //项目组 IBDS_Team team=new IBDS_Team();
					 * team.setProductno(apply.getProductno()); team.setStatus("0");
					 * team.setModifyUser(apply.getCreateUser()); team.setModifyData(new Date());
					 * teamService.editIBDSTeam(team); //子系统 IBDS_SubSystem subSystem=new
					 * IBDS_SubSystem(); subSystem.setProductno(apply.getProductno());
					 * subSystem.setStatus("0"); subSystem.setModifyUser(apply.getCreateUser());
					 * subSystem.setModifyData(new Date()); subSystemService.update(subSystem); //模块
					 * IBDS_Module module=new IBDS_Module();
					 * module.setProductno(apply.getProductno()); module.setStatus("0");
					 * module.setModifyUser(apply.getCreateUser()); module.setModifyData(new
					 * Date()); moduleService.update(module); //模块版本 IBDS_ModuleVersion
					 * moduleVersion=new IBDS_ModuleVersion();
					 * moduleVersion.setProductno(apply.getProductno());
					 * moduleVersion.setStatus("0");
					 * moduleVersion.setModifyUser(apply.getCreateUser());
					 * moduleVersion.setModifyData(new Date());
					 * moduleVersionService.update(moduleVersion);
					 */

				}

			}
		}
	}

}
