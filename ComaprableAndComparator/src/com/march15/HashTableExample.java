package com.march15;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>ht = new Hashtable<Integer,String>();
		ht.put(22,"Roshani");
		ht.put(25,"Amisha");
		ht.put(27,"Ritika");
		ht.put(23,"Sudha");
		ht.put(30,"Huda");
		ht.put(33,"Brinda");
		System.out.println(ht);
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
