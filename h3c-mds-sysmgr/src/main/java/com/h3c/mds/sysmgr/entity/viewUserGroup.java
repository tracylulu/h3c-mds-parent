package com.h3c.mds.sysmgr.entity;

public class viewUserGroup {
    private Integer serial;

    private String usercode;

    private String groupname;

    private String name;

    private String uda10509;

    private String uda10512;

    private String code;

    private String showname;

    private String deptcode;

    private String deptname;

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUda10509() {
        return uda10509;
    }

    public void setUda10509(String uda10509) {
        this.uda10509 = uda10509 == null ? null : uda10509.trim();
    }

    public String getUda10512() {
        return uda10512;
    }

    public void setUda10512(String uda10512) {
        this.uda10512 = uda10512 == null ? null : uda10512.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}