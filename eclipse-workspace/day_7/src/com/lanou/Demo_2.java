package com.lanou;
/**
 * 
 * 比较完整的类结构
 * 执行顺序
 * 1.先加载类,同时加载static修饰的资源
 * 		先执行static代码块,然后初始化静态属性方法
 * 2.执行构造方法之前执行自由代码块,然后执行构造方法
 *
 */
public class Demo_2 {
	// 成员变量	---	对象属性
	private int a;
	// 静态变量	---	类属性
	public static double PI = 2.1415926;
	// 构造方法
	public Demo_2(int a) {
		super();
		this.a = a;
	}
	public Demo_2() {
		super();
		System.out.println("构造方法执行");
	}
	
	// 成员方法
	public void test() {
		
	}
	
	// 静态方法
	public static void test2() {
		
	}
	
	// 加载类的时候,会调用代码块
	// 代码块
	{
		System.out.println("非静态代码块");
	}
	// 静态代码块
	static {
		System.out.println("静态代码块");
	}
}
