package com.pojo;

import java.io.Serializable;

public class Shops implements Serializable{
	private int spid;
	private String spname;
	private String sptype;
	private double spprice;
	private String spimg;
	private String spflag;
	
	public Shops(){
		
	}
	public Shops(int pid ,String pname,String ptype,double pprice ,String pimg,String pflag){
		super();
		this.spid=pid;
		this.spname=pname;
		this.sptype=ptype;
		this.spprice=pprice;
		this.spimg=pimg;
		this.spflag=pflag;
	}
	
	public Shops(String pname,String ptype,double pprice ,String pimg,String pflag){
		super();   
		this.spname=pname;
		this.sptype=ptype;
		this.spprice=pprice;
		this.spimg=pimg;
		this.spflag=pflag;
	}
	
	public Shops(int pid){
		super();
		this.spid=pid; 
	}
	
	public Shops( String pname,String ptype ,String pflag){
		super(); 
		this.spname=pname;
		this.sptype=ptype; 
		this.spflag=pflag;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getSptype() {
		return sptype;
	}
	public void setSptype(String sptype) {
		this.sptype = sptype;
	}
	public double getSpprice() {
		return spprice;
	}
	public void setSpprice(double spprice) {
		this.spprice = spprice;
	}
	public String getSpimg() {
		return spimg;
	}
	public void setSpimg(String spimg) {
		this.spimg = spimg;
	}
	public String getSpflag() {
		return spflag;
	}
	public void setSpflag(String spflag) {
		this.spflag = spflag;
	}
	 
}
