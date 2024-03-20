package com.march19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way
		ArrayList<Integer>l1= new ArrayList<Integer>();
		l1.add(10);
		//2nd way
		List<Integer>l2=Arrays.asList(10,20,30,40,50);
		System.out.println(l2);
		List<Integer>l3 = l2.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(l3);
		//using filter
		List<Integer>l5=Arrays.asList(5,7,9,4,2,6,10);
		System.out.println(l5);
		List<Integer>l6 = l5.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l6);

	}

}
