package com.h3c.mds.sysmgr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NotesGroup {
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

    private String uda11516;

    private String uda11517;

    private Date uda11518;

    private String uda11519;

    private Date uda11520;

    private BigDecimal uda11521;

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

    public String getUda11516() {
        return uda11516;
    }

    public void setUda11516(String uda11516) {
        this.uda11516 = uda11516 == null ? null : uda11516.trim();
    }

    public String getUda11517() {
        return uda11517;
    }

    public void setUda11517(String uda11517) {
        this.uda11517 = uda11517 == null ? null : uda11517.trim();
    }

    public Date getUda11518() {
        return uda11518;
    }

    public void setUda11518(Date uda11518) {
        this.uda11518 = uda11518;
    }

    public String getUda11519() {
        return uda11519;
    }

    public void setUda11519(String uda11519) {
        this.uda11519 = uda11519 == null ? null : uda11519.trim();
    }

    public Date getUda11520() {
        return uda11520;
    }

    public void setUda11520(Date uda11520) {
        this.uda11520 = uda11520;
    }

    public BigDecimal getUda11521() {
        return uda11521;
    }

    public void setUda11521(BigDecimal uda11521) {
        this.uda11521 = uda11521;
    }

    public byte[] getLastchgts() {
        return lastchgts;
    }

    public void setLastchgts(byte[] lastchgts) {
        this.lastchgts = lastchgts;
    }
}