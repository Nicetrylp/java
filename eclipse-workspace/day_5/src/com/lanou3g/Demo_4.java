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
 * private: ���γ�Ա�����ͷ���
 * �����εĳ�Ա�����ͷ���ֻ����ͬ�����汻���ʵ�
 */
class Card{
	
	// ˽�л�����
	private int cardNo;
	private String name;
	private double balance;
	// �����ṩ���ʹ��ܵķ���
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