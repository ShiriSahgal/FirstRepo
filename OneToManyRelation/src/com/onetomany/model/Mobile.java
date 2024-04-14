package com.onetomany.model;

import java.util.Set;

public class Mobile {
	private int mobileid;
	private String mobilename;
	private String mobilecolor;
	private Set<App>app;
	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", mobilename=" + mobilename + ", mobilecolor=" + mobilecolor + ", app="
				+ app + "]";
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public String getMobilecolor() {
		return mobilecolor;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mobileid, String mobilename, String mobilecolor, Set<App> app) {
		super();
		this.mobileid = mobileid;
		this.mobilename = mobilename;
		this.mobilecolor = mobilecolor;
		this.app = app;
	}
	public void setMobilecolor(String mobilecolor) {
		this.mobilecolor = mobilecolor;
	}
	public Set<App> getApp() {
		return app;
	}
	public void setApp(Set<App> app) {
		this.app = app;
	}

}
