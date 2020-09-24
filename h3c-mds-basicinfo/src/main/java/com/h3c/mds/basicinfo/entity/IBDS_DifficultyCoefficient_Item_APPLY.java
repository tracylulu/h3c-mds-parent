package com.h3c.mds.basicinfo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IBDS_DifficultyCoefficient_Item_APPLY {
    private Integer id;

    private Integer diffId;

    private String bversionno;

    private String bversion;

    private BigDecimal prodifficult;

    private BigDecimal harddifficult;

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

    public Integer getDiffId() {
        return diffId;
    }

    public void setDiffId(Integer diffId) {
        this.diffId = diffId;
    }

    public String getBversionno() {
        return bversionno;
    }

    public void setBversionno(String bversionno) {
        this.bversionno = bversionno == null ? null : bversionno.trim();
    }

    public String getBversion() {
        return bversion;
    }

    public void setBversion(String bversion) {
        this.bversion = bversion == null ? null : bversion.trim();
    }

    public BigDecimal getProdifficult() {
        return prodifficult;
    }

    public void setProdifficult(BigDecimal prodifficult) {
        this.prodifficult = prodifficult;
    }

    public BigDecimal getHarddifficult() {
        return harddifficult;
    }

    public void setHarddifficult(BigDecimal harddifficult) {
        this.harddifficult = harddifficult;
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