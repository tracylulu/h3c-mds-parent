package com.h3c.mds.dept.entity;

import java.util.Date;

public class IBDS_Dept_SysPersonRole {
    private Integer id;

    private String sapcode;

    private String roletypecode;

    private String personcode;

    private String creatorcode;

    private Date createtime;
    
    private String personname;

    private String creatorname;

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

    public String getRoletypecode() {
        return roletypecode;
    }

    public void setRoletypecode(String roletypecode) {
        this.roletypecode = roletypecode == null ? null : roletypecode.trim();
    }

    public String getPersoncode() {
        return personcode;
    }

    public void setPersoncode(String personcode) {
        this.personcode = personcode == null ? null : personcode.trim();
    }

    public String getCreatorcode() {
        return creatorcode;
    }

    public void setCreatorcode(String creatorcode) {
        this.creatorcode = creatorcode == null ? null : creatorcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getCreatorname() {
		return creatorname;
	}

	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}
    
    
}