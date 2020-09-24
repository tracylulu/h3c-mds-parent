package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class IBDS_VR_PROCESS {
    private Integer id;

    private String applyCode;

    private String status;

    private String handler;

    private String instanseId;

    private String currentnode;

    private String statusDesc;

    private String firstSign;

    private Date firstDate;

    private String ipmtSign;

    private Date ipmtDate;

    private String ipmtOpinion;

    private String ipmtResult;

    private String creator;

    private Date createtime;

    private String modifier;

    private Date modifytime;

    private String fileId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getInstanseId() {
        return instanseId;
    }

    public void setInstanseId(String instanseId) {
        this.instanseId = instanseId == null ? null : instanseId.trim();
    }

    public String getCurrentnode() {
        return currentnode;
    }

    public void setCurrentnode(String currentnode) {
        this.currentnode = currentnode == null ? null : currentnode.trim();
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }

    public String getFirstSign() {
        return firstSign;
    }

    public void setFirstSign(String firstSign) {
        this.firstSign = firstSign == null ? null : firstSign.trim();
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public String getIpmtSign() {
        return ipmtSign;
    }

    public void setIpmtSign(String ipmtSign) {
        this.ipmtSign = ipmtSign == null ? null : ipmtSign.trim();
    }

    public Date getIpmtDate() {
        return ipmtDate;
    }

    public void setIpmtDate(Date ipmtDate) {
        this.ipmtDate = ipmtDate;
    }

    public String getIpmtOpinion() {
        return ipmtOpinion;
    }

    public void setIpmtOpinion(String ipmtOpinion) {
        this.ipmtOpinion = ipmtOpinion == null ? null : ipmtOpinion.trim();
    }

    public String getIpmtResult() {
        return ipmtResult;
    }

    public void setIpmtResult(String ipmtResult) {
        this.ipmtResult = ipmtResult == null ? null : ipmtResult.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }
}