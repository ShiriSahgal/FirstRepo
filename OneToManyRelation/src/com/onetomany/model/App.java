package com.onetomany.model;

import java.util.Set;

public class App {
	private int appid;
	private String appname;
	private Set<Mobile>mobile;
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public Set<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(Set<Mobile> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "App [appid=" + appid + ", appname=" + appname + ", mobile=" + mobile + "]";
	}
	public App(int appid, String appname, Set<Mobile> mobile) {
		super();
		this.appid = appid;
		this.appname = appname;
		this.mobile = mobile;
	}
	public App() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
