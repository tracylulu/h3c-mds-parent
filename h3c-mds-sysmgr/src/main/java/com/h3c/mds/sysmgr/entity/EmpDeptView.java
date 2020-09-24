package com.h3c.mds.sysmgr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EmpDeptView {
    private Integer versionId;

    private Integer id;

    private Byte statusId;

    private Byte validationstatusId;

    private String name;

    private String code;

    private Integer changetrackingmask;

    private Date enterdtm;

    private Integer enteruserid;

    private Integer enterversionid;

    private Date lastchgdtm;

    private Integer lastchguserid;

    private Integer lastchgversionid;

    private Integer asofId;

    private String muid;

    private Integer uda10507;

    private BigDecimal uda10508;

    private String uda10509;

    private String uda10510;

    private String uda10511;

    private String uda10512;

    private String uda10513;

    private String uda10514;

    private String uda10515;

    private String deptname;

    private byte[] lastchgts;

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getStatusId() {
        return statusId;
    }

    public void setStatusId(Byte statusId) {
        this.statusId = statusId;
    }

    public Byte getValidationstatusId() {
        return validationstatusId;
    }

    public void setValidationstatusId(Byte validationstatusId) {
        this.validationstatusId = validationstatusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getChangetrackingmask() {
        return changetrackingmask;
    }

    public void setChangetrackingmask(Integer changetrackingmask) {
        this.changetrackingmask = changetrackingmask;
    }

    public Date getEnterdtm() {
        return enterdtm;
    }

    public void setEnterdtm(Date enterdtm) {
        this.enterdtm = enterdtm;
    }

    public Integer getEnteruserid() {
        return enteruserid;
    }

    public void setEnteruserid(Integer enteruserid) {
        this.enteruserid = enteruserid;
    }

    public Integer getEnterversionid() {
        return enterversionid;
    }

    public void setEnterversionid(Integer enterversionid) {
        this.enterversionid = enterversionid;
    }

    public Date getLastchgdtm() {
        return lastchgdtm;
    }

    public void setLastchgdtm(Date lastchgdtm) {
        this.lastchgdtm = lastchgdtm;
    }

    public Integer getLastchguserid() {
        return lastchguserid;
    }

    public void setLastchguserid(Integer lastchguserid) {
        this.lastchguserid = lastchguserid;
    }

    public Integer getLastchgversionid() {
        return lastchgversionid;
    }

    public void setLastchgversionid(Integer lastchgversionid) {
        this.lastchgversionid = lastchgversionid;
    }

    public Integer getAsofId() {
        return asofId;
    }

    public void setAsofId(Integer asofId) {
        this.asofId = asofId;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid == null ? null : muid.trim();
    }

    public Integer getUda10507() {
        return uda10507;
    }

    public void setUda10507(Integer uda10507) {
        this.uda10507 = uda10507;
    }

    public BigDecimal getUda10508() {
        return uda10508;
    }

    public void setUda10508(BigDecimal uda10508) {
        this.uda10508 = uda10508;
    }

    public String getUda10509() {
        return uda10509;
    }

    public void setUda10509(String uda10509) {
        this.uda10509 = uda10509 == null ? null : uda10509.trim();
    }

    public String getUda10510() {
        return uda10510;
    }

    public void setUda10510(String uda10510) {
        this.uda10510 = uda10510 == null ? null : uda10510.trim();
    }

    public String getUda10511() {
        return uda10511;
    }

    public void setUda10511(String uda10511) {
        this.uda10511 = uda10511 == null ? null : uda10511.trim();
    }

    public String getUda10512() {
        return uda10512;
    }

    public void setUda10512(String uda10512) {
        this.uda10512 = uda10512 == null ? null : uda10512.trim();
    }

    public String getUda10513() {
        return uda10513;
    }

    public void setUda10513(String uda10513) {
        this.uda10513 = uda10513 == null ? null : uda10513.trim();
    }

    public String getUda10514() {
        return uda10514;
    }

    public void setUda10514(String uda10514) {
        this.uda10514 = uda10514 == null ? null : uda10514.trim();
    }

    public String getUda10515() {
        return uda10515;
    }

    public void setUda10515(String uda10515) {
        this.uda10515 = uda10515 == null ? null : uda10515.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public byte[] getLastchgts() {
        return lastchgts;
    }

    public void setLastchgts(byte[] lastchgts) {
        this.lastchgts = lastchgts;
    }
}