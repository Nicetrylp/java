package com.lanou3g;

/*
 * 继承的关键字		extends
 * 子类继承父类		子类 extends父类
 * 子类可以继承父类非私有的属性和方法
 * 
 * 继承的单一性:一个儿子只能有一个亲爹
 * 多重继承:	儿子可以有爹,爹也有爹
 * 干爹: 接口	
 */

public class Cat extends Animal {
	
	public void showLegNum() {
		System.out.println(legNumnber);
	}
}

class Dog extends Animal{
	
}

	// 父类
class Animal{
	public  int legNumnber;	// 腿的数量
	private String color;	// 毛的颜色
	public int getLegNumnber() {
		return legNumnber;
	}
	public void setLegNumnber(int legNumnber) {
		this.legNumnber = legNumnber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Animal() {
		super();
	}
	
}