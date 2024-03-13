package com.march6.task;
class CourseDetail{
	int id,price;
	String name,duration;
	public CourseDetail() {
		System.out.println("Welcome to Course Information System!!!");
	}
	public CourseDetail(int id , String name,String duration,int price) {
		this.id = id;
		this.price = price;
		this.duration = duration;
		this.name = name;
		
	}
	
	void show() {
		System.out.println("Course ID:"+id+"\nCourse Name:"+name+
				"\nCourse Duration:"+duration+"\nCourse Price:"+price);
	}
	}
public class Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseDetail cd1 = new CourseDetail();
		CourseDetail cd = new CourseDetail(101,"Java Full Stack Developer","4 Months",2000);
		cd.show();
		

	}

}
