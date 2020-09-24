package com.h3c.mds.flowable.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.entity.BomAndBusinessEntity;
import com.h3c.mds.entity.ErpCoaEntity;
import com.h3c.mds.entity.ProductCodeBomEntity;
import com.h3c.mds.entity.ProductCodeEntity;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.ProductCodeApply;
import com.h3c.mds.flowable.entity.ProjectCodeApply;
import com.h3c.mds.flowable.flowconst.FlowableConst;
import com.h3c.mds.utils.String.IbdsStringUtils;

public class ErpEntityUtils {

	
	public static ErpCoaEntity changeProjectCodeToErpCoaEntity(ProjectCodeApply projectCodeApply, String optType, String erpImportNo){
		// TODO 待业务确认是否需要向ERP写入数据的字段
		ErpCoaEntity entity = createDefaultProjectCodeEnttiyToErp();
		entity.setFlexValue(projectCodeApply.getProNumber());//项目编码内码
		entity.setImportBatchNo(erpImportNo);
		if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(optType)){
			entity.setFlexValueMeaning(FlowableConst.ERP_COA_STOP_PREFIX + projectCodeApply.getProName());//项目编码名称
			entity.setDescription(FlowableConst.ERP_COA_STOP_PREFIX + projectCodeApply.getProName());  //项目编码描述
			entity.setAttribute2(FlowableConst.ERP_COA_STOP_PREFIX + projectCodeApply.getProName()); 
		}else if(FlowableConst.PROJECTCODE_OPTTYPE_EDIT.equals(optType)){
			//修改项目编码流程同步数据规则确认
			if(!projectCodeApply.getOldProName().equals(projectCodeApply.getProName())){
				if(StringUtils.isNotBlank(projectCodeApply.getBversion())){
					entity.setFlexValueMeaning(projectCodeApply.getProName() + projectCodeApply.getBversion());//项目编码名称
					entity.setDescription(projectCodeApply.getProName() + projectCodeApply.getBversion());  //项目编码描述
					entity.setAttribute2(projectCodeApply.getProName() + projectCodeApply.getBversion());
				}else{
					entity.setFlexValueMeaning(projectCodeApply.getProName());//项目编码名称
					entity.setDescription(projectCodeApply.getProName());  //项目编码描述
					entity.setAttribute2(projectCodeApply.getProName());
				}
			}else{
				entity.setFlexValueMeaning(projectCodeApply.getProName());//项目编码名称
				entity.setDescription(projectCodeApply.getProName());  //项目编码描述
				entity.setAttribute2(projectCodeApply.getProName());
			}
		}else{
			//新增项目编码一定要同步
			if(StringUtils.isBlank(projectCodeApply.getBversion())){
				entity.setFlexValueMeaning(projectCodeApply.getProName());//项目编码名称
				entity.setDescription(projectCodeApply.getProName());  //项目编码描述
				entity.setAttribute2(projectCodeApply.getProName());
			}else{
				entity.setFlexValueMeaning(projectCodeApply.getProName() + projectCodeApply.getBversion());//项目编码名称
				entity.setDescription(projectCodeApply.getProName() + projectCodeApply.getBversion());  //项目编码描述	
				entity.setAttribute2(projectCodeApply.getProName() + projectCodeApply.getBversion());
			}
		}
//		entity.setAttribute2(projectCodeApply.getProName());//英文名称
		return entity;
	}
	
	
	
	
	
	public static ErpCoaEntity changeProductCodeToErpCoaEntity(ProductCodeApply productCodeApply, String optType, String productCode, 
			String productCnName, String productEnName, String erpImportNo){
		ErpCoaEntity entity = createDefaultProjectCodeEnttiyToErp();
		entity.setFlexValue(productCode);//产品编码编码内码
		entity.setImportBatchNo(erpImportNo);
		if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(optType)){
			//产品编码停用   取得  是   old值
			entity.setFlexValueMeaning(FlowableConst.ERP_COA_STOP_PREFIX + productCodeApply.getOldProductNameCn());
			entity.setDescription(FlowableConst.ERP_COA_STOP_PREFIX + productCodeApply.getOldProductNameCn());
			entity.setAttribute2(FlowableConst.ERP_COA_STOP_PREFIX + productCodeApply.getOldProductNameCn());//英文名称
		}else{
			if(StringUtil.isNotEmpty(productCnName)){
				entity.setFlexValueMeaning(productCnName);
				entity.setDescription(productCnName);
			}else{
				entity.setFlexValueMeaning(productCodeApply.getProductNameCn());//产品编码名称				
				entity.setDescription(productCodeApply.getProductNameCn());  //产品编码描述	
			}
			if(StringUtils.isNotBlank(productEnName)){
				entity.setAttribute2(productEnName);
			}else{
				entity.setAttribute2(productCodeApply.getProductNameEn());//英文名称
			}

		}
		return entity;
	}
	
	
	

	//需要修改的字段各个实体自己维护
	//这里的实体参考了notes对应的表结构，把公用的抽取出来了
	public static ErpCoaEntity createDefaultProjectCodeEnttiyToErp() {
		ErpCoaEntity entity = new ErpCoaEntity();
		entity.setFlexValueSetId(1006569);
//		entity.setFlexValue("PMcode");
//		entity.setFlexValueMeaning("PMcn");
//		entity.setDescription("PMcn");
//		entity.setAttribute2("PMen");
		entity.setStatus("NEW");
		entity.setEnabledFlag("Y");
		entity.setSummaryFlag("N");
		entity.setLanguage("US");
		entity.setCreationDate(new Date());
		entity.setLastUupdateDate(new Date());
		entity.setUserName("w05829");//这个人不能随便写，会导致erp查不到
//		entity.setUserName("lstest");
		return entity;
	}
	
	
	public static List<ProductCodeBomEntity> changeProductCodeToProductCodeBomEntity(ProductCodeApply productCodeApply, String optType, String productCode
			, String erpImportNo){
		
		List<ProductCodeBomEntity> list = new ArrayList<ProductCodeBomEntity>();
		if(!FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(optType)){
			if(productCodeApply == null || StringUtils.isBlank(productCodeApply.getBomCode())){
				return null;
			}
			
			List<String> bomList = IbdsStringUtils.splitStrBySemiAndComma(productCodeApply.getBomCode().trim());
			
			for(int i = 0; i < bomList.size(); i++){
				ProductCodeBomEntity productCodeBomEntity = createDefaultProductCodeBomEntity();
				if(StringUtils.isNotBlank(bomList.get(i))){
					productCodeBomEntity.setItemNumber(bomList.get(i).trim());					
					productCodeBomEntity.setCategory(productCode);
					productCodeBomEntity.setImportBatchNo(erpImportNo);
					list.add(productCodeBomEntity);
				}
			}
		}
		
		return list;
	}
	
	
	
	public static ProductCodeBomEntity createDefaultProductCodeBomEntity(){
		ProductCodeBomEntity tmpProductCodeBomEntity = new ProductCodeBomEntity();
		//默认常量erp确认过了
		tmpProductCodeBomEntity.setOrganizationId(83);//传递常量
		tmpProductCodeBomEntity.setCategorySetName("Product Code");//传递常量
		tmpProductCodeBomEntity.setStructureName("Product_Code");//传递常量		
		return tmpProductCodeBomEntity;
	}
	
	public static ProductCodeEntity changeProductCodeToProductCodeEntity(ProductCodeApply productCodeApply, String optType, String productCode
			, String erpImportNo){
		ProductCodeEntity tmpProductCodeEntity = createDefaultProductCodeEntity();
		tmpProductCodeEntity.setCategory(productCode);
		//如果是删除取老的产品编码名称
		if(FlowableConst.PROJECTCODE_OPTTYPE_DEL.equals(optType)){
			tmpProductCodeEntity.setDescription(FlowableConst.ERP_COA_STOP_PREFIX + productCodeApply.getOldProductNameCn());			
		}else{
			tmpProductCodeEntity.setDescription(productCodeApply.getProductNameCn());	
		}
		tmpProductCodeEntity.setImportBatchNo(erpImportNo);
		return tmpProductCodeEntity;
	}
	
	
	public static ProductCodeEntity createDefaultProductCodeEntity(){
		ProductCodeEntity tmpProductCodeEntity = new ProductCodeEntity();
		//默认常量erp确认过了
		tmpProductCodeEntity.setOrganizationId(83);//传递常量
		tmpProductCodeEntity.setStructureName("Product_Code");//传递常量
		return tmpProductCodeEntity;
	}
	
	public static BomAndBusinessEntity changePartCodeApplyToBomAndBusinessEntity(PartCodeApply partCodeApply, String erpImportNo){
		BomAndBusinessEntity tmpBomAndBusinessEntity = createDefaultBomAndBusinessEntity();
		tmpBomAndBusinessEntity.setItemNumber(partCodeApply.getProjectNo());
		tmpBomAndBusinessEntity.setBizModle(partCodeApply.getBusinessModelId());
		tmpBomAndBusinessEntity.setImportBatchNo(erpImportNo);
		return tmpBomAndBusinessEntity;
	}
	
	public static BomAndBusinessEntity createDefaultBomAndBusinessEntity(){
		BomAndBusinessEntity tmpBomAndBusinessEntity = new BomAndBusinessEntity();
		//默认常量erp确认过了
		tmpBomAndBusinessEntity.setOrganizationId(83);
		return tmpBomAndBusinessEntity;
	}
	
	
	public static ProductCodeBomEntity changePartCodeToProductCodeBomEntity(PartCodeApply partCodeApply, String erpImportNo){
		ProductCodeBomEntity productCodeBomEntity = createDefaultProductCodeBomEntity();
		
		productCodeBomEntity.setItemNumber(partCodeApply.getProjectNo());
		productCodeBomEntity.setCategory(partCodeApply.getProductCode());
		productCodeBomEntity.setImportBatchNo(erpImportNo);
		
		return productCodeBomEntity;
	}
	
	
	public static List<ProductCodeBomEntity> changeFProductCodeToProductCodeBomEntity(FProductCode fProductCode, String erpImportNo){
		List<ProductCodeBomEntity> ProductCodeBomList = new ArrayList<ProductCodeBomEntity>();
		if(fProductCode != null){
			String bomStr = fProductCode.getBomCode();
			List<String> bomList = IbdsStringUtils.splitStrBySemiAndComma(bomStr);
			if(CollectionUtils.isNotEmpty(bomList)){
				for(int i = 0; i < bomList.size(); i++){
					ProductCodeBomEntity tmpProductCodeBomEntity = createDefaultProductCodeBomEntity();
					tmpProductCodeBomEntity.setItemNumber(bomList.get(i).trim());
					tmpProductCodeBomEntity.setCategory(fProductCode.getProductCode());
					tmpProductCodeBomEntity.setImportBatchNo(erpImportNo);
					ProductCodeBomList.add(tmpProductCodeBomEntity);
				}
			}
		}
		return ProductCodeBomList;
	}
}
