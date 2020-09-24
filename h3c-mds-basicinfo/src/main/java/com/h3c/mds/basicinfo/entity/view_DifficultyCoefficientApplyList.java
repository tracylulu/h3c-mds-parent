package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class view_DifficultyCoefficientApplyList {
    private Integer applyid;

    private Integer id;

    private String code;

    private String prodlineno;

    private String prodline;

    private String productno;

    private String product;

    private String versionno;

    private String version;

    private Date createDate;

    private String createUser;

    private String responsible;

    private String status;

    private String statusname;

    private String prodifficult;

    private String harddifficult;

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
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

    public String getVersionno() {
        return versionno;
    }

    public void setVersionno(String versionno) {
        this.versionno = versionno == null ? null : versionno.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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

    public String getProdifficult() {
        return prodifficult;
    }

    public void setProdifficult(String prodifficult) {
        this.prodifficult = prodifficult == null ? null : prodifficult.trim();
    }

    public String getHarddifficult() {
        return harddifficult;
    }

    public void setHarddifficult(String harddifficult) {
        this.harddifficult = harddifficult == null ? null : harddifficult.trim();
    }
}