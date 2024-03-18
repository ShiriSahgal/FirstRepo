package com.march15;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<String,Integer>();
		map.put("ColorCode",000);
		map.put("A", 105);
		map.put("B", 121);
		System.out.println(map);
		
		System.out.println(map.get("A"));
		map.putIfAbsent("C", 932);
		System.out.println(map);
		map.remove("ColorCode");
		System.out.println(map);
		map.replace("B",890);
		System.out.println(map);
		

	}

}
