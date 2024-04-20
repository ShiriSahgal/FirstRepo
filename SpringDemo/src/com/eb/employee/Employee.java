package com.eb.employee;

public class Employee {
	private int empid;
	private String empname;
	private String empDesignation;
	private int empSalary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public void show() {
		System.out.println("Employee Id:"+empid+"\nEmployee Name:"+empname+"\nEmployee Designation:"+empDesignation+"\nEmployee Salary:"+empSalary);
	}

}
