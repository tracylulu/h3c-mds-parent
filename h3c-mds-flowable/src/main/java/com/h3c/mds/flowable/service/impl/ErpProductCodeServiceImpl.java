package com.h3c.mds.flowable.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.flowable.engine.common.impl.util.CollectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.entity.BomAndBusinessEntity;
import com.h3c.mds.entity.ErpCoaEntity;
import com.h3c.mds.entity.ProductCodeBomEntity;
import com.h3c.mds.entity.ProductCodeEntity;
import com.h3c.mds.finance.entity.FProd;
import com.h3c.mds.finance.entity.FProdLine;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.finaceconst.FinanceConst;
import com.h3c.mds.finance.service.FProdLineService;
import com.h3c.mds.finance.service.FProductCodeService;
import com.h3c.mds.finance.service.FprodService;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.entity.ProductCodeProcess;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.flowable.service.ErpProductCodeService;
import com.h3c.mds.flowable.service.IbdsTaskService;
import com.h3c.mds.flowable.service.PartCodeApplyService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.service.ProductCodeApplyService;
import com.h3c.mds.flowable.service.ProductCodeProcessService;
import com.h3c.mds.flowable.util.ErpEntityUtils;
import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.service.DicService;
import com.h3c.mds.service.inv.ErpInvService;
import com.h3c.mds.service.master.ErpService;

@Service
public class ErpProductCodeServiceImpl implements ErpProductCodeService{

	private static final Logger LOG = LoggerFactory.getLogger(ErpProductCodeServiceImpl.class);
	@Autowired
	private ProductCodeApplyService productCodeApplyService;
	
	@Autowired
	private ProductCodeProcessService productCodeProcessService;
	
	@Autowired
	private PartCodeApplyService partCodeApplyService;
	
	@Autowired
	private PartCodeProcessService partCodeProcessService;
	
	@Autowired
	private ErpService erpService;
	
	@Autowired
	private ErpInvService erpInvService;
	
	@Autowired
	private FprodService fprodService;
	
	@Autowired
	private FProdLineService fProdLineService;
	@Autowired
	private FProductCodeService FProductCodeService;
	@Autowired
	private IbdsTaskService ibdsTaskService;
	
	@Autowired
	private DicService dicService;
	
	@Override
//	@Transactional
	public boolean SyncProductCode2ErpCoa(String applyNo, String optType){
		boolean res = false;
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(optType)){
			res = syncAddProductCode2ErpCoa(applyNo);
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(optType)){
			res = syncEditProductCode2ErpCoa(applyNo);
		}else{
			res = syncDelProductCode2ErpCoa(applyNo);
		}
		return res;
	}
	
	
