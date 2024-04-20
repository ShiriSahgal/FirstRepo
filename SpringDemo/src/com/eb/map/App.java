package com.eb.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[]args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		Exam ex=(Exam)ctx.getBean("em");
		
		ex.info();
	}
	}


