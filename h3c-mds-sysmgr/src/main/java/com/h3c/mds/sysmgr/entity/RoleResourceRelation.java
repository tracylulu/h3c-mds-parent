package com.h3c.mds.sysmgr.entity;

public class RoleResourceRelation {
    private Integer hrrrId;

    private String hrrrHrlCode;

    private String hrrrHresCode;

    public Integer getHrrrId() {
        return hrrrId;
    }

    public void setHrrrId(Integer hrrrId) {
        this.hrrrId = hrrrId;
    }

    public String getHrrrHrlCode() {
        return hrrrHrlCode;
    }

    public void setHrrrHrlCode(String hrrrHrlCode) {
        this.hrrrHrlCode = hrrrHrlCode == null ? null : hrrrHrlCode.trim();
    }

    public String getHrrrHresCode() {
        return hrrrHresCode;
    }

    public void setHrrrHresCode(String hrrrHresCode) {
        this.hrrrHresCode = hrrrHresCode == null ? null : hrrrHresCode.trim();
    }
}