package com.lanou3g;

public class Text_1 {

	public static void main(String[] args) {
		// �����ֻ�����
		Phone phone = new Phone();
		phone.brand = "iphone 8";
		phone.price = 5800;
		phone.call();
	}

}
/*
ģ��ѧ���࣬ѧ���Լ�����ֻ���Ķ��塢���󴴽������Ը�ֵ�ͷ�������
* ����:Ʒ��(brand)�۸�(price)
* ��Ϊ:��绰(call),����Ϣ(sendMessage)����Ϸ(playGame)
*/
/**
 * �ֻ���
 */
 class Phone{
	 String brand;
	 int price;
	 
	 public Phone() {
		 System.out.println("�����й��캯���ĸ߱Ƹ���");
	 }
	 
	 
	 
	 public void call() {
		 System.out.println("��绰��...");
	 }
	 public void sendMessage() {
		 System.out.println("����Ϣ��...");
	 }
	 public void playGame() {
		 System.out.println("����Ϸ��...");
	 }
 }
