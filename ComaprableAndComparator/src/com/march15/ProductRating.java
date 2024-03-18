package com.march15;

import java.util.Comparator;

public class ProductRating implements Comparator<Product> {


	
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrating()<o2.getPrating()) {
			return -1;
		}
		else if(o1.getPrating()>o2.getPrating()) {
			return 1;
		}
		else {
		// TODO Auto-generated method stub
		return 0;
		}
	}

}
