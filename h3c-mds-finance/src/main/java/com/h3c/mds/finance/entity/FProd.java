package com.h3c.mds.finance.entity;

import java.util.Date;

public class FProd {
    private Integer id;

    private String prodlineNo;

    private String prodNo;

    private String prodName;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modifyUser;

    private Integer orderBy;

    private String prodCode;

    private Integer prodlineId;

    private String syncStatus;

    private String prodNameEn;

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

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo == null ? null : prodNo.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
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

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public Integer getProdlineId() {
        return prodlineId;
    }

    public void setProdlineId(Integer prodlineId) {
        this.prodlineId = prodlineId;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
    }

    public String getProdNameEn() {
        return prodNameEn;
    }

    public void setProdNameEn(String prodNameEn) {
        this.prodNameEn = prodNameEn == null ? null : prodNameEn.trim();
    }
}