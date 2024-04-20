package com.constructor.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eb.employee.Employee;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		
		Post p = (Post)ctx.getBean("p");
		p.disp();

	}

}
