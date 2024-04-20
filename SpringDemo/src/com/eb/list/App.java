package com.eb.list;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eb.entity.Menu;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		Mcq mq = (Mcq)ctx.getBean("M");
		mq.show();
		

	}

}
