package com.march4;
class Product {
	String pname,odate,rdate;
	int price,quantity;
	Product(){
		System.out.println("Welcome To Product Management Service!!!");
	}
	Product(String pn ,int prc){
		pname = pn;
		price = prc;
		System.out.println("Product Name:"+pn+"\nProduct Price:"+prc);
	}
	Product(int qty, String od,String rd){
		quantity=qty;
		odate=od;
		rdate=rd;
		System.out.println("Quantity:"+qty+"\nOrder Date:"+od+"\nReceive Date:"+rd);
	}
}
public class ProductManagementService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product("Ponds Powder",45);
		Product p3 = new Product(4,"01/03/2024","04/03/2024");

	}

}
