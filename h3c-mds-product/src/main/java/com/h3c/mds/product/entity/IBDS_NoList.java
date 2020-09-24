package com.h3c.mds.product.entity;

public class IBDS_NoList {
    private Integer id;

    private String infoname;

    private String codemark;

    private Integer codelength;

    private String codelast;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfoname() {
        return infoname;
    }

    public void setInfoname(String infoname) {
        this.infoname = infoname == null ? null : infoname.trim();
    }

    public String getCodemark() {
        return codemark;
    }

    public void setCodemark(String codemark) {
        this.codemark = codemark == null ? null : codemark.trim();
    }

    public Integer getCodelength() {
        return codelength;
    }

    public void setCodelength(Integer codelength) {
        this.codelength = codelength;
    }

    public String getCodelast() {
        return codelast;
    }

    public void setCodelast(String codelast) {
        this.codelast = codelast == null ? null : codelast.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}