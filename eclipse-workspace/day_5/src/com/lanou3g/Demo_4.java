package com.lanou3g;


/*
 * 
 */
public class Demo_4 {

	public static void main(String[] args) {
		Card card = new Card();
//		card.cardNo = 001;
//		card.name = "213";
//		card.balance = 1000.0;
	}

}
/*
 * private: 修饰成员变量和方法
 * 被修饰的成员变量和方法只能在同类里面被访问到
 */
class Card{
	
	// 私有化属性
	private int cardNo;
	private String name;
	private double balance;
	// 对外提供访问功能的方法
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}