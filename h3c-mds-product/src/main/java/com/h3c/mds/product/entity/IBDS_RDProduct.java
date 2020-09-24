package com.h3c.mds.product.entity;

public class IBDS_RDProduct {
    private String productno;

    private String product;

    private String engproduct;

    private String productold;

    private String status;

    private String prodlineno;

    private String pdtno;

    private String productcoacode;

    private String ifplan;

    private String producttypeno;

    private String ifofficialnaming;

    private String remark;

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

    public String getProductold() {
        return productold;
    }

    public void setProductold(String productold) {
        this.productold = productold == null ? null : productold.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getProdlineno() {
        return prodlineno;
    }

    public void setProdlineno(String prodlineno) {
        this.prodlineno = prodlineno == null ? null : prodlineno.trim();
    }

    public String getPdtno() {
        return pdtno;
    }

    public void setPdtno(String pdtno) {
        this.pdtno = pdtno == null ? null : pdtno.trim();
    }

    public String getProductcoacode() {
        return productcoacode;
    }

    public void setProductcoacode(String productcoacode) {
        this.productcoacode = productcoacode == null ? null : productcoacode.trim();
    }

    public String getIfplan() {
        return ifplan;
    }

    public void setIfplan(String ifplan) {
        this.ifplan = ifplan == null ? null : ifplan.trim();
    }

    public String getProducttypeno() {
        return producttypeno;
    }

    public void setProducttypeno(String producttypeno) {
        this.producttypeno = producttypeno == null ? null : producttypeno.trim();
    }

    public String getIfofficialnaming() {
        return ifofficialnaming;
    }

    public void setIfofficialnaming(String ifofficialnaming) {
        this.ifofficialnaming = ifofficialnaming == null ? null : ifofficialnaming.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}