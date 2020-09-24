package com.h3c.mds.flowable.entity;

import java.util.Date;

public class PartExport {
    private String pdmApplyCode;

    private String projectNo;

    private String projectName;

    private String productNum;

    private String insideDescEn;

    private String abroadDescCn;

    private String abroadDescEn;

    private String businessModel;

    private Integer prodlineId;

    private String prodlineNo;

    private String prodlineName;

    private String prodName;

    private String productNameCn;

    private String productCode;

    private String datasource;

    private Integer pdtId;

    private Date processmgnDate;

    private String applyCode;

    private String handler;

    private String subSign;

    private String status;

    private String applyPerson;

    private String deptType;

    public String getPdmApplyCode() {
        return pdmApplyCode;
    }

    public void setPdmApplyCode(String pdmApplyCode) {
        this.pdmApplyCode = pdmApplyCode == null ? null : pdmApplyCode.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    public String getInsideDescEn() {
        return insideDescEn;
    }

    public void setInsideDescEn(String insideDescEn) {
        this.insideDescEn = insideDescEn == null ? null : insideDescEn.trim();
    }

    public String getAbroadDescCn() {
        return abroadDescCn;
    }

    public void setAbroadDescCn(String abroadDescCn) {
        this.abroadDescCn = abroadDescCn == null ? null : abroadDescCn.trim();
    }

    public String getAbroadDescEn() {
        return abroadDescEn;
    }

    public void setAbroadDescEn(String abroadDescEn) {
        this.abroadDescEn = abroadDescEn == null ? null : abroadDescEn.trim();
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel == null ? null : businessModel.trim();
    }

    public Integer getProdlineId() {
        return prodlineId;
    }

    public void setProdlineId(Integer prodlineId) {
        this.prodlineId = prodlineId;
    }

    public String getProdlineNo() {
        return prodlineNo;
    }

    public void setProdlineNo(String prodlineNo) {
        this.prodlineNo = prodlineNo == null ? null : prodlineNo.trim();
    }

    public String getProdlineName() {
        return prodlineName;
    }

    public void setProdlineName(String prodlineName) {
        this.prodlineName = prodlineName == null ? null : prodlineName.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProductNameCn() {
        return productNameCn;
    }

    public void setProductNameCn(String productNameCn) {
        this.productNameCn = productNameCn == null ? null : productNameCn.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    public Integer getPdtId() {
        return pdtId;
    }

    public void setPdtId(Integer pdtId) {
        this.pdtId = pdtId;
    }

    public Date getProcessmgnDate() {
        return processmgnDate;
    }

    public void setProcessmgnDate(Date processmgnDate) {
        this.processmgnDate = processmgnDate;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getSubSign() {
        return subSign;
    }

    public void setSubSign(String subSign) {
        this.subSign = subSign == null ? null : subSign.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getApplyPerson() {
        return applyPerson;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson == null ? null : applyPerson.trim();
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType == null ? null : deptType.trim();
    }
}