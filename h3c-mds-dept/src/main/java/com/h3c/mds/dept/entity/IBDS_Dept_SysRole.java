package com.h3c.mds.dept.entity;

public class IBDS_Dept_SysRole {
    private Integer id;

    private String roletypecode;

    private String roletype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoletypecode() {
        return roletypecode;
    }

    public void setRoletypecode(String roletypecode) {
        this.roletypecode = roletypecode == null ? null : roletypecode.trim();
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }
}