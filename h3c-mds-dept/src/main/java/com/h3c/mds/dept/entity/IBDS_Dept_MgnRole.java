package com.h3c.mds.dept.entity;

import java.util.Date;

public class IBDS_Dept_MgnRole {
    private Integer id;

    private String code;

    private String nameeng;

    private String manager;

    private String secretary;

    private String deptplanner;

    private String approver;

    private String abbreviation;

    private String planapprover;

    private String pr;

    private String consignor;

    private String creator;

    private Date createtime;

    private String modifier;

    private Date modifytime;

    private String deleteflag;

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

    public String getNameeng() {
        return nameeng;
    }

    public void setNameeng(String nameeng) {
        this.nameeng = nameeng == null ? null : nameeng.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary == null ? null : secretary.trim();
    }

    public String getDeptplanner() {
        return deptplanner;
    }

    public void setDeptplanner(String deptplanner) {
        this.deptplanner = deptplanner == null ? null : deptplanner.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public String getPlanapprover() {
        return planapprover;
    }

    public void setPlanapprover(String planapprover) {
        this.planapprover = planapprover == null ? null : planapprover.trim();
    }

    public String getPr() {
        return pr;
    }

    public void setPr(String pr) {
        this.pr = pr == null ? null : pr.trim();
    }

    public String getConsignor() {
        return consignor;
    }

    public void setConsignor(String consignor) {
        this.consignor = consignor == null ? null : consignor.trim();
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

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag == null ? null : deleteflag.trim();
    }
}