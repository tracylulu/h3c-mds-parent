package com.h3c.mds.flowable.entity;

public class IbdsInitLog {
    private Integer id;

    private String type;

    private String isinit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIsinit() {
        return isinit;
    }

    public void setIsinit(String isinit) {
        this.isinit = isinit == null ? null : isinit.trim();
    }
}