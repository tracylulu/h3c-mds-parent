package com.h3c.mds.sysmgr.entity;

import java.util.Date;
import java.util.List;

public class Resource {
    private Integer hresId;

    private String hresPcode;

    private String hresName;

    private String hresCode;

    private String hresContent;

    private String hresCreateUser;

    private Date hresCreateDate;

    private String hresModifyUser;

    private Date hresModifyDate;

    private Integer hresSort;

    private String resourceType;

    private String flag;

    private String remark;
    
    private List<Resource> childs;
    
    private String state;
    
    private String isshow;
    
    private String hresType;
    
    private boolean checked;

    public Integer getHresId() {
        return hresId;
    }

    public void setHresId(Integer hresId) {
        this.hresId = hresId;
    }

    public String getHresPcode() {
        return hresPcode;
    }

    public void setHresPcode(String hresPcode) {
        this.hresPcode = hresPcode == null ? null : hresPcode.trim();
    }

    public String getHresName() {
        return hresName;
    }

    public void setHresName(String hresName) {
        this.hresName = hresName == null ? null : hresName.trim();
    }

    public String getHresCode() {
        return hresCode;
    }

    public void setHresCode(String hresCode) {
        this.hresCode = hresCode == null ? null : hresCode.trim();
    }

    public String getHresContent() {
        return hresContent;
    }

    public void setHresContent(String hresContent) {
        this.hresContent = hresContent == null ? null : hresContent.trim();
    }

    public String getHresCreateUser() {
        return hresCreateUser;
    }

    public void setHresCreateUser(String hresCreateUser) {
        this.hresCreateUser = hresCreateUser == null ? null : hresCreateUser.trim();
    }

    public Date getHresCreateDate() {
        return hresCreateDate;
    }

    public void setHresCreateDate(Date hresCreateDate) {
        this.hresCreateDate = hresCreateDate;
    }

    public String getHresModifyUser() {
        return hresModifyUser;
    }

    public void setHresModifyUser(String hresModifyUser) {
        this.hresModifyUser = hresModifyUser == null ? null : hresModifyUser.trim();
    }

    public Date getHresModifyDate() {
        return hresModifyDate;
    }

    public void setHresModifyDate(Date hresModifyDate) {
        this.hresModifyDate = hresModifyDate;
    }

    public Integer getHresSort() {
        return hresSort;
    }

    public void setHresSort(Integer hresSort) {
        this.hresSort = hresSort;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    public String getIsshow() {
    	return isshow;
    }
    
    public void setIsshow(String isshow) {
    	 this.isshow = isshow == null ? null : isshow.trim();
    }
    
    public String getHresType() {
    	return hresType;
    }
    
    public void setHresType(String hresType) {
    	 this.hresType = hresType == null ? null : hresType.trim();
    }
    

	public List<Resource> getChilds() {
		return childs;
	}

	public void setChilds(List<Resource> childs) {
		this.childs = childs;
	}
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

	public boolean getChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (checked ? 1231 : 1237);
		result = prime * result + ((childs == null) ? 0 : childs.hashCode());
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result
				+ ((hresCode == null) ? 0 : hresCode.hashCode());
		result = prime * result
				+ ((hresContent == null) ? 0 : hresContent.hashCode());
		result = prime * result
				+ ((hresCreateDate == null) ? 0 : hresCreateDate.hashCode());
		result = prime * result
				+ ((hresCreateUser == null) ? 0 : hresCreateUser.hashCode());
		result = prime * result + ((hresId == null) ? 0 : hresId.hashCode());
		result = prime * result
				+ ((hresModifyDate == null) ? 0 : hresModifyDate.hashCode());
		result = prime * result
				+ ((hresModifyUser == null) ? 0 : hresModifyUser.hashCode());
		result = prime * result
				+ ((hresName == null) ? 0 : hresName.hashCode());
		result = prime * result
				+ ((hresPcode == null) ? 0 : hresPcode.hashCode());
		result = prime * result
				+ ((hresSort == null) ? 0 : hresSort.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result
				+ ((resourceType == null) ? 0 : resourceType.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resource other = (Resource) obj;
		if (checked != other.checked)
			return false;
		if (childs == null) {
			if (other.childs != null)
				return false;
		} else if (!childs.equals(other.childs))
			return false;
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (hresCode == null) {
			if (other.hresCode != null)
				return false;
		} else if (!hresCode.equals(other.hresCode))
			return false;
		if (hresContent == null) {
			if (other.hresContent != null)
				return false;
		} else if (!hresContent.equals(other.hresContent))
			return false;
		if (hresCreateDate == null) {
			if (other.hresCreateDate != null)
				return false;
		} else if (!hresCreateDate.equals(other.hresCreateDate))
			return false;
		if (hresCreateUser == null) {
			if (other.hresCreateUser != null)
				return false;
		} else if (!hresCreateUser.equals(other.hresCreateUser))
			return false;
		if (hresId == null) {
			if (other.hresId != null)
				return false;
		} else if (!hresId.equals(other.hresId))
			return false;
		if (hresModifyDate == null) {
			if (other.hresModifyDate != null)
				return false;
		} else if (!hresModifyDate.equals(other.hresModifyDate))
			return false;
		if (hresModifyUser == null) {
			if (other.hresModifyUser != null)
				return false;
		} else if (!hresModifyUser.equals(other.hresModifyUser))
			return false;
		if (hresName == null) {
			if (other.hresName != null)
				return false;
		} else if (!hresName.equals(other.hresName))
			return false;
		if (hresPcode == null) {
			if (other.hresPcode != null)
				return false;
		} else if (!hresPcode.equals(other.hresPcode))
			return false;
		if (hresSort == null) {
			if (other.hresSort != null)
				return false;
		} else if (!hresSort.equals(other.hresSort))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (resourceType == null) {
			if (other.resourceType != null)
				return false;
		} else if (!resourceType.equals(other.resourceType))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	

	
    
    
}