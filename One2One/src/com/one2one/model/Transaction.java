package com.one2one.model;

public class Transaction {
	private int tid;
	private String Tdate;
	private int amount;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int tid, String tdate, int amount) {
		super();
		this.tid = tid;
		Tdate = tdate;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", Tdate=" + Tdate + ", amount=" + amount + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTdate() {
		return Tdate;
	}
	public void setTdate(String tdate) {
		Tdate = tdate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
