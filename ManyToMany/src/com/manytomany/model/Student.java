package com.manytomany.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "STUDENT_ID")

	private int studentid;
	@Column(name = "First_Name")
	private String firstname;
	@Column(name = "Last_Name")
	private String lastname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_SUBJECT", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "SUBJECT_ID") })
	private List<Subject> subjects = new ArrayList< >();
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstname=" + firstname + ", lastname=" + lastname + ", subjects="
				+ subjects + "]";
	}
	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
