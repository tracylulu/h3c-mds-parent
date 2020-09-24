package com.h3c.mds.flowable.entity;

public class ProjectCodeRecommend {
    private Integer id;

    private String proNumber;

    private String proName;

    private String pdtNo;

    private String bversionName;

    private String pdtName;

    private String prolineName;

    private String status;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProNumber() {
        return proNumber;
    }

    public void setProNumber(String proNumber) {
        this.proNumber = proNumber == null ? null : proNumber.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getPdtNo() {
        return pdtNo;
    }

    public void setPdtNo(String pdtNo) {
        this.pdtNo = pdtNo == null ? null : pdtNo.trim();
    }

    public String getBversionName() {
        return bversionName;
    }

    public void setBversionName(String bversionName) {
        this.bversionName = bversionName == null ? null : bversionName.trim();
    }

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName == null ? null : pdtName.trim();
    }

    public String getProlineName() {
        return prolineName;
    }

    public void setProlineName(String prolineName) {
        this.prolineName = prolineName == null ? null : prolineName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}