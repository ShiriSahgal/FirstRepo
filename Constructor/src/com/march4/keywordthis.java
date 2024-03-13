package com.march4;
class user{
	String uname,password;
	public user(String uname,String password) {
		this.uname=uname;
		this.password=password;
	}
	void show() {
		System.out.println("User Name:"+uname+" "+"\nUser Password:"+password);
	}
}
public class keywordthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u1 = new user ("Roshani Sahu","Rosh@1234");
		
		u1.show();
		
	}

}
