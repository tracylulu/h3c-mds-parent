package com.h3c.mds.product.entity;

public class view_projectInfo {
    private String projectno;

    private String fProjno;

    private String project;

    private String engproject;

    private String fReleaseno;

    private String fReleasename;

    private String fBversionno;

    private String fBversionname;

    public String getProjectno() {
        return projectno;
    }

    public void setProjectno(String projectno) {
        this.projectno = projectno == null ? null : projectno.trim();
    }

    public String getfProjno() {
        return fProjno;
    }

    public void setfProjno(String fProjno) {
        this.fProjno = fProjno == null ? null : fProjno.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getEngproject() {
        return engproject;
    }

    public void setEngproject(String engproject) {
        this.engproject = engproject == null ? null : engproject.trim();
    }

    public String getfReleaseno() {
        return fReleaseno;
    }

    public void setfReleaseno(String fReleaseno) {
        this.fReleaseno = fReleaseno == null ? null : fReleaseno.trim();
    }

    public String getfReleasename() {
        return fReleasename;
    }

    public void setfReleasename(String fReleasename) {
        this.fReleasename = fReleasename == null ? null : fReleasename.trim();
    }

    public String getfBversionno() {
        return fBversionno;
    }

    public void setfBversionno(String fBversionno) {
        this.fBversionno = fBversionno == null ? null : fBversionno.trim();
    }

    public String getfBversionname() {
        return fBversionname;
    }

    public void setfBversionname(String fBversionname) {
        this.fBversionname = fBversionname == null ? null : fBversionname.trim();
    }
}