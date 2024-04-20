package com.one2one.model;

public class Customer {
	private int custid;
	private String custFname;
	private String cutsLname;
	private String email;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustFname() {
		return custFname;
	}
	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}
	public String getCutsLname() {
		return cutsLname;
	}
	public void setCutsLname(String cutsLname) {
		this.cutsLname = cutsLname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custFname=" + custFname + ", cutsLname=" + cutsLname + ", email="
				+ email + "]";
	}
	public Customer(int custid, String custFname, String cutsLname, String email) {
		super();
		this.custid = custid;
		this.custFname = custFname;
		this.cutsLname = cutsLname;
		this.email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
