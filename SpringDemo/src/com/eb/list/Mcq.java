package com.eb.list;

import java.util.Iterator;
import java.util.List;

public class Mcq {
	private int quesid;
	private String quesname;
	private List<String>Answers;
	public Mcq(int quesid, String quesname, List<String> answers) {
		super();
		this.quesid = quesid;
		this.quesname = quesname;
		Answers = answers;
	}
	public Mcq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println("Question Id:"+quesid+"\nQuestion Name:"+quesname);
		Iterator<String>itr=Answers.iterator();
		
		while(itr.hasNext()) {
			System.out.println((itr.next()));
		
	}

	}}
