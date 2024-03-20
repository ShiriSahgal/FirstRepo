package com.march20;

import java.util.function.Function;

interface info{
	CourseInfo	get(String info);
}
class CourseInfo{
	CourseInfo(String info){
		System.out.println(info);
	}
}
class Company{
	Company(String name){
		System.out.println("Comany Name:"+name);
	}
}
public class Mr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info f=CourseInfo::new;
		f.get("java full stack");
		Function<String,Company>bb=Company::new;
 
		bb.apply("Capgemini");
	}

}
