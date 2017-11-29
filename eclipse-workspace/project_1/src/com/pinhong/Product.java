package com.pinhong;

import java.util.Scanner;

/**
 * 
 * 产品类
 * 属性:
		产品名;name	价格:price	编号:itemNo	库存:inventory
	方法:
		增删改查
 *
 */
public class Product {
	private String name;
	private double price;
	private int itemNo;
	private int inventory;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	public static void add(Product product) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入产品名:");
		product.setName(scanner.nextLine());
		System.out.println("请输入产品价格:");
		product.setPrice(scanner.nextDouble());
		System.out.println("请输入产品编号:");
		product.setItemNo(scanner.nextInt());
		System.out.println("请输入产品库存");
		product.setInventory(scanner.nextInt());
	}
	
	public  void look() {
		System.out.println("商品名\t价格\t编号\t库存");
		System.out.println(getName()+"\t"+getPrice()+"\t"+getItemNo()+"\t"+getInventory());
	}

}
