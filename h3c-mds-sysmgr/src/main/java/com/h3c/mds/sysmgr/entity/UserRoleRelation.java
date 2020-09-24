package com.h3c.mds.sysmgr.entity;

public class UserRoleRelation {
    private Integer hurrId;

    private String hurrHulCode;

    private String hurrHrlCode;

    public Integer getHurrId() {
        return hurrId;
    }

    public void setHurrId(Integer hurrId) {
        this.hurrId = hurrId;
    }

    public String getHurrHulCode() {
        return hurrHulCode;
    }

    public void setHurrHulCode(String hurrHulCode) {
        this.hurrHulCode = hurrHulCode == null ? null : hurrHulCode.trim();
    }

    public String getHurrHrlCode() {
        return hurrHrlCode;
    }

    public void setHurrHrlCode(String hurrHrlCode) {
        this.hurrHrlCode = hurrHrlCode == null ? null : hurrHrlCode.trim();
    }
}