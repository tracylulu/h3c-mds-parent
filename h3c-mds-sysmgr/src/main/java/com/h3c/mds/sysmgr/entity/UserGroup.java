package com.h3c.mds.sysmgr.entity;

import java.util.Date;

public class UserGroup {
    private Integer id;

    private String notesgroup;

    private String admpgroup;

    private String groupusercode;

    private String createuser;

    private Date createdate;

    private String modifyuser;

    private Date modifydate;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotesgroup() {
        return notesgroup;
    }

    public void setNotesgroup(String notesgroup) {
        this.notesgroup = notesgroup == null ? null : notesgroup.trim();
    }

    public String getAdmpgroup() {
        return admpgroup;
    }

    public void setAdmpgroup(String admpgroup) {
        this.admpgroup = admpgroup == null ? null : admpgroup.trim();
    }

    public String getGroupusercode() {
        return groupusercode;
    }

    public void setGroupusercode(String groupusercode) {
        this.groupusercode = groupusercode == null ? null : groupusercode.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser == null ? null : modifyuser.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}