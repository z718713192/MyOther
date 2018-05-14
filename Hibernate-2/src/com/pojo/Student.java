package com.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Hibernate的映射类 单向的多对一关系
 */
public class Student implements Serializable {

	private int stuid;
	private String stuname;
	private int age;
	private Date brithday;
	/**
	 * 学生与班级的关系是多对一
	 */
	private Clazz clazz;

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

}