//	@Override
	public boolean syncAddProductCode2ErpCoanotes(String applyNo) {
		LOG.info("开始同步新增流程的产品编码数据到erp");
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		boolean flag = true;
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>();
//		List<FProd> fprodList = new ArrayList<FProd>();
//		List<FProdLine> fprodLineList = new ArrayList<FProdLine>();
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				ProductCodeApply tmpProductCodeApply = productCodeList.get(i);
				//产品族
				FProd fProd = tmpProductCodeApply.getProductId() == null ? null : this.fprodService.getById(tmpProductCodeApply.getProductId());
				FProdLine fProdLine = tmpProductCodeApply.getProdlineId() == null ? null : this.fProdLineService.getById(tmpProductCodeApply.getProdlineId());
				
				
				if(fProdLine != null){//产品线已有情况
					
					if(fProd != null){//产品族没变，新增产品型号
						//新增产品 编码
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductCode(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//
						coaList.add(entity);
					}else if(StringUtils.isBlank(tmpProductCodeApply.getProductCode())){//产品编码不存在，新增产品族
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductNo(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProdNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}else{//新增产品编码
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductCode(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//
						coaList.add(entity);
					}
					
				}else{//产品线不存在
					//增加产品线
					if(StringUtils.isNotBlank(tmpProductCodeApply.getProdlineName()) && fProd == null){//产品线增加，产品族不变
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProdlineNo(),
								tmpProductCodeApply.getProdlineName(),
								tmpProductCodeApply.getProdNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}else if(StringUtils.isBlank(tmpProductCodeApply.getProductCode())){
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductNo(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProdNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}else{
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductCode(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//
						coaList.add(entity);
					}
				}
			}
		}
		if(CollectionUtils.isNotEmpty(coaList)){
			// 批量插入erp数据库
			batchInsertErpCoaByPage(coaList);
		}
		
		LOG.info("同步新增流程的产品编码数据到erp 结束");
		return flag;
	}

//	@Override
	public boolean syncAddProductCode2ErpCoabak2(String applyNo) {
		LOG.info("开始同步新增流程的产品编码数据到erp");
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		boolean flag = true;
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>();
//		List<FProd> fprodList = new ArrayList<FProd>();
//		List<FProdLine> fprodLineList = new ArrayList<FProdLine>();
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				ProductCodeApply tmpProductCodeApply = productCodeList.get(i);
				//产品族
				FProd fProd = tmpProductCodeApply.getProductId() == null ? null : this.fprodService.getById(tmpProductCodeApply.getProductId());
				FProdLine fProdLine = tmpProductCodeApply.getProdlineId() == null ? null : this.fProdLineService.getById(tmpProductCodeApply.getProdlineId());
				
				
				if(fProdLine != null){//产品线已有情况
					
					if(fProd != null){//产品族没变，新增产品型号
						//新增产品 编码
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductCode(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//
						coaList.add(entity);
					}else if(StringUtils.isBlank(tmpProductCodeApply.getProductCode())){//产品编码不存在，新增产品族
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductNo(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProdNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}else{//新增产品编码
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductCode(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//
						coaList.add(entity);
					}
					
				}else{//产品线不存在
					//增加产品线
					if(StringUtils.isNotBlank(tmpProductCodeApply.getProdlineName()) && fProd == null){//产品线增加，产品族不变
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProdlineNo(),
								tmpProductCodeApply.getProdlineName(),
								tmpProductCodeApply.getProdNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}else if(StringUtils.isBlank(tmpProductCodeApply.getProductCode())){
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductNo(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProdNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}else{
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductCode(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//
						coaList.add(entity);
					}
				}
			}
		}
		if(CollectionUtils.isNotEmpty(coaList)){
			// 批量插入erp数据库
			batchInsertErpCoaByPage(coaList);
		}
		
		LOG.info("同步新增流程的产品编码数据到erp 结束");
		return flag;
	}
	@Override
	public boolean syncAddProductCode2ErpCoa(String applyNo) {
		LOG.info("开始同步新增流程的产品编码数据到erp");

		boolean flag = true;
		List<ErpCoaEntity> coaList = getSyncProductCodeCoaForAdd(applyNo);
		try {
			if(CollectionUtils.isNotEmpty(coaList)){
				// 批量插入erp数据库
				batchInsertErpCoaByPage(coaList);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		
		LOG.info("同步新增流程的产品编码数据到erp 结束");
		return flag;
	}
	
	
	public List<ErpCoaEntity>  getSyncProductCodeCoaForAdd(String applyNo){
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>();
//		List<FProd> fprodList = new ArrayList<FProd>();
//		List<FProdLine> fprodLineList = new ArrayList<FProdLine>();
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				ProductCodeApply tmpProductCodeApply = productCodeList.get(i);
				//产品族
				FProd fProd = tmpProductCodeApply.getProductId() != null ? this.fprodService.getById(tmpProductCodeApply.getProductId()) : null;
				FProdLine fProdLine = tmpProductCodeApply.getProdlineId() != null ? this.fProdLineService.getById(tmpProductCodeApply.getProdlineId()) : null;
				//产品编码和产品族编码为空，则为申请产品线
				if(StringUtils.isBlank(tmpProductCodeApply.getProductCode()) && StringUtils.isBlank(tmpProductCodeApply.getProductNo())){
					if(fProdLine == null && StringUtils.isNotBlank(tmpProductCodeApply.getProdlineNo())){//产品线不存在
						//新增产品线相关
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProdlineNo(),
								tmpProductCodeApply.getProdlineName(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}
				}

				//产品编码为空产品族编码不为空，为申请产品族
				if(StringUtils.isBlank(tmpProductCodeApply.getProductCode()) && StringUtils.isNotBlank(tmpProductCodeApply.getProductNo())){
					if(fProd == null && StringUtils.isNotBlank(tmpProductCodeApply.getProductNo())){//如果产品族不存在
						ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
								tmpProductCodeApply.getProductNo(),
								tmpProductCodeApply.getProductNameCn(),
								tmpProductCodeApply.getProductNameEn(),
								erpImportNo);//原产品线英文描述
						coaList.add(entity);
					}
				}

			
			//新增产品 编码
			if(StringUtils.isNotBlank(tmpProductCodeApply.getProductCode())){
				ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
						tmpProductCodeApply.getProductCode(),
						tmpProductCodeApply.getProductNameCn(),
						tmpProductCodeApply.getProductNameEn(),
						erpImportNo);//
				coaList.add(entity);				
			}
			
			}
		}
		return coaList;
	}
	@Override
	public boolean syncEditProductCode2ErpCoa(String applyNo) {
		LOG.info("开始同步修改流程的产品编码数据到erp");
		boolean flag = true;
		
		List<ErpCoaEntity> coaList =  getChangedProductCode(applyNo);
		
		if(CollectionUtils.isNotEmpty(coaList)){
			// 批量插入erp数据库
			batchInsertErpCoaByPage(coaList);
		}
		
		LOG.info("同步修改流程的产品编码数据到erp 结束");
		return flag;
	}

	@Override
	public boolean isProductCodeChange(String applyNo){
		boolean flag = true;
		List<ErpCoaEntity> resErpCoaEntityList = getChangedProductCode(applyNo);
		if(CollectionUtils.isEmpty(resErpCoaEntityList)){
			flag = false;
		}
		return flag;
	}
	
	@Override
	public boolean isSyncProductCodeToErpInv(String applyNo){
		List<ProductCodeEntity> resList = getInvProductCodeEntity(applyNo);
		List<ProductCodeBomEntity> productCodeBomList = getChangedProductCodeBomEntityList(applyNo);
		if(CollectionUtils.isEmpty(resList) && CollectionUtils.isEmpty(productCodeBomList)){
			return false;
		}else{
			return true;
		}
	}
	@Override
	public List<ErpCoaEntity> getChangedProductCode(String applyNo){
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>();
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				ProductCodeApply tmpProductCodeApply = productCodeList.get(i);
				// 针对不同的类型构建不同的实体
				//产品线不同
				if(!StringUtils.equals(tmpProductCodeApply.getProdlineName(),tmpProductCodeApply.getOldProdlineName()) || 
						!StringUtils.equals(tmpProductCodeApply.getProdlineNameEn(),tmpProductCodeApply.getOldProdlineNameEn())){
					ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
							tmpProductCodeApply.getProductCode().substring(0, FlowableConst.PRODUCT_LINE),
							tmpProductCodeApply.getProdlineName(),
							tmpProductCodeApply.getProdlineNameEn(),
							erpImportNo);//原产品线英文描述
					coaList.add(entity);					
				}
				//产品族不同
				if(!StringUtils.equals(tmpProductCodeApply.getProductName(),tmpProductCodeApply.getOldProductName()) ||
						!StringUtils.equals(tmpProductCodeApply.getProdNameEn(), tmpProductCodeApply.getOldProdNameEn())){
					ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT,
							tmpProductCodeApply.getProductCode().substring(0, FlowableConst.PRODUCT_PROD),
							tmpProductCodeApply.getProductName(),
							tmpProductCodeApply.getProdNameEn(),
							erpImportNo);//原产品线英文描述
					coaList.add(entity);					
				}
				
				//产品编码不同
				// 英文名称修改也要同步
				if(!StringUtils.equals(tmpProductCodeApply.getProductNameCn(),tmpProductCodeApply.getOldProductNameCn())
						|| !StringUtils.equals(tmpProductCodeApply.getProductNameEn(),tmpProductCodeApply.getOldProductNameEn())){
					ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(
							tmpProductCodeApply, FlowableConst.PROJECTCODE_OPTTYPE_EDIT, 
							tmpProductCodeApply.getProductCode(), 
							tmpProductCodeApply.getProductNameCn(), 
							tmpProductCodeApply.getProductNameEn(),
							erpImportNo);
					coaList.add(entity);					
				}
				
			}
		}
		
		return coaList;
	}
	@Override
	public boolean syncDelProductCode2ErpCoa(String applyNo) {
		LOG.info("开始同步删除流程的产品编码数据到erp");
		boolean flag = true;
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		List<ErpCoaEntity> coaList = new ArrayList<ErpCoaEntity>();
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				ErpCoaEntity entity = ErpEntityUtils.changeProductCodeToErpCoaEntity(productCodeList.get(i), 
						FlowableConst.PROJECTCODE_OPTTYPE_DEL, 
						// 产品编码 取old的值，具体修改请找产品编码确认
						productCodeList.get(i).getOldProductCode(), null, null, erpImportNo);
				coaList.add(entity);
			}
		}
		
		if(CollectionUtils.isNotEmpty(coaList)){
			// 批量插入erp数据库
			batchInsertErpCoaByPage(coaList);
		}
		LOG.info("同步删除流程的产品编码数据到erp 结束");
		return flag;
	}
	
	
	
	private List<ProductCodeApply> getProductCodeListByApplyNo(String applyNo){
		return productCodeApplyService.getByProcessCode(applyNo);
	}
	//同步到产品表示已经同步过去
	@SuppressWarnings("unused")
	private void updateFprodList(List<FProd> fprodList){
		if(CollectionUtils.isNotEmpty(fprodList)){
			for(int i = 0; i < fprodList.size(); i++){
				FProd fProd = fprodList.get(i);
				fProd.setSyncStatus(FinanceConst.PROD_STATUS_EXIST);
				this.fprodService.updateFProd(fProd);
			}
		}
	}
	//同步到产品线表示已经同步过去
	@SuppressWarnings("unused")
	private void updateFprodLineList(List<FProdLine> fprodLineList){
		if(CollectionUtils.isNotEmpty(fprodLineList)){
			for(int i = 0; i < fprodLineList.size(); i++){
				FProdLine fProdLine = fprodLineList.get(i);
				fProdLine.setSyncStatus(FinanceConst.PRODLINE_STATUS_EXIST);
				this.fProdLineService.updateFProdLine(fProdLine);
			}
		}
	}


	@Override
	public boolean syncProductCode2Inventory(String applyNo, String optType) {
		boolean res = false;
		if(FlowableConst.PROJECTCODE_OPTTYPE_ADD.equals(optType)){
			res = syncAddProductCode2Inventory(applyNo);
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(optType)){
			res = syncEditProductCode2Inventory(applyNo);
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(optType)){
			res = syncDelProductCode2Inventory(applyNo);
		}
		return res;
	}


	@Override
	public boolean syncAddProductCode2Inventory(String applyNo) {
		boolean flag = true;
		//获取流程相关实体
		List<ProductCodeEntity> resList = getInvProductCodeEntity(applyNo);
		
		
		if(CollectionUtils.isNotEmpty(resList)){
			this.batchInsertErpProductCodeEntityByPage(resList);
		}
		return flag;
	}


	public List<ProductCodeEntity> getInvProductCodeEntity(String applyNo){
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		ProductCodeProcess productCodeProcess = this.productCodeProcessService.getProductCodeProcessByApplyCode(applyNo);
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		List<ProductCodeEntity> resList = new ArrayList<ProductCodeEntity>();
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				String actProjectCode = "";
				if(productCodeProcess.getApplyType().equals(FlowableConst.PROJECTCODE_OPTTYPE_DEL)){
					actProjectCode = productCodeList.get(i).getOldProductCode();
				}else{
					actProjectCode	= productCodeList.get(i).getProductCode();
				}
				//产品编码可能为空
				if(StringUtils.isNotBlank(actProjectCode)){
					ProductCodeEntity tmproductCodeEntity = ErpEntityUtils.changeProductCodeToProductCodeEntity(productCodeList.get(i), 
							productCodeProcess.getApplyType(), actProjectCode, erpImportNo);
					if(tmproductCodeEntity != null){
						resList.add(tmproductCodeEntity);
					}					
				}
			}
		}
		return resList;
	}
	@Override
	public boolean syncEditProductCode2Inventory(String applyNo) {
		//这里新增流程和修改流程获取产品编码和bom的关系都是获取最新的所以走一样的方法
		return syncAddProductCode2Inventory(applyNo);
	}

	public boolean syncDelProductCode2Inventory(String applyNo) {
		//这里新增流程和修改流程获取产品编码和bom的关系都是获取最新的所以走一样的方法
		return syncAddProductCode2Inventory(applyNo);
	}

	
	@Override
	public boolean syncProductCodeAndBom2Inventory(String applyNo, String optType) {
		if(!FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(optType)){
			return syncProductCodeAndBom(applyNo);
		}else{
			return true;
		}
	}

	
	private boolean syncProductCodeAndBom(String applyNo){
		boolean flag = true;
		//获取流程相关实体
		List<ProductCodeBomEntity> resList = getChangedProductCodeBomEntityList(applyNo);
		if(CollectionUtils.isNotEmpty(resList)){
			this.batchInsertErpProductCodeBomEntityByPage(resList);
		}
		return flag;
	
	}

	public List<ProductCodeBomEntity> getChangedProductCodeBomEntityList(String applyNo){
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		ProductCodeProcess productCodeProcess = this.productCodeProcessService.getProductCodeProcessByApplyCode(applyNo);
		List<ProductCodeApply> productCodeList = getProductCodeListByApplyNo(applyNo);
		List<ProductCodeBomEntity> resList = new ArrayList<ProductCodeBomEntity>();
		if(CollectionUtils.isNotEmpty(productCodeList)){
			for(int i = 0; i < productCodeList.size(); i++){
				//产品编码可能为空
				if(StringUtils.isNotBlank(productCodeList.get(i).getProductCode())){
					List<ProductCodeBomEntity> tmpList = ErpEntityUtils.changeProductCodeToProductCodeBomEntity(productCodeList.get(i), 
							productCodeProcess.getApplyType(), productCodeList.get(i).getProductCode(), erpImportNo);
					if(CollectionUtils.isNotEmpty(tmpList)){
						resList.addAll(tmpList);
					}					
				}
			}
		}
		
		return resList;
	}
	@Override
	public boolean syncBomAndBusiness2Inventory(String applyNo) {
		//part只有新增
		return syncAddBomAndBusiness2Inventory(applyNo);
	}


	@Override
	public boolean syncAddBomAndBusiness2Inventory(String applyNo) {
		boolean flag = true;
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
		List<PartCodeApply> partCodeList = partCodeApplyService.getByProcessCode(applyNo);
		
//		translateDic(partCodeList);
		
		List<BomAndBusinessEntity> bomAndBusinessEntityList = new ArrayList<BomAndBusinessEntity>();
		if(CollectionUtils.isNotEmpty(partCodeList)){
			for(int i = 0; i < partCodeList.size(); i++){
				BomAndBusinessEntity tmpBomAndBusinessEntity = ErpEntityUtils.changePartCodeApplyToBomAndBusinessEntity(partCodeList.get(i), erpImportNo);
				if(tmpBomAndBusinessEntity != null){
					bomAndBusinessEntityList.add(tmpBomAndBusinessEntity);
				}
			}
			
			
			if(CollectionUtils.isNotEmpty(bomAndBusinessEntityList)){
				this.batchInsertErpBomAndBusinessEntityByPage(bomAndBusinessEntityList);
			}
		}
		
		return flag;
	}
	
	void translateDic(List<PartCodeApply> partCodeList){
		Map<String, String> businessMap = new HashMap<String,String>();
		Map<String, String> param = new HashMap<String, String>();
		param.put("typeCode", "34");
		List<IBDS_Dic> businessDicList = this.dicService.getDic(param);
		
		if(CollectionUtil.isNotEmpty(businessDicList)){
			for(int i = 0; i < businessDicList.size(); i++){
				businessMap.put(businessDicList.get(i).getDicValue(), businessDicList.get(i).getDicName());
			}
		}
		
		if(CollectionUtil.isNotEmpty(partCodeList)){
			for(int i = 0; i < partCodeList.size(); i++){
				partCodeList.get(i).setBusinessModel(businessMap.get(partCodeList.get(i).getBusinessModel()));
			}
		}
	}
	
	@Override
	public boolean syncPartCodeApplyProductCodeAndBom2Inventory(String applyNo){
		boolean flag = true;
		String erpImportNo = ibdsTaskService.getExistErpImportNoByApplyNo(applyNo);
//		
//		List<PartCodeApply> partCodeList = partCodeApplyService.getByProcessCode(applyNo);
		//业务要求，每次需要获取流程未结束的所有新增part的 产品编码与bom关系
		List<PartCodeApply> partCodeList = getAllUnHandlePartCode();
		//获取所有流程未结束的产品编码和bom 数据
		
		List<ProductCodeBomEntity> productCodeBomEntityList = new ArrayList<ProductCodeBomEntity>();
		if(CollectionUtils.isNotEmpty(partCodeList)){
			for(int i = 0; i < partCodeList.size(); i++){
				ProductCodeBomEntity tmpProductCodeBomEntity = ErpEntityUtils.changePartCodeToProductCodeBomEntity(partCodeList.get(i),erpImportNo);
				if(tmpProductCodeBomEntity != null){
					productCodeBomEntityList.add(tmpProductCodeBomEntity);
				}
//				财务参考信息中的产品编码和bom关系
				List<FProductCode> FProductCodeList = this.FProductCodeService.getByProductCode(partCodeList.get(i).getProductCode());
				if(CollectionUtils.isNotEmpty(FProductCodeList)){
					for(int j = 0; j < FProductCodeList.size(); j++){
						List<ProductCodeBomEntity> fProductCodeProductCodeBomList  = ErpEntityUtils.changeFProductCodeToProductCodeBomEntity(FProductCodeList.get(j), erpImportNo);
						if(CollectionUtils.isNotEmpty(fProductCodeProductCodeBomList)){
							productCodeBomEntityList.addAll(fProductCodeProductCodeBomList);
						}
					}
				}
			}
			
			
			if(CollectionUtils.isNotEmpty(productCodeBomEntityList)){
				distinctProductCodeBomEntityList(productCodeBomEntityList);
				this.batchInsertErpProductCodeBomEntityByPage(productCodeBomEntityList);
			}
		}
		
		return flag;
	}

	//去重产品编码和bom关系的重复关系
	private void distinctProductCodeBomEntityList(List<ProductCodeBomEntity> productCodeBomEntityList){
		Map<String, Integer> productCodeBomMap = new HashMap<String, Integer>();
		if(CollectionUtils.isNotEmpty(productCodeBomEntityList)){
			for(int i = 0; i < productCodeBomEntityList.size(); i++){
				if(productCodeBomMap.containsKey(productCodeBomEntityList.get(i).getCategory() + "_" + productCodeBomEntityList.get(i).getItemNumber())){
					
				}
			}
			Iterator<ProductCodeBomEntity> iterator = productCodeBomEntityList.iterator();
			while(iterator.hasNext()){
				ProductCodeBomEntity tmpProductCodeBomEntity = iterator.next();
				if(productCodeBomMap.containsKey(tmpProductCodeBomEntity.getCategory() + "_" + tmpProductCodeBomEntity.getItemNumber())){
					iterator.remove();
				}else{
					productCodeBomMap.put(tmpProductCodeBomEntity.getCategory() + "_" + tmpProductCodeBomEntity.getItemNumber(), 1);
				}
			}
		}
	}
	
	private List<PartCodeApply> getAllUnHandlePartCode(){
		List<PartCodeApply> resPartCodeApplyList = new ArrayList<PartCodeApply>();
		List<PartCodeProcess> partCodeProcessList = this.partCodeProcessService.getAllNotCompletePartCodeProcess();
		if(CollectionUtils.isNotEmpty(partCodeProcessList)){
			for(int i = 0; i < partCodeProcessList.size(); i++){
				 List<PartCodeApply> partCodeApplyList = partCodeApplyService.getByProcessCode(partCodeProcessList.get(i).getApplyCode());
				 if(CollectionUtils.isNotEmpty(partCodeApplyList)){
					 resPartCodeApplyList.addAll(partCodeApplyList);
				 }
			}
		}
		return resPartCodeApplyList;
	}

	@Override
	public void batchInsertErpCoaByPage(List<ErpCoaEntity> coaList) {
		for(int count = 0; count < coaList.size() / FlowableConst.ERP_BATCH_COUNT; count++){
			List<ErpCoaEntity> tmpCoaList = 
					coaList.subList(count * FlowableConst.ERP_BATCH_COUNT, (count + 1) * FlowableConst.ERP_BATCH_COUNT);
			
			erpService.batchInsertHw3cFndFlexValuesInf(tmpCoaList);
		}
		
		if(0 != coaList.size() % FlowableConst.ERP_BATCH_COUNT){
			List<ErpCoaEntity> tmpCoaList = 
					coaList.subList(coaList.size() - (coaList.size() % FlowableConst.ERP_BATCH_COUNT), coaList.size());
			
			
			erpService.batchInsertHw3cFndFlexValuesInf(tmpCoaList);
		}
		
	}


	@Override
	public void batchInsertErpProductCodeEntityByPage(
			List<ProductCodeEntity> productCodeList) {
		for(int count = 0; count < productCodeList.size() / FlowableConst.ERP_BATCH_COUNT; count++){
			List<ProductCodeEntity> tmpProductCodeList = 
					productCodeList.subList(count * FlowableConst.ERP_BATCH_COUNT, (count + 1) * FlowableConst.ERP_BATCH_COUNT);
			
			erpInvService.batchInsertH3cInvCategoryIfaces(tmpProductCodeList);
		}
		
		if(0 != productCodeList.size() % FlowableConst.ERP_BATCH_COUNT){
			List<ProductCodeEntity> tmpProductCodeList = 
					productCodeList.subList(productCodeList.size() - (productCodeList.size() % FlowableConst.ERP_BATCH_COUNT), productCodeList.size());
			
			
			erpInvService.batchInsertH3cInvCategoryIfaces(tmpProductCodeList);
		}
		
	}


	@Override
	public void batchInsertErpProductCodeBomEntityByPage(
			List<ProductCodeBomEntity> productCodeBomList) {
		for(int count = 0; count < productCodeBomList.size() / FlowableConst.ERP_BATCH_COUNT; count++){
			List<ProductCodeBomEntity> tmpProductCodeBomList = 
					productCodeBomList.subList(count * FlowableConst.ERP_BATCH_COUNT, (count + 1) * FlowableConst.ERP_BATCH_COUNT);
			
			erpInvService.batchInsertH3cInvCateAsnIfaces(tmpProductCodeBomList);
		}
		
		if(0 != productCodeBomList.size() % FlowableConst.ERP_BATCH_COUNT){
			List<ProductCodeBomEntity> tmpProductCodeBomList = 
					productCodeBomList.subList(productCodeBomList.size() - (productCodeBomList.size() % FlowableConst.ERP_BATCH_COUNT), productCodeBomList.size());
			
			
			erpInvService.batchInsertH3cInvCateAsnIfaces(tmpProductCodeBomList);
		}
		
	}


	@Override
	public void batchInsertErpBomAndBusinessEntityByPage(
			List<BomAndBusinessEntity> bomAndBusinessEntityList) {
		
		for(int count = 0; count < bomAndBusinessEntityList.size() / FlowableConst.ERP_BATCH_COUNT; count++){
			List<BomAndBusinessEntity> tmpBomAndBusinessEntityList = 
					bomAndBusinessEntityList.subList(count * FlowableConst.ERP_BATCH_COUNT, (count + 1) * FlowableConst.ERP_BATCH_COUNT);
			
			erpInvService.batchInsertH3cInvItemBizup(tmpBomAndBusinessEntityList);
		}
		
		if(0 != bomAndBusinessEntityList.size() % FlowableConst.ERP_BATCH_COUNT){
			List<BomAndBusinessEntity> tmpBomAndBusinessEntityList = 
					bomAndBusinessEntityList.subList(bomAndBusinessEntityList.size() - (bomAndBusinessEntityList.size() % FlowableConst.ERP_BATCH_COUNT), bomAndBusinessEntityList.size());
			
			
			erpInvService.batchInsertH3cInvItemBizup(tmpBomAndBusinessEntityList);
		}
		
	}
}
