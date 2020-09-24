package com.h3c.mds.dept.entity;

import java.util.Date;

public class IbdsDeptCoaDataRecord {
    private Integer id;

    private String sapcode;

    private String personcode;

    private String passflag;

    private Date passtime;
    
    private String other;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSapcode() {
        return sapcode;
    }

    public void setSapcode(String sapcode) {
        this.sapcode = sapcode == null ? null : sapcode.trim();
    }

   

    public String getPersoncode() {
        return personcode;
    }

    public void setPersoncode(String personcode) {
        this.personcode = personcode == null ? null : personcode.trim();
    }

	public String getPassflag() {
		return passflag;
	}

	public void setPassflag(String passflag) {
		this.passflag = passflag;
	}

	public Date getPasstime() {
		return passtime;
	}

	public void setPasstime(Date passtime) {
		this.passtime = passtime;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

   

    
    
    
}