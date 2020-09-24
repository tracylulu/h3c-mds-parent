package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class IBDS_Product_PROCESS {
    private Integer id;

    private String applycode;

    private String status;

    private String responsible;

    private String statusname;

    private String applyType;

    private String remark;

    private String readers;

    private String copyto;

    private String popFillname;

    private Date popFilltime;

    private String ipmtSuggestion;

    private String ipmtFillname;

    private Date ipmtFilltime;

    private String checkresult;

    private String editcurrentuser;

    private String assignsign;

    private Date assigndate;

    private String instanseId;

    private String currentNode;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modifyUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplycode() {
        return applycode;
    }

    public void setApplycode(String applycode) {
        this.applycode = applycode == null ? null : applycode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible == null ? null : responsible.trim();
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReaders() {
        return readers;
    }

    public void setReaders(String readers) {
        this.readers = readers == null ? null : readers.trim();
    }

    public String getCopyto() {
        return copyto;
    }

    public void setCopyto(String copyto) {
        this.copyto = copyto == null ? null : copyto.trim();
    }

    public String getPopFillname() {
        return popFillname;
    }

    public void setPopFillname(String popFillname) {
        this.popFillname = popFillname == null ? null : popFillname.trim();
    }

    public Date getPopFilltime() {
        return popFilltime;
    }

    public void setPopFilltime(Date popFilltime) {
        this.popFilltime = popFilltime;
    }

    public String getIpmtSuggestion() {
        return ipmtSuggestion;
    }

    public void setIpmtSuggestion(String ipmtSuggestion) {
        this.ipmtSuggestion = ipmtSuggestion == null ? null : ipmtSuggestion.trim();
    }

    public String getIpmtFillname() {
        return ipmtFillname;
    }

    public void setIpmtFillname(String ipmtFillname) {
        this.ipmtFillname = ipmtFillname == null ? null : ipmtFillname.trim();
    }

    public Date getIpmtFilltime() {
        return ipmtFilltime;
    }

    public void setIpmtFilltime(Date ipmtFilltime) {
        this.ipmtFilltime = ipmtFilltime;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public String getEditcurrentuser() {
        return editcurrentuser;
    }

    public void setEditcurrentuser(String editcurrentuser) {
        this.editcurrentuser = editcurrentuser == null ? null : editcurrentuser.trim();
    }

    public String getAssignsign() {
        return assignsign;
    }

    public void setAssignsign(String assignsign) {
        this.assignsign = assignsign == null ? null : assignsign.trim();
    }

    public Date getAssigndate() {
        return assigndate;
    }

    public void setAssigndate(Date assigndate) {
        this.assigndate = assigndate;
    }

    public String getInstanseId() {
        return instanseId;
    }

    public void setInstanseId(String instanseId) {
        this.instanseId = instanseId == null ? null : instanseId.trim();
    }

    public String getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(String currentNode) {
        this.currentNode = currentNode == null ? null : currentNode.trim();
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
}