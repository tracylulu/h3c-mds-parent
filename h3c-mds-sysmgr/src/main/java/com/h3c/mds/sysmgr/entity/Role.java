package com.h3c.mds.sysmgr.entity;

import java.util.Date;

public class Role {
    private Integer hrlId;

    private String hrlName;

    private String hrlCode;

    private String hrlCreateUser;

    private Date hrlCreateDate;

    private String hrlModifyUser;

    private Date hrlModifyDate;

    private Integer flag;

    private String remark;

    public Integer getHrlId() {
        return hrlId;
    }

    public void setHrlId(Integer hrlId) {
        this.hrlId = hrlId;
    }

    public String getHrlName() {
        return hrlName;
    }

    public void setHrlName(String hrlName) {
        this.hrlName = hrlName == null ? null : hrlName.trim();
    }

    public String getHrlCode() {
        return hrlCode;
    }

    public void setHrlCode(String hrlCode) {
        this.hrlCode = hrlCode == null ? null : hrlCode.trim();
    }

    public String getHrlCreateUser() {
        return hrlCreateUser;
    }

    public void setHrlCreateUser(String hrlCreateUser) {
        this.hrlCreateUser = hrlCreateUser == null ? null : hrlCreateUser.trim();
    }

    public Date getHrlCreateDate() {
        return hrlCreateDate;
    }

    public void setHrlCreateDate(Date hrlCreateDate) {
        this.hrlCreateDate = hrlCreateDate;
    }

    public String getHrlModifyUser() {
        return hrlModifyUser;
    }

    public void setHrlModifyUser(String hrlModifyUser) {
        this.hrlModifyUser = hrlModifyUser == null ? null : hrlModifyUser.trim();
    }

    public Date getHrlModifyDate() {
        return hrlModifyDate;
    }

    public void setHrlModifyDate(Date hrlModifyDate) {
        this.hrlModifyDate = hrlModifyDate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}