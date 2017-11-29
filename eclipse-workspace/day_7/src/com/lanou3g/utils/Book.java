package com.lanou3g.utils;

public class Book {

	//图书编号
	private String bookSn;
	//书名
	private String bookName;
	//价格
	private double price;
	//出版商
	private String pulishCompany;
	
	//快捷键shift+alt+s   r 自动生成gettersetter方法
	
	public String getBookName() {
		return bookName;
	}
	public String getBookSn() {
		return bookSn;
	}
	public void setBookSn(String bookSn) {
		this.bookSn = bookSn;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPulishCompany() {
		return pulishCompany;
	}
	public void setPulishCompany(String pulishCompany) {
		this.pulishCompany = pulishCompany;
	}
}
