package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class IBDS_Product_Apply {
    private Integer id;

    private String plipmtno;

    private String prodlineno;

    private String productno;

    private String product;

    private String engproduct;

    private String fproductno;

    private String producttypeno;

    private String pmId;

    private String popId;

    private String cmoId;

    private String pdeId;

    private String productoldno;

    private String productold;

    private String engproductold;

    private String productnamechange;

    private String ifdelbelow;

    private String appytype;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modifyUser;

    private String processCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlipmtno() {
        return plipmtno;
    }

    public void setPlipmtno(String plipmtno) {
        this.plipmtno = plipmtno == null ? null : plipmtno.trim();
    }

    public String getProdlineno() {
        return prodlineno;
    }

    public void setProdlineno(String prodlineno) {
        this.prodlineno = prodlineno == null ? null : prodlineno.trim();
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

    public String getEngproduct() {
        return engproduct;
    }

    public void setEngproduct(String engproduct) {
        this.engproduct = engproduct == null ? null : engproduct.trim();
    }

    public String getFproductno() {
        return fproductno;
    }

    public void setFproductno(String fproductno) {
        this.fproductno = fproductno == null ? null : fproductno.trim();
    }

    public String getProducttypeno() {
        return producttypeno;
    }

    public void setProducttypeno(String producttypeno) {
        this.producttypeno = producttypeno == null ? null : producttypeno.trim();
    }

    public String getPmId() {
        return pmId;
    }

    public void setPmId(String pmId) {
        this.pmId = pmId == null ? null : pmId.trim();
    }

    public String getPopId() {
        return popId;
    }

    public void setPopId(String popId) {
        this.popId = popId == null ? null : popId.trim();
    }

    public String getCmoId() {
        return cmoId;
    }

    public void setCmoId(String cmoId) {
        this.cmoId = cmoId == null ? null : cmoId.trim();
    }

    public String getPdeId() {
        return pdeId;
    }

    public void setPdeId(String pdeId) {
        this.pdeId = pdeId == null ? null : pdeId.trim();
    }

    public String getProductoldno() {
        return productoldno;
    }

    public void setProductoldno(String productoldno) {
        this.productoldno = productoldno == null ? null : productoldno.trim();
    }

    public String getProductold() {
        return productold;
    }

    public void setProductold(String productold) {
        this.productold = productold == null ? null : productold.trim();
    }

    public String getEngproductold() {
        return engproductold;
    }

    public void setEngproductold(String engproductold) {
        this.engproductold = engproductold == null ? null : engproductold.trim();
    }

    public String getProductnamechange() {
        return productnamechange;
    }

    public void setProductnamechange(String productnamechange) {
        this.productnamechange = productnamechange == null ? null : productnamechange.trim();
    }

    public String getIfdelbelow() {
        return ifdelbelow;
    }

    public void setIfdelbelow(String ifdelbelow) {
        this.ifdelbelow = ifdelbelow == null ? null : ifdelbelow.trim();
    }

    public String getAppytype() {
        return appytype;
    }

    public void setAppytype(String appytype) {
        this.appytype = appytype == null ? null : appytype.trim();
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

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode == null ? null : processCode.trim();
    }
}