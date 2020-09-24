package com.h3c.mds.utils.entity;

import org.json.JSONObject;

public class BeanChangeContent<T> {

	public T bef;
	public T aft;
	public ChangeType changeType;
	
	public ChangeType getChangeType() {
		return changeType;
	}

	public void setChangeType(ChangeType changeType) {
		this.changeType = changeType;
	}

	public T getBef() {
		return bef;
	}

	public void setBef(T bef) {
		this.bef = bef;
	}

	public T getAft() {
		return aft;
	}

	public void setAft(T aft) {
		this.aft = aft;
	}
	
	@Override
	public String toString() {
		return "[bef=" + (bef == null ? "" : new JSONObject(bef).toString()) + ", aft="
				+ (aft == null ? "" : new JSONObject(aft).toString()) + ", type=" + changeType + "]";
	}

}
