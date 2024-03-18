package com.march15;

import java.util.ArrayList;

import java.util.Collections;

public class MovieMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie>list=new ArrayList<Movie>();
		list.add(new Movie(8.3,"3Idiots",2007));
		list.add(new Movie(8.5,"Jawan",2023));
		list.add(new Movie(7.5,"Mission raniganj",2023));
		list.add(new Movie(7.4,"DDLJ",2002));
		list.add(new Movie(6.3,"3Idiots",2007));
		Collections.sort(list);
		System.out.println("Data After Sorting:");
		for(Movie movie:list){
			System.out.println(movie.getRating()+ " "+movie.getName()+" "+movie.getYear());
		}
	}

}
