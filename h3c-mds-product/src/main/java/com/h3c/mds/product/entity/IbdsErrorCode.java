package com.h3c.mds.product.entity;

import java.util.Date;

public class IbdsErrorCode {
    private Integer id;

    private String type;

    private String name;

    private String code;

    private String createUser;

    private Date createTime;

    private String cause;

    private String projectcodetmp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getProjectcodetmp() {
        return projectcodetmp;
    }

    public void setProjectcodetmp(String projectcodetmp) {
        this.projectcodetmp = projectcodetmp == null ? null : projectcodetmp.trim();
    }
}