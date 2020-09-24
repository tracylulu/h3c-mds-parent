package com.h3c.mds.sysmgr.entity;

import java.util.Date;

public class LoginLog {
    private Integer id;

    private String operator;

    private Date opttime;

    private String clientip;

    private String optdesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOpttime() {
        return opttime;
    }

    public void setOpttime(Date opttime) {
        this.opttime = opttime;
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
    }

    public String getOptdesc() {
        return optdesc;
    }

    public void setOptdesc(String optdesc) {
        this.optdesc = optdesc == null ? null : optdesc.trim();
    }
}