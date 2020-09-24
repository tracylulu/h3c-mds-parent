package com.h3c.mds.basicinfo.entity;

import java.util.Date;

public class IBDS_People_Item_APPLY {
    private Integer id;

    private Integer pId;

    private String procode;

    private String proname;

    private String rolename;

    private String columnname;

    private String oldpeoples;

    private String newpeoples;

    private String issync;

    private String status;

    private String creator;

    private Date createtime;

    private String modifier;

    private Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode == null ? null : procode.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getOldpeoples() {
        return oldpeoples;
    }

    public void setOldpeoples(String oldpeoples) {
        this.oldpeoples = oldpeoples == null ? null : oldpeoples.trim();
    }

    public String getNewpeoples() {
        return newpeoples;
    }

    public void setNewpeoples(String newpeoples) {
        this.newpeoples = newpeoples == null ? null : newpeoples.trim();
    }

    public String getIssync() {
        return issync;
    }

    public void setIssync(String issync) {
        this.issync = issync == null ? null : issync.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}