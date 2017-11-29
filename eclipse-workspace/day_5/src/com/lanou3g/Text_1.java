package com.lanou3g;

public class Text_1 {

	public static void main(String[] args) {
		// 创建手机对象
		Phone phone = new Phone();
		phone.brand = "iphone 8";
		phone.price = 5800;
		phone.call();
	}

}
/*
模仿学生类，学生自己完成手机类的定义、对象创建、属性赋值和方法调用
* 属性:品牌(brand)价格(price)
* 行为:打电话(call),发信息(sendMessage)玩游戏(playGame)
*/
/**
 * 手机类
 */
 class Phone{
	 String brand;
	 int price;
	 
	 public Phone() {
		 System.out.println("我是有构造函数的高逼格类");
	 }
	 
	 
	 
	 public void call() {
		 System.out.println("打电话中...");
	 }
	 public void sendMessage() {
		 System.out.println("发信息中...");
	 }
	 public void playGame() {
		 System.out.println("玩游戏中...");
	 }
 }
