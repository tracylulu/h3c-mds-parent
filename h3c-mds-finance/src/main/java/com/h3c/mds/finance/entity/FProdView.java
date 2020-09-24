package com.h3c.mds.finance.entity;

public class FProdView {
    private Integer prodlineId;

    private String prodlineNo;

    private String prodlineDesc;

    private String prodNo;

    private String prodName;

    private Integer id;

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

    public String getProdlineDesc() {
        return prodlineDesc;
    }

    public void setProdlineDesc(String prodlineDesc) {
        this.prodlineDesc = prodlineDesc == null ? null : prodlineDesc.trim();
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}