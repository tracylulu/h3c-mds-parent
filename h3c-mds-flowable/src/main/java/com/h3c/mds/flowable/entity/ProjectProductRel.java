package com.h3c.mds.flowable.entity;

import java.util.Date;

public class ProjectProductRel {
    private Integer id;

    private String projNo;

    private String productCode;

    private String aplicant;

    private Date applydate;

    private String pdtno;

    private String rate;

    private String status;

    private String productName;

    private String pdtName;

    private Integer projectCodeId;

    private String oldProductName;

    private String oldPdtName;

    private String oldProductCode;

    private String oldRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjNo() {
        return projNo;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo == null ? null : projNo.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getAplicant() {
        return aplicant;
    }

    public void setAplicant(String aplicant) {
        this.aplicant = aplicant == null ? null : aplicant.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getPdtno() {
        return pdtno;
    }

    public void setPdtno(String pdtno) {
        this.pdtno = pdtno == null ? null : pdtno.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName == null ? null : pdtName.trim();
    }

    public Integer getProjectCodeId() {
        return projectCodeId;
    }

    public void setProjectCodeId(Integer projectCodeId) {
        this.projectCodeId = projectCodeId;
    }

    public String getOldProductName() {
        return oldProductName;
    }

    public void setOldProductName(String oldProductName) {
        this.oldProductName = oldProductName == null ? null : oldProductName.trim();
    }

    public String getOldPdtName() {
        return oldPdtName;
    }

    public void setOldPdtName(String oldPdtName) {
        this.oldPdtName = oldPdtName == null ? null : oldPdtName.trim();
    }

    public String getOldProductCode() {
        return oldProductCode;
    }

    public void setOldProductCode(String oldProductCode) {
        this.oldProductCode = oldProductCode == null ? null : oldProductCode.trim();
    }

    public String getOldRate() {
        return oldRate;
    }

    public void setOldRate(String oldRate) {
        this.oldRate = oldRate == null ? null : oldRate.trim();
    }
}