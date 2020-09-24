package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class view_ProductApplyList {
    private Integer applypid;

    private Integer id;

    private String code;

    private String prodlineno;

    private String prodline;

    private String appytype;

    private String productno;

    private String product;

    private String banben;

    private Date createDate;

    private String createUser;

    private String responsible;

    private String status;

    private String statusname;

    private String softsn;

    private String hardsn;

    public Integer getApplypid() {
        return applypid;
    }

    public void setApplypid(Integer applypid) {
        this.applypid = applypid;
    }

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

    public String getProdlineno() {
        return prodlineno;
    }

    public void setProdlineno(String prodlineno) {
        this.prodlineno = prodlineno == null ? null : prodlineno.trim();
    }

    public String getProdline() {
        return prodline;
    }

    public void setProdline(String prodline) {
        this.prodline = prodline == null ? null : prodline.trim();
    }

    public String getAppytype() {
        return appytype;
    }

    public void setAppytype(String appytype) {
        this.appytype = appytype == null ? null : appytype.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getBanben() {
        return banben;
    }

    public void setBanben(String banben) {
        this.banben = banben == null ? null : banben.trim();
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

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible == null ? null : responsible.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
    }

    public String getSoftsn() {
        return softsn;
    }

    public void setSoftsn(String softsn) {
        this.softsn = softsn == null ? null : softsn.trim();
    }

    public String getHardsn() {
        return hardsn;
    }

    public void setHardsn(String hardsn) {
        this.hardsn = hardsn == null ? null : hardsn.trim();
    }
}