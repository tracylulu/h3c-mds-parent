package com.h3c.mds.sysmgr.entity;

public class IBDS_User_Resource {
    private Integer id;

    private String hrrrHulCode;

    private String hrrrHresCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHrrrHulCode() {
        return hrrrHulCode;
    }

    public void setHrrrHulCode(String hrrrHulCode) {
        this.hrrrHulCode = hrrrHulCode == null ? null : hrrrHulCode.trim();
    }

    public String getHrrrHresCode() {
        return hrrrHresCode;
    }

    public void setHrrrHresCode(String hrrrHresCode) {
        this.hrrrHresCode = hrrrHresCode == null ? null : hrrrHresCode.trim();
    }
}