package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class IBDS_BaseObject_PROCESS {
    private Integer id;

    private String applycode;

    private String status;

    private String responsible;

    private String statusname;

    private String applyType;

    private String remark;

    private String readers;

    private String copyto;

    private String sendto1;

    private String cmoFillname;

    private Date cmoFilltime;

    private String pdtSuggestion;

    private String pdtFillname;

    private Date pdtFilltime;

    private String cmoleaderSuggestion;

    private String cmoleaderFillname;

    private Date cmoleaderFilltime;

    private String instanseId;

    private String checkresult;

    private String editcurrentuser;

    private String assignsign;

    private Date assigndate;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modifyUser;

    private String currentnode;

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

    public String getSendto1() {
        return sendto1;
    }

    public void setSendto1(String sendto1) {
        this.sendto1 = sendto1 == null ? null : sendto1.trim();
    }

    public String getCmoFillname() {
        return cmoFillname;
    }

    public void setCmoFillname(String cmoFillname) {
        this.cmoFillname = cmoFillname == null ? null : cmoFillname.trim();
    }

    public Date getCmoFilltime() {
        return cmoFilltime;
    }

    public void setCmoFilltime(Date cmoFilltime) {
        this.cmoFilltime = cmoFilltime;
    }

    public String getPdtSuggestion() {
        return pdtSuggestion;
    }

    public void setPdtSuggestion(String pdtSuggestion) {
        this.pdtSuggestion = pdtSuggestion == null ? null : pdtSuggestion.trim();
    }

    public String getPdtFillname() {
        return pdtFillname;
    }

    public void setPdtFillname(String pdtFillname) {
        this.pdtFillname = pdtFillname == null ? null : pdtFillname.trim();
    }

    public Date getPdtFilltime() {
        return pdtFilltime;
    }

    public void setPdtFilltime(Date pdtFilltime) {
        this.pdtFilltime = pdtFilltime;
    }

    public String getCmoleaderSuggestion() {
        return cmoleaderSuggestion;
    }

    public void setCmoleaderSuggestion(String cmoleaderSuggestion) {
        this.cmoleaderSuggestion = cmoleaderSuggestion == null ? null : cmoleaderSuggestion.trim();
    }

    public String getCmoleaderFillname() {
        return cmoleaderFillname;
    }

    public void setCmoleaderFillname(String cmoleaderFillname) {
        this.cmoleaderFillname = cmoleaderFillname == null ? null : cmoleaderFillname.trim();
    }

    public Date getCmoleaderFilltime() {
        return cmoleaderFilltime;
    }

    public void setCmoleaderFilltime(Date cmoleaderFilltime) {
        this.cmoleaderFilltime = cmoleaderFilltime;
    }

    public String getInstanseId() {
        return instanseId;
    }

    public void setInstanseId(String instanseId) {
        this.instanseId = instanseId == null ? null : instanseId.trim();
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

    public String getCurrentnode() {
        return currentnode;
    }

    public void setCurrentnode(String currentnode) {
        this.currentnode = currentnode == null ? null : currentnode.trim();
    }
}