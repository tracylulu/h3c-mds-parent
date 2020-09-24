package com.h3c.mds.product.entity;

import java.util.Date;

public class IBDS_Dic {
    private Integer id;

    private String dicName;

    private String dicValue;

    private String dicTypecode;

    private String dicTypename;

    private Integer flag;

    private String remark;

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

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }

    public String getDicTypecode() {
        return dicTypecode;
    }

    public void setDicTypecode(String dicTypecode) {
        this.dicTypecode = dicTypecode == null ? null : dicTypecode.trim();
    }

    public String getDicTypename() {
        return dicTypename;
    }

    public void setDicTypename(String dicTypename) {
        this.dicTypename = dicTypename == null ? null : dicTypename.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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