package com.h3c.mds.flowable.entity;

public class PdmPartView {
    private String respparty;

    private String h3secondleveldept;

    private String s1contactphonenum;

    private String documentname;

    private String s1partnumber;

    private String s1partdescelements;

    private String s1internalmodel;

    private String s1intenglishdesc;

    private String s1extchinesedesc;

    private String s1extenglishdesc;

    public String getRespparty() {
        return respparty;
    }

    public void setRespparty(String respparty) {
        this.respparty = respparty == null ? null : respparty.trim();
    }

    public String getH3secondleveldept() {
        return h3secondleveldept;
    }

    public void setH3secondleveldept(String h3secondleveldept) {
        this.h3secondleveldept = h3secondleveldept == null ? null : h3secondleveldept.trim();
    }

    public String getS1contactphonenum() {
        return s1contactphonenum;
    }

    public void setS1contactphonenum(String s1contactphonenum) {
        this.s1contactphonenum = s1contactphonenum == null ? null : s1contactphonenum.trim();
    }

    public String getDocumentname() {
        return documentname;
    }

    public void setDocumentname(String documentname) {
        this.documentname = documentname == null ? null : documentname.trim();
    }

    public String getS1partnumber() {
        return s1partnumber;
    }

    public void setS1partnumber(String s1partnumber) {
        this.s1partnumber = s1partnumber == null ? null : s1partnumber.trim();
    }

    public String getS1partdescelements() {
        return s1partdescelements;
    }

    public void setS1partdescelements(String s1partdescelements) {
        this.s1partdescelements = s1partdescelements == null ? null : s1partdescelements.trim();
    }

    public String getS1internalmodel() {
        return s1internalmodel;
    }

    public void setS1internalmodel(String s1internalmodel) {
        this.s1internalmodel = s1internalmodel == null ? null : s1internalmodel.trim();
    }

    public String getS1intenglishdesc() {
        return s1intenglishdesc;
    }

    public void setS1intenglishdesc(String s1intenglishdesc) {
        this.s1intenglishdesc = s1intenglishdesc == null ? null : s1intenglishdesc.trim();
    }

    public String getS1extchinesedesc() {
        return s1extchinesedesc;
    }

    public void setS1extchinesedesc(String s1extchinesedesc) {
        this.s1extchinesedesc = s1extchinesedesc == null ? null : s1extchinesedesc.trim();
    }

    public String getS1extenglishdesc() {
        return s1extenglishdesc;
    }

    public void setS1extenglishdesc(String s1extenglishdesc) {
        this.s1extenglishdesc = s1extenglishdesc == null ? null : s1extenglishdesc.trim();
    }
}