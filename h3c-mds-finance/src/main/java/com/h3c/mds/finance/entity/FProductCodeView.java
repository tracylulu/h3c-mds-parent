package com.h3c.mds.finance.entity;

import java.util.Date;

public class FProductCodeView {
    private Integer id;

    private String code;

    private String name;

    private Integer prodlineNo;

    private String prodlineName;

    private Integer pdtNo;

    private String pdtName;

    private String productCode;

    private String productNameCn;

    private String productNameEn;

    private String bomCode;

    private String status;

    private Date effectDate;

    private String applyDept;

    private String prodlineCode;

    private Integer productId;

    private String prodName;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProdlineNo() {
        return prodlineNo;
    }

    public void setProdlineNo(Integer prodlineNo) {
        this.prodlineNo = prodlineNo;
    }

    public String getProdlineName() {
        return prodlineName;
    }

    public void setProdlineName(String prodlineName) {
        this.prodlineName = prodlineName == null ? null : prodlineName.trim();
    }

    public Integer getPdtNo() {
        return pdtNo;
    }

    public void setPdtNo(Integer pdtNo) {
        this.pdtNo = pdtNo;
    }

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName == null ? null : pdtName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductNameCn() {
        return productNameCn;
    }

    public void setProductNameCn(String productNameCn) {
        this.productNameCn = productNameCn == null ? null : productNameCn.trim();
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn == null ? null : productNameEn.trim();
    }

    public String getBomCode() {
        return bomCode;
    }

    public void setBomCode(String bomCode) {
        this.bomCode = bomCode == null ? null : bomCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept == null ? null : applyDept.trim();
    }

    public String getProdlineCode() {
        return prodlineCode;
    }

    public void setProdlineCode(String prodlineCode) {
        this.prodlineCode = prodlineCode == null ? null : prodlineCode.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}