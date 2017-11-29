package com.pinhong;

import java.util.Arrays;

/**
 * 产品库
 * 属性
 * 		static products[10]	模拟数据库
 * 方法
 * 		增删改查
 *
 */
public class ProductOperation {
	public static Product[]products = new Product[10];

	public ProductOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*增*/
	public static void addProduct() {
		Product product = new Product();
		Product.add(product);
		for(int i = 0;i < products.length;++i) {
			if(products[i] == null) {
				products[i] = product;
				System.out.println("添加成功");
				return;
			}
		}
		products = Arrays.copyOf(products, products.length+5);
		products[products.length-5] = product;
		System.out.println("添加成功");
	}
	/*删,按编号*/
	public static void deleteProduct(int number) {
		int counter = 0;
		for(int i=0;i<products.length;++i) 
			if(products[i]!=null && products[i].getItemNo() == number)
				{products[i] = null;
				++counter;
				System.out.println("删除成功");
				}
		if(counter == 0)
			System.out.println("未找到该产品");
	}
	/*改,按编号*/
	public static void amendProduct(int number) {
		int counter = 0;
		for(int i=0;i<products.length;++i) {
			if(products[i]!=null && products[i].getItemNo() == number) {
				Product product = new Product();
				Product.add(product);
				products[i] = product;
				++counter;
				System.out.println("修改成功");
			}
		}
		if(counter == 0)
			System.out.println("未找到该产品");
	}
	/*查*/
	public static void inquireProduct() {
		for (Product product : products) {
			if(product != null)
			product.look();                    
		}
		System.out.println("查询完毕");
	}
}
