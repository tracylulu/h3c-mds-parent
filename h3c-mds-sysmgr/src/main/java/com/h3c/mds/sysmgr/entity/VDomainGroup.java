package com.h3c.mds.sysmgr.entity;

import java.util.Date;

public class VDomainGroup {
    private Integer dgid;

    private String groupname;

    private String adminname;

    private String groupdesc;

    private Date synctime;

    private String member;

    public Integer getDgid() {
        return dgid;
    }

    public void setDgid(Integer dgid) {
        this.dgid = dgid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getGroupdesc() {
        return groupdesc;
    }

    public void setGroupdesc(String groupdesc) {
        this.groupdesc = groupdesc == null ? null : groupdesc.trim();
    }

    public Date getSynctime() {
        return synctime;
    }

    public void setSynctime(Date synctime) {
        this.synctime = synctime;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }
}