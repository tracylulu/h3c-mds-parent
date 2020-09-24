package com.h3c.mds.flowable.entity;

public class ProjectcodeRecommendView {
    private String prodlineno;

    private String prodline;

    private String pdtNo;

    private String pdtName;

    private String remark;

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

    public String getPdtNo() {
        return pdtNo;
    }

    public void setPdtNo(String pdtNo) {
        this.pdtNo = pdtNo == null ? null : pdtNo.trim();
    }

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName == null ? null : pdtName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}