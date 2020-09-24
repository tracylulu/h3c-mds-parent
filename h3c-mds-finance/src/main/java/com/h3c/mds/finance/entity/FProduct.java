package com.h3c.mds.finance.entity;

public class FProduct {
    private Integer id;

    private String fproductno;

    private String fproduct;

    private String fproductold;

    private String engfproduct;

    private String ifplan;

    private String fproductcoacode;

    private String plipmtno;

    private String prodlineno;

    private String bom;

    private String readers;

    private String remark;

    private String match;

    private String fproductmatch;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFproductno() {
        return fproductno;
    }

    public void setFproductno(String fproductno) {
        this.fproductno = fproductno == null ? null : fproductno.trim();
    }

    public String getFproduct() {
        return fproduct;
    }

    public void setFproduct(String fproduct) {
        this.fproduct = fproduct == null ? null : fproduct.trim();
    }

    public String getFproductold() {
        return fproductold;
    }

    public void setFproductold(String fproductold) {
        this.fproductold = fproductold == null ? null : fproductold.trim();
    }

    public String getEngfproduct() {
        return engfproduct;
    }

    public void setEngfproduct(String engfproduct) {
        this.engfproduct = engfproduct == null ? null : engfproduct.trim();
    }

    public String getIfplan() {
        return ifplan;
    }

    public void setIfplan(String ifplan) {
        this.ifplan = ifplan == null ? null : ifplan.trim();
    }

    public String getFproductcoacode() {
        return fproductcoacode;
    }

    public void setFproductcoacode(String fproductcoacode) {
        this.fproductcoacode = fproductcoacode == null ? null : fproductcoacode.trim();
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

    public String getBom() {
        return bom;
    }

    public void setBom(String bom) {
        this.bom = bom == null ? null : bom.trim();
    }

    public String getReaders() {
        return readers;
    }

    public void setReaders(String readers) {
        this.readers = readers == null ? null : readers.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match == null ? null : match.trim();
    }

    public String getFproductmatch() {
        return fproductmatch;
    }

    public void setFproductmatch(String fproductmatch) {
        this.fproductmatch = fproductmatch == null ? null : fproductmatch.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}