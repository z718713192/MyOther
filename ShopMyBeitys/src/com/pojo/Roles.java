package com.pojo;

import java.io.Serializable; 
import java.util.HashSet;
import java.util.Set;

public class Roles implements Serializable {
	private int rid;
	private String rname;
	 

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}
 
}	
