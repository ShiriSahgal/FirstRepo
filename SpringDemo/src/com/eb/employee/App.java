package com.eb.employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eb.entity.Menu;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		Employee e = (Employee)ctx.getBean("e");
		e.show();

	}

}
