package com.march21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(10);
		List<Integer>l2=Arrays.asList(3,7,4,9,6,7,2,1,2,8,8);
		System.out.println(l2);
		List<Integer>l3=l2.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(l3);
		List<Integer>l4=l2.stream().map(x->x*x).limit(3).collect(Collectors.toList());
		System.out.println(l4);
		List<Integer>l5=l2.stream().map(x->x*x).distinct().collect(Collectors.toList());
		System.out.println(l5);
		List<Integer>l6=l2.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(l6);
		
		
	}

}
