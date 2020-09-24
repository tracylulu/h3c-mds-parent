package com.h3c.mds.flowable.entity;

import java.util.Date;

public class Bom {
    private String obid;

    private String s1partnumber;

    private String s1partrevision;

    private String s1parttemplate;

    private String thhxh;

    private String s1partdescelements;

    private String s1extchinesedesc;

    private String s1intenglishdesc;

    private String s1extenglishdesc;

    private String s1internalmodel;

    private String s1externalmodel;

    private String defaultunitofmeasure;

    private String s1partstatus;

    private String h3productline;

    private String s2productpdt;

    private String h3product;

    private String projectname;

    private String h3productrrevision;

    private String h3productbrevision;

    private String s2isallowsend;

    private Date tzActualreldate;

    public String getObid() {
        return obid;
    }

    public void setObid(String obid) {
        this.obid = obid == null ? null : obid.trim();
    }

    public String getS1partnumber() {
        return s1partnumber;
    }

    public void setS1partnumber(String s1partnumber) {
        this.s1partnumber = s1partnumber == null ? null : s1partnumber.trim();
    }

    public String getS1partrevision() {
        return s1partrevision;
    }

    public void setS1partrevision(String s1partrevision) {
        this.s1partrevision = s1partrevision == null ? null : s1partrevision.trim();
    }

    public String getS1parttemplate() {
        return s1parttemplate;
    }

    public void setS1parttemplate(String s1parttemplate) {
        this.s1parttemplate = s1parttemplate == null ? null : s1parttemplate.trim();
    }

    public String getThhxh() {
        return thhxh;
    }

    public void setThhxh(String thhxh) {
        this.thhxh = thhxh == null ? null : thhxh.trim();
    }

    public String getS1partdescelements() {
        return s1partdescelements;
    }

    public void setS1partdescelements(String s1partdescelements) {
        this.s1partdescelements = s1partdescelements == null ? null : s1partdescelements.trim();
    }

    public String getS1extchinesedesc() {
        return s1extchinesedesc;
    }

    public void setS1extchinesedesc(String s1extchinesedesc) {
        this.s1extchinesedesc = s1extchinesedesc == null ? null : s1extchinesedesc.trim();
    }

    public String getS1intenglishdesc() {
        return s1intenglishdesc;
    }

    public void setS1intenglishdesc(String s1intenglishdesc) {
        this.s1intenglishdesc = s1intenglishdesc == null ? null : s1intenglishdesc.trim();
    }

    public String getS1extenglishdesc() {
        return s1extenglishdesc;
    }

    public void setS1extenglishdesc(String s1extenglishdesc) {
        this.s1extenglishdesc = s1extenglishdesc == null ? null : s1extenglishdesc.trim();
    }

    public String getS1internalmodel() {
        return s1internalmodel;
    }

    public void setS1internalmodel(String s1internalmodel) {
        this.s1internalmodel = s1internalmodel == null ? null : s1internalmodel.trim();
    }

    public String getS1externalmodel() {
        return s1externalmodel;
    }

    public void setS1externalmodel(String s1externalmodel) {
        this.s1externalmodel = s1externalmodel == null ? null : s1externalmodel.trim();
    }

    public String getDefaultunitofmeasure() {
        return defaultunitofmeasure;
    }

    public void setDefaultunitofmeasure(String defaultunitofmeasure) {
        this.defaultunitofmeasure = defaultunitofmeasure == null ? null : defaultunitofmeasure.trim();
    }

    public String getS1partstatus() {
        return s1partstatus;
    }

    public void setS1partstatus(String s1partstatus) {
        this.s1partstatus = s1partstatus == null ? null : s1partstatus.trim();
    }

    public String getH3productline() {
        return h3productline;
    }

    public void setH3productline(String h3productline) {
        this.h3productline = h3productline == null ? null : h3productline.trim();
    }

    public String getS2productpdt() {
        return s2productpdt;
    }

    public void setS2productpdt(String s2productpdt) {
        this.s2productpdt = s2productpdt == null ? null : s2productpdt.trim();
    }

    public String getH3product() {
        return h3product;
    }

    public void setH3product(String h3product) {
        this.h3product = h3product == null ? null : h3product.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getH3productrrevision() {
        return h3productrrevision;
    }

    public void setH3productrrevision(String h3productrrevision) {
        this.h3productrrevision = h3productrrevision == null ? null : h3productrrevision.trim();
    }

    public String getH3productbrevision() {
        return h3productbrevision;
    }

    public void setH3productbrevision(String h3productbrevision) {
        this.h3productbrevision = h3productbrevision == null ? null : h3productbrevision.trim();
    }

    public String getS2isallowsend() {
        return s2isallowsend;
    }

    public void setS2isallowsend(String s2isallowsend) {
        this.s2isallowsend = s2isallowsend == null ? null : s2isallowsend.trim();
    }

    public Date getTzActualreldate() {
        return tzActualreldate;
    }

    public void setTzActualreldate(Date tzActualreldate) {
        this.tzActualreldate = tzActualreldate;
    }
}