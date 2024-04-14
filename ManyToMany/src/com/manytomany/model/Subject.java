package com.manytomany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="SUBJECT")
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SUBJECT_ID")
	private int subjectid;
	@Column(name="SUBJECT_NAME")
	private String subjectname;
	
	
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
	
	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
	}
	public Subject(String subjectname) {
		super();
		this.subjectname = subjectname;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
