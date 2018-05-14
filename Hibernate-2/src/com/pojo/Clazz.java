package com.pojo;

import java.io.Serializable;


public class Clazz implements Serializable {

	private int id;// °à¼¶id
	private String name;// °à¼¶Ãû

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
