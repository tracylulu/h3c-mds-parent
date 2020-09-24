package com.h3c.mds.finance.entity;

public class FProjectProductRel {
    private String fProjno;

    private String fProductCode;

    private String rate;

    private Integer id;

    private String fOldProductCode;

    private String fOldRate;

    public String getfProjno() {
        return fProjno;
    }

    public void setfProjno(String fProjno) {
        this.fProjno = fProjno == null ? null : fProjno.trim();
    }

    public String getfProductCode() {
        return fProductCode;
    }

    public void setfProductCode(String fProductCode) {
        this.fProductCode = fProductCode == null ? null : fProductCode.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfOldProductCode() {
        return fOldProductCode;
    }

    public void setfOldProductCode(String fOldProductCode) {
        this.fOldProductCode = fOldProductCode == null ? null : fOldProductCode.trim();
    }

    public String getfOldRate() {
        return fOldRate;
    }

    public void setfOldRate(String fOldRate) {
        this.fOldRate = fOldRate == null ? null : fOldRate.trim();
    }
}