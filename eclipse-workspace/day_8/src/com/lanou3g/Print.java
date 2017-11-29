package com.lanou3g;


public class Print {
	
	public String band;		// 品牌
	public double price;	// 价格
	
	public void print(){
		System.out.println("打印中");
	}
	
	public Print() {
		super();
		band = "父类";
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

/*
 * 
 */
class WhitePrint extends Print{
	private String band = "子类";
	public void test() {
		System.out.println(band);
	}
	public void test2() {
		// super: 父类属性
		System.out.println(super.band);
	}
	
	
	// 
	
}
class ColorPrint extends Print{
	
}