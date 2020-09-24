package com.h3c.mds.utils.entity;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;

public class TestBean implements Serializable {

	private static final long serialVersionUID = -988524936403030155L;

	private String id;

	private String name;

	private Integer age;

	private Date birthday;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "TestBean [id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}

}
