package com.h3c.mds.flowable.entity;

import java.util.Date;

public class ProcessConfigItem {
    private Integer id;

    private String code;

    private String configCode;

    private String content;

    private String type;

    private String note;

    private String pdtCode;

    private String fprodPerson;

    private String pdtMgn;

    private Integer orderBy;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modifyUser;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode == null ? null : configCode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getPdtCode() {
        return pdtCode;
    }

    public void setPdtCode(String pdtCode) {
        this.pdtCode = pdtCode == null ? null : pdtCode.trim();
    }

    public String getFprodPerson() {
        return fprodPerson;
    }

    public void setFprodPerson(String fprodPerson) {
        this.fprodPerson = fprodPerson == null ? null : fprodPerson.trim();
    }

    public String getPdtMgn() {
        return pdtMgn;
    }

    public void setPdtMgn(String pdtMgn) {
        this.pdtMgn = pdtMgn == null ? null : pdtMgn.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}