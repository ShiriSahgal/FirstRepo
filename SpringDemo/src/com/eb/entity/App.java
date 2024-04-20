package com.eb.entity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Menu m1 = (Menu)ctx.getBean("m");
		m1.show();
		
	}
	

}
