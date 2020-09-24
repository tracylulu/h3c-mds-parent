package com.h3c.mds.finance.entity;

import java.util.Date;

public class FProdLine {
    private Integer id;

    private String prodlineNo;

    private String prodlineDesc;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modifyUser;

    private Integer orderBy;

    private String prodlineCode;

    private String syncStatus;

    private String status;

    private String prodlineName;

    private String prodlineDescEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdlineNo() {
        return prodlineNo;
    }

    public void setProdlineNo(String prodlineNo) {
        this.prodlineNo = prodlineNo == null ? null : prodlineNo.trim();
    }

    public String getProdlineDesc() {
        return prodlineDesc;
    }

    public void setProdlineDesc(String prodlineDesc) {
        this.prodlineDesc = prodlineDesc == null ? null : prodlineDesc.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getProdlineCode() {
        return prodlineCode;
    }

    public void setProdlineCode(String prodlineCode) {
        this.prodlineCode = prodlineCode == null ? null : prodlineCode.trim();
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getProdlineName() {
        return prodlineName;
    }

    public void setProdlineName(String prodlineName) {
        this.prodlineName = prodlineName == null ? null : prodlineName.trim();
    }

    public String getProdlineDescEn() {
        return prodlineDescEn;
    }

    public void setProdlineDescEn(String prodlineDescEn) {
        this.prodlineDescEn = prodlineDescEn == null ? null : prodlineDescEn.trim();
    }
}