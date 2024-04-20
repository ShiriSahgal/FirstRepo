package com.eb.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exam {
	private int examId;
	
	private String subject;
	
	private Map<String,Integer>studentInfo;

	public Exam(int examId, String subject, Map<String, Integer> studentInfo) {
		super();
		this.examId = examId;
		this.subject = subject;
		this.studentInfo = studentInfo;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void info() {
		System.out.println("Exam Id:"+examId+"\nSubject Name:"+subject);
		
		Set<Entry<String,Integer>>set=studentInfo.entrySet();
		
		Iterator<Entry<String,Integer>>itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,Integer>entry=itr.next();
			System.out.println("Student Name:"+entry.getKey()+"\nSubject Marks:"+entry.getValue());
		}
	}
	
	
}
