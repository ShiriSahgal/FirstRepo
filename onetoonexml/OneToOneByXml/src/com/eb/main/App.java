package com.eb.main;

import java.util.Date;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.eb.model.Stock;
import com.eb.model.StockDetail;





public class App {
	public static void main(String[] args) {
	System.out.println("Hibernate one to one (XML mapping)");
//	/The main runtime interface between a Java application and Hibernate
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.beginTransaction();
	Stock stock = new Stock();

	stock.setStockCode("4715");
	stock.setStockName("GENM");

	StockDetail stockDetail = new StockDetail();
	stockDetail.setCompName("GENTING Malaysia");
	stockDetail.setCompDesc("Best resort in the world");
	stockDetail.setRemark("Nothing Special");
	stockDetail.setListedDate(new Date());

	stock.setStockDetail(stockDetail);
	stockDetail.setStock(stock);

	session.save(stock);
		session.getTransaction().commit();

		session.close();
		
	}
}
